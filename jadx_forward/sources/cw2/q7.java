package cw2;

/* loaded from: classes10.dex */
public final class q7 implements ek4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw2.s6 f305488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f305489b;

    public q7(cw2.s6 s6Var, int i17) {
        this.f305488a = s6Var;
        this.f305489b = i17;
    }

    @Override // ek4.u
    public dn.o a(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        int i17 = this.f305489b;
        cw2.s6 s6Var = this.f305488a;
        cw2.wa waVar = s6Var.f305533e;
        java.lang.String m75945x2fec8307 = waVar.f305631e.e().m75945x2fec8307(54);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        mn2.j4 j4Var = waVar.f305631e;
        java.lang.String m75945x2fec83072 = j4Var.e().m75945x2fec8307(55);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        yr2.f fVar = new yr2.f(m75945x2fec8307, m75945x2fec83072, j4Var.d());
        yr2.d dVar = yr2.d.f546196a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = waVar.f305632f;
        int position = c14989xf862ae88.getPosition();
        long feedId = c14989xf862ae88.getFeedId();
        java.lang.String str = s6Var.f305535g.f68984xbaadf794;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = s6Var.f305532d;
        java.lang.String str3 = waVar.f305627a;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = waVar.f305628b;
        int Ai = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Ai(1, waVar.f305628b);
        java.lang.String str5 = s6Var.f305535g.f68976xe1500f8;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String i18 = j4Var.i();
        java.lang.String m75945x2fec83073 = j4Var.e().m75945x2fec8307(17);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        boolean z17 = j4Var.e().m75939xb282bd08(39) == 1;
        java.lang.String m61380xe56ce956 = s6Var.f305539n.m61380xe56ce956();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = j4Var.e().m75934xbce7f2f(66);
        return dVar.a(position, feedId, str, str2, str3, str4, Ai, str6, i18, m75945x2fec83073, z17, s6Var, i17, m61380xe56ce956, fVar, m75934xbce7f2f != null ? m75934xbce7f2f.f273689a : null);
    }
}
