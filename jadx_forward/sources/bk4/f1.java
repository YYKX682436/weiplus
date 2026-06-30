package bk4;

/* loaded from: classes11.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.f1 f103007a = new bk4.f1();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
    
        r2.f103087a = true;
        r2.f103088b = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bk4.s a() {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.TextStatus.TextStatusRedDotHelper"
            java.lang.Class<e42.e0> r1 = e42.e0.class
            i95.m r1 = i95.n0.c(r1)
            e42.e0 r1 = (e42.e0) r1
            e42.d0 r2 = e42.d0.clicfg_text_state_square_reddot_and
            h62.d r1 = (h62.d) r1
            java.lang.String r3 = ""
            r4 = 1
            java.lang.String r1 = r1.Zi(r2, r3, r4)
            bk4.s r2 = new bk4.s
            r5 = 0
            r6 = 0
            r7 = 3
            r2.<init>(r5, r6, r7, r6)
            if (r1 == 0) goto L28
            boolean r6 = r26.n0.N(r1)
            if (r6 == 0) goto L26
            goto L28
        L26:
            r6 = r5
            goto L29
        L28:
            r6 = r4
        L29:
            if (r6 != 0) goto Lc5
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc5
            r6.<init>(r1)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "durations"
            org.json.JSONArray r1 = r6.optJSONArray(r1)     // Catch: java.lang.Throwable -> Lc5
            java.util.List r1 = bi4.t1.b(r1)     // Catch: java.lang.Throwable -> Lc5
            r6 = r1
            java.util.LinkedList r6 = (java.util.LinkedList) r6     // Catch: java.lang.Throwable -> Lc5
            int r6 = r6.size()     // Catch: java.lang.Throwable -> Lc5
            if (r6 <= 0) goto Lc5
            long r8 = c01.id.c()     // Catch: java.lang.Throwable -> Lc5
            java.util.Calendar r6 = bi4.v1.b(r8)     // Catch: java.lang.Throwable -> Lc5
            if (r6 == 0) goto Lc5
            r8 = 11
            int r8 = r6.get(r8)     // Catch: java.lang.Throwable -> Lc5
            r9 = 12
            int r6 = r6.get(r9)     // Catch: java.lang.Throwable -> Lc5
            int r9 = r8 * 60
            int r9 = r9 + r6
            java.lang.String r10 = "squareRedDotConfig cur h:%s, m:%s, tm:%s"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Lc5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lc5
            r7[r5] = r8     // Catch: java.lang.Throwable -> Lc5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lc5
            r7[r4] = r5     // Catch: java.lang.Throwable -> Lc5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lc5
            r6 = 2
            r7[r6] = r5     // Catch: java.lang.Throwable -> Lc5
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r10, r7)     // Catch: java.lang.Throwable -> Lc5
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lc5
        L7b:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc5
            if (r5 == 0) goto Lc5
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> Lc5
            bi4.t1 r5 = (bi4.t1) r5     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = "squareRedDotConfig DurationData:%s"
            java.lang.Object[] r7 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> Lc5
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r6, r7)     // Catch: java.lang.Throwable -> Lc5
            boolean r6 = r5.a(r9)     // Catch: java.lang.Throwable -> Lc5
            if (r6 == 0) goto L7b
            gm0.b0 r6 = gm0.j1.u()     // Catch: java.lang.Throwable -> Lc5
            com.tencent.mm.storage.n3 r6 = r6.c()     // Catch: java.lang.Throwable -> Lc5
            com.tencent.mm.storage.u3 r7 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_SQUARE_RED_DOT_TAG_STRING     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = r6.v(r7, r3)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r7 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r7)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r7 = "squrered"
            java.lang.String r7 = bi4.v1.c(r7, r5)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r8 = "squareRedDotConfig curtag:%s, targetTag:%s"
            java.lang.Object[] r10 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> Lc5
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r8, r10)     // Catch: java.lang.Throwable -> Lc5
            boolean r6 = android.text.TextUtils.equals(r6, r7)     // Catch: java.lang.Throwable -> Lc5
            if (r6 != 0) goto L7b
            r2.f103087a = r4     // Catch: java.lang.Throwable -> Lc5
            r2.f103088b = r5     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bk4.f1.a():bk4.s");
    }
}
