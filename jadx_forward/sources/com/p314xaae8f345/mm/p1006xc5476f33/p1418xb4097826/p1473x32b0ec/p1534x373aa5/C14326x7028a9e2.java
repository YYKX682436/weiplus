package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveInputLayout;", "Landroid/widget/LinearLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "f", "Lyz5/a;", "getOnSingleTouListener", "()Lyz5/a;", "setOnSingleTouListener", "(Lyz5/a;)V", "onSingleTouListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveInputLayout */
/* loaded from: classes2.dex */
public final class C14326x7028a9e2 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f197516d;

    /* renamed from: e, reason: collision with root package name */
    public float f197517e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yz5.a onSingleTouListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14326x7028a9e2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final yz5.a getOnSingleTouListener() {
        return this.onSingleTouListener;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        yz5.a aVar;
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        boolean z17 = false;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f197516d = motionEvent.getRawY();
            this.f197517e = motionEvent.getRawX();
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                float abs = java.lang.Math.abs(motionEvent.getRawY() - this.f197516d);
                float abs2 = java.lang.Math.abs(motionEvent.getRawX() - this.f197517e);
                if (((float) java.lang.Math.sqrt((abs * abs) + (abs2 * abs2))) < android.view.ViewConfiguration.getTouchSlop()) {
                    z17 = true;
                }
            }
        }
        if (z17 && (aVar = this.onSingleTouListener) != null) {
            aVar.mo152xb9724478();
        }
        return true;
    }

    /* renamed from: setOnSingleTouListener */
    public final void m57355xf90c7ee5(yz5.a aVar) {
        this.onSingleTouListener = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14326x7028a9e2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
