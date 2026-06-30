package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

/* loaded from: classes7.dex */
public final class z0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f172798a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f172799b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View.OnAttachStateChangeListener f172800c;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f172798a = o6Var;
        this.f172799b = f0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void T(int i17) {
        this.f172799b.T(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "ev"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            com.tencent.mm.plugin.appbrand.o6 r0 = r3.f172798a
            com.tencent.mm.plugin.appbrand.page.d5 r1 = r0.x0()
            r2 = 0
            if (r1 == 0) goto L24
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 r1 = r0.H2
            boolean r1 = r1.A()
            if (r1 == 0) goto L24
            com.tencent.mm.plugin.appbrand.widget.q r0 = r0.f156343s
            if (r0 == 0) goto L1f
            boolean r0 = r0.isAttachedToWindow()
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = r2
        L25:
            if (r0 != 0) goto L28
            return r2
        L28:
            com.tencent.mm.plugin.appbrand.widget.f0 r0 = r3.f172799b
            boolean r4 = r0.U(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.z0.U(android.view.MotionEvent):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void V(int i17, int i18, int i19, int i27) {
        this.f172799b.V(i17, i18, i19, i27);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public boolean W(android.animation.Animator.AnimatorListener listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        return this.f172799b.W(listener);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void X(int i17, int i18) {
        this.f172799b.X(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void Y() {
        this.f172799b.Y();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void Z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0 type, android.animation.AnimatorListenerAdapter animatorListenerAdapter, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f172798a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar2 = o6Var.f156343s;
        if (qVar2 != null ? qVar2.isAttachedToWindow() : false) {
            this.f172799b.Z(type, animatorListenerAdapter, z17);
            return;
        }
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.f172800c;
        if (onAttachStateChangeListener != null && (qVar = o6Var.f156343s) != null) {
            qVar.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.y0(this, type, animatorListenerAdapter, z17);
        this.f172800c = y0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar3 = o6Var.f156343s;
        if (qVar3 != null) {
            qVar3.addOnAttachStateChangeListener(y0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a0(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ev"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            com.tencent.mm.plugin.appbrand.o6 r0 = r5.f172798a
            com.tencent.mm.plugin.appbrand.page.d5 r1 = r0.x0()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L25
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 r1 = r0.H2
            boolean r1 = r1.A()
            if (r1 == 0) goto L25
            com.tencent.mm.plugin.appbrand.widget.q r1 = r0.f156343s
            if (r1 == 0) goto L20
            boolean r1 = r1.isAttachedToWindow()
            goto L21
        L20:
            r1 = r3
        L21:
            if (r1 == 0) goto L25
            r1 = r2
            goto L26
        L25:
            r1 = r3
        L26:
            if (r1 != 0) goto L29
            return r3
        L29:
            com.tencent.mm.plugin.appbrand.page.d5 r1 = r0.x0()
            int r4 = r6.getAction()
            if (r4 != 0) goto L62
            int r4 = r1.m52173x328fb10a()
            if (r4 != r2) goto L62
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r0.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r4 = r4.L1
            boolean r4 = r4.c()
            if (r4 == 0) goto L59
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.L1
            boolean r0 = r0.f158897n
            if (r0 == 0) goto L59
            com.tencent.mm.plugin.appbrand.page.w2 r0 = r1.m52169xfdaa7672()
            if (r0 == 0) goto L62
            r0.m147199x8e764904(r3)
            goto L62
        L59:
            com.tencent.mm.plugin.appbrand.page.w2 r0 = r1.m52169xfdaa7672()
            if (r0 == 0) goto L62
            r0.m147199x8e764904(r2)
        L62:
            com.tencent.mm.plugin.appbrand.widget.f0 r0 = r5.f172799b
            boolean r6 = r0.a0(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.z0.a0(android.view.MotionEvent):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.e0 e0Var) {
        this.f172799b.b0(e0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void c0(boolean z17) {
        this.f172799b.c0(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void d0(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29) {
        if (this.f172798a.u0().L1.c()) {
            this.f172799b.d0(z17, z18, z19, z27, z28, z29);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    /* renamed from: getCurrentStatus */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.o0 mo53377x430e7715() {
        return this.f172799b.mo53377x430e7715();
    }
}
