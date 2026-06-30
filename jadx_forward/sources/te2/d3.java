package te2;

/* loaded from: classes10.dex */
public final class d3 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f499479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.i3 f499480e;

    public d3(te2.i3 i3Var, te2.i3 viewCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewCallback, "viewCallback");
        this.f499480e = i3Var;
        this.f499479d = new java.lang.ref.WeakReference(viewCallback);
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        te2.i3 i3Var = (te2.i3) this.f499479d.get();
        boolean z17 = i3Var == null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499480e.f499640h, "onAnimationEnd emptyViewCallback:" + z17);
        if (i3Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww wwVar = i3Var.f499636d;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(wwVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new te2.c3(i3Var, this, null), 2, null);
        }
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }
}
