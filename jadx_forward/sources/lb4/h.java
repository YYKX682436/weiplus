package lb4;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f399319a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 f399320b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f399321c;

    /* renamed from: d, reason: collision with root package name */
    public lb4.f f399322d;

    public h(android.content.Context context, p012xc85e97e9.p093xedfae76a.j0 bindData, com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 wheelView, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        wheelView = (i17 & 4) != 0 ? new com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480(context) : wheelView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindData, "bindData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wheelView, "wheelView");
        this.f399319a = bindData;
        this.f399320b = wheelView;
        this.f399321c = new p012xc85e97e9.p093xedfae76a.j0();
        wheelView.m48604x88423923(new lb4.d(this));
        bindData.mo7807xc74540ab(new lb4.e(this));
    }

    public static final kb4.c a(lb4.h hVar, int i17) {
        java.util.List a17;
        kb4.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        hVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        lb4.f fVar = hVar.f399322d;
        kb4.c cVar2 = null;
        if (fVar != null && (a17 = fVar.a()) != null) {
            if (!(a17.size() > i17)) {
                a17 = null;
            }
            if (a17 != null && (cVar = (kb4.c) a17.get(i17)) != null) {
                cVar2 = cVar;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
                return cVar2;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PickerWheelView", "onItemSelectedListener error: cannot find selectItem!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        return cVar2;
    }

    public final p012xc85e97e9.p093xedfae76a.g0 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectedItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f399321c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectedItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        return j0Var;
    }

    public final com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWheelView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWheelView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        return this.f399320b;
    }
}
