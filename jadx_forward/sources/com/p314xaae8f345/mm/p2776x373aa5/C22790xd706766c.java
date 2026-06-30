package com.p314xaae8f345.mm.p2776x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0002B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/view/MaxHeightFrameLayout;", "Landroid/widget/FrameLayout;", "Lym5/m2;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setOnUPSlideListener", "", "height", "setMaxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.MaxHeightFrameLayout */
/* loaded from: classes14.dex */
public final class C22790xd706766c extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f294876d;

    /* renamed from: e, reason: collision with root package name */
    public float f294877e;

    /* renamed from: f, reason: collision with root package name */
    public float f294878f;

    /* renamed from: g, reason: collision with root package name */
    public ym5.m2 f294879g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22790xd706766c(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (this.f294879g == null) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            this.f294878f = event.getX();
            this.f294877e = event.getY();
            return false;
        }
        if (action != 2) {
            return false;
        }
        float x17 = event.getX() - this.f294878f;
        float y17 = event.getY() - this.f294877e;
        if (java.lang.Math.abs(y17) <= java.lang.Math.abs(x17) || y17 >= 0.0f || java.lang.Math.abs(y17) <= 10.0f) {
            return false;
        }
        ym5.m2 m2Var = this.f294879g;
        if (m2Var != null) {
            bh5.w0 w0Var = (bh5.w0) m2Var;
            com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22416x4a36f104 c22416x4a36f104 = w0Var.f102502a;
            android.view.ViewGroup.LayoutParams layoutParams = c22416x4a36f104.o0().getLayoutParams();
            if (layoutParams != null) {
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(layoutParams.height, w0Var.f102503b);
                ofInt.addUpdateListener(new bh5.v0(layoutParams, c22416x4a36f104));
                ofInt.setDuration(200L);
                ofInt.start();
            }
        }
        this.f294879g = null;
        java.lang.Math.abs(y17);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f294876d > 0) {
            int size = android.view.View.MeasureSpec.getSize(i18);
            int mode = android.view.View.MeasureSpec.getMode(i18);
            if (mode == Integer.MIN_VALUE) {
                int i19 = this.f294876d;
                if (size > i19) {
                    size = i19;
                }
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            } else if (mode == 0) {
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(this.f294876d, Integer.MIN_VALUE);
            } else if (mode == 1073741824) {
                int i27 = this.f294876d;
                if (size > i27) {
                    size = i27;
                }
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            }
        }
        super.onMeasure(i17, i18);
    }

    /* renamed from: setMaxHeight */
    public final void m82585x25bfb969(int i17) {
        this.f294876d = i17;
    }

    /* renamed from: setOnUPSlideListener */
    public final void m82586x6549caa9(ym5.m2 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f294879g = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22790xd706766c(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
