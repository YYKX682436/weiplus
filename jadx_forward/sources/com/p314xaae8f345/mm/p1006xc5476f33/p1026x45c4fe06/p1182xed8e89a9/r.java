package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.v f169237d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.v vVar) {
        this.f169237d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Debug.MemoryInfo memoryInfo = new android.os.Debug.MemoryInfo();
        android.os.Debug.getMemoryInfo(memoryInfo);
        int i17 = yd.c0.a(memoryInfo).f542451a * 1024 * 1024;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f169237d.f169229e;
        sj1.b c17 = sj1.l.c(java.lang.String.valueOf(e9Var != null ? java.lang.Integer.valueOf(e9Var.mo50260x9f1221c2()) : null));
        if (c17 != null) {
            c17.a(0L, i17, sj1.l.a());
        }
    }
}
