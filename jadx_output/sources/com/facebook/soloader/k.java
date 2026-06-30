package com.facebook.soloader;

/* loaded from: classes13.dex */
public final class k extends com.facebook.soloader.j0 {

    /* renamed from: d, reason: collision with root package name */
    public int f44042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.facebook.soloader.l f44043e;

    public k(com.facebook.soloader.l lVar, com.facebook.soloader.j jVar) {
        this.f44043e = lVar;
    }

    @Override // com.facebook.soloader.j0
    public boolean a() {
        return this.f44042d < this.f44043e.f44046d.length;
    }

    @Override // com.facebook.soloader.j0
    public com.facebook.soloader.i0 b() {
        com.facebook.soloader.m[] mVarArr = this.f44043e.f44046d;
        int i17 = this.f44042d;
        this.f44042d = i17 + 1;
        com.facebook.soloader.m mVar = mVarArr[i17];
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(mVar.f44047f);
        try {
            return new com.facebook.soloader.k0(mVar, fileInputStream);
        } catch (java.lang.Throwable th6) {
            fileInputStream.close();
            throw th6;
        }
    }
}
