package wv2;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f531523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wv2.c f531524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f531525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 f531526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f531527h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.i70 f531528i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f531529m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f531530n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f531531o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f531532p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, wv2.c cVar, long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1, java.lang.String str, r45.i70 i70Var, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, r45.h70 h70Var, java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f531523d = f0Var;
        this.f531524e = cVar;
        this.f531525f = j17;
        this.f531526g = c19791x8d6e6bf1;
        this.f531527h = str;
        this.f531528i = i70Var;
        this.f531529m = c11120x15dce88d;
        this.f531530n = h70Var;
        this.f531531o = obj;
        this.f531532p = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z result = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f531523d;
        if (result.f257326a) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = this.f531526g;
            long j17 = this.f531525f;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c19791x8d6e6bf1.m76741xb2825ae8((int) (android.os.SystemClock.elapsedRealtime() - j17));
            this.f531526g.m76740xdf45e033(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1253L, 1L, android.os.SystemClock.elapsedRealtime() - this.f531525f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "remuxer succ, cost: " + (android.os.SystemClock.elapsedRealtime() - this.f531525f) + ", path:" + this.f531527h + " localId:" + this.f531524e.f531533h.m59260x51f8f5b0());
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(this.f531527h);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            uv2.e eVar = uv2.e.f512909a;
            java.lang.String str = this.f531527h;
            r45.i70 i70Var = this.f531528i;
            int f17 = eVar.f(str, i70Var.f458313i, i70Var.f458314m, this.f531529m, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (k17 > t70Var.N2() && t70Var.k() != 1) {
                this.f531526g.m76745xa075aecc((int) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                if (f17 == 0) {
                    this.f531526g.m76744x6e9551cf(1);
                } else {
                    this.f531526g.m76744x6e9551cf(2);
                }
            }
            if (!android.text.TextUtils.isEmpty(this.f531530n.f457434h) || this.f531530n.f457430d.size() > 1 || this.f531530n.f457437n.f456472e.size() > 0 || this.f531530n.f457437n.f456473f) {
                ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).bj(this.f531527h);
            }
            i17 = f17;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remuxer failed localId:");
            sb6.append(this.f531524e.f531533h.m59260x51f8f5b0());
            sb6.append(", cost:");
            long j18 = this.f531525f;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1253L, 2L, 1L);
            this.f531526g.m76741xb2825ae8((int) (android.os.SystemClock.elapsedRealtime() - this.f531525f));
            i17 = -1;
            this.f531526g.m76740xdf45e033(-1);
        }
        f0Var.f391649d = i17;
        java.lang.Object obj2 = this.f531531o;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f531532p;
        synchronized (obj2) {
            c0Var.f391645d = true;
            obj2.notify();
        }
        return jz5.f0.f384359a;
    }
}
