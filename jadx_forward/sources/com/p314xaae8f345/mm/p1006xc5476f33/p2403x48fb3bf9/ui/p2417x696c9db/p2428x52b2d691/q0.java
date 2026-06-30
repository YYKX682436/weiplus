package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.h1 f267978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f267980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.v70 f267981g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.h1 h1Var, nw4.k kVar, android.app.Activity activity, bw5.v70 v70Var) {
        super(0);
        this.f267978d = h1Var;
        this.f267979e = kVar;
        this.f267980f = activity;
        this.f267981g = v70Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String Z;
        bw5.ar0 ar0Var = bw5.ar0.TingScene_MpAudio;
        jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        if (Zi != null) {
            ((jm4.k4) Zi).d(bw5.yq0.TingReportAction_AddToListenLaterList, ar0Var, this.f267978d.f267313a, null, null);
        }
        nw4.k kVar = this.f267979e;
        zg0.q2 a17 = kVar.a();
        java.lang.String str2 = "";
        if (a17 == null || (str = a17.i()) == null) {
            str = "";
        }
        zg0.q2 a18 = kVar.a();
        if (a18 != null && (Z = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a18).Z()) != null) {
            str2 = Z;
        }
        if (!(str2.length() == 0)) {
            str = str2;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "tyt_listen_later");
        hashMap.put("currscene", 1101);
        hashMap.put("which_button", 22);
        hashMap.put("actionbizinfo", rk4.j5.f(str));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, hashMap, 5, false);
        i95.m c17 = i95.n0.c(qk.a8.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.app.Activity activity = this.f267980f;
        bw5.v70 listenItem = this.f267981g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(listenItem, "$listenItem");
        qk.a8.E8((qk.a8) c17, activity, ar0Var, listenItem, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p0(), 0, 0, null, null, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de, null);
        return jz5.f0.f384359a;
    }
}
