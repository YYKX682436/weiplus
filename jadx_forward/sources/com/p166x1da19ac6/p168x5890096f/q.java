package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public final class q extends com.p166x1da19ac6.p168x5890096f.j0 {

    /* renamed from: d, reason: collision with root package name */
    public int f125586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p166x1da19ac6.p168x5890096f.r f125587e;

    public q(com.p166x1da19ac6.p168x5890096f.r rVar, com.p166x1da19ac6.p168x5890096f.o oVar) {
        this.f125587e = rVar;
    }

    @Override // com.p166x1da19ac6.p168x5890096f.j0
    public boolean a() {
        com.p166x1da19ac6.p168x5890096f.r rVar = this.f125587e;
        rVar.c();
        return this.f125586d < rVar.f125588d.length;
    }

    @Override // com.p166x1da19ac6.p168x5890096f.j0
    public com.p166x1da19ac6.p168x5890096f.i0 b() {
        com.p166x1da19ac6.p168x5890096f.r rVar = this.f125587e;
        rVar.c();
        com.p166x1da19ac6.p168x5890096f.p[] pVarArr = rVar.f125588d;
        int i17 = this.f125586d;
        this.f125586d = i17 + 1;
        com.p166x1da19ac6.p168x5890096f.p pVar = pVarArr[i17];
        java.io.InputStream inputStream = rVar.f125589e.getInputStream(pVar.f125584f);
        try {
            return new com.p166x1da19ac6.p168x5890096f.k0(pVar, inputStream);
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th6;
        }
    }
}
