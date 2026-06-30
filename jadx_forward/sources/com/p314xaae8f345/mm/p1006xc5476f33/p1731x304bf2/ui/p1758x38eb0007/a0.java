package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes4.dex */
public class a0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.b0 f223044d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.b0 b0Var) {
        this.f223044d = b0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        p33.b0 b0Var = (p33.b0) oVar.f152244b.f152233a;
        if (b0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InteractiveMsgMRecycleView", "cgi 返回错误");
            return 0;
        }
        p33.a0 a0Var = b0Var.f433054d;
        if (a0Var != null && (str2 = a0Var.f433052e) != null && !"".equals(str2)) {
            db5.t7.g(this.f223044d.f223058e.f223026f2, b0Var.f433054d.f433052e);
        }
        return 0;
    }
}
