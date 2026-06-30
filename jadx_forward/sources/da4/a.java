package da4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f309301a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f309302b;

    public a(android.content.Context context, java.util.Map map) {
        java.lang.String str;
        int i17;
        java.lang.String d17;
        this.f309302b = new java.lang.ref.WeakReference(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKeyPrefix", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (map.containsKey(".adxml.adCanvasInfo.adMarketJump.marketTag.marketSchema")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKeyPrefix", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        } else {
            if (map.containsKey(".RecXml.adxml.adCanvasInfo.adMarketJump.marketTag.marketSchema")) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKeyPrefix", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                str = ".RecXml.adxml.adCanvasInfo.adMarketJump.";
                i17 = 0;
                d17 = d(str.concat("marketTag"), 0);
                while (true) {
                    if (!map.containsKey(d17 + ".marketSchema") || i17 >= 20) {
                        break;
                    }
                    da4.d dVar = new da4.d();
                    dVar.f309309c = (java.lang.String) map.get(d17 + ".brand");
                    dVar.f309310d = (java.lang.String) map.get(d17 + ".appPackage");
                    dVar.f309311e = (java.lang.String) map.get(d17 + ".marketName");
                    dVar.f309308b = b(map, d17, "marketPackage");
                    dVar.f309307a = b(map, d17, "marketSchema");
                    a(dVar);
                    arrayList.add(dVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MICROMSG.AdAppMarketHelper", dVar.m123801x9616526c());
                    i17++;
                    d17 = d(str.concat("marketTag"), i17);
                }
                java.util.Collections.sort(arrayList, new da4.c());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                this.f309301a = arrayList;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKeyPrefix", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        }
        str = ".adxml.adCanvasInfo.adMarketJump.";
        i17 = 0;
        d17 = d(str.concat("marketTag"), 0);
        while (true) {
            if (!map.containsKey(d17 + ".marketSchema")) {
                break;
            } else {
                break;
            }
            da4.d dVar2 = new da4.d();
            dVar2.f309309c = (java.lang.String) map.get(d17 + ".brand");
            dVar2.f309310d = (java.lang.String) map.get(d17 + ".appPackage");
            dVar2.f309311e = (java.lang.String) map.get(d17 + ".marketName");
            dVar2.f309308b = b(map, d17, "marketPackage");
            dVar2.f309307a = b(map, d17, "marketSchema");
            a(dVar2);
            arrayList.add(dVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MICROMSG.AdAppMarketHelper", dVar2.m123801x9616526c());
            i17++;
            d17 = d(str.concat("marketTag"), i17);
        }
        java.util.Collections.sort(arrayList, new da4.c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        this.f309301a = arrayList;
    }

    public static boolean e(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAppMarketIntentValid", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (intent != null) {
            try {
                if (!android.text.TextUtils.isEmpty(intent.getAction()) && intent.getData() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 6);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAppMarketIntentValid", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                    return true;
                }
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MICROMSG.AdAppMarketHelper", "isAppMarketIntentValid has something error");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 7);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAppMarketIntentValid", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return false;
    }

    public static boolean f(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isBrandSuccess", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (intent != null) {
            try {
                boolean booleanExtra = intent.getBooleanExtra("brand_state", false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBrandSuccess", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                return booleanExtra;
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MICROMSG.AdAppMarketHelper", "setBrandState has something error");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBrandSuccess", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return false;
    }

    public static da4.a g(android.content.Context context, java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        try {
            da4.a aVar = new da4.a(context, str, map);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return aVar;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MICROMSG.AdAppMarketHelper", "create aAdAppMarketHelper failed!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(3:13|14|(10:16|(2:19|17)|20|21|22|4|5|6|7|8))|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a3, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MICROMSG.AdAppMarketHelper", "report19790 exp:" + r8.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, java.lang.String r12, java.util.Map r13) {
        /*
            java.lang.String r0 = "report19790"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = "build19790ExtraInfo"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)
            if (r13 == 0) goto L3e
            boolean r3 = r13.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L3e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.util.Set r4 = r13.keySet()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L3e
        L22:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L36
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r6 = r13.get(r5)     // Catch: java.lang.Throwable -> L3e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L3e
            goto L22
        L36:
            java.lang.String r13 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            goto L43
        L3e:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            java.lang.String r13 = ""
        L43:
            java.lang.String r2 = "MICROMSG.AdAppMarketHelper"
            java.lang.String r3 = "report19790 snsId="
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            com.tencent.mm.plugin.report.service.g0 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE     // Catch: java.lang.Throwable -> La3
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> La3
            r6 = 0
            r5[r6] = r8     // Catch: java.lang.Throwable -> La3
            r6 = 1
            r5[r6] = r9     // Catch: java.lang.Throwable -> La3
            r6 = 2
            r5[r6] = r10     // Catch: java.lang.Throwable -> La3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> La3
            r7 = 3
            r5[r7] = r6     // Catch: java.lang.Throwable -> La3
            r6 = 4
            r5[r6] = r12     // Catch: java.lang.Throwable -> La3
            r6 = 5
            r5[r6] = r13     // Catch: java.lang.Throwable -> La3
            r6 = 19790(0x4d4e, float:2.7732E-41)
            r4.d(r6, r5)     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r4.<init>(r3)     // Catch: java.lang.Throwable -> La3
            r4.append(r8)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = ", uxInfo="
            r4.append(r8)     // Catch: java.lang.Throwable -> La3
            r4.append(r9)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = ", adExtInfo ="
            r4.append(r8)     // Catch: java.lang.Throwable -> La3
            r4.append(r10)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = ", actType ="
            r4.append(r8)     // Catch: java.lang.Throwable -> La3
            r4.append(r11)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = ", actValue = "
            r4.append(r8)     // Catch: java.lang.Throwable -> La3
            r4.append(r12)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = ", extInfo = "
            r4.append(r8)     // Catch: java.lang.Throwable -> La3
            r4.append(r13)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> La3
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)     // Catch: java.lang.Throwable -> La3
            goto Lba
        La3:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "report19790 exp:"
            r9.<init>(r10)
            java.lang.String r8 = r8.toString()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r8)
        Lba:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: da4.a.h(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.util.Map):void");
    }

    public final void a(da4.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("computeMarketNodePriority", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (dVar != null) {
            java.lang.String str = android.os.Build.BRAND;
            java.lang.String str2 = android.os.Build.MANUFACTURER;
            java.lang.String str3 = dVar.f309309c;
            dVar.f309312f = 2;
            if (!android.text.TextUtils.isEmpty(str3) && str != null) {
                java.lang.String lowerCase = str3.toLowerCase();
                java.lang.String lowerCase2 = str.toLowerCase();
                int i17 = 0;
                if (lowerCase.equals(lowerCase2)) {
                    dVar.f309312f = 0;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                    if (str2 != null) {
                        java.lang.String lowerCase3 = lowerCase.toLowerCase();
                        java.lang.String lowerCase4 = str2.toLowerCase();
                        if (lowerCase3.equals(lowerCase4)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                        } else if (lowerCase3.contains(lowerCase4)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                            i17 = 1;
                        } else if (lowerCase4.contains(lowerCase3)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                            i17 = 2;
                        }
                        dVar.f309312f = i17;
                        if (i17 >= 2 && lowerCase.contains(lowerCase2)) {
                            dVar.f309312f = 1;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                    i17 = 3;
                    dVar.f309312f = i17;
                    if (i17 >= 2) {
                        dVar.f309312f = 1;
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("computeMarketNodePriority", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
    }

    public final java.util.List b(java.util.Map map, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getElementList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        java.lang.String d17 = d(str + "." + str2, 0);
        while (map.containsKey(d17) && i17 < 10) {
            java.lang.String str3 = (java.lang.String) map.get(d17);
            if (!android.text.TextUtils.isEmpty(str3)) {
                arrayList.add(str3);
            }
            i17++;
            d17 = d(str + "." + str2, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getElementList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return arrayList;
    }

    public final java.util.List c(org.json.JSONObject jSONObject, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getElementList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object opt = jSONObject.opt(str);
        if (opt instanceof org.json.JSONArray) {
            org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                arrayList.add(jSONArray.optString(i17, ""));
            }
        } else if (opt instanceof java.lang.String) {
            arrayList.add((java.lang.String) opt);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getElementList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return arrayList;
    }

    public final java.lang.String d(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNodeKey", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNodeKey", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return str;
        }
        java.lang.String str2 = str + i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNodeKey", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return str2;
    }

    public android.content.Intent i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        try {
            android.content.Intent j17 = j();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return j17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return null;
        }
    }

    public final android.content.Intent j() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        android.content.Context context;
        java.lang.String str4;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        android.content.Intent intent;
        android.content.Intent intent2;
        java.lang.String str11 = "screenIntentInner";
        java.lang.String str12 = "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("screenIntentInner", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        android.content.Context context2 = (android.content.Context) this.f309302b.get();
        java.lang.String str13 = "MICROMSG.AdAppMarketHelper";
        if (context2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MICROMSG.AdAppMarketHelper", "the context is null, activity is finished?");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("screenIntentInner", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return null;
        }
        java.util.List list = this.f309301a;
        if (list != null) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            java.util.Iterator it6 = arrayList2.iterator();
            while (true) {
                java.lang.String str14 = "setBrandState";
                java.lang.String str15 = "whichPriorityIsSuccess";
                if (it6.hasNext()) {
                    da4.d dVar = (da4.d) it6.next();
                    if (dVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                        android.content.pm.PackageManager packageManager = context2.getPackageManager();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        context = context2;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toIntentNodes", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                        it = it6;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList = arrayList2;
                        java.util.List<java.lang.String> list2 = dVar.f309307a;
                        java.lang.String str16 = str11;
                        java.util.List list3 = dVar.f309308b;
                        if (list2 == null || list2.isEmpty()) {
                            str6 = str12;
                            str7 = str13;
                            str8 = "brand_state";
                            str9 = "setBrandState";
                            str10 = "whichPriorityIsSuccess";
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toIntentNodes", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                        } else {
                            str8 = "brand_state";
                            if (list3 == null || list3.isEmpty()) {
                                str6 = str12;
                                str7 = str13;
                                str9 = "setBrandState";
                                str10 = "whichPriorityIsSuccess";
                                for (java.lang.String str17 : list2) {
                                    java.lang.String str18 = dVar.f309310d;
                                    java.lang.String str19 = dVar.f309311e;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createIntentNode", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                                    da4.b bVar = new da4.b(str17, "", str18, str19);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createIntentNode", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                                    arrayList4.add(bVar);
                                }
                            } else {
                                java.util.Iterator it7 = list3.iterator();
                                while (it7.hasNext()) {
                                    java.util.Iterator it8 = it7;
                                    java.lang.String str20 = (java.lang.String) it7.next();
                                    for (java.lang.String str21 : list2) {
                                        java.lang.String str22 = str14;
                                        java.lang.String str23 = str12;
                                        java.lang.String str24 = dVar.f309310d;
                                        java.lang.String str25 = str15;
                                        java.lang.String str26 = dVar.f309311e;
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createIntentNode", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                                        java.lang.String str27 = str13;
                                        da4.b bVar2 = new da4.b(str21, str20, str24, str26);
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createIntentNode", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                                        arrayList4.add(bVar2);
                                        str12 = str23;
                                        str14 = str22;
                                        str15 = str25;
                                        str13 = str27;
                                    }
                                    it7 = it8;
                                }
                                str6 = str12;
                                str7 = str13;
                                str9 = str14;
                                str10 = str15;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toIntentNodes", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                        }
                        java.util.Iterator it9 = arrayList4.iterator();
                        while (it9.hasNext()) {
                            da4.b bVar3 = (da4.b) it9.next();
                            bVar3.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                            try {
                                intent2 = bVar3.a();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                            } catch (java.lang.Throwable unused) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdAppMarketIntentNode", "there is something wrong in toIntent");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                                intent2 = null;
                            }
                            if (intent2 != null) {
                                arrayList3.add(intent2);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                        java.util.Iterator it10 = arrayList3.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                                intent = null;
                                break;
                            }
                            intent = (android.content.Intent) it10.next();
                            if (intent.resolveActivity(packageManager) != null) {
                                intent.putExtra("market_priority", dVar.f309312f);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                                break;
                            }
                        }
                        if (intent != null) {
                            java.lang.String str28 = str7;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str28, "screenIntentInner, useNode=" + dVar);
                            int i17 = dVar.f309312f;
                            java.lang.String str29 = str6;
                            java.lang.String str30 = str10;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(str30, str29);
                            boolean z17 = i17 <= 1;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str30, str29);
                            java.lang.String str31 = str9;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(str31, str29);
                            try {
                                intent.putExtra(str8, z17);
                            } catch (java.lang.Throwable unused2) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str28, "setBrandState has something error");
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str31, str29);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str16, str29);
                            return intent;
                        }
                        str5 = str16;
                        str3 = str6;
                        str4 = str7;
                    } else {
                        str3 = str12;
                        context = context2;
                        str4 = str13;
                        arrayList = arrayList2;
                        it = it6;
                        str5 = str11;
                    }
                    str13 = str4;
                    str12 = str3;
                    str11 = str5;
                    context2 = context;
                    it6 = it;
                    arrayList2 = arrayList;
                } else {
                    str = str11;
                    str2 = str12;
                    java.lang.String str32 = str13;
                    java.util.ArrayList arrayList5 = arrayList2;
                    if (!arrayList5.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str32, "--screenIntentInner, no tagNode match--");
                        da4.d dVar2 = (da4.d) arrayList5.get(0);
                        if (dVar2 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str32, "screenIntentInner, default");
                            android.content.Intent intent3 = new android.content.Intent();
                            java.lang.String str33 = dVar2.f309310d;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTargetPkg", str2);
                            try {
                                if (!android.text.TextUtils.isEmpty(str33)) {
                                    intent3.putExtra("target_app_id", str33);
                                }
                            } catch (java.lang.Throwable unused3) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str32, "setBrandState has something error");
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTargetPkg", str2);
                            int i18 = dVar2.f309312f;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("whichPriorityIsSuccess", str2);
                            boolean z18 = i18 <= 1;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("whichPriorityIsSuccess", str2);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBrandState", str2);
                            try {
                                intent3.putExtra("brand_state", z18);
                            } catch (java.lang.Throwable unused4) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str32, "setBrandState has something error");
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBrandState", str2);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                            return intent3;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str32, "screenIntentInner, null");
                    }
                }
            }
        } else {
            str = "screenIntentInner";
            str2 = "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
        return null;
    }

    public a(android.content.Context context, java.lang.String str, java.util.Map map) {
        this.f309302b = new java.lang.ref.WeakReference(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        java.lang.String d17 = d(str + "marketTag", 0);
        while (true) {
            if (!map.containsKey(d17 + ".marketSchema") || i17 >= 20) {
                break;
            }
            da4.d dVar = new da4.d();
            dVar.f309309c = (java.lang.String) map.get(d17 + ".brand");
            dVar.f309310d = (java.lang.String) map.get(d17 + ".appPackage");
            dVar.f309311e = (java.lang.String) map.get(d17 + ".marketName");
            dVar.f309308b = b(map, d17, "marketPackage");
            dVar.f309307a = b(map, d17, "marketSchema");
            a(dVar);
            arrayList.add(dVar);
            i17++;
            d17 = d(str + "marketTag", i17);
        }
        java.util.Collections.sort(arrayList, new da4.c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        this.f309301a = arrayList;
    }

    public a(android.content.Context context, org.json.JSONArray jSONArray) {
        this.f309302b = new java.lang.ref.WeakReference(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        } else {
            try {
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    if (jSONObject != null) {
                        da4.d dVar = new da4.d();
                        dVar.f309309c = jSONObject.optString("brand", "");
                        dVar.f309310d = jSONObject.optString("appPackage", "");
                        dVar.f309311e = jSONObject.optString("marketName", "");
                        dVar.f309308b = c(jSONObject, "marketPackage");
                        dVar.f309307a = c(jSONObject, "marketSchema");
                        a(dVar);
                        arrayList.add(dVar);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        }
        this.f309301a = arrayList;
    }

    public a(android.content.Context context, r45.m3 m3Var) {
        java.util.LinkedList linkedList;
        this.f309302b = new java.lang.ref.WeakReference(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (m3Var != null && (linkedList = m3Var.f461641d) != null && !linkedList.isEmpty()) {
            try {
                int min = java.lang.Math.min(linkedList.size(), 20);
                for (int i17 = 0; i17 < min; i17++) {
                    r45.qi4 qi4Var = (r45.qi4) linkedList.get(i17);
                    if (qi4Var != null) {
                        java.util.LinkedList linkedList2 = qi4Var.f465554e;
                        java.util.LinkedList linkedList3 = qi4Var.f465555f;
                        da4.d dVar = new da4.d();
                        dVar.f309309c = qi4Var.f465553d;
                        dVar.f309310d = qi4Var.f465556g;
                        dVar.f309311e = qi4Var.f465557h;
                        dVar.f309308b = linkedList3 == null ? new java.util.ArrayList() : new java.util.ArrayList(linkedList3);
                        dVar.f309307a = linkedList2 == null ? new java.util.ArrayList() : new java.util.ArrayList(linkedList2);
                        a(dVar);
                        arrayList.add(dVar);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MICROMSG.AdAppMarketHelper", "createMarketTagList from pb, tagNode=" + dVar);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MICROMSG.AdAppMarketHelper", "createMarketTagList from pb exp=" + th6.toString());
            }
            java.util.Collections.sort(arrayList, new da4.c());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MICROMSG.AdAppMarketHelper", "createMarketTagList from pb, adMarketJump or market_tag is null/empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        }
        this.f309301a = arrayList;
    }
}
