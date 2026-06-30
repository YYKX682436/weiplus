package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class xe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q1 f253039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f253040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 f253041f;

    public xe(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 activityC18016xf3330816, r45.q1 q1Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        this.f253041f = activityC18016xf3330816;
        this.f253039d = q1Var;
        this.f253040e = c19807x593d1720;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsBrowseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.q1 q1Var = this.f253039d;
        if (q1Var.f465089m == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3");
            return;
        }
        java.lang.String Ai = ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ai(q1Var.f465089m.f461587d, false);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f253040e;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70336x13b21a82(c19807x593d1720.f39014x86965dde.f451370e)) {
            i17 = 2;
        } else {
            int i18 = c19807x593d1720.f39014x86965dde.f451370e;
            i17 = i18 == 3 ? 5 : i18 == 15 ? 4 : 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 activityC18016xf3330816 = this.f253041f;
        if (za4.z0.z(c19807x593d1720, activityC18016xf3330816, 11, false)) {
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 activityC18016xf33308162 = this.f253041f;
            r45.m1 m1Var = q1Var.f465089m;
            ((com.p314xaae8f345.mm.app.o7) wi6).Ni(activityC18016xf33308162, m1Var.f461587d, Ai, c19807x593d1720.f39018xf3f56116, i17, 18, 9, m1Var.f461588e, 0L, c19807x593d1720.Id);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3");
            return;
        }
        int i19 = q1Var.f465083d;
        if (i19 == 4) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", q1Var.f465084e);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, activityC18016xf3330816);
            o25.s1 wi7 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 activityC18016xf33308163 = this.f253041f;
            r45.m1 m1Var2 = q1Var.f465089m;
            ((com.p314xaae8f345.mm.app.o7) wi7).Ni(activityC18016xf33308163, m1Var2.f461587d, Ai, c19807x593d1720.f39018xf3f56116, i17, 18, 1, m1Var2.f461588e, 0L, c19807x593d1720.Id);
        } else if (i19 != 5) {
            if (i19 == 6) {
                int b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h7.b(activityC18016xf3330816, q1Var);
                if (b17 == 1) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5570x77700c5a c5570x77700c5a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5570x77700c5a();
                    am.ke keVar = c5570x77700c5a.f135890g;
                    keVar.f88674b = activityC18016xf3330816;
                    keVar.f88673a = 2;
                    r45.m1 m1Var3 = q1Var.f465089m;
                    keVar.f88675c = m1Var3.f461587d;
                    keVar.f88676d = m1Var3.f461590g;
                    keVar.f88677e = m1Var3.f461589f;
                    keVar.f88678f = 3;
                    c5570x77700c5a.e();
                    o25.s1 wi8 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 activityC18016xf33308164 = this.f253041f;
                    r45.m1 m1Var4 = q1Var.f465089m;
                    ((com.p314xaae8f345.mm.app.o7) wi8).Ni(activityC18016xf33308164, m1Var4.f461587d, Ai, c19807x593d1720.f39018xf3f56116, i17, 18, 6, m1Var4.f461588e, 0L, c19807x593d1720.Id);
                } else if (b17 == 2) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5570x77700c5a c5570x77700c5a2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5570x77700c5a();
                    am.ke keVar2 = c5570x77700c5a2.f135890g;
                    keVar2.f88674b = activityC18016xf3330816;
                    keVar2.f88673a = 1;
                    r45.m1 m1Var5 = q1Var.f465089m;
                    keVar2.f88675c = m1Var5.f461587d;
                    keVar2.f88676d = m1Var5.f461590g;
                    keVar2.f88677e = m1Var5.f461589f;
                    keVar2.f88678f = 3;
                    c5570x77700c5a2.e();
                    o25.s1 wi9 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 activityC18016xf33308165 = this.f253041f;
                    r45.m1 m1Var6 = q1Var.f465089m;
                    ((com.p314xaae8f345.mm.app.o7) wi9).Ni(activityC18016xf33308165, m1Var6.f461587d, Ai, c19807x593d1720.f39018xf3f56116, i17, 18, 3, m1Var6.f461588e, 0L, c19807x593d1720.Id);
                }
            }
        } else if (q1Var.f465085f == 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5570x77700c5a c5570x77700c5a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5570x77700c5a();
            am.ke keVar3 = c5570x77700c5a3.f135890g;
            keVar3.f88673a = 2;
            keVar3.f88678f = 3;
            keVar3.f88675c = q1Var.f465089m.f461587d;
            keVar3.f88674b = activityC18016xf3330816;
            c5570x77700c5a3.e();
            o25.s1 wi10 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 activityC18016xf33308166 = this.f253041f;
            r45.m1 m1Var7 = q1Var.f465089m;
            ((com.p314xaae8f345.mm.app.o7) wi10).Ni(activityC18016xf33308166, m1Var7.f461587d, Ai, c19807x593d1720.f39018xf3f56116, i17, 18, 6, m1Var7.f461588e, 0L, c19807x593d1720.Id);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3");
    }
}
