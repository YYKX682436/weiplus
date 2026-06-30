package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class o4 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 f206194a;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var) {
        this.f206194a = s4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
    /* renamed from: dismiss */
    public final void mo2069x63a3b28a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f206194a;
        java.util.Iterator it = ((java.util.ArrayList) s4Var.f206293n).iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3) it.next()).f206157a);
        }
        zy2.hc hcVar = s4Var.f206303x;
        if (hcVar != null) {
            r45.j32 j32Var = s4Var.f206297r;
            hcVar.a(arrayList, j32Var != null ? j32Var.m75939xb282bd08(3) : 0, s4Var.f206298s, s4Var.f206300u);
        }
    }
}
