package kw3;

/* loaded from: classes9.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw3.p f394666d;

    public o(kw3.p pVar) {
        this.f394666d = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r12 = this;
            kw3.p r0 = r12.f394666d
            r0.getClass()
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REMITTANCE_RED_FLAG_CHECK_LONG_SYNC
            r3 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r1 = r1.m(r2, r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r3 = c01.id.c()
            long r3 = r3 - r1
            r1 = 43200000(0x2932e00, double:2.1343636E-316)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto Ld3
            rw3.d r1 = r0.Ni()
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            l75.k0 r3 = r1.f482180d     // Catch: java.lang.Exception -> L82
            java.lang.String r4 = "RemittanceRecord"
            java.lang.String[] r5 = rw3.d.f482178f     // Catch: java.lang.Exception -> L82
            java.lang.String r6 = "receiveStatus=? or receiveStatus=?"
            r1 = 2
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = "1"
            r8 = 0
            r7[r8] = r1     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = "7"
            r8 = 1
            r7[r8] = r1     // Catch: java.lang.Exception -> L82
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 2
            android.database.Cursor r1 = r3.D(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L82
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L6f
        L5a:
            rw3.c r3 = new rw3.c     // Catch: java.lang.Throwable -> L76
            r3.<init>()     // Catch: java.lang.Throwable -> L76
            r3.mo9015xbf5d97fd(r1)     // Catch: java.lang.Throwable -> L76
            r2.add(r3)     // Catch: java.lang.Throwable -> L76
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L5a
            r1.close()     // Catch: java.lang.Throwable -> L76
            goto L72
        L6f:
            r1.close()     // Catch: java.lang.Throwable -> L76
        L72:
            r1.close()     // Catch: java.lang.Exception -> L82
            goto L92
        L76:
            r3 = move-exception
            if (r1 == 0) goto L81
            r1.close()     // Catch: java.lang.Throwable -> L7d
            goto L81
        L7d:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch: java.lang.Exception -> L82
        L81:
            throw r3     // Catch: java.lang.Exception -> L82
        L82:
            r1 = move-exception
            java.lang.String r3 = r1.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "MicroMsg.RemittanceSendRecordStorage"
            java.lang.String r5 = "getRecordByTransferId error: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r1, r5, r3)
        L92:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r2.next()
            rw3.c r3 = (rw3.c) r3
            int r4 = r3.f68618xd3086e30
            java.lang.String r4 = r3.f68621x114ef53e
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto L9b
            java.lang.String r4 = r3.f68621x114ef53e
            r5 = 0
            r0.Vi(r4, r5, r3)
            java.lang.String r3 = r3.f68621x114ef53e
            r1.add(r3)
            goto L9b
        Lbd:
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REMITTANCE_RED_FLAG_CHECK_LONG_SYNC
            long r2 = c01.id.c()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.x(r1, r2)
            goto Lda
        Ld3:
            java.lang.String r0 = "MicroMsg.SubCoreRemittance"
            java.lang.String r1 = "not time"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kw3.o.run():void");
    }
}
