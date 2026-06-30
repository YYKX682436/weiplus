package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f170180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f170181e;

    public d(java.lang.Runnable runnable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        this.f170180d = runnable;
        this.f170181e = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Runnable runnable = this.f170180d;
        if (runnable != null) {
            runnable.run();
        }
        ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c(this.f170181e));
    }
}
