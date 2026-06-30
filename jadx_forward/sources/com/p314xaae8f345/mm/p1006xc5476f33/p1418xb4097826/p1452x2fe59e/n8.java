package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class n8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 f190096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f190097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 t8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(1);
        this.f190096d = t8Var;
        this.f190097e = abstractC14490x69736cb5;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String D0;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 t8Var = this.f190096d;
        java.lang.String str = t8Var.P;
        if (fVar != null && str != null) {
            eo2.f.f337098a.g(str, fVar);
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.String str2 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f190097e;
        if (fVar != null && (i17 = fVar.f152148a) == 0 && i17 == 0 && eo2.f.f337098a.d(java.lang.Integer.valueOf(((r45.xr0) fVar.f152151d).f471885e))) {
            dw2.c0 c0Var = t8Var.f187962o.f305236n;
            if (c0Var != null) {
                c0Var.y("memberVideo", false, true);
            }
            if (t8Var.G != 0 && (i0Var = t8Var.f187957g) != null && (m56068x4905e9fa = i0Var.m56068x4905e9fa()) != null && (mo7946xf939df19 = m56068x4905e9fa.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8148xed6e4d18(0, new jz5.l(53, java.lang.Long.valueOf(t8Var.G)));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var2 = t8Var.f187957g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var = i0Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8) i0Var2 : null;
            if (w8Var != null) {
                java.lang.String str3 = t8Var.P;
                if (str3 == null) {
                    ya2.b2 contact = abstractC14490x69736cb5.getContact();
                    D0 = contact != null ? contact.D0() : null;
                    if (D0 != null) {
                        str2 = D0;
                    }
                } else {
                    str2 = str3;
                }
                w8Var.y(false, false, str2, abstractC14490x69736cb5);
                return f0Var;
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var3 = t8Var.f187957g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var2 = i0Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8) i0Var3 : null;
            if (w8Var2 != null) {
                java.lang.String str4 = t8Var.P;
                if (str4 == null) {
                    ya2.b2 contact2 = abstractC14490x69736cb5.getContact();
                    D0 = contact2 != null ? contact2.D0() : null;
                    if (D0 != null) {
                        str2 = D0;
                    }
                } else {
                    str2 = str4;
                }
                w8Var2.y(true, true, str2, abstractC14490x69736cb5);
                return f0Var;
            }
        }
        return null;
    }
}
