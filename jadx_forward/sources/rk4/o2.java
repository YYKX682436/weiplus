package rk4;

/* loaded from: classes11.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f478405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f478406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f478407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f478408g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f478409h;

    public o2(long j17, rk4.l3 l3Var, android.app.Activity activity, bw5.lp0 lp0Var, byte[] bArr) {
        this.f478405d = j17;
        this.f478406e = l3Var;
        this.f478407f = activity;
        this.f478408g = lp0Var;
        this.f478409h = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17 = this.f478405d;
        bw5.d60 d60Var = null;
        bw5.lp0 tingItem = this.f478408g;
        android.app.Activity activity = this.f478407f;
        rk4.l3 l3Var = this.f478406e;
        if (j17 == 1) {
            cl4.v b17 = l3Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            b17.k(activity, tingItem, null);
            return;
        }
        if (j17 == 2) {
            cl4.v b18 = l3Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            b18.l(activity, tingItem);
        } else if (j17 == 3) {
            cl4.v b19 = l3Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            b19.c(activity, tingItem);
        } else if (j17 == 4) {
            try {
                d60Var = new bw5.d60().mo11468x92b714fd(this.f478409h);
            } catch (java.lang.Exception unused) {
            }
            cl4.v b27 = l3Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            b27.h(activity, tingItem, d60Var);
        }
    }
}
