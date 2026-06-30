package y84;

/* loaded from: classes.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public static final y84.p3 f541725a = new y84.p3();

    public final java.lang.String a(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectCardListCacheKey", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardStorage");
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                str2 = gm0.j1.b().j();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            } else {
                str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69896xb5887524();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("RandomSelectCardStorage", th6);
            str2 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardStorage");
        sb6.append(str2);
        sb6.append('_');
        sb6.append(str);
        sb6.append("_selectCardList");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectCardListCacheKey", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardStorage");
        return sb7;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:20:0x0011, B:5:0x001f, B:9:0x002b, B:11:0x0035, B:15:0x004e, B:16:0x0051), top: B:19:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r8, org.json.JSONArray r9) {
        /*
            r7 = this;
            java.lang.String r0 = "saveRandomSelectCardList, key is "
            java.lang.String r1 = "saveRandomSelectCardList"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardStorage"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            r3 = 0
            r4 = 1
            java.lang.String r5 = "RandomSelectCardStorage"
            if (r8 == 0) goto L1c
            int r6 = r8.length()     // Catch: java.lang.Throwable -> L1a
            if (r6 != 0) goto L18
            goto L1c
        L18:
            r6 = r3
            goto L1d
        L1a:
            r8 = move-exception
            goto L69
        L1c:
            r6 = r4
        L1d:
            if (r6 == 0) goto L29
            java.lang.String r8 = "saveRandomSelectCardList, vangoghId is null or empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r8)     // Catch: java.lang.Throwable -> L1a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)     // Catch: java.lang.Throwable -> L1a
            return
        L29:
            if (r9 != 0) goto L35
            java.lang.String r8 = "saveRandomSelectCardList, selectedCards is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r8)     // Catch: java.lang.Throwable -> L1a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)     // Catch: java.lang.Throwable -> L1a
            return
        L35:
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r6 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r6)     // Catch: java.lang.Throwable -> L1a
            y84.p3 r6 = y84.p3.f541725a     // Catch: java.lang.Throwable -> L1a
            java.lang.String r8 = r6.a(r8)     // Catch: java.lang.Throwable -> L1a
            int r6 = r9.length()     // Catch: java.lang.Throwable -> L1a
            if (r6 != 0) goto L4c
            r3 = r4
        L4c:
            if (r3 != 0) goto L51
            p34.o.i(r8, r9)     // Catch: java.lang.Throwable -> L1a
        L51:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            r3.append(r8)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r8 = ", ret is "
            r3.append(r8)     // Catch: java.lang.Throwable -> L1a
            r3.append(r9)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L1a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r8)     // Catch: java.lang.Throwable -> L1a
            goto L6c
        L69:
            ca4.q.c(r5, r8)
        L6c:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y84.p3.b(java.lang.String, org.json.JSONArray):void");
    }
}
