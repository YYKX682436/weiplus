package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f171732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 f171733e;

    public s4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var, int i17) {
        this.f171733e = w4Var;
        this.f171732d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDataTransferState  state=");
        int i17 = this.f171732d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameUILoadingSplash", sb6.toString());
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var = this.f171733e;
            if (!w4Var.L) {
                w4Var.M = this;
            } else {
                w4Var.K.setVisibility(0);
                w4Var.K.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a0d);
            }
        }
    }
}
