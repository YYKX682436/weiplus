package z21;

/* loaded from: classes14.dex */
public class n extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z21.q f551190a;

    public n(z21.q qVar) {
        this.f551190a = qVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        z21.p pVar;
        int i17 = message.what;
        z21.q qVar = this.f551190a;
        if (i17 == 2) {
            z21.p pVar2 = qVar.f551201m;
            if (pVar2 != null) {
                com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a924 = ((a31.r) pVar2).f82527a;
                com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924.a(c11154x38c1a924);
                c11154x38c1a924.e(false, null);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c11154x38c1a924.f153299s;
                if (b4Var != null) {
                    b4Var.d();
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 0) {
            if (i17 != 3 || (pVar = qVar.f551201m) == null) {
                return;
            }
            ((a31.r) pVar).a(new java.lang.String[0], -1L);
            return;
        }
        if (qVar.f551195d == 0) {
            gm0.j1.d().a(349, qVar);
        } else {
            gm0.j1.d().a(206, qVar);
        }
        if (qVar.f551195d != 0) {
            qVar.f551205q = new z21.j(z21.q.a(qVar), qVar.f551195d);
        } else if (qVar.f551200i) {
            qVar.f551205q = new z21.l(z21.q.a(qVar), 1);
        } else {
            qVar.f551205q = new z21.l(z21.q.a(qVar), 0);
        }
        gm0.j1.d().g(qVar.f551205q);
    }
}
