package gm0;

/* loaded from: classes7.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f354721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354723f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354724g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gm0.h1 f354725h;

    public g1(gm0.h1 h1Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f354725h = h1Var;
        this.f354721d = i17;
        this.f354722e = str;
        this.f354723f = str2;
        this.f354724g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FindOutDataDisappeared", "Found private data disappeared! (%s)", java.lang.Integer.valueOf(this.f354721d));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FindOutDataDisappeared", "Current private storage usage: %s", this.f354722e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FindOutDataDisappeared", "Previous private storage usage: %s", this.f354723f);
            gm0.h1 h1Var = this.f354725h;
            java.lang.String str = this.f354724g;
            h1Var.getClass();
            h1Var.a(new java.io.File(lp0.b.X()));
            h1Var.a(new java.io.File(lp0.b.e()));
            h1Var.a(new java.io.File(lp0.b.e(), str));
            gm0.d1.a();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FindOutDataDisappeared", th6, "", new java.lang.Object[0]);
        }
    }
}
