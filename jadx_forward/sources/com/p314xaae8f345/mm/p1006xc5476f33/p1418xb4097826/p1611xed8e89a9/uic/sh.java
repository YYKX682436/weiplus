package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class sh implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14908x54e651e6 f205749d;

    public sh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14908x54e651e6 c14908x54e651e6) {
        this.f205749d = c14908x54e651e6;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ms2.c cVar = (ms2.c) holder.f374658i;
        o40.e eVar = (o40.e) i95.n0.c(o40.e.class);
        eVar.getClass();
        bw5.jc jcVar = new bw5.jc();
        r45.dg4 dg4Var = cVar.f412503e;
        jcVar.f110453d = dg4Var != null ? ms2.a.a(dg4Var) : null;
        boolean[] zArr = jcVar.f110456g;
        zArr[1] = true;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14908x54e651e6 c14908x54e651e6 = this.f205749d;
        java.util.LinkedList<so2.j5> M = c14908x54e651e6.f205022i.M();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(M, 10));
        for (so2.j5 j5Var : M) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.profile.ting.FinderTingAudioListItem");
            arrayList.add(ms2.d.a(((ms2.c) j5Var).f412502d));
        }
        linkedList.addAll(arrayList);
        jcVar.f110454e = linkedList;
        zArr[2] = true;
        jcVar.f110455f = i17;
        zArr[3] = true;
        ((wy2.g) eVar).Di(c14908x54e651e6.m80379x76847179(), jcVar.mo14344x5f01b1f6(), null, false);
    }
}
