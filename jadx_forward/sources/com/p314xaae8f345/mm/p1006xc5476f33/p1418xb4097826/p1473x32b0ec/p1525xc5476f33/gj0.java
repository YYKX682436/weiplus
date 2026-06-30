package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class gj0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj0 f194240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj0 jj0Var) {
        super(3);
        this.f194240d = jj0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        bw5.gq0 gq0Var = (bw5.gq0) obj3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj0 jj0Var = this.f194240d;
        if (booleanValue) {
            r45.d22 d22Var = jj0Var.f194656v;
            if (d22Var != null) {
                d22Var.set(7, gq0Var != null ? gq0Var.m12014xb5887639() : null);
            }
            bl2.k kVar = jj0Var.f194657w;
            if (kVar != null) {
                kVar.f103250h = jj0Var.f194656v;
                kVar.z();
            }
        } else {
            java.lang.String str2 = jj0Var.f194650p;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetch song url for listenId ");
            r45.d22 d22Var2 = jj0Var.f194656v;
            sb6.append(d22Var2 != null ? d22Var2.m75945x2fec8307(9) : null);
            sb6.append(" failed. ErrorMsg ");
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
