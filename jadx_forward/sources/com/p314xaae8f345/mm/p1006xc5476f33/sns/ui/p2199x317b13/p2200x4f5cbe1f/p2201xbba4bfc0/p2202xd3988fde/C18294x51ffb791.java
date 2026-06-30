package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u0004\u0018\u00010\u0006¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/AdGestureFrameLayout;", "Landroid/widget/FrameLayout;", "Ld94/b;", "iTouchEventProxy", "Ljz5/f0;", "setTouchEventProxy", "Lcom/tencent/mm/plugin/sns/ui/widget/w2;", "onGestureListener", "setOnGestureListener", "getGestureListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout */
/* loaded from: classes4.dex */
public final class C18294x51ffb791 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public d94.b f250862d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f250863e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 f250864f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18294x51ffb791(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearGesture", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        ((java.util.ArrayList) this.f250863e).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearGesture", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
    }

    public final java.util.List b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("copyPath", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f250863e).iterator();
        while (it.hasNext()) {
            android.graphics.PointF pointF = (android.graphics.PointF) it.next();
            arrayList.add(new android.graphics.PointF(pointF.x, pointF.y));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("copyPath", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        return arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        d94.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        boolean z17 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z17 = true;
        }
        if (z17 && (bVar = this.f250862d) != null) {
            ((d94.g) bVar).a(motionEvent);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        return dispatchTouchEvent;
    }

    /* renamed from: getGestureListener */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 m71061x71d5fee7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGestureListener", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 w2Var = this.f250864f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGestureListener", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        return w2Var;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEvent", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        getParent().requestDisallowInterceptTouchEvent(true);
        boolean z17 = motionEvent != null && motionEvent.getAction() == 0;
        java.util.List list = this.f250863e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 w2Var = this.f250864f;
            if (w2Var != null) {
                w2Var.c();
            }
            a();
            ((java.util.ArrayList) list).add(new android.graphics.PointF(motionEvent.getX(), motionEvent.getY()));
        } else {
            if (motionEvent != null && motionEvent.getAction() == 2) {
                ((java.util.ArrayList) list).add(new android.graphics.PointF(motionEvent.getX(), motionEvent.getY()));
                d94.b bVar = this.f250862d;
                if (bVar != null) {
                    ((d94.g) bVar).a(motionEvent);
                }
            } else {
                if (motionEvent != null && motionEvent.getAction() == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdGestureFrameLayout", "point count %d", java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
                    if (((java.util.ArrayList) list).size() < 6) {
                        a();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 w2Var2 = this.f250864f;
                        if (w2Var2 != null) {
                            w2Var2.a();
                        }
                    } else {
                        d94.b bVar2 = this.f250862d;
                        if (bVar2 != null) {
                            ((d94.g) bVar2).a(motionEvent);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 w2Var3 = this.f250864f;
                        if (w2Var3 != null) {
                            w2Var3.b(b());
                        }
                    }
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 w2Var4 = this.f250864f;
                    if (w2Var4 != null) {
                        w2Var4.b(b());
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        return true;
    }

    /* renamed from: setOnGestureListener */
    public final void m71062x672610fc(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 w2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnGestureListener", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        this.f250864f = w2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnGestureListener", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
    }

    /* renamed from: setTouchEventProxy */
    public final void m71063xeaf65bd1(d94.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTouchEventProxy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        this.f250862d = bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdGestureFrameLayout", "setTouchEventProxy: " + bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTouchEventProxy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18294x51ffb791(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f250863e = new java.util.ArrayList();
    }
}
