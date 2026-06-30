package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/RoundLinearLayout;", "Landroid/widget/LinearLayout;", "", "percent", "Ljz5/f0;", "setRadius", "Lcom/tencent/mm/plugin/finder/feed/f30;", "d", "Lcom/tencent/mm/plugin/finder/feed/f30;", "getCornerRadius", "()Lcom/tencent/mm/plugin/finder/feed/f30;", "setCornerRadius", "(Lcom/tencent/mm/plugin/finder/feed/f30;)V", "cornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.RoundLinearLayout */
/* loaded from: classes4.dex */
public class C13821x319c273d extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f30 cornerRadius;

    /* renamed from: e, reason: collision with root package name */
    public float f187702e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f187703f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13821x319c273d(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f187702e = 0.5f;
        this.f187703f = new android.graphics.Path();
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.H, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.cornerRadius = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f30(dimension, dimension, dimension, dimension);
        setWillNotDraw(false);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r14) {
        /*
            r13 = this;
            java.lang.String r0 = "canvas"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r0)
            android.graphics.Path r0 = r13.f187703f
            r0.reset()
            com.tencent.mm.plugin.finder.feed.f30 r1 = r13.cornerRadius
            if (r1 == 0) goto L75
            float r2 = r1.f188230a
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L19
            r4 = r6
            goto L1a
        L19:
            r4 = r5
        L1a:
            float r7 = r1.f188233d
            float r8 = r1.f188232c
            float r1 = r1.f188231b
            if (r4 == 0) goto L3f
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 != 0) goto L28
            r4 = r6
            goto L29
        L28:
            r4 = r5
        L29:
            if (r4 == 0) goto L3f
            int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r4 != 0) goto L31
            r4 = r6
            goto L32
        L31:
            r4 = r5
        L32:
            if (r4 == 0) goto L3f
            int r4 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r4 != 0) goto L3a
            r4 = r6
            goto L3b
        L3a:
            r4 = r5
        L3b:
            if (r4 == 0) goto L3f
            r4 = r6
            goto L40
        L3f:
            r4 = r5
        L40:
            if (r4 == 0) goto L43
            goto L75
        L43:
            android.graphics.RectF r4 = new android.graphics.RectF
            int r9 = r13.getWidth()
            float r9 = (float) r9
            int r10 = r13.getHeight()
            float r10 = (float) r10
            r4.<init>(r3, r3, r9, r10)
            r3 = 8
            float[] r3 = new float[r3]
            r3[r5] = r2
            r3[r6] = r2
            r2 = 2
            r3[r2] = r1
            r2 = 3
            r3[r2] = r1
            r1 = 4
            r3[r1] = r7
            r1 = 5
            r3[r1] = r7
            r1 = 6
            r3[r1] = r8
            r1 = 7
            r3[r1] = r8
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CCW
            r0.addRoundRect(r4, r3, r1)
            r0.close()
            goto L9a
        L75:
            android.graphics.Path r5 = r13.f187703f
            r6 = 0
            r7 = 0
            int r1 = r13.getWidth()
            float r8 = (float) r1
            int r1 = r13.getHeight()
            float r9 = (float) r1
            int r1 = r13.getWidth()
            float r1 = (float) r1
            float r2 = r13.f187702e
            float r10 = r1 * r2
            int r1 = r13.getHeight()
            float r1 = (float) r1
            float r2 = r13.f187702e
            float r11 = r1 * r2
            android.graphics.Path$Direction r12 = android.graphics.Path.Direction.CW
            r5.addRoundRect(r6, r7, r8, r9, r10, r11, r12)
        L9a:
            r14.clipPath(r0)
            super.dispatchDraw(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d.dispatchDraw(android.graphics.Canvas):void");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f30 getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: setCornerRadius */
    public final void m56019xba0484c9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f30 f30Var) {
        this.cornerRadius = f30Var;
    }

    /* renamed from: setRadius */
    public final void m56020x205ac394(float f17) {
        if (f17 < 0.0f || f17 > 0.5f) {
            return;
        }
        this.f187702e = f17;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13821x319c273d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f187702e = 0.5f;
        this.f187703f = new android.graphics.Path();
        a(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13821x319c273d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f187702e = 0.5f;
        this.f187703f = new android.graphics.Path();
        a(context, attributeSet, i17);
    }
}
