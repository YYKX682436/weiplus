package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f161819a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f161820b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f161821c;

    public a(int i17, java.lang.String fileId, java.lang.String aesKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileId, "fileId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        this.f161819a = i17;
        this.f161820b = fileId;
        this.f161821c = aesKey;
    }

    /* renamed from: equals */
    public boolean m50801xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.a) obj;
        return this.f161819a == aVar.f161819a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161820b, aVar.f161820b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161821c, aVar.f161821c);
    }

    /* renamed from: hashCode */
    public int m50802x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f161819a) * 31) + this.f161820b.hashCode()) * 31) + this.f161821c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50803x9616526c() {
        return "CdnUploadResult(code=" + this.f161819a + ", fileId=" + this.f161820b + ", aesKey=" + this.f161821c + ')';
    }
}
