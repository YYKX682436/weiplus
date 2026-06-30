package com.tencent.mm.plugin.car_license_plate.ui;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/RepeatKeyTouchFrameLayout;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/appbrand/widget/input/y5;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "Lcom/tencent/mm/plugin/appbrand/widget/input/b5;", "value", "e", "Lcom/tencent/mm/plugin/appbrand/widget/input/b5;", "getRepeatKeyTouchListener", "()Lcom/tencent/mm/plugin/appbrand/widget/input/b5;", "setRepeatKeyTouchListener", "(Lcom/tencent/mm/plugin/appbrand/widget/input/b5;)V", "repeatKeyTouchListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class RepeatKeyTouchFrameLayout extends android.widget.FrameLayout implements com.tencent.mm.plugin.appbrand.widget.input.y5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.z5 f94628d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.appbrand.widget.input.b5 repeatKeyTouchListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatKeyTouchFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f94628d = new com.tencent.mm.plugin.appbrand.widget.input.z5(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.y5
    public void a() {
        com.tencent.mm.plugin.appbrand.widget.input.b5 b5Var = this.repeatKeyTouchListener;
        if (b5Var != null) {
            b5Var.a();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.y5
    public void b() {
        com.tencent.mm.plugin.appbrand.widget.input.b5 b5Var = this.repeatKeyTouchListener;
        if (b5Var != null) {
            b5Var.b();
        }
    }

    public final com.tencent.mm.plugin.appbrand.widget.input.b5 getRepeatKeyTouchListener() {
        return this.repeatKeyTouchListener;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        this.f94628d.a(this, motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        com.tencent.mm.plugin.appbrand.widget.input.b5 b5Var = this.repeatKeyTouchListener;
        if (b5Var == null) {
            return false;
        }
        b5Var.a();
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
    }

    public final void setRepeatKeyTouchListener(com.tencent.mm.plugin.appbrand.widget.input.b5 b5Var) {
        setClickable(b5Var != null);
        this.repeatKeyTouchListener = b5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatKeyTouchFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f94628d = new com.tencent.mm.plugin.appbrand.widget.input.z5(this);
    }
}
