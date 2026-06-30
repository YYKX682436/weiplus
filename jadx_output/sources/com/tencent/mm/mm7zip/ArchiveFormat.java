package com.tencent.mm.mm7zip;

/* loaded from: classes13.dex */
public enum ArchiveFormat {
    ZIP("Zip", com.tencent.mm.mm7zip.impl.OutArchiveZipImpl.class, true),
    SEVEN_ZIP("7z", com.tencent.mm.mm7zip.impl.OutArchive7zImpl.class, true);

    private int codecIndex;
    private java.lang.String methodName;
    java.lang.Class<? extends com.tencent.mm.mm7zip.impl.OutArchiveImpl<?>> outArchiveImplementation;
    private boolean supportMultipleFiles;

    ArchiveFormat(java.lang.String str, boolean z17) {
        this(str, null, z17);
    }

    public static com.tencent.mm.mm7zip.ArchiveFormat findOutArchiveImplementationToInterface(java.lang.Class<? extends com.tencent.mm.mm7zip.IOutCreateArchive<?>> cls) {
        for (com.tencent.mm.mm7zip.ArchiveFormat archiveFormat : values()) {
            java.lang.Class<? extends com.tencent.mm.mm7zip.impl.OutArchiveImpl<?>> outArchiveImplementation = archiveFormat.getOutArchiveImplementation();
            if (outArchiveImplementation != null && cls.isAssignableFrom(outArchiveImplementation)) {
                return archiveFormat;
            }
        }
        throw new com.tencent.mm.mm7zip.SevenZipException("Can't determine corresponding archive format to the interface IOutArchive.");
    }

    public java.lang.String getMethodName() {
        return this.methodName;
    }

    public java.lang.Class<? extends com.tencent.mm.mm7zip.impl.OutArchiveImpl<?>> getOutArchiveImplementation() {
        return this.outArchiveImplementation;
    }

    public boolean isOutArchiveSupported() {
        return this.outArchiveImplementation != null;
    }

    public boolean supportMultipleFiles() {
        return this.supportMultipleFiles;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.methodName;
    }

    ArchiveFormat(java.lang.String str, java.lang.Class cls, boolean z17) {
        this.codecIndex = -2;
        this.methodName = str;
        this.outArchiveImplementation = cls;
        this.supportMultipleFiles = z17;
    }
}
