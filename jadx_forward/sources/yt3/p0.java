package yt3;

/* loaded from: classes10.dex */
public final class p0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f547112d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f547113e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f547114f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f547115g;

    /* renamed from: h, reason: collision with root package name */
    public qk.o9 f547116h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f547117i;

    /* renamed from: m, reason: collision with root package name */
    public ct0.b f547118m;

    /* renamed from: n, reason: collision with root package name */
    public ym5.x2 f547119n;

    /* renamed from: o, reason: collision with root package name */
    public l45.q f547120o;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.Context f547121p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f547122q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f547123r;

    /* renamed from: s, reason: collision with root package name */
    public qk.g6 f547124s;

    /* renamed from: t, reason: collision with root package name */
    public int f547125t;

    /* renamed from: u, reason: collision with root package name */
    public int f547126u;

    /* renamed from: v, reason: collision with root package name */
    public float f547127v;

    public p0(android.widget.FrameLayout photoLayout, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(photoLayout, "photoLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547112d = photoLayout;
        this.f547113e = status;
        this.f547114f = jz5.h.b(yt3.o0.f547091d);
        this.f547115g = jz5.h.b(yt3.n0.f547078d);
        this.f547121p = photoLayout.getContext();
        this.f547124s = qk.g6.DEFAULT;
        this.f547125t = -1;
        this.f547126u = -1;
        this.f547127v = 1.0f;
    }

    public static final void a(yt3.p0 p0Var, android.view.MotionEvent motionEvent) {
        p0Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            p0Var.f547123r = false;
            return;
        }
        ju3.d0 d0Var = p0Var.f547113e;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                p0Var.f547123r = true;
                ju3.d0.k(d0Var, ju3.c0.K1, null, 2, null);
                return;
            } else if (actionMasked != 5 && actionMasked != 6) {
                return;
            }
        }
        if (p0Var.f547123r) {
            ju3.d0.k(d0Var, ju3.c0.L1, null, 2, null);
        } else {
            ju3.d0.k(d0Var, ju3.c0.J1, null, 2, null);
        }
    }

    public final void b() {
        this.f547124s = qk.g6.DEFAULT;
        l45.q qVar = this.f547120o;
        if (qVar != null) {
            new l45.a((l45.n) qVar).b(qk.g6.CROP_PHOTO, 2, null);
        }
    }

    public final void c(yz5.l lVar) {
        nu3.i iVar = nu3.i.f421751a;
        qk.o9 o9Var = this.f547116h;
        qk.v7 b17 = o9Var != null ? o9Var.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b17).b()));
        qk.o9 o9Var2 = this.f547116h;
        qk.v7 b18 = o9Var2 != null ? o9Var2.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
        iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b18).e()));
        qk.o9 o9Var3 = this.f547116h;
        qk.v7 b19 = o9Var3 != null ? o9Var3.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b19);
        iVar.n("KEY_ADD_DOODLE_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b19).a()));
        qk.o9 o9Var4 = this.f547116h;
        qk.v7 b27 = o9Var4 != null ? o9Var4.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b27);
        iVar.n("KEY_ADD_DOODLE_COLOR_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b27).d()));
        qk.o9 o9Var5 = this.f547116h;
        qk.v7 b28 = o9Var5 != null ? o9Var5.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b28);
        iVar.n("KEY_ADD_MOSAIC_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b28).c()));
        qk.o9 o9Var6 = this.f547116h;
        qk.v7 b29 = o9Var6 != null ? o9Var6.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b29);
        iVar.n("KEY_ROTATE_INT", java.lang.Integer.valueOf(((f65.r) b29).h() ? 1 : 0));
        l45.q qVar = this.f547120o;
        iVar.n("KEY_ZOOM_IN_OUT_COUNT", java.lang.Integer.valueOf(qVar != null ? ((l45.n) qVar).f398009q : 0));
        iVar.n("KEY_AFTER_EDIT_INT", 1);
        nu3.m mVar = nu3.m.f421762a;
        int[] iArr = new int[3];
        qk.o9 o9Var7 = this.f547116h;
        qk.v7 b37 = o9Var7 != null ? o9Var7.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b37);
        iArr[0] = ((f65.r) b37).b();
        qk.o9 o9Var8 = this.f547116h;
        qk.v7 b38 = o9Var8 != null ? o9Var8.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b38);
        iArr[1] = ((f65.r) b38).e();
        iArr[2] = -1;
        mVar.g(iArr);
        mVar.i(1, 2L);
        qk.o9 o9Var9 = this.f547116h;
        qk.v7 b39 = o9Var9 != null ? o9Var9.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b39);
        boolean g17 = ((f65.r) b39).g();
        iVar.n("KEY_PHOTO_IS_EDITED_BOOLEAN", java.lang.Boolean.valueOf(g17));
        if (g17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 118L, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 127L, 1L, false);
        if (this.f547122q) {
            return;
        }
        android.content.Context context = this.f547121p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        if (((android.app.Activity) context).isFinishing()) {
            return;
        }
        this.f547122q = true;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "dofinish time: " + elapsedRealtime + ' ' + g17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        l45.q qVar2 = this.f547120o;
        if (qVar2 != null) {
            arrayList.addAll(((l45.n) qVar2).j());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doFinish: currentSelectedEmojiList size=");
        l45.q qVar3 = this.f547120o;
        sb6.append(qVar3 != null ? java.lang.Integer.valueOf(((java.util.ArrayList) ((l45.n) qVar3).j()).size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", sb6.toString());
        qk.o9 o9Var10 = this.f547116h;
        if (o9Var10 != null) {
            o9Var10.g(new yt3.i0(elapsedRealtime, this, arrayList, g17, lVar), true);
        }
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        qk.g6 g6Var = this.f547124s;
        qk.g6 g6Var2 = qk.g6.CROP_PHOTO;
        if (g6Var != g6Var2) {
            return false;
        }
        this.f547124s = qk.g6.DEFAULT;
        l45.q qVar = this.f547120o;
        if (qVar != null) {
            new l45.a((l45.n) qVar).b(g6Var2, 1, null);
        }
        return true;
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f547114f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((qk.o9) mo141623x754a37bb).f();
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f547115g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((qk.o9) mo141623x754a37bb2).f();
        android.widget.FrameLayout frameLayout = this.f547112d;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
        l45.q qVar = this.f547120o;
        if (qVar != null) {
            ((l45.n) qVar).p();
        }
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        qk.g6 g6Var = qk.g6.DEFAULT;
        this.f547124s = g6Var;
        l45.q qVar = this.f547120o;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f547120o;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, -1, null);
        }
    }
}
