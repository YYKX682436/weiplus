package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class i9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.i7 f197916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 f197917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(mm2.i7 i7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 c14340xe0508cb3) {
        super(2);
        this.f197916d = i7Var;
        this.f197917e = c14340xe0508cb3;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.nw1 nw1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).longValue();
        if (booleanValue) {
            r45.hd5 hd5Var = new r45.hd5();
            hd5Var.set(2, java.lang.Integer.valueOf(c01.id.e()));
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
            hd5Var.set(0, java.lang.Long.valueOf((e1Var == null || (nw1Var = e1Var.f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0)));
            mm2.i7 i7Var = this.f197916d;
            i7Var.a(hd5Var);
            mm2.h5 h5Var = (mm2.h5) efVar.i(mm2.h5.class);
            if (h5Var != null) {
                h5Var.N6(i7Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3.d(this.f197917e, i7Var, 1000);
        }
        return jz5.f0.f384359a;
    }
}
