package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public abstract class f1 {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.net.URL r7) {
        /*
            java.lang.String r0 = "MicroMsg.WebViewReportOnLeaveHelper"
            r1 = 0
            if (r7 != 0) goto Lc
            java.lang.String r7 = "url is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r7)
            return r1
        Lc:
            java.lang.String r7 = r7.getHost()
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r2 == 0) goto L1d
            java.lang.String r7 = "url host is empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r7)
            return r1
        L1d:
            boolean r2 = gm0.j1.a()
            if (r2 != 0) goto L29
            java.lang.String r7 = "account hasn't initialized"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r7)
            return r1
        L29:
            java.lang.Class<c25.e> r2 = c25.e.class
            lm0.a r2 = gm0.j1.s(r2)
            c25.e r2 = (c25.e) r2
            com.tencent.mm.plugin.zero.a r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) r2
            ip.e r2 = r2.a()
            r2.getClass()
            java.lang.String r3 = "reportOnLeaveDomains"
            java.lang.String r4 = "domain"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.String r3 = ip.h.a(r3)
            r4 = 1
            ip.h r2 = r2.d(r4)
            if (r2 != 0) goto L4e
            goto L76
        L4e:
            boolean r5 = r2 instanceof ip.i
            if (r5 == 0) goto L76
            ip.i r2 = (ip.i) r2
            java.util.HashMap r2 = r2.f375101f
            java.lang.String r5 = "MPConfig"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L76
            java.lang.Object r2 = r2.get(r5)
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r3)
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L6f
            java.util.List r2 = (java.util.List) r2
            goto L77
        L6f:
            java.lang.String r2 = "MicroMsg.ConfigListInfoExtension"
            java.lang.String r3 = "get item list, but item object no instance of list"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r3)
        L76:
            r2 = 0
        L77:
            if (r2 == 0) goto L96
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L96
            java.util.Iterator r3 = r2.iterator()
        L83:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L96
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L83
            return r4
        L96:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r7
            if (r2 == 0) goto La1
            int r1 = r2.size()
        La1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r4] = r1
            java.lang.String r1 = "miss match for host string, current host: %s, config list size: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1, r3)
            r0 = 2131769611(0x7f10390b, float:1.9170502E38)
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(r0)
            boolean r7 = r7.equals(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.f1.a(java.net.URL):boolean");
    }

    public static int b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewReportOnLeaveHelper", "doReport invalid reportData %s", str);
            return -1;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.tl0();
        lVar.f152198b = new r45.ul0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/exitreport";
        lVar.f152200d = 1642;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        ((r45.tl0) a17.f152243a.f152217a).f468075d = str;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.d1());
        return 0;
    }

    public static void c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewReportOnLeaveHelper", "doReportMusic invalid reportData %s", str);
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.e1.class, null);
        }
    }
}
