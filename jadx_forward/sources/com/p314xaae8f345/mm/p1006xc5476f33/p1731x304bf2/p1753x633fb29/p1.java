package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes4.dex */
public class p1 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f221936d = {l75.n0.m145250x3fdc6f77(dm.r5.f321165n, "GameMsgRelativeContent")};

    public p1(l75.k0 k0Var) {
        super(k0Var, dm.r5.f321165n, "GameMsgRelativeContent", null);
    }

    public dm.r5 y0(java.lang.String str) {
        dm.r5 r5Var = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980("select * from GameMsgRelativeContent where contentId = \"" + str + "\"", new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            return null;
        }
        if (m145256x1d3f4980.moveToFirst()) {
            r5Var = new dm.r5();
            r5Var.mo9015xbf5d97fd(m145256x1d3f4980);
        }
        m145256x1d3f4980.close();
        return r5Var;
    }
}
