package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4;

/* loaded from: classes7.dex */
public class p extends java.io.IOException {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.o f167653d;

    /* renamed from: e, reason: collision with root package name */
    public final int f167654e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f167655f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.f f167656g;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.o oVar, int i17, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        super(java.lang.String.format(java.util.Locale.US, "[%s %d %s]", oVar.toString(), java.lang.Integer.valueOf(i17), str));
        this.f167653d = oVar;
        this.f167654e = i17;
        this.f167655f = str;
        this.f167656g = fVar;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "CgiError{err=" + this.f167653d + ", errCode=" + this.f167654e + ", message='" + this.f167655f + "'}";
    }
}
