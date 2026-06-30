package com.facebook.soloader;

/* loaded from: classes13.dex */
public final class q extends com.facebook.soloader.j0 {

    /* renamed from: d, reason: collision with root package name */
    public int f44053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.facebook.soloader.r f44054e;

    public q(com.facebook.soloader.r rVar, com.facebook.soloader.o oVar) {
        this.f44054e = rVar;
    }

    @Override // com.facebook.soloader.j0
    public boolean a() {
        com.facebook.soloader.r rVar = this.f44054e;
        rVar.c();
        return this.f44053d < rVar.f44055d.length;
    }

    @Override // com.facebook.soloader.j0
    public com.facebook.soloader.i0 b() {
        com.facebook.soloader.r rVar = this.f44054e;
        rVar.c();
        com.facebook.soloader.p[] pVarArr = rVar.f44055d;
        int i17 = this.f44053d;
        this.f44053d = i17 + 1;
        com.facebook.soloader.p pVar = pVarArr[i17];
        java.io.InputStream inputStream = rVar.f44056e.getInputStream(pVar.f44051f);
        try {
            return new com.facebook.soloader.k0(pVar, inputStream);
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th6;
        }
    }
}
