package fh1;

/* loaded from: classes7.dex */
public final class z implements fh1.i, fj1.k {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f344160a;

    /* renamed from: b, reason: collision with root package name */
    public final int f344161b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f344162c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f344163d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f344164e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f344165f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f344166g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f344167h;

    /* renamed from: i, reason: collision with root package name */
    public volatile fh1.x0 f344168i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f344169j;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 miniProgramRuntime, int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 wxaCommLib) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(miniProgramRuntime, "miniProgramRuntime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaCommLib, "wxaCommLib");
        this.f344160a = miniProgramRuntime;
        this.f344161b = i17;
        this.f344162c = str;
        this.f344163d = wxaCommLib;
        i95.n0.c(fh1.f0.class);
        this.f344164e = "MicroMsg.MBFrameBizHostImpl(" + hashCode() + ')';
        this.f344166g = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f344167h = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final fh1.x0 a() {
        java.lang.String str;
        fh1.x0 x0Var = this.f344168i;
        if (x0Var != null) {
            return x0Var;
        }
        synchronized (this) {
            fh1.x0 x0Var2 = this.f344168i;
            if (x0Var2 != null) {
                return x0Var2;
            }
            fh1.x0 x0Var3 = new fh1.x0(this, this.f344162c, this.f344163d);
            x0Var3.F = new fh1.l(this);
            this.f344168i = x0Var3;
            fh1.x0 x0Var4 = this.f344168i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x0Var4);
            jc3.j0 j0Var = x0Var4.f364528g;
            if (j0Var == null || (str = ((rc3.w0) j0Var).f475620e) == null) {
                str = "";
            }
            this.f344165f = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f344164e, "bind bizInstance:" + c() + ", with runtime:" + this.f344160a + ", biz:" + this.f344161b + ", fsPath:" + this.f344162c);
            fh1.x0 x0Var5 = this.f344168i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x0Var5);
            return x0Var5;
        }
    }

    public final java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        if (this.f344167h.get()) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        } else {
            fh1.o oVar = new fh1.o(this, rVar);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
                oVar.mo152xb9724478();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new fh1.m(this, rVar, oVar));
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final java.lang.String c() {
        java.lang.String str = this.f344165f;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bizInstanceName");
        throw null;
    }

    public fj1.y d(java.lang.String appId) {
        java.lang.Object obj = null;
        if (appId == null || appId.length() == 0) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0.f165835a;
        java.lang.String c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0.f165836b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            fj1.y yVar = (fj1.y) next;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yVar.f344676c.f165787i, c17) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yVar.c(), appId)) {
                obj = next;
                break;
            }
        }
        return (fj1.y) obj;
    }

    public final void e(yz5.a aVar) {
        if (this.f344167h.get()) {
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            aVar.mo152xb9724478();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fh1.y(this, aVar));
        }
    }
}
