package qy1;

/* loaded from: classes13.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final qy1.g f449258a = new qy1.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f449259b = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f449260c = new java.lang.Object();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084 A[Catch: Exception -> 0x00a6, TryCatch #1 {Exception -> 0x00a6, blocks: (B:3:0x0008, B:5:0x0011, B:10:0x0056, B:12:0x0064, B:13:0x006d, B:16:0x0084, B:17:0x0088, B:22:0x0019, B:26:0x002f), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(int r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "reportKey"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            qy1.g r0 = qy1.g.f449258a
            java.lang.String r1 = "SDKCgiReportUtilsMap"
            r2 = 0
            com.tencent.mm.sdk.platformtools.o4 r1 = r0.g(r1, r2)     // Catch: java.lang.Exception -> La6
            if (r1 == 0) goto La6
            java.lang.String r9 = r1.t(r12)     // Catch: java.lang.Exception -> La6
            r10 = 0
            if (r9 != 0) goto L19
            goto L52
        L19:
            java.lang.String r3 = "$"
            java.lang.String[] r4 = new java.lang.String[]{r3}     // Catch: java.lang.Exception -> La6
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r9
            java.util.List r3 = r26.n0.f0(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> La6
            int r4 = r3.size()     // Catch: java.lang.Exception -> La6
            r5 = 2
            if (r4 < r5) goto L52
            java.lang.Object r4 = r3.get(r10)     // Catch: java.lang.NumberFormatException -> L52 java.lang.Exception -> La6
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> L52 java.lang.Exception -> La6
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L52 java.lang.Exception -> La6
            r5 = 1
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.NumberFormatException -> L52 java.lang.Exception -> La6
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L52 java.lang.Exception -> La6
            long r5 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L52 java.lang.Exception -> La6
            jz5.l r3 = new jz5.l     // Catch: java.lang.NumberFormatException -> L52 java.lang.Exception -> La6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L52 java.lang.Exception -> La6
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.NumberFormatException -> L52 java.lang.Exception -> La6
            r3.<init>(r4, r5)     // Catch: java.lang.NumberFormatException -> L52 java.lang.Exception -> La6
            r2 = r3
        L52:
            r3 = 0
            if (r2 == 0) goto L7f
            java.lang.Object r5 = r2.f384367e     // Catch: java.lang.Exception -> La6
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Exception -> La6
            long r5 = r5.longValue()     // Catch: java.lang.Exception -> La6
            boolean r5 = r0.a(r5)     // Catch: java.lang.Exception -> La6
            if (r5 == 0) goto L6d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r9)     // Catch: java.lang.Exception -> La6
            r2 = 10
            r0.l(r2, r9)     // Catch: java.lang.Exception -> La6
            goto L7f
        L6d:
            java.lang.Object r0 = r2.f384366d     // Catch: java.lang.Exception -> La6
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> La6
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> La6
            java.lang.Object r2 = r2.f384367e     // Catch: java.lang.Exception -> La6
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Exception -> La6
            long r5 = r2.longValue()     // Catch: java.lang.Exception -> La6
            r10 = r0
            goto L80
        L7f:
            r5 = r3
        L80:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L88
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> La6
        L88:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La6
            r0.<init>()     // Catch: java.lang.Exception -> La6
            int r11 = r11 + r10
            r0.append(r11)     // Catch: java.lang.Exception -> La6
            r11 = 36
            r0.append(r11)     // Catch: java.lang.Exception -> La6
            r0.append(r5)     // Catch: java.lang.Exception -> La6
            r0.append(r11)     // Catch: java.lang.Exception -> La6
            r0.append(r12)     // Catch: java.lang.Exception -> La6
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Exception -> La6
            r1.D(r12, r11)     // Catch: java.lang.Exception -> La6
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qy1.g.m(int, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if ((12 <= r0 && r0 < 24) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMKvUtils", "lastTime = " + r9 + " timeSection = " + r2 + "  curTime = " + java.lang.System.currentTimeMillis() + ", curTimeSection = " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if ((r0 >= 0 && r0 < 12) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(long r9) {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r0 - r9
            r4 = 3600000(0x36ee80, float:5.044674E-39)
            long r4 = (long) r4
            long r2 = r2 / r4
            r4 = 12
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto L13
            return r3
        L13:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTimeInMillis(r9)
            r6 = 11
            int r2 = r2.get(r6)
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            r7.setTimeInMillis(r0)
            int r0 = r7.get(r6)
            r6 = 0
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            r6 = 0
            if (r1 > 0) goto L38
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 >= 0) goto L38
            r1 = r3
            goto L39
        L38:
            r1 = r6
        L39:
            r7 = 12
            if (r1 == 0) goto L48
            if (r7 > r0) goto L45
            r1 = 24
            if (r0 >= r1) goto L45
            r1 = r3
            goto L46
        L45:
            r1 = r6
        L46:
            if (r1 != 0) goto L60
        L48:
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 > 0) goto L54
            r4 = 24
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 >= 0) goto L54
            r1 = r3
            goto L55
        L54:
            r1 = r6
        L55:
            if (r1 == 0) goto L91
            if (r0 < 0) goto L5d
            if (r0 >= r7) goto L5d
            r1 = r3
            goto L5e
        L5d:
            r1 = r6
        L5e:
            if (r1 == 0) goto L91
        L60:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "lastTime = "
            r1.<init>(r4)
            r1.append(r9)
            java.lang.String r9 = " timeSection = "
            r1.append(r9)
            r1.append(r2)
            java.lang.String r9 = "  curTime = "
            r1.append(r9)
            long r9 = java.lang.System.currentTimeMillis()
            r1.append(r9)
            java.lang.String r9 = ", curTimeSection = "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            java.lang.String r10 = "MicroMsg.MMKvUtils"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r9)
            return r3
        L91:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qy1.g.a(long):boolean");
    }

    public final java.lang.String b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String c17 = c(i17, str, str2);
        if (c17 == null) {
            return null;
        }
        return c17 + '_' + str3;
    }

    public final java.lang.String c(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 <= 0) {
            return null;
        }
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMKvUtils", "itemId is null");
            str = "";
        }
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMKvUtils", "eventId is null");
            str2 = "";
        }
        return i17 + '_' + str + '_' + str2;
    }

    public final java.lang.String d(int i17, r45.uc4 dataInfo) {
        r45.nq5 nq5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataInfo, "dataInfo");
        r45.pq5 pq5Var = dataInfo.f468751e;
        return c(i17, (pq5Var == null || (nq5Var = pq5Var.f464846d) == null) ? null : nq5Var.f463136e, pq5Var != null ? pq5Var.f464847e : null);
    }

    public final r45.rv e(int i17) {
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = g("SDKCgiReportUtilsMap", java.lang.Integer.valueOf(i17));
            if (g17 == null) {
                return null;
            }
            synchronized (f449260c) {
                byte[] j17 = g17.j(java.lang.String.valueOf(i17));
                if (j17 == null) {
                    return null;
                }
                r45.rv rvVar = new r45.rv();
                rvVar.mo11468x92b714fd(j17);
                return rvVar;
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.lang.String f(java.lang.String reportKey, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportKey, "reportKey");
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a("reportKey: " + reportKey + " reportId: " + j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
        return a17;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g(java.lang.String key, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        int n17 = j62.e.g().n();
        if (n17 == 0) {
            return null;
        }
        java.lang.String str = n17 + '_' + key;
        if (num != null) {
            str = str + '_' + num;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str);
    }

    public final long h(java.lang.String mmkvKey, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmkvKey, "mmkvKey");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = g(mmkvKey, java.lang.Integer.valueOf(i17));
            if (g17 != null) {
                return g17.g();
            }
            return -1L;
        } catch (java.lang.Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:7|(3:9|(1:30)(1:13)|(8:15|16|18|19|(2:22|20)|23|24|25)(1:29))|31|16|18|19|(1:20)|23|24|25) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012c A[Catch: Exception -> 0x0136, LOOP:0: B:20:0x0126->B:22:0x012c, LOOP_END, TRY_LEAVE, TryCatch #1 {Exception -> 0x0136, blocks: (B:19:0x0122, B:20:0x0126, B:22:0x012c), top: B:18:0x0122 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l i(java.lang.String r22, int r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qy1.g.i(java.lang.String, int, java.lang.String, boolean):jz5.l");
    }

    public final long j() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = g("SDKCgiReportItemIdMap", null);
            if (g17 != null) {
                long p17 = g17.p("key_cgi_report_id");
                if (p17 > 0 && currentTimeMillis <= p17) {
                    currentTimeMillis = 1 + p17;
                }
                g17.B("key_cgi_report_id", currentTimeMillis);
            }
        } catch (java.lang.Exception unused) {
        }
        return currentTimeMillis;
    }

    public final long k(int i17) {
        if (i17 == 0) {
            return 0L;
        }
        oy1.m mVar = oy1.m.f431418a;
        java.lang.Long l17 = oy1.m.f431424g;
        long j17 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        if (l17 == null) {
            oy1.m.f431424g = java.lang.Long.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_data_report_sdk_cgi_send_fail_retry_delay, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d));
        }
        java.lang.Long l18 = oy1.m.f431424g;
        if (l18 != null) {
            j17 = l18.longValue();
        }
        double d17 = j17;
        if (oy1.m.f431423f == null) {
            oy1.m.f431423f = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_data_report_sdk_cgi_send_fail_retry_factor, 2));
        }
        return (long) (d17 * java.lang.Math.pow((oy1.m.f431423f != null ? r0.intValue() : 2) * 1.0d, i17 - 1));
    }

    public final void l(int i17, java.lang.String errorSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorSource, "errorSource");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6847x6bd30ef2 c6847x6bd30ef2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6847x6bd30ef2();
        c6847x6bd30ef2.f141690d = i17;
        c6847x6bd30ef2.f141691e = c6847x6bd30ef2.b("ErrorSource", errorSource, true);
        c6847x6bd30ef2.k();
    }

    public final void n(int i17, r45.rv config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = g("SDKCgiReportUtilsMap", java.lang.Integer.valueOf(i17));
            if (g17 != null) {
                synchronized (f449260c) {
                    g17.H(java.lang.String.valueOf(i17), config.mo14344x5f01b1f6());
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
