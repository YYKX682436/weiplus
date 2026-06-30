package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public final class k extends com.p166x1da19ac6.p168x5890096f.j0 {

    /* renamed from: d, reason: collision with root package name */
    public int f125575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p166x1da19ac6.p168x5890096f.l f125576e;

    public k(com.p166x1da19ac6.p168x5890096f.l lVar, com.p166x1da19ac6.p168x5890096f.j jVar) {
        this.f125576e = lVar;
    }

    @Override // com.p166x1da19ac6.p168x5890096f.j0
    public boolean a() {
        return this.f125575d < this.f125576e.f125579d.length;
    }

    @Override // com.p166x1da19ac6.p168x5890096f.j0
    public com.p166x1da19ac6.p168x5890096f.i0 b() {
        com.p166x1da19ac6.p168x5890096f.m[] mVarArr = this.f125576e.f125579d;
        int i17 = this.f125575d;
        this.f125575d = i17 + 1;
        com.p166x1da19ac6.p168x5890096f.m mVar = mVarArr[i17];
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(mVar.f125580f);
        try {
            return new com.p166x1da19ac6.p168x5890096f.k0(mVar, fileInputStream);
        } catch (java.lang.Throwable th6) {
            fileInputStream.close();
            throw th6;
        }
    }
}
