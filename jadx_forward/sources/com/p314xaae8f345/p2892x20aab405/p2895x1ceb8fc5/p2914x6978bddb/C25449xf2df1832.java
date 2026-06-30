package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.TracerDataSource */
/* loaded from: classes13.dex */
public class C25449xf2df1832 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e {
    private static final java.lang.String TAG = "TracerDataSource";

    /* renamed from: impl */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e f46150x316220;

    public C25449xf2df1832(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        this.f46150x316220 = interfaceC25439x37e1318e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f46150x316220.close();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[close] failed!", th6);
            throw th6;
        }
    }

    /* renamed from: equals */
    public boolean m94322xb2c87fbf(java.lang.Object obj) {
        return this.f46150x316220.equals(obj);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94257xaa5357a() {
        try {
            return this.f46150x316220.mo94257xaa5357a();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[getAudioType] failed!", th6);
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getSize */
    public long mo94260xfb854877() {
        try {
            return this.f46150x316220.mo94260xfb854877();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[getSize] failed!", th6);
            throw th6;
        }
    }

    /* renamed from: hashCode */
    public int m94323x8cdac1b() {
        return this.f46150x316220.hashCode();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: open */
    public void mo94263x34264a() {
        try {
            this.f46150x316220.mo94263x34264a();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[open] failed!", th6);
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: readAt */
    public int mo94264xc8455469(long j17, byte[] bArr, int i17, int i18) {
        try {
            return this.f46150x316220.mo94264xc8455469(j17, bArr, i17, i18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[readAt] failed! pos = " + j17 + ", offset = " + i17 + ", size = " + i18, th6);
            throw th6;
        }
    }

    /* renamed from: toString */
    public java.lang.String m94324x9616526c() {
        return this.f46150x316220.toString();
    }
}
