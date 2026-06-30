package g22;

/* loaded from: classes15.dex */
public final class l0 implements i22.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414 f349379a;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414 activityC13365x3816f414) {
        this.f349379a = activityC13365x3816f414;
    }

    @Override // i22.o0
    public void a(i22.m holder, int i17, i22.n0 n0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (n0Var != null && n0Var.mo134661xfb85f7b0() == 4) {
            i22.c1 c1Var = n0Var instanceof i22.c1 ? (i22.c1) n0Var : null;
            r45.ri0 ri0Var = c1Var != null ? c1Var.f369485a : null;
            if (ri0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13365x3816f414 activityC13365x3816f414 = this.f349379a;
                activityC13365x3816f414.f180000x = true;
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 i18 = n22.m.i(ri0Var);
                n22.f fVar = n22.f.f415823a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13365x3816f414.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                k22.g d17 = n22.f.d(fVar, mo55332x76847179, i18, true, null, null, null, 0, 0L, 0, 0, 0L, null, null, null, null, 32760, null);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ri0Var.f466434v)) {
                    java.lang.String StoreMeaning = ri0Var.f466434v;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(StoreMeaning, "StoreMeaning");
                    d17.d(StoreMeaning);
                }
            }
            j22.a.e(ri0Var, 0, 3, 0L, 29);
        }
    }
}
