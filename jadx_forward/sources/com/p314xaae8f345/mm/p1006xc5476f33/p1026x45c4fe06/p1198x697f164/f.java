package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f170775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170776e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.String str) {
        this.f170775d = o6Var;
        this.f170776e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = this.f170775d.C0();
        if (C0 != null) {
            zb1.a aVar = new zb1.a();
            aVar.s("passThroughInfo", this.f170776e);
            C0.p(aVar);
        }
    }
}
