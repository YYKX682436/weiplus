package za3;

/* loaded from: classes9.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f552503d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f552504e;

    public k0(java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f552503d = str;
        this.f552504e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] u07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u0(this.f552503d);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.obj = u07;
        this.f552504e.mo50308x2936bf5f(obtain);
    }
}
