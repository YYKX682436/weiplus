package zd;

/* loaded from: classes7.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77569x366c91de = 395;

    /* renamed from: NAME */
    public static final java.lang.String f77570x24728b = "setDeviceOrientation";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, final int i17) {
        android.app.Activity activity;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (jSONObject == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        try {
            xi1.p mo51612x60543150 = e9Var.mo50261xee5260a9().mo51612x60543150();
            if (mo51612x60543150 == null) {
                throw new java.lang.NullPointerException();
            }
            xi1.o d17 = xi1.o.d(jSONObject.optString("value", null));
            if (d17 == null) {
                e9Var.a(i17, o("fail:invalid data"));
                return;
            }
            if (e9Var.t3() == null || e9Var.t3().r0() == null) {
                e9Var.a(i17, o("fail"));
                return;
            }
            ni1.e eVar = (ni1.e) e9Var.V0().B1(ni1.e.class);
            if (eVar == null) {
                e9Var.a(i17, o("fail: extension not found"));
                return;
            }
            eVar.f(jSONObject.optString("value", null));
            xi1.g mo50261xee5260a9 = e9Var.mo50261xee5260a9();
            if (mo50261xee5260a9 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) {
                activity = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) mo50261xee5260a9).w();
            } else {
                if (mo50261xee5260a9 instanceof xi1.q) {
                    xi1.g gVar = ((xi1.q) mo50261xee5260a9).f536246d;
                    if (gVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) {
                        activity = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) gVar).w();
                    }
                }
                activity = null;
            }
            if (activity == null) {
                mo51612x60543150.b(d17, new xi1.n() { // from class: zd.d$$a
                    @Override // xi1.n
                    public final void e(xi1.o oVar, boolean z17) {
                        zd.d dVar = zd.d.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = e9Var;
                        int i18 = i17;
                        if (z17) {
                            e9Var2.a(i18, dVar.o("ok"));
                        } else {
                            e9Var2.a(i18, dVar.o("fail"));
                        }
                    }
                });
                return;
            }
            android.view.View decorView = activity.getWindow() != null ? activity.getWindow().getDecorView() : null;
            if (decorView == null || !decorView.getViewTreeObserver().isAlive()) {
                e9Var.a(i17, o("fail: no decorView"));
                return;
            }
            final boolean[] zArr = {false};
            final zd.e eVar2 = new zd.e(this, e9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a(e9Var), zArr, i17, decorView);
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(eVar2);
            final android.view.View view = decorView;
            mo51612x60543150.b(d17, new xi1.n() { // from class: zd.d$$b
                @Override // xi1.n
                public final void e(xi1.o oVar, boolean z17) {
                    final zd.d dVar = zd.d.this;
                    final android.view.View view2 = view;
                    final android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = eVar2;
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = e9Var;
                    final int i18 = i17;
                    final boolean[] zArr2 = zArr;
                    dVar.getClass();
                    if (!z17) {
                        view2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                        e9Var2.a(i18, dVar.o("fail: requestDeviceOrientation fail"));
                        return;
                    }
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: zd.d$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            zd.d dVar2 = zd.d.this;
                            dVar2.getClass();
                            if (zArr2[0]) {
                                return;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetDeviceOrientation", "setDeviceOrientation layout timeout");
                            e9Var2.a(i18, dVar2.o("ok"));
                            view2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                            dVar2.C();
                        }
                    };
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(runnable, 500L, false);
                }
            });
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiSetDeviceOrientation", e17, "require WindowOrientationHandler NPE", new java.lang.Object[0]);
            e9Var.a(i17, o("fail:internal error"));
        }
    }

    public void C() {
    }
}
