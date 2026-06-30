package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes3.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f171166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga f171168f;

    public ca(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga gaVar, int i17, java.lang.String str) {
        this.f171168f = gaVar;
        this.f171166d = i17;
        this.f171167e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga gaVar = this.f171168f;
        gaVar.getClass();
        android.util.SparseArray sparseArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.n.f168901b;
        int i17 = this.f171166d;
        java.lang.Integer num = (java.lang.Integer) sparseArray.get(i17);
        if (num == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandUIPerformancePanel", "insertPerformanceData no such performance type: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String string = gaVar.getContext().getString(num.intValue());
        android.util.SparseArray sparseArray2 = gaVar.f171273g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.fa faVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.fa) sparseArray2.get(i17);
        if (faVar == null) {
            faVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.fa(gaVar, gaVar.getContext());
            faVar.f171244d = string;
            faVar.a();
            int i18 = (i17 / 100) - 1;
            if (i18 >= 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandUIPerformancePanel", "insertPerformanceLabelView group index is invalid.");
                faVar = null;
            } else {
                if (i18 == 3) {
                    gaVar.addView(faVar);
                } else {
                    gaVar.addView(faVar, gaVar.indexOfChild(gaVar.f171271e[i18 + 1]));
                }
                sparseArray2.put(i17, faVar);
            }
        }
        if (faVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandUIPerformancePanel", "insertPerformanceData label view is null.");
        } else {
            faVar.f171245e = this.f171167e;
            faVar.a();
        }
    }
}
