package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class d30 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i30 f193759d;

    public d30(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i30 i30Var) {
        this.f193759d = i30Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        mm2.y0 y0Var = (mm2.y0) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i30 i30Var = this.f193759d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i30Var.f194436q, "user send gift, dimiss, scene = " + y0Var.f411082b);
        int ordinal = y0Var.f411081a.ordinal();
        if (ordinal == 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c30(i30Var));
            return;
        }
        if ((ordinal == 1 || ordinal == 2) && i30Var.w0() == 0) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            android.view.View v17 = i30Var.v1();
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l(i30Var.A, 1);
            ce2.i iVar = i30Var.f194443x;
            if (iVar == null || (str = iVar.f67814x2c488eb6) == null) {
                str = "";
            }
            lVarArr[1] = new jz5.l(i30Var.f194444y, str);
            java.lang.Object text = ((android.widget.TextView) ((jz5.n) i30Var.f194437r).mo141623x754a37bb()).getText();
            lVarArr[2] = new jz5.l(i30Var.f194445z, text != null ? text : "");
            ((cy1.a) rVar).Cj("view_clk", v17, kz5.c1.k(lVarArr), 25561);
        }
    }
}
