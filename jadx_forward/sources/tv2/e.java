package tv2;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv2.f f503822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f503823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 f503824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f503825g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f503826h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f503827i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f503828m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f503829n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f503830o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f503831p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f503832q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tv2.f fVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1, long j17, java.lang.String str, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f503822d = fVar;
        this.f503823e = f0Var;
        this.f503824f = c19791x8d6e6bf1;
        this.f503825g = j17;
        this.f503826h = str;
        this.f503827i = z17;
        this.f503828m = f0Var2;
        this.f503829n = f0Var3;
        this.f503830o = c11120x15dce88d;
        this.f503831p = obj;
        this.f503832q = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z result = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", "buildFromFilePath: success " + result.f257326a);
        tv2.f fVar = this.f503822d;
        fVar.f503834i = null;
        mv2.f0.f413094a.d(result, fVar.f503833h);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f503823e;
        if (result.f257326a) {
            this.f503824f.m76741xb2825ae8((int) (android.os.SystemClock.elapsedRealtime() - this.f503825g));
            i17 = 0;
            this.f503824f.m76740xdf45e033(0);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f503825g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.C(1253L, 1L, elapsedRealtime);
            g0Var.C(1523L, 1L, elapsedRealtime);
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(this.f503826h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", "remuxer succ longvideo, size:" + k17 + ", cost: " + (android.os.SystemClock.elapsedRealtime() - this.f503825g) + ", path:" + this.f503826h + " localId:" + this.f503822d.f503833h.m59260x51f8f5b0());
            if (!this.f503827i) {
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                i18 = uv2.e.f512909a.f(this.f503826h, this.f503828m.f391649d, this.f503829n.f391649d, this.f503830o, !this.f503827i);
                if (k17 > uv2.e.f512910b) {
                    this.f503824f.m76745xa075aecc((int) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
                    if (i18 == 0) {
                        this.f503824f.m76744x6e9551cf(1);
                    } else {
                        this.f503824f.m76744x6e9551cf(2);
                    }
                }
            } else if (k17 > uv2.e.f512910b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", "remux longvideo, size out of range");
                g0Var.C(1523L, 101L, 1L);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = this.f503822d.f503833h.f66946x284ddcb8;
                if (c19783xd9a946b7 != null) {
                    c19783xd9a946b7.m76402x3968dd59(1);
                }
                tv2.f fVar2 = this.f503822d;
                fVar2.getClass();
                cu2.u.f303974a.l(fVar2.f503833h);
                i18 = -4;
            }
            i17 = i18;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", "remuxer failed longvideo localId:" + this.f503822d.f503833h.m59260x51f8f5b0() + ", isCancel:" + result.f257328c);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s4 s4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s4.f206881a;
            s4Var.a(true);
            s4Var.a(true);
            this.f503824f.m76741xb2825ae8((int) (android.os.SystemClock.elapsedRealtime() - this.f503825g));
            i17 = -1;
            this.f503824f.m76740xdf45e033(-1);
        }
        f0Var.f391649d = i17;
        java.lang.Object obj2 = this.f503831p;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f503832q;
        synchronized (obj2) {
            c0Var.f391645d = true;
            obj2.notifyAll();
        }
        return jz5.f0.f384359a;
    }
}
