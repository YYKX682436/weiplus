package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class s4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 f195747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f195749f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f195750g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f195751h;

    public s4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var, int i17, int i18, int i19, int i27) {
        this.f195747d = a5Var;
        this.f195748e = i17;
        this.f195749f = i18;
        this.f195750g = i19;
        this.f195751h = i27;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var = this.f195747d;
        r45.ei0 ei0Var = ((je2.g) a5Var.P0(je2.g.class)).f380755g;
        boolean z17 = ((ei0Var == null || (linkedList2 = ei0Var.f455062d) == null) ? 0 : linkedList2.size()) > 0;
        android.view.ViewGroup viewGroup = a5Var.f446856d;
        if (z17) {
            g4Var.f(this.f195748e, viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljx));
        } else {
            g4Var.f(this.f195749f, viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljv));
        }
        r45.ei0 ei0Var2 = ((je2.g) a5Var.P0(je2.g.class)).f380755g;
        if (((ei0Var2 == null || (linkedList = ei0Var2.f455063e) == null) ? 0 : linkedList.size()) > 0) {
            g4Var.f(this.f195750g, viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljt));
        } else {
            g4Var.f(this.f195751h, viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljs));
        }
    }
}
