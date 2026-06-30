package p75;

/* loaded from: classes.dex */
public class l0 extends p75.e1 {

    /* renamed from: c, reason: collision with root package name */
    public final long f434203c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f434204d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f434205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(java.lang.String sql, java.lang.String[] strArr, long j17, boolean z17, boolean z18) {
        super(sql, strArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        this.f434203c = j17;
        this.f434204d = z17;
        this.f434205e = z18;
    }

    public final android.database.Cursor f(l75.k0 k0Var, boolean z17) {
        android.database.Cursor B;
        boolean z18 = this.f434204d;
        java.lang.String str = this.f434169a;
        if (!z18 && z17) {
            str = str + " LIMIT 1";
        }
        boolean z19 = this.f434205e;
        java.lang.String[] strArr = this.f434170b;
        if (z19) {
            java.lang.String str2 = "EXPLAIN QUERY PLAN " + str;
            if (k0Var != null && (B = k0Var.B(str2, strArr)) != null) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sql.SelectSql", "explainQueryPlanSql: " + str2);
                    while (B.moveToNext()) {
                        int columnIndex = B.getColumnIndex(dm.i4.f66865x76d1ec5a);
                        int columnIndex2 = B.getColumnIndex("parent");
                        int columnIndex3 = B.getColumnIndex("notused");
                        int columnIndex4 = B.getColumnIndex("detail");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sql.SelectSql", "===== selectId:" + B.getInt(columnIndex) + " order:" + B.getInt(columnIndex2) + " from:" + B.getInt(columnIndex3) + " detail:" + B.getString(columnIndex4));
                    }
                    vz5.b.a(B, null);
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        vz5.b.a(B, th6);
                        throw th7;
                    }
                }
            }
        }
        if (this.f434203c > 0) {
            if (k0Var != null) {
                return k0Var.s(str, strArr);
            }
            return null;
        }
        if (k0Var != null) {
            return k0Var.B(str, strArr);
        }
        return null;
    }

    public final void g(java.lang.Exception exc) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(exc.getClass().getSimpleName(), "OperationCanceledException")) {
            throw exc;
        }
        throw new p75.d0("SQLTimeoutException SQL:" + this.f434169a + " Timeout:" + this.f434203c, exc);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0031: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:32:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(l75.k0 r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            android.database.Cursor r6 = r5.f(r6, r0)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            if (r6 == 0) goto L27
            wu5.c r2 = r5.q(r6)     // Catch: java.lang.Throwable -> L1f
            boolean r3 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L1d
            vz5.b.a(r6, r1)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r2 == 0) goto L18
            r2.cancel(r0)
        L18:
            return r3
        L19:
            r6 = move-exception
            goto L31
        L1b:
            r6 = move-exception
            goto L2d
        L1d:
            r3 = move-exception
            goto L21
        L1f:
            r3 = move-exception
            r2 = r1
        L21:
            throw r3     // Catch: java.lang.Throwable -> L22
        L22:
            r4 = move-exception
            vz5.b.a(r6, r3)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            throw r4     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
        L27:
            r6 = 0
            return r6
        L29:
            r6 = move-exception
            goto L32
        L2b:
            r6 = move-exception
            r2 = r1
        L2d:
            r5.g(r6)     // Catch: java.lang.Throwable -> L19
            throw r1     // Catch: java.lang.Throwable -> L19
        L31:
            r1 = r2
        L32:
            if (r1 == 0) goto L37
            r1.cancel(r0)
        L37:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p75.l0.h(l75.k0):boolean");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0045: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:35:0x0045 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i(l75.k0 r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
            android.database.Cursor r7 = r6.f(r7, r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            if (r7 == 0) goto L37
            wu5.c r4 = r6.q(r7)     // Catch: java.lang.Throwable -> L2b
        L12:
            boolean r5 = r7.moveToNext()     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L24
            int r5 = r7.getInt(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L29
            r0.add(r5)     // Catch: java.lang.Throwable -> L29
            goto L12
        L24:
            vz5.b.a(r7, r3)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r3 = r4
            goto L37
        L29:
            r0 = move-exception
            goto L2d
        L2b:
            r0 = move-exception
            r4 = r3
        L2d:
            throw r0     // Catch: java.lang.Throwable -> L2e
        L2e:
            r2 = move-exception
            vz5.b.a(r7, r0)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            throw r2     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
        L33:
            r7 = move-exception
            goto L45
        L35:
            r7 = move-exception
            goto L41
        L37:
            if (r3 == 0) goto L3c
            r3.cancel(r1)
        L3c:
            return r0
        L3d:
            r7 = move-exception
            goto L46
        L3f:
            r7 = move-exception
            r4 = r3
        L41:
            r6.g(r7)     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L33
        L45:
            r3 = r4
        L46:
            if (r3 == 0) goto L4b
            r3.cancel(r1)
        L4b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p75.l0.i(l75.k0):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0045: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:35:0x0045 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List j(l75.k0 r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
            android.database.Cursor r8 = r7.f(r8, r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            if (r8 == 0) goto L37
            wu5.c r4 = r7.q(r8)     // Catch: java.lang.Throwable -> L2b
        L12:
            boolean r5 = r8.moveToNext()     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L24
            long r5 = r8.getLong(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L29
            r0.add(r5)     // Catch: java.lang.Throwable -> L29
            goto L12
        L24:
            vz5.b.a(r8, r3)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r3 = r4
            goto L37
        L29:
            r0 = move-exception
            goto L2d
        L2b:
            r0 = move-exception
            r4 = r3
        L2d:
            throw r0     // Catch: java.lang.Throwable -> L2e
        L2e:
            r2 = move-exception
            vz5.b.a(r8, r0)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            throw r2     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
        L33:
            r8 = move-exception
            goto L45
        L35:
            r8 = move-exception
            goto L41
        L37:
            if (r3 == 0) goto L3c
            r3.cancel(r1)
        L3c:
            return r0
        L3d:
            r8 = move-exception
            goto L46
        L3f:
            r8 = move-exception
            r4 = r3
        L41:
            r7.g(r8)     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L33
        L45:
            r3 = r4
        L46:
            if (r3 == 0) goto L4b
            r3.cancel(r1)
        L4b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p75.l0.j(l75.k0):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k(l75.k0 r6, java.lang.Class r7) {
        /*
            r5 = this;
            java.lang.String r0 = "clazz"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 1
            r3 = 0
            android.database.Cursor r6 = r5.f(r6, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            if (r6 == 0) goto L3d
            wu5.c r1 = r5.q(r6)     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r4 = r6.moveToNext()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L2a
            java.lang.Object r4 = r7.newInstance()     // Catch: java.lang.Throwable -> L2f
            l75.f0 r4 = (l75.f0) r4     // Catch: java.lang.Throwable -> L2f
            r4.mo9015xbf5d97fd(r6)     // Catch: java.lang.Throwable -> L2f
            r0.add(r4)     // Catch: java.lang.Throwable -> L2f
            goto L17
        L2a:
            vz5.b.a(r6, r3)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r3 = r1
            goto L3d
        L2f:
            r7 = move-exception
            goto L33
        L31:
            r7 = move-exception
            r1 = r3
        L33:
            throw r7     // Catch: java.lang.Throwable -> L34
        L34:
            r0 = move-exception
            vz5.b.a(r6, r7)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            throw r0     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
        L39:
            r6 = move-exception
            goto L4b
        L3b:
            r6 = move-exception
            goto L47
        L3d:
            if (r3 == 0) goto L42
            r3.cancel(r2)
        L42:
            return r0
        L43:
            r6 = move-exception
            goto L4c
        L45:
            r6 = move-exception
            r1 = r3
        L47:
            r5.g(r6)     // Catch: java.lang.Throwable -> L39
            throw r3     // Catch: java.lang.Throwable -> L39
        L4b:
            r3 = r1
        L4c:
            if (r3 == 0) goto L51
            r3.cancel(r2)
        L51:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p75.l0.k(l75.k0, java.lang.Class):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0041: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:35:0x0041 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List l(l75.k0 r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
            android.database.Cursor r7 = r6.f(r7, r2)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            if (r7 == 0) goto L33
            wu5.c r4 = r6.q(r7)     // Catch: java.lang.Throwable -> L27
        L12:
            boolean r5 = r7.moveToNext()     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto L20
            java.lang.String r5 = r7.getString(r2)     // Catch: java.lang.Throwable -> L25
            r0.add(r5)     // Catch: java.lang.Throwable -> L25
            goto L12
        L20:
            vz5.b.a(r7, r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r3 = r4
            goto L33
        L25:
            r0 = move-exception
            goto L29
        L27:
            r0 = move-exception
            r4 = r3
        L29:
            throw r0     // Catch: java.lang.Throwable -> L2a
        L2a:
            r2 = move-exception
            vz5.b.a(r7, r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            throw r2     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
        L2f:
            r7 = move-exception
            goto L41
        L31:
            r7 = move-exception
            goto L3d
        L33:
            if (r3 == 0) goto L38
            r3.cancel(r1)
        L38:
            return r0
        L39:
            r7 = move-exception
            goto L42
        L3b:
            r7 = move-exception
            r4 = r3
        L3d:
            r6.g(r7)     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L41:
            r3 = r4
        L42:
            if (r3 == 0) goto L47
            r3.cancel(r1)
        L47:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p75.l0.l(l75.k0):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0041: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:39:0x0041 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(l75.k0 r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            android.database.Cursor r6 = r5.f(r6, r0)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r2 = 0
            if (r6 == 0) goto L33
            wu5.c r3 = r5.q(r6)     // Catch: java.lang.Throwable -> L27
            boolean r4 = r6.moveToNext()     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L20
            int r2 = r6.getInt(r2)     // Catch: java.lang.Throwable -> L25
            vz5.b.a(r6, r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r3 == 0) goto L1f
            r3.cancel(r0)
        L1f:
            return r2
        L20:
            vz5.b.a(r6, r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r1 = r3
            goto L33
        L25:
            r2 = move-exception
            goto L29
        L27:
            r2 = move-exception
            r3 = r1
        L29:
            throw r2     // Catch: java.lang.Throwable -> L2a
        L2a:
            r4 = move-exception
            vz5.b.a(r6, r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            throw r4     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
        L2f:
            r6 = move-exception
            goto L41
        L31:
            r6 = move-exception
            goto L3d
        L33:
            if (r1 == 0) goto L38
            r1.cancel(r0)
        L38:
            return r2
        L39:
            r6 = move-exception
            goto L42
        L3b:
            r6 = move-exception
            r3 = r1
        L3d:
            r5.g(r6)     // Catch: java.lang.Throwable -> L2f
            throw r1     // Catch: java.lang.Throwable -> L2f
        L41:
            r1 = r3
        L42:
            if (r1 == 0) goto L47
            r1.cancel(r0)
        L47:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p75.l0.m(l75.k0):int");
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0043: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:39:0x0043 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n(l75.k0 r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            android.database.Cursor r6 = r5.f(r6, r0)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            if (r6 == 0) goto L33
            wu5.c r2 = r5.q(r6)     // Catch: java.lang.Throwable -> L27
            boolean r3 = r6.moveToNext()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L20
            r3 = 0
            long r3 = r6.getLong(r3)     // Catch: java.lang.Throwable -> L25
            vz5.b.a(r6, r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r2 == 0) goto L1f
            r2.cancel(r0)
        L1f:
            return r3
        L20:
            vz5.b.a(r6, r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r1 = r2
            goto L33
        L25:
            r3 = move-exception
            goto L29
        L27:
            r3 = move-exception
            r2 = r1
        L29:
            throw r3     // Catch: java.lang.Throwable -> L2a
        L2a:
            r4 = move-exception
            vz5.b.a(r6, r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            throw r4     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
        L2f:
            r6 = move-exception
            goto L43
        L31:
            r6 = move-exception
            goto L3f
        L33:
            if (r1 == 0) goto L38
            r1.cancel(r0)
        L38:
            r0 = 0
            return r0
        L3b:
            r6 = move-exception
            goto L44
        L3d:
            r6 = move-exception
            r2 = r1
        L3f:
            r5.g(r6)     // Catch: java.lang.Throwable -> L2f
            throw r1     // Catch: java.lang.Throwable -> L2f
        L43:
            r1 = r2
        L44:
            if (r1 == 0) goto L49
            r1.cancel(r0)
        L49:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p75.l0.n(l75.k0):long");
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:38:0x004a */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l75.f0 o(l75.k0 r5, java.lang.Class r6) {
        /*
            r4 = this;
            java.lang.String r0 = "clazz"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            r0 = 1
            r1 = 0
            android.database.Cursor r5 = r4.f(r5, r0)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L3b
            wu5.c r2 = r4.q(r5)     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r5.moveToNext()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L29
            java.lang.Object r6 = r6.newInstance()     // Catch: java.lang.Throwable -> L2d
            l75.f0 r6 = (l75.f0) r6     // Catch: java.lang.Throwable -> L2d
            r6.mo9015xbf5d97fd(r5)     // Catch: java.lang.Throwable -> L2d
            vz5.b.a(r5, r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            if (r2 == 0) goto L28
            r2.cancel(r0)
        L28:
            return r6
        L29:
            vz5.b.a(r5, r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            goto L3c
        L2d:
            r6 = move-exception
            goto L31
        L2f:
            r6 = move-exception
            r2 = r1
        L31:
            throw r6     // Catch: java.lang.Throwable -> L32
        L32:
            r3 = move-exception
            vz5.b.a(r5, r6)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            throw r3     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
        L37:
            r5 = move-exception
            goto L4a
        L39:
            r5 = move-exception
            goto L46
        L3b:
            r2 = r1
        L3c:
            if (r2 == 0) goto L41
            r2.cancel(r0)
        L41:
            return r1
        L42:
            r5 = move-exception
            goto L4b
        L44:
            r5 = move-exception
            r2 = r1
        L46:
            r4.g(r5)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L4a:
            r1 = r2
        L4b:
            if (r1 == 0) goto L50
            r1.cancel(r0)
        L50:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p75.l0.o(l75.k0, java.lang.Class):l75.f0");
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0041: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:38:0x0041 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String p(l75.k0 r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            android.database.Cursor r6 = r5.f(r6, r0)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            if (r6 == 0) goto L32
            wu5.c r2 = r5.q(r6)     // Catch: java.lang.Throwable -> L26
            boolean r3 = r6.moveToNext()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L20
            r3 = 0
            java.lang.String r3 = r6.getString(r3)     // Catch: java.lang.Throwable -> L24
            vz5.b.a(r6, r1)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            if (r2 == 0) goto L1f
            r2.cancel(r0)
        L1f:
            return r3
        L20:
            vz5.b.a(r6, r1)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            goto L33
        L24:
            r3 = move-exception
            goto L28
        L26:
            r3 = move-exception
            r2 = r1
        L28:
            throw r3     // Catch: java.lang.Throwable -> L29
        L29:
            r4 = move-exception
            vz5.b.a(r6, r3)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            throw r4     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
        L2e:
            r6 = move-exception
            goto L41
        L30:
            r6 = move-exception
            goto L3d
        L32:
            r2 = r1
        L33:
            if (r2 == 0) goto L38
            r2.cancel(r0)
        L38:
            return r1
        L39:
            r6 = move-exception
            goto L42
        L3b:
            r6 = move-exception
            r2 = r1
        L3d:
            r5.g(r6)     // Catch: java.lang.Throwable -> L2e
            throw r1     // Catch: java.lang.Throwable -> L2e
        L41:
            r1 = r2
        L42:
            if (r1 == 0) goto L47
            r1.cancel(r0)
        L47:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p75.l0.p(l75.k0):java.lang.String");
    }

    public final wu5.c q(android.database.Cursor cursor) {
        if (!(cursor instanceof l75.h0)) {
            return null;
        }
        return ((ku5.t0) ku5.t0.f394148d).k(new p75.k0(cursor), this.f434203c);
    }
}
