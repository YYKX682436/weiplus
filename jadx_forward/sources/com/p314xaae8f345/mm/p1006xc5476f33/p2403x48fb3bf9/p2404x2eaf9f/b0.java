package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 f263294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var) {
        super(0);
        this.f263294d = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = this.f263294d;
        java.util.Set set = r0Var.f263453c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = r0Var.R;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = r0Var.f263449a;
        nw4.n nVar = set == null ? new nw4.n(c22633x83752a59, wVar, r0Var.U(), r0Var.f263455d) : new nw4.n(c22633x83752a59, wVar, r0Var.U(), r0Var.f263453c);
        m05.q qVar = ((ph0.i) i95.n0.c(ph0.i.class)) != null ? new m05.q() : null;
        if (qVar != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) nVar.f422444y;
            if (!arrayList.contains(qVar)) {
                arrayList.add(qVar);
            }
        }
        c22633x83752a59.mo120128x74041feb(nVar, "__wx");
        if (nVar.y() != null) {
            c22633x83752a59.mo120128x74041feb(nVar.y(), "__wxtag");
        }
        c22633x83752a59.mo120128x74041feb(r0Var.o0(nVar), "WXTransInterface");
        if (nVar.E == null) {
            nVar.E = new pw4.a();
        }
        pw4.a aVar = nVar.E;
        aVar.f440242a = nVar.f422420a;
        c22633x83752a59.mo120128x74041feb(aVar, "CustomFullscreenApi");
        c22633x83752a59.mo120128x74041feb(r0Var.f263471l, "__wxWebEnv");
        c22633x83752a59.m81409x2a6db82c(nVar.f422437r);
        return nVar;
    }
}
