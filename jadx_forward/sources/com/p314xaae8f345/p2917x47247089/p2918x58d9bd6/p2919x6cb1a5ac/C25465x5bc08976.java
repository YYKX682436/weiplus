package com.p314xaae8f345.p2917x47247089.p2918x58d9bd6.p2919x6cb1a5ac;

/* renamed from: com.tencent.qqmusicplayerprocess.audio.playermanager.EKeyDecryptor */
/* loaded from: classes15.dex */
public class C25465x5bc08976 {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f296788c;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f296789a;

    /* renamed from: b, reason: collision with root package name */
    public long f296790b;

    public C25465x5bc08976(java.lang.String str) {
        java.lang.Object obj = new java.lang.Object();
        this.f296789a = obj;
        this.f296790b = 0L;
        synchronized (obj) {
            long m94421x8b1ecf5e = m94421x8b1ecf5e(str);
            this.f296790b = m94421x8b1ecf5e;
            int i17 = (m94421x8b1ecf5e > 0L ? 1 : (m94421x8b1ecf5e == 0L ? 0 : -1));
        }
    }

    /* renamed from: createInstWidthEKey */
    private native long m94421x8b1ecf5e(java.lang.String str);

    /* renamed from: destroyInst */
    private native void m94422x89d1ed60(long j17);

    /* renamed from: streamDecrypt */
    private native void m94423x782431ed(long j17, long j18, byte[] bArr, int i17);

    /* renamed from: streamEncrypt */
    private native void m94424xbc660ac5(long j17, long j18, byte[] bArr, int i17);

    public void a() {
        synchronized (this.f296789a) {
            long j17 = this.f296790b;
            if (j17 != 0) {
                m94422x89d1ed60(j17);
                this.f296790b = 0L;
            }
        }
    }

    public boolean b(long j17, byte[] bArr, int i17) {
        synchronized (this.f296789a) {
            long j18 = this.f296790b;
            if (j18 == 0) {
                return false;
            }
            m94423x782431ed(j18, j17, bArr, i17);
            return true;
        }
    }
}
