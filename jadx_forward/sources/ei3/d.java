package ei3;

/* loaded from: classes10.dex */
public class d {

    /* renamed from: i, reason: collision with root package name */
    public static int f334558i = 4;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3[] f334559a;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f334563e;

    /* renamed from: f, reason: collision with root package name */
    public final ei3.c f334564f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f334565g;

    /* renamed from: b, reason: collision with root package name */
    public int f334560b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f334561c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f334562d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final ei3.f f334566h = new ei3.b(this);

    public d(ei3.c cVar) {
        this.f334565g = false;
        this.f334564f = cVar;
        f334558i = -1;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b() != null) {
            f334558i = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66817xb58848b9(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_THREADCOUNT_INT_SYNC, -1);
        }
        int i17 = f334558i;
        if (i17 == -1) {
            int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
            f334558i = availableProcessors;
            int min = java.lang.Math.min(4, availableProcessors);
            f334558i = min;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMgr", "ForwardMgr THREAD_COUNT from runtime %d, availableProcessors: %s", java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(java.lang.Runtime.getRuntime().availableProcessors()));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMgr", "ForwardMgr THREAD_COUNT from config %d", java.lang.Integer.valueOf(i17));
        }
        int i18 = f334558i;
        this.f334559a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3[i18];
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69202x4626d238(i18);
        int i19 = 0;
        while (true) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3[] n3VarArr = this.f334559a;
            if (i19 >= n3VarArr.length) {
                this.f334565g = false;
                return;
            }
            n3VarArr[i19] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("BigSightMediaCodecMP4MuxRecorder_FrameBufProcessMgr_" + i19);
            i19++;
        }
    }

    public final void a() {
        boolean z17;
        java.util.LinkedList linkedList = this.f334562d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMgr", "processBufList %d %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f334561c));
        while (linkedList.size() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMgr", "loop processBufList %d %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f334561c));
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                ei3.g gVar = (ei3.g) it.next();
                int i17 = this.f334561c;
                if (i17 == gVar.f334579c) {
                    this.f334561c = i17 + 1;
                    ((ei3.a1) this.f334564f).a(gVar.f334578b);
                    linkedList.remove(gVar);
                    z17 = true;
                    break;
                }
            }
            if (!z17) {
                return;
            }
        }
    }

    public void b() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMgr", "stop FrameBufProcessMgr %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3[] n3VarArr = this.f334559a;
            if (i17 >= n3VarArr.length) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69229x7e91a5e1(f334558i);
                this.f334565g = true;
                return;
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = n3VarArr[i17];
                if (n3Var != null) {
                    n3Var.mo50283x2f1920ea().f538836b.g();
                    n3VarArr[i17] = null;
                }
                i17++;
            }
        }
    }

    /* renamed from: finalize */
    public void m127740xd764dc1e() {
        try {
            b();
        } catch (java.lang.Throwable unused) {
        }
        super.finalize();
    }
}
