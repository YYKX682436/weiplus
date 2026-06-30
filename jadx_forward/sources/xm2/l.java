package xm2;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f536755a;

    /* renamed from: b, reason: collision with root package name */
    public final ym2.c f536756b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f536757c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f536758d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f536759e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1545xacf8107c.C14420x69387ef f536760f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f536761g;

    /* renamed from: h, reason: collision with root package name */
    public final xm2.e f536762h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f536763i;

    public l(android.view.ViewGroup controlPanelLayout, java.util.List groups, yz5.l itemsSelector, ym2.c itemsAdapter, yz5.p itemValueChangedHandler, yz5.l itemSelectedHandler, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controlPanelLayout, "controlPanelLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groups, "groups");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemsSelector, "itemsSelector");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemsAdapter, "itemsAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemValueChangedHandler, "itemValueChangedHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSelectedHandler, "itemSelectedHandler");
        this.f536755a = groups;
        this.f536756b = itemsAdapter;
        this.f536757c = itemValueChangedHandler;
        this.f536758d = itemSelectedHandler;
        this.f536759e = lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : groups) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.List list = (java.util.List) itemsSelector.mo146xb9724478(obj);
            if (i17 != this.f536755a.size() - 1 && !list.isEmpty()) {
                list = kz5.n0.u0(list, null);
            }
            kz5.h0.u(arrayList, list);
            i17 = i18;
        }
        xm2.j jVar = new xm2.j(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1545xacf8107c.C14420x69387ef c14420x69387ef = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1545xacf8107c.C14420x69387ef) controlPanelLayout.findViewById(com.p314xaae8f345.mm.R.id.v6t);
        c14420x69387ef.m57971x5109fa05(jVar);
        this.f536760f = c14420x69387ef;
        java.lang.Object Z = kz5.n0.Z(arrayList);
        if (Z == null) {
            throw new java.lang.IllegalArgumentException("Empty item list.");
        }
        this.f536761g = Z;
        xm2.e eVar = new xm2.e(arrayList, Z, this.f536756b, new xm2.i(this));
        this.f536762h = eVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) controlPanelLayout.findViewById(com.p314xaae8f345.mm.R.id.u6h);
        android.content.Context context = controlPanelLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c1163xf1deaba4.mo7967x900dcbe1(new xm2.f(context, arrayList, new xm2.k(this)));
        c1163xf1deaba4.mo7960x6cab2c8d(eVar);
        this.f536763i = c1163xf1deaba4;
        a(this.f536761g);
    }

    public final void a(java.lang.Object obj) {
        zm2.b bVar = (zm2.b) this.f536756b.a(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1545xacf8107c.C14420x69387ef c14420x69387ef = this.f536760f;
        if (bVar.f555701j) {
            c14420x69387ef.A(-bVar.f555697f, -bVar.f555698g, -bVar.f555699h, -bVar.f555700i);
        } else {
            c14420x69387ef.A(bVar.f555698g, bVar.f555697f, bVar.f555699h, bVar.f555700i);
        }
    }
}
