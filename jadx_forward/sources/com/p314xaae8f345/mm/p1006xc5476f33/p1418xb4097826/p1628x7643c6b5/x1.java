package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes2.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f207785a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f207786b;

    public x1(java.lang.String exportId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportId, "exportId");
        this.f207785a = exportId;
        this.f207786b = str;
    }

    /* renamed from: equals */
    public boolean m59062xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.x1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.x1 x1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.x1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207785a, x1Var.f207785a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207786b, x1Var.f207786b);
    }

    /* renamed from: hashCode */
    public int m59063x8cdac1b() {
        int hashCode = this.f207785a.hashCode() * 31;
        java.lang.String str = this.f207786b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m59064x9616526c() {
        return "EncryptedObjectData(exportId=" + this.f207785a + ", nonceId=" + this.f207786b + ')';
    }
}
