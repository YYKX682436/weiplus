package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public class ka extends l75.s0 implements xg3.r0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f276610e = {"CREATE TABLE IF NOT EXISTS role_info ( id TEXT PRIMARY KEY, name TEXT, status INT, text_reserved1 TEXT, text_reserved2 TEXT, text_reserved3 TEXT, text_reserved4 TEXT, int_reserved1 INT, int_reserved2 INT, int_reserved3 INT, int_reserved4 INT )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276611d;

    public ka(l75.k0 k0Var) {
        this.f276611d = null;
        this.f276611d = k0Var;
    }

    public void d(java.lang.String str) {
        iz5.a.g(null, str.length() > 0);
        if (this.f276611d.mo70514xb06685ab("role_info", "name=?", new java.lang.String[]{str}) > 0) {
            m145262xf35bbb4();
        }
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.ja m0(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ja jaVar = null;
        if (str != null && str.length() > 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.ja jaVar2 = new com.p314xaae8f345.mm.p2621x8fb0427b.ja();
            android.database.Cursor D = this.f276611d.D("role_info", null, "name LIKE ?", new java.lang.String[]{"%".concat(str)}, null, null, null, 2);
            if (D.moveToFirst()) {
                jaVar2.a(D);
                jaVar = jaVar2;
            }
            D.close();
        }
        return jaVar;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.ja n0(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ja jaVar = null;
        iz5.a.g(null, str != null && str.length() > 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.ja jaVar2 = new com.p314xaae8f345.mm.p2621x8fb0427b.ja();
        android.database.Cursor D = this.f276611d.D("role_info", null, "name= ?", new java.lang.String[]{str}, null, null, null, 2);
        if (D.moveToFirst()) {
            jaVar2.a(D);
            jaVar = jaVar2;
        }
        D.close();
        return jaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if ((r0 == 14) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s0(java.lang.String r5) {
        /*
            r4 = this;
            com.tencent.mm.storage.ja r0 = r4.n0(r5)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L36
            int r0 = r0.f276594e
            r3 = 4
            if (r0 != r3) goto Lf
            r3 = r1
            goto L10
        Lf:
            r3 = r2
        L10:
            if (r3 != 0) goto L35
            r3 = 5
            if (r0 != r3) goto L17
            r3 = r1
            goto L18
        L17:
            r3 = r2
        L18:
            if (r3 != 0) goto L35
            r3 = 9
            if (r0 != r3) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r2
        L21:
            if (r3 != 0) goto L35
            r3 = 13
            if (r0 != r3) goto L29
            r3 = r1
            goto L2a
        L29:
            r3 = r2
        L2a:
            if (r3 != 0) goto L35
            r3 = 14
            if (r0 != r3) goto L32
            r0 = r1
            goto L33
        L32:
            r0 = r2
        L33:
            if (r0 == 0) goto L36
        L35:
            return r1
        L36:
            java.lang.String r0 = "@"
            int r0 = r5.indexOf(r0)
            java.lang.String r3 = ""
            if (r0 < 0) goto L48
            r5.substring(r2, r0)
            java.lang.String r0 = r5.substring(r0)
            goto L49
        L48:
            r0 = r3
        L49:
            if (r0 == 0) goto L4c
            r3 = r0
        L4c:
            com.tencent.mm.storage.ja r0 = r4.m0(r3)
            if (r0 == 0) goto L5b
            java.lang.String r0 = r0.f276591b
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L5b
            goto L5c
        L5b:
            r1 = r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.ka.s0(java.lang.String):boolean");
    }

    public final void u0(com.p314xaae8f345.mm.p2621x8fb0427b.ja jaVar) {
        jaVar.f276590a = 135;
        android.content.ContentValues b17 = jaVar.b();
        if (b17.size() <= 0 || this.f276611d.l("role_info", dm.i4.f66865x76d1ec5a, b17) == 0) {
            return;
        }
        m145262xf35bbb4();
    }

    public void y0(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoleStorage", "insert role info failed: empty user");
        } else if (n0(str) == null) {
            u0(new com.p314xaae8f345.mm.p2621x8fb0427b.ja(str, true, true, i17));
        }
    }

    public void z0(com.p314xaae8f345.mm.p2621x8fb0427b.ja jaVar) {
        android.content.ContentValues b17 = jaVar.b();
        if (b17.size() > 0) {
            if (this.f276611d.p("role_info", b17, "name like ?", new java.lang.String[]{jaVar.f276591b}) > 0) {
                m145262xf35bbb4();
            }
        }
    }
}
