package gx0;

/* loaded from: classes5.dex */
public final class d6 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f357853a;

    public d6(gx0.w8 w8Var) {
        this.f357853a = w8Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        gx0.w8 w8Var = this.f357853a;
        ex0.a0 a0Var = w8Var.W6().f358175r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = a0Var != null ? a0Var.E : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = w8Var.v7().f150881m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = c16993xacc19624 != null ? c16993xacc19624.I : null;
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("finder_tab_context_id", c16995x8ab634cd != null ? c16995x8ab634cd.f237231o : null);
        lVarArr[1] = new jz5.l("finder_context_id", c16995x8ab634cd != null ? c16995x8ab634cd.f237230n : null);
        lVarArr[2] = new jz5.l("comment_scene", c16995x8ab634cd != null ? java.lang.Integer.valueOf(c16995x8ab634cd.f237226g) : null);
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        lVarArr[3] = new jz5.l("finder_post_sessionid", ((qs2.q) ((w40.e) c17)).hj());
        lVarArr[4] = new jz5.l("songid", c16997xb0aa383a != null ? c16997xb0aa383a.e() : null);
        lVarArr[5] = new jz5.l("session_buffer", c16997xb0aa383a != null ? c16997xb0aa383a.D : null);
        return kz5.c1.k(lVarArr);
    }
}
