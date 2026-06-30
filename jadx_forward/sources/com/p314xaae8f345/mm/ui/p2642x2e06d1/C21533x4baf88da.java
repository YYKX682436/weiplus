package com.p314xaae8f345.mm.ui.p2642x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/ui/base/TalkRoomPopupNavV2;", "Lcom/tencent/mm/ui/base/TalkRoomPopupNav;", "", "getInitViewLayout", "", "rotation", "Ljz5/f0;", "setArrowRotation", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNavV2 */
/* loaded from: classes8.dex */
public final class C21533x4baf88da extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21533x4baf88da(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be
    public void f(long j17) {
        this.f279223g.getLayoutParams().width = -2;
        this.f279223g.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f279223g.getMeasuredHeight();
        android.widget.LinearLayout linearLayout = this.f279222f;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bcg);
        }
        android.view.ViewPropertyAnimator animate = animate();
        animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animate.setDuration(j17);
        animate.setUpdateListener(new db5.j9(measuredHeight, this, 90.0f, 270.0f));
        animate.start();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be
    public void g(long j17) {
        int height = this.f279223g.getHeight();
        android.view.ViewPropertyAnimator animate = animate();
        animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animate.setDuration(j17);
        animate.setUpdateListener(new db5.k9(height, 0, this, 270.0f, 90.0f));
        animate.setListener(new db5.l9(this, animate));
        animate.start();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be
    /* renamed from: getInitViewLayout */
    public int mo79290xa933cc55() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cxr;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be
    public void h() {
    }

    /* renamed from: setArrowRotation */
    public final void m79297x43e9f165(float f17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f279233t;
        if (c22699x3dcdb352 == null) {
            return;
        }
        c22699x3dcdb352.setRotation(f17);
    }
}
