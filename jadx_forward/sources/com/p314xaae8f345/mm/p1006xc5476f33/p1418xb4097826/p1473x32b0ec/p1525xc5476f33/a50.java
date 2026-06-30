package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class a50 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q50 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f193344a;

    public a50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var) {
        this.f193344a = r60Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q50
    public boolean a(cm2.t data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!(data instanceof cm2.u)) {
            return false;
        }
        r45.n63 n63Var = ((cm2.u) data).f124933v;
        if (n63Var.m75934xbce7f2f(1) == null) {
            return false;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = n63Var.m75934xbce7f2f(1);
        return (m75934xbce7f2f != null ? m75934xbce7f2f.f273689a.length : 0) > 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q50
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 b(cm2.t promoteData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(promoteData, "promoteData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f193344a;
        android.content.Context context = r60Var.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj(context, r60Var.S0(), r60Var.f195630r, r60Var.f195627J, promoteData);
    }
}
