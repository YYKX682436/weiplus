package b82;

/* loaded from: classes8.dex */
public class c extends l75.n0 implements o72.d4 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f18307d;

    public c(l75.k0 k0Var) {
        super(k0Var, o72.m2.f343413v, "FavEditInfo", null);
        this.f18307d = k0Var;
        k0Var.A("FavEditInfo", "CREATE INDEX IF NOT EXISTS IndexLocalId_Type ON FavEditInfo(localId,type);");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r1.moveToFirst() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r4 = new o72.m2();
        r4.convertFrom(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r4.field_modItem != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r4.field_modItem = new r45.kp0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r2.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r1.moveToNext() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        return r2;
     */
    @Override // o72.d4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List E5() {
        /*
            r10 = this;
            java.lang.String r0 = ""
            l75.k0 r1 = r10.f18307d
            java.lang.String r2 = "select count(*) from FavEditInfo"
            r3 = 0
            r4 = 2
            android.database.Cursor r2 = r1.f(r2, r3, r4)
            java.lang.String r5 = "MicroMsg.Fav.FavEditInfoStorage"
            if (r2 != 0) goto L17
            java.lang.String r0 = "count all edit info, cursor is null"
            com.tencent.mars.xlog.Log.e(r5, r0)
            return r3
        L17:
            r6 = 0
            boolean r7 = r2.moveToFirst()     // Catch: java.lang.Exception -> L72
            if (r7 == 0) goto L30
            java.lang.String r7 = "get all edit infos, count %d"
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L72
            int r9 = r2.getInt(r6)     // Catch: java.lang.Exception -> L72
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L72
            r8[r6] = r9     // Catch: java.lang.Exception -> L72
            com.tencent.mars.xlog.Log.i(r5, r7, r8)     // Catch: java.lang.Exception -> L72
        L30:
            r2.close()
            java.lang.String r2 = "select * from FavEditInfo"
            android.database.Cursor r1 = r1.f(r2, r3, r4)
            if (r1 != 0) goto L3d
            return r3
        L3d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Exception -> L68
            if (r4 == 0) goto L64
        L48:
            o72.m2 r4 = new o72.m2     // Catch: java.lang.Exception -> L68
            r4.<init>()     // Catch: java.lang.Exception -> L68
            r4.convertFrom(r1)     // Catch: java.lang.Exception -> L68
            r45.kp0 r7 = r4.field_modItem     // Catch: java.lang.Exception -> L68
            if (r7 != 0) goto L5b
            r45.kp0 r7 = new r45.kp0     // Catch: java.lang.Exception -> L68
            r7.<init>()     // Catch: java.lang.Exception -> L68
            r4.field_modItem = r7     // Catch: java.lang.Exception -> L68
        L5b:
            r2.add(r4)     // Catch: java.lang.Exception -> L68
            boolean r4 = r1.moveToNext()     // Catch: java.lang.Exception -> L68
            if (r4 != 0) goto L48
        L64:
            r1.close()
            return r2
        L68:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r6]
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r2, r0, r4)
            r1.close()
            return r3
        L72:
            r1 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r6]
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r1, r0, r4)
            r2.close()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b82.c.E5():java.util.List");
    }

    @Override // o72.d4
    public /* bridge */ /* synthetic */ boolean M1(o72.m2 m2Var) {
        return super.insert(m2Var);
    }

    @Override // o72.d4
    public o72.m2 c1(long j17, int i17) {
        android.database.Cursor f17 = this.f18307d.f("select * from FavEditInfo where localId =  ? and type =  ?", new java.lang.String[]{java.lang.String.valueOf(j17), java.lang.String.valueOf(i17)}, 2);
        o72.m2 m2Var = null;
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            m2Var = new o72.m2();
            m2Var.convertFrom(f17);
        }
        f17.close();
        return m2Var;
    }

    @Override // o72.d4
    public /* bridge */ /* synthetic */ boolean i7(o72.m2 m2Var, java.lang.String[] strArr) {
        return super.update(m2Var, strArr);
    }

    @Override // o72.d4
    public void j1(long j17, int i17) {
        this.f18307d.delete("FavEditInfo", "localId=? and type=?", new java.lang.String[]{java.lang.String.valueOf(j17), java.lang.String.valueOf(i17)});
    }
}
