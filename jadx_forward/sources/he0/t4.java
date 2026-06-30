package he0;

/* loaded from: classes11.dex */
public class t4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public t4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf c5720xee9b9abf = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        if (gm0.j1.a()) {
            if (c5720xee9b9abf instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf) {
                int i17 = c5720xee9b9abf.f136042g.f88303a;
                am.hk hkVar = c5720xee9b9abf.f136043h;
                if (i17 == -6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
                    am.gk gkVar = c5720xee9b9abf.f136042g;
                    java.lang.String str = gkVar.f88304b.f98896y;
                    boolean equals = c01.z1.r().equals(gkVar.f88304b.f98896y);
                    Fj.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserMusicTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    android.database.Cursor f17 = Fj.f247527d.f("select *,rowid from SnsInfo " + Fj.J0(str, equals) + " AND (type = 4 OR type = 42 OR type = 47)", null, 2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (f17.moveToNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                        c17933xe8d1b226.mo9015xbf5d97fd(f17);
                        arrayList.add(c17933xe8d1b226);
                    }
                    f17.close();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserMusicTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    hkVar.f88372c = new java.util.ArrayList();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it.next();
                        t90.e eVar = (t90.e) i95.n0.c(t90.e.class);
                        java.lang.String Bi = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bi();
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b2262.m70371x485d7();
                        ((s90.e) eVar).getClass();
                        ((java.util.ArrayList) hkVar.f88372c).add(b21.u.c(Bi, m70371x485d7, 8, null));
                    }
                } else if (i17 == -5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
                    Fj2.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAllMusicTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    android.database.Cursor f18 = Fj2.f247527d.f("select *,rowid from SnsInfo where (type = 4 ORtype = 42 ORtype = 47) AND  (sourceType & 2 != 0 ) " + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247515o, null, 2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (f18.moveToNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                        c17933xe8d1b2263.mo9015xbf5d97fd(f18);
                        arrayList2.add(c17933xe8d1b2263);
                    }
                    f18.close();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAllMusicTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    hkVar.f88372c = new java.util.ArrayList();
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2264 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it6.next();
                        java.util.List list = hkVar.f88372c;
                        t90.e eVar2 = (t90.e) i95.n0.c(t90.e.class);
                        java.lang.String Bi2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bi();
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d72 = c17933xe8d1b2264.m70371x485d7();
                        ((s90.e) eVar2).getClass();
                        ((java.util.ArrayList) list).add(b21.u.c(Bi2, m70371x485d72, 1, null));
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicActionListener", "MusicActionEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        return false;
    }
}
