package he0;

/* loaded from: classes4.dex */
public class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2 f362289d;

    public m4(he0.n4 n4Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2 c5521xb353c3e2) {
        this.f362289d = c5521xb353c3e2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7;
        r45.a90 a90Var;
        r45.kv2 kv2Var;
        r45.kv2 kv2Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
        Fj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findoutHoldingFeed", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = Fj.f247527d.f("select *,rowid from SnsInfo  where " + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247520t, null, 2);
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
            c17933xe8d1b226.mo9015xbf5d97fd(f17);
            arrayList.add(c17933xe8d1b226);
        }
        f17.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findoutHoldingFeed", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it.next();
            if (c17933xe8d1b2262 != null && (m70371x485d7 = c17933xe8d1b2262.m70371x485d7()) != null && (a90Var = m70371x485d7.f39014x86965dde) != null && (kv2Var = a90Var.f451377o) != null) {
                long m75942xfb822ef2 = kv2Var.m75942xfb822ef2(9);
                am.vc vcVar = this.f362289d.f135849g;
                if (m75942xfb822ef2 == vcVar.f89721a) {
                    if (!vcVar.f89722b || (kv2Var2 = vcVar.f89723c) == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                        s0Var.u().f139357g = 1L;
                        s0Var.b();
                        s0Var.R = 0;
                        c17933xe8d1b2262.m70340xb2d65bfa();
                        c17933xe8d1b2262.m70447x2f60ddab();
                    } else {
                        m70371x485d7.f39014x86965dde.f451377o = kv2Var2;
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6585x76586362 u17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.u();
                        u17.f139355e = u17.b("Feedid", m70371x485d7.f39014x86965dde.f451377o.m75945x2fec8307(0), true);
                        c17933xe8d1b2262.m70466xfabce6e3(m70371x485d7);
                        c17933xe8d1b2262.m70340xb2d65bfa();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18941, "", 5, 1, "", m70371x485d7.f39014x86965dde.f451377o.m75945x2fec8307(0));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().V2(c17933xe8d1b2262);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener$1");
    }
}
