package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class ow implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qw f251661a;

    public ow(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qw qwVar) {
        this.f251661a = qwVar;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContactCallBack", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qw qwVar = this.f251661a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw kwVar = qwVar.f251902d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = kwVar.f251188c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw kwVar2 = qwVar.f251902d;
        if (u3Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = kwVar2.f251188c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            u3Var2.dismiss();
        }
        if (z17) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.g.f(str, 3);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.wi().i(str);
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            intent.putExtra("Contact_User", str);
            intent.putExtra("Contact_Scene", 37);
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 != null && n17.k2()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, str + ",37");
                intent.putExtra("Contact_Scene", 37);
            }
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.b(kwVar2));
        } else {
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.b(kwVar2), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.b(kwVar2).getString(com.p314xaae8f345.mm.R.C30867xcad56011.fds, 3, -1), 0).show();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContactCallBack", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13$1");
    }
}
