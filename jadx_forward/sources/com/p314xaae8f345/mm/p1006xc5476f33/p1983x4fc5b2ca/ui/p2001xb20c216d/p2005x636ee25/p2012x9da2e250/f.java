package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250;

/* loaded from: classes5.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17081x45017ae f237944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f237945b;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17081x45017ae c17081x45017ae, boolean z17) {
        this.f237944a = c17081x45017ae;
        this.f237945b = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList<r45.ug4> items = ((r45.wg4) fVar.f152151d).f470680f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(items, "items");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (r45.ug4 ug4Var : items) {
            r45.vv0 vv0Var = new r45.vv0();
            vv0Var.f470132d = ug4Var;
            vv0Var.f470133e = -1;
            arrayList.add(vv0Var);
        }
        linkedList.addAll(arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17081x45017ae c17081x45017ae = this.f237944a;
        boolean z17 = this.f237945b;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        java.lang.String str = fVar.f152150c;
        r45.wg4 wg4Var = (r45.wg4) fVar.f152151d;
        c17081x45017ae.G0(z17, i17, i18, str, wg4Var.f470679e, wg4Var.f470678d, linkedList);
        return null;
    }
}
