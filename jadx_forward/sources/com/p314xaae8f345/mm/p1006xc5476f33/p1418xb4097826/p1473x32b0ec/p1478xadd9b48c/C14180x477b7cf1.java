package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/bubble/LinearBubbleAnimateContainer;", "Landroid/widget/LinearLayout;", "Lkotlinx/coroutines/y0;", "getScope", "", "getDelayTime", "", "isNeedAnimate", "Ljz5/f0;", "setIsNeedAnimateShow", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer */
/* loaded from: classes13.dex */
public final class C14180x477b7cf1 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f193048d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f193049e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f193050f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f193051g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f193052h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14180x477b7cf1(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 c14180x477b7cf1) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runBubbleShow size = ");
        java.util.LinkedList linkedList = c14180x477b7cf1.f193048d;
        sb6.append(linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LinearBubbleAnimateContainer", sb6.toString());
        if (linkedList.size() == 0) {
            return;
        }
        pm0.v.X(new ie2.l(c14180x477b7cf1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getDelayTime */
    public final long m56782xe377783a() {
        return this.f193048d.size() >= 1 ? 3000L : 5000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r1 != false) goto L10;
     */
    /* renamed from: getScope */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p3325xe03a0797.p3326xc267989b.y0 m56783x7520e49e() {
        /*
            r2 = this;
            kotlinx.coroutines.y0 r0 = r2.f193050f
            if (r0 == 0) goto L10
            r1 = 0
            if (r0 == 0) goto Le
            boolean r0 = p3325xe03a0797.p3326xc267989b.z0.h(r0)
            if (r0 != 0) goto Le
            r1 = 1
        Le:
            if (r1 == 0) goto L16
        L10:
            kotlinx.coroutines.y0 r0 = p3325xe03a0797.p3326xc267989b.z0.b()
            r2.f193050f = r0
        L16:
            kotlinx.coroutines.y0 r0 = r2.f193050f
            if (r0 != 0) goto L1e
            kotlinx.coroutines.y0 r0 = p3325xe03a0797.p3326xc267989b.z0.b()
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1.m56783x7520e49e():kotlinx.coroutines.y0");
    }

    public final void d() {
        if (getOrientation() != 0) {
            return;
        }
        int childCount = getChildCount();
        int i17 = -1;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = getChildAt(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a = childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a) childAt : null;
            if (c14179xd6e3454a != null && c14179xd6e3454a.getVisibility() == 0) {
                int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                if (i17 == -1) {
                    dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                    i17 = i18;
                }
                android.view.ViewGroup.LayoutParams layoutParams = c14179xd6e3454a.m56779x33bfba91().getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = dimensionPixelOffset;
                }
                c14179xd6e3454a.requestLayout();
            }
        }
    }

    public final void e(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a) {
        if (getOrientation() == 0) {
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = getChildAt(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a2 = childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a) childAt : null;
                if (c14179xd6e3454a2 != null && c14179xd6e3454a2.getVisibility() == 0) {
                    android.view.ViewGroup.LayoutParams layoutParams = c14179xd6e3454a2.m56779x33bfba91().getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.leftMargin = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                    }
                }
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = c14179xd6e3454a.m56779x33bfba91().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            }
            removeView(c14179xd6e3454a);
            addView(c14179xd6e3454a, 0);
        } else {
            int childCount2 = getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                android.view.View childAt2 = getChildAt(i18);
                if (childAt2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.leftMargin = 0;
                    }
                }
            }
            bringChildToFront(c14179xd6e3454a);
        }
        if (z17) {
            f(c14179xd6e3454a, 0);
        } else {
            c14179xd6e3454a.setVisibility(0);
        }
        ie2.h hVar = c14179xd6e3454a.sceneStateListener;
        if (hVar != null) {
            hVar.j();
        }
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a, int i17) {
        if (c14179xd6e3454a.getParent() != null) {
            p012xc85e97e9.p112x993b6d55.C1172x76e7e484 c1172x76e7e484 = new p012xc85e97e9.p112x993b6d55.C1172x76e7e484();
            c1172x76e7e484.W(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a.class);
            u4.g1.a(this, c1172x76e7e484);
        } else {
            pm0.z.b(xy2.b.f539688b, "frameBubbleContentLayout_parent_null", false, null, null, false, false, null, 124, null);
        }
        c14179xd6e3454a.setVisibility(i17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromWindow currentJob: ");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f193051g;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LinearBubbleAnimateContainer", sb6.toString());
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f193051g;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f193050f;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        this.f193050f = null;
    }

    /* renamed from: setIsNeedAnimateShow */
    public final void m56784xd8e5343c(boolean z17) {
        this.f193052h = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14180x477b7cf1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193048d = new java.util.LinkedList();
        this.f193049e = new java.util.LinkedList();
        this.f193052h = true;
    }
}
