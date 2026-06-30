package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class s0 implements dp1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.u0 f93354a;

    public s0(com.tencent.mm.plugin.ball.ui.u0 u0Var) {
        this.f93354a = u0Var;
    }

    @Override // dp1.v
    public void a(android.view.MotionEvent motionEvent) {
        boolean z17;
        com.tencent.mm.plugin.ball.ui.u0 u0Var = this.f93354a;
        boolean z18 = u0Var.f93365h;
        if (u0Var.f93366i) {
            u0Var.f93365h = qp1.a0.a(u0Var.f93360c, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        } else {
            u0Var.f93365h = false;
        }
        if (!u0Var.f93366i || (z17 = u0Var.f93365h) == z18) {
            return;
        }
        if (z17) {
            android.widget.FrameLayout.LayoutParams layoutParams = u0Var.f93363f;
            layoutParams.bottomMargin = u0Var.f93362e;
            layoutParams.rightMargin = u0Var.f93361d;
            u0Var.f93360c.setLayoutParams(layoutParams);
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatIndicatorController", "onDispatchTouchEvent layoutParams, right:%s, bottom:%s", java.lang.Integer.valueOf(u0Var.f93363f.rightMargin), java.lang.Integer.valueOf(u0Var.f93363f.bottomMargin));
            u0Var.f93369l = motionEvent.getRawX();
        }
        com.tencent.mm.plugin.ball.view.FloatIndicatorView floatIndicatorView = u0Var.f93360c;
        if (!u0Var.f93365h) {
            if (floatIndicatorView.f93573h.isRunning()) {
                floatIndicatorView.f93573h.cancel();
            }
            if (floatIndicatorView.f93572g.isRunning()) {
                return;
            }
            floatIndicatorView.f93572g.start();
            return;
        }
        android.os.Vibrator vibrator = floatIndicatorView.f93571f;
        if (vibrator != null) {
            if (floatIndicatorView.f93575m) {
                vibrator.vibrate(new long[]{0, 10, 100, 10}, -1);
            } else {
                vibrator.vibrate(10L);
            }
        }
        if (floatIndicatorView.f93572g.isRunning()) {
            floatIndicatorView.f93572g.cancel();
        }
        if (floatIndicatorView.f93573h.isRunning()) {
            return;
        }
        floatIndicatorView.f93573h.start();
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
    public boolean enableSwipeBack() {
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
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            com.tencent.mm.plugin.ball.ui.u0 r0 = r9.f93354a
            boolean r1 = r0.f93367j
            if (r1 == 0) goto L16
            return
        L16:
            long r1 = r0.f93368k
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L26
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r1 = java.lang.System.currentTimeMillis()
            r0.f93368k = r1
        L26:
            boolean r1 = r0.f93365h
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
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f93368k
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
            boolean r1 = r0.f93366i
            if (r1 != 0) goto L55
            r0.d()
        L55:
            boolean r1 = r0.f93365h
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
            int r1 = qp1.c0.f365709r
            float r4 = (float) r1
            float r10 = r10 * r4
            int r10 = (int) r10
            boolean r4 = r0.f93364g
            if (r4 == 0) goto L81
            int r4 = -r1
            int r4 = r4 + r10
            r0.f93362e = r4
            int r4 = r0.a()
            int r4 = r4 - r1
            int r4 = r4 + r10
            r0.f93361d = r4
            goto L8d
        L81:
            int r4 = -r1
            int r4 = r4 + r10
            r0.f93361d = r4
            int r4 = r0.a()
            int r4 = r4 - r1
            int r4 = r4 + r10
            r0.f93362e = r4
        L8d:
            android.widget.FrameLayout$LayoutParams r10 = r0.f93363f
            int r1 = r0.f93362e
            r10.bottomMargin = r1
            int r1 = r0.f93361d
            r10.rightMargin = r1
            com.tencent.mm.plugin.ball.view.FloatIndicatorView r1 = r0.f93360c
            r1.setLayoutParams(r10)
        L9c:
            boolean r10 = r0.f93366i
            if (r10 == 0) goto La1
            goto Lae
        La1:
            com.tencent.mm.plugin.ball.view.FloatIndicatorView r10 = r0.f93360c
            if (r10 == 0) goto Lae
            r10.setVisibility(r3)
            r0.f93366i = r2
            goto Lae
        Lab:
            r0.b()
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.ui.s0.f(float):void");
    }

    @Override // dp1.v
    public boolean g() {
        return false;
    }

    @Override // dp1.v
    public int h(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.ball.ui.u0 u0Var = this.f93354a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatIndicatorController", "onSwipeReleased, willSwipeBack:%s, isIndicatorHit:%s", valueOf, java.lang.Boolean.valueOf(u0Var.f93365h));
        u0Var.f93368k = -1L;
        u0Var.f93367j = z17;
        if (!z17) {
            u0Var.b();
            u0Var.f93365h = false;
            return 1;
        }
        if (!u0Var.f93365h) {
            return 1;
        }
        u0Var.b();
        u0Var.f93365h = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatIndicatorController", "onSwipeReleased, swipe to float ball");
        int a17 = ((com.tencent.mm.plugin.ball.service.x4) u0Var.f93359b).a(u0Var.f93369l);
        if (a17 != 2) {
            return a17;
        }
        u0Var.f93367j = false;
        return 2;
    }
}
