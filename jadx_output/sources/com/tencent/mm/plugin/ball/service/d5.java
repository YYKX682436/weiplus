package com.tencent.mm.plugin.ball.service;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class d5 implements com.tencent.mm.ipcinvoker.j {
    private d5() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, final com.tencent.mm.ipcinvoker.r rVar) {
        final com.tencent.mm.plugin.ball.service.PageFloatBallHelper$ExitPageAnimationInfo pageFloatBallHelper$ExitPageAnimationInfo = (com.tencent.mm.plugin.ball.service.PageFloatBallHelper$ExitPageAnimationInfo) obj;
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.ball.service.d5$$a
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.ball.service.d5 d5Var = com.tencent.mm.plugin.ball.service.d5.this;
                d5Var.getClass();
                pv.y yVar = new pv.y();
                pv.d0 d0Var = (pv.d0) i95.n0.c(pv.d0.class);
                com.tencent.mm.plugin.ball.service.PageFloatBallHelper$ExitPageAnimationInfo pageFloatBallHelper$ExitPageAnimationInfo2 = pageFloatBallHelper$ExitPageAnimationInfo;
                android.graphics.Bitmap bitmap = pageFloatBallHelper$ExitPageAnimationInfo2.f93119f;
                ov.i0 i0Var = (ov.i0) d0Var;
                i0Var.getClass();
                com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
                com.tencent.mm.plugin.ball.view.FloatBallMaskAnimationView floatBallMaskAnimationView = nVar != null ? nVar.f93321f : null;
                i0Var.f349084d = floatBallMaskAnimationView;
                if (floatBallMaskAnimationView != null) {
                    floatBallMaskAnimationView.setMaskBitmap(bitmap);
                }
                java.lang.Object obj2 = i0Var.f349084d;
                if (obj2 instanceof android.view.View) {
                    yVar.f358507d = (android.view.View) obj2;
                }
                android.graphics.Point point = new android.graphics.Point(qp1.c0.f365697f, qp1.c0.f365698g);
                android.graphics.Point D = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().D(1, pageFloatBallHelper$ExitPageAnimationInfo2.f93117d, pageFloatBallHelper$ExitPageAnimationInfo2.f93118e, point);
                yVar.f358512i = true;
                yVar.f358509f = D;
                yVar.f358508e = point;
                yVar.f358513j = 200L;
                android.view.View view = yVar.f358507d;
                com.tencent.mm.ipcinvoker.r rVar2 = rVar;
                if (view == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.PageFloatBallHelper", "ExitPageAnimationTask invoke, contentView is null");
                    if (rVar2 != null) {
                        rVar2.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
                        return;
                    }
                    return;
                }
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).getClass();
                ep1.k kVar = new ep1.k();
                android.view.View view2 = yVar.f358507d;
                boolean f17 = kVar.f(yVar, null, new com.tencent.mm.plugin.ball.service.e5(d5Var, view2));
                if (f17 && (view2 instanceof pv.f0)) {
                    ((com.tencent.mm.plugin.ball.view.FloatBallMaskAnimationView) ((pv.f0) view2)).b();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "ExitPageAnimationTask.doExitPageAnimation ret %s", java.lang.Boolean.valueOf(f17));
                if (rVar2 != null) {
                    rVar2.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(f17));
                }
            }
        });
    }
}
