package ml2;

/* loaded from: classes10.dex */
public final class a0 implements e62.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ml2.c0 f408726a;

    public a0(ml2.c0 c0Var) {
        this.f408726a = c0Var;
    }

    @Override // e62.e
    public void a(java.lang.Object obj, l52.g gVar, android.view.View view) {
    }

    @Override // e62.e
    public void b(java.lang.Object obj, l52.g gVar, android.view.View view) {
        if (gVar == null) {
            return;
        }
        r45.p86 p86Var = gVar.f398140a;
        java.lang.String str = p86Var.f464389y;
        int i17 = gVar.f398141b;
        java.lang.String feedId = p86Var.f464371d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(feedId, "feedId");
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(gVar.f398140a.f464371d);
        long E12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(gVar.f398142c);
        ml2.c0 c0Var = this.f408726a;
        ml2.x1 x1Var = c0Var.f408849j;
        java.lang.String str2 = c0Var.f408850k;
        java.lang.String str3 = gVar.f398140a.A;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = str3;
        ml2.e0 e0Var = gVar.f398143d == 1 ? ml2.e0.f408903e : ml2.e0.f408904f;
        ml2.v3[] v3VarArr = ml2.v3.f409681d;
        java.lang.String str5 = gVar.f398149j;
        java.lang.String talkerUsername = gVar.f398150k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talkerUsername, "talkerUsername");
        long E13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(gVar.f398140a.f464371d);
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(c0Var.f408850k, 0);
        java.lang.String gmsgId = gVar.f398151l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gmsgId, "gmsgId");
        ml2.f0 f0Var = new ml2.f0(null, str, i17, feedId, E1, E12, x1Var, str2, -1, str4, e0Var, true, true, 1, null, null, null, str5, 0L, talkerUsername, 0, E13, D1, gmsgId, null, java.lang.Integer.valueOf(gVar.f398144e), 18202624, null);
        ml2.x0 x0Var = c0Var.f408840a;
        if (x0Var != null) {
            ((ml2.b) x0Var).a(f0Var, false);
        }
    }
}
