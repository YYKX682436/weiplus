package sc2;

/* loaded from: classes2.dex */
public final class o6 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ad2.h f487660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487661c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f487663e;

    public o6(xc2.p0 p0Var, ad2.h hVar, java.lang.String str, in5.s0 s0Var, long j17) {
        this.f487659a = p0Var;
        this.f487660b = hVar;
        this.f487661c = str;
        this.f487662d = s0Var;
        this.f487663e = j17;
    }

    @Override // ym5.n0
    /* renamed from: getExposedId */
    public long mo55681x18a217a5(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return this.f487663e;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (j17 == -1 && j18 == -1) {
            return;
        }
        xc2.p0 p0Var = this.f487659a;
        xc2.o0 o0Var = p0Var.f534779h;
        boolean z18 = true;
        boolean z19 = (o0Var == null || o0Var.a()) ? false : true;
        ad2.h hVar = this.f487660b;
        if (!z19) {
            java.lang.String m76523x98b23862 = p0Var.f534767a.m76523x98b23862();
            if (m76523x98b23862 != null && m76523x98b23862.length() != 0) {
                z18 = false;
            }
            if (z18 && !hVar.m(p0Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", "[onViewExposed] isExposed=" + z17 + ", jumper info is invalid, feedId=" + this.f487661c);
                return;
            }
        }
        hVar.u(z17, this.f487662d, view, p0Var);
    }
}
