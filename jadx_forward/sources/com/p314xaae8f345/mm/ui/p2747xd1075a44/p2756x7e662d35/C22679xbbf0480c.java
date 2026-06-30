package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/tencent/mm/ui/widget/cropview/DragExitCropLayout;", "Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "", "p1", "Z", "isEnableDragExit", "()Z", "setEnableDragExit", "(Z)V", "Landroid/view/View;", "z1", "Landroid/view/View;", "getBgView", "()Landroid/view/View;", "setBgView", "(Landroid/view/View;)V", "bgView", "", "A1", "F", "getDoubleTapScale", "()F", "doubleTapScale", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.cropview.DragExitCropLayout */
/* loaded from: classes10.dex */
public class C22679xbbf0480c extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa {

    /* renamed from: A1, reason: from kotlin metadata */
    public final float doubleTapScale;

    /* renamed from: p1, reason: collision with root package name and from kotlin metadata */
    public boolean isEnableDragExit;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f293199x1;

    /* renamed from: y1, reason: collision with root package name */
    public float f293200y1;

    /* renamed from: z1, reason: collision with root package name and from kotlin metadata */
    public android.view.View bgView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22679xbbf0480c(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f293200y1 = 1.0f;
        this.doubleTapScale = 2.0f;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.AbstractC22676x7a2993ab, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.ViewOnTouchListenerC22681xee05ddc5
    public void c(android.view.MotionEvent e17) {
        android.view.View view;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator alpha;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e1");
        super.c(e17);
        if (this.f293199x1 && (view = this.bgView) != null && (animate = view.animate()) != null && (duration = animate.setDuration(200L)) != null && (alpha = duration.alpha(1.0f)) != null) {
            alpha.start();
        }
        this.f293199x1 = false;
    }

    public final android.view.View getBgView() {
        return this.bgView;
    }

    public final float getDoubleTapScale() {
        return this.doubleTapScale;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.ViewOnTouchListenerC22681xee05ddc5, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        if (this.isEnableDragExit && !this.isFirstCancelOrUp && !x()) {
            if ((motionEvent != null && motionEvent.getPointerCount() == 1) && e27.getPointerCount() == 1 && ((z17 = this.f293199x1) || f18 < 0.0f)) {
                if (!z17) {
                    this.f293200y1 = m81888xc7b108a2()[0];
                }
                this.f293199x1 = true;
                float exactCenterY = (getContentRect().exactCenterY() - getVisibilityRect().centerY()) / (getVisibilityRect().height() / 2);
                B((this.f293200y1 * (1.0f - (0.6f * exactCenterY))) / m81888xc7b108a2()[0], getContentRect().exactCenterX(), getContentRect().exactCenterY());
                android.view.View view = this.bgView;
                if (view != null) {
                    float f19 = 1.0f - exactCenterY;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(f19));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/cropview/DragExitCropLayout", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/ui/widget/cropview/DragExitCropLayout", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
        super.onScroll(motionEvent, e27, f17, f18);
        return true;
    }

    /* renamed from: setBgView */
    public final void m81931x55b678c(android.view.View view) {
        this.bgView = view;
    }

    /* renamed from: setEnableDragExit */
    public final void m81932x98dc2c17(boolean z17) {
        this.isEnableDragExit = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22679xbbf0480c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f293200y1 = 1.0f;
        this.doubleTapScale = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22679xbbf0480c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f293200y1 = 1.0f;
        this.doubleTapScale = 2.0f;
    }
}
