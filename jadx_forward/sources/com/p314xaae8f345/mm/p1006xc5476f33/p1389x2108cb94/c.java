package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes13.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.f f181275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l30.g f181276b;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.f fVar, l30.g gVar) {
        this.f181275a = fVar;
        this.f181276b = gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.e
    /* renamed from: onSuccess */
    public void mo55155xe05b4124(java.lang.String str) {
        z95.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.h0 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.h0.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.f fVar = this.f181275a;
        fVar.f181282e = c17;
        fVar.f181281d.countDown();
        l30.g gVar = this.f181276b;
        if (gVar != null) {
            cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.f35478xf8a6f3e5;
            gVar.a(cVar);
        }
    }
}
