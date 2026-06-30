package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class l3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final float f206145d;

    /* renamed from: e, reason: collision with root package name */
    public float f206146e;

    /* renamed from: f, reason: collision with root package name */
    public float f206147f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f206148g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f206149h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 f206150i;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var) {
        this.f206150i = s4Var;
        this.f206145d = ym5.x.a(s4Var.f206281b, -138.0f);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.d3, p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, android.view.MotionEvent e17) {
        android.view.View k07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f206150i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = s4Var.f206292m;
        if (c1163xf1deaba4 == null || (k07 = c1163xf1deaba4.k0(this.f206146e, this.f206147f)) == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = s4Var.f206292m;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c1163xf1deaba42 != null ? c1163xf1deaba42.w0(k07) : null;
        if (w07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3) {
            int actionMasked = e17.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f206148g && this.f206149h) {
                        e(e17.getX() - this.f206146e, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3) w07);
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    return;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3 n3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3) w07;
            float min = java.lang.Math.min(e17.getX() - this.f206146e, 0.0f);
            float f17 = this.f206145d;
            float max = java.lang.Math.max(min, f17);
            if (!(max < f17 / ((float) 2))) {
                f17 = 0.0f;
            }
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(max, f17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat, "ofFloat(...)");
            ofFloat.setDuration(400L);
            ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.j3(this, n3Var));
            ofFloat.start();
            this.f206146e = 0.0f;
            this.f206147f = 0.0f;
            this.f206148g = false;
            this.f206149h = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r3 != 3) goto L19;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r3, android.view.MotionEvent r4) {
        /*
            r2 = this;
            java.lang.String r0 = "rv"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r3 = "e"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r3)
            int r3 = r4.getActionMasked()
            if (r3 == 0) goto L4c
            r0 = 1
            if (r3 == r0) goto L41
            r1 = 2
            if (r3 == r1) goto L1a
            r4 = 3
            if (r3 == r4) goto L41
            goto L58
        L1a:
            boolean r3 = r2.f206148g
            if (r3 != 0) goto L58
            r2.f206148g = r0
            float r3 = r4.getX()
            float r1 = r2.f206146e
            float r3 = r3 - r1
            float r3 = java.lang.Math.abs(r3)
            float r4 = r4.getY()
            float r1 = r2.f206147f
            float r4 = r4 - r1
            float r4 = java.lang.Math.abs(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L3d
            r2.f206149h = r0
            goto L58
        L3d:
            r2.d()
            goto L58
        L41:
            r3 = 0
            r2.f206146e = r3
            r2.f206147f = r3
            r3 = 0
            r2.f206148g = r3
            r2.f206149h = r3
            goto L58
        L4c:
            float r3 = r4.getX()
            r2.f206146e = r3
            float r3 = r4.getY()
            r2.f206147f = r3
        L58:
            boolean r3 = r2.f206149h
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.l3.b(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    public final void d() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f206150i.f206292m;
        if (c1163xf1deaba4 != null) {
            int childCount = c1163xf1deaba4.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c1163xf1deaba4.w0(c1163xf1deaba4.getChildAt(i17));
                if (w07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3) {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3) w07).f206165g.getTranslationX(), 0.0f);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat, "ofFloat(...)");
                    ofFloat.setDuration(400L);
                    ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.k3(this, w07));
                    ofFloat.start();
                }
            }
        }
    }

    public final void e(float f17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3 n3Var) {
        n3Var.f206165g.setTranslationX(java.lang.Math.max(java.lang.Math.min(f17, 0.0f), this.f206145d));
    }
}
