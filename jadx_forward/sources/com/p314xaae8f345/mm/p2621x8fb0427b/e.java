package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes8.dex */
public class e extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f275384e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.c.E, "ABTestItem")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f275385d;

    public e(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.c.E, "ABTestItem", null);
        this.f275385d = k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D0(java.util.List r13, int r14) {
        /*
            r12 = this;
            long r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = "endTime"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r3, r0}
            java.lang.String r1 = "%s<>0 and %s<%d"
            java.lang.String r0 = java.lang.String.format(r2, r1, r0)
            l75.k0 r1 = r12.f275385d
            java.lang.String r2 = "ABTestItem"
            r3 = 0
            r1.mo70514xb06685ab(r2, r0, r3)
            r0 = 1
            r1 = 0
            if (r14 != 0) goto L32
            com.tencent.mm.storage.c r14 = new com.tencent.mm.storage.c
            r14.<init>()
            r14.f66194xac21bddb = r0
            java.lang.String r2 = "prioritylevel"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r12.mo49766xb06685ab(r14, r1, r2)
        L32:
            java.util.Iterator r13 = r13.iterator()
            r14 = r1
        L37:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto Le6
            java.lang.Object r2 = r13.next()
            com.tencent.mm.storage.c r2 = (com.p314xaae8f345.mm.p2621x8fb0427b.c) r2
            java.lang.String r3 = "MicroMsg.ABTestStorage"
            if (r2 == 0) goto Ldb
            java.lang.String r4 = r2.f66192x72127c07
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r4 == 0) goto L51
            goto Ldb
        L51:
            com.tencent.mm.storage.c r4 = new com.tencent.mm.storage.c
            r4.<init>()
            java.lang.String r5 = r2.f66192x72127c07
            r4.f66192x72127c07 = r5
            java.lang.String[] r5 = new java.lang.String[r1]
            boolean r5 = super.get(r4, r5)
            if (r5 != 0) goto L76
            boolean r4 = super.mo51731x24249762(r2, r1)
            java.lang.String r2 = r2.f66192x72127c07
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5}
            java.lang.String r5 = "Inserted: %s, Result: %b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r5, r2)
            goto Le1
        L76:
            long r5 = r2.f66196x6e338166
            long r7 = r4.f66196x6e338166
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L84
            int r5 = r2.f66194xac21bddb
            int r6 = r4.f66194xac21bddb
            if (r5 == r6) goto L8a
        L84:
            int r5 = r2.f66194xac21bddb
            int r6 = r4.f66194xac21bddb
            if (r5 <= r6) goto Lb9
        L8a:
            java.lang.String[] r5 = new java.lang.String[r1]
            boolean r5 = super.mo51732xbf274172(r2, r1, r5)
            java.lang.String r6 = r2.f66192x72127c07
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            long r8 = r4.f66196x6e338166
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            long r9 = r2.f66196x6e338166
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            int r4 = r4.f66194xac21bddb
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            int r2 = r2.f66194xac21bddb
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r6, r7, r8, r9, r10, r11}
            java.lang.String r4 = "Updated: %s, Result: %b, Seq: %d, %d, PriorityLV: %d, %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r2)
            r4 = r5
            goto Le1
        Lb9:
            java.lang.String r5 = r2.f66192x72127c07
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            long r7 = r2.f66196x6e338166
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r4 = r4.f66194xac21bddb
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r2 = r2.f66194xac21bddb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r6, r7, r4, r2}
            java.lang.String r4 = "Ignored: %s, Seq: %d, %d, PriorityLV: %d, %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r2)
            goto Le0
        Ldb:
            java.lang.String r2 = "saveIfNecessary, Invalid item"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r2)
        Le0:
            r4 = r1
        Le1:
            if (r4 == 0) goto L37
            r14 = r0
            goto L37
        Le6:
            if (r14 == 0) goto Led
            java.lang.String r13 = "event_updated"
            r12.mo145247xf35bbb4(r13)
        Led:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.e.D0(java.util.List, int):void");
    }

    @Override // l75.s0
    /* renamed from: extraStepsAfterNotifying */
    public void mo77982x77686a54(l75.w0 w0Var) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.p2621x8fb0427b.d.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.d) ((fs.n) qVar.get())).mo77964xb0dfc7d8(w0Var.f398506a, w0Var);
            }
        }
    }

    public java.lang.String y0() {
        android.database.Cursor mo78085xb5882a6b = mo78085xb5882a6b();
        if (mo78085xb5882a6b == null) {
            return "null cursor!!";
        }
        if (!mo78085xb5882a6b.moveToFirst()) {
            mo78085xb5882a6b.close();
            return "cursor empty!!";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p2621x8fb0427b.c cVar = new com.p314xaae8f345.mm.p2621x8fb0427b.c();
        do {
            sb6.append("============\nlayerId = ");
            cVar.mo9015xbf5d97fd(mo78085xb5882a6b);
            sb6.append(cVar.f66192x72127c07);
            sb6.append("\nsequence = ");
            sb6.append(cVar.f66196x6e338166);
            sb6.append("\npriorityLV = ");
            sb6.append(cVar.f66194xac21bddb);
            sb6.append("\nexpId = ");
            sb6.append(cVar.f66191x29106093);
            sb6.append("\n");
        } while (mo78085xb5882a6b.moveToNext());
        mo78085xb5882a6b.close();
        return sb6.toString();
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.c z0(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.c cVar = new com.p314xaae8f345.mm.p2621x8fb0427b.c();
        cVar.f66192x72127c07 = str;
        boolean z17 = super.get(cVar, new java.lang.String[0]);
        if (z17 && cVar.f66190x14c61803 == 0) {
            cVar.f66190x14c61803 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ABTestStorage", "getByLayerId, id: %s, return: %b", str, java.lang.Boolean.valueOf(z17));
        return cVar;
    }
}
