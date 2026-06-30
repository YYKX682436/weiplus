package ri;

/* loaded from: classes12.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.List f477492a = java.util.Collections.emptyList();

    /* renamed from: b, reason: collision with root package name */
    public static int f477493b = wh.m.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);

    /* renamed from: c, reason: collision with root package name */
    public static long f477494c = 0;

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(qh.b r30, rh.o2 r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.p.a(qh.b, rh.o2, java.lang.String):void");
    }

    public static void b(final java.lang.String str, final rh.c1 c1Var, final boolean z17) {
        final ph.u e17 = gi.d.e();
        if (e17 == null) {
            return;
        }
        if (str.equals("canary") || str.equals("module") || str.equals("biz") || str.equals("alertBatt") || str.equals("alertThermal")) {
            c1Var.q(new wh.t0() { // from class: ri.p$$m
                @Override // wh.t0
                /* renamed from: accept */
                public final void mo40853xab27b508(java.lang.Object obj) {
                    final rh.c1 c1Var2 = rh.c1.this;
                    final java.lang.String str2 = str;
                    final ph.u uVar = e17;
                    final boolean z18 = z17;
                    final qh.b bVar = (qh.b) obj;
                    c1Var2.u(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class, new wh.t0() { // from class: ri.p$$o
                        /* JADX WARN: Removed duplicated region for block: B:194:0x0611 A[Catch: Exception -> 0x0627, TRY_LEAVE, TryCatch #1 {Exception -> 0x0627, blocks: (B:189:0x05d7, B:191:0x05dd, B:192:0x060b, B:194:0x0611, B:305:0x05ea, B:306:0x05ef, B:311:0x05fe, B:313:0x0603), top: B:188:0x05d7 }] */
                        /* JADX WARN: Removed duplicated region for block: B:203:0x062d  */
                        /* JADX WARN: Removed duplicated region for block: B:244:0x072d  */
                        /* JADX WARN: Removed duplicated region for block: B:247:0x0789  */
                        /* JADX WARN: Removed duplicated region for block: B:250:0x07e2  */
                        /* JADX WARN: Removed duplicated region for block: B:253:0x083b  */
                        /* JADX WARN: Removed duplicated region for block: B:256:0x0894  */
                        /* JADX WARN: Removed duplicated region for block: B:259:0x08ed  */
                        /* JADX WARN: Removed duplicated region for block: B:262:0x0946  */
                        /* JADX WARN: Removed duplicated region for block: B:265:0x09a4  */
                        /* JADX WARN: Removed duplicated region for block: B:268:0x0a02  */
                        /* JADX WARN: Removed duplicated region for block: B:271:0x0a60  */
                        /* JADX WARN: Removed duplicated region for block: B:274:0x0abe  */
                        /* JADX WARN: Removed duplicated region for block: B:277:0x0b17  */
                        /* JADX WARN: Removed duplicated region for block: B:280:0x0b8e  */
                        /* JADX WARN: Removed duplicated region for block: B:287:0x0ba7  */
                        /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:297:0x0780  */
                        /* JADX WARN: Removed duplicated region for block: B:300:0x0720  */
                        @Override // wh.t0
                        /* renamed from: accept */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void mo40853xab27b508(java.lang.Object r47) {
                            /*
                                Method dump skipped, instructions count: 3109
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: ri.C30078x33757f.mo40853xab27b508(java.lang.Object):void");
                        }
                    });
                }
            });
        }
    }

    public static void c(boolean z17, java.lang.String str, rh.o2 o2Var) {
        java.lang.String str2;
        java.lang.String f17 = ri.i.f();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish=");
        rh.d3 d3Var = o2Var.f477019c;
        int i17 = ((rh.f) d3Var).f476911h;
        int i18 = ((rh.f) d3Var).f476912i;
        long max = java.lang.Math.max(1L, o2Var.f477020d / 60000);
        rh.d3 d3Var2 = o2Var.f477019c;
        long longValue = ((java.lang.Long) ((rh.f) d3Var2).f476910g.f477085a).longValue() / max;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#reportTaskJiffiesException, feat = " + str);
        sb6.append(((rh.f) d3Var2).f476914k);
        int l17 = wh.m.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        sb6.append("|batTemp=");
        sb6.append(l17);
        int[] p17 = wh.m.p();
        if (p17.length > 0) {
            sb6.append("|cupFreq=");
            sb6.append(java.util.Arrays.toString(p17));
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (str.equals("threadPool")) {
            str2 = "avgTaskJiffies";
        } else {
            str2 = "avg" + ri.i.a(str) + "TaskJiffies";
        }
        sb7.append(str2);
        sb7.append(z17 ? "LongException" : "Exception");
        java.lang.String sb8 = sb7.toString();
        android.util.SparseArray sparseArray = ri.s.f477541a;
        ri.s.b(1, 5, f17, sb6.toString(), i17, i18, sb8, longValue, ((rh.f) d3Var2).f476908e, ((java.lang.Long) ((rh.f) o2Var.f477018b).f476910g.f477085a).longValue(), "duringMin", max, ((rh.f) d3Var2).f476913j, "", ((rh.f) d3Var2).f476915l, ((rh.f) d3Var2).f476916m, ((rh.f) d3Var2).f476917n, "");
    }

    public static void d(qh.b bVar, boolean z17, long j17, long j18) {
        if (bVar.g() || bVar.f444842b <= java.lang.Math.max(gi.d.f353526a, 0)) {
            return;
        }
        java.lang.String f17 = ri.i.f();
        java.lang.String str = z17 ? "wifi" : "mobile";
        int c17 = bVar.c();
        int d17 = bVar.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#reportTrafficException");
        android.util.SparseArray sparseArray = ri.s.f477541a;
        ri.s.b(1, 5, f17, str, c17, d17, z17 ? "avgWifiException" : "avgRadioException", z17 ? j17 : j18, z17 ? "avgRadio" : "avgWifi", z17 ? j18 : j17, "duringMin", java.lang.Math.max(1L, bVar.f444854n / 60000), bVar.f444849i, "", bVar.f444842b, bVar.f444845e, bVar.f444850j, "");
    }
}
