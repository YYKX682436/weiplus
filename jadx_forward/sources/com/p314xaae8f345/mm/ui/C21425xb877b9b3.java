package com.p314xaae8f345.mm.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/ui/MultiTalkRoomPopupNavV2;", "Lcom/tencent/mm/ui/MultiTalkRoomPopupNav;", "", "getInitViewId", "color", "Ljz5/f0;", "setNavBackgroundColor", "resource", "setNavBackgroundResource", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNavV2 */
/* loaded from: classes14.dex */
public final class C21425xb877b9b3 extends com.p314xaae8f345.mm.ui.C21424xdbf688d7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21425xb877b9b3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.ui.C21424xdbf688d7
    public void a() {
        android.widget.LinearLayout linearLayout;
        com.p314xaae8f345.mm.ui.jf jfVar = this.f278537q;
        if ((jfVar == null || (linearLayout = jfVar.f290537a) == null || linearLayout.getVisibility() != 0) ? false : true) {
            findViewById(com.p314xaae8f345.mm.R.id.bzg).performClick();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f278528e;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setRotation(90.0f);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f278528e;
            if (c22699x3dcdb3522 == null) {
                return;
            }
            c22699x3dcdb3522.setVisibility(0);
            return;
        }
        super.a();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f278528e;
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.setRotation(270.0f);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f278528e;
        if (c22699x3dcdb3524 == null) {
            return;
        }
        c22699x3dcdb3524.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.ui.C21424xdbf688d7
    public boolean f(int i17) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.C21424xdbf688d7
    /* renamed from: getInitViewId */
    public int mo78786x22e2bc6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c3h;
    }

    @Override // com.p314xaae8f345.mm.ui.C21424xdbf688d7
    public void j(android.widget.LinearLayout linearLayout, long j17) {
        if (linearLayout == null) {
            return;
        }
        linearLayout.getLayoutParams().width = -2;
        linearLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight();
        android.view.View view = this.f278529f;
        if (view != null) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bcg);
        }
        android.view.ViewPropertyAnimator animate = animate();
        animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animate.setDuration(j17);
        animate.setUpdateListener(new com.p314xaae8f345.mm.ui.lf(measuredHeight, linearLayout, 90.0f, 270.0f, this));
        animate.start();
    }

    @Override // com.p314xaae8f345.mm.ui.C21424xdbf688d7
    public void k(android.widget.LinearLayout linearLayout, long j17) {
        if (linearLayout == null) {
            return;
        }
        int height = linearLayout.getHeight();
        android.view.ViewPropertyAnimator animate = animate();
        animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animate.setDuration(j17);
        animate.setUpdateListener(new com.p314xaae8f345.mm.ui.mf(height, 0, linearLayout, 270.0f, 90.0f, this));
        animate.setListener(new com.p314xaae8f345.mm.ui.nf(linearLayout, this, animate));
        animate.start();
    }

    @Override // com.p314xaae8f345.mm.ui.C21424xdbf688d7
    /* renamed from: setNavBackgroundColor */
    public void mo78793xbc1b1f34(int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.C21424xdbf688d7
    /* renamed from: setNavBackgroundResource */
    public void mo78794x295c769d(int i17) {
    }
}
