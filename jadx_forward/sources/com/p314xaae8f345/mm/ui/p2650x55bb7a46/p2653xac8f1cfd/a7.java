package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f280140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f280142f;

    public a7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f7Var, int i17, java.lang.String str, int i18) {
        this.f280140d = i17;
        this.f280141e = str;
        this.f280142f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f280141e;
        int i17 = this.f280140d;
        int wi6 = i17 == 2 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) : 0;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(str);
        int d17 = p17 == null ? 0 : p17.d1();
        com.p314xaae8f345.mm.p642xad8b531f.h3 h3Var = com.p314xaae8f345.mm.p642xad8b531f.h3.f144912q;
        if (h3Var.f144923k == null) {
            h3Var.f144923k = c01.z1.r();
        }
        if (h3Var.f144923k.equals(str)) {
            return;
        }
        com.p314xaae8f345.mm.p642xad8b531f.g3 g3Var = h3Var.f144917e;
        if (g3Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StayTimeReport", "enterChattingUI, not close:%s", g3Var.f144897a);
            h3Var.a(h3Var.f144917e.f144897a);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var = h3Var.f144913a;
        if (j3Var.c(6, 0) == 0) {
            j3Var.h(4, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        }
        h3Var.f144914b.mo48813x58998cd();
        h3Var.f144915c.mo48813x58998cd();
        h3Var.f144916d.m43071x58998cd();
        com.p314xaae8f345.mm.p642xad8b531f.g3 g3Var2 = new com.p314xaae8f345.mm.p642xad8b531f.g3(h3Var);
        h3Var.f144917e = g3Var2;
        g3Var2.f144905i = h3Var.f144918f;
        h3Var.f144918f = 0;
        g3Var2.f144897a = str;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        h3Var.f144921i = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p642xad8b531f.g3 g3Var3 = h3Var.f144917e;
        g3Var3.f144898b = i17;
        int i18 = this.f280142f;
        g3Var3.f144900d = i18;
        g3Var3.f144901e = d17;
        g3Var3.f144902f = wi6;
        g3Var3.f144903g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StayTimeReport", "enter chattingUI: chatUser:%s----type:%d, notifyOpen:%d, unreadCount:%d, membercount:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(wi6));
    }
}
