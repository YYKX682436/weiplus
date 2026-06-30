package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes7.dex */
public final class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f167429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f167430f;

    public f(java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        this.f167428d = str;
        this.f167429e = context;
        this.f167430f = n7Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f167430f;
        if (itemId == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondaryMenuDelegateAudits", "open Audits auto next time, finish");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = k91.d1.f387094a;
            k91.d1.f387094a.putBoolean(this.f167428d + "ENABLE_AUDITS_FLAG", true);
            android.content.Context context = this.f167429e;
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gmz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.e(context, string, n7Var));
            return;
        }
        if (itemId != 2) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondaryMenuDelegateAudits", "open Audits immediately");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = n7Var.mo32091x9a3f0ba2().C0();
        if (C0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EventOnGameAuditsStateChange", "service is null");
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("state", 0);
            od1.b bVar = new od1.b();
            bVar.t(hashMap);
            bVar.u(C0);
            bVar.m();
        }
        n7Var.mo32091x9a3f0ba2().t3();
    }
}
