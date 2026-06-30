package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class n6 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6 f251513a;

    public n6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6 i6Var) {
        this.f251513a = i6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9
    public void c(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProgress", "com.tencent.mm.plugin.sns.ui.NewSightWidget$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProgress", "com.tencent.mm.plugin.sns.ui.NewSightWidget$2");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9
    public void d(int i17, o55.a aVar, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ui.NewSightWidget$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSightWidget", "handleBackgroundVideo getRemuxVideoWork >> workType: %d, workTagId: %s", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6 i6Var = this.f251513a;
        if (!android.text.TextUtils.equals(str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6.o(i6Var)) || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewSightWidget", "handleBackgroundVideo getRemuxVideoWork >> workTagId is error, backgroundRemuxWorkId: %s, workTagId: %s", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6.o(i6Var), str);
        } else if (aVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6.q(i6Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewSightWidget", "handleBackgroundVideo getRemuxVideoWork >> isError: %s", str);
        } else if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSightWidget", "handleBackgroundVideo getRemuxVideoWork >> isSuccess workTagId: %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            i6Var.v();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        } else if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSightWidget", "handleBackgroundVideo getRemuxVideoWork >> isFailed workTagId: %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6.q(i6Var);
        } else if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSightWidget", "work is running");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            boolean z17 = i6Var.P;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            if (z17) {
                ((yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class))).Di(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6.o(i6Var), 9);
            } else {
                ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).Di(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i6.o(i6Var), 9);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ui.NewSightWidget$2");
    }
}
