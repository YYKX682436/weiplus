package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f283871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f283872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f283874g;

    public m1(boolean z17, long j17, java.lang.String str, int i17) {
        this.f283871d = z17;
        this.f283872e = j17;
        this.f283873f = str;
        this.f283874g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f283871d;
        java.lang.String str = z17 ? "chat_history_search_show_tab_result" : "chat_history_search_tab_result_exit";
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("search_chat_sessionid", de5.a.f310930b);
        lVarArr[1] = new jz5.l("clk_search_sessionid", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        lVarArr[2] = new jz5.l(z17 ? "show_result_duration" : "click_exit_duration", java.lang.Long.valueOf(this.f283872e));
        lVarArr[3] = new jz5.l("clk_search_tab", 7);
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u();
        java.lang.String str2 = this.f283873f;
        lVarArr[4] = new jz5.l("chat_msg_cnt", java.lang.Integer.valueOf(g9Var.j7(str2)));
        lVarArr[5] = new jz5.l("chat_name", str2);
        lVarArr[6] = new jz5.l("search_result_cnt", java.lang.Integer.valueOf(this.f283874g));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, kz5.c1.k(lVarArr), 38014);
    }
}
