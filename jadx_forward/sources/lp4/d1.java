package lp4;

/* loaded from: classes10.dex */
public final class d1 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f401870f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f401871g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f401872h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(android.content.Context context, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f401870f = context;
        this.f401871g = "MicroMsg.TimelineLoadingPlugin";
    }

    public static void A(lp4.d1 d1Var, java.lang.Integer num, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            num = null;
        }
        java.lang.String str = d1Var.f401871g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showLoading: ");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = d1Var.f401872h;
        sb6.append(u3Var != null ? java.lang.Boolean.valueOf(u3Var.isShowing()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = d1Var.f401872h;
        if (u3Var2 != null && u3Var2.isShowing()) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = i65.a.r(d1Var.f401870f, com.p314xaae8f345.mm.R.C30867xcad56011.ggc);
        if (num != null) {
            num.intValue();
            h0Var.f391656d = i65.a.r(d1Var.f401870f, num.intValue());
        }
        ((ku5.t0) ku5.t0.f394148d).B(new lp4.c1(d1Var, h0Var));
    }

    public final void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f401871g, "hideLoading: ");
        ((ku5.t0) ku5.t0.f394148d).B(new lp4.b1(this));
    }
}
