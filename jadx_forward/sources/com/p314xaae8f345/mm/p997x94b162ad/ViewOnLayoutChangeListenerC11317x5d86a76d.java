package com.p314xaae8f345.mm.p997x94b162ad;

/* renamed from: com.tencent.mm.particles.ConfettiView */
/* loaded from: classes11.dex */
public class ViewOnLayoutChangeListenerC11317x5d86a76d extends android.view.View implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f153896d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f153897e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f153898f;

    /* renamed from: g, reason: collision with root package name */
    public f51.b f153899g;

    public ViewOnLayoutChangeListenerC11317x5d86a76d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static com.p314xaae8f345.mm.p997x94b162ad.ViewOnLayoutChangeListenerC11317x5d86a76d a(android.content.Context context) {
        com.p314xaae8f345.mm.p997x94b162ad.ViewOnLayoutChangeListenerC11317x5d86a76d viewOnLayoutChangeListenerC11317x5d86a76d = new com.p314xaae8f345.mm.p997x94b162ad.ViewOnLayoutChangeListenerC11317x5d86a76d(context, null);
        viewOnLayoutChangeListenerC11317x5d86a76d.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        viewOnLayoutChangeListenerC11317x5d86a76d.setElevation(context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561787sn));
        return viewOnLayoutChangeListenerC11317x5d86a76d;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
        viewGroup.removeOnLayoutChangeListener(this);
        viewGroup.addOnLayoutChangeListener(this);
        if (this.f153896d != null || this.f153897e) {
            return;
        }
        this.f153897e = true;
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestLayout();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f153897e) {
            return;
        }
        canvas.save();
        for (f51.b bVar : this.f153896d) {
            if (bVar.D) {
                bVar.d(canvas, bVar.F + bVar.H, bVar.G + bVar.I, bVar.f341155z, bVar.f341152w);
            } else if (bVar.B && !bVar.C) {
                bVar.d(canvas, bVar.f341153x, bVar.f341154y, bVar.f341155z, bVar.f341152w);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.view.ViewParent parent;
        if (this.f153897e && (parent = getParent()) != null && (parent instanceof android.view.ViewGroup)) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p997x94b162ad.ViewOnLayoutChangeListenerC11317x5d86a76d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setTouchEnabled */
    public void m48584xd5adfc84(boolean z17) {
        this.f153898f = z17;
    }
}
