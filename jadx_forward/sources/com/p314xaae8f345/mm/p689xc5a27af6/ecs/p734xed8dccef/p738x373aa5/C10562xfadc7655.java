package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextButtonView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "Lkotlin/Function0;", "d", "Lyz5/a;", "getPreOnCLick", "()Lyz5/a;", "setPreOnCLick", "(Lyz5/a;)V", "preOnCLick", "Landroid/graphics/Paint;", "g", "Ljz5/g;", "getOverlayPaint", "()Landroid/graphics/Paint;", "overlayPaint", "", "getShowMask", "()Z", "showMask", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView */
/* loaded from: classes9.dex */
public final class C10562xfadc7655 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.a preOnCLick;

    /* renamed from: e, reason: collision with root package name */
    public boolean f147497e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f147498f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g overlayPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10562xfadc7655(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static void b(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10562xfadc7655 c10562xfadc7655, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = c10562xfadc7655.f147497e;
        }
        if ((i17 & 2) != 0) {
            z18 = c10562xfadc7655.f147498f;
        }
        boolean m44409x67a4ccff = c10562xfadc7655.m44409x67a4ccff();
        c10562xfadc7655.f147497e = z17;
        c10562xfadc7655.f147498f = z18;
        if (m44409x67a4ccff != c10562xfadc7655.m44409x67a4ccff()) {
            c10562xfadc7655.invalidate();
        }
    }

    /* renamed from: getOverlayPaint */
    private final android.graphics.Paint m44408x71218864() {
        return (android.graphics.Paint) ((jz5.n) this.overlayPaint).mo141623x754a37bb();
    }

    /* renamed from: getShowMask */
    private final boolean m44409x67a4ccff() {
        return this.f147498f && this.f147497e;
    }

    public final void a(bw5.d9 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        removeAllViews();
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b c10563x3e05669b = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b(context, null, 0, 6, null);
        boolean[] zArr = item.f107913f;
        bw5.a9 a9Var = zArr[1] ? item.f107911d : new bw5.a9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a9Var, "getLabel(...)");
        c10563x3e05669b.a(a9Var);
        addView(c10563x3e05669b, new android.widget.FrameLayout.LayoutParams(-1, -1));
        if (zArr[2]) {
            setOnClickListener(new b30.y(new r20.h(this, item)));
            setClickable(true);
        } else {
            setOnClickListener(null);
            setClickable(false);
        }
    }

    public final yz5.a getPreOnCLick() {
        return this.preOnCLick;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (m44409x67a4ccff()) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), m44408x71218864());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (!this.f147497e) {
            return false;
        }
        int action = ev6.getAction();
        if (action == 0) {
            b(this, false, true, 1, null);
        } else if (action == 1 || action == 3) {
            b(this, false, false, 1, null);
        }
        return super.onTouchEvent(ev6);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        b(this, onClickListener != null, false, 2, null);
        super.setOnClickListener(onClickListener);
    }

    /* renamed from: setPreOnCLick */
    public final void m44411x116c4ce8(yz5.a aVar) {
        this.preOnCLick = aVar;
    }

    public /* synthetic */ C10562xfadc7655(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10562xfadc7655(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.overlayPaint = jz5.h.b(new r20.i(context));
    }
}
