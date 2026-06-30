package rb2;

/* loaded from: classes10.dex */
public final class q1 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475267f;

    public q1(so2.y0 y0Var, int i17, rb2.z2 z2Var) {
        this.f475265d = y0Var;
        this.f475266e = i17;
        this.f475267f = z2Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.nh2 req = (r45.nh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        r45.oh2 oh2Var = new r45.oh2();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ret.m75934xbce7f2f(3);
        if (m75934xbce7f2f != null) {
            oh2Var.mo11468x92b714fd(m75934xbce7f2f.g());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modComment level1 item=");
        sb6.append(this.f475265d.mo2128x1ed62e84());
        sb6.append(" opType=");
        int i17 = this.f475266e;
        sb6.append(i17);
        sb6.append(",ret=");
        sb6.append(ret.m75939xb282bd08(1));
        sb6.append(',');
        sb6.append(ret.m75945x2fec8307(2));
        sb6.append(",affected_comment_ids=");
        sb6.append(oh2Var.m75941xfb821914(0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", sb6.toString());
        if (i17 == 4) {
            java.util.LinkedList<java.lang.Long> m75941xfb821914 = oh2Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getAffected_comment_ids(...)");
            for (java.lang.Long l17 : m75941xfb821914) {
                rb2.z2 z2Var = this.f475267f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = z2Var.f475219e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                so2.y0 N = nPresenter.N(l17.longValue());
                if (N != null) {
                    so2.g0.f(N, false);
                    z2Var.f475219e.g0(l17.longValue());
                }
            }
        }
    }
}
