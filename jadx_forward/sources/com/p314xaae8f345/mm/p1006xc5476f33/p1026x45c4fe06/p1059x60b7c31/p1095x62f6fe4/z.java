package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f163693a;

    /* renamed from: b, reason: collision with root package name */
    public final int f163694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.util.List files, int i17) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(files, "files");
        this.f163693a = files;
        this.f163694b = i17;
    }

    /* renamed from: equals */
    public boolean m51112xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f163693a, zVar.f163693a) && this.f163694b == zVar.f163694b;
    }

    /* renamed from: hashCode */
    public int m51113x8cdac1b() {
        return (this.f163693a.hashCode() * 31) + java.lang.Integer.hashCode(this.f163694b);
    }

    /* renamed from: toString */
    public java.lang.String m51114x9616526c() {
        return "OK(files=" + this.f163693a + ", from=" + this.f163694b + ')';
    }
}
