package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0014J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J \u0010\t\u001a\u00020\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/multistream/MultiStreamRecyclerView;", "Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "Lkotlin/Function0;", "Ljz5/f0;", "itemClick", "setRecyclerClick", "Lkotlin/Function2;", "", "doubleClick", "setRecyclerDoubleClick", "", "alpha", "setAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView */
/* loaded from: classes3.dex */
public final class C14259xb044a81d extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea {
    public yz5.l A2;
    public yz5.a B2;
    public final wj2.k0 C2;
    public p3325xe03a0797.p3326xc267989b.r2 D2;

    /* renamed from: w2, reason: collision with root package name */
    public int f193284w2;

    /* renamed from: x2, reason: collision with root package name */
    public int f193285x2;

    /* renamed from: y2, reason: collision with root package name */
    public yz5.a f193286y2;

    /* renamed from: z2, reason: collision with root package name */
    public yz5.p f193287z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14259xb044a81d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (getContext() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14042xca648648) {
            wj2.k0 k0Var = new wj2.k0();
            this.C2 = k0Var;
            k0Var.b(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        yz5.l lVar = this.A2;
        if (lVar != null) {
            lVar.mo146xb9724478(motionEvent);
        }
        yz5.a aVar = this.B2;
        if (aVar != null && ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue()) {
            return false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = mo7946xf939df19();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = null;
        rk2.b bVar = mo7946xf939df19 instanceof rk2.b ? (rk2.b) mo7946xf939df19 : null;
        if (bVar != null && bVar.f477978d.size() < 2) {
            wj2.k0 k0Var = this.C2;
            return k0Var != null && k0Var.a(motionEvent);
        }
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f193284w2 = (int) motionEvent.getX();
            this.f193285x2 = (int) motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4 c15432x61ce4af4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4) getRootView().findViewById(com.p314xaae8f345.mm.R.id.mw9);
            if (c15432x61ce4af4 != null) {
                c15432x61ce4af4.m62895x95ea238a(false);
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            getParent().requestDisallowInterceptTouchEvent((((double) 180) * java.lang.Math.atan2((double) java.lang.Math.abs(((int) motionEvent.getX()) - this.f193284w2), (double) java.lang.Math.abs(((int) motionEvent.getY()) - this.f193285x2))) / 3.141592653589793d >= 30.0d);
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                int x17 = (int) motionEvent.getX();
                int y17 = (int) motionEvent.getY();
                int scaledTouchSlop = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
                if (java.lang.Math.abs(x17 - this.f193284w2) > scaledTouchSlop || java.lang.Math.abs(y17 - this.f193285x2) > scaledTouchSlop) {
                    p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.D2;
                    if (r2Var2 != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                    }
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[ACTION_UP] doubleClickJob = ");
                    sb6.append(this.D2);
                    sb6.append(", isActive = ");
                    p3325xe03a0797.p3326xc267989b.r2 r2Var3 = this.D2;
                    sb6.append(r2Var3 != null ? java.lang.Boolean.valueOf(((p3325xe03a0797.p3326xc267989b.a) r2Var3).a()) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamRecyclerView", sb6.toString());
                    p3325xe03a0797.p3326xc267989b.r2 r2Var4 = this.D2;
                    if (r2Var4 != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var4).a()) {
                        p3325xe03a0797.p3326xc267989b.r2 r2Var5 = this.D2;
                        if (r2Var5 != null) {
                            p3325xe03a0797.p3326xc267989b.p2.a(r2Var5, null, 1, null);
                        }
                        yz5.p pVar = this.f193287z2;
                        if (pVar != null) {
                            pVar.mo149xb9724478(java.lang.Integer.valueOf(x17), java.lang.Integer.valueOf(y17));
                        }
                    } else {
                        p3325xe03a0797.p3326xc267989b.r2 r2Var6 = this.D2;
                        if (r2Var6 != null) {
                            p3325xe03a0797.p3326xc267989b.p2.a(r2Var6, null, 1, null);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
                        if (k0Var2 != null) {
                            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                            r2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(k0Var2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new rk2.s(this, null), 2, null);
                        }
                        this.D2 = r2Var;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4 c15432x61ce4af42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4) getRootView().findViewById(com.p314xaae8f345.mm.R.id.mw9);
                if (c15432x61ce4af42 != null) {
                    c15432x61ce4af42.m62895x95ea238a(true);
                }
            }
        }
        return (motionEvent != null && motionEvent.getPointerCount() == 1) && super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamRecyclerView", "setAlpha alpha:" + f17);
    }

    /* renamed from: setRecyclerClick */
    public final void m56887x69836747(yz5.a itemClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemClick, "itemClick");
        this.f193286y2 = itemClick;
    }

    /* renamed from: setRecyclerDoubleClick */
    public final void m56888x2b2c2ab6(yz5.p doubleClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doubleClick, "doubleClick");
        this.f193287z2 = doubleClick;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14259xb044a81d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (getContext() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14042xca648648) {
            wj2.k0 k0Var = new wj2.k0();
            this.C2 = k0Var;
            k0Var.b(this);
        }
    }
}
