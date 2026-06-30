package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes7.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 implements if1.i {

    /* renamed from: CTRL_INDEX */
    private static final int f34075x366c91de = 677;

    /* renamed from: NAME */
    public static final java.lang.String f34076x24728b = "onImageViewLoad";

    /* renamed from: i, reason: collision with root package name */
    public final c01.l2 f162214i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f162215m;

    public f(int i17, c01.l2 l2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        s("viewId", java.lang.Integer.valueOf(i17));
        this.f162214i = l2Var;
        this.f162215m = tVar;
    }

    public void u(android.graphics.BitmapFactory.Options options) {
        if (options != null) {
            s("errMsg", "ok");
            s("size", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.e(this, options));
        } else {
            s("errMsg", "fail");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f162215m;
        c01.l2 l2Var = this.f162214i;
        if (l2Var == null || !"webview".equals(l2Var.f("sendTo", null))) {
            tVar.i(this, null);
        } else {
            tVar.p(this);
        }
    }
}
