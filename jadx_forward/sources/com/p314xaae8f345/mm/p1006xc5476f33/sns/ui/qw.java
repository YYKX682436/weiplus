package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class qw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw f251902d;

    public qw(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw kwVar) {
        this.f251902d = kwVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.cw) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.cw cwVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.cw) view.getTag();
            cwVar.getClass();
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw kwVar = this.f251902d;
            if (K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimeLineClickEvent", "show source profile fail, username is null");
                dp.a.m125854x26a183b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.b(kwVar), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.b(kwVar).getString(com.p314xaae8f345.mm.R.C30867xcad56011.fds, 3, -1), 0).show();
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13");
                return;
            }
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            cwVar.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(null, true);
            if (n17 != null && n17.d1().equals(null)) {
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(268435456);
                intent.putExtra("Contact_User", (java.lang.String) null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, ((java.lang.String) null) + ",37");
                intent.putExtra("Contact_Scene", 37);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.b(kwVar));
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13");
                return;
            }
            ((c01.k7) c01.n8.a()).b(null, 3, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ow(this));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.b(kwVar), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.b(kwVar).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.b(kwVar).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pw(this, cwVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$502", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            kwVar.f251188c = Q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$502", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13");
    }
}
