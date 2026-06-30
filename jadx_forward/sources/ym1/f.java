package ym1;

@j95.b
/* loaded from: classes14.dex */
public final class f extends i95.w {

    /* renamed from: h, reason: collision with root package name */
    public static final ym1.e f544667h = new ym1.e(null);

    /* renamed from: d, reason: collision with root package name */
    public final mm1.a f544668d = new mm1.a();

    /* renamed from: e, reason: collision with root package name */
    public xm1.h f544669e = new xm1.j();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f544670f = "music";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String[] f544671g;

    public f() {
        java.lang.String[] strArr = new java.lang.String[2];
        for (int i17 = 0; i17 < 2; i17++) {
            strArr[i17] = "";
        }
        this.f544671g = strArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        r1 = new xm1.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r3.equals("voip") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r1 = new xm1.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r3.equals("voipcs") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r3.equals("ipcall") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r3.equals("multitalke") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final xm1.h Ai(java.lang.String r3) {
        /*
            ym1.e r0 = ym1.f.f544667h
            java.lang.String r1 = "type"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r1)
            ym1.f r1 = r0.d()
            java.lang.String r1 = r1.f544670f
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r3)
            if (r1 == 0) goto L19
            xm1.h r3 = r0.b()
            goto L65
        L19:
            int r1 = r3.hashCode()
            switch(r1) {
                case -1182426107: goto L44;
                case -810977776: goto L34;
                case 3625376: goto L2a;
                case 1268443040: goto L21;
                default: goto L20;
            }
        L20:
            goto L53
        L21:
            java.lang.String r1 = "multitalke"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L4d
            goto L53
        L2a:
            java.lang.String r1 = "voip"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            goto L53
        L34:
            java.lang.String r1 = "voipcs"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            goto L53
        L3e:
            xm1.n r1 = new xm1.n
            r1.<init>()
            goto L58
        L44:
            java.lang.String r1 = "ipcall"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L4d
            goto L53
        L4d:
            xm1.i r1 = new xm1.i
            r1.<init>()
            goto L58
        L53:
            xm1.j r1 = new xm1.j
            r1.<init>()
        L58:
            ym1.f r2 = r0.d()
            r2.f544669e = r1
            ym1.f r0 = r0.d()
            r0.f544670f = r3
            r3 = r1
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ym1.f.Ai(java.lang.String):xm1.h");
    }

    public static final int Bi() {
        return f544667h.b().f();
    }

    public static final int Di(int i17) {
        return f544667h.b().h(i17);
    }

    public static final boolean Ni() {
        return f544667h.i();
    }

    public static final boolean Ri() {
        return f544667h.j();
    }

    public static final xm1.h wi() {
        return f544667h.b();
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAudio", "onAccountPostReset");
        this.f544668d.mo43387xa1258ad5();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAudio", "onAccountRelease");
        int i17 = an1.a.f90365c;
        int i18 = an1.a.f90365c;
        if (i18 == -1) {
            an1.a.f90365c = i17;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            an1.a.f90364b = android.os.SystemClock.elapsedRealtime();
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6329xf4b4d64e c6329xf4b4d64e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6329xf4b4d64e();
            c6329xf4b4d64e.f136872d = i18;
            long j17 = an1.a.f90364b;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c6329xf4b4d64e.f136873e = (android.os.SystemClock.elapsedRealtime() - j17) / 1000;
            c6329xf4b4d64e.k();
            an1.a.f90365c = i17;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            an1.a.f90364b = android.os.SystemClock.elapsedRealtime();
        }
        this.f544668d.mo43388x4b16414e();
    }
}
