package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18226x595adb9d f250442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f250443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f250444f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 f250445g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f250446h;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18226x595adb9d c18226x595adb9d, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662, android.view.View view) {
        this.f250442d = c18226x595adb9d;
        this.f250443e = f0Var;
        this.f250444f = f0Var2;
        this.f250445g = c18037xf8026662;
        this.f250446h = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView$runnable$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18226x595adb9d c18226x595adb9d = this.f250442d;
        if (c18226x595adb9d.m158354x19263085().isDestroyed() || c18226x595adb9d.m158354x19263085().isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView$runnable$1");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scrollRecyclerViewToInputView index:");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f250443e;
        sb6.append(f0Var.f391649d);
        sb6.append(" lastFooterBottom:");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = this.f250444f;
        sb6.append(f0Var2.f391649d);
        sb6.append(" currBottom:");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = this.f250445g;
        sb6.append(c18037xf8026662.m70716x71ad16f3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.InputUIC", sb6.toString());
        if (f0Var2.f391649d != c18037xf8026662.m70716x71ad16f3()) {
            int i17 = f0Var.f391649d;
            f0Var.f391649d = i17 - 1;
            if (i17 > 0) {
                f0Var2.f391649d = c18037xf8026662.m70716x71ad16f3();
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(this, 10L);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView$runnable$1");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18226x595adb9d c18226x595adb9d2 = this.f250442d;
        android.view.View view = this.f250446h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf80266622 = this.f250445g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        int W6 = c18226x595adb9d2.W6(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18226x595adb9d.Y6(c18226x595adb9d2, view, c18037xf80266622, W6, 0, 8, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView$runnable$1");
    }
}
