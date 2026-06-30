package rq4;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final rq4.k f480549a;

    /* renamed from: b, reason: collision with root package name */
    public android.util.Size f480550b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.Size f480551c;

    /* renamed from: d, reason: collision with root package name */
    public int f480552d;

    /* renamed from: e, reason: collision with root package name */
    public int f480553e;

    /* renamed from: f, reason: collision with root package name */
    public long f480554f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f480555g;

    /* renamed from: h, reason: collision with root package name */
    public long f480556h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f480557i;

    /* renamed from: j, reason: collision with root package name */
    public long f480558j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f480559k;

    /* renamed from: l, reason: collision with root package name */
    public int f480560l;

    /* renamed from: m, reason: collision with root package name */
    public int f480561m;

    /* renamed from: n, reason: collision with root package name */
    public int f480562n;

    /* renamed from: o, reason: collision with root package name */
    public final int f480563o;

    public m() {
        rq4.k kVar = new rq4.k();
        this.f480549a = kVar;
        qq4.c.f447520a = new rq4.c();
        qq4.c.f447521b = new rq4.e();
        qq4.c.f447522c = new rq4.l();
        qq4.c.f447523d = new rq4.j();
        qq4.c.f447524e = new rq4.d();
        qq4.c.f447525f = new rq4.i();
        qq4.a.f447499a.add(kVar);
        vq4.b0 b0Var = vq4.b0.f520803a;
        this.f480563o = 5000;
    }

    public final void a(boolean z17) {
        rq4.i iVar = qq4.c.f447525f;
        if (iVar != null) {
            if (z17 && iVar.f480504e == 0) {
                long j17 = (wo.v1.f529355b.f529193e != 1 || gq4.v.wi().f447513n) ? gq4.v.wi().f447516q : gq4.v.wi().f447517r;
                if (j17 != 0) {
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    iVar.f480504e = java.lang.System.currentTimeMillis() - j17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPProfileReport", "local first frame come cost " + iVar.f480504e);
                }
            } else if (!z17 && iVar.f480505f == 0 && gq4.v.wi().f447517r != 0) {
                long j18 = gq4.v.wi().f447517r;
                if (j18 != 0) {
                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    iVar.f480505f = java.lang.System.currentTimeMillis() - j18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPProfileReport", "remote first frame come cost " + iVar.f480505f);
                }
            }
        }
        if (z17) {
            if (this.f480555g) {
                this.f480555g = false;
                rq4.j jVar = qq4.c.f447523d;
                if (jVar != null) {
                    long j19 = this.f480554f;
                    boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    jVar.m(true, java.lang.System.currentTimeMillis() - j19);
                }
            }
            this.f480560l++;
            boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f480554f = java.lang.System.currentTimeMillis();
        } else {
            if (this.f480557i) {
                this.f480557i = false;
                rq4.j jVar2 = qq4.c.f447523d;
                if (jVar2 != null) {
                    long j27 = this.f480556h;
                    boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    jVar2.m(false, java.lang.System.currentTimeMillis() - j27);
                }
            }
            this.f480561m++;
            boolean z37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f480556h = java.lang.System.currentTimeMillis();
        }
        rq4.j jVar3 = qq4.c.f447523d;
        if (jVar3 != null) {
            jVar3.j(z17);
        }
    }

    public final void b(boolean z17, int i17) {
        rq4.k kVar = this.f480549a;
        if (z17 && i17 != this.f480552d) {
            this.f480552d = i17;
            kVar.a(29);
        } else {
            if (z17 || this.f480553e == i17) {
                return;
            }
            this.f480553e = i17;
            kVar.a(32);
        }
    }

    public final void c(boolean z17, android.util.Size size) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        rq4.k kVar = this.f480549a;
        if (z17 && (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(size, this.f480550b) || this.f480550b == null)) {
            this.f480550b = size;
            kVar.a(27);
        } else {
            if (z17) {
                return;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(size, this.f480551c) || this.f480551c == null) {
                this.f480551c = size;
                kVar.a(30);
            }
        }
    }

    public final void d() {
        sq4.b bVar;
        if (this.f480557i) {
            this.f480557i = false;
            rq4.j jVar = qq4.c.f447523d;
            if (jVar != null) {
                long j17 = this.f480556h;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                jVar.m(false, java.lang.System.currentTimeMillis() - j17);
            }
        }
        if (this.f480559k) {
            this.f480559k = false;
            rq4.d dVar = qq4.c.f447524e;
            if (dVar != null) {
                long j18 = this.f480558j;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                dVar.b(java.lang.System.currentTimeMillis() - j18);
            }
        }
        if (this.f480555g) {
            this.f480555g = false;
            rq4.j jVar2 = qq4.c.f447523d;
            if (jVar2 != null) {
                long j19 = this.f480554f;
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                jVar2.m(true, java.lang.System.currentTimeMillis() - j19);
            }
        }
        rq4.j jVar3 = qq4.c.f447523d;
        if (jVar3 != null) {
            jVar3.j(false);
        }
        rq4.j jVar4 = qq4.c.f447523d;
        if (jVar4 != null) {
            jVar4.j(true);
        }
        rq4.e eVar = qq4.c.f447521b;
        if (eVar == null || (bVar = (sq4.b) eVar.f480494a.get(eVar.f480496c)) == null) {
            return;
        }
        bVar.b();
    }
}
