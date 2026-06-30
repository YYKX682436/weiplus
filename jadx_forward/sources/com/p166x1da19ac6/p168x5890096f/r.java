package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public abstract class r extends com.p166x1da19ac6.p168x5890096f.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p166x1da19ac6.p168x5890096f.p[] f125588d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.zip.ZipFile f125589e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p166x1da19ac6.p168x5890096f.m0 f125590f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p166x1da19ac6.p168x5890096f.s f125591g;

    public r(com.p166x1da19ac6.p168x5890096f.s sVar, com.p166x1da19ac6.p168x5890096f.m0 m0Var) {
        this.f125591g = sVar;
        this.f125589e = new java.util.zip.ZipFile(sVar.f125592f);
        this.f125590f = m0Var;
    }

    @Override // com.p166x1da19ac6.p168x5890096f.l0
    public final com.p166x1da19ac6.p168x5890096f.h0 a() {
        return new com.p166x1da19ac6.p168x5890096f.h0(c());
    }

    @Override // com.p166x1da19ac6.p168x5890096f.l0
    public final com.p166x1da19ac6.p168x5890096f.j0 b() {
        return new com.p166x1da19ac6.p168x5890096f.q(this, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p166x1da19ac6.p168x5890096f.p[] c() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p166x1da19ac6.p168x5890096f.r.c():com.facebook.soloader.p[]");
    }

    @Override // com.p166x1da19ac6.p168x5890096f.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f125589e.close();
    }
}
