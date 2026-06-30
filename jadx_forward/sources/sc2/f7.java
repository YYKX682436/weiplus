package sc2;

/* loaded from: classes2.dex */
public final class f7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad2.h f487423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487425g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487426h;

    public f7(xc2.p0 p0Var, ad2.h hVar, in5.s0 s0Var, android.view.View view, java.lang.String str) {
        this.f487422d = p0Var;
        this.f487423e = hVar;
        this.f487424f = s0Var;
        this.f487425g = view;
        this.f487426h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc2.p0 p0Var = this.f487422d;
        p0Var.A = false;
        ad2.h hVar = this.f487423e;
        if (hVar != null) {
            ad2.k.b(hVar, this.f487424f, this.f487425g, p0Var, true, null, 16, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJumpViewFocus source=");
        sb6.append(this.f487426h);
        sb6.append(", feedId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f487422d.f534777f;
        sb6.append(pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L));
        sb6.append(" onRealShow view.isVisible=");
        sb6.append(this.f487425g.getVisibility() == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", sb6.toString());
    }
}
