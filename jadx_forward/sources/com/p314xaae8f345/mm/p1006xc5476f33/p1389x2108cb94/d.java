package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes13.dex */
public class d implements com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.f f181279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l30.a f181280b;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.f fVar, l30.a aVar) {
        this.f181279a = fVar;
        this.f181280b = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.e
    /* renamed from: onSuccess */
    public void mo55155xe05b4124(java.lang.String str) {
        z95.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.h0 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.h0.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.f fVar = this.f181279a;
        fVar.f181282e = c17;
        fVar.f181281d.countDown();
        l30.a aVar = this.f181280b;
        if (aVar != null) {
            cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.f35478xf8a6f3e5;
            android.content.res.AssetManager assetManager = cVar.mo55159x11279679();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetManager, "assetManager");
            yz5.l lVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.u) aVar).f181308a.f181310a;
            if (lVar != null) {
                lVar.mo146xb9724478(assetManager);
            }
        }
    }
}
