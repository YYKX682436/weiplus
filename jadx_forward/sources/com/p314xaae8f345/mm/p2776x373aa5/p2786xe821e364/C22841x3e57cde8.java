package com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/view/recyclerview/HorizontalRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lkotlin/Function1;", "", "Ljz5/f0;", "k2", "Lyz5/l;", "getOnInterceptChangedListener", "()Lyz5/l;", "setOnInterceptChangedListener", "(Lyz5/l;)V", "onInterceptChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.recyclerview.HorizontalRecyclerView */
/* loaded from: classes3.dex */
public final class C22841x3e57cde8 extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 {

    /* renamed from: j2, reason: collision with root package name */
    public boolean f295240j2;

    /* renamed from: k2, reason: collision with root package name and from kotlin metadata */
    public yz5.l onInterceptChangedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22841x3e57cde8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final yz5.l getOnInterceptChangedListener() {
        return this.onInterceptChangedListener;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent != this.f295240j2) {
            yz5.l lVar = this.onInterceptChangedListener;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.valueOf(onInterceptTouchEvent));
            }
            this.f295240j2 = onInterceptTouchEvent;
        }
        return onInterceptTouchEvent;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: setOnInterceptChangedListener */
    public final void m82889xccda5967(yz5.l lVar) {
        this.onInterceptChangedListener = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22841x3e57cde8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
