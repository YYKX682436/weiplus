package eu1;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f338284b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f338285c;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f338286a;

    public f(android.content.Context context) {
        this.f338286a = context;
        f338285c = false;
    }

    public static boolean a(int i17) {
        java.util.ArrayList arrayList;
        java.lang.Integer num = (java.lang.Integer) xt1.t0.Di().a("key_share_card_show_type");
        if (num == null || num.intValue() == 0) {
            return false;
        }
        if (i17 != 0) {
            return (i17 != 10 || (arrayList = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_local_city_ids")) == null || arrayList.size() == 0) ? false : true;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_other_city_ids");
        return (arrayList2 == null || arrayList2.size() == 0) ? false : true;
    }

    public static boolean b() {
        java.util.ArrayList arrayList = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_local_city_ids");
        return arrayList != null && arrayList.size() > 0;
    }

    public static boolean c() {
        java.util.ArrayList arrayList = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_other_city_ids");
        return arrayList != null && arrayList.size() > 0;
    }

    public static int d(java.lang.String str) {
        java.lang.Integer num;
        java.util.Map map = (java.util.Map) xt1.t0.Di().a("key_share_card_count_map");
        if (map == null || (num = (java.lang.Integer) map.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static java.util.ArrayList e(int i17) {
        if (i17 == 1) {
            java.util.ArrayList arrayList = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_local_city_ids");
            if (arrayList != null && arrayList.size() != 0) {
                return arrayList;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "getCardIds() ids == null || ids.size() == 0 for showType == " + i17);
            return f(i17);
        }
        if (i17 != 2) {
            return null;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_other_city_ids");
        if (arrayList2 != null && arrayList2.size() != 0) {
            return arrayList2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "getCardIds() ids == null || ids.size() == 0 for showType == " + i17);
        return f(i17);
    }

    public static java.util.ArrayList f(int i17) {
        fu1.j jVar = (fu1.j) xt1.t0.Di().a("key_share_card_layout_data");
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "getCardIdsByType() data == null for showType = " + i17);
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i18 = 0;
        if (i17 == 1) {
            java.util.LinkedList linkedList = jVar.f348379a;
            if (linkedList != null && linkedList.size() > 0) {
                while (i18 < jVar.f348379a.size()) {
                    fu1.k kVar = (fu1.k) jVar.f348379a.get(i18);
                    if (!arrayList2.contains(kVar.f348389b)) {
                        java.lang.String J0 = xt1.t0.nj().J0(kVar.f348389b);
                        if (!android.text.TextUtils.isEmpty(J0) && !arrayList.contains(J0)) {
                            arrayList.add(J0);
                        } else if (!arrayList.contains(kVar.f348388a)) {
                            arrayList.add(kVar.f348388a);
                        }
                        arrayList2.add(kVar.f348389b);
                    }
                    i18++;
                }
                xt1.t0.Di().b("key_share_card_local_city_ids", arrayList);
            }
            return arrayList;
        }
        if (i17 != 2) {
            return null;
        }
        java.util.LinkedList linkedList2 = jVar.f348380b;
        if (linkedList2 != null && linkedList2.size() > 0) {
            while (i18 < jVar.f348380b.size()) {
                fu1.k kVar2 = (fu1.k) jVar.f348380b.get(i18);
                if (!arrayList2.contains(kVar2.f348389b)) {
                    java.lang.String J02 = xt1.t0.nj().J0(kVar2.f348389b);
                    if (!android.text.TextUtils.isEmpty(J02) && !arrayList.contains(J02)) {
                        arrayList.add(J02);
                    } else if (!arrayList.contains(kVar2.f348388a)) {
                        arrayList.add(kVar2.f348388a);
                    }
                    arrayList2.add(kVar2.f348389b);
                }
                i18++;
            }
            xt1.t0.Di().b("key_share_card_other_city_ids", arrayList);
        }
        return arrayList;
    }

    public static java.util.ArrayList h(java.lang.String str) {
        java.util.Map map = (java.util.Map) xt1.t0.Di().a("key_share_user_info_map");
        if (map == null) {
            map = new java.util.HashMap();
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) map.get(str);
        return arrayList == null ? new java.util.ArrayList() : arrayList;
    }

    public static java.lang.String i(android.content.Context context, java.util.ArrayList arrayList, int i17) {
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "getShareUserName， username_list == null || username_list.size() == 0");
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < arrayList.size() && i18 < 2; i18++) {
            if (i18 != 0) {
                sb6.append("、");
            }
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = (java.lang.String) arrayList.get(i18);
            ((sg3.a) v0Var).getClass();
            java.lang.String a17 = c01.a2.a(str);
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = (java.lang.String) arrayList.get(i18);
            ((sg3.a) v0Var2).getClass();
            java.lang.String e17 = c01.a2.e(str2);
            if (android.text.TextUtils.isEmpty(a17)) {
                sb6.append(e17);
            } else {
                sb6.append(a17);
            }
        }
        if (context != null) {
            return (arrayList.size() == 1 || arrayList.size() == 2) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.avf, sb6.toString()) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.auz, sb6.toString(), java.lang.Integer.valueOf(arrayList.size()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "context == null");
        return "";
    }

    public static boolean m(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_other_city_top_info_list");
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fu1.n nVar = (fu1.n) it.next();
            if (nVar != null && str.equals(nVar.f348395a) && nVar.f348396b == 1) {
                return true;
            }
        }
        return false;
    }

    public static void p(android.content.Context context, tt1.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "updateShareCardData()");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "card id:" + jVar.g() + " cardtpid:" + jVar.f());
        java.lang.String g17 = jVar.g();
        java.lang.String f17 = jVar.f();
        if (f338284b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "is isUpdating data, don't do updateCardIdsListByCardId");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "do updateCardIdsListByCardId");
            f338284b = true;
            java.util.ArrayList e17 = e(1);
            if (e17 != null && e17.contains(g17)) {
                e17.remove(g17);
                java.lang.String P0 = xt1.t0.nj().P0(g17, f17);
                if (!android.text.TextUtils.isEmpty(P0)) {
                    e17.add(P0);
                }
                xt1.t0.Di().b("key_share_card_local_city_ids", e17);
            }
            java.util.ArrayList e18 = e(2);
            if (e18 != null && e18.contains(g17)) {
                e18.remove(g17);
                java.lang.String P02 = xt1.t0.nj().P0(g17, f17);
                if (!android.text.TextUtils.isEmpty(P02)) {
                    e18.add(P02);
                }
                xt1.t0.Di().b("key_share_card_other_city_ids", e18);
            }
            f338284b = false;
        }
        if (context != null) {
            java.lang.String f18 = jVar.f();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "updateCardCountbyCardTpId() card_tp_id:" + f18);
            java.util.Map map = (java.util.Map) xt1.t0.Di().a("key_share_card_count_map");
            if (map == null) {
                map = new java.util.HashMap();
            }
            java.util.Map map2 = (java.util.Map) xt1.t0.Di().a("key_share_card_username_map");
            if (map2 == null) {
                map2 = new java.util.HashMap();
            }
            int D0 = xt1.t0.nj().D0(f18);
            map.put(f18, java.lang.Integer.valueOf(D0));
            map2.put(f18, i(context, xt1.t0.nj().L0(f18, 99), D0));
            xt1.t0.Di().b("key_share_card_count_map", map);
            xt1.t0.Di().b("key_share_card_username_map", map2);
        }
        java.lang.String g18 = jVar.g();
        java.lang.String f19 = jVar.f();
        java.lang.String a17 = jVar.a();
        java.util.Map map3 = (java.util.Map) xt1.t0.Di().a("key_share_user_info_map");
        if (map3 == null) {
            map3 = new java.util.HashMap();
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) map3.get(f19);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            fu1.p pVar = (fu1.p) arrayList.get(i17);
            if (a17 != null && a17.equals(pVar.f348399a)) {
                pVar.f348403e = false;
                pVar.f348401c--;
                pVar.f348402d.remove(g18);
                arrayList.set(i17, pVar);
            }
        }
        map3.put(f19, arrayList);
        xt1.t0.Di().b("key_share_user_info_map", map3);
        r(jVar.f());
    }

    public static void r(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "updateShareUserInfo()");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "updateShareUserInfo(), card_tp_id is empty");
        } else {
            s75.d.b(new eu1.d(str, new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper())), "updateShareUserInfo_thread");
        }
    }

    public int g() {
        android.database.Cursor f17 = xt1.t0.cj().f537994d.f("select count(*) from UserCardInfo where (status=0 OR status=5) AND card_type=10", null, 2);
        if (f17 != null) {
            r1 = f17.moveToFirst() ? f17.getInt(0) : 0;
            f17.close();
        }
        return r1;
    }

    public void j() {
        if (((fu1.j) xt1.t0.Di().a("key_share_card_layout_data")) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "the share card layout cache is valid!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "initShareCardLayoutData, data cache is empty!, load data from db!");
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_SHARECARD_LAYOUT_JSON_STRING_SYNC, "");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "initShareCardLayoutData, json is empty");
            return;
        }
        fu1.j b17 = lu1.i0.b(str);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "load share card layout data fail!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "load share card layout data success!");
        xt1.t0.Di().b("key_share_card_layout_data", b17);
        n(b17, true);
    }

    public boolean k() {
        fu1.j jVar = (fu1.j) xt1.t0.Di().a("key_share_card_layout_data");
        if (jVar == null) {
            return true;
        }
        return jVar.f348382d;
    }

    public boolean l() {
        fu1.j jVar = (fu1.j) xt1.t0.Di().a("key_share_card_layout_data");
        if (jVar == null) {
            return true;
        }
        return jVar.f348383e;
    }

    public final void n(fu1.j jVar, boolean z17) {
        java.lang.String str;
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "don't parserShareCardListData, data is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "parserShareCardListData()");
        java.lang.String str2 = "key_share_card_annoucement_map";
        java.util.Map map = (java.util.Map) xt1.t0.Di().a("key_share_card_annoucement_map");
        if (map == null) {
            map = new java.util.HashMap();
        }
        java.lang.String str3 = "key_share_card_count_map";
        java.util.Map map2 = (java.util.Map) xt1.t0.Di().a("key_share_card_count_map");
        if (map2 == null) {
            map2 = new java.util.HashMap();
        }
        java.lang.String str4 = "key_share_card_username_map";
        java.util.Map map3 = (java.util.Map) xt1.t0.Di().a("key_share_card_username_map");
        if (map3 == null) {
            map3 = new java.util.HashMap();
        }
        java.lang.String str5 = "key_share_card_local_city_ids";
        java.util.ArrayList arrayList = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_local_city_ids");
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.lang.String str6 = "key_share_card_other_city_ids";
        java.util.ArrayList arrayList2 = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_other_city_ids");
        if (arrayList2 == null) {
            arrayList2 = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList3 = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_other_city_top_info_list");
        if (arrayList3 == null) {
            arrayList3 = new java.util.ArrayList();
        }
        if (z17) {
            arrayList.clear();
            arrayList2.clear();
            arrayList3.clear();
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.LinkedList linkedList = jVar.f348379a;
        android.content.Context context = this.f338286a;
        if (linkedList != null && linkedList.size() > 0) {
            int i17 = 0;
            while (i17 < jVar.f348379a.size()) {
                fu1.k kVar = (fu1.k) jVar.f348379a.get(i17);
                java.lang.String str7 = str6;
                if (android.text.TextUtils.isEmpty(kVar.f348390c)) {
                    str = str5;
                } else {
                    str = str5;
                    map.put(kVar.f348389b, kVar.f348390c);
                }
                int D0 = xt1.t0.nj().D0(kVar.f348389b);
                java.lang.String str8 = str4;
                map2.put(kVar.f348389b, java.lang.Integer.valueOf(D0));
                java.lang.String str9 = str3;
                java.lang.String str10 = str2;
                map3.put(kVar.f348389b, i(context, xt1.t0.nj().L0(kVar.f348389b, 99), D0));
                if (!arrayList4.contains(kVar.f348389b)) {
                    java.lang.String J0 = xt1.t0.nj().J0(kVar.f348389b);
                    if (!android.text.TextUtils.isEmpty(J0) && !arrayList.contains(J0)) {
                        arrayList.add(J0);
                    } else if (!arrayList.contains(kVar.f348388a)) {
                        arrayList.add(kVar.f348388a);
                    }
                    arrayList4.add(kVar.f348389b);
                    fu1.n nVar = new fu1.n();
                    nVar.f348395a = kVar.f348389b;
                    nVar.f348396b = kVar.f348391d;
                    arrayList3.add(nVar);
                }
                i17++;
                str6 = str7;
                str5 = str;
                str4 = str8;
                str3 = str9;
                str2 = str10;
            }
        }
        java.lang.String str11 = str2;
        java.lang.String str12 = str3;
        java.lang.String str13 = str4;
        java.lang.String str14 = str5;
        java.lang.String str15 = str6;
        arrayList4.clear();
        java.util.LinkedList linkedList2 = jVar.f348380b;
        if (linkedList2 != null && linkedList2.size() > 0) {
            for (int i18 = 0; i18 < jVar.f348380b.size(); i18++) {
                fu1.k kVar2 = (fu1.k) jVar.f348380b.get(i18);
                if (!android.text.TextUtils.isEmpty(kVar2.f348390c)) {
                    map.put(kVar2.f348389b, kVar2.f348390c);
                }
                int D02 = xt1.t0.nj().D0(kVar2.f348389b);
                map2.put(kVar2.f348389b, java.lang.Integer.valueOf(D02));
                map3.put(kVar2.f348389b, i(context, xt1.t0.nj().L0(kVar2.f348389b, 99), D02));
                if (!arrayList4.contains(kVar2.f348389b)) {
                    java.lang.String J02 = xt1.t0.nj().J0(kVar2.f348389b);
                    if (!android.text.TextUtils.isEmpty(J02) && !arrayList2.contains(J02)) {
                        arrayList2.add(J02);
                    } else if (!arrayList2.contains(kVar2.f348388a)) {
                        arrayList2.add(kVar2.f348388a);
                    }
                    arrayList4.add(kVar2.f348389b);
                    fu1.n nVar2 = new fu1.n();
                    nVar2.f348395a = kVar2.f348389b;
                    nVar2.f348396b = kVar2.f348391d;
                    arrayList3.add(nVar2);
                }
            }
        }
        xt1.t0.Di().b(str11, map);
        xt1.t0.Di().b(str12, map2);
        xt1.t0.Di().b(str13, map3);
        xt1.t0.Di().b("key_share_card_local_city", jVar.f348381c);
        xt1.t0.Di().b(str14, arrayList);
        xt1.t0.Di().b(str15, arrayList2);
        xt1.t0.Di().b("key_share_card_other_city_top_info_list", arrayList3);
    }

    public final void o(fu1.j jVar, fu1.j jVar2, boolean z17) {
        int size;
        int size2;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.util.LinkedList linkedList4;
        java.util.LinkedList linkedList5;
        java.util.LinkedList linkedList6;
        java.util.LinkedList linkedList7;
        java.util.LinkedList linkedList8;
        if (jVar == null && jVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "don't updateCategoryType(), newData == null && oldData == null");
            return;
        }
        if (jVar != null && jVar.f348380b == null && jVar.f348379a == null && jVar2 != null && jVar2.f348380b == null && jVar2.f348379a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "don't updateCategoryType(), newData.local_city_list == null && oldData.local_city_list == null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "updateCategoryType()");
        java.util.ArrayList arrayList = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_local_city_category_info_list");
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) xt1.t0.Di().a("key_share_card_other_city_category_info_list");
        if (arrayList2 == null) {
            arrayList2 = new java.util.ArrayList();
        }
        if (z17) {
            xt1.t0.nj().W0(null, 10);
            arrayList.clear();
            xt1.t0.nj().W0(null, 0);
            arrayList2.clear();
            size = 0;
            size2 = 0;
        } else {
            size = (jVar2 == null || (linkedList2 = jVar2.f348379a) == null || linkedList2.size() < 0) ? 0 : jVar2.f348379a.size();
            size2 = (jVar2 == null || (linkedList = jVar2.f348380b) == null || linkedList.size() < 0) ? 0 : jVar2.f348380b.size();
        }
        java.lang.System.currentTimeMillis();
        long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (jVar != null && (linkedList7 = jVar.f348379a) != null && linkedList7.size() > 0) {
            for (int i17 = 0; i17 < jVar.f348379a.size(); i17++) {
                fu1.k kVar = (fu1.k) jVar.f348379a.get(i17);
                int i18 = i17 + size;
                xt1.t0.nj().b1(kVar.f348389b, 10, i18);
                fu1.f fVar = new fu1.f();
                fVar.f348371a = kVar.f348389b;
                fVar.f348372b = i18;
                arrayList.add(fVar);
            }
            if (!z17 && jVar2 != null && (linkedList8 = jVar2.f348379a) != null) {
                jVar.f348379a.addAll(linkedList8);
            }
        } else if (jVar != null && !z17 && jVar2 != null && (linkedList3 = jVar2.f348379a) != null) {
            jVar.f348379a = linkedList3;
        }
        xt1.t0.Di().b("key_share_card_local_city_category_info_list", arrayList);
        if (jVar != null && (linkedList5 = jVar.f348380b) != null && linkedList5.size() > 0) {
            for (int i19 = 0; i19 < jVar.f348380b.size(); i19++) {
                fu1.k kVar2 = (fu1.k) jVar.f348380b.get(i19);
                int i27 = i19 + size2;
                xt1.t0.nj().b1(kVar2.f348389b, 0, i27);
                fu1.f fVar2 = new fu1.f();
                fVar2.f348371a = kVar2.f348389b;
                fVar2.f348372b = i27;
                arrayList2.add(fVar2);
            }
            if (!z17 && jVar2 != null && (linkedList6 = jVar2.f348380b) != null) {
                jVar.f348380b.addAll(linkedList6);
            }
        } else if (jVar != null && !z17 && jVar2 != null && (linkedList4 = jVar2.f348380b) != null) {
            jVar.f348380b = linkedList4;
        }
        xt1.t0.Di().b("key_share_card_other_city_category_info_list", arrayList2);
        gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
        java.lang.System.currentTimeMillis();
    }

    public void q(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "updateGetShareLayoutData json is empty");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        fu1.j b17 = lu1.i0.b(str);
        fu1.j jVar = (fu1.j) xt1.t0.Di().a("key_share_card_layout_data");
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "updateGetShareLayoutData data == null");
            o(b17, jVar, z17);
            xt1.t0.Di().b("key_share_card_layout_data", b17);
            return;
        }
        if (z17) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_SHARECARD_LAYOUT_JSON_STRING_SYNC, str);
        }
        n(b17, z17);
        o(b17, jVar, z17);
        xt1.t0.Di().b("key_share_card_layout_data", b17);
        java.util.LinkedList linkedList = b17.f348379a;
        int size = (linkedList == null || linkedList.size() <= 0) ? 0 : b17.f348379a.size();
        java.util.LinkedList linkedList2 = b17.f348380b;
        if (linkedList2 != null && linkedList2.size() > 0) {
            size += b17.f348380b.size();
        }
        if (size > 0) {
            int currentTimeMillis2 = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c344.m40330x4c144dd(281);
            c4582x424c344.m40331x936762bd(10);
            c4582x424c344.m40332x57b2b64f(1L);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3442.m40330x4c144dd(281);
            c4582x424c3442.m40331x936762bd(11);
            c4582x424c3442.m40332x57b2b64f(currentTimeMillis2);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3443.m40330x4c144dd(281);
            c4582x424c3443.m40331x936762bd(12);
            c4582x424c3443.m40332x57b2b64f(size);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3444 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3444.m40330x4c144dd(281);
            c4582x424c3444.m40331x936762bd(14);
            c4582x424c3444.m40332x57b2b64f(currentTimeMillis2 / size);
            arrayList.add(c4582x424c344);
            arrayList.add(c4582x424c3442);
            arrayList.add(c4582x424c3443);
            arrayList.add(c4582x424c3444);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
        }
    }
}
