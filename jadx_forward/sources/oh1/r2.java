package oh1;

/* loaded from: classes4.dex */
public enum r2 implements vg3.q4 {
    INSTANCE;

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        return str + "#WxaWeAppPushCommandMgr#" + str2;
    }

    public java.lang.Long f(java.lang.String str, java.lang.String str2) {
        k91.v Ui = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui();
        if (Ui == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaWeAppPushCommandMgr", "getExpireTime(appId:%s, type:%s), kvStorage==NULL, account initialized:%b", str, str2, java.lang.Boolean.valueOf(gm0.j1.b().f354787q));
            return null;
        }
        java.lang.String z07 = Ui.z0(b(str, str2), "");
        if (android.text.TextUtils.isEmpty(z07)) {
            return null;
        }
        if (java.lang.Long.valueOf(z07).longValue() < java.lang.System.currentTimeMillis()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().d(b(str, str2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaWeAppPushCommandMgr", "delete data app id=" + str);
        }
        return java.lang.Long.valueOf(z07);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    @Override // vg3.q4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String r18, java.util.Map r19, com.p314xaae8f345.mm.p944x882e457a.p0 r20) {
        /*
            r17 = this;
            r0 = r19
            java.lang.String r1 = "WeAppPushCommand"
            r2 = r18
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lcb
            r1 = 0
            java.lang.String r2 = ".sysmsg.WeAppPushCommand.weapp"
            r4 = r1
            r3 = r2
        L11:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r6 = ".$cmdtype"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r7 = ".$appid"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = ".expireSeconds"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            r8 = 1
            if (r7 != 0) goto L71
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L71
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto L71
            boolean r7 = android.text.TextUtils.isDigitsOnly(r3)
            if (r7 == 0) goto L71
            r7 = r8
            goto L72
        L71:
            r7 = r1
        L72:
            if (r7 == 0) goto La2
            r5.getClass()
            java.lang.String r7 = "copypath"
            boolean r9 = r5.equals(r7)
            if (r9 != 0) goto L80
            goto La2
        L80:
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            long r9 = r9.longValue()
            k91.v r11 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui()
            r12 = r17
            java.lang.String r7 = r12.b(r6, r7)
            long r13 = java.lang.System.currentTimeMillis()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r15
            long r13 = r13 + r9
            java.lang.String r9 = java.lang.String.valueOf(r13)
            r11.P2(r7, r9)
            goto La4
        La2:
            r12 = r17
        La4:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r7, r6, r5, r3}
            java.lang.String r5 = "MicroMsg.WxaWeAppPushCommandMgr"
            java.lang.String r6 = "[consumeNewXml] index = %d, appId =%s, cmdType=%s, expireSeconds = %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r6, r3)
            int r4 = r4 + r8
            if (r4 != 0) goto Lb8
            r3 = r2
            goto Lc4
        Lb8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        Lc4:
            boolean r5 = r0.containsKey(r3)
            if (r5 != 0) goto L11
            goto Lcd
        Lcb:
            r12 = r17
        Lcd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oh1.r2.k7(java.lang.String, java.util.Map, com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }
}
