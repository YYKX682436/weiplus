package yt3;

/* loaded from: classes10.dex */
public final class b2 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f546888d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f546889e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f546890f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f546891g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f546892h;

    /* renamed from: i, reason: collision with root package name */
    public qk.o9 f546893i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f546894m;

    /* renamed from: n, reason: collision with root package name */
    public ct0.b f546895n;

    /* renamed from: o, reason: collision with root package name */
    public ym5.x2 f546896o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f546897p;

    /* renamed from: q, reason: collision with root package name */
    public l45.q f546898q;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f546899r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f546900s;

    /* renamed from: t, reason: collision with root package name */
    public qk.g6 f546901t;

    /* renamed from: u, reason: collision with root package name */
    public final int f546902u;

    /* renamed from: v, reason: collision with root package name */
    public final float f546903v;

    public b2(android.widget.FrameLayout photoLayout, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(photoLayout, "photoLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f546888d = photoLayout;
        this.f546889e = status;
        this.f546890f = jz5.h.b(yt3.v1.f547232d);
        this.f546891g = jz5.h.b(yt3.u1.f547221d);
        jz5.h.b(new yt3.w1(this));
        jz5.h.b(new yt3.y1(this));
        jz5.h.b(new yt3.x1(this));
        jz5.h.b(yt3.z1.f547269d);
        this.f546892h = jz5.h.b(new yt3.a2(this));
        this.f546897p = java.lang.String.valueOf(java.lang.System.currentTimeMillis() + hashCode());
        this.f546899r = photoLayout.getContext();
        this.f546901t = qk.g6.DEFAULT;
        this.f546902u = -1;
        this.f546903v = 1.0f;
    }

    public final void a(boolean z17, yz5.l lVar) {
        qk.o9 o9Var = this.f546893i;
        qk.v7 b17 = o9Var != null ? o9Var.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        boolean g17 = ((f65.r) b17).g();
        if (z17 && !g17) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f546894m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046(bool, "", c16993xacc19624 != null ? c16993xacc19624.D : null, -1L, bool, nu3.i.f421751a.l());
            if (lVar != null) {
                lVar.mo146xb9724478(c16991x15ced046);
                return;
            }
            return;
        }
        if (g17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 118L, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 127L, 1L, false);
        if (this.f546900s) {
            return;
        }
        android.content.Context context = this.f546899r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        if (((android.app.Activity) context).isFinishing()) {
            return;
        }
        this.f546900s = true;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "dofinish time: " + elapsedRealtime + ' ' + g17);
        qk.o9 o9Var2 = this.f546893i;
        if (o9Var2 != null) {
            o9Var2.g(new yt3.s1(elapsedRealtime, this, z17, lVar), false);
        }
    }

    public final boolean b() {
        l45.q qVar = this.f546898q;
        if (qVar != null) {
            dl.t tVar = (dl.t) ((l45.n) qVar).d(qk.g6.CROP_PHOTO);
            if (tVar != null) {
                return tVar.Z;
            }
        }
        return false;
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        qk.g6 g6Var = this.f546901t;
        qk.g6 g6Var2 = qk.g6.CROP_PHOTO;
        if (g6Var != g6Var2) {
            return false;
        }
        this.f546901t = qk.g6.DEFAULT;
        l45.q qVar = this.f546898q;
        if (qVar != null) {
            new l45.a((l45.n) qVar).b(g6Var2, 1, null);
        }
        return true;
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f546890f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((qk.o9) mo141623x754a37bb).f();
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f546891g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((qk.o9) mo141623x754a37bb2).f();
        android.widget.FrameLayout frameLayout = this.f546888d;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
        l45.q qVar = this.f546898q;
        if (qVar != null) {
            ((l45.n) qVar).p();
        }
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        qk.g6 g6Var = qk.g6.DEFAULT;
        this.f546901t = g6Var;
        l45.q qVar = this.f546898q;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f546898q;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, -1, null);
        }
    }
}
