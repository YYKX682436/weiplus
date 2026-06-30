package sr3;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final sr3.b f493366a = new sr3.b();

    public final sr3.f a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if (z3Var == null) {
            return null;
        }
        java.lang.String P0 = z3Var.P0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P0, "getNickname(...)");
        java.lang.String str = z3Var.V;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getSignature(...)");
        boolean z17 = false;
        if (((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).wi() && (z3Var.n2() || z3Var.l2())) {
            z17 = true;
        }
        return new sr3.f(null, null, null, P0, str, false, false, false, false, z17, 487, null);
    }

    public final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17) {
        java.lang.String str;
        boolean Bi = z17 ? ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi() : ur1.n.f511894a.a();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_biz_profile_author_return_original_logic_android, false)) {
            return activityC16840x4302a3e2.getIntent().getBooleanExtra("Contact_IsBizAuthor", false) && Bi;
        }
        if (z17) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f449681m.f449687b;
            if (bVar != null) {
                str = bVar.f299423f;
            }
            str = null;
        } else {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar2 = ((r01.l1) i95.n0.c(r01.l1.class)).f449680i.f449687b;
            if (bVar2 != null) {
                str = bVar2.f299423f;
            }
            str = null;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z3Var != null ? z3Var.d1() : null, str) && Bi;
    }
}
