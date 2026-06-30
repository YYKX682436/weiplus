package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public abstract class a implements fs2.a {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x f210682e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f210681d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f210683f = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));

    public java.util.ArrayList c() {
        return this.f210681d;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x xVar = this.f210682e;
        if (xVar != null) {
            return xVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    public abstract boolean g();

    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f210682e = callback;
        f().g();
        f().j();
        m();
        q();
    }

    public abstract void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, android.view.View view, int i17, in5.s0 s0Var);

    public abstract void m();

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        p3325xe03a0797.p3326xc267989b.z0.d(this.f210683f, this + " onDetach", null, 2, null);
    }

    public abstract void p();

    public abstract void q();

    public void s() {
    }
}
