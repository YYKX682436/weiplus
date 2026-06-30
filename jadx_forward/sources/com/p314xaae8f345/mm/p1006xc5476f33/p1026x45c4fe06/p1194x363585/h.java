package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj1.c f170562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.i f170563e;

    public h(bj1.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.i iVar) {
        this.f170562d = cVar;
        this.f170563e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.i iVar = this.f170563e;
        try {
            this.f170562d.c4(2);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            iVar.a("onServiceConnected");
            throw th6;
        }
        iVar.a("onServiceConnected");
    }
}
