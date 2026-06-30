package r35;

/* loaded from: classes9.dex */
public class j0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f450675d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f450676e;

    public j0(java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f450675d = str;
        this.f450676e = n3Var;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "CdnImageView_download";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f450675d;
        byte[] u07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u0(str);
        android.os.Message obtain = android.os.Message.obtain();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("k_data", u07);
        bundle.putString("k_url", str);
        obtain.setData(bundle);
        this.f450676e.mo50308x2936bf5f(obtain);
    }
}
