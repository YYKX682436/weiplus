package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public final class a8 {
    public a8(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8 a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8 b8Var;
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("analyzeWsFoldData", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "[analyzeWsFoldData] content = " + str);
        if (str != null) {
            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
            try {
                b8Var = f07.size() == 6 ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8((java.lang.String) f07.get(0), java.lang.Long.parseLong((java.lang.String) f07.get(1)), java.lang.Long.parseLong((java.lang.String) f07.get(2)), java.lang.Integer.parseInt((java.lang.String) f07.get(3)), java.lang.Long.parseLong((java.lang.String) f07.get(4)), java.lang.Integer.parseInt((java.lang.String) f07.get(5))) : new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8((java.lang.String) f07.get(0), java.lang.Long.parseLong((java.lang.String) f07.get(1)), java.lang.Long.parseLong((java.lang.String) f07.get(2)), java.lang.Integer.parseInt((java.lang.String) f07.get(3)), -2L, -3);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createDefaultWsFoldData", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion");
                b8Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8("", -1L, -1L, 0, -2L, -3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createDefaultWsFoldData", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion");
            }
            f0Var = jz5.f0.f384359a;
        } else {
            b8Var = null;
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createDefaultWsFoldData", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion");
            b8Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8("", -1L, -1L, 0, -2L, -3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createDefaultWsFoldData", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b8Var, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.model.WsFoldData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("analyzeWsFoldData", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion");
        return b8Var;
    }
}
