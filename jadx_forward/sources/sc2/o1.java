package sc2;

/* loaded from: classes2.dex */
public final class o1 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 f487649c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f487650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487651e;

    public o1(in5.s0 s0Var, xc2.p0 p0Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var, sc2.f2 f2Var, android.view.View view) {
        this.f487647a = s0Var;
        this.f487648b = p0Var;
        this.f487649c = z0Var;
        this.f487650d = f2Var;
        this.f487651e = view;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.t
    public void a(android.view.View view, int i17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        xc2.y2 y2Var = xc2.y2.f534876a;
        in5.s0 s0Var = this.f487647a;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = this.f487649c.m75727xeff487ef().e();
        xc2.p0 p0Var = this.f487648b;
        y2Var.J(context, p0Var, e17, s0Var);
        xc2.z2 z2Var = this.f487650d.f84684o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        if (bVar != null) {
            int i18 = 144;
            if (i17 != 0) {
                if (i17 == 1) {
                    i18 = 145;
                } else if (i17 == 2) {
                    i18 = 146;
                }
            }
            bVar.B(s0Var, this.f487651e, p0Var, i18);
        }
    }
}
