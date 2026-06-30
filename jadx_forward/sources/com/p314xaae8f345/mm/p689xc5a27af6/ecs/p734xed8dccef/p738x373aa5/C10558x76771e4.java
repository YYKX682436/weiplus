package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/view/EcsClickFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "Landroid/graphics/Paint;", "f", "Ljz5/g;", "getOverlayPaint", "()Landroid/graphics/Paint;", "overlayPaint", "", "getShowMask", "()Z", "showMask", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.product.view.EcsClickFrameLayout */
/* loaded from: classes2.dex */
public final class C10558x76771e4 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f147486d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f147487e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g overlayPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10558x76771e4(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static void a(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10558x76771e4 c10558x76771e4, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = c10558x76771e4.f147486d;
        }
        if ((i17 & 2) != 0) {
            z18 = c10558x76771e4.f147487e;
        }
        boolean m44400x67a4ccff = c10558x76771e4.m44400x67a4ccff();
        c10558x76771e4.f147486d = z17;
        c10558x76771e4.f147487e = z18;
        if (m44400x67a4ccff != c10558x76771e4.m44400x67a4ccff()) {
            c10558x76771e4.invalidate();
        }
    }

    /* renamed from: getOverlayPaint */
    private final android.graphics.Paint m44399x71218864() {
        return (android.graphics.Paint) ((jz5.n) this.overlayPaint).mo141623x754a37bb();
    }

    /* renamed from: getShowMask */
    private final boolean m44400x67a4ccff() {
        return this.f147487e && this.f147486d;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (m44400x67a4ccff()) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), m44399x71218864());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
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
    public C10558x76771e4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.overlayPaint = jz5.h.b(new r20.f(context));
    }
}
