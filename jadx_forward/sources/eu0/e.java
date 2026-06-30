package eu0;

/* loaded from: classes.dex */
public final class e implements gu0.n2 {
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "appId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = "localId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            r0 = 0
            java.lang.Class<q80.g0> r1 = q80.g0.class
            i95.m r1 = i95.n0.c(r1)     // Catch: java.lang.Exception -> L2c
            q80.g0 r1 = (q80.g0) r1     // Catch: java.lang.Exception -> L2c
            com.tencent.mm.feature.lite.i r1 = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) r1     // Catch: java.lang.Exception -> L2c
            r2 = 0
            java.lang.String r1 = r1.zj(r5, r2, r6)     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L26
            int r5 = r1.length()     // Catch: java.lang.Exception -> L2c
            if (r5 != 0) goto L24
            goto L26
        L24:
            r5 = 0
            goto L27
        L26:
            r5 = 1
        L27:
            if (r5 == 0) goto L2a
            goto L54
        L2a:
            r0 = r1
            goto L54
        L2c:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "resolveLocalIdToPath failed for appId="
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = ", localId="
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = ", error="
            r2.append(r5)
            java.lang.String r5 = r1.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r6 = "MJCC.LiteAppStore"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r6, r5)
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eu0.e.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public java.lang.String b(java.lang.String appId, java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        try {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65291x71b41ca8(0L, appId, filePath);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
