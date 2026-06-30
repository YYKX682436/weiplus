package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RankUI */
/* loaded from: classes15.dex */
public class ActivityC13347x6ea2a2d7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0 {
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 I = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.b();

    /* renamed from: J, reason: collision with root package name */
    public boolean f179793J = true;

    public static void t7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13347x6ea2a2d7 activityC13347x6ea2a2d7) {
        r45.zj0 zj0Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 c6419xd51df726 = activityC13347x6ea2a2d7.I;
        try {
            int firstVisiblePosition = activityC13347x6ea2a2d7.f179181i.getFirstVisiblePosition();
            int lastVisiblePosition = activityC13347x6ea2a2d7.f179181i.getLastVisiblePosition();
            if (lastVisiblePosition - firstVisiblePosition <= 0) {
                return;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            while (firstVisiblePosition < lastVisiblePosition) {
                j12.i item = activityC13347x6ea2a2d7.f179182m.getItem(firstVisiblePosition);
                if (item != null && (zj0Var = item.f378700b) != null) {
                    linkedList.add(new j22.j(firstVisiblePosition + 1, zj0Var.f473678x, zj0Var, item.f378709k));
                }
                firstVisiblePosition++;
            }
            c6419xd51df726.f137605f = 1;
            j22.j.f378790e.a(c6419xd51df726, linkedList);
            c6419xd51df726.k();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiStoreV2RankUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public void W6(int i17, int i18, java.lang.String str, z12.t tVar) {
        super.W6(i17, i18, str, tVar);
        if (this.f179793J) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.m(this), 300L);
            this.f179793J = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int Y6() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int c7() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int d7() {
        return 105;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public void f7(j12.i iVar, int i17) {
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV2RankUI", "item is null.");
            return;
        }
        boolean g17 = this.f179182m.g(i17);
        if (iVar.f378699a == j12.h.cellset) {
            r45.kj0 kj0Var = iVar.f378702d;
            if (kj0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV2RankUI", "banner set is null. do nothing");
                return;
            } else {
                y12.m.a(mo55332x76847179(), kj0Var, false);
                return;
            }
        }
        r45.zj0 zj0Var = iVar.f378700b;
        if (zj0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV2RankUI", "summary is null. do nothing");
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i17 + 1);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 c6419xd51df726 = this.I;
        c6419xd51df726.p(valueOf);
        c6419xd51df726.u(zj0Var.f473661d);
        c6419xd51df726.q(zj0Var.f473678x);
        c6419xd51df726.f137605f = 3;
        c6419xd51df726.r(java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(zj0Var.D)));
        c6419xd51df726.t(java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(zj0Var.D)));
        c6419xd51df726.s(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(zj0Var.D));
        c6419xd51df726.k();
        y12.m.c(mo55332x76847179(), zj0Var, false, 5, iVar.f378704f, iVar.f378703e, getIntent().getStringExtra("to_talker_name"), 105, this.I, g17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572642bz0);
        this.f179181i.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.l(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public boolean j7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public j12.b l7() {
        return new i12.m(mo55332x76847179());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13278x5c32d846, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12740, 4, "", "", "", 2, 5);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 c6419xd51df726 = this.I;
        c6419xd51df726.f137604e = 3;
        c6419xd51df726.f137609j = 2L;
        this.f179195z.f179099k = c6419xd51df726;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.gd5 gd5Var = new r45.gd5();
        gd5Var.f456674f = currentTimeMillis;
        c6419xd51df726.f137603d = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV2RankUI", "initeData: %s", java.lang.Long.valueOf(currentTimeMillis));
        try {
            this.f179190u = gd5Var.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiStoreV2RankUI", e17, "", new java.lang.Object[0]);
        }
    }
}
