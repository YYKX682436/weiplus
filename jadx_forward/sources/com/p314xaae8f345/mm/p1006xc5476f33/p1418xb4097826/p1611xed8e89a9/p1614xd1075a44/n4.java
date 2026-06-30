package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class n4 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 f206182a;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var) {
        this.f206182a = s4Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        r45.h32 h32Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f206182a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3 m3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3) kz5.n0.Z(s4Var.f206293n);
        int m75939xb282bd08 = (m3Var == null || (h32Var = m3Var.f206157a) == null) ? 0 : h32Var.m75939xb282bd08(0);
        java.util.Iterator it = ((java.util.ArrayList) s4Var.f206293n).iterator();
        int i17 = m75939xb282bd08;
        while (it.hasNext()) {
            i17 = java.lang.Math.min(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3) it.next()).f206157a.m75939xb282bd08(0), i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var2 = this.f206182a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4.d(s4Var2, true, null, s4Var2.f206280a, i17, 2, null);
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        r45.h32 h32Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f206182a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3 m3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3) kz5.n0.Z(s4Var.f206293n);
        int m75939xb282bd08 = (m3Var == null || (h32Var = m3Var.f206157a) == null) ? 0 : h32Var.m75939xb282bd08(0);
        java.util.Iterator it = ((java.util.ArrayList) s4Var.f206293n).iterator();
        int i17 = m75939xb282bd08;
        while (it.hasNext()) {
            i17 = java.lang.Math.max(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3) it.next()).f206157a.m75939xb282bd08(0), i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var2 = this.f206182a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4.d(s4Var2, false, null, s4Var2.f206280a, i17, 2, null);
        return true;
    }
}
