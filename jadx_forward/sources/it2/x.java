package it2;

@j95.b
/* loaded from: classes7.dex */
public final class x extends i95.w implements rs5.f, jc3.u, jc3.g0 {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f376061s = new java.util.concurrent.atomic.AtomicInteger(1);

    /* renamed from: t, reason: collision with root package name */
    public static final jz5.g f376062t = jz5.h.b(it2.l.f376045d);

    /* renamed from: d, reason: collision with root package name */
    public jc3.j0 f376063d;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f376066g;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f376068i;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f376064e = jz5.h.b(new it2.m(this));

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f376065f = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f376067h = jz5.h.b(it2.w.f376060d);

    /* renamed from: m, reason: collision with root package name */
    public final android.os.Handler f376069m = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f376070n = new it2.o(this);

    /* renamed from: o, reason: collision with root package name */
    public final android.util.SparseArray f376071o = new android.util.SparseArray();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f376072p = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f376073q = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f376074r = "ilinkres_1b31184b";

    public final void Ai() {
        android.os.Handler handler = this.f376069m;
        java.lang.Runnable runnable = this.f376070n;
        handler.removeCallbacks(runnable);
        if (this.f376063d == null) {
            java.lang.String Bi = Bi();
            if (Bi == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicRewardFeatureService", "pkg not found, setup biz failed");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicRewardFeatureService", "setup biz with version: ".concat(Bi));
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
            it2.k bizContext = (it2.k) ((jz5.n) this.f376064e).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizContext, "bizContext");
            c16416x87606a7b.f229367x = bizContext;
            c16416x87606a7b.f229361r = this;
            c16416x87606a7b.a(kz5.n0.t0(((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4.class))).Ni("MagicReward"), kz5.c0.i(new jt2.a(), new jt2.c(), new jt2.b())));
            c16416x87606a7b.f229365v = ((je3.i) i95.n0.c(je3.i.class)).Ii(0.001f);
            c16416x87606a7b.f229354h = true;
            jc3.j0 wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4.class))).wi("MagicReward");
            rc3.w0 w0Var = (rc3.w0) wi6;
            w0Var.w(this);
            w0Var.W(c16416x87606a7b);
            java.lang.String str = (java.lang.String) ((jz5.n) f376062t).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "access$getBASIC_LIB(...)");
            jc3.j0.d(wi6, str, null, 2, null);
            w0Var.m162153x68ac462();
            Ni(wi6);
        }
        if (this.f376066g == null) {
            handler.postDelayed(runnable, 30000L);
        }
    }

    public java.lang.String Bi() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui(this.f376074r, "MagicReward");
        if (Ui != null) {
            return java.lang.Long.valueOf(Ui.f299123e).toString();
        }
        return null;
    }

    public final void Di(yz5.l lVar) {
        java.util.HashSet Q0;
        synchronized (this.f376065f) {
            Q0 = kz5.n0.Q0(this.f376065f);
        }
        nf.e.f(new it2.p(Q0, lVar));
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicRewardFeatureService", "canvas " + i17 + " created");
        this.f376068i = view;
        android.widget.FrameLayout frameLayout = this.f376066g;
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
    }

    public final void Ni(jc3.j0 j0Var) {
        if (j0Var == null && this.f376063d != null) {
            this.f376072p = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
            this.f376073q = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
            android.util.SparseArray sparseArray = this.f376071o;
            android.util.SparseArray clone = sparseArray.clone();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clone, "clone(...)");
            sparseArray.clear();
            int size = clone.size();
            for (int i17 = 0; i17 < size; i17++) {
                clone.keyAt(i17);
                ((yz5.l) clone.valueAt(i17)).mo146xb9724478(rs5.h.f480895m);
            }
        }
        this.f376063d = j0Var;
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        Di(new it2.t(msg));
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicRewardFeatureService", "canvas " + i17 + " destroy");
        android.widget.FrameLayout frameLayout = this.f376066g;
        if (frameLayout != null) {
            frameLayout.removeView(view);
        }
        this.f376068i = null;
    }

    @Override // jc3.u
    public void b1() {
        nf.e.f(new it2.s(this));
    }

    @Override // jc3.u
    public void n() {
        Di(it2.u.f376053d);
    }

    public boolean wi(java.lang.String name, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        jc3.j0 j0Var = this.f376063d;
        if (j0Var != null) {
            ((rc3.w0) j0Var).k(name, data);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicRewardFeatureService", "try to dispatch " + name + " with data " + data + ", but biz not found");
        return false;
    }
}
