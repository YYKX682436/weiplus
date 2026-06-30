package org.p3343x72743996.net.p3356x3927bb2b;

/* renamed from: org.chromium.net.apihelpers.UploadDataProviders */
/* loaded from: classes13.dex */
public final class C29579x9755b77 {

    /* renamed from: org.chromium.net.apihelpers.UploadDataProviders$ByteBufferUploadProvider */
    /* loaded from: classes13.dex */
    public static final class ByteBufferUploadProvider extends org.p3343x72743996.net.AbstractC29560x8cb1347c {

        /* renamed from: mUploadBuffer */
        private final java.nio.ByteBuffer f74373x15fd62ae;

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: getLength */
        public long mo153654x23255ddc() {
            return this.f74373x15fd62ae.limit();
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: read */
        public void mo153655x355996(org.p3343x72743996.net.AbstractC29562xf1e0a9e abstractC29562xf1e0a9e, java.nio.ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new java.lang.IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.f74373x15fd62ae.remaining()) {
                byteBuffer.put(this.f74373x15fd62ae);
            } else {
                int limit = this.f74373x15fd62ae.limit();
                java.nio.ByteBuffer byteBuffer2 = this.f74373x15fd62ae;
                byteBuffer.put(this.f74373x15fd62ae);
            }
            abstractC29562xf1e0a9e.mo153663xf9a6d5cc(false);
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: rewind */
        public void mo153656xc84f6cbb(org.p3343x72743996.net.AbstractC29562xf1e0a9e abstractC29562xf1e0a9e) {
            abstractC29562xf1e0a9e.mo153665xe8a7e807();
        }

        private ByteBufferUploadProvider(java.nio.ByteBuffer byteBuffer) {
            this.f74373x15fd62ae = byteBuffer;
        }
    }

    /* renamed from: org.chromium.net.apihelpers.UploadDataProviders$FileChannelProvider */
    /* loaded from: classes13.dex */
    public interface FileChannelProvider {
        /* renamed from: getChannel */
        java.nio.channels.FileChannel mo153745x69d8b8cd();
    }

    /* renamed from: org.chromium.net.apihelpers.UploadDataProviders$FileUploadProvider */
    /* loaded from: classes13.dex */
    public static final class FileUploadProvider extends org.p3343x72743996.net.AbstractC29560x8cb1347c {

        /* renamed from: mChannel */
        private volatile java.nio.channels.FileChannel f74374xca242fd6;

        /* renamed from: mLock */
        private final java.lang.Object f74375x6243b38;

        /* renamed from: mProvider */
        private final org.p3343x72743996.net.p3356x3927bb2b.C29579x9755b77.FileChannelProvider f74376xea21ad7e;

        /* renamed from: getChannel */
        private java.nio.channels.FileChannel m153746x69d8b8cd() {
            if (this.f74374xca242fd6 == null) {
                synchronized (this.f74375x6243b38) {
                    if (this.f74374xca242fd6 == null) {
                        this.f74374xca242fd6 = this.f74376xea21ad7e.mo153745x69d8b8cd();
                    }
                }
            }
            return this.f74374xca242fd6;
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            java.nio.channels.FileChannel fileChannel = this.f74374xca242fd6;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: getLength */
        public long mo153654x23255ddc() {
            return m153746x69d8b8cd().size();
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: read */
        public void mo153655x355996(org.p3343x72743996.net.AbstractC29562xf1e0a9e abstractC29562xf1e0a9e, java.nio.ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new java.lang.IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            java.nio.channels.FileChannel m153746x69d8b8cd = m153746x69d8b8cd();
            int i17 = 0;
            while (i17 == 0) {
                int read = m153746x69d8b8cd.read(byteBuffer);
                if (read == -1) {
                    break;
                } else {
                    i17 += read;
                }
            }
            abstractC29562xf1e0a9e.mo153663xf9a6d5cc(false);
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: rewind */
        public void mo153656xc84f6cbb(org.p3343x72743996.net.AbstractC29562xf1e0a9e abstractC29562xf1e0a9e) {
            m153746x69d8b8cd().position(0L);
            abstractC29562xf1e0a9e.mo153665xe8a7e807();
        }

        private FileUploadProvider(org.p3343x72743996.net.p3356x3927bb2b.C29579x9755b77.FileChannelProvider fileChannelProvider) {
            this.f74375x6243b38 = new java.lang.Object();
            this.f74376xea21ad7e = fileChannelProvider;
        }
    }

    private C29579x9755b77() {
    }

    /* renamed from: create */
    public static org.p3343x72743996.net.AbstractC29560x8cb1347c m153741xaf65a0fc(final java.io.File file) {
        return new org.p3343x72743996.net.p3356x3927bb2b.C29579x9755b77.FileUploadProvider(new org.p3343x72743996.net.p3356x3927bb2b.C29579x9755b77.FileChannelProvider() { // from class: org.chromium.net.apihelpers.UploadDataProviders.1
            @Override // org.p3343x72743996.net.p3356x3927bb2b.C29579x9755b77.FileChannelProvider
            /* renamed from: getChannel */
            public java.nio.channels.FileChannel mo153745x69d8b8cd() {
                return new java.io.FileInputStream(file).getChannel();
            }
        });
    }

    /* renamed from: create */
    public static org.p3343x72743996.net.AbstractC29560x8cb1347c m153740xaf65a0fc(final android.os.ParcelFileDescriptor parcelFileDescriptor) {
        return new org.p3343x72743996.net.p3356x3927bb2b.C29579x9755b77.FileUploadProvider(new org.p3343x72743996.net.p3356x3927bb2b.C29579x9755b77.FileChannelProvider() { // from class: org.chromium.net.apihelpers.UploadDataProviders.2
            @Override // org.p3343x72743996.net.p3356x3927bb2b.C29579x9755b77.FileChannelProvider
            /* renamed from: getChannel */
            public java.nio.channels.FileChannel mo153745x69d8b8cd() {
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                throw new java.lang.IllegalArgumentException("Not a file: " + parcelFileDescriptor);
            }
        });
    }

    /* renamed from: create */
    public static org.p3343x72743996.net.AbstractC29560x8cb1347c m153742xaf65a0fc(java.nio.ByteBuffer byteBuffer) {
        return new org.p3343x72743996.net.p3356x3927bb2b.C29579x9755b77.ByteBufferUploadProvider(byteBuffer.slice());
    }

    /* renamed from: create */
    public static org.p3343x72743996.net.AbstractC29560x8cb1347c m153744xaf65a0fc(byte[] bArr, int i17, int i18) {
        return new org.p3343x72743996.net.p3356x3927bb2b.C29579x9755b77.ByteBufferUploadProvider(java.nio.ByteBuffer.wrap(bArr, i17, i18).slice());
    }

    /* renamed from: create */
    public static org.p3343x72743996.net.AbstractC29560x8cb1347c m153743xaf65a0fc(byte[] bArr) {
        return m153744xaf65a0fc(bArr, 0, bArr.length);
    }
}
