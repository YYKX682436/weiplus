package com.tencent.mm.mm7zip;

/* loaded from: classes16.dex */
public class SevenZipUtil {

    /* loaded from: classes16.dex */
    public static class ExtractCallback implements com.tencent.mm.mm7zip.IArchiveExtractCallback {
        private final java.lang.String extractPath;
        private final com.tencent.mm.mm7zip.IInArchive inArchive;
        private boolean hasFail = false;
        private java.util.List<java.lang.String> paths = new java.util.ArrayList();

        public ExtractCallback(com.tencent.mm.mm7zip.IInArchive iInArchive, java.lang.String str) {
            this.inArchive = iInArchive;
            if (!str.endsWith("/") && !str.endsWith("\\")) {
                str = str + java.io.File.separator;
            }
            this.extractPath = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ int lambda$getStream$0(int i17, byte[] bArr) {
            java.io.FileOutputStream fileOutputStream;
            java.io.FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    java.io.File file = new java.io.File(this.extractPath + this.inArchive.getStringProperty(i17, com.tencent.mm.mm7zip.PropID.PATH));
                    if (!this.paths.contains(file.getAbsolutePath())) {
                        com.tencent.mm.mm7zip.util.FileOps.deleteFile(file.getAbsolutePath());
                    }
                    this.paths.add(file.getAbsolutePath());
                    com.tencent.mm.mm7zip.util.FileOps.makeSureExist(file.getAbsolutePath(), false);
                    fileOutputStream = new java.io.FileOutputStream(file, true);
                } catch (java.io.IOException unused) {
                }
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (java.io.IOException unused2) {
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    }
                    return bArr.length;
                } catch (java.lang.Throwable th6) {
                    fileOutputStream2 = fileOutputStream;
                    th = th6;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException unused4) {
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
            return bArr.length;
        }

        @Override // com.tencent.mm.mm7zip.IArchiveExtractCallback
        public com.tencent.mm.mm7zip.ISequentialOutStream getStream(final int i17, com.tencent.mm.mm7zip.ExtractAskMode extractAskMode) {
            return new com.tencent.mm.mm7zip.ISequentialOutStream() { // from class: com.tencent.mm.mm7zip.SevenZipUtil$ExtractCallback$$a
                @Override // com.tencent.mm.mm7zip.ISequentialOutStream
                public final int write(byte[] bArr) {
                    int lambda$getStream$0;
                    lambda$getStream$0 = com.tencent.mm.mm7zip.SevenZipUtil.ExtractCallback.this.lambda$getStream$0(i17, bArr);
                    return lambda$getStream$0;
                }
            };
        }

        public boolean hasFail() {
            return this.hasFail;
        }

        @Override // com.tencent.mm.mm7zip.IArchiveExtractCallback
        public void prepareOperation(com.tencent.mm.mm7zip.ExtractAskMode extractAskMode) {
        }

        @Override // com.tencent.mm.mm7zip.IProgress
        public void setCompleted(long j17) {
        }

        @Override // com.tencent.mm.mm7zip.IArchiveExtractCallback
        public void setOperationResult(com.tencent.mm.mm7zip.ExtractOperationResult extractOperationResult) {
            if (extractOperationResult != com.tencent.mm.mm7zip.ExtractOperationResult.OK) {
                this.hasFail = true;
            }
        }

        @Override // com.tencent.mm.mm7zip.IProgress
        public void setTotal(long j17) {
        }
    }

    public static int extract(java.lang.String str, java.lang.String str2) {
        java.io.RandomAccessFile randomAccessFile;
        if (!com.tencent.mm.mm7zip.util.FileOps.exists(str)) {
            return -1;
        }
        com.tencent.mm.mm7zip.IInArchive iInArchive = null;
        try {
            randomAccessFile = new java.io.RandomAccessFile(new java.io.File(str), "r");
            try {
                com.tencent.mm.mm7zip.IInArchive openInArchive = com.tencent.mm.mm7zip.SevenZip.openInArchive(null, new com.tencent.mm.mm7zip.impl.RandomAccessFileInStream(randomAccessFile));
                try {
                    for (com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem iSimpleInArchiveItem : openInArchive.getSimpleInterface().getArchiveItems()) {
                        com.tencent.mm.mm7zip.util.FileOps.makeSureExist(new java.io.File(str2, iSimpleInArchiveItem.getPath()).getAbsolutePath(), iSimpleInArchiveItem.isFolder());
                    }
                    com.tencent.mm.mm7zip.SevenZipUtil.ExtractCallback extractCallback = new com.tencent.mm.mm7zip.SevenZipUtil.ExtractCallback(openInArchive, str2);
                    openInArchive.extract(null, false, extractCallback);
                    int i17 = extractCallback.hasFail() ? -1 : 0;
                    openInArchive.close();
                    randomAccessFile.close();
                    return i17;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    iInArchive = openInArchive;
                    if (iInArchive != null) {
                        iInArchive.close();
                    }
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            randomAccessFile = null;
        }
    }
}
