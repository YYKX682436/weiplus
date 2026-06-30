package com.tencent.mm.mm7zip.impl;

/* loaded from: classes16.dex */
public class OutArchiveImpl<T extends com.tencent.mm.mm7zip.IOutItemBase> implements com.tencent.mm.mm7zip.IOutArchive<T> {
    private com.tencent.mm.mm7zip.ArchiveFormat archiveFormat;
    private boolean closed;
    private java.lang.Boolean headerEncryption;
    private com.tencent.mm.mm7zip.IInArchive inArchive;
    private long jbindingSession;
    private long sevenZipArchiveInstance;
    private boolean trace;
    private java.io.PrintStream tracePrintStream;
    private int compressionLevel = -1;
    private int threadCount = -1;

    private void doUpdateItems(com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream, int i17, com.tencent.mm.mm7zip.IOutCreateCallback<?> iOutCreateCallback) {
        applyFeatures();
        nativeUpdateItems(iSequentialOutStream, i17, iOutCreateCallback);
    }

    private void ensureOpened() {
        if (this.closed) {
            throw new com.tencent.mm.mm7zip.SevenZipException("OutArchive closed");
        }
        com.tencent.mm.mm7zip.IInArchive iInArchive = this.inArchive;
        if (iInArchive != null) {
            ((com.tencent.mm.mm7zip.impl.InArchiveImpl) iInArchive).ensureOpened();
        }
    }

    private native void nativeClose();

    private native void nativeUpdateItems(com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream, int i17, java.lang.Object obj);

    private final void traceMessage(java.lang.String str) {
        if (this.trace) {
            java.io.PrintStream printStream = this.tracePrintStream;
            if (printStream == null) {
                java.lang.System.out.println(str);
            } else {
                printStream.println(str);
            }
        }
    }

    public void applyFeatures() {
        ensureOpened();
        int i17 = this.compressionLevel;
        if (i17 != -1) {
            nativeSetLevel(i17);
        }
        java.lang.Boolean bool = this.headerEncryption;
        if (bool != null) {
            nativeSetHeaderEncryption(bool.booleanValue());
        }
        int i18 = this.threadCount;
        if (i18 >= 0) {
            nativeSetMultithreading(i18);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        if (this.inArchive != null) {
            return;
        }
        nativeClose();
    }

    @Override // com.tencent.mm.mm7zip.IOutCreateArchive
    public void createArchive(com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream, int i17, com.tencent.mm.mm7zip.IOutCreateCallback<? extends T> iOutCreateCallback) {
        ensureOpened();
        doUpdateItems(iSequentialOutStream, i17, iOutCreateCallback);
    }

    public void featureSetHeaderEncryption(boolean z17) {
        this.headerEncryption = java.lang.Boolean.valueOf(z17);
    }

    public void featureSetLevel(int i17) {
        this.compressionLevel = i17;
    }

    public void featureSetThreadCount(int i17) {
        this.threadCount = i17;
    }

    @Override // com.tencent.mm.mm7zip.IOutCreateArchive, com.tencent.mm.mm7zip.IOutUpdateArchive
    public com.tencent.mm.mm7zip.ArchiveFormat getArchiveFormat() {
        return this.archiveFormat;
    }

    @Override // com.tencent.mm.mm7zip.IOutUpdateArchive
    public com.tencent.mm.mm7zip.IInArchive getConnectedInArchive() {
        return this.inArchive;
    }

    @Override // com.tencent.mm.mm7zip.IOutArchiveBase
    public java.io.PrintStream getTracePrintStream() {
        return this.tracePrintStream;
    }

    @Override // com.tencent.mm.mm7zip.IOutArchiveBase
    public boolean isTrace() {
        return this.trace;
    }

    public native void nativeSetHeaderEncryption(boolean z17);

    public native void nativeSetLevel(int i17);

    public native void nativeSetMultithreading(int i17);

    public native void nativeSetSolidSpec(java.lang.String str);

    public void setArchiveFormat(com.tencent.mm.mm7zip.ArchiveFormat archiveFormat) {
        this.archiveFormat = archiveFormat;
    }

    public void setInArchive(com.tencent.mm.mm7zip.IInArchive iInArchive) {
        this.inArchive = iInArchive;
    }

    @Override // com.tencent.mm.mm7zip.IOutArchiveBase
    public void setTrace(boolean z17) {
        this.trace = z17;
    }

    @Override // com.tencent.mm.mm7zip.IOutArchiveBase
    public void setTracePrintStream(java.io.PrintStream printStream) {
        this.tracePrintStream = printStream;
    }

    @Override // com.tencent.mm.mm7zip.IOutUpdateArchive
    public void updateItems(com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream, int i17, com.tencent.mm.mm7zip.IOutCreateCallback<T> iOutCreateCallback) {
        ensureOpened();
        doUpdateItems(iSequentialOutStream, i17, iOutCreateCallback);
    }
}
