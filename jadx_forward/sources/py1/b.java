package py1;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f440575a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f440576b = new java.util.LinkedHashMap();

    public b(int i17) {
        this.f440575a = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r8.equals("abnormal") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        e(26, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r8.equals("send_err") == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r6, r45.uc4 r8, int r9, boolean r10) {
        /*
            r5 = this;
            java.lang.String r0 = "repetition add item localId = ["
            qy1.g r1 = qy1.g.f449258a
            int r2 = r5.f440575a
            java.lang.String r2 = r1.d(r2, r8)
            if (r2 != 0) goto Lf
            java.lang.String r2 = ""
        Lf:
            java.lang.String r8 = r8.f468752f
            if (r8 == 0) goto L63
            int r3 = r8.hashCode()
            r4 = 3198(0xc7e, float:4.481E-42)
            if (r3 == r4) goto L53
            r4 = 1247773742(0x4a5f842e, float:3662091.5)
            if (r3 == r4) goto L43
            r4 = 1544803905(0x5c13d641, float:1.6644958E17)
            if (r3 == r4) goto L34
            r4 = 1585146952(0x5e7b6c48, float:4.5292336E18)
            if (r3 == r4) goto L2b
            goto L63
        L2b:
            java.lang.String r3 = "abnormal"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L4d
            goto L63
        L34:
            java.lang.String r3 = "default"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L3d
            goto L63
        L3d:
            r3 = 21
            r5.e(r3, r9)
            goto L63
        L43:
            java.lang.String r3 = "send_err"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L4d
            goto L63
        L4d:
            r3 = 26
            r5.e(r3, r9)
            goto L63
        L53:
            java.lang.String r3 = "db"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L5c
            goto L63
        L5c:
            if (r10 == 0) goto L63
            r3 = 31
            r5.e(r3, r9)
        L63:
            java.util.Map r9 = r5.f440576b
            monitor-enter(r9)
            java.lang.String r3 = "history"
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r3)     // Catch: java.lang.Throwable -> Lc3
            if (r3 != 0) goto Lc1
            if (r10 != 0) goto Lc1
            java.util.Map r10 = r5.f440576b     // Catch: java.lang.Throwable -> Lc3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lc3
            boolean r10 = r10.containsKey(r3)     // Catch: java.lang.Throwable -> Lc3
            if (r10 != 0) goto L96
            java.util.Map r10 = r5.f440576b     // Catch: java.lang.Throwable -> Lc3
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lc3
            py1.a r1 = new py1.a     // Catch: java.lang.Throwable -> Lc3
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> Lc3
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc3
            r1.f440572b = r6     // Catch: java.lang.Throwable -> Lc3
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)     // Catch: java.lang.Throwable -> Lc3
            r1.f440574d = r8     // Catch: java.lang.Throwable -> Lc3
            r10.put(r0, r1)     // Catch: java.lang.Throwable -> Lc3
            goto Lc1
        L96:
            jx3.f r10 = jx3.f.INSTANCE     // Catch: java.lang.Throwable -> Lc3
            r3 = 2007(0x7d7, float:2.812E-42)
            r4 = 41
            r10.t(r3, r4)     // Catch: java.lang.Throwable -> Lc3
            r10 = 6
            r1.l(r10, r2)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r10 = "MicroMsg.CgiEventObserveService"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lc3
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r6 = "], dataSource = ["
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc3
            r1.append(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 93
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> Lc3
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r10, r6)     // Catch: java.lang.Throwable -> Lc3
        Lc1:
            monitor-exit(r9)
            return
        Lc3:
            r6 = move-exception
            monitor-exit(r9)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: py1.b.a(long, r45.uc4, int, boolean):void");
    }

    public void b(java.lang.Long l17, py1.c eventType, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventType, "eventType");
        jz5.f0 f0Var = null;
        jz5.f0 f0Var2 = null;
        jz5.f0 f0Var3 = null;
        switch (eventType.ordinal()) {
            case 0:
                if (l17 != null) {
                    long longValue = l17.longValue();
                    if ((obj instanceof jz5.l ? (jz5.l) obj : null) != null) {
                        jz5.l lVar = (jz5.l) obj;
                        a(longValue, (r45.uc4) lVar.f384366d, ((java.lang.Number) lVar.f384367e).intValue(), false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (l17 != null) {
                    long longValue2 = l17.longValue();
                    if ((obj instanceof jz5.l ? (jz5.l) obj : null) != null) {
                        jz5.l lVar2 = (jz5.l) obj;
                        a(longValue2, (r45.uc4) lVar2.f384366d, ((java.lang.Number) lVar2.f384367e).intValue(), true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (l17 != null) {
                    long longValue3 = l17.longValue();
                    synchronized (this.f440576b) {
                        py1.a aVar = (py1.a) ((java.util.LinkedHashMap) this.f440576b).get(java.lang.Long.valueOf(longValue3));
                        if (aVar != null) {
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f440574d, "history")) {
                                aVar.f440573c = java.lang.System.currentTimeMillis();
                                f0Var3 = jz5.f0.f384359a;
                            }
                        }
                        if (f0Var3 == null) {
                            f(3);
                        }
                    }
                    return;
                }
                return;
            case 3:
                if (l17 != null) {
                    long longValue4 = l17.longValue();
                    synchronized (this.f440576b) {
                        py1.a aVar2 = (py1.a) ((java.util.LinkedHashMap) this.f440576b).get(java.lang.Long.valueOf(longValue4));
                        if (aVar2 != null) {
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar2.f440574d, "history")) {
                                if (aVar2.f440573c > 0) {
                                    long currentTimeMillis = java.lang.System.currentTimeMillis() - aVar2.f440573c;
                                    c(16, currentTimeMillis, aVar2.f440571a);
                                    aVar2.f440573c = 0L;
                                    long j17 = currentTimeMillis / 1000;
                                }
                                f0Var2 = jz5.f0.f384359a;
                            }
                        }
                        if (f0Var2 == null) {
                            f(4);
                        }
                    }
                    return;
                }
                return;
            case 4:
                if (l17 != null) {
                    long longValue5 = l17.longValue();
                    synchronized (this.f440576b) {
                        py1.a aVar3 = (py1.a) ((java.util.LinkedHashMap) this.f440576b).get(java.lang.Long.valueOf(longValue5));
                        if (aVar3 != null) {
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar3.f440574d, "history") && aVar3.f440572b > 0) {
                                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - aVar3.f440572b;
                                c(11, currentTimeMillis2, aVar3.f440571a);
                                long j18 = currentTimeMillis2 / 1000;
                                aVar3.f440572b = 0L;
                            }
                            f0Var = jz5.f0.f384359a;
                        }
                        if (f0Var == null) {
                            f(5);
                        }
                    }
                    return;
                }
                return;
            case 5:
                d(39);
                return;
            case 6:
                d(40);
                return;
            case 7:
                d(38);
                return;
            case 8:
                d(103);
                return;
            case 9:
                d(102);
                return;
            case 10:
                jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, 36);
                qy1.g.f449258a.l(1, "");
                return;
            case 11:
                jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, 37);
                qy1.g.f449258a.l(2, "");
                return;
            case 12:
                d(101);
                return;
            case 13:
                d(104);
                return;
            case 14:
                java.lang.Long l18 = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
                if (l18 != null) {
                    l18.longValue();
                    return;
                }
                return;
            case 15:
                d(43);
                return;
            case 16:
                d(44);
                return;
            default:
                return;
        }
    }

    public final void c(int i17, long j17, java.lang.String str) {
        long j18 = j17 / 1000;
        boolean z17 = false;
        if (0 <= j18 && j18 < 2) {
            z17 = true;
        }
        if (z17) {
            i17 += 0;
        } else if (j18 == 2) {
            i17++;
        } else if (j18 == 3) {
            i17 += 2;
        } else if (j18 == 4) {
            i17 += 3;
        } else if (j18 > 4) {
            i17 += 4;
        }
        jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, i17);
        if (j18 > 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiEventObserveService", str + "  total time = " + j18);
        }
    }

    public final void d(int i17) {
        jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, i17);
    }

    public final void e(int i17, int i18) {
        boolean z17 = false;
        if (1 <= i18 && i18 < 11) {
            i17 += 0;
        } else {
            if (11 <= i18 && i18 < 21) {
                i17++;
            } else {
                if (21 <= i18 && i18 < 51) {
                    i17 += 2;
                } else {
                    if (51 <= i18 && i18 < 101) {
                        z17 = true;
                    }
                    if (z17) {
                        i17 += 3;
                    } else if (i18 > 100) {
                        i17 += 4;
                    }
                }
            }
        }
        jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, i17);
    }

    public final void f(int i17) {
        jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, 42);
        qy1.g.f449258a.l(i17, "");
    }
}
