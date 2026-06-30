package s83;

/* loaded from: classes8.dex */
public class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f486403e = {l75.n0.m145250x3fdc6f77(s83.c.f486401u, "IPCallAddressItem")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f486404f = {"*", "rowid"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f486405d;

    public d(l75.k0 k0Var) {
        super(k0Var, s83.c.f486401u, "IPCallAddressItem", null);
        this.f486405d = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r12 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s83.c D0(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            l75.k0 r2 = r11.f486405d
            java.lang.String r3 = "IPCallAddressItem"
            java.lang.String[] r4 = s83.d.f486404f
            java.lang.String r5 = "contactId=?"
            java.lang.String[] r6 = new java.lang.String[]{r12}
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            android.database.Cursor r12 = r2.D(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            if (r0 == 0) goto L2e
            s83.c r0 = new s83.c     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r0.<init>()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r0.mo9015xbf5d97fd(r12)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r12.close()
            return r0
        L2e:
            r12.close()
            goto L49
        L32:
            r0 = move-exception
            goto L4a
        L34:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.IPCallAddressStorage"
            java.lang.String r3 = "getByContactId error: %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L32
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Throwable -> L32
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r3, r4)     // Catch: java.lang.Throwable -> L32
            if (r12 == 0) goto L49
            goto L2e
        L49:
            return r1
        L4a:
            if (r12 == 0) goto L4f
            r12.close()
        L4f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s83.d.D0(java.lang.String):s83.c");
    }

    public s83.c J0(long j17) {
        android.database.Cursor D = this.f486405d.D("IPCallAddressItem", f486404f, "rowid=?", new java.lang.String[]{j17 + ""}, null, null, null, 2);
        try {
            try {
                if (D.moveToFirst()) {
                    s83.c cVar = new s83.c();
                    cVar.mo9015xbf5d97fd(D);
                    D.close();
                    return cVar;
                }
            } catch (java.lang.Exception e17) {
                e17.getMessage();
                if (D == null) {
                    return null;
                }
            }
            D.close();
            return null;
        } catch (java.lang.Throwable th6) {
            if (D != null) {
                D.close();
            }
            throw th6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r12 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s83.c L0(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            l75.k0 r2 = r11.f486405d
            java.lang.String r3 = "IPCallAddressItem"
            java.lang.String[] r4 = s83.d.f486404f
            java.lang.String r5 = "systemAddressBookUsername=?"
            java.lang.String[] r6 = new java.lang.String[]{r12}
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            android.database.Cursor r12 = r2.D(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            if (r0 == 0) goto L2f
            s83.c r0 = new s83.c     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.mo9015xbf5d97fd(r12)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r12.close()
            return r0
        L2f:
            r12.close()
            goto L3c
        L33:
            r0 = move-exception
            goto L3d
        L35:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Throwable -> L33
            if (r12 == 0) goto L3c
            goto L2f
        L3c:
            return r1
        L3d:
            if (r12 == 0) goto L42
            r12.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s83.d.L0(java.lang.String):s83.c");
    }

    public android.database.Cursor P0(java.lang.String str) {
        return this.f486405d.E("IPCallAddressItem", f486404f, "systemAddressBookUsername LIKE ? or sortKey LIKE ?", new java.lang.String[]{"%" + str + "%", "%" + str + "%"}, null, null, "upper(sortKey) asc");
    }

    public void y0(long j17) {
        l75.k0 k0Var = this.f486405d;
        if (k0Var == null || j17 == -1) {
            return;
        }
        k0Var.w(java.lang.Long.valueOf(j17));
    }

    public java.util.ArrayList z0() {
        android.database.Cursor D = this.f486405d.D("IPCallAddressItem", f486404f, null, null, null, null, null, 2);
        try {
            if (D != null) {
                if (D.moveToFirst()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    do {
                        s83.c cVar = new s83.c();
                        cVar.mo9015xbf5d97fd(D);
                        arrayList.add(cVar);
                    } while (D.moveToNext());
                    return arrayList;
                }
            }
            if (D != null) {
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallAddressStorage", "getAllAddress, error: %s", e17.getMessage());
            return null;
        } finally {
            D.close();
        }
    }
}
