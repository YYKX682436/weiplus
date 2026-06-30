package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class di implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li f188101d;

    public di(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar) {
        this.f188101d = liVar;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar = this.f188101d;
        if (a07 >= liVar.f188827d.f190724p.size()) {
            return true;
        }
        java.lang.Object obj = liVar.f188827d.f190724p.get(a07);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLongClick ");
        sb6.append(a07);
        sb6.append(" id:");
        cd2.c cVar = ((cd2.b) obj).f122188d;
        sb6.append(cVar.i());
        sb6.append(" commentId:");
        sb6.append(cVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyViewCallback", sb6.toString());
        rl5.r rVar = liVar.f188837q;
        if (rVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
            throw null;
        }
        rVar.a();
        rl5.r rVar2 = liVar.f188837q;
        if (rVar2 != null) {
            rVar2.h(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ei(liVar, view), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ii(liVar, cVar, a07), com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
        throw null;
    }
}
