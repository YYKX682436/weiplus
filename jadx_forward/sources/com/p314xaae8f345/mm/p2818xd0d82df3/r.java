package com.p314xaae8f345.mm.p2818xd0d82df3;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f295906a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f295907b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g1 f295908c;

    public r(int i17, int[] dataShape, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g1 dataHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataShape, "dataShape");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataHolder, "dataHolder");
        this.f295906a = i17;
        this.f295907b = dataShape;
        this.f295908c = dataHolder;
    }

    /* renamed from: equals */
    public boolean m83580xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2818xd0d82df3.r)) {
            return false;
        }
        com.p314xaae8f345.mm.p2818xd0d82df3.r rVar = (com.p314xaae8f345.mm.p2818xd0d82df3.r) obj;
        return this.f295906a == rVar.f295906a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f295907b, rVar.f295907b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f295908c, rVar.f295908c);
    }

    /* renamed from: hashCode */
    public int m83581x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f295906a) * 31) + java.util.Arrays.hashCode(this.f295907b)) * 31) + this.f295908c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m83582x9616526c() {
        return "SharedTensorCpuB(dateType=" + this.f295906a + ", dataShape=" + java.util.Arrays.toString(this.f295907b) + ", dataHolder=" + this.f295908c + ')';
    }
}
