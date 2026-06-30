package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.a2 f279891a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.a2();

    public final void a(yb5.d dVar, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var, java.lang.String str, java.lang.String str2, ot0.q qVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f c6254x6dec987f, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtilNew", "[doSetExclusiveHongBaoStyle] start");
        if (y0Var != null) {
            if ((a4Var != null ? a4Var.f284792c : null) != null) {
                if ((a4Var != null ? a4Var.f284793d : null) != null && dVar != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.z1(a4Var, y0Var, str, qVar, dVar, c6254x6dec987f, z17, null), 3, null);
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CAppMsgUtilNew", "[doSetExclusiveHongBaoStyle] downloadScope == null || c2cMsgHolder?.c2cTitleTv == null || c2cMsgHolder?.c2cDescTv == null|| ui == null");
    }

    public final boolean b(int i17, int i18, ot0.q qVar) {
        ot0.c cVar = qVar != null ? (ot0.c) qVar.y(ot0.c.class) : null;
        if (cVar == null) {
            return false;
        }
        if (i17 == 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f429954n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtilNew", "[isExclusiveHongBaoMsg] true: 1+n times");
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f429954n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtilNew", "[isExclusiveHongBaoMsg] false");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtilNew", "[isExclusiveHongBaoMsg] true: 1 times");
        return true;
    }

    public final void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var) {
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            e(a4Var, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f);
        } else {
            e(a4Var, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public final void d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var) {
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            e(a4Var, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f);
        } else {
            e(a4Var, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public final void e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var, float f17, float f18, float f19, float f27, float f28, float f29) {
        android.widget.TextView textView;
        android.widget.ImageView imageView = a4Var != null ? a4Var.f284791b : null;
        if (imageView != null) {
            imageView.setAlpha(f17);
        }
        android.widget.TextView textView2 = a4Var != null ? a4Var.f284793d : null;
        if (textView2 != null) {
            textView2.setAlpha(f18);
        }
        android.widget.TextView textView3 = a4Var != null ? a4Var.f284792c : null;
        if (textView3 != null) {
            textView3.setAlpha(f19);
        }
        android.widget.TextView textView4 = a4Var != null ? a4Var.f284794e : null;
        if (textView4 != null) {
            textView4.setAlpha(f27);
        }
        android.widget.TextView textView5 = a4Var != null ? a4Var.f284797h : null;
        if (textView5 != null) {
            textView5.setAlpha(f28);
        }
        android.widget.TextView textView6 = a4Var != null ? a4Var.f284795f : null;
        if (textView6 != null) {
            textView6.setAlpha(f29);
        }
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            android.widget.TextView textView7 = a4Var != null ? a4Var.f284794e : null;
            if (textView7 != null) {
                int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
                textView7.setTextColor(color);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            }
            android.widget.TextView textView8 = a4Var != null ? a4Var.f284797h : null;
            if (textView8 != null) {
                int color2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
                textView8.setTextColor(color2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            }
            textView = a4Var != null ? a4Var.f284795f : null;
            if (textView == null) {
                return;
            }
            int color3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            textView.setTextColor(color3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            return;
        }
        android.widget.TextView textView9 = a4Var != null ? a4Var.f284794e : null;
        if (textView9 != null) {
            int color4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            textView9.setTextColor(color4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        }
        android.widget.TextView textView10 = a4Var != null ? a4Var.f284797h : null;
        if (textView10 != null) {
            int color5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            textView10.setTextColor(color5);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        }
        textView = a4Var != null ? a4Var.f284795f : null;
        if (textView == null) {
            return;
        }
        int color6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        textView.setTextColor(color6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
    }

    public final void f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var) {
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            e(a4Var, 0.8f, 0.8f, 0.8f, 0.5f, 0.5f, 0.5f);
        } else {
            e(a4Var, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
}
