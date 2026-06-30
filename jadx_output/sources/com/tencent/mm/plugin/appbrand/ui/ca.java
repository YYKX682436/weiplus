package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes3.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.ga f89635f;

    public ca(com.tencent.mm.plugin.appbrand.ui.ga gaVar, int i17, java.lang.String str) {
        this.f89635f = gaVar;
        this.f89633d = i17;
        this.f89634e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.ga gaVar = this.f89635f;
        gaVar.getClass();
        android.util.SparseArray sparseArray = com.tencent.mm.plugin.appbrand.performance.n.f87368b;
        int i17 = this.f89633d;
        java.lang.Integer num = (java.lang.Integer) sparseArray.get(i17);
        if (num == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUIPerformancePanel", "insertPerformanceData no such performance type: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String string = gaVar.getContext().getString(num.intValue());
        android.util.SparseArray sparseArray2 = gaVar.f89740g;
        com.tencent.mm.plugin.appbrand.ui.fa faVar = (com.tencent.mm.plugin.appbrand.ui.fa) sparseArray2.get(i17);
        if (faVar == null) {
            faVar = new com.tencent.mm.plugin.appbrand.ui.fa(gaVar, gaVar.getContext());
            faVar.f89711d = string;
            faVar.a();
            int i18 = (i17 / 100) - 1;
            if (i18 >= 4) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUIPerformancePanel", "insertPerformanceLabelView group index is invalid.");
                faVar = null;
            } else {
                if (i18 == 3) {
                    gaVar.addView(faVar);
                } else {
                    gaVar.addView(faVar, gaVar.indexOfChild(gaVar.f89738e[i18 + 1]));
                }
                sparseArray2.put(i17, faVar);
            }
        }
        if (faVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUIPerformancePanel", "insertPerformanceData label view is null.");
        } else {
            faVar.f89712e = this.f89634e;
            faVar.a();
        }
    }
}
