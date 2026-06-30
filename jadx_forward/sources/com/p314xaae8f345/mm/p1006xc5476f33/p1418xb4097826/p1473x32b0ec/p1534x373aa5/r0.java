package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes2.dex */
public final class r0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public r45.fa2 f198155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 f198156e;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590) {
        this.f198156e = c14298xca26f590;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.LinkedList linkedList;
        r45.fa2 fa2Var = this.f198155d;
        if (fa2Var == null || (linkedList = fa2Var.f455662h) == null) {
            return 0;
        }
        return linkedList.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.util.LinkedList linkedList;
        r45.ea2 ea2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.q0 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.q0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r0 r0Var = holder.f198128d;
        r45.fa2 fa2Var = r0Var.f198155d;
        if (fa2Var != null && (linkedList = fa2Var.f455662h) != null && (ea2Var = (r45.ea2) kz5.n0.a0(linkedList, i17)) != null) {
            android.view.View view = holder.f3639x46306858;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210 c14370x2f9d6210 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210) view : null;
            if (c14370x2f9d6210 != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210.f197667g;
                c14370x2f9d6210.c(c19792x256d2725, i17, 1.7776f);
            }
            android.view.View view2 = holder.f3639x46306858;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210 c14370x2f9d62102 = view2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210) view2 : null;
            if (c14370x2f9d62102 != null) {
                in5.o.c(c14370x2f9d62102, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p0(ea2Var, r0Var.f198156e));
            }
        }
        dq4.c cVar = dq4.c.f323902a;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        cVar.f(itemView);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210 c14370x2f9d6210 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210(context, null);
        c14370x2f9d6210.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.a(parent.getContext(), 162.0f), i65.a.a(parent.getContext(), 288.0f)));
        c14370x2f9d6210.m57549x46b194e1(this.f198156e.getReportObj());
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.q0(this, c14370x2f9d6210);
    }
}
