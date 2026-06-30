package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class ka implements jr.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f271988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra f271989e;

    public ka(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        this.f271989e = raVar;
        this.f271985a = str;
        this.f271986b = str2;
        this.f271987c = str3;
        this.f271988d = j17;
    }

    @Override // jr.n
    public void a(java.util.List list, jr.q qVar) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar = this.f271989e;
        raVar.f272159q = currentTimeMillis;
        raVar.f272154l.clear();
        raVar.f272154l.addAll(list);
        raVar.f272157o.f142536i = raVar.f272154l.size();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6948x597c7cb1 c6948x597c7cb1 = raVar.f272157o;
        c6948x597c7cb1.f142540m = c6948x597c7cb1.b("WordVersion", java.lang.String.valueOf(qVar.f382851a), true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6948x597c7cb1 c6948x597c7cb12 = raVar.f272157o;
        c6948x597c7cb12.f142541n = qVar.f382852b;
        c6948x597c7cb12.f142542o = qVar.f382853c;
        c6948x597c7cb12.f142543p = c6948x597c7cb12.b("RecSessionId", qVar.f382854d, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6948x597c7cb1 c6948x597c7cb13 = raVar.f272157o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        c6948x597c7cb13.f142545r = c6948x597c7cb13.b("md5Type", kz5.n0.g0(list, "#", null, null, 0, null, n22.a.f415814d, 30, null), true);
        if (list.isEmpty()) {
            raVar.f272168z.mo50303x856b99f0(20003);
            raVar.f272168z.mo50305x3d8a09a2(20001);
            return;
        }
        raVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        raVar.f272163u = hashMap;
        hashMap.put("bubble_sessionid", this.f271985a);
        raVar.f272163u.put("chatid", this.f271986b);
        raVar.f272163u.put("word", this.f271987c);
        raVar.f272163u.put("bubble_scene", java.lang.Integer.valueOf(raVar.f272166x.f271803d));
        raVar.f272163u.put("Iscache", 1);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_show_delay, 250);
        long j17 = this.f271988d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SuggestEmoticonBubble", "onResult: delay show %s, %s", java.lang.Long.valueOf(currentTimeMillis2 - j17), java.lang.Integer.valueOf(Ni));
        long j18 = Ni;
        if (currentTimeMillis2 - j17 <= j18) {
            raVar.f272168z.mo50307xb9e94560(20003, j18 - (currentTimeMillis2 - j17));
        } else {
            raVar.f272168z.mo50305x3d8a09a2(20003);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1418L, 23, 1L);
        }
    }
}
