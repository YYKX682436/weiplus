package nj5;

/* loaded from: classes11.dex */
public final class b extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2729x34a223.C22467xb42c85a1 f419472a;

    public b(com.p314xaae8f345.mm.ui.p2729x34a223.C22467xb42c85a1 c22467xb42c85a1) {
        this.f419472a = c22467xb42c85a1;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MoreTabFinderPreference", "onViewExposed: isExposed:" + z17);
        if (z17) {
            com.p314xaae8f345.mm.ui.p2729x34a223.C22467xb42c85a1 c22467xb42c85a1 = this.f419472a;
            c22467xb42c85a1.l0(view, "view_exp");
            if (c22467xb42c85a1.f291055d2) {
                rv.l3 Ai = ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Ai();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6422xce485a9e c6422xce485a9e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6422xce485a9e();
                c6422xce485a9e.f137637d = 0L;
                c6422xce485a9e.f137638e = Ai.f481406a ? 1L : 0L;
                c6422xce485a9e.f137640g = Ai.f481407b;
                c6422xce485a9e.f137641h = c6422xce485a9e.b("RedDotContent", Ai.f481408c, true);
                c6422xce485a9e.f137642i = c6422xce485a9e.b("RedDotId", Ai.f481409d, true);
                c6422xce485a9e.f137643j = Ai.f481410e ? 1L : 0L;
                c6422xce485a9e.f137644k = Ai.f481411f;
                c6422xce485a9e.k();
            }
        }
    }
}
