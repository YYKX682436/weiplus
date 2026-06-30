package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class s0 implements dp1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 f174887a;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 u0Var) {
        this.f174887a = u0Var;
    }

    @Override // dp1.v
    public void a(android.view.MotionEvent motionEvent) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 u0Var = this.f174887a;
        boolean z18 = u0Var.f174898h;
        if (u0Var.f174899i) {
            u0Var.f174898h = qp1.a0.a(u0Var.f174893c, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        } else {
            u0Var.f174898h = false;
        }
        if (!u0Var.f174899i || (z17 = u0Var.f174898h) == z18) {
            return;
        }
        if (z17) {
            android.widget.FrameLayout.LayoutParams layoutParams = u0Var.f174896f;
            layoutParams.bottomMargin = u0Var.f174895e;
            layoutParams.rightMargin = u0Var.f174894d;
            u0Var.f174893c.setLayoutParams(layoutParams);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatIndicatorController", "onDispatchTouchEvent layoutParams, right:%s, bottom:%s", java.lang.Integer.valueOf(u0Var.f174896f.rightMargin), java.lang.Integer.valueOf(u0Var.f174896f.bottomMargin));
            u0Var.f174902l = motionEvent.getRawX();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12930x168b4c78 c12930x168b4c78 = u0Var.f174893c;
        if (!u0Var.f174898h) {
            if (c12930x168b4c78.f175106h.isRunning()) {
                c12930x168b4c78.f175106h.cancel();
            }
            if (c12930x168b4c78.f175105g.isRunning()) {
                return;
            }
            c12930x168b4c78.f175105g.start();
            return;
        }
        android.os.Vibrator vibrator = c12930x168b4c78.f175104f;
        if (vibrator != null) {
            if (c12930x168b4c78.f175108m) {
                vibrator.vibrate(new long[]{0, 10, 100, 10}, -1);
            } else {
                vibrator.vibrate(10L);
            }
        }
        if (c12930x168b4c78.f175105g.isRunning()) {
            c12930x168b4c78.f175105g.cancel();
        }
        if (c12930x168b4c78.f175106h.isRunning()) {
            return;
        }
        c12930x168b4c78.f175106h.start();
    }

    @Override // dp1.v
    public void c(int i17, int i18) {
    }

    @Override // dp1.v
    public boolean d(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // dp1.v
    public int e() {
        return 0;
    }

    @Override // dp1.v
    /* renamed from: enableSwipeBack */
    public boolean mo54081xd71108fe() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    @Override // dp1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(float r10) {
        /*
            r9 = this;
            java.lang.Float r0 = java.lang.Float.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.FloatIndicatorController"
            java.lang.String r2 = "onPositionChange, scrollPercent:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            com.tencent.mm.plugin.ball.ui.u0 r0 = r9.f174887a
            boolean r1 = r0.f174900j
            if (r1 == 0) goto L16
            return
        L16:
            long r1 = r0.f174901k
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L26
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r1 = java.lang.System.currentTimeMillis()
            r0.f174901k = r1
        L26:
            boolean r1 = r0.f174898h
            r2 = 1
            r3 = 0
            r4 = 1036831949(0x3dcccccd, float:0.1)
            if (r1 != 0) goto L3a
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 < 0) goto L4b
            r1 = 1063675494(0x3f666666, float:0.9)
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 >= 0) goto L4b
        L3a:
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f174901k
            long r5 = r5 - r7
            r7 = 200(0xc8, double:9.9E-322)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L4b
            r1 = r2
            goto L4c
        L4b:
            r1 = r3
        L4c:
            if (r1 == 0) goto Lab
            boolean r1 = r0.f174899i
            if (r1 != 0) goto L55
            r0.d()
        L55:
            boolean r1 = r0.f174898h
            if (r1 != 0) goto L9c
            float r10 = r10 - r4
            r1 = 1050253722(0x3e99999a, float:0.3)
            float r10 = r10 / r1
            r1 = 0
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 >= 0) goto L64
            r10 = r1
        L64:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 <= 0) goto L6b
            r10 = r1
        L6b:
            int r1 = qp1.c0.f447242r
            float r4 = (float) r1
            float r10 = r10 * r4
            int r10 = (int) r10
            boolean r4 = r0.f174897g
            if (r4 == 0) goto L81
            int r4 = -r1
            int r4 = r4 + r10
            r0.f174895e = r4
            int r4 = r0.a()
            int r4 = r4 - r1
            int r4 = r4 + r10
            r0.f174894d = r4
            goto L8d
        L81:
            int r4 = -r1
            int r4 = r4 + r10
            r0.f174894d = r4
            int r4 = r0.a()
            int r4 = r4 - r1
            int r4 = r4 + r10
            r0.f174895e = r4
        L8d:
            android.widget.FrameLayout$LayoutParams r10 = r0.f174896f
            int r1 = r0.f174895e
            r10.bottomMargin = r1
            int r1 = r0.f174894d
            r10.rightMargin = r1
            com.tencent.mm.plugin.ball.view.FloatIndicatorView r1 = r0.f174893c
            r1.setLayoutParams(r10)
        L9c:
            boolean r10 = r0.f174899i
            if (r10 == 0) goto La1
            goto Lae
        La1:
            com.tencent.mm.plugin.ball.view.FloatIndicatorView r10 = r0.f174893c
            if (r10 == 0) goto Lae
            r10.setVisibility(r3)
            r0.f174899i = r2
            goto Lae
        Lab:
            r0.b()
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.s0.f(float):void");
    }

    @Override // dp1.v
    public boolean g() {
        return false;
    }

    @Override // dp1.v
    public int h(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 u0Var = this.f174887a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatIndicatorController", "onSwipeReleased, willSwipeBack:%s, isIndicatorHit:%s", valueOf, java.lang.Boolean.valueOf(u0Var.f174898h));
        u0Var.f174901k = -1L;
        u0Var.f174900j = z17;
        if (!z17) {
            u0Var.b();
            u0Var.f174898h = false;
            return 1;
        }
        if (!u0Var.f174898h) {
            return 1;
        }
        u0Var.b();
        u0Var.f174898h = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatIndicatorController", "onSwipeReleased, swipe to float ball");
        int a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.x4) u0Var.f174892b).a(u0Var.f174902l);
        if (a17 != 2) {
            return a17;
        }
        u0Var.f174900j = false;
        return 2;
    }
}
