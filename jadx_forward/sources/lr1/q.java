package lr1;

/* loaded from: classes9.dex */
public class q implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f402231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f402232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr1.s f402233c;

    public q(lr1.s sVar, java.util.List list, java.util.List list2) {
        this.f402233c = sVar;
        this.f402231a = list;
        this.f402232b = list2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        this.f402233c.getClass();
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
        gm0.j1.i();
        android.database.Cursor f17 = gm0.j1.u().f354686f.f("select bizinfo.brandIconURL, bizinfo.type, bizinfo.status, rcontact.username, rcontact.conRemark, rcontact.nickname, rcontact.alias, rcontact.conRemarkPYFull, rcontact.conRemarkPYShort, rcontact.showHead, rcontact.pyInitial, rcontact.quanPin, rcontact.quanPin from rcontact, bizinfo where bizinfo.username = rcontact.username and (rcontact.verifyFlag & 8) != 0  and (rcontact.type & 1) != 0  order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc", null, 2);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List list = this.f402231a;
        java.util.List list2 = this.f402232b;
        if (f17 != null) {
            while (f17.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(f17);
                qk.o oVar = new qk.o();
                oVar.mo9015xbf5d97fd(f17);
                if (!z3Var.d1().equals("gh_43f2581f6fd6") && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.U4(z3Var.d1())) {
                    if (1 != ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minishop_plugin_enabled, 1) || !z3Var.d1().equals("gh_579db1f2cf89")) {
                        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.r4(z3Var.d1())) {
                            r45.co coVar = new r45.co();
                            java.lang.String d17 = z3Var.d1();
                            coVar.f453209d = d17;
                            coVar.f453210e = z3Var;
                            coVar.f453211f = oVar;
                            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(d17)) {
                                hashMap.put(coVar.f453209d, coVar);
                                int i17 = coVar.f453211f.f66746x2262335f;
                                if (i17 != 3) {
                                    if (i17 == 2) {
                                        list.add(coVar);
                                    } else if (i17 == 1 || i17 == 0) {
                                        list2.add(coVar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            f17.close();
        }
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
        gm0.j1.i();
        android.database.Cursor B = gm0.j1.u().f354686f.B("select username from rcontact where (verifyFlag & 8) != 0  and (type & 1) != 0 ", null);
        if (B != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (B.moveToNext()) {
                java.lang.String string = B.getString(0);
                if (!hashMap.containsKey(string)) {
                    arrayList.add(string);
                }
            }
            B.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceMgr", "need update list size is %d, {%s}", java.lang.Integer.valueOf(arrayList.size()), arrayList);
            if (!arrayList.isEmpty()) {
                gm0.j1.i();
                long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c01.n8.a().c((java.lang.String) it.next(), 5);
                }
                gm0.j1.i();
                gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
            }
        }
        java.lang.System.currentTimeMillis();
        list2.size();
        list.size();
        java.lang.System.currentTimeMillis();
        return null;
    }
}
