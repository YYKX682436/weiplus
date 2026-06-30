package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557;

/* loaded from: classes15.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.g f159182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f159183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159184f;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.g gVar, int i17, java.lang.String str) {
        this.f159182d = gVar;
        this.f159183e = i17;
        this.f159184f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.b bVar = this.f159182d.f159202c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.C11850xe7d6d5d6 c11850xe7d6d5d6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.C11850xe7d6d5d6(this.f159183e, this.f159184f);
        bVar.getClass();
        int i17 = (bVar.f159179b + 1) % 100;
        int i18 = bVar.f159180c + c11850xe7d6d5d6.f159176f;
        bVar.f159178a[i17] = c11850xe7d6d5d6;
        bVar.f159179b = i17;
        bVar.f159180c = i18;
        if (true == (99 <= i17 || 524288 <= i18)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.g.a(this.f159182d);
        }
        this.f159182d.f159203d = android.os.SystemClock.elapsedRealtime() + 200;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.g gVar = this.f159182d;
        if (gVar.f159204e == null) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.f fVar = this.f159182d.f159205f;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            java.util.Objects.requireNonNull(fVar);
            gVar.f159204e = t0Var.t(fVar, 200L, null);
        }
    }
}
