package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18241x1be913ba f250511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f250512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f250513f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 f250514g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f250515h;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18241x1be913ba c18241x1be913ba, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662, android.view.View view) {
        this.f250511d = c18241x1be913ba;
        this.f250512e = f0Var;
        this.f250513f = f0Var2;
        this.f250514g = c18037xf8026662;
        this.f250515h = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$scrollRecyclerViewToInputView$runnable$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18241x1be913ba c18241x1be913ba = this.f250511d;
        if (c18241x1be913ba.m158354x19263085().isDestroyed() || c18241x1be913ba.m158354x19263085().isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$scrollRecyclerViewToInputView$runnable$1");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scrollRecyclerViewToInputView index:");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f250512e;
        sb6.append(f0Var.f391649d);
        sb6.append(" lastFooterBottom:");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = this.f250513f;
        sb6.append(f0Var2.f391649d);
        sb6.append(" currBottom:");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = this.f250514g;
        sb6.append(c18037xf8026662.m70716x71ad16f3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WS.InputUIC", sb6.toString());
        if (f0Var2.f391649d != c18037xf8026662.m70716x71ad16f3()) {
            int i17 = f0Var.f391649d;
            f0Var.f391649d = i17 - 1;
            if (i17 > 0) {
                f0Var2.f391649d = c18037xf8026662.m70716x71ad16f3();
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(this, 10L);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$scrollRecyclerViewToInputView$runnable$1");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        int Y6 = c18241x1be913ba.Y6(this.f250515h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollToViewBottom$default", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        c18241x1be913ba.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        int[] iArr = new int[2];
        c18037xf8026662.getLocationInWindow(iArr);
        int i18 = Y6 - iArr[1];
        if (i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        } else {
            c18241x1be913ba.X6().scrollBy(0, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollToViewBottom$default", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$scrollRecyclerViewToInputView$runnable$1");
    }
}
