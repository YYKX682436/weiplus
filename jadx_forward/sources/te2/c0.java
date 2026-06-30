package te2;

/* loaded from: classes10.dex */
public final class c0 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f499443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.i0 f499444e;

    public c0(te2.i0 i0Var, te2.i0 viewCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewCallback, "viewCallback");
        this.f499444e = i0Var;
        this.f499443d = new java.lang.ref.WeakReference(viewCallback);
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        te2.i0 i0Var = (te2.i0) this.f499443d.get();
        boolean z17 = i0Var == null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499444e.f499626m, "onAnimationEnd emptyViewCallback:" + z17);
        if (i0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww wwVar = i0Var.f499623g;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(wwVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new te2.b0(i0Var, this, null), 2, null);
        }
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }
}
