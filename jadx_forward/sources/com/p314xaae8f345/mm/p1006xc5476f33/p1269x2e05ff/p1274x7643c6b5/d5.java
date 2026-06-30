package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class d5 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private d5() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, final com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12898x7fe1649b c12898x7fe1649b = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12898x7fe1649b) obj;
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.ball.service.d5$$a
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d5 d5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d5.this;
                d5Var.getClass();
                pv.y yVar = new pv.y();
                pv.d0 d0Var = (pv.d0) i95.n0.c(pv.d0.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12898x7fe1649b c12898x7fe1649b2 = c12898x7fe1649b;
                android.graphics.Bitmap bitmap = c12898x7fe1649b2.f174652f;
                ov.i0 i0Var = (ov.i0) d0Var;
                i0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12926x7a5e63a2 c12926x7a5e63a2 = nVar != null ? nVar.f174854f : null;
                i0Var.f430617d = c12926x7a5e63a2;
                if (c12926x7a5e63a2 != null) {
                    c12926x7a5e63a2.mo54156x8a98093d(bitmap);
                }
                java.lang.Object obj2 = i0Var.f430617d;
                if (obj2 instanceof android.view.View) {
                    yVar.f440040d = (android.view.View) obj2;
                }
                android.graphics.Point point = new android.graphics.Point(qp1.c0.f447230f, qp1.c0.f447231g);
                android.graphics.Point D = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().D(1, c12898x7fe1649b2.f174650d, c12898x7fe1649b2.f174651e, point);
                yVar.f440045i = true;
                yVar.f440042f = D;
                yVar.f440041e = point;
                yVar.f440046j = 200L;
                android.view.View view = yVar.f440040d;
                com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar2 = rVar;
                if (view == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PageFloatBallHelper", "ExitPageAnimationTask invoke, contentView is null");
                    if (rVar2 != null) {
                        rVar2.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false));
                        return;
                    }
                    return;
                }
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).getClass();
                ep1.k kVar = new ep1.k();
                android.view.View view2 = yVar.f440040d;
                boolean f17 = kVar.f(yVar, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.e5(d5Var, view2));
                if (f17 && (view2 instanceof pv.f0)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12926x7a5e63a2) ((pv.f0) view2)).b();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "ExitPageAnimationTask.doExitPageAnimation ret %s", java.lang.Boolean.valueOf(f17));
                if (rVar2 != null) {
                    rVar2.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(f17));
                }
            }
        });
    }
}
