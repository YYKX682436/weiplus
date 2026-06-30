package t81;

/* loaded from: classes7.dex */
public final class d extends qj1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f497888f = {l75.n0.m145250x3fdc6f77(t81.c.Z, "PredownloadCmdGetCodePersistentInfo2"), "DROP TABLE IF EXISTS PredownloadCmdGetCodePersistentInfo"};

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f497889e;

    public d(l75.k0 k0Var) {
        super(k0Var, t81.c.Z, "PredownloadCmdGetCodePersistentInfo2", dm.n9.A);
        this.f497889e = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r9.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        r0 = new t81.c();
        r0.mo9015xbf5d97fd(r9);
        r10.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r9.moveToNext() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List D0(java.lang.String r9, java.lang.String... r10) {
        /*
            r8 = this;
            l75.k0 r0 = r8.f497889e
            java.lang.String r1 = "PredownloadCmdGetCodePersistentInfo2"
            r2 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r9
            r4 = r10
            android.database.Cursor r9 = r0.E(r1, r2, r3, r4, r5, r6, r7)
            if (r9 == 0) goto L37
            boolean r10 = r9.isClosed()
            if (r10 == 0) goto L17
            goto L37
        L17:
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            boolean r0 = r9.moveToFirst()
            if (r0 == 0) goto L33
        L22:
            t81.c r0 = new t81.c
            r0.<init>()
            r0.mo9015xbf5d97fd(r9)
            r10.add(r0)
            boolean r0 = r9.moveToNext()
            if (r0 != 0) goto L22
        L33:
            r9.close()
            return r10
        L37:
            java.util.List r9 = java.util.Collections.emptyList()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t81.d.D0(java.lang.String, java.lang.String[]):java.util.List");
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo9952xce0038c9(t81.c cVar, java.lang.String... strArr) {
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(cVar, strArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Appbrand.Predownload.CmdGetCodePersistentStorage", "update(%b) %s", java.lang.Boolean.valueOf(mo9952xce0038c9), cVar);
        return mo9952xce0038c9;
    }

    @Override // l75.n0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean mo9951xb06685ab(t81.c cVar, java.lang.String... strArr) {
        boolean mo9951xb06685ab = super.mo9951xb06685ab(cVar, strArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Appbrand.Predownload.CmdGetCodePersistentStorage", "delete(%b) %s", java.lang.Boolean.valueOf(mo9951xb06685ab), cVar);
        return mo9951xb06685ab;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(t81.c cVar) {
        boolean mo880xb970c2b9 = super.mo880xb970c2b9(cVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Appbrand.Predownload.CmdGetCodePersistentStorage", "insert(%b) %s", java.lang.Boolean.valueOf(mo880xb970c2b9), cVar);
        return mo880xb970c2b9;
    }
}
