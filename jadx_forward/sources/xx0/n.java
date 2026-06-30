package xx0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f539448a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f539449b;

    /* renamed from: c, reason: collision with root package name */
    public final xx0.i f539450c;

    /* renamed from: d, reason: collision with root package name */
    public final float f539451d;

    /* renamed from: e, reason: collision with root package name */
    public uu3.u f539452e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f539453f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f539454g;

    /* renamed from: h, reason: collision with root package name */
    public xx0.l f539455h;

    /* renamed from: i, reason: collision with root package name */
    public xx0.j f539456i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f539457j;

    public n(android.view.ViewGroup viewGroup, p3325xe03a0797.p3326xc267989b.y0 scope, xx0.i dataProvider, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataProvider, "dataProvider");
        this.f539448a = viewGroup;
        this.f539449b = scope;
        this.f539450c = dataProvider;
        this.f539451d = f17;
    }

    public final xx0.c a() {
        uu3.u uVar = this.f539452e;
        if (uVar == null) {
            return null;
        }
        vu3.c m170537x647851f2 = uVar.m170537x647851f2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m170537x647851f2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.drawer.component.DefaultDrawerComponent");
        android.view.View view = ((vu3.d) m170537x647851f2).f521758b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.template_panel.MoreTemplateDrawerContentView");
        return (xx0.c) view;
    }

    public final void b() {
        xx0.f0 f0Var;
        e06.k kVar;
        int i17;
        int i18;
        xx0.c a17 = a();
        if (a17 != null && (f0Var = a17.f539397g) != null) {
            java.util.Iterator it = ((java.util.LinkedHashMap) f0Var.f539432h).values().iterator();
            while (it.hasNext()) {
                xx0.d0 d0Var = ((xx0.e0) it.next()).f539421a;
                if (d0Var.f539417o) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateTabPageView", "notifyIsHidden tab: " + d0Var.f539410e.f521572a);
                    d0Var.f539417o = false;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d0Var.f539416n, new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE)) && (i17 = (kVar = d0Var.f539416n).f327742d) <= (i18 = kVar.f327743e)) {
                        while (true) {
                            d0Var.f539414i.z(i17);
                            if (i17 != i18) {
                                i17++;
                            }
                        }
                    }
                }
            }
        }
        uu3.u uVar = this.f539452e;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6.a(uVar, false, 1, null);
        }
    }
}
