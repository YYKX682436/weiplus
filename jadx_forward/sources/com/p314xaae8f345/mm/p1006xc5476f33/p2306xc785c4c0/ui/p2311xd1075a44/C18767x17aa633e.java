package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.RJ\u0010\r\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR4\u0010\u0016\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0018\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001c¨\u0006/"}, d2 = {"Lcom/tencent/mm/plugin/topstory/ui/widget/TopStoryViewPager;", "Lcom/tencent/mm/ui/base/CustomViewPager;", "Lal5/m2;", "Lkotlin/Function5;", "Landroid/view/View;", "", "", "d", "Lyz5/s;", "getCanScrollCallback", "()Lyz5/s;", "setCanScrollCallback", "(Lyz5/s;)V", "canScrollCallback", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "e", "Lyz5/l;", "getInterceptCallback", "()Lyz5/l;", "setInterceptCallback", "(Lyz5/l;)V", "interceptCallback", "f", "Z", "getEnableDrag", "()Z", "setEnableDrag", "(Z)V", "enableDrag", "", "Landroid/graphics/RectF;", "g", "Ljava/util/List;", "getDisableDragArea", "()Ljava/util/List;", "setDisableDragArea", "(Ljava/util/List;)V", "disableDragArea", "isUseCustomScrollIntercept", "setUseCustomScrollIntercept", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui-topstory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager */
/* loaded from: classes5.dex */
public class C18767x17aa633e extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d implements al5.m2 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.s canScrollCallback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.l interceptCallback;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean enableDrag;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public java.util.List disableDragArea;

    public C18767x17aa633e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.enableDrag = true;
        this.disableDragArea = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d
    /* renamed from: canScroll */
    public boolean mo67173x10136bd(android.view.View view, boolean z17, int i17, int i18, int i19) {
        boolean z18;
        yz5.s sVar = this.canScrollCallback;
        boolean booleanValue = sVar != null ? ((java.lang.Boolean) sVar.v(view, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19))).booleanValue() : true;
        java.util.Iterator it = this.disableDragArea.iterator();
        while (true) {
            if (!it.hasNext()) {
                z18 = false;
                break;
            }
            if (((android.graphics.RectF) it.next()).contains(i18, i19)) {
                z18 = true;
                break;
            }
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            java.util.Objects.toString(view);
        }
        return booleanValue || !this.enableDrag || z18;
    }

    @Override // al5.m2
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
    }

    @Override // al5.m2
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
    }

    public final yz5.s getCanScrollCallback() {
        return this.canScrollCallback;
    }

    /* renamed from: getDisableDragArea */
    public final java.util.List<? extends android.graphics.RectF> m72336x1069a8b3() {
        return this.disableDragArea;
    }

    public final boolean getEnableDrag() {
        return this.enableDrag;
    }

    public final yz5.l getInterceptCallback() {
        return this.interceptCallback;
    }

    @Override // al5.m2
    public boolean m(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17) {
        if (((i19 != 0 || i17 >= 0) && (java.lang.Math.abs(i19 - i28) >= 160 || i17 <= 0)) || i18 != 0) {
            return false;
        }
        m80860xd1cd6549(false, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d, com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Boolean bool;
        yz5.l lVar = this.interceptCallback;
        boolean onInterceptTouchEvent = (lVar == null || (bool = (java.lang.Boolean) lVar.mo146xb9724478(motionEvent)) == null) ? super.onInterceptTouchEvent(motionEvent) : bool.booleanValue();
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            android.view.MotionEvent.actionToString(motionEvent != null ? motionEvent.getAction() : -1);
        }
        return onInterceptTouchEvent;
    }

    /* renamed from: setCanScrollCallback */
    public final void m72339x7e5241e0(yz5.s sVar) {
        this.canScrollCallback = sVar;
    }

    /* renamed from: setDisableDragArea */
    public final void m72340x47404227(java.util.List<? extends android.graphics.RectF> list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
        this.disableDragArea = list;
    }

    /* renamed from: setEnableDrag */
    public final void m72341x8d365359(boolean z17) {
        this.enableDrag = z17;
    }

    /* renamed from: setInterceptCallback */
    public final void m72342xfc1156e5(yz5.l lVar) {
        this.interceptCallback = lVar;
    }

    /* renamed from: setUseCustomScrollIntercept */
    public final void m72343x9325dbff(boolean z17) {
    }
}
