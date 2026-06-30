package t21;

/* loaded from: classes12.dex */
public class p3 implements wf0.u1, i95.m {

    /* renamed from: y, reason: collision with root package name */
    public static int f496396y;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f496397d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f496398e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f496399f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f496400g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Queue f496401h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Queue f496402i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Queue f496403m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Queue f496404n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f496405o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public boolean f496406p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f496407q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f496408r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f496409s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f496410t = 0;

    /* renamed from: u, reason: collision with root package name */
    public t21.r0 f496411u = null;

    /* renamed from: v, reason: collision with root package name */
    public t21.w0 f496412v = null;

    /* renamed from: w, reason: collision with root package name */
    public final fp.j f496413w = new fp.j();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f496414x = new java.util.concurrent.ConcurrentHashMap();

    public p3() {
        this.f496398e = false;
        this.f496399f = null;
        this.f496398e = true;
        xu5.b a17 = xu5.b.a("VideoService_runThread");
        this.f496397d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17);
        this.f496399f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(a17, (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new t21.l3(this), false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoService", "create VideoService, start video send thread");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0437, code lost:
    
        if (((r0 == 0 || r0 == 1) ? false : true) != false) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(t21.p3 r18) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.p3.b(t21.p3):void");
    }

    public void c(java.lang.String str, int i17, wf0.u1 u1Var) {
        this.f496414x.put(str, u1Var);
        gm0.j1.e().j(new t21.o3(this, str, i17));
    }

    public final void f() {
        ((java.util.HashMap) this.f496405o).clear();
        ((java.util.LinkedList) this.f496401h).clear();
        ((java.util.LinkedList) this.f496402i).clear();
        ((java.util.LinkedList) this.f496403m).clear();
        ((java.util.LinkedList) this.f496404n).clear();
        this.f496407q = false;
        this.f496406p = false;
        this.f496408r = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoService", "Finish service use time(ms):" + this.f496413w.a());
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f496414x;
        wf0.u1 u1Var = (wf0.u1) concurrentHashMap.get(r1Var.f527062a);
        if (u1Var != null) {
            u1Var.h(r1Var);
        }
        java.lang.String str = r1Var.f527062a;
        t21.v2 h17 = t21.d3.h(str);
        if (h17 != null) {
            int i17 = h17.f496544i;
            if (i17 == 199 || i17 == 198) {
                concurrentHashMap.remove(str);
            }
        }
    }

    public boolean i() {
        boolean z17 = false;
        if (this.f496411u != null) {
            gm0.j1.d().d(this.f496411u);
            this.f496408r = false;
            z17 = true;
        }
        ((java.util.HashMap) this.f496405o).clear();
        ((java.util.LinkedList) this.f496401h).clear();
        ((java.util.LinkedList) this.f496402i).clear();
        ((java.util.LinkedList) this.f496403m).clear();
        ((java.util.LinkedList) this.f496404n).clear();
        return z17;
    }

    public void k() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        if (!this.f496398e || (n3Var = this.f496397d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoService", "run error!, handler or thread is null!");
        } else {
            n3Var.mo50293x3498a0(new t21.n3(this));
        }
    }
}
