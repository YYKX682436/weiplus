package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.imagecapture.JpegBytes2Disk */
/* loaded from: classes13.dex */
public class C0612x5bcd0a0c implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c.In, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults> {

    /* renamed from: COPY_BUFFER_SIZE */
    private static final int f1355x64a9aed6 = 1024;

    /* renamed from: NOT_PENDING */
    private static final int f1356xf57887eb = 0;

    /* renamed from: PENDING */
    private static final int f1357x21c1577 = 1;

    /* renamed from: TEMP_FILE_PREFIX */
    private static final java.lang.String f1358x21a84eca = "CameraX";

    /* renamed from: TEMP_FILE_SUFFIX */
    private static final java.lang.String f1359x26f19389 = ".tmp";

    /* renamed from: androidx.camera.core.imagecapture.JpegBytes2Disk$In */
    /* loaded from: classes13.dex */
    public static abstract class In {
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c.In of(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> abstractC0903x8e0938a8, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0588xb34ce63b(abstractC0903x8e0938a8, outputFileOptions);
        }

        /* renamed from: getOutputFileOptions */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions mo4891xf578610b();

        /* renamed from: getPacket */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> mo4892x29bb6f7e();
    }

    /* renamed from: copyFileToFile */
    private static android.net.Uri m4981x64f51488(java.io.File file, java.io.File file2) {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return android.net.Uri.fromFile(file2);
        }
        throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    /* renamed from: copyFileToMediaStore */
    private static android.net.Uri m4982xcbf38d69(java.io.File file, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions) {
        android.net.Uri insert;
        android.content.ContentResolver m4584x607f9d69 = outputFileOptions.m4584x607f9d69();
        java.util.Objects.requireNonNull(m4584x607f9d69);
        android.content.ContentValues contentValues = outputFileOptions.m4585xadfc7b45() != null ? new android.content.ContentValues(outputFileOptions.m4585xadfc7b45()) : new android.content.ContentValues();
        m4991x3fb58349(contentValues, 1);
        android.net.Uri uri = null;
        try {
            try {
                insert = m4584x607f9d69.insert(outputFileOptions.m4589x1e0320f1(), contentValues);
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
                throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(1, "Failed to insert a MediaStore URI.", null);
            }
            m4984xcbb881ec(file, insert, m4584x607f9d69);
            m4993x21afdd46(insert, m4584x607f9d69, 0);
            return insert;
        } catch (java.io.IOException e19) {
            e = e19;
            uri = insert;
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (java.lang.SecurityException e27) {
            e = e27;
            uri = insert;
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (java.lang.Throwable th7) {
            th = th7;
            uri = insert;
            if (uri != null) {
                m4993x21afdd46(uri, m4584x607f9d69, 0);
            }
            throw th;
        }
    }

    /* renamed from: copyFileToOutputStream */
    private static void m4983x4a622ed(java.io.File file, java.io.OutputStream outputStream) {
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

    /* renamed from: copyTempFileToUri */
    private static void m4984xcbb881ec(java.io.File file, android.net.Uri uri, android.content.ContentResolver contentResolver) {
        java.io.OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (openOutputStream != null) {
                m4983x4a622ed(file, openOutputStream);
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

    /* renamed from: createTempFile */
    private static java.io.File m4985xe826ec8c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions) {
        try {
            java.io.File m4586xfb7f5df2 = outputFileOptions.m4586xfb7f5df2();
            if (m4586xfb7f5df2 == null) {
                return java.io.File.createTempFile(f1358x21a84eca, f1359x26f19389);
            }
            return new java.io.File(m4586xfb7f5df2.getParent(), f1358x21a84eca + java.util.UUID.randomUUID().toString() + m4986x74b0e376(m4586xfb7f5df2));
        } catch (java.io.IOException e17) {
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(1, "Failed to create temp file.", e17);
        }
    }

    /* renamed from: getFileExtensionWithDot */
    private static java.lang.String m4986x74b0e376(java.io.File file) {
        java.lang.String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf >= 0 ? name.substring(lastIndexOf) : "";
    }

    /* renamed from: isSaveToFile */
    private static boolean m4987xc28b9b3e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions) {
        return outputFileOptions.m4586xfb7f5df2() != null;
    }

    /* renamed from: isSaveToMediaStore */
    private static boolean m4988x3fbbb39f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions) {
        return (outputFileOptions.m4589x1e0320f1() == null || outputFileOptions.m4584x607f9d69() == null || outputFileOptions.m4585xadfc7b45() == null) ? false : true;
    }

    /* renamed from: isSaveToOutputStream */
    private static boolean m4989xa6fd93a3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions) {
        return outputFileOptions.m4588x592d6257() != null;
    }

    /* renamed from: moveFileToTarget */
    public static android.net.Uri m4990x8c20dff9(java.io.File file, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions) {
        android.net.Uri uri = null;
        try {
            try {
                if (m4988x3fbbb39f(outputFileOptions)) {
                    uri = m4982xcbf38d69(file, outputFileOptions);
                } else if (m4989xa6fd93a3(outputFileOptions)) {
                    java.io.OutputStream m4588x592d6257 = outputFileOptions.m4588x592d6257();
                    java.util.Objects.requireNonNull(m4588x592d6257);
                    m4983x4a622ed(file, m4588x592d6257);
                } else if (m4987xc28b9b3e(outputFileOptions)) {
                    java.io.File m4586xfb7f5df2 = outputFileOptions.m4586xfb7f5df2();
                    java.util.Objects.requireNonNull(m4586xfb7f5df2);
                    uri = m4981x64f51488(file, m4586xfb7f5df2);
                }
                return uri;
            } catch (java.io.IOException unused) {
                throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(1, "Failed to write to OutputStream.", null);
            }
        } finally {
            file.delete();
        }
    }

    /* renamed from: setContentValuePendingFlag */
    private static void m4991x3fb58349(android.content.ContentValues contentValues, int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: updateFileExif */
    private static void m4992x7ffc895(java.io.File file, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 c0785x212d30, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions, int i17) {
        try {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 m5828xecc6e562 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.m5828xecc6e562(file);
            c0785x212d30.m5837xc981d10c(m5828xecc6e562);
            if (m5828xecc6e562.m5847x79734cf4() == 0 && i17 != 0) {
                m5828xecc6e562.m5854xc8dadd5b(i17);
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Metadata m4587x6107b8a5 = outputFileOptions.m4587x6107b8a5();
            if (m4587x6107b8a5.m4577x510a3a50()) {
                m5828xecc6e562.m5838x4b4839be();
            }
            if (m4587x6107b8a5.m4579xef7eb0a2()) {
                m5828xecc6e562.m5839x6ca267d0();
            }
            if (m4587x6107b8a5.m4576xed29dd2b() != null) {
                m5828xecc6e562.m5835xb8ecdd1a(m4587x6107b8a5.m4576xed29dd2b());
            }
            m5828xecc6e562.m5855x35c17d();
        } catch (java.io.IOException e17) {
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(1, "Failed to update Exif data", e17);
        }
    }

    /* renamed from: updateUriPendingStatus */
    private static void m4993x21afdd46(android.net.Uri uri, android.content.ContentResolver contentResolver, int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            m4991x3fb58349(contentValues, i17);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    /* renamed from: writeBytesToFile */
    private static void m4994xfc773183(java.io.File file, byte[] bArr) {
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e.C0864x5e795ca8().m6199x8b2fa216(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (java.io.IOException e17) {
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(1, "Failed to write to temp file", e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547
    /* renamed from: apply, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults mo4926x58b836e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0612x5bcd0a0c.In in6) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> mo4892x29bb6f7e = in6.mo4892x29bb6f7e();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions mo4891xf578610b = in6.mo4891xf578610b();
        java.io.File m4985xe826ec8c = m4985xe826ec8c(mo4891xf578610b);
        m4994xfc773183(m4985xe826ec8c, mo4892x29bb6f7e.mo6256xfb7e5820());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 mo6257xfb7f2186 = mo4892x29bb6f7e.mo6257xfb7f2186();
        java.util.Objects.requireNonNull(mo6257xfb7f2186);
        m4992x7ffc895(m4985xe826ec8c, mo6257xfb7f2186, mo4891xf578610b, mo4892x29bb6f7e.mo6259x2a7ffb93());
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults(m4990x8c20dff9(m4985xe826ec8c, mo4891xf578610b));
    }
}
