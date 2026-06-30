package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveScrollView;", "Landroid/widget/HorizontalScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveScrollView */
/* loaded from: classes5.dex */
public final class C14344x52e6fb04 extends android.widget.HorizontalScrollView {

    /* renamed from: d, reason: collision with root package name */
    public int f197625d;

    /* renamed from: e, reason: collision with root package name */
    public int f197626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14344x52e6fb04(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4 c15432x61ce4af4;
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f197625d = (int) motionEvent.getX();
            this.f197626e = (int) motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4 c15432x61ce4af42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4) getRootView().findViewById(com.p314xaae8f345.mm.R.id.mw9);
            if (c15432x61ce4af42 != null) {
                c15432x61ce4af42.m62895x95ea238a(false);
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            int abs = java.lang.Math.abs(x17 - this.f197625d);
            int abs2 = java.lang.Math.abs(y17 - this.f197626e);
            double atan2 = (180 * java.lang.Math.atan2(abs, abs2)) / 3.141592653589793d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScrollView", " angel: " + atan2 + " disX: " + abs + " disY: " + abs2);
            getParent().requestDisallowInterceptTouchEvent(atan2 >= 30.0d);
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                r2 = true;
            }
            if (r2 && (c15432x61ce4af4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4) getRootView().findViewById(com.p314xaae8f345.mm.R.id.mw9)) != null) {
                c15432x61ce4af4.m62895x95ea238a(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14344x52e6fb04(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14344x52e6fb04(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
