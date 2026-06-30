package x03;

/* loaded from: classes15.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.p1 f532595d;

    public j1(x03.p1 p1Var) {
        this.f532595d = p1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        x03.r1 u0Var;
        x03.p1 p1Var = this.f532595d;
        android.content.Context context = p1Var.f532621a;
        java.lang.String dataSource = p1Var.f532622b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        if (r26.i0.y(dataSource, "preview://", false)) {
            u0Var = new x03.i0(context, dataSource);
        } else {
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(context.getCacheDir().toString() + "/flutter/MMVideo-" + dataSource.hashCode() + ".mp4").o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            u0Var = new x03.u0(context, o17);
        }
        p1Var.f532626f = u0Var;
        p1Var.f532626f.h(p1Var.f532623c);
        p1Var.f532626f.d(p1Var.f532625e);
        p1Var.f532627g = new android.view.Surface(p1Var.f532628h.mo138117x299653ae());
        p1Var.f532626f.mo158545x42c875eb(p1Var.f532627g);
        p1Var.f532626f.i();
        p1Var.f532626f.f(new x03.i1(this));
        p1Var.f532626f.mo158542xed060d07();
        x03.x0.f532694d.a().f532697b.e(p1Var.f532626f.mo174785x4edea88a(), kk.k.g(p1Var.f532626f.mo174785x4edea88a().getBytes()));
    }
}
