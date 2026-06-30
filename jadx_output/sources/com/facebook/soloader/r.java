package com.facebook.soloader;

/* loaded from: classes13.dex */
public abstract class r extends com.facebook.soloader.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.facebook.soloader.p[] f44055d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.zip.ZipFile f44056e;

    /* renamed from: f, reason: collision with root package name */
    public final com.facebook.soloader.m0 f44057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.facebook.soloader.s f44058g;

    public r(com.facebook.soloader.s sVar, com.facebook.soloader.m0 m0Var) {
        this.f44058g = sVar;
        this.f44056e = new java.util.zip.ZipFile(sVar.f44059f);
        this.f44057f = m0Var;
    }

    @Override // com.facebook.soloader.l0
    public final com.facebook.soloader.h0 a() {
        return new com.facebook.soloader.h0(c());
    }

    @Override // com.facebook.soloader.l0
    public final com.facebook.soloader.j0 b() {
        return new com.facebook.soloader.q(this, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.soloader.p[] c() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.r.c():com.facebook.soloader.p[]");
    }

    @Override // com.facebook.soloader.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44056e.close();
    }
}
