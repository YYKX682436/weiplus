package sv2;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sv2.m f494838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f494839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f494840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 f494841g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f494842h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f494843i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.i70 f494844m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f494845n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f494846o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f494847p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f494848q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sv2.m mVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1, long j17, java.lang.String str, r45.i70 i70Var, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, r45.h70 h70Var, java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f494838d = mVar;
        this.f494839e = f0Var;
        this.f494840f = i17;
        this.f494841g = c19791x8d6e6bf1;
        this.f494842h = j17;
        this.f494843i = str;
        this.f494844m = i70Var;
        this.f494845n = c11120x15dce88d;
        this.f494846o = h70Var;
        this.f494847p = obj;
        this.f494848q = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int f17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z result = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        sv2.m mVar = this.f494838d;
        mVar.f494867n = null;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f494839e;
        if (result.f257326a) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = this.f494841g;
            long j17 = this.f494842h;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c19791x8d6e6bf1.m76741xb2825ae8((int) (android.os.SystemClock.elapsedRealtime() - j17));
            this.f494841g.m76740xdf45e033(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1718L, 1L, android.os.SystemClock.elapsedRealtime() - this.f494842h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494838d.f494865i, "remuxer succ " + this.f494840f + ", cost: " + (android.os.SystemClock.elapsedRealtime() - this.f494842h) + ", path:" + this.f494843i + " localId:" + this.f494838d.f494864h.f66236x88be67a1);
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(this.f494843i);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            uv2.e eVar = uv2.e.f512909a;
            java.lang.String str = this.f494843i;
            r45.i70 i70Var = this.f494844m;
            f17 = eVar.f(str, i70Var.f458313i, i70Var.f458314m, this.f494845n, false);
            if (k17 > uv2.e.f512910b) {
                this.f494841g.m76745xa075aecc((int) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                if (f17 == 0) {
                    this.f494841g.m76744x6e9551cf(1);
                } else {
                    this.f494841g.m76744x6e9551cf(2);
                }
            }
            if (!android.text.TextUtils.isEmpty(this.f494846o.f457434h) || this.f494846o.f457430d.size() > 1 || this.f494846o.f457437n.f456472e.size() > 0 || this.f494846o.f457437n.f456473f) {
                ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).bj(this.f494843i);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mVar.f494865i, "remuxer failed " + this.f494840f + " localId:" + this.f494838d.f494864h.f66236x88be67a1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1718L, 2L, 1L);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf12 = this.f494841g;
            long j18 = this.f494842h;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c19791x8d6e6bf12.m76741xb2825ae8((int) (android.os.SystemClock.elapsedRealtime() - j18));
            f17 = -1;
            this.f494841g.m76740xdf45e033(-1);
        }
        f0Var.f391649d = f17;
        java.lang.Object obj2 = this.f494847p;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f494848q;
        synchronized (obj2) {
            c0Var.f391645d = true;
            obj2.notify();
        }
        return jz5.f0.f384359a;
    }
}
