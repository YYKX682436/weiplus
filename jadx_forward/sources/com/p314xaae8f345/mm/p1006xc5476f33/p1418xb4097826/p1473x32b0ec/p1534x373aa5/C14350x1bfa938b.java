package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveSwipeToCloseRelativeLayout;", "Lcom/tencent/mm/plugin/finder/live/view/FinderLiveInterceptTouchRelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveSwipeToCloseRelativeLayout */
/* loaded from: classes3.dex */
public final class C14350x1bfa938b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14328x87868185 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab f197635e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f197636f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14350x1bfa938b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        ae2.in inVar = ae2.in.f85221a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C7).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f197636f;
        boolean g86 = lVar != null ? ((mm2.c1) lVar.P0(mm2.c1.class)).g8() : false;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean z18 = ((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f;
        if (!z17 || g86 || z18) {
            return dispatchTouchEvent;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        if (obtain != null) {
            obtain.setLocation(obtain.getRawX(), obtain.getRawY());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = this.f197635e;
        if (c22649x858f5ab != null ? c22649x858f5ab.b(obtain) : false) {
            requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        android.view.Window window;
        android.view.View decorView;
        super.onFinishInflate();
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            c22649x858f5ab = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab) decorView.findViewById(com.p314xaae8f345.mm.R.id.nsv);
        }
        this.f197635e = c22649x858f5ab;
        java.util.Objects.toString(c22649x858f5ab);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14350x1bfa938b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
