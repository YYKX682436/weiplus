package vy4;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f523033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f523034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f523035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vy4.k f523036g;

    public j(vy4.k kVar, java.util.List list, java.util.List list2, java.util.List list3) {
        this.f523036g = kVar;
        this.f523033d = list;
        this.f523034e = list2;
        this.f523035f = list3;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list;
        java.util.List list2;
        int i17;
        int i18;
        java.util.List list3;
        this.f523036g.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.List<vy4.o> list4 = this.f523034e;
        if (list4 != null && !list4.isEmpty()) {
            for (vy4.o oVar : list4) {
                int i19 = oVar.f523047b;
                if (i19 == 1) {
                    hashSet.add(oVar.f523046a);
                } else if (i19 == 2) {
                    hashSet2.add(oVar.f523046a);
                }
            }
        }
        int i27 = 3;
        java.util.List<java.lang.Integer> list5 = this.f523035f;
        if (list5 == null || list5.isEmpty()) {
            list = list5;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Integer num : list5) {
                yy4.a aVar = new yy4.a();
                aVar.f66653x29106093 = num.toString();
                sy4.m.f495417c.c().get(aVar, "expId");
                if (android.text.TextUtils.isEmpty(aVar.f66634x369ad11)) {
                    list3 = list5;
                } else {
                    aVar.f66637xda33d239 = i27;
                    list3 = list5;
                    aVar.f66652x14d4a3e3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - 1;
                    arrayList.add(aVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XExptForWelabBridge", "welab app[%s] stop now", aVar);
                    java.lang.String str = aVar.f66634x369ad11;
                    java.lang.String str2 = aVar.f66653x29106093;
                    sy4.q qVar = new sy4.q();
                    qVar.f495424a = str;
                    qVar.f495426c = 9;
                    qVar.f495427d = java.lang.System.currentTimeMillis();
                    qVar.f495425b = str2;
                    qVar.f495428e = false;
                    sy4.r.b(qVar);
                }
                list5 = list3;
                i27 = 3;
            }
            list = list5;
            if (!arrayList.isEmpty()) {
                sy4.m.f495417c.c().z0(arrayList);
            }
        }
        java.util.List list6 = this.f523033d;
        if (list6 == null || list6.isEmpty()) {
            list2 = list6;
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator it = list6.iterator();
            while (it.hasNext()) {
                vy4.n nVar = (vy4.n) it.next();
                yy4.a aVar2 = new yy4.a();
                aVar2.f66653x29106093 = java.lang.String.valueOf(nVar.f523041a);
                java.util.List list7 = list6;
                aVar2.f66657x6e338166 = nVar.f523042b;
                long j17 = nVar.f523043c;
                if (j17 <= 0) {
                    j17 = java.lang.System.currentTimeMillis() / 1000;
                }
                aVar2.f66658x1bc2412a = j17;
                long j18 = nVar.f523044d;
                if (j18 <= 0) {
                    j18 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
                }
                aVar2.f66652x14d4a3e3 = j18;
                java.lang.String str3 = "xlab_" + nVar.f523041a;
                java.util.HashMap hashMap2 = nVar.f523045e;
                aVar2.f66614xbae28147 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "AllVer")), 0);
                aVar2.f66615xd1fa0488 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "BizType")), 0);
                aVar2.f66616x3496e274 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Desc_cn"));
                aVar2.f66617x3496e2b2 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Desc_en"));
                aVar2.f66618x3496e30c = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Desc_hk"));
                aVar2.f66619x3496e48c = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Desc_tw"));
                aVar2.f66620x9c754e39 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "DetailURL"));
                aVar2.f66630x71b462d0 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Introduce_cn"));
                aVar2.f66631x71b4630e = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Introduce_en"));
                aVar2.f66632x71b46368 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Introduce_hk"));
                aVar2.f66633x71b464e8 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Introduce_tw"));
                aVar2.f66635x4b6dfd6f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "Pos")), 0);
                aVar2.f66647x2253a77f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "Type")), 0);
                aVar2.f66637xda33d239 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "Switch")), 0);
                aVar2.f66649x2d9a8a13 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "WeAppPath"));
                aVar2.f66650x2d9d11b9 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "WeAppUser"));
                aVar2.f66634x369ad11 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "LabsAppId"));
                aVar2.f66642xf007a3dc = (java.lang.String) hashMap2.get(sy4.s.b(str3, "TitleKey_android"));
                aVar2.f66643xb2277d77 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Title_cn"));
                aVar2.f66644xb2277db5 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Title_en"));
                aVar2.f66645xb2277e0f = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Title_hk"));
                aVar2.f66646xb2277f8f = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Title_tw"));
                aVar2.f66638x5a6e66cc = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ThumbUrl_cn"));
                aVar2.f66639x5a6e670a = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ThumbUrl_en"));
                aVar2.f66640x5a6e6764 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ThumbUrl_hk"));
                aVar2.f66641x5a6e68e4 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ThumbUrl_tw"));
                java.util.Iterator it6 = it;
                aVar2.f66622xc8a56789 = sy4.s.a(hashMap2, sy4.s.b(str3, "ImgUrl_android_cn")).replace(',', ';');
                aVar2.f66625xc8a569a1 = sy4.s.a(hashMap2, sy4.s.b(str3, "ImgUrl_android_tw")).replace(',', ';');
                aVar2.f66623xc8a567c7 = sy4.s.a(hashMap2, sy4.s.b(str3, "ImgUrl_android_en")).replace(',', ';');
                aVar2.f66624xc8a56821 = sy4.s.a(hashMap2, sy4.s.b(str3, "ImgUrl_android_hk")).replace(',', ';');
                if (android.text.TextUtils.isEmpty(aVar2.f66622xc8a56789)) {
                    aVar2.f66622xc8a56789 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ImgUrl_cn"));
                }
                if (android.text.TextUtils.isEmpty(aVar2.f66623xc8a567c7)) {
                    aVar2.f66623xc8a567c7 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ImgUrl_en"));
                }
                if (android.text.TextUtils.isEmpty(aVar2.f66624xc8a56821)) {
                    aVar2.f66624xc8a56821 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ImgUrl_hk"));
                }
                if (android.text.TextUtils.isEmpty(aVar2.f66625xc8a569a1)) {
                    aVar2.f66625xc8a569a1 = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ImgUrl_tw"));
                }
                aVar2.f66636xf1f8cd44 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "RedPoint")), 0);
                aVar2.f66648xeff64168 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "WeAppDebugMode")), 0);
                aVar2.f66642xf007a3dc = (java.lang.String) hashMap2.get(sy4.s.b(str3, "TitleKey_android"));
                aVar2.f66621x224e54be = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Icon"));
                aVar2.f66651xe408a7d5 = 1;
                aVar2.f66659x10a0fed7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "status")), 0);
                aVar2.f66654x293f97df = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "idkey")), 0);
                aVar2.f66655xf3591cd2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "idkeyValue")), 0);
                if (aVar2.m178088x7b953cf2()) {
                    if (!hashMap.containsKey(aVar2.f66634x369ad11)) {
                        hashMap.put(aVar2.f66634x369ad11, aVar2);
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((yy4.a) hashMap.get(aVar2.f66634x369ad11)).f66653x29106093, 0) < com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(aVar2.f66653x29106093, 0)) {
                        hashMap.put(aVar2.f66634x369ad11, aVar2);
                    }
                    int i28 = aVar2.f66654x293f97df;
                    if (i28 > 0 && (i18 = aVar2.f66655xf3591cd2) >= 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(i28, i18, 1L, false);
                    }
                }
                list6 = list7;
                it = it6;
            }
            list2 = list6;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (yy4.a aVar3 : hashMap.values()) {
                sy4.m mVar = sy4.m.f495417c;
                yy4.a b17 = mVar.b(aVar3.f66634x369ad11);
                if ((b17.f66651xe408a7d5 == 1) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(b17.f66653x29106093, 0) > com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(aVar3.f66653x29106093, 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XExptForWelabBridge", "it had local welab item, don't update.local[%s] new[%s]", b17, aVar3);
                } else if (aVar3.f66659x10a0fed7 == 1) {
                    mVar.c().mo9951xb06685ab(aVar3, "expId");
                } else {
                    arrayList2.add(aVar3);
                    linkedList.add(aVar3);
                    az4.h hVar = az4.h.f97712c;
                    hVar.getClass();
                    if (aVar3.f66636xf1f8cd44 == 1 && !hVar.b(aVar3.f66634x369ad11) && aVar3.y0()) {
                        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                        bk0.a.g().p(266267, true);
                    }
                    java.lang.String str4 = aVar3.f66634x369ad11;
                    java.lang.String str5 = aVar3.f66653x29106093;
                    boolean a17 = hVar.a(aVar3);
                    sy4.q qVar2 = new sy4.q();
                    qVar2.f495424a = str4;
                    qVar2.f495426c = 8;
                    qVar2.f495427d = java.lang.System.currentTimeMillis();
                    qVar2.f495425b = str5;
                    qVar2.f495428e = a17;
                    sy4.r.b(qVar2);
                }
            }
            if (!arrayList2.isEmpty()) {
                sy4.m.f495417c.c().z0(arrayList2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(kc1.l.f72433x366c91de, 20);
        }
        if (!hashSet.isEmpty() || !hashSet2.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it7 = ((java.util.ArrayList) sy4.m.f495417c.c().y0()).iterator();
            while (it7.hasNext()) {
                yy4.a aVar4 = (yy4.a) it7.next();
                if (aVar4 != null && aVar4.m178088x7b953cf2()) {
                    if (aVar4.f66651xe408a7d5 == 1) {
                        if (hashSet.contains(aVar4.f66634x369ad11) && aVar4.f66637xda33d239 == 1) {
                            i17 = 2;
                            aVar4.f66637xda33d239 = 2;
                            arrayList3.add(aVar4);
                        } else {
                            i17 = 2;
                        }
                        if (hashSet2.contains(aVar4.f66634x369ad11) && aVar4.f66637xda33d239 == i17) {
                            aVar4.f66637xda33d239 = 1;
                            arrayList3.add(aVar4);
                        }
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                sy4.m.f495417c.c().z0(arrayList3);
            }
        }
        sy4.m.f495417c.f(linkedList);
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(list2 != null ? list2.size() : 0);
        objArr[1] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
        objArr[2] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        objArr[3] = hashSet;
        objArr[4] = hashSet2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XExptForWelabBridge", "itemList [%d] delList[%d] cost[%d] openAppId[%s] closeAppId[%s]", objArr);
    }
}
