package p44;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p44.b0 f433304a = new p44.b0();

    /* renamed from: b, reason: collision with root package name */
    public static r45.d53 f433305b;

    public static final java.lang.String b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return null;
        }
        if (str2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return null;
        }
        java.lang.String c17 = f433304a.c(str, str2);
        java.lang.String e17 = p34.o.e(c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardStorage", "getCardExtInfo, key=" + c17 + ", value=" + e17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        return e17;
    }

    public static final void j(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        if (str2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        if (str3 == null || str3.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        java.lang.String c17 = f433304a.c(str, str2);
        p34.o.i(c17, str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardStorage", "saveCardExtInfo, key=" + c17 + ", value=" + str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveCardExtInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public static final void l(r45.d53 d53Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTempCardFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        f433305b = d53Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTempCardFreshInfo, freshInfo=[cardId=");
        sb6.append(d53Var != null ? d53Var.f453658d : null);
        sb6.append(", time=");
        sb6.append(d53Var != null ? java.lang.Long.valueOf(d53Var.f453659e) : null);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardStorage", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTempCardFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public static final void n(java.lang.String str, java.lang.String str2, int i17) {
        p44.b0 b0Var;
        java.util.List e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardStorage", "updateFreshInfo, pageId=" + str + ", cardId=" + str2 + ", clickIndex=" + i17);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        r45.d53 d53Var = new r45.d53();
        d53Var.f453658d = str2;
        d53Var.f453659e = c01.id.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        try {
            b0Var = f433304a;
            e17 = b0Var.e(str);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("RandomPickCardStorage", th6);
        }
        if (((java.util.ArrayList) e17).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RandomPickCardStorage", "updateRandomCardList, pageId is " + str + ", no local, freshInfo card id is " + d53Var.f453658d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardStorage", "updateRandomCardList, pageId is " + str + ", freshInfo card id is " + d53Var.f453658d);
        java.util.List V0 = kz5.n0.V0(e17);
        b0Var.o(V0, d53Var, i17);
        b0Var.k(str, V0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public final void a(java.lang.Boolean bool, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fixPreviewModePickStatus", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) && f433305b != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p44.s sVar = (p44.s) it.next();
                java.lang.String b17 = sVar.b();
                boolean z17 = false;
                if (b17 != null) {
                    r45.d53 d53Var = f433305b;
                    if (b17.equals(d53Var != null ? d53Var.f453658d : null)) {
                        z17 = true;
                    }
                }
                if (z17 && !sVar.g()) {
                    sVar.h(c01.id.e());
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fixPreviewModePickStatus", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardExtInfoKey", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        java.lang.String str3 = g() + '_' + str + '_' + str2 + "_cardExtInfo";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardExtInfoKey", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        return str3;
    }

    public final java.lang.String d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFreshListCacheKey", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        java.lang.String str2 = g() + '_' + str + "_pickCardList";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFreshListCacheKey", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[Catch: Exception -> 0x00d4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d4, blocks: (B:12:0x004a, B:14:0x0056, B:16:0x005e, B:22:0x0069, B:24:0x008f, B:30:0x009c), top: B:11:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List e(java.lang.String r19) {
        /*
            r18 = this;
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem"
            java.lang.String r1 = "getLocalRandomCardList"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            java.lang.String r3 = r18.d(r19)
            java.lang.String r4 = p34.o.e(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getLocalRandomCardList, key is "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = ", ret is "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "RandomPickCardStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r3)
            java.lang.String r3 = "parseRandomCardListFromJson"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r4 == 0) goto L42
            int r9 = r4.length()
            if (r9 != 0) goto L40
            goto L42
        L40:
            r9 = 0
            goto L43
        L42:
            r9 = 1
        L43:
            if (r9 == 0) goto L4a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r2)
            goto Lf2
        L4a:
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Exception -> Ld4
            r9.<init>(r4)     // Catch: java.lang.Exception -> Ld4
            int r10 = r9.length()     // Catch: java.lang.Exception -> Ld4
            r11 = 0
        L54:
            if (r11 >= r10) goto Lef
            java.lang.Object r12 = r9.get(r11)     // Catch: java.lang.Exception -> Ld4
            boolean r13 = r12 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Ld4
            if (r13 == 0) goto L61
            org.json.JSONObject r12 = (org.json.JSONObject) r12     // Catch: java.lang.Exception -> Ld4
            goto L62
        L61:
            r12 = 0
        L62:
            if (r12 != 0) goto L69
            r16 = r9
        L66:
            r17 = r10
            goto Lcd
        L69:
            java.lang.String r13 = "cardId"
            java.lang.String r13 = r12.optString(r13)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r14 = "time"
            long r14 = r12.optLong(r14)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r7 = "xmlIndex"
            int r7 = r12.optInt(r7)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r8 = "showIndex"
            int r8 = r12.optInt(r8)     // Catch: java.lang.Exception -> Ld4
            r16 = r9
            java.lang.String r9 = "title"
            java.lang.String r9 = r12.optString(r9)     // Catch: java.lang.Exception -> Ld4
            if (r13 == 0) goto L98
            int r12 = r13.length()     // Catch: java.lang.Exception -> Ld4
            if (r12 != 0) goto L96
            goto L98
        L96:
            r12 = 0
            goto L99
        L98:
            r12 = 1
        L99:
            if (r12 == 0) goto L9c
            goto L66
        L9c:
            p44.s r12 = new p44.s     // Catch: java.lang.Exception -> Ld4
            r12.<init>()     // Catch: java.lang.Exception -> Ld4
            r17 = r10
            java.lang.String r10 = "setCardId"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r10, r0)     // Catch: java.lang.Exception -> Ld4
            r12.f433382b = r13     // Catch: java.lang.Exception -> Ld4
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r10, r0)     // Catch: java.lang.Exception -> Ld4
            r12.h(r14)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r10 = "setXmlIndex"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r10, r0)     // Catch: java.lang.Exception -> Ld4
            r12.f433384d = r7     // Catch: java.lang.Exception -> Ld4
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r10, r0)     // Catch: java.lang.Exception -> Ld4
            r12.i(r8)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r7 = "setTitle"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r0)     // Catch: java.lang.Exception -> Ld4
            r12.f433381a = r9     // Catch: java.lang.Exception -> Ld4
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r0)     // Catch: java.lang.Exception -> Ld4
            r6.add(r12)     // Catch: java.lang.Exception -> Ld4
        Lcd:
            int r11 = r11 + 1
            r9 = r16
            r10 = r17
            goto L54
        Ld4:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "parseRandomCardListFromJson, exp is "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = ", str is "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r0)
        Lef:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r2)
        Lf2:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p44.b0.e(java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0024 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:60:0x0015, B:5:0x0024, B:8:0x002d, B:9:0x0036, B:11:0x003c, B:14:0x004c, B:18:0x005b, B:19:0x0064, B:21:0x006a, B:24:0x0077, B:29:0x007f, B:30:0x008e, B:31:0x00a0, B:33:0x00a6, B:34:0x00b0, B:36:0x00b6, B:38:0x00c2, B:43:0x00d1, B:50:0x00e3, B:51:0x00fe, B:53:0x0104, B:55:0x0150, B:57:0x0087), top: B:59:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:60:0x0015, B:5:0x0024, B:8:0x002d, B:9:0x0036, B:11:0x003c, B:14:0x004c, B:18:0x005b, B:19:0x0064, B:21:0x006a, B:24:0x0077, B:29:0x007f, B:30:0x008e, B:31:0x00a0, B:33:0x00a6, B:34:0x00b0, B:36:0x00b6, B:38:0x00c2, B:43:0x00d1, B:50:0x00e3, B:51:0x00fe, B:53:0x0104, B:55:0x0150, B:57:0x0087), top: B:59:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List f(java.lang.String r13, java.util.List r14, java.lang.Boolean r15) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p44.b0.f(java.lang.String, java.util.List, java.lang.Boolean):java.util.List");
    }

    public final java.lang.String g() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUin", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                str = gm0.j1.b().j();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getUinString(...)");
            } else {
                str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69896xb5887524();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getUin(...)");
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("RandomPickCardStorage", th6);
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUin", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        return str;
    }

    public final java.util.List h(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("mergeShareHBCardFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        java.util.List arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p44.s sVar = (p44.s) it.next();
            arrayList.add(sVar.a(sVar));
        }
        r45.d53 d53Var = f433305b;
        if (d53Var != null) {
            arrayList = kz5.n0.V0(arrayList);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTmpFreshInfo$default", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            p(arrayList, d53Var, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTmpFreshInfo$default", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeShareHBCardFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        return arrayList;
    }

    public final java.lang.String i(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("randomCardListToJson", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RandomPickCardStorage", "randomCardListToJson, xmlList is null or empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("randomCardListToJson", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return "";
        }
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            p44.s sVar = (p44.s) obj;
            if (sVar != null) {
                java.lang.String b17 = sVar.b();
                if (!(b17 == null || b17.length() == 0)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.String b18 = sVar.b();
                    if (b18 == null) {
                        b18 = "";
                    }
                    jSONObject.put("cardId", b18);
                    jSONObject.put("time", sVar.c());
                    jSONObject.put("xmlIndex", sVar.f());
                    jSONObject.put("showIndex", sVar.d());
                    jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, sVar.e());
                    jSONArray.put(jSONObject);
                }
            }
            i17 = i18;
        }
        java.lang.String jSONArray2 = jSONArray.length() > 0 ? jSONArray.toString() : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("randomCardListToJson", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        return jSONArray2;
    }

    public final void k(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        java.lang.String i17 = i(list);
        if (i17 == null || i17.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            return;
        }
        java.lang.String d17 = d(str);
        p34.o.i(d17, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardStorage", "saveRandomCardList, key is " + d17 + ", ret is " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveRandomCardList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public final void m(p44.s sVar, r45.d53 d53Var, p44.s sVar2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("swapShowIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        sVar.h(d53Var.f453659e);
        sVar2.i(sVar.d());
        sVar.i(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("swapShowIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public final void o(java.util.List list, r45.d53 d53Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSortInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        r45.d53 d53Var2 = f433305b;
        if (d53Var2 != null) {
            p(list, d53Var2, true);
        }
        int i18 = 0;
        p44.s sVar = null;
        p44.s sVar2 = null;
        for (java.lang.Object obj : list) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            p44.s sVar3 = (p44.s) obj;
            if (i17 < 0 ? !(sVar3.g() || (sVar != null && sVar.d() <= sVar3.d())) : sVar3.d() == i17) {
                sVar = sVar3;
            }
            java.lang.String b17 = sVar3.b();
            if (b17 != null && b17.equals(d53Var.f453658d)) {
                sVar2 = sVar3;
            }
            i18 = i19;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clickIndex is ");
        sb6.append(i17);
        sb6.append(", cardItemClick is ");
        sb6.append(sVar != null ? sVar.m157837x9616526c() : null);
        sb6.append(", cardItemPicked is ");
        sb6.append(sVar2 != null ? sVar2.m157837x9616526c() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardStorage", sb6.toString());
        if (sVar2 != null && sVar != null) {
            if (i17 < 0) {
                if ((sVar2.g()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sVar2, sVar)) {
                    sVar2.h(d53Var.f453659e);
                } else {
                    m(sVar2, d53Var, sVar, sVar.d());
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sVar, sVar2)) {
                sVar.h(d53Var.f453659e);
                sVar.i(i17);
            } else {
                if (!(sVar2.g())) {
                    if (!(sVar.g())) {
                        m(sVar2, d53Var, sVar, i17);
                    }
                }
                if (sVar.g()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RandomPickCardStorage", "cardItemClick is picked, maybe resp slow");
                }
                sVar2.h(d53Var.f453659e);
                sVar.i(i17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeBack", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p44.s sVar4 = (p44.s) it.next();
            if (sVar4.c() == 1) {
                sVar4.h(0L);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeBack", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSortInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }

    public final void p(java.util.List list, r45.d53 d53Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTmpFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
        java.util.Iterator it = list.iterator();
        p44.s sVar = null;
        p44.s sVar2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p44.s sVar3 = (p44.s) it.next();
            if (!sVar3.g() && (sVar2 == null || sVar2.d() > sVar3.d())) {
                sVar2 = sVar3;
            }
            java.lang.String b17 = sVar3.b();
            if (b17 != null && b17.equals(d53Var.f453658d)) {
                sVar = sVar3;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTmpFreshInfo, pickedItem is ");
        sb6.append(sVar != null ? sVar.m157837x9616526c() : null);
        sb6.append(", firstNoPickItem is ");
        sb6.append(sVar2 != null ? sVar2.m157837x9616526c() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardStorage", sb6.toString());
        if (sVar != null && sVar.g()) {
            sVar.h(c01.id.e());
        } else {
            if (sVar2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTmpFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
                return;
            }
            if (sVar == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTmpFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
                return;
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("swapShowIndexAndOverridePickedFlag", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
                int d17 = sVar2.d();
                sVar.h(1L);
                sVar2.i(sVar.d());
                sVar.i(d17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("swapShowIndexAndOverridePickedFlag", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
            } else {
                m(sVar, d53Var, sVar2, sVar2.d());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTmpFreshInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
    }
}
