package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/AppBrandOpenMaterialUI;", "Lcom/tencent/mm/pluginsdk/ui/AutoLoginActivity;", "<init>", "()V", "ui-appchooser_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppBrandOpenMaterialUI */
/* loaded from: classes8.dex */
public final class ActivityC19723x98d12b8b extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409 {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19723x98d12b8b.X6(com.tencent.mm.pluginsdk.ui.p, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    public final boolean a7(java.lang.String str) {
        boolean z17;
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FLOAT_BALL_FILES_QB_VERIFY_STRING_SYNC, null);
        java.lang.String str2 = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialUI", "verifyCaller, originVerifyKeys is empty");
            return false;
        }
        java.util.List f07 = r26.n0.f0(str2, new java.lang.String[]{","}, false, 0, 6, null);
        if (!f07.isEmpty()) {
            java.util.Iterator it = f07.iterator();
            while (it.hasNext()) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0((java.lang.String) it.next(), str)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialUI", "verifyCaller, verify fail, verifyKey: " + str + ", originVerifyKeys: " + str2);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initActivityCloseAnimation */
    public void mo50392x5138328b() {
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initActivityOpenAnimation */
    public void mo51655xf502a5b(android.content.Intent intent) {
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.bk.k0(getWindow());
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
    }
}
