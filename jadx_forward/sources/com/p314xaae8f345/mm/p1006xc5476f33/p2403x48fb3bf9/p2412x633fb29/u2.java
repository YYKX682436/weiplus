package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public final class u2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 f264661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f264662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jv5 f264663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.h1 f264664g;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var, int i17, r45.jv5 jv5Var, fl1.h1 h1Var) {
        this.f264661d = y2Var;
        this.f264662e = i17;
        this.f264663f = jv5Var;
        this.f264664g = h1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var = this.f264661d;
        java.util.ArrayList arrayList = new java.util.ArrayList(y2Var.f264731f);
        int i18 = this.f264662e;
        arrayList.remove(i18);
        if (((fl1.h1) y2Var.f264731f.get(i18)).f345319h == y2Var.f264734i) {
            ((fl1.h1) arrayList.get(0)).f345317f = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var2 = this.f264661d;
        y2Var2.a(this.f264663f, y2Var2.f264728c, arrayList, y2Var2.f264732g, y2Var2.f264733h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[[OauthDialog.showDialog] try delete avatarIdx = " + i18);
        r45.qb0 qb0Var = new r45.qb0();
        qb0Var.f465329d = this.f264664g.f345319h;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = qb0Var;
        lVar.f152198b = new r45.rb0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/oauth_delavatar";
        lVar.f152200d = 2700;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t2(y2Var, arrayList, this.f264663f));
    }
}
