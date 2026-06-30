package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/PassThroughScrollView;", "Landroid/widget/ScrollView;", "", "d", "Z", "getPassThroughTouch", "()Z", "setPassThroughTouch", "(Z)V", "passThroughTouch", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.PassThroughScrollView */
/* loaded from: classes3.dex */
public final class C14416x851a8b86 extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean passThroughTouch;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14416x851a8b86(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final boolean getPassThroughTouch() {
        return this.passThroughTouch;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (this.passThroughTouch) {
            return false;
        }
        return super.onInterceptTouchEvent(ev6);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (this.passThroughTouch) {
            return false;
        }
        return super.onTouchEvent(ev6);
    }

    /* renamed from: setPassThroughTouch */
    public final void m57947x31b17aad(boolean z17) {
        this.passThroughTouch = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14416x851a8b86(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
