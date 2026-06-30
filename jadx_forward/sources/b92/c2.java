package b92;

/* loaded from: classes15.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f99943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b92.b2 f99944e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(java.util.List list, b92.b2 b2Var) {
        super(0);
        this.f99943d = list;
        this.f99944e = b2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        if (!this.f99943d.isEmpty()) {
            this.f99944e.b(this.f99943d);
        }
        b92.b2 b2Var = this.f99944e;
        if ((b2Var.f99932w > 0 && b2Var.f99931v > 0 && b2Var.f99933x > 0) && (i17 = b2Var.f99920k) == b2Var.f99921l) {
            int i18 = b2Var.f99931v;
            b2Var.f99932w = (int) ((i18 * 60.0f) / i17);
            if (i18 > 60) {
                i18 = 60;
            }
            b2Var.f99933x = i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "calibrateFps: averageFps=" + b2Var.f99932w + ", limitFps=" + b2Var.f99933x);
        }
        b92.b2 b2Var2 = this.f99944e;
        boolean z17 = b2Var2.f99932w > 0 && b2Var2.f99931v > 0 && b2Var2.f99933x > 0;
        long j17 = b2Var2.f99923n;
        long j18 = b2Var2.f99922m;
        long j19 = j17 > j18 ? j17 - j18 : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "report32406: isValid=" + z17 + ", stayDuration=" + j19 + ", frameTask=" + this.f99944e);
        if (!z17 || j19 < 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "report32406: data is invalid");
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6673x9decc092 c6673x9decc092 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6673x9decc092();
            c6673x9decc092.f140118d = 1L;
            c6673x9decc092.f140119e = c6673x9decc092.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f99944e.f99910a, true);
            c6673x9decc092.f140120f = c6673x9decc092.b("commentScene", this.f99944e.f99911b, true);
            b92.b2 b2Var3 = this.f99944e;
            c6673x9decc092.f140121g = b2Var3.f99932w;
            c6673x9decc092.f140122h = b2Var3.f99933x;
            c6673x9decc092.f140123i = b2Var3.f99931v;
            c6673x9decc092.f140124j = c6673x9decc092.b("feedId", pm0.v.u(b2Var3.f99914e), true);
            c6673x9decc092.f140125k = c6673x9decc092.b("liveId", pm0.v.u(this.f99944e.f99915f), true);
            b92.b2 b2Var4 = this.f99944e;
            c6673x9decc092.f140126l = b2Var4.f99935z;
            c6673x9decc092.f140127m = b2Var4.f99934y;
            long j27 = b2Var4.f99923n;
            long j28 = b2Var4.f99922m;
            c6673x9decc092.f140128n = j27 > j28 ? j27 - j28 : 0L;
            c6673x9decc092.f140129o = b2Var4.f99929t;
            c6673x9decc092.f140130p = b2Var4.f99930u;
            c6673x9decc092.f140131q = b2Var4.f99920k;
            c6673x9decc092.f140132r = b2Var4.f99921l;
            int[] iArr = b2Var4.f99927r;
            c6673x9decc092.f140134t = iArr[4];
            c6673x9decc092.f140135u = iArr[3];
            c6673x9decc092.f140136v = iArr[2];
            c6673x9decc092.f140137w = iArr[1];
            c6673x9decc092.f140138x = iArr[0];
            int[] iArr2 = b2Var4.f99928s;
            int i19 = iArr2[1];
            int i27 = iArr2[2];
            int i28 = iArr2[3];
            int i29 = i19 + i27 + i28 + iArr2[4];
            c6673x9decc092.f140133s = (i29 <= 0 ? 0.0f : (r2 * 80.0f) / i29) + (i29 <= 0 ? 0.0f : (i28 * 60.0f) / i29) + (i29 <= 0 ? 0.0f : (i27 * 40.0f) / i29) + (i29 > 0 ? (i19 * 20.0f) / i29 : 0.0f);
            if (ph.t.f435816k == null) {
                synchronized ("Matrix.battery.LifeCycle") {
                    if (ph.t.f435816k == null) {
                        throw new java.lang.IllegalStateException("Call #init() first!".toString());
                    }
                }
            }
            ph.t tVar = ph.t.f435816k;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
            ph.c c17 = tVar.c();
            c6673x9decc092.f140139y = c17.b();
            c6673x9decc092.f140140z = c17.c() ? 1L : 0L;
            c17.f();
            c6673x9decc092.A = 0L;
            c6673x9decc092.k();
            java.lang.String n17 = c6673x9decc092.n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "report32406: ".concat(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false)));
        }
        return jz5.f0.f384359a;
    }
}
