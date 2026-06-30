package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes15.dex */
public class RepeatKeyTouchImageButton extends androidx.appcompat.widget.AppCompatImageButton implements com.tencent.mm.plugin.appbrand.widget.input.y5 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.z5 f91273f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.b5 f91274g;

    public RepeatKeyTouchImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91273f = new com.tencent.mm.plugin.appbrand.widget.input.z5(this);
        this.f91274g = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.y5
    public void a() {
        com.tencent.mm.plugin.appbrand.widget.input.b5 b5Var = this.f91274g;
        if (b5Var != null) {
            b5Var.a();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.y5
    public void b() {
        com.tencent.mm.plugin.appbrand.widget.input.b5 b5Var = this.f91274g;
        if (b5Var != null) {
            b5Var.b();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        this.f91273f.a(this, motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        com.tencent.mm.plugin.appbrand.widget.input.b5 b5Var = this.f91274g;
        if (b5Var == null) {
            return false;
        }
        b5Var.a();
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
    }

    public void setRepeatKeyTouchListener(com.tencent.mm.plugin.appbrand.widget.input.b5 b5Var) {
        setClickable(b5Var != null);
        this.f91274g = b5Var;
    }

    public RepeatKeyTouchImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91273f = new com.tencent.mm.plugin.appbrand.widget.input.z5(this);
        this.f91274g = null;
    }
}
