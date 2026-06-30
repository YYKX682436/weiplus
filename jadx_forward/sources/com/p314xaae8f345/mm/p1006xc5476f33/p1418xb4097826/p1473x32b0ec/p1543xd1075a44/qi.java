package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class qi implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri f201061d;

    public qi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri riVar) {
        this.f201061d = riVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xh xhVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xh xhVar2;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        vm2.d dVar = (vm2.d) holder.f374658i;
        vm2.c cVar = vm2.d.f519620f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        r45.kv1 a17 = cVar.a(dVar);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveFansModifySettingWidget", "gift null, do nothing");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri riVar = this.f201061d;
        if (riVar.f201178p == null) {
            android.content.Context context = riVar.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xh xhVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xh(context);
            xhVar3.m58192x31c61473(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pi(riVar));
            riVar.f201178p = xhVar3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a = riVar.m58104xb7f4f95a();
        if (m58104xb7f4f95a == null || (xhVar2 = riVar.f201178p) == null) {
            f0Var = null;
        } else {
            xhVar2.a(m58104xb7f4f95a);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null && (xhVar = riVar.f201178p) != null) {
            xhVar.m58109x53aeff12(riVar.m58106x7520e49e());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xh xhVar4 = riVar.f201178p;
        if (xhVar4 != null) {
            xhVar4.h(riVar.f201179q, dVar.f519621d, a17, dVar.f519622e);
        }
    }
}
