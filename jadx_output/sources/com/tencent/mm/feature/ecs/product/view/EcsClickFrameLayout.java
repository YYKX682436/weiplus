package com.tencent.mm.feature.ecs.product.view;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/view/EcsClickFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "Landroid/graphics/Paint;", "f", "Ljz5/g;", "getOverlayPaint", "()Landroid/graphics/Paint;", "overlayPaint", "", "getShowMask", "()Z", "showMask", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EcsClickFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f65953d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65954e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g overlayPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsClickFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static void a(com.tencent.mm.feature.ecs.product.view.EcsClickFrameLayout ecsClickFrameLayout, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = ecsClickFrameLayout.f65953d;
        }
        if ((i17 & 2) != 0) {
            z18 = ecsClickFrameLayout.f65954e;
        }
        boolean showMask = ecsClickFrameLayout.getShowMask();
        ecsClickFrameLayout.f65953d = z17;
        ecsClickFrameLayout.f65954e = z18;
        if (showMask != ecsClickFrameLayout.getShowMask()) {
            ecsClickFrameLayout.invalidate();
        }
    }

    private final android.graphics.Paint getOverlayPaint() {
        return (android.graphics.Paint) ((jz5.n) this.overlayPaint).getValue();
    }

    private final boolean getShowMask() {
        return this.f65954e && this.f65953d;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (getShowMask()) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), getOverlayPaint());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        int action = ev6.getAction();
        if (action == 0) {
            a(this, false, true, 1, null);
        } else if (action == 1 || action == 3) {
            a(this, false, false, 1, null);
        }
        return super.onTouchEvent(ev6);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        a(this, onClickListener != null, false, 2, null);
        super.setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsClickFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.overlayPaint = jz5.h.b(new r20.f(context));
    }
}
