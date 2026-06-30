package androidx.camera.core.imagecapture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class JpegBytes2Disk implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.JpegBytes2Disk.In, androidx.camera.core.ImageCapture.OutputFileResults> {
    private static final int COPY_BUFFER_SIZE = 1024;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final java.lang.String TEMP_FILE_PREFIX = "CameraX";
    private static final java.lang.String TEMP_FILE_SUFFIX = ".tmp";

    /* loaded from: classes13.dex */
    public static abstract class In {
        public static androidx.camera.core.imagecapture.JpegBytes2Disk.In of(androidx.camera.core.processing.Packet<byte[]> packet, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
            return new androidx.camera.core.imagecapture.AutoValue_JpegBytes2Disk_In(packet, outputFileOptions);
        }

        public abstract androidx.camera.core.ImageCapture.OutputFileOptions getOutputFileOptions();

        public abstract androidx.camera.core.processing.Packet<byte[]> getPacket();
    }

    private static android.net.Uri copyFileToFile(java.io.File file, java.io.File file2) {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return android.net.Uri.fromFile(file2);
        }
        throw new androidx.camera.core.ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    private static android.net.Uri copyFileToMediaStore(java.io.File file, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
        android.net.Uri insert;
        android.content.ContentResolver contentResolver = outputFileOptions.getContentResolver();
        java.util.Objects.requireNonNull(contentResolver);
        android.content.ContentValues contentValues = outputFileOptions.getContentValues() != null ? new android.content.ContentValues(outputFileOptions.getContentValues()) : new android.content.ContentValues();
        setContentValuePendingFlag(contentValues, 1);
        android.net.Uri uri = null;
        try {
            try {
                insert = contentResolver.insert(outputFileOptions.getSaveCollection(), contentValues);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.io.IOException e17) {
            e = e17;
        } catch (java.lang.SecurityException e18) {
            e = e18;
        }
        try {
            if (insert == null) {
                throw new androidx.camera.core.ImageCaptureException(1, "Failed to insert a MediaStore URI.", null);
            }
            copyTempFileToUri(file, insert, contentResolver);
            updateUriPendingStatus(insert, contentResolver, 0);
            return insert;
        } catch (java.io.IOException e19) {
            e = e19;
            uri = insert;
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (java.lang.SecurityException e27) {
            e = e27;
            uri = insert;
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (java.lang.Throwable th7) {
            th = th7;
            uri = insert;
            if (uri != null) {
                updateUriPendingStatus(uri, contentResolver, 0);
            }
            throw th;
        }
    }

    private static void copyFileToOutputStream(java.io.File file, java.io.OutputStream outputStream) {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (java.lang.Throwable th6) {
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    private static void copyTempFileToUri(java.io.File file, android.net.Uri uri, android.content.ContentResolver contentResolver) {
        java.io.OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (openOutputStream != null) {
                copyFileToOutputStream(file, openOutputStream);
                openOutputStream.close();
            } else {
                throw new java.io.FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (java.lang.Throwable th6) {
            if (openOutputStream != null) {
                try {
                    openOutputStream.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    private static java.io.File createTempFile(androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
        try {
            java.io.File file = outputFileOptions.getFile();
            if (file == null) {
                return java.io.File.createTempFile(TEMP_FILE_PREFIX, TEMP_FILE_SUFFIX);
            }
            return new java.io.File(file.getParent(), TEMP_FILE_PREFIX + java.util.UUID.randomUUID().toString() + getFileExtensionWithDot(file));
        } catch (java.io.IOException e17) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to create temp file.", e17);
        }
    }

    private static java.lang.String getFileExtensionWithDot(java.io.File file) {
        java.lang.String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf >= 0 ? name.substring(lastIndexOf) : "";
    }

    private static boolean isSaveToFile(androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
        return outputFileOptions.getFile() != null;
    }

    private static boolean isSaveToMediaStore(androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
        return (outputFileOptions.getSaveCollection() == null || outputFileOptions.getContentResolver() == null || outputFileOptions.getContentValues() == null) ? false : true;
    }

    private static boolean isSaveToOutputStream(androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
        return outputFileOptions.getOutputStream() != null;
    }

    public static android.net.Uri moveFileToTarget(java.io.File file, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
        android.net.Uri uri = null;
        try {
            try {
                if (isSaveToMediaStore(outputFileOptions)) {
                    uri = copyFileToMediaStore(file, outputFileOptions);
                } else if (isSaveToOutputStream(outputFileOptions)) {
                    java.io.OutputStream outputStream = outputFileOptions.getOutputStream();
                    java.util.Objects.requireNonNull(outputStream);
                    copyFileToOutputStream(file, outputStream);
                } else if (isSaveToFile(outputFileOptions)) {
                    java.io.File file2 = outputFileOptions.getFile();
                    java.util.Objects.requireNonNull(file2);
                    uri = copyFileToFile(file, file2);
                }
                return uri;
            } catch (java.io.IOException unused) {
                throw new androidx.camera.core.ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } finally {
            file.delete();
        }
    }

    private static void setContentValuePendingFlag(android.content.ContentValues contentValues, int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", java.lang.Integer.valueOf(i17));
        }
    }

    private static void updateFileExif(java.io.File file, androidx.camera.core.impl.utils.Exif exif, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, int i17) {
        try {
            androidx.camera.core.impl.utils.Exif createFromFile = androidx.camera.core.impl.utils.Exif.createFromFile(file);
            exif.copyToCroppedImage(createFromFile);
            if (createFromFile.getRotation() == 0 && i17 != 0) {
                createFromFile.rotate(i17);
            }
            androidx.camera.core.ImageCapture.Metadata metadata = outputFileOptions.getMetadata();
            if (metadata.isReversedHorizontal()) {
                createFromFile.flipHorizontally();
            }
            if (metadata.isReversedVertical()) {
                createFromFile.flipVertically();
            }
            if (metadata.getLocation() != null) {
                createFromFile.attachLocation(metadata.getLocation());
            }
            createFromFile.save();
        } catch (java.io.IOException e17) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to update Exif data", e17);
        }
    }

    private static void updateUriPendingStatus(android.net.Uri uri, android.content.ContentResolver contentResolver, int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            setContentValuePendingFlag(contentValues, i17);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    private static void writeBytesToFile(java.io.File file, byte[] bArr) {
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new androidx.camera.core.internal.compat.workaround.InvalidJpegDataParser().getValidDataLength(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (java.io.IOException e17) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to write to temp file", e17);
        }
    }

    @Override // androidx.camera.core.processing.Operation
    public androidx.camera.core.ImageCapture.OutputFileResults apply(androidx.camera.core.imagecapture.JpegBytes2Disk.In in6) {
        androidx.camera.core.processing.Packet<byte[]> packet = in6.getPacket();
        androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions = in6.getOutputFileOptions();
        java.io.File createTempFile = createTempFile(outputFileOptions);
        writeBytesToFile(createTempFile, packet.getData());
        androidx.camera.core.impl.utils.Exif exif = packet.getExif();
        java.util.Objects.requireNonNull(exif);
        updateFileExif(createTempFile, exif, outputFileOptions, packet.getRotationDegrees());
        return new androidx.camera.core.ImageCapture.OutputFileResults(moveFileToTarget(createTempFile, outputFileOptions));
    }
}
