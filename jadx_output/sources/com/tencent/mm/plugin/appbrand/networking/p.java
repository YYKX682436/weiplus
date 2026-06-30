package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public class p extends java.io.IOException {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.networking.o f86120d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86121e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f86122f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.protobuf.f f86123g;

    public p(com.tencent.mm.plugin.appbrand.networking.o oVar, int i17, java.lang.String str, com.tencent.mm.protobuf.f fVar) {
        super(java.lang.String.format(java.util.Locale.US, "[%s %d %s]", oVar.toString(), java.lang.Integer.valueOf(i17), str));
        this.f86120d = oVar;
        this.f86121e = i17;
        this.f86122f = str;
        this.f86123g = fVar;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "CgiError{err=" + this.f86120d + ", errCode=" + this.f86121e + ", message='" + this.f86122f + "'}";
    }
}
