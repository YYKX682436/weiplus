package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class c30 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i30 f193634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i30 i30Var) {
        super(0);
        this.f193634d = i30Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i30 i30Var = this.f193634d;
        if (i30Var.w0() == 0) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            android.view.View v17 = i30Var.v1();
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l(i30Var.A, 2);
            ce2.i iVar = i30Var.f194443x;
            if (iVar == null || (str = iVar.f67814x2c488eb6) == null) {
                str = "";
            }
            lVarArr[1] = new jz5.l(i30Var.f194444y, str);
            java.lang.Object text = ((android.widget.TextView) ((jz5.n) i30Var.f194437r).mo141623x754a37bb()).getText();
            lVarArr[2] = new jz5.l(i30Var.f194445z, text != null ? text : "");
            ((cy1.a) rVar).Cj("view_clk", v17, kz5.c1.k(lVarArr), 25561);
            i30Var.u1();
        }
        return jz5.f0.f384359a;
    }
}
