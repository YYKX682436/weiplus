package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class hj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f194350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar) {
        super(3);
        this.f194350d = hmVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        ((java.lang.Boolean) obj2).booleanValue();
        if (((java.lang.Boolean) obj3).booleanValue()) {
            float abs = java.lang.Math.abs(floatValue);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f194350d;
            if (abs > ((java.lang.Number) ((jz5.n) hmVar.P1).mo141623x754a37bb()).intValue()) {
                hmVar.E1().g();
            }
        }
        return jz5.f0.f384359a;
    }
}
