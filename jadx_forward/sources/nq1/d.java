package nq1;

@j95.b
/* loaded from: classes11.dex */
public class d extends i95.w implements oq1.l {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (r1.moveToNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r1.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        r0 = new oq1.a();
        r0.mo9015xbf5d97fd(r1);
        r2.add(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List Ai() {
        /*
            r7 = this;
            java.lang.Class<oq1.m> r0 = oq1.m.class
            i95.m r0 = i95.n0.c(r0)
            oq1.m r0 = (oq1.m) r0
            nq1.s r0 = (nq1.s) r0
            r0.m134976x2690a4ac()
            pq1.a r0 = r0.f420504d
            qq1.a r0 = r0.f439102a
            r1 = 0
            if (r0 == 0) goto L68
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            long r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x()
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 - r5
            java.lang.String r5 = "select * from ActiveInfo where useTime >= ?"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String[] r3 = new java.lang.String[]{r3}
            l75.k0 r0 = r0.f447461d     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r4 = 2
            android.database.Cursor r1 = r0.f(r5, r3, r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r1 == 0) goto L4b
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r0 == 0) goto L4b
        L3a:
            oq1.a r0 = new oq1.a     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r0.mo9015xbf5d97fd(r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r2.add(r0)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r0 != 0) goto L3a
        L4b:
            if (r1 == 0) goto L60
            goto L5d
        L4e:
            r0 = move-exception
            goto L62
        L50:
            r0 = move-exception
            java.lang.String r3 = "MicroMsg.Tinker.ActiveInfoStorage"
            java.lang.String r4 = "getDayActiveFeature failed."
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L4e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L60
        L5d:
            r1.close()
        L60:
            r1 = r2
            goto L68
        L62:
            if (r1 == 0) goto L67
            r1.close()
        L67:
            throw r0
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nq1.d.Ai():java.util.List");
    }

    public void Bi(int i17) {
        nq1.s sVar = (nq1.s) ((oq1.m) i95.n0.c(oq1.m.class));
        sVar.m134976x2690a4ac();
        if (sVar.f420504d != null) {
            nq1.s sVar2 = (nq1.s) ((oq1.m) i95.n0.c(oq1.m.class));
            sVar2.m134976x2690a4ac();
            sVar2.f420504d.a(i17, false, 0);
        }
    }

    public void Di(int i17, int i18) {
        nq1.s sVar = (nq1.s) ((oq1.m) i95.n0.c(oq1.m.class));
        sVar.m134976x2690a4ac();
        if (sVar.f420504d != null) {
            nq1.s sVar2 = (nq1.s) ((oq1.m) i95.n0.c(oq1.m.class));
            sVar2.m134976x2690a4ac();
            sVar2.f420504d.a(i17, true, i18);
        }
    }

    public void wi(oq1.r rVar, oq1.p pVar) {
        nq1.s sVar = (nq1.s) ((oq1.m) i95.n0.c(oq1.m.class));
        sVar.m134976x2690a4ac();
        sVar.f420504d.getClass();
        gm0.j1.d().g(new z73.b(rVar, pVar));
    }
}
