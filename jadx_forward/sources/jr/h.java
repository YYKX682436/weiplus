package jr;

/* loaded from: classes4.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jr.i f382831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6947xa1fa1ae2 f382832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382833c;

    public h(jr.i iVar, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6947xa1fa1ae2 c6947xa1fa1ae2, java.lang.String str) {
        this.f382831a = iVar;
        this.f382832b = c6947xa1fa1ae2;
        this.f382833c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.hl5 hl5Var = (r45.hl5) fVar.f152151d;
        this.f382831a.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkUpdate: cgi result: ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(i18);
        sb6.append(", ");
        sb6.append((hl5Var == null || (linkedList = hl5Var.f457800d) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSuggestMatchWord", sb6.toString());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6947xa1fa1ae2 c6947xa1fa1ae2 = this.f382832b;
        c6947xa1fa1ae2.f142528f = currentTimeMillis;
        c6947xa1fa1ae2.f142530h = i18;
        if (i17 == 0 && i18 == 0) {
            c6947xa1fa1ae2.f142529g = 1L;
            z85.n nVar = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().f276711p;
            jr.e eVar = new jr.e();
            eVar.f69114x225aa2b6 = this.f382833c;
            eVar.f69115xa783a79b = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            eVar.f69113xad49e234 = hl5Var.mo14344x5f01b1f6();
            nVar.z0(eVar);
            java.util.LinkedList<r45.yk5> linkedList2 = hl5Var.f457800d;
            if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_remote_prefetch, 0);
                boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSuggestMatchWord", "checkPrefetch: config: " + Ni + ", isWifi: " + m40093xb9aa8b5f);
                if (((Ni == 1 && m40093xb9aa8b5f) || Ni == 2) && linkedList2 != null) {
                    for (r45.yk5 yk5Var : linkedList2) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                        n22.m.a(yk5Var.f472713d, c21053xdbf1e5f4);
                        c21053xdbf1e5f4.f68653x95b20dd4 = 65;
                        zq.h.f556505a.e(c21053xdbf1e5f4, null);
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1418L, 41, 1L);
        } else {
            c6947xa1fa1ae2.f142529g = 2L;
        }
        return java.lang.Boolean.valueOf(c6947xa1fa1ae2.k());
    }
}
