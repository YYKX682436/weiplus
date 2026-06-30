package al5;

/* loaded from: classes4.dex */
public final class t3 implements al5.b4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.w3 f87566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d f87567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f87568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ al5.v3 f87569g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ al5.x3 f87570h;

    public t3(al5.w3 w3Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d, android.view.View view, al5.v3 v3Var, al5.x3 x3Var) {
        this.f87566d = w3Var;
        this.f87567e = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d;
        this.f87568f = view;
        this.f87569g = v3Var;
        this.f87570h = x3Var;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector detector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detector, "detector");
        al5.w3 w3Var = this.f87566d;
        if (w3Var == null) {
            return false;
        }
        this.f87567e.m81464xb7cf71c7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18088x3b8ce6e6 c18088x3b8ce6e6 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18088x3b8ce6e6) w3Var;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.C1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f = c18088x3b8ce6e6.f248878a;
        accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$onCreate$3", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (c18088x3b8ce6e6.f248879b) {
            accessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.e7(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$onCreate$3", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector detector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detector, "detector");
        al5.u3 u3Var = al5.y3.f87635a;
        android.view.View view = this.f87568f;
        db5.e7 a17 = u3Var.a(view);
        al5.v3 v3Var = this.f87569g;
        android.graphics.Rect a18 = v3Var != null ? v3Var.a() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TouchLayoutHelper", "initScale >> onScaleBegin: " + a18);
        if (a17 != null) {
            a17.mo70831x49dc7633(true);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = this.f87567e;
        if (a18 != null) {
            if (a18.bottom - a18.top > 0) {
                scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81482x1405e56c(r3 - r4);
                scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81485xbdd8ccab(a18);
            }
        }
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.b(view);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector detector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detector, "detector");
        al5.x3 x3Var = this.f87570h;
        if (x3Var != null) {
            x3Var.a(2, this.f87567e.m81464xb7cf71c7());
        }
    }
}
