package sv2;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sv2.m f494853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f494854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 f494855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f494856g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f494857h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f494858i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f494859m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f494860n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f494861o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f494862p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f494863q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(sv2.m mVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1, long j17, java.lang.String str, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f494853d = mVar;
        this.f494854e = f0Var;
        this.f494855f = c19791x8d6e6bf1;
        this.f494856g = j17;
        this.f494857h = str;
        this.f494858i = z17;
        this.f494859m = f0Var2;
        this.f494860n = f0Var3;
        this.f494861o = c11120x15dce88d;
        this.f494862p = obj;
        this.f494863q = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z result = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        sv2.m mVar = this.f494853d;
        mVar.f494867n = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mVar.f494865i, "buildFromFilePath: success " + result.f257326a);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f494854e;
        if (result.f257326a) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = this.f494855f;
            long j17 = this.f494856g;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c19791x8d6e6bf1.m76741xb2825ae8((int) (android.os.SystemClock.elapsedRealtime() - j17));
            i17 = 0;
            this.f494855f.m76740xdf45e033(0);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f494856g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.C(1718L, 1L, elapsedRealtime);
            g0Var.C(1719L, 1L, elapsedRealtime);
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(this.f494857h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494853d.f494865i, "remuxer succ longvideo, size:" + k17 + ", cost: " + (android.os.SystemClock.elapsedRealtime() - this.f494856g) + ", path:" + this.f494857h + " localId:" + this.f494853d.f494864h.f66236x88be67a1);
            if (!this.f494858i) {
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                i18 = uv2.e.f512909a.f(this.f494857h, this.f494859m.f391649d, this.f494860n.f391649d, this.f494861o, !this.f494858i);
                if (k17 > uv2.e.f512910b) {
                    this.f494855f.m76745xa075aecc((int) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
                    if (i18 == 0) {
                        this.f494855f.m76744x6e9551cf(1);
                    } else {
                        this.f494855f.m76744x6e9551cf(2);
                    }
                }
            } else if (k17 > uv2.e.f512910b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494853d.f494865i, "remux longvideo, size out of range");
                g0Var.C(1719L, 101L, 1L);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = this.f494853d.f494866m.f66946x284ddcb8;
                if (c19783xd9a946b7 != null) {
                    c19783xd9a946b7.m76402x3968dd59(1);
                }
                cu2.o.f303963a.b(this.f494853d.f494864h);
                i18 = -4;
            }
            i17 = i18;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494853d.f494865i, "remuxer failed longvideo localId:" + this.f494853d.f494864h.f66236x88be67a1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d0.f206520a;
            d0Var.a(true);
            d0Var.a(true);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf12 = this.f494855f;
            long j18 = this.f494856g;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c19791x8d6e6bf12.m76741xb2825ae8((int) (android.os.SystemClock.elapsedRealtime() - j18));
            i17 = -1;
            this.f494855f.m76740xdf45e033(-1);
        }
        f0Var.f391649d = i17;
        java.lang.Object obj2 = this.f494862p;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f494863q;
        synchronized (obj2) {
            c0Var.f391645d = true;
            obj2.notifyAll();
        }
        return jz5.f0.f384359a;
    }
}
