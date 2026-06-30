package ny3;

/* loaded from: classes.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f422973e = {l75.n0.m145250x3fdc6f77(ny3.a.f422972p, "RtosQuickReplyInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f422974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, ny3.a.f422972p, "RtosQuickReplyInfo", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f422974d = db6;
    }

    public final boolean D0(java.util.ArrayList arrayList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertList size = ");
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", sb6.toString());
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        l75.k0 k0Var = this.f422974d;
        long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : -1L;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (k0Var.m("RtosQuickReplyInfo", "orderIndex", ((ny3.a) it.next()).mo9763xeb27878e()) < 0) {
                if (k0Var != null) {
                    k0Var.w(java.lang.Long.valueOf(F));
                }
                return false;
            }
        }
        if (k0Var == null) {
            return true;
        }
        k0Var.w(java.lang.Long.valueOf(F));
        return true;
    }

    public final boolean J0(ny3.a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(info.f69150xde32aff9)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", "insertOrUpdate fail. msg is empty.");
            return false;
        }
        if (get(info, new java.lang.String[0])) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", "insertOrUpdate exist update");
            return super.mo55864x413cb2b4(info, false);
        }
        boolean mo51731x24249762 = super.mo51731x24249762(info, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", "insertOrUpdate ret=" + mo51731x24249762);
        return mo51731x24249762;
    }

    public final boolean y0() {
        int mo70514xb06685ab = this.f422974d.mo70514xb06685ab("RtosQuickReplyInfo", "", null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", "deleteAll result=" + mo70514xb06685ab);
        return mo70514xb06685ab >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r10 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r10.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r1 = new ny3.a();
        r1.mo9015xbf5d97fd(r10);
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r10.moveToNext() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList z0() {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r8 = "orderIndex ASC"
            r10 = 0
            l75.k0 r1 = r11.f422974d     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.lang.String r2 = "RtosQuickReplyInfo"
            r3 = 0
            r6 = 0
            r7 = 0
            r9 = 2
            android.database.Cursor r10 = r1.D(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r10 == 0) goto L30
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r1 == 0) goto L30
        L1f:
            ny3.a r1 = new ny3.a     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r1.<init>()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r1.mo9015xbf5d97fd(r10)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r0.add(r1)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            boolean r1 = r10.moveToNext()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r1 != 0) goto L1f
        L30:
            if (r10 == 0) goto L47
        L32:
            r10.close()
            goto L47
        L36:
            r0 = move-exception
            goto L48
        L38:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.Rtos.RtosQuickReplyInfoStorage"
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r1)     // Catch: java.lang.Throwable -> L36
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L36
            if (r10 == 0) goto L47
            goto L32
        L47:
            return r0
        L48:
            if (r10 == 0) goto L4d
            r10.close()
        L4d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ny3.b.z0():java.util.ArrayList");
    }
}
