package n34;

/* loaded from: classes4.dex */
public class x2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public x2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5883x4f505eb7 c5883x4f505eb7 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5883x4f505eb7) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecentlySnsMediaObjListener", "RecentlySnsMediaObjEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        } else if (c5883x4f505eb7 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5883x4f505eb7) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            am.zp zpVar = c5883x4f505eb7.f136191h;
            zpVar.f90128a = null;
            zpVar.f90129b = null;
            zpVar.f90130c = null;
            zpVar.f90131d = null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recently username ");
            am.yp ypVar = c5883x4f505eb7.f136190g;
            sb6.append(ypVar.f90006a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentlySnsMediaObjListener", sb6.toString());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ypVar.f90006a)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
            } else {
                gm0.j1.i();
                boolean equals = ypVar.f90006a.equals((java.lang.String) gm0.j1.u().c().l(2, null));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
                java.lang.String str = ypVar.f90006a;
                Fj.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserNewerInfo", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                android.database.Cursor B = Fj.f247527d.B(("select *,rowid from SnsInfo " + Fj.J0(str, equals)) + " AND type in ( 1 , 54 , 15)" + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247515o + " limit 4", null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserNewerInfo", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                if (B == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                } else {
                    boolean moveToFirst = B.moveToFirst();
                    am.zp zpVar2 = c5883x4f505eb7.f136191h;
                    if (moveToFirst) {
                        int i17 = 0;
                        do {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                            c17933xe8d1b226.mo9015xbf5d97fd(B);
                            if (c17933xe8d1b226.m70373x5384133c() != 21) {
                                java.util.Iterator it = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h.iterator();
                                while (it.hasNext()) {
                                    r45.jj4 jj4Var = (r45.jj4) it.next();
                                    int i18 = jj4Var.f459389e;
                                    if (i18 != 2 && i18 != 6) {
                                    }
                                    i17++;
                                    linkedList.add(jj4Var);
                                    if (i17 >= 4) {
                                        break;
                                    }
                                }
                            }
                        } while (B.moveToNext());
                        B.close();
                        if (linkedList.size() > 0) {
                            zpVar2.f90128a = (r45.jj4) linkedList.get(0);
                        }
                        if (linkedList.size() > 1) {
                            zpVar2.f90129b = (r45.jj4) linkedList.get(1);
                        }
                        if (linkedList.size() > 2) {
                            zpVar2.f90130c = (r45.jj4) linkedList.get(2);
                        }
                        if (linkedList.size() > 3) {
                            zpVar2.f90131d = (r45.jj4) linkedList.get(3);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                        z17 = true;
                    } else {
                        B.close();
                        java.lang.String userName = ypVar.f90006a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarFeedList", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                        java.util.LinkedList linkedList2 = new java.util.LinkedList();
                        if (cc4.b.f122015a.a()) {
                            pb4.e eVar = pb4.e.f434729a;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getProfileNewerStarSnsInfoByLimit", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "getProfileNewerStarSnsInfoByLimit >> userName: " + userName + ", 4，" + pb4.e.f434730b);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            if (pb4.e.f434730b > 0) {
                                l75.k0 f17 = eVar.f();
                                p75.i0 i19 = dm.ab.f317249y.i();
                                i19.f434190d = dm.ab.B.j(userName);
                                i19.f434192f = kz5.b0.c(dm.ab.C.u());
                                i19.c(pb4.e.f434730b, 0);
                                java.util.List k17 = i19.a().k(f17, dm.ab.class);
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getStarSnsInfoByLimit >> ");
                                sb7.append(userName);
                                sb7.append(", 4, ");
                                java.util.ArrayList arrayList2 = (java.util.ArrayList) k17;
                                sb7.append(arrayList2.size());
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", sb7.toString());
                                java.util.Iterator it6 = arrayList2.iterator();
                                while (it6.hasNext()) {
                                    dm.ab abVar = (dm.ab) it6.next();
                                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70336x13b21a82(abVar.f65934x2262335f) || abVar.f65934x2262335f == 15) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 n17 = eVar.n(abVar);
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
                                        arrayList.add(n17);
                                    }
                                    if (arrayList.size() >= 4) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getProfileNewerStarSnsInfoByLimit", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
                                        break;
                                    }
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getProfileNewerStarSnsInfoByLimit", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentlySnsMediaObjListener", "getStarFeedList >> %d", java.lang.Integer.valueOf(arrayList.size()));
                            java.util.Iterator it7 = arrayList.iterator();
                            int i27 = 0;
                            while (it7.hasNext()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it7.next();
                                if (c17933xe8d1b2262.m70373x5384133c() != 21) {
                                    java.util.Iterator it8 = c17933xe8d1b2262.m70371x485d7().f39014x86965dde.f451373h.iterator();
                                    while (it8.hasNext()) {
                                        r45.jj4 jj4Var2 = (r45.jj4) it8.next();
                                        int i28 = jj4Var2.f459389e;
                                        if (i28 == 2 || i28 == 6) {
                                            i27++;
                                            linkedList2.add(jj4Var2);
                                            if (i27 >= 4) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (linkedList2.size() > 0) {
                                zpVar2.f90128a = (r45.jj4) linkedList2.get(0);
                            }
                            if (linkedList2.size() > 1) {
                                zpVar2.f90129b = (r45.jj4) linkedList2.get(1);
                            }
                            if (linkedList2.size() > 2) {
                                zpVar2.f90130c = (r45.jj4) linkedList2.get(2);
                            }
                            if (linkedList2.size() > 3) {
                                zpVar2.f90131d = (r45.jj4) linkedList2.get(3);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarFeedList", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                    }
                }
            }
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.RecentlySnsMediaObjListener", "mismatched event");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        return z17;
    }
}
