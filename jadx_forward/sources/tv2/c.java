package tv2;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv2.f f503807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f503808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f503809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 f503810g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f503811h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f503812i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.i70 f503813m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f503814n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f503815o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f503816p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f503817q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tv2.f fVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1, long j17, java.lang.String str, r45.i70 i70Var, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, r45.h70 h70Var, java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f503807d = fVar;
        this.f503808e = f0Var;
        this.f503809f = i17;
        this.f503810g = c19791x8d6e6bf1;
        this.f503811h = j17;
        this.f503812i = str;
        this.f503813m = i70Var;
        this.f503814n = c11120x15dce88d;
        this.f503815o = h70Var;
        this.f503816p = obj;
        this.f503817q = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z result = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        tv2.f fVar = this.f503807d;
        fVar.f503834i = null;
        fVar.f503833h.m59260x51f8f5b0();
        mv2.f0.f413094a.d(result, this.f503807d.f503833h);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f503808e;
        if (result.f257326a) {
            this.f503810g.m76741xb2825ae8((int) (android.os.SystemClock.elapsedRealtime() - this.f503811h));
            boolean z17 = false;
            this.f503810g.m76740xdf45e033(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1253L, 1L, android.os.SystemClock.elapsedRealtime() - this.f503811h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", "remuxer succ " + this.f503809f + ", cost: " + (android.os.SystemClock.elapsedRealtime() - this.f503811h) + ", path:" + this.f503812i + " localId:" + this.f503807d.f503833h.m59260x51f8f5b0());
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(this.f503812i);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            uv2.e eVar = uv2.e.f512909a;
            java.lang.String str = this.f503812i;
            r45.i70 i70Var = this.f503813m;
            int f17 = eVar.f(str, i70Var.f458313i, i70Var.f458314m, this.f503814n, false);
            if (k17 > uv2.e.f512910b) {
                this.f503810g.m76745xa075aecc((int) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                if (f17 == 0) {
                    this.f503810g.m76744x6e9551cf(1);
                } else {
                    this.f503810g.m76744x6e9551cf(2);
                }
            }
            if (!android.text.TextUtils.isEmpty(this.f503815o.f457434h) || this.f503815o.f457430d.size() > 1 || this.f503815o.f457437n.f456472e.size() > 0 || this.f503815o.f457437n.f456473f) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = this.f503807d.f503833h.f66946x284ddcb8;
                java.lang.Integer valueOf = c19783xd9a946b7 != null ? java.lang.Integer.valueOf(c19783xd9a946b7.m76275xbcc8608a()) : null;
                if ((valueOf != null && valueOf.intValue() == 16) || (valueOf != null && valueOf.intValue() == 27)) {
                    z17 = true;
                }
                if (!z17) {
                    ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).bj(this.f503812i);
                }
            }
            i17 = f17;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", "remuxer failed " + this.f503809f + " localId:" + this.f503807d.f503833h.m59260x51f8f5b0() + " isCancel:" + result.f257328c);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1253L, 2L, 1L);
            this.f503810g.m76741xb2825ae8((int) (android.os.SystemClock.elapsedRealtime() - this.f503811h));
            i17 = -1;
            this.f503810g.m76740xdf45e033(-1);
        }
        f0Var.f391649d = i17;
        java.lang.Object obj2 = this.f503816p;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f503817q;
        synchronized (obj2) {
            c0Var.f391645d = true;
            obj2.notify();
        }
        return jz5.f0.f384359a;
    }
}
