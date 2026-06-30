package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f269348a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f f269349b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.d f269350c;

    public g(java.lang.String uri, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f resType, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.d debugType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugType, "debugType");
        this.f269348a = uri;
        this.f269349b = resType;
        this.f269350c = debugType;
    }

    /* renamed from: toString */
    public java.lang.String m74919x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[script]\n                ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f.f269324d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f fVar2 = this.f269349b;
        if (fVar2 != fVar) {
            str = "resType: " + fVar2;
        } else {
            str = "debugType: " + this.f269350c;
        }
        sb6.append(str);
        sb6.append("\n                ");
        sb6.append(this.f269348a);
        sb6.append("\n                ");
        return r26.b0.b(sb6.toString());
    }

    public /* synthetic */ g(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.d dVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i17 & 2) != 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f.f269324d : fVar, (i17 & 4) != 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.d.f269305d : dVar);
    }
}
