package dk2;

/* loaded from: classes3.dex */
public final class kc {

    /* renamed from: b, reason: collision with root package name */
    public static long f315230b;

    /* renamed from: c, reason: collision with root package name */
    public static int f315231c;

    /* renamed from: d, reason: collision with root package name */
    public static r45.u52 f315232d;

    /* renamed from: e, reason: collision with root package name */
    public static int f315233e;

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.kc f315229a = new dk2.kc();

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f315234f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("FinderLiveReporterTimer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) dk2.jc.f315195d, true);

    public final void a(boolean z17) {
        java.util.LinkedList linkedList;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - f315230b;
        synchronized (hn0.v.f363973a) {
            linkedList = new java.util.LinkedList(hn0.v.f363974b);
        }
        f315230b = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveReporter", "doLivePlayReport qosInfoQueue.size:" + linkedList.size() + " liveStarted:" + z17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6678x721098a9 c6678x721098a9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6678x721098a9();
        c6678x721098a9.L = currentTimeMillis / 1000;
        long j17 = 2;
        c6678x721098a9.K = 2L;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            kn0.e eVar = (kn0.e) it.next();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6678x721098a9.f140159d)) {
                c6678x721098a9.f140159d = c6678x721098a9.b("LiveId", java.lang.String.valueOf(eVar.f391036a), true);
            }
            if (c6678x721098a9.f140160e == 0) {
                c6678x721098a9.f140160e = eVar.f391041f;
            }
            if (c6678x721098a9.f140161f == 0) {
                c6678x721098a9.f140161f = eVar.f391042g;
            }
            if (c6678x721098a9.f140172q == 0) {
                c6678x721098a9.f140172q = eVar.f391053r;
            }
            if (c6678x721098a9.f140178w == 0) {
                c6678x721098a9.f140178w = eVar.f391058w;
            }
            if (c6678x721098a9.A == 0) {
                c6678x721098a9.A = eVar.A;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6678x721098a9.B)) {
                java.lang.String str = eVar.B;
                if (str == null) {
                    str = "";
                }
                c6678x721098a9.B = c6678x721098a9.b("CdnSvrIp", str, true);
            }
            if (c6678x721098a9.C == 0) {
                c6678x721098a9.C = eVar.C;
            }
            if (c6678x721098a9.O == 0) {
                int i17 = eVar.f391037b;
                c6678x721098a9.O = i17 == 1 ? 1L : i17 == 0 ? j17 : 0L;
            }
            c6678x721098a9.N = eVar.f391040e;
            int i18 = eVar.f391038c;
            c6678x721098a9.M = i18 != 1 ? i18 == 1 ? j17 : 0L : 1L;
            c6678x721098a9.f140162g += eVar.f391043h;
            c6678x721098a9.f140163h += eVar.f391044i;
            c6678x721098a9.f140164i += eVar.f391045j;
            c6678x721098a9.f140165j += eVar.f391046k;
            c6678x721098a9.f140166k += eVar.f391047l;
            c6678x721098a9.f140169n += eVar.f391050o;
            c6678x721098a9.f140174s += eVar.f391055t;
            c6678x721098a9.f140179x += eVar.f391059x;
            c6678x721098a9.f140180y += eVar.f391060y;
            c6678x721098a9.f140181z += eVar.f391061z;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(c6678x721098a9.D);
            sb6.append(eVar.D);
            c6678x721098a9.D = c6678x721098a9.b("CpuUsageProcess", sb6.toString(), true);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(c6678x721098a9.E);
            sb7.append(eVar.E);
            c6678x721098a9.E = c6678x721098a9.b("CpuUsageDevice", sb7.toString(), true);
            c6678x721098a9.f140167l += eVar.f391048m;
            c6678x721098a9.f140168m += eVar.f391049n;
            c6678x721098a9.f140170o += eVar.f391051p;
            c6678x721098a9.f140171p += eVar.f391052q;
            c6678x721098a9.f140175t = eVar.f391056u;
            c6678x721098a9.f140176u += eVar.f391057v;
            long j18 = c6678x721098a9.f140173r;
            long j19 = eVar.f391054s;
            if (j18 < j19) {
                j18 = j19;
            }
            c6678x721098a9.f140173r = j18;
            long j27 = c6678x721098a9.f140164i;
            long j28 = eVar.f391045j;
            c6678x721098a9.G = j27 < j28 ? j28 : j27;
            long j29 = c6678x721098a9.f140165j;
            long j37 = eVar.f391046k;
            c6678x721098a9.I = j29 < j37 ? j37 : j29;
            if (j27 > j28) {
                j27 = j28;
            }
            c6678x721098a9.H = j27;
            if (j29 > j37) {
                j29 = j37;
            }
            c6678x721098a9.I = j29;
            j17 = 2;
        }
        c6678x721098a9.F = f315231c;
        c6678x721098a9.f140162g = ((float) c6678x721098a9.f140162g) / linkedList.size();
        c6678x721098a9.f140163h = ((float) c6678x721098a9.f140163h) / linkedList.size();
        c6678x721098a9.f140164i = ((float) c6678x721098a9.f140164i) / linkedList.size();
        c6678x721098a9.f140165j = ((float) c6678x721098a9.f140165j) / linkedList.size();
        c6678x721098a9.f140166k = ((float) c6678x721098a9.f140166k) / linkedList.size();
        c6678x721098a9.f140169n = ((float) c6678x721098a9.f140169n) / linkedList.size();
        c6678x721098a9.f140174s = ((float) c6678x721098a9.f140174s) / linkedList.size();
        c6678x721098a9.f140179x = ((float) c6678x721098a9.f140179x) / linkedList.size();
        c6678x721098a9.f140180y = ((float) c6678x721098a9.f140180y) / linkedList.size();
        c6678x721098a9.f140181z = ((float) c6678x721098a9.f140181z) / linkedList.size();
        if (z17) {
            c6678x721098a9.f140158J = 0L;
        } else {
            c6678x721098a9.f140158J = 1L;
        }
        c6678x721098a9.k();
        f315231c = 0;
    }

    public final void b() {
        f315231c++;
    }

    public final void c(boolean z17, boolean z18) {
        r45.u52 u52Var;
        if (f315232d == null) {
            f315232d = new r45.u52();
        }
        if (z17 && (u52Var = f315232d) != null) {
            u52Var.set(0, 1);
        }
        if (z18) {
            f315233e = 1;
        }
    }
}
