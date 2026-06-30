package jk3;

/* loaded from: classes8.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk3.b f381609d;

    public a(jk3.b bVar) {
        this.f381609d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        r45.kr4 kr4Var = this.f381609d.f381612c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var;
        p1Var.getClass();
        if (kr4Var != null) {
            kr4Var.m75945x2fec8307(2);
        }
        if (kr4Var != null) {
            kr4Var.m75939xb282bd08(3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("reporttype", 2);
            bundle.putByteArray("reportdata", kr4Var != null ? kr4Var.mo14344x5f01b1f6() : null);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j2.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.n1(p1Var));
            return;
        }
        if (kr4Var != null) {
            nk3.f fVar = nk3.f.f419574a;
            fVar.f(kr4Var);
            fVar.g(kr4Var.m75939xb282bd08(3), (r45.jr4) kr4Var.m75936x14adae67(8));
        }
    }
}
