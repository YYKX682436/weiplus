package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.g0 f289665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f289668g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f289669h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dy1.r f289670i;

    public f0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.g0 g0Var, java.lang.String str, int i17, int i18, long j17, dy1.r rVar) {
        this.f289665d = g0Var;
        this.f289666e = str;
        this.f289667f = i17;
        this.f289668g = i18;
        this.f289669h = j17;
        this.f289670i = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.g0 g0Var = this.f289665d;
        g0Var.getClass();
        java.lang.String str = this.f289666e;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str) || c01.e2.E(str)) {
            i17 = 4;
        } else {
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                    i17 = 2;
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.O4(str)) {
                    i17 = 1;
                }
            }
            i17 = 3;
        }
        boolean contains = g0Var.f289673b.contains(str);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v3 a17 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3.f289747g.a(null);
        jz5.l lVar = new jz5.l("unread_num", java.lang.Integer.valueOf(this.f289667f));
        jz5.l lVar2 = new jz5.l("unread_group_event_ms", java.lang.Long.valueOf(g0Var.f289672a));
        jz5.l lVar3 = new jz5.l("chat_type", java.lang.Integer.valueOf(i17));
        int i18 = this.f289668g;
        ((cy1.a) this.f289670i).Cj("view_unread_chat_slide", null, kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("slide_action", java.lang.Integer.valueOf(i18)), new jz5.l("chat_username", str), new jz5.l("latest_msg_ts", java.lang.Long.valueOf(this.f289669h)), new jz5.l("in_unread_group", java.lang.Integer.valueOf(contains ? 1 : 0)), new jz5.l("log_version", 20260429L), new jz5.l("in24h_unread_msg_cnt", java.lang.Integer.valueOf(a17.f289718c)), new jz5.l("out24h_unread_msg_cnt", java.lang.Integer.valueOf(a17.f289719d))), 35186);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnreadModeReporter", "reportSlideChat, username=" + str + ", chatType=" + i17 + ", slideAction=" + i18 + ", inUnreadGroup=" + (contains ? 1 : 0));
    }
}
