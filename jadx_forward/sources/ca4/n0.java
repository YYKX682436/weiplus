package ca4;

/* loaded from: classes4.dex */
public abstract class n0 {
    public static final void a(int i17, int i18, int i19, boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("idKey", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtilKt", "idkey, id=" + i17 + ". key=" + i18 + ", count=" + i19 + ", reportKv=" + z17);
        if (i19 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("idKey", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
            return;
        }
        jx3.f.INSTANCE.w(i17, i18, i19);
        if (z17) {
            if (str == null) {
                str = "";
            }
            ca4.e0.b("ad_common_id_key", str, i17, i18, java.lang.String.valueOf(i19));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("idKey", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
    }

    public static final void b(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("idKeyAndKv", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        a(i17, i18, 1, true, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("idKeyAndKv", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
    }

    public static final boolean c(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isActivityFinishing", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        boolean z17 = true;
        if (activity == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isActivityFinishing", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
            return true;
        }
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isActivityFinishing", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if ((r10 == null || r10.length() == 0) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(java.lang.String r10) {
        /*
            java.lang.String r0 = "isValidAdCanvasXmlFormat"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.data.SnsAdUtilKt"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            e42.c0 r2 = e42.c0.clicfg_ad_check_msg_canvas_xml
            r3 = 1
            int r2 = ca4.m0.u0(r2, r3)
            r4 = 0
            if (r2 != r3) goto L81
            java.lang.String r2 = "AdLandingPagesParseHelper"
            java.lang.String r5 = "isValidCanvasXmlFormat"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r6)
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r10)
            if (r7 == 0) goto L26
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r6)
            goto L90
        L26:
            com.tencent.mm.plugin.report.service.g0 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r8 = 2023(0x7e7, float:2.835E-42)
            r9 = 22
            r7.A(r8, r9)
            java.lang.String r7 = "adCanvasInfo"
            r9 = 0
            java.util.Map r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(r10, r7, r9)     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L58
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L45
            if (r7 <= 0) goto L58
            r10.length()     // Catch: java.lang.Throwable -> L45
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r6)
            goto L91
        L45:
            r3 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "isValidAdCanvasXmlFormat, exp="
            r7.<init>(r9)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r3)
        L58:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "isValidAdCanvasXmlFormat, len="
            r3.<init>(r7)
            int r7 = r10.length()
            r3.append(r7)
            java.lang.String r7 = ", xml="
            r3.append(r7)
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r10)
            com.tencent.mm.plugin.report.service.g0 r10 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r2 = 23
            r10.A(r8, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r6)
            goto L90
        L81:
            if (r10 == 0) goto L8c
            int r10 = r10.length()
            if (r10 != 0) goto L8a
            goto L8c
        L8a:
            r10 = r4
            goto L8d
        L8c:
            r10 = r3
        L8d:
            if (r10 != 0) goto L90
            goto L91
        L90:
            r3 = r4
        L91:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "isValidAdCanvasXmlFormat, ret="
            r10.<init>(r2)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            java.lang.String r2 = "SnsAdUtilKt"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ca4.n0.d(java.lang.String):boolean");
    }

    public static final int e(java.lang.String str, int i17) {
        int i18;
        java.lang.String obj;
        int parseInt;
        int parseInt2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseColorStr", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        if (str != null) {
            try {
                obj = r26.n0.u0(str).toString();
            } catch (java.lang.Throwable th6) {
                ca4.q.c("ad_dynamic_error", th6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdUtilKt", "parse color from string failed, return default value!");
            }
            if (obj != null) {
                if (r26.i0.y(obj, "#", false)) {
                    i18 = android.graphics.Color.parseColor(str);
                } else {
                    if (r26.i0.y(obj, "rgba", true)) {
                        java.lang.CharSequence u07 = r26.n0.u0(obj.subSequence(4, obj.length()));
                        if (u07.length() > 2) {
                            java.util.List f07 = r26.n0.f0(u07.subSequence(1, u07.length() - 1), new java.lang.String[]{","}, false, 0, 6, null);
                            if (f07.size() == 4) {
                                parseInt = (((int) (java.lang.Float.parseFloat(r26.n0.u0((java.lang.String) f07.get(3)).toString()) * 255)) << 24) | (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f07.get(0)).toString()) << 16) | (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f07.get(1)).toString()) << 8);
                                parseInt2 = java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f07.get(2)).toString());
                            }
                        }
                        i18 = i17;
                    } else {
                        if (r26.i0.y(obj, "rgb", true)) {
                            java.lang.CharSequence u08 = r26.n0.u0(obj.subSequence(3, obj.length()));
                            if (u08.length() > 2) {
                                java.util.List f08 = r26.n0.f0(u08.subSequence(1, u08.length() - 1), new java.lang.String[]{","}, false, 0, 6, null);
                                if (f08.size() == 3) {
                                    parseInt = (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f08.get(0)).toString()) << 16) | (-16777216) | (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f08.get(1)).toString()) << 8);
                                    parseInt2 = java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f08.get(2)).toString());
                                }
                            }
                        }
                        i18 = i17;
                    }
                    i18 = parseInt2 | parseInt;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseColorStr", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
                return i18;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseColorStr", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        return i17;
    }
}
