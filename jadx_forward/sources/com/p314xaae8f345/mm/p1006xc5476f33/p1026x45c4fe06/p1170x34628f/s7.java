package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class s7 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f168615d;

    public s7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        this.f168615d = n7Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f168615d;
        n7Var.T1 = false;
        android.app.Activity v17 = n7Var.v1();
        if (v17 != null && v17.getWindow() != null) {
            if ((n7Var.W1 & 1024) != 1024) {
                v17.getWindow().clearFlags(1024);
            }
            n7Var.getClass();
            android.view.View decorView = v17.getWindow().getDecorView();
            int i17 = n7Var.V1;
            if (i17 >= 0) {
                decorView.setSystemUiVisibility(i17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12804x8a4e09f0 abstractC12804x8a4e09f0 = n7Var.S1;
        int i18 = n7Var.U1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12801xf64f5416 c12801xf64f5416 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12801xf64f5416) abstractC12804x8a4e09f0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "close appId:%s, reason:%d", c12801xf64f5416.f173431u, java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(c12801xf64f5416.f173431u, c12801xf64f5416.f173432v, 64, c12801xf64f5416.f173430t, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.e1.a(c12801xf64f5416.f173431u, c12801xf64f5416.f173430t, 7, "" + (java.lang.System.currentTimeMillis() - c12801xf64f5416.f173433w), "" + i18, "");
    }
}
