package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class a2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.g {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f186870a;

    public a2(zy2.fa redDotManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        this.f186870a = redDotManager;
    }

    public final boolean a(long j17, java.util.Map map) {
        int P = map.containsKey(".sysmsg.newtips.control.android_min_clientversion") ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.newtips.control.android_min_clientversion"), 0) : 0;
        int P2 = map.containsKey(".sysmsg.newtips.control.android_max_clientversion") ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.newtips.control.android_max_clientversion"), Integer.MAX_VALUE) : 0;
        int i17 = o45.wf.f424562g;
        if (i17 >= P && i17 <= P2) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.NewTipsTransform", "tipsId=%s, checkValidClientVersion client not match(%s, %s) %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(P2), java.lang.Integer.valueOf(o45.wf.f424562g));
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ((!r5.isEmpty()) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map b(java.util.Map r5, long r6) {
        /*
            r4 = this;
            java.lang.String r0 = ".sysmsg.newtips.ext_info"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L2b
            int r2 = r5.length()
            if (r2 <= 0) goto L14
            r2 = r0
            goto L15
        L14:
            r2 = 0
        L15:
            if (r2 == 0) goto L18
            goto L19
        L18:
            r5 = r1
        L19:
            if (r5 == 0) goto L2b
            java.lang.String r2 = "finder"
            java.util.Map r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(r5, r2, r1)
            if (r5 == 0) goto L2b
            boolean r2 = r5.isEmpty()
            r2 = r2 ^ r0
            if (r2 == 0) goto L2b
            goto L2c
        L2b:
            r5 = r1
        L2c:
            if (r5 == 0) goto L56
            java.lang.String r2 = ".finder.reddot_type"
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L3d
            java.lang.Integer r2 = r26.h0.h(r2)
            goto L3e
        L3d:
            r2 = r1
        L3e:
            if (r2 != 0) goto L41
            goto L56
        L41:
            int r2 = r2.intValue()
            if (r2 != r0) goto L56
            r2 = 40001001(0x2625de9, double:1.97631204E-316)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L55
            r2 = 40001002(0x2625dea, double:1.9763121E-316)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 != 0) goto L56
        L55:
            return r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a2.b(java.util.Map, long):java.util.Map");
    }
}
