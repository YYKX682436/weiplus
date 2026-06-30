package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class f1 extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf {
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s1 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s1 s1Var, in5.s sVar, boolean z17) {
        super(sVar, arrayList, z17);
        this.I = s1Var;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: B0 */
    public void mo8160xd8bfd53(in5.s0 holder) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams)) {
            return;
        }
        if (holder.m8185xcdaf1228() == 0 || holder.m8185xcdaf1228() == -1) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).f93474i = true;
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2) this.I).getClass();
        if (holder.m8185xcdaf1228() == -2 || ((obj = holder.f374657h) != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, -2))) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).f93474i = true;
        }
    }

    @Override // in5.n0, com.p314xaae8f345.mm.ui.p2730xe821e364.AbstractC22470xf90b5f7b, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        super.mo8157xe5e2e48d(holder, i17, payloads);
        this.I.getClass();
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf
    public void y0(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        fc2.o Z6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s1 s1Var = this.I;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = s1Var.f190493d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar == null || (Z6 = nyVar.Z6(s1Var.f190494e)) == null) {
            return;
        }
        new fc2.i(Z6).mo481x4d79408f(recyclerView, 5);
    }
}
