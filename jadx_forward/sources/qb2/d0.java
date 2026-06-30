package qb2;

/* loaded from: classes10.dex */
public final class d0 implements wn.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.t f442722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f442723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qb2.g0 f442724f;

    public d0(qb2.t tVar, android.view.View view, qb2.g0 g0Var) {
        this.f442722d = tVar;
        this.f442723e = view;
        this.f442724f = g0Var;
    }

    @Override // wn.q
    public void G4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationOnClickListener", "onChattingUIEnter");
        zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f442722d.D1;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1 s1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) e6Var;
        s1Var.getClass();
        s1Var.Bi(d17, true);
    }

    @Override // wn.q
    public boolean c3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationOnClickListener", "onChattingUIExit");
        ra5.c cVar = new ra5.c(this.f442723e);
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(cVar, 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca c15012x2d1e2eca = this.f442724f.f442744a;
        if (!(c15012x2d1e2eca instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca)) {
            return false;
        }
        c15012x2d1e2eca.L0();
        return false;
    }
}
