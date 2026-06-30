package xm2;

/* loaded from: classes14.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f536717a;

    /* renamed from: b, reason: collision with root package name */
    public final ym2.c f536718b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f536719c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f536720d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1545xacf8107c.C14420x69387ef f536721e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f536722f;

    /* renamed from: g, reason: collision with root package name */
    public final xm2.w f536723g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f536724h;

    public a0(android.view.ViewGroup controlPanelLayout, java.util.List items, java.lang.Object obj, ym2.c itemsAdapter, yz5.p itemValueChangedHandler, yz5.l itemSelectedHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controlPanelLayout, "controlPanelLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemsAdapter, "itemsAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemValueChangedHandler, "itemValueChangedHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSelectedHandler, "itemSelectedHandler");
        this.f536717a = items;
        this.f536718b = itemsAdapter;
        this.f536719c = itemValueChangedHandler;
        this.f536720d = itemSelectedHandler;
        xm2.z zVar = new xm2.z(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1545xacf8107c.C14420x69387ef c14420x69387ef = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1545xacf8107c.C14420x69387ef) controlPanelLayout.findViewById(com.p314xaae8f345.mm.R.id.v6t);
        c14420x69387ef.m57971x5109fa05(zVar);
        this.f536721e = c14420x69387ef;
        this.f536722f = obj;
        xm2.w wVar = new xm2.w(items, obj, itemsAdapter, new xm2.y(this));
        this.f536723g = wVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) controlPanelLayout.findViewById(com.p314xaae8f345.mm.R.id.u6h);
        android.content.Context context = controlPanelLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c1163xf1deaba4.mo7967x900dcbe1(new xm2.x(context));
        c1163xf1deaba4.mo7960x6cab2c8d(wVar);
        this.f536724h = c1163xf1deaba4;
        a(obj);
    }

    public final void a(java.lang.Object obj) {
        zm2.d dVar = (zm2.d) this.f536718b.a(obj);
        boolean z17 = dVar.f555704e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1545xacf8107c.C14420x69387ef c14420x69387ef = this.f536721e;
        if (!z17) {
            c14420x69387ef.setVisibility(8);
        } else {
            c14420x69387ef.setVisibility(0);
            c14420x69387ef.A(dVar.f555706g, dVar.f555705f, dVar.f555707h, dVar.f555708i);
        }
    }
}
