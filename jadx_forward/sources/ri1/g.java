package ri1;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ri1.g f477564a = new ri1.g();

    public static final void a(java.lang.String str, int i17) {
        ri1.c cVar;
        if ((str == null || str.length() == 0) || (cVar = (ri1.c) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(ri1.c.class)) == null) {
            return;
        }
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = "  appId=? ";
            if (i17 == 1) {
                h0Var.f391656d = ((java.lang.String) h0Var.f391656d) + " and appVersionId = TEST";
            } else if (i17 == 2) {
                h0Var.f391656d = ((java.lang.String) h0Var.f391656d) + " and appVersionId = DEMO";
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            l75.k0 k0Var = cVar.f477558e;
            ri1.d dVar = new ri1.d(h0Var, str, linkedList);
            long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            dVar.mo146xb9724478(k0Var);
            k0Var.w(java.lang.Long.valueOf(F));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.vfs.w6.h((java.lang.String) it.next());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WebRenderingCacheCleanupLogic", "clearCache with appId[" + str + "] versionType[" + i17 + "], e=" + e17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0259, code lost:
    
        if (r2.moveToFirst() != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x025b, code lost:
    
        r5 = new ri1.b();
        r5.mo9015xbf5d97fd(r2);
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x026a, code lost:
    
        if (r2.moveToNext() != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00a9, code lost:
    
        if (r5.moveToFirst() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00ab, code lost:
    
        r4.add(r5.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00b6, code lost:
    
        if (r5.moveToNext() != false) goto L189;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b() {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri1.g.b():void");
    }

    public final java.lang.String c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t3 t3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f157481a.c(z17);
        if (c17 == null) {
            if (z17) {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3.f156903n.Y0();
            }
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i8.b(c17);
        if (!b17.f156934f) {
            java.lang.String str = b17.f33455xe121c411;
            if (!(str == null || str.length() == 0)) {
                t3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11660xa0d206d(b17);
                return t3Var.Y0();
            }
        }
        t3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3.f156903n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t3Var);
        return t3Var.Y0();
    }
}
