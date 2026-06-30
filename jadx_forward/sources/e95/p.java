package e95;

/* loaded from: classes12.dex */
public final class p extends com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26956xf4a0da93 {
    public p(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        super(c26948xabb259c7, str, null, c26987xeef691ab);
    }

    public int a(e95.b bVar, int i17, int i18) {
        boolean z17;
        m107403x3e28f15();
        bVar.acquireReference();
        try {
            if (i17 > 0) {
                try {
                    try {
                        int m107773x3606cc = m107773x3606cc(i17);
                        if (m107773x3606cc < i17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WCDB.SQLiteNewQuery", "startPos %d > actual rows %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m107773x3606cc));
                            bVar.releaseReference();
                            m107405xb81b4f04();
                            return m107773x3606cc;
                        }
                    } catch (java.lang.IllegalStateException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WCDB.SQLiteNewQuery", e17, "fillWindow failed", new java.lang.Object[0]);
                        bVar.releaseReference();
                        m107405xb81b4f04();
                        return 0;
                    }
                } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WCDB.SQLiteNewQuery", "exception: " + e18.getMessage() + "; query: " + m107810xb5886e98());
                    m107802xa8a7f203(e18);
                    throw e18;
                }
            }
            int length = m107806xa71d005c().length;
            int i19 = i18 + i17;
            while (true) {
                if (i17 >= i19) {
                    z17 = false;
                    break;
                }
                if (m107773x3606cc(1) != 1) {
                    z17 = true;
                    break;
                }
                bVar.f331931g = bVar.c();
                for (int i27 = 0; i27 < length; i27++) {
                    int m107771xfb85f7b0 = m107771xfb85f7b0(i27);
                    if (m107771xfb85f7b0 == 0) {
                        e95.a aVar = bVar.f331931g;
                        if (aVar != null) {
                            aVar.s(i27);
                        }
                    } else if (m107771xfb85f7b0 == 1) {
                        long m107769xfb822ef2 = m107769xfb822ef2(i27);
                        e95.a aVar2 = bVar.f331931g;
                        if (aVar2 != null) {
                            aVar2.L(i27, m107769xfb822ef2);
                        }
                    } else if (m107771xfb85f7b0 == 2) {
                        double m107768x160e9ec7 = m107768x160e9ec7(i27);
                        e95.a aVar3 = bVar.f331931g;
                        if (aVar3 != null) {
                            aVar3.r(i27, m107768x160e9ec7);
                        }
                    } else if (m107771xfb85f7b0 == 3) {
                        java.lang.String m107770x2fec8307 = m107770x2fec8307(i27);
                        e95.a aVar4 = bVar.f331931g;
                        if (aVar4 != null) {
                            aVar4.P(i27, m107770x2fec8307);
                        }
                    } else {
                        if (m107771xfb85f7b0 != 4) {
                            bVar.j(i17, 1);
                            throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("Unknown column type when filling window.");
                        }
                        byte[] m107767xfb7d9813 = m107767xfb7d9813(i27);
                        e95.a aVar5 = bVar.f331931g;
                        if (aVar5 != null) {
                            aVar5.I(i27, m107767xfb7d9813);
                        }
                    }
                }
                bVar.j(i17, 0);
                i17++;
            }
            if (!z17) {
                i17 += m107773x3606cc(Integer.MAX_VALUE);
            }
            m107772x6761d4f(true);
            bVar.releaseReference();
            m107405xb81b4f04();
            return i17;
        } catch (java.lang.Throwable th6) {
            bVar.releaseReference();
            m107405xb81b4f04();
            throw th6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r2 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        r12 = r12 + m107773x3606cc(Integer.MAX_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        m107772x6761d4f(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        m107405xb81b4f04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(e95.f r11, int r12, int r13) {
        /*
            r10 = this;
            r10.m107403x3e28f15()
            r0 = 2
            java.lang.String r1 = "WCDB.SQLiteNewQuery"
            r2 = 0
            r3 = 1
            if (r12 <= 0) goto L28
            int r4 = r10.m107773x3606cc(r12)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            if (r4 >= r12) goto L28
            java.lang.String r11 = "startPos %d > actual rows %d"
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            r13[r2] = r12     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            r13[r3] = r12     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r11, r13)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            r10.m107405xb81b4f04()
            return r4
        L28:
            java.lang.String[] r4 = r10.m107806xa71d005c()     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            int r4 = r4.length     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            int r13 = r13 + r12
        L2e:
            if (r12 >= r13) goto L93
            int r5 = r10.m107773x3606cc(r3)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            if (r5 != r3) goto L92
            e95.e r5 = r11.c(r12)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            r6 = r2
        L3b:
            if (r6 >= r4) goto L8f
            int r7 = r10.m107771xfb85f7b0(r6)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            if (r7 == 0) goto L71
            if (r7 == r3) goto L68
            if (r7 == r0) goto L5f
            r8 = 3
            if (r7 == r8) goto L5a
            r8 = 4
            if (r7 != r8) goto L52
            byte[] r7 = r10.m107767xfb7d9813(r6)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            goto L72
        L52:
            com.tencent.wcdb.database.SQLiteException r11 = new com.tencent.wcdb.database.SQLiteException     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            java.lang.String r12 = "Unknown column type when filling window."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            throw r11     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
        L5a:
            java.lang.String r7 = r10.m107770x2fec8307(r6)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            goto L72
        L5f:
            double r7 = r10.m107768x160e9ec7(r6)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            goto L72
        L68:
            long r7 = r10.m107769xfb822ef2(r6)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            goto L72
        L71:
            r7 = 0
        L72:
            int r8 = r5.f331945b     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            int r9 = r5.f331946c     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            if (r8 == r9) goto L87
            int r9 = r8 + 1
            r5.f331945b = r9     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            java.lang.Object[] r9 = r5.f331944a     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            r9[r8] = r7     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            int r6 = r6 + 1
            goto L3b
        L83:
            r11 = move-exception
            goto Lcc
        L85:
            r11 = move-exception
            goto La4
        L87:
            android.database.CursorIndexOutOfBoundsException r11 = new android.database.CursorIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            java.lang.String r12 = "No more columns left."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            throw r11     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
        L8f:
            int r12 = r12 + 1
            goto L2e
        L92:
            r2 = r3
        L93:
            if (r2 != 0) goto L9d
            r11 = 2147483647(0x7fffffff, float:NaN)
            int r11 = r10.m107773x3606cc(r11)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            int r12 = r12 + r11
        L9d:
            r10.m107772x6761d4f(r3)     // Catch: java.lang.Throwable -> L83 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L85
            r10.m107405xb81b4f04()
            return r12
        La4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r12.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r13 = "exception: "
            r12.append(r13)     // Catch: java.lang.Throwable -> L83
            java.lang.String r13 = r11.getMessage()     // Catch: java.lang.Throwable -> L83
            r12.append(r13)     // Catch: java.lang.Throwable -> L83
            java.lang.String r13 = "; query: "
            r12.append(r13)     // Catch: java.lang.Throwable -> L83
            java.lang.String r13 = r10.m107810xb5886e98()     // Catch: java.lang.Throwable -> L83
            r12.append(r13)     // Catch: java.lang.Throwable -> L83
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L83
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r12)     // Catch: java.lang.Throwable -> L83
            r10.m107802xa8a7f203(r11)     // Catch: java.lang.Throwable -> L83
            throw r11     // Catch: java.lang.Throwable -> L83
        Lcc:
            r10.m107405xb81b4f04()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e95.p.b(e95.f, int, int):int");
    }

    /* renamed from: toString */
    public java.lang.String m127201x9616526c() {
        return "SQLiteNewQuery: " + m107810xb5886e98();
    }
}
