package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d;

/* loaded from: classes8.dex */
public final class c implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.d f165293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12281xd6f6e760 f165294b;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12281xd6f6e760 c12281xd6f6e760) {
        this.f165293a = dVar;
        this.f165294b = c12281xd6f6e760;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String errorMsg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.d dVar = this.f165293a;
        str = dVar.TAG;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onFailed,errorType:%s,errorCode:%s, msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errorMsg);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.C12281xd6f6e760 c12281xd6f6e760 = this.f165294b;
        if (i18 == -3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.d.e(c12281xd6f6e760, dVar);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.d.f(c12281xd6f6e760, dVar);
        }
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.d dVar = this.f165293a;
        str = dVar.TAG;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, ya.b.f77504xbb80cbe3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.d.g(this.f165294b, dVar);
    }
}
