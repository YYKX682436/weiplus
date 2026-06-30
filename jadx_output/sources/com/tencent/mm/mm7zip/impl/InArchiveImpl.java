package com.tencent.mm.mm7zip.impl;

/* loaded from: classes16.dex */
public final class InArchiveImpl implements com.tencent.mm.mm7zip.IInArchive {
    private com.tencent.mm.mm7zip.ArchiveFormat archiveFormat;
    private boolean closed;
    private long jbindingSession;
    private int numberOfItems = -1;
    private com.tencent.mm.mm7zip.impl.OutArchiveImpl<?> outArchiveImpl;
    private long sevenZipArchiveInstance;
    private long sevenZipInStreamInstance;

    /* renamed from: com.tencent.mm.mm7zip.impl.InArchiveImpl$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$mm$mm7zip$PropID;

        static {
            int[] iArr = new int[com.tencent.mm.mm7zip.PropID.values().length];
            $SwitchMap$com$tencent$mm$mm7zip$PropID = iArr;
            try {
                iArr[com.tencent.mm.mm7zip.PropID.SIZE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$mm$mm7zip$PropID[com.tencent.mm.mm7zip.PropID.PACKED_SIZE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$mm$mm7zip$PropID[com.tencent.mm.mm7zip.PropID.IS_FOLDER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$mm$mm7zip$PropID[com.tencent.mm.mm7zip.PropID.ENCRYPTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$mm$mm7zip$PropID[com.tencent.mm.mm7zip.PropID.TIME_TYPE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class ExtractSlowCallback implements com.tencent.mm.mm7zip.IArchiveExtractCallback {
        private com.tencent.mm.mm7zip.ExtractOperationResult extractOperationResult;
        com.tencent.mm.mm7zip.ISequentialOutStream sequentialOutStreamParam;

        public ExtractSlowCallback(com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream) {
            this.sequentialOutStreamParam = iSequentialOutStream;
        }

        public com.tencent.mm.mm7zip.ExtractOperationResult getExtractOperationResult() {
            return this.extractOperationResult;
        }

        @Override // com.tencent.mm.mm7zip.IArchiveExtractCallback
        public com.tencent.mm.mm7zip.ISequentialOutStream getStream(int i17, com.tencent.mm.mm7zip.ExtractAskMode extractAskMode) {
            if (extractAskMode.equals(com.tencent.mm.mm7zip.ExtractAskMode.EXTRACT)) {
                return this.sequentialOutStreamParam;
            }
            return null;
        }

        @Override // com.tencent.mm.mm7zip.IArchiveExtractCallback
        public void prepareOperation(com.tencent.mm.mm7zip.ExtractAskMode extractAskMode) {
        }

        @Override // com.tencent.mm.mm7zip.IProgress
        public void setCompleted(long j17) {
        }

        @Override // com.tencent.mm.mm7zip.IArchiveExtractCallback
        public void setOperationResult(com.tencent.mm.mm7zip.ExtractOperationResult extractOperationResult) {
            this.extractOperationResult = extractOperationResult;
        }

        @Override // com.tencent.mm.mm7zip.IProgress
        public void setTotal(long j17) {
        }
    }

    /* loaded from: classes16.dex */
    public static final class ExtractSlowCryptoCallback extends com.tencent.mm.mm7zip.impl.InArchiveImpl.ExtractSlowCallback implements com.tencent.mm.mm7zip.ICryptoGetTextPassword {
        private java.lang.String password;

        public ExtractSlowCryptoCallback(com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream, java.lang.String str) {
            super(iSequentialOutStream);
            this.password = str;
        }

        @Override // com.tencent.mm.mm7zip.ICryptoGetTextPassword
        public java.lang.String cryptoGetTextPassword() {
            return this.password;
        }
    }

    private void createConnectedOutArchive() {
        if (!this.archiveFormat.isOutArchiveSupported()) {
            throw new java.lang.IllegalStateException("Archive format '" + this.archiveFormat + "' doesn't support archive manipulations.");
        }
        try {
            com.tencent.mm.mm7zip.impl.OutArchiveImpl<?> newInstance = this.archiveFormat.getOutArchiveImplementation().newInstance();
            this.outArchiveImpl = newInstance;
            newInstance.setInArchive(this);
            this.outArchiveImpl.setArchiveFormat(this.archiveFormat);
            nativeConnectOutArchive(this.outArchiveImpl, this.archiveFormat);
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalStateException("Internal error: Can't create new instance of the class " + this.archiveFormat.getOutArchiveImplementation() + " using default constructor.");
        }
    }

    private void ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(com.tencent.mm.mm7zip.ArchiveFormat archiveFormat) {
        if (getArchiveFormat() == archiveFormat) {
            return;
        }
        throw new com.tencent.mm.mm7zip.SevenZipException("Archive format specific update API for " + archiveFormat.getMethodName() + "-archives can't work with the currently opened " + getArchiveFormat().getMethodName() + "-archive");
    }

    private <T extends com.tencent.mm.mm7zip.IOutItemBase> com.tencent.mm.mm7zip.IOutUpdateArchive<T> getConnectedOutArchiveIntern() {
        if (this.outArchiveImpl == null) {
            createConnectedOutArchive();
        }
        return this.outArchiveImpl;
    }

    private native void nativeClose();

    private native void nativeConnectOutArchive(com.tencent.mm.mm7zip.impl.OutArchiveImpl<?> outArchiveImpl, com.tencent.mm.mm7zip.ArchiveFormat archiveFormat);

    private native void nativeExtract(int[] iArr, boolean z17, com.tencent.mm.mm7zip.IArchiveExtractCallback iArchiveExtractCallback);

    private native java.lang.Object nativeGetArchiveProperty(int i17);

    private native com.tencent.mm.mm7zip.PropertyInfo nativeGetArchivePropertyInfo(int i17);

    private native int nativeGetNumberOfArchiveProperties();

    private native int nativeGetNumberOfItems();

    private native int nativeGetNumberOfProperties();

    private native java.lang.Object nativeGetProperty(int i17, int i18);

    private native com.tencent.mm.mm7zip.PropertyInfo nativeGetPropertyInfo(int i17);

    private native java.lang.String nativeGetStringArchiveProperty(int i17);

    private native java.lang.String nativeGetStringProperty(int i17, int i18);

    private void setArchiveFormat(java.lang.String str) {
        for (com.tencent.mm.mm7zip.ArchiveFormat archiveFormat : com.tencent.mm.mm7zip.ArchiveFormat.values()) {
            if (archiveFormat.getMethodName().equalsIgnoreCase(str)) {
                this.archiveFormat = archiveFormat;
                return;
            }
        }
    }

    @Override // com.tencent.mm.mm7zip.IInArchive, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        nativeClose();
    }

    public void ensureOpened() {
        if (this.closed) {
            throw new com.tencent.mm.mm7zip.SevenZipException("InArchive closed");
        }
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public void extract(int[] iArr, boolean z17, com.tencent.mm.mm7zip.IArchiveExtractCallback iArchiveExtractCallback) {
        ensureOpened();
        nativeExtract(iArr, z17, iArchiveExtractCallback);
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public com.tencent.mm.mm7zip.ExtractOperationResult extractSlow(int i17, com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream) {
        ensureOpened();
        com.tencent.mm.mm7zip.impl.InArchiveImpl.ExtractSlowCallback extractSlowCallback = new com.tencent.mm.mm7zip.impl.InArchiveImpl.ExtractSlowCallback(iSequentialOutStream);
        nativeExtract(new int[]{i17}, false, extractSlowCallback);
        return extractSlowCallback.getExtractOperationResult();
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public com.tencent.mm.mm7zip.ArchiveFormat getArchiveFormat() {
        return this.archiveFormat;
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public java.lang.Object getArchiveProperty(com.tencent.mm.mm7zip.PropID propID) {
        ensureOpened();
        return nativeGetArchiveProperty(propID.getPropIDIndex());
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public com.tencent.mm.mm7zip.PropertyInfo getArchivePropertyInfo(int i17) {
        ensureOpened();
        return nativeGetArchivePropertyInfo(i17);
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public com.tencent.mm.mm7zip.IOutUpdateArchive<com.tencent.mm.mm7zip.IOutItemAllFormats> getConnectedOutArchive() {
        ensureOpened();
        return getConnectedOutArchiveIntern();
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public com.tencent.mm.mm7zip.IOutUpdateArchive7z getConnectedOutArchive7z() {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(com.tencent.mm.mm7zip.ArchiveFormat.SEVEN_ZIP);
        return (com.tencent.mm.mm7zip.IOutUpdateArchive7z) getConnectedOutArchiveIntern();
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public com.tencent.mm.mm7zip.IOutUpdateArchiveZip getConnectedOutArchiveZip() {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(com.tencent.mm.mm7zip.ArchiveFormat.ZIP);
        return (com.tencent.mm.mm7zip.IOutUpdateArchiveZip) getConnectedOutArchiveIntern();
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public int getNumberOfArchiveProperties() {
        ensureOpened();
        return nativeGetNumberOfArchiveProperties();
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public int getNumberOfItems() {
        ensureOpened();
        if (this.numberOfItems == -1) {
            this.numberOfItems = nativeGetNumberOfItems();
        }
        return this.numberOfItems;
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public int getNumberOfProperties() {
        ensureOpened();
        return nativeGetNumberOfProperties();
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public java.lang.Object getProperty(int i17, com.tencent.mm.mm7zip.PropID propID) {
        ensureOpened();
        if (i17 >= 0 && i17 < getNumberOfItems()) {
            java.lang.Object nativeGetProperty = nativeGetProperty(i17, propID.getPropIDIndex());
            int i18 = com.tencent.mm.mm7zip.impl.InArchiveImpl.AnonymousClass1.$SwitchMap$com$tencent$mm$mm7zip$PropID[propID.ordinal()];
            return (i18 == 1 || i18 == 2) ? nativeGetProperty instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Integer) nativeGetProperty).longValue()) : nativeGetProperty : i18 != 3 ? i18 != 4 ? (i18 == 5 && nativeGetProperty != null) ? com.tencent.mm.mm7zip.NFileTimeType.values()[((java.lang.Integer) nativeGetProperty).intValue()] : nativeGetProperty : nativeGetProperty == null ? java.lang.Boolean.FALSE : nativeGetProperty : nativeGetProperty == null ? java.lang.Boolean.FALSE : nativeGetProperty;
        }
        throw new com.tencent.mm.mm7zip.SevenZipException("Index out of range. Index: " + i17 + ", NumberOfItems: " + getNumberOfItems());
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public com.tencent.mm.mm7zip.PropertyInfo getPropertyInfo(int i17) {
        ensureOpened();
        return nativeGetPropertyInfo(i17);
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public com.tencent.mm.mm7zip.simple.ISimpleInArchive getSimpleInterface() {
        return new com.tencent.mm.mm7zip.simple.impl.SimpleInArchiveImpl(this);
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public java.lang.String getStringArchiveProperty(com.tencent.mm.mm7zip.PropID propID) {
        ensureOpened();
        return nativeGetStringArchiveProperty(propID.getPropIDIndex());
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public java.lang.String getStringProperty(int i17, com.tencent.mm.mm7zip.PropID propID) {
        ensureOpened();
        if (i17 >= 0 && i17 < getNumberOfItems()) {
            return nativeGetStringProperty(i17, propID.getPropIDIndex());
        }
        throw new com.tencent.mm.mm7zip.SevenZipException("Index out of range. Index: " + i17 + ", NumberOfItems: " + getNumberOfItems());
    }

    @Override // com.tencent.mm.mm7zip.IInArchive
    public com.tencent.mm.mm7zip.ExtractOperationResult extractSlow(int i17, com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream, java.lang.String str) {
        ensureOpened();
        com.tencent.mm.mm7zip.impl.InArchiveImpl.ExtractSlowCryptoCallback extractSlowCryptoCallback = new com.tencent.mm.mm7zip.impl.InArchiveImpl.ExtractSlowCryptoCallback(iSequentialOutStream, str);
        nativeExtract(new int[]{i17}, false, extractSlowCryptoCallback);
        return extractSlowCryptoCallback.getExtractOperationResult();
    }
}
