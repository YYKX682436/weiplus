package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR2\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveFixClickIssueRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Ljz5/f0;", "b2", "Lyz5/l;", "getTouchEventListener", "()Lyz5/l;", "setTouchEventListener", "(Lyz5/l;)V", "touchEventListener", "", "value", "c2", "Z", "getConsumedTouchEnvent", "()Z", "setConsumedTouchEnvent", "(Z)V", "consumedTouchEnvent", "d2", "getAnimating", "setAnimating", "animating", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView */
/* loaded from: classes3.dex */
public final class C14399xad75a698 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name and from kotlin metadata */
    public yz5.l touchEventListener;

    /* renamed from: c2, reason: collision with root package name and from kotlin metadata */
    public boolean consumedTouchEnvent;

    /* renamed from: d2, reason: collision with root package name and from kotlin metadata */
    public boolean animating;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14399xad75a698(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final boolean getAnimating() {
        return this.animating;
    }

    public final boolean getConsumedTouchEnvent() {
        return this.consumedTouchEnvent;
    }

    public final yz5.l getTouchEventListener() {
        return this.touchEventListener;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        boolean z17 = mo7958x54496c8e() == 2;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(event);
        if (event.getActionMasked() == 0 && z17) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (!canScrollVertically(-1) || !canScrollVertically(1)) {
                f1();
                return false;
            }
        }
        return onInterceptTouchEvent;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.animating) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveFixClickIssueRecyclerView", "view is animating,dispatchTouchEvent consumed!!!");
            return true;
        }
        yz5.l lVar = this.touchEventListener;
        if (lVar != null) {
            lVar.mo146xb9724478(motionEvent);
        }
        if (this.consumedTouchEnvent) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: setAnimating */
    public final void m57903x9e6c4d1c(boolean z17) {
        this.animating = z17;
    }

    /* renamed from: setConsumedTouchEnvent */
    public final void m57904x6fb39c33(boolean z17) {
        if (z17 != this.consumedTouchEnvent) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFixClickIssueRecyclerView", "set consumedTouchEnvent " + z17);
        }
        this.consumedTouchEnvent = z17;
    }

    /* renamed from: setTouchEventListener */
    public final void m57905x5dfd9471(yz5.l lVar) {
        this.touchEventListener = lVar;
    }
}
