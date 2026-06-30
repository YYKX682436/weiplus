package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016;

/* renamed from: com.tencent.qqmusic.mediaplayer.codec.NativeDecoder */
/* loaded from: classes13.dex */
public class C25375x52862c0d extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813 {
    private static final java.lang.String TAG = "NativeDecoder";

    /* renamed from: mReadWriteLock */
    private final java.util.concurrent.locks.ReadWriteLock f45853x9570c147 = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: mNativePointer */
    private long f45852xa2496b9 = 0;

    /* renamed from: nativeDecode */
    private native int m94011x74bd20e5(long j17, byte[] bArr, int i17, int i18);

    /* renamed from: nativeGetAudioInformation */
    private native com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 m94012xff460155(long j17);

    /* renamed from: nativeGetBytePositionOfTime */
    private native long m94013xc0933914(long j17, long j18);

    /* renamed from: nativeGetCurrentPosition */
    private native long m94014x72a6d803(long j17);

    /* renamed from: nativeGetDetailErrorCode */
    private native int m94015x9f7f2905(long j17);

    /* renamed from: nativeGetDetailErrorDescription */
    private native java.lang.String m94016xd90dde4(long j17);

    /* renamed from: nativeGetDuration */
    private native long m94017xdea9be73(long j17);

    /* renamed from: nativeGetMinBufferSize */
    private native long m94018x75654ed4(long j17);

    /* renamed from: nativeInit */
    private native long[] m94019xb90145c7(long j17);

    /* renamed from: nativeInit */
    private native long[] m94020xb90145c7(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e);

    /* renamed from: nativeRelease */
    private native int m94021x7f877f0(long j17);

    /* renamed from: nativeSeekTo */
    private native long m94022x8e56aa0a(long j17, long j18);

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: decodeData */
    public int mo93984xb7ec4eb8(int i17, byte[] bArr) {
        this.f45853x9570c147.readLock().lock();
        try {
            return m94011x74bd20e5(this.f45852xa2496b9, bArr, 0, i17);
        } finally {
            this.f45853x9570c147.readLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getAudioInformation */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 mo93985x6e8c46ec() {
        this.f45853x9570c147.readLock().lock();
        try {
            return m94012xff460155(this.f45852xa2496b9);
        } finally {
            this.f45853x9570c147.readLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getBytePositionOfTime */
    public long mo93987x775e74eb(long j17) {
        this.f45853x9570c147.readLock().lock();
        try {
            return m94013xc0933914(this.f45852xa2496b9, j17);
        } finally {
            this.f45853x9570c147.readLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getCurrentTime */
    public long mo93988xfdac66b0() {
        this.f45853x9570c147.readLock().lock();
        try {
            return m94014x72a6d803(this.f45852xa2496b9);
        } finally {
            this.f45853x9570c147.readLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getDuration */
    public long mo93989x51e8b0a() {
        this.f45853x9570c147.readLock().lock();
        try {
            return m94017xdea9be73(this.f45852xa2496b9);
        } finally {
            this.f45853x9570c147.readLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getErrorCodeMask */
    public int mo93990x5470d4eb() {
        return -1;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getMinBufferSize */
    public long mo93991x55bbc89d() {
        this.f45853x9570c147.readLock().lock();
        try {
            return m94018x75654ed4(this.f45852xa2496b9);
        } finally {
            this.f45853x9570c147.readLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: getNativeLibs */
    public java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65> mo93992xa743473b() {
        return java.util.Arrays.asList(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.audioCommon, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.formatDetector, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.codecFactory, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.decoderJni, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.cppShared, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.xlog, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.xFFmpeg);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: init */
    public int mo93993x316510(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        long j17;
        this.f45853x9570c147.writeLock().lock();
        try {
            long[] m94020xb90145c7 = m94020xb90145c7(interfaceC25439x37e1318e);
            if (m94020xb90145c7 == null || m94020xb90145c7.length < 2) {
                j17 = -1;
            } else {
                this.f45852xa2496b9 = m94020xb90145c7[0];
                j17 = m94020xb90145c7[1];
            }
            int i17 = (int) j17;
            return i17;
        } finally {
            this.f45853x9570c147.writeLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: release */
    public int mo93996x41012807() {
        this.f45853x9570c147.writeLock().lock();
        try {
            int m94021x7f877f0 = m94021x7f877f0(this.f45852xa2496b9);
            this.f45852xa2496b9 = 0L;
            return m94021x7f877f0;
        } finally {
            this.f45853x9570c147.writeLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: seekTo */
    public int mo93997xc9fc1b13(int i17) {
        this.f45853x9570c147.readLock().lock();
        try {
            return (int) m94022x8e56aa0a(this.f45852xa2496b9, i17);
        } finally {
            this.f45853x9570c147.readLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: init */
    public int mo93994x316510(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45 interfaceC25441x92a45) {
        long j17;
        this.f45853x9570c147.writeLock().lock();
        if (interfaceC25441x92a45 != null) {
            try {
                long[] m94019xb90145c7 = m94019xb90145c7(interfaceC25441x92a45.mo94303x27a10ec2());
                if (m94019xb90145c7 != null && m94019xb90145c7.length >= 2) {
                    this.f45852xa2496b9 = m94019xb90145c7[0];
                    j17 = m94019xb90145c7[1];
                    int i17 = (int) j17;
                    return i17;
                }
            } finally {
                this.f45853x9570c147.writeLock().unlock();
            }
        }
        j17 = -1;
        int i172 = (int) j17;
        return i172;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813
    /* renamed from: init */
    public int mo93995x316510(java.lang.String str, boolean z17) {
        return mo93993x316510(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(str));
    }
}
