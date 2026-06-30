package com.tencent.mm.particles;

/* loaded from: classes11.dex */
public class ConfettiView extends android.view.View implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f72363d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f72364e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f72365f;

    /* renamed from: g, reason: collision with root package name */
    public f51.b f72366g;

    public ConfettiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static com.tencent.mm.particles.ConfettiView a(android.content.Context context) {
        com.tencent.mm.particles.ConfettiView confettiView = new com.tencent.mm.particles.ConfettiView(context, null);
        confettiView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        confettiView.setElevation(context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480254sn));
        return confettiView;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
        viewGroup.removeOnLayoutChangeListener(this);
        viewGroup.addOnLayoutChangeListener(this);
        if (this.f72363d != null || this.f72364e) {
            return;
        }
        this.f72364e = true;
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestLayout();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f72364e) {
            return;
        }
        canvas.save();
        for (f51.b bVar : this.f72363d) {
            if (bVar.D) {
                bVar.d(canvas, bVar.F + bVar.H, bVar.G + bVar.I, bVar.f259622z, bVar.f259619w);
            } else if (bVar.B && !bVar.C) {
                bVar.d(canvas, bVar.f259620x, bVar.f259621y, bVar.f259622z, bVar.f259619w);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.view.ViewParent parent;
        if (this.f72364e && (parent = getParent()) != null && (parent instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            viewGroup.removeViewInLayout(this);
            viewGroup.removeOnLayoutChangeListener(this);
            viewGroup.invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        if (r0 != 3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:0: B:26:0x007e->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.particles.ConfettiView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setTouchEnabled(boolean z17) {
        this.f72365f = z17;
    }
}
