package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fe0 f167509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f167510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f167511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167512g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f167513h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.n f167514i;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.n nVar, r45.fe0 fe0Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f167514i = nVar;
        this.f167509d = fe0Var;
        this.f167510e = context;
        this.f167511f = n7Var;
        this.f167512g = str;
        this.f167513h = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.util.LinkedList linkedList = this.f167509d.f455784e;
        if (linkedList != null && !linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.o06 o06Var = (r45.o06) it.next();
                if (i18 == menuItem.getItemId()) {
                    boolean z17 = o06Var.f463334e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.n nVar = this.f167514i;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f167511f;
                    if (z17) {
                        if (o06Var.f463333d == 2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_DeveloperService", "do copy url:%s", n7Var.X1());
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.n.f167518b;
                            eVar.f167480a = this.f167512g;
                            eVar.f167481b = n7Var.X1();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.vf.f165052a.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d1.f162265e, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, eVar);
                            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t0(false).x(n7Var.mo50260x9f1221c2(), n7Var.U1());
                        } else {
                            r45.t06 t06Var = o06Var.f463336g;
                            if (t06Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t06Var.f467583d)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MenuDelegate_DeveloperService", "wxa_item or appId invalid!!");
                                nVar.d(n7Var, "" + o06Var.f463338i, 2);
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                                c12559xbdae8559.f169323f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.r.f33391x366c91de;
                                c12559xbdae8559.f169324g = "" + o06Var.f463333d + ":" + i18;
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o06Var.f463336g.f467584e)) {
                                    str = "";
                                } else {
                                    str = o06Var.f463336g.f467584e + "&target_path=" + android.net.Uri.encode(n7Var.X1());
                                }
                                r45.t06 t06Var2 = o06Var.f463336g;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_DeveloperService", "appId:%s, versionType:%d, path:%s", t06Var2.f467583d, java.lang.Integer.valueOf(t06Var2.f467585f), str);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
                                android.content.Context context = this.f167510e;
                                r45.t06 t06Var3 = o06Var.f463336g;
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).aj(context, "", t06Var3.f467583d, t06Var3.f467585f, -1, str, c12559xbdae8559);
                            }
                        }
                        nVar.d(n7Var, "" + o06Var.f463338i, 1);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MenuDelegate_DeveloperService", "has_auth is false");
                        android.content.Context context2 = this.f167510e;
                        dp.a.m125854x26a183b(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572175n42), 1).show();
                        nVar.d(n7Var, "" + o06Var.f463338i, 1);
                    }
                } else {
                    i18++;
                }
            }
        }
        this.f167513h.u();
    }
}
