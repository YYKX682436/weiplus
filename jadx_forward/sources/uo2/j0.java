package uo2;

/* loaded from: classes2.dex */
public final class j0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f511160d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zi2 f511161e;

    public j0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f511160d = context;
    }

    public final void a(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        r45.zi2 zi2Var = this.f511161e;
        android.content.Context context = this.f511160d;
        if (zi2Var != null) {
            db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.f572819cn0, 0).show();
        } else {
            db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.cmz, 0).show();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).zk(context, 2, 4, c19792x256d2725 != null ? java.lang.Integer.valueOf(c19792x256d2725.m76775xd85283c6()) : null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = false;
        if (m1Var != null && m1Var.mo808xfb85f7b0() == 7289) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = m1Var.mo47948x7f0c4558();
            com.p314xaae8f345.mm.p944x882e457a.o oVar = mo47948x7f0c4558 instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558 : null;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152244b.f152233a : null;
            if (fVar instanceof r45.lk2) {
            }
        }
    }
}
