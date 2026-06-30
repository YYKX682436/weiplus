package pl2;

/* loaded from: classes3.dex */
public final class x extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f438214d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f438215e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f438216f;

    /* renamed from: g, reason: collision with root package name */
    public pl2.s f438217g;

    /* renamed from: h, reason: collision with root package name */
    public vd2.v2 f438218h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f438219i;

    /* renamed from: m, reason: collision with root package name */
    public pl2.w f438220m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f438214d = "Finder.FinderLiveSideBarUIC";
        this.f438219i = new java.util.LinkedList();
        this.f438220m = new pl2.w(this, 0);
    }

    public final void O6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438214d, "notifySliderBarExtranceExpose:" + z17 + ", currExpose:" + this.f438215e);
        if (z17 == this.f438215e) {
            return;
        }
        this.f438215e = z17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5492x8f1b5f40 c5492x8f1b5f40 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5492x8f1b5f40();
        c5492x8f1b5f40.f135825g.f89808a = z17;
        c5492x8f1b5f40.e();
    }

    public final void P6(boolean z17) {
        android.view.Window window;
        android.view.View decorView;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438214d, "set inSideBarStatus:" + z17);
        this.f438216f = z17;
        ae2.in inVar = ae2.in.f85221a;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C7).mo141623x754a37bb()).r()).intValue() == 1)) {
            android.app.Activity m80379x76847179 = m80379x76847179();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = null;
            if (!(m80379x76847179 instanceof android.app.Activity)) {
                m80379x76847179 = null;
            }
            if (m80379x76847179 != null && (window = m80379x76847179.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                c22649x858f5ab = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab) decorView.findViewById(com.p314xaae8f345.mm.R.id.nsv);
            }
            if (c22649x858f5ab != null) {
                c22649x858f5ab.m81450x8e764904(!z17);
            }
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd c14380x23078afd = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd.class);
        boolean z18 = this.f438216f;
        wa2.n0 n0Var = c14380x23078afd.f198523p;
        if (n0Var == null) {
            return;
        }
        n0Var.m173382x86b8d8fe(z18);
    }
}
