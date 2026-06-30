package za3;

/* loaded from: classes15.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f552425a;

    /* renamed from: b, reason: collision with root package name */
    public final za3.a1 f552426b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.res.Resources f552427c;

    public b1(android.content.Context context, za3.a1 a1Var) {
        this.f552425a = context;
        this.f552426b = a1Var;
        this.f552427c = context.getResources();
    }

    public void a() {
        java.lang.Object l17 = gm0.j1.u().c().l(67590, null);
        if (!(l17 == null ? false : ((java.lang.Boolean) l17).booleanValue())) {
            db5.e1.H(this.f552425a, this.f552427c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573930gh0), "", false, new za3.v0(this), new za3.w0(this));
            gm0.j1.u().c().w(67590, java.lang.Boolean.TRUE);
            return;
        }
        za3.a1 a1Var = this.f552426b;
        if (a1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0) a1Var;
            p0Var.Y.f515901z = p0Var.f226266i.f226337f.mo1008xfb888c49();
            p0Var.f226261d.finish();
        }
    }
}
