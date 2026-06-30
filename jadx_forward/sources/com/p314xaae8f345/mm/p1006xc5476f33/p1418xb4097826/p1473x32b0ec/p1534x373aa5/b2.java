package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes10.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f197733a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f197734b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f197735c;

    public b2(int i17, byte[] bArr, java.lang.String str) {
        this.f197733a = i17;
        this.f197734b = bArr;
        this.f197735c = str;
    }

    /* renamed from: equals */
    public boolean m57571xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.b2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.b2 b2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.b2) obj;
        return this.f197733a == b2Var.f197733a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f197734b, b2Var.f197734b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f197735c, b2Var.f197735c);
    }

    /* renamed from: hashCode */
    public int m57572x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f197733a) * 31;
        byte[] bArr = this.f197734b;
        int hashCode2 = (hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        java.lang.String str = this.f197735c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m57573x9616526c() {
        return "AnchorMicData(applyScene=" + this.f197733a + ", sceneBuffer=" + java.util.Arrays.toString(this.f197734b) + ", candidateRequestId=" + this.f197735c + ')';
    }
}
