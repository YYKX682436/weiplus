package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f164259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.h0 f164261f;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.h0 h0Var, java.lang.String[] strArr, int i17) {
        this.f164261f = h0Var;
        this.f164259d = strArr;
        this.f164260e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.h0 h0Var = this.f164261f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83 c12789x831bcd83 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83) h0Var.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83.class);
        if (c12789x831bcd83 == null) {
            h0Var.d("fail cant init view", null);
            return;
        }
        tl1.b bVar = h0Var.f501733d;
        bVar.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f0(h0Var, bVar));
        c12789x831bcd83.f173344h = this.f164260e;
        c12789x831bcd83.b();
        java.lang.String[] strArr = this.f164259d;
        c12789x831bcd83.f173340d = strArr;
        c12789x831bcd83.f173341e.f(java.util.Arrays.asList(strArr));
        bVar.m166747x3c802832(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.g0(h0Var, bVar, c12789x831bcd83));
        bVar.mo166745xf81398f(h0Var.f164277h);
        bVar.i();
    }
}
