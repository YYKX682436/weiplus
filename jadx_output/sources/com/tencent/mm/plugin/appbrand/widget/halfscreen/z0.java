package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class z0 implements com.tencent.mm.plugin.appbrand.widget.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f91265a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.f0 f91266b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View.OnAttachStateChangeListener f91267c;

    public z0(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.widget.f0 f0Var, kotlin.jvm.internal.i iVar) {
        this.f91265a = o6Var;
        this.f91266b = f0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void T(int i17) {
        this.f91266b.T(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.o.g(r4, r0)
            com.tencent.mm.plugin.appbrand.o6 r0 = r3.f91265a
            com.tencent.mm.plugin.appbrand.page.d5 r1 = r0.x0()
            r2 = 0
            if (r1 == 0) goto L24
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 r1 = r0.H2
            boolean r1 = r1.A()
            if (r1 == 0) goto L24
            com.tencent.mm.plugin.appbrand.widget.q r0 = r0.f74810s
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
            com.tencent.mm.plugin.appbrand.widget.f0 r0 = r3.f91266b
            boolean r4 = r0.U(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.z0.U(android.view.MotionEvent):boolean");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void V(int i17, int i18, int i19, int i27) {
        this.f91266b.V(i17, i18, i19, i27);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public boolean W(android.animation.Animator.AnimatorListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        return this.f91266b.W(listener);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void X(int i17, int i18) {
        this.f91266b.X(i17, i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void Y() {
        this.f91266b.Y();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void Z(com.tencent.mm.plugin.appbrand.widget.c0 type, android.animation.AnimatorListenerAdapter animatorListenerAdapter, boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.q qVar;
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f91265a;
        com.tencent.mm.plugin.appbrand.widget.q qVar2 = o6Var.f74810s;
        if (qVar2 != null ? qVar2.isAttachedToWindow() : false) {
            this.f91266b.Z(type, animatorListenerAdapter, z17);
            return;
        }
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.f91267c;
        if (onAttachStateChangeListener != null && (qVar = o6Var.f74810s) != null) {
            qVar.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.y0 y0Var = new com.tencent.mm.plugin.appbrand.widget.halfscreen.y0(this, type, animatorListenerAdapter, z17);
        this.f91267c = y0Var;
        com.tencent.mm.plugin.appbrand.widget.q qVar3 = o6Var.f74810s;
        if (qVar3 != null) {
            qVar3.addOnAttachStateChangeListener(y0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a0(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.o.g(r6, r0)
            com.tencent.mm.plugin.appbrand.o6 r0 = r5.f91265a
            com.tencent.mm.plugin.appbrand.page.d5 r1 = r0.x0()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L25
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 r1 = r0.H2
            boolean r1 = r1.A()
            if (r1 == 0) goto L25
            com.tencent.mm.plugin.appbrand.widget.q r1 = r0.f74810s
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
            int r4 = r1.getPageCount()
            if (r4 != r2) goto L62
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r0.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r4 = r4.L1
            boolean r4 = r4.c()
            if (r4 == 0) goto L59
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.L1
            boolean r0 = r0.f77364n
            if (r0 == 0) goto L59
            com.tencent.mm.plugin.appbrand.page.w2 r0 = r1.getCurrentPage()
            if (r0 == 0) goto L62
            r0.setEnableGesture(r3)
            goto L62
        L59:
            com.tencent.mm.plugin.appbrand.page.w2 r0 = r1.getCurrentPage()
            if (r0 == 0) goto L62
            r0.setEnableGesture(r2)
        L62:
            com.tencent.mm.plugin.appbrand.widget.f0 r0 = r5.f91266b
            boolean r6 = r0.a0(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.z0.a0(android.view.MotionEvent):boolean");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void b0(com.tencent.mm.plugin.appbrand.widget.e0 e0Var) {
        this.f91266b.b0(e0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void c0(boolean z17) {
        this.f91266b.c0(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void d0(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29) {
        if (this.f91265a.u0().L1.c()) {
            this.f91266b.d0(z17, z18, z19, z27, z28, z29);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public com.tencent.mm.plugin.appbrand.widget.o0 getCurrentStatus() {
        return this.f91266b.getCurrentStatus();
    }
}
