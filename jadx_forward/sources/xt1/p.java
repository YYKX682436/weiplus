package xt1;

/* loaded from: classes4.dex */
public class p extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f538078e = {l75.n0.m145250x3fdc6f77(xt1.o.f538075t, "CardQrCodeDataInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f538079d;

    public p(l75.k0 k0Var) {
        super(k0Var, xt1.o.f538075t, "CardQrCodeDataInfo", dm.t1.f321533i);
        this.f538079d = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005b, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xt1.o D0(java.lang.String r8) {
        /*
            r7 = this;
            l75.k0 r0 = r7.f538079d
            java.lang.String[] r1 = new java.lang.String[]{r8}
            java.lang.String r2 = "select * from CardQrCodeDataInfo where card_id =? AND status=1  limit 1"
            android.database.Cursor r0 = r0.B(r2, r1)
            r1 = 1
            r2 = 0
            java.lang.String r3 = "MicroMsg.CardQrCodeDataInfoStorage"
            r4 = 0
            if (r0 == 0) goto L3c
            int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            if (r5 <= 0) goto L3c
            r0.moveToPosition(r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            xt1.o r5 = new xt1.o     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r5.<init>()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r5.mo9015xbf5d97fd(r0)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L38
            java.lang.String r4 = "getCardQrcodeShowingByCardId  success! card_id = %s, code_id = %s "
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L38
            r6[r2] = r8     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L38
            java.lang.String r8 = r5.f68372xacb60e68     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L38
            r6[r1] = r8     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L38
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r6)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L38
            r4 = r5
            goto L45
        L35:
            r8 = move-exception
            r4 = r5
            goto L4b
        L38:
            r8 = move-exception
            goto L5c
        L3a:
            r8 = move-exception
            goto L4b
        L3c:
            java.lang.String r5 = "getCardQrcodeShowingByCardId  is empty! card_id = %s"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r5, r8)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
        L45:
            if (r0 == 0) goto L5b
        L47:
            r0.close()
            goto L5b
        L4b:
            java.lang.String r5 = "getCardQrcodeShowingByCardId error!"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L38
            r1[r2] = r8     // Catch: java.lang.Throwable -> L38
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r5, r1)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L5b
            goto L47
        L5b:
            return r4
        L5c:
            if (r0 == 0) goto L61
            r0.close()
        L61:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xt1.p.D0(java.lang.String):xt1.o");
    }

    public boolean d(java.lang.String str) {
        xt1.o oVar = new xt1.o();
        oVar.f68370x95970a65 = str;
        boolean mo9951xb06685ab = mo9951xb06685ab(oVar, "card_id");
        if (mo9951xb06685ab) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData by cardId  success! card_id = %s", str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData by cardId  failure! card_id = %s", str);
        }
        return mo9951xb06685ab;
    }

    public boolean y0(java.lang.String str, java.lang.String str2) {
        xt1.o oVar = new xt1.o();
        oVar.f68370x95970a65 = str;
        oVar.f68372xacb60e68 = str2;
        boolean mo9951xb06685ab = mo9951xb06685ab(oVar, "card_id", "code_id");
        if (mo9951xb06685ab) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData  success! card_id = %s, code_id = %s", oVar.f68370x95970a65, oVar.f68372xacb60e68);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData  failure! card_id = %s, code_id = %s", oVar.f68370x95970a65, oVar.f68372xacb60e68);
        }
        return mo9951xb06685ab;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r7 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List z0(java.lang.String r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            l75.k0 r1 = r6.f538079d
            java.lang.String[] r7 = new java.lang.String[]{r7}
            java.lang.String r2 = "select * from CardQrCodeDataInfo where card_id =? AND status=0"
            android.database.Cursor r7 = r1.B(r2, r7)
        L12:
            if (r7 == 0) goto L3f
            boolean r1 = r7.moveToNext()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            if (r1 == 0) goto L3f
            xt1.o r1 = new xt1.o     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r1.mo9015xbf5d97fd(r7)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r0.add(r1)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            goto L12
        L26:
            r0 = move-exception
            goto L3b
        L28:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.CardQrCodeDataInfoStorage"
            java.lang.String r3 = "getCardQrcodeByCardId error!"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L26
            r5 = 0
            r4[r5] = r1     // Catch: java.lang.Throwable -> L26
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r3, r4)     // Catch: java.lang.Throwable -> L26
            goto L41
        L3b:
            r7.close()
            throw r0
        L3f:
            if (r7 == 0) goto L44
        L41:
            r7.close()
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xt1.p.z0(java.lang.String):java.util.List");
    }
}
