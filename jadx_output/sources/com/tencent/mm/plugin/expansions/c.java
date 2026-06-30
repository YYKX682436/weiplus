package com.tencent.mm.plugin.expansions;

/* loaded from: classes13.dex */
public class c implements com.tencent.mm.plugin.expansions.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expansions.f f99742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l30.g f99743b;

    public c(com.tencent.mm.plugin.expansions.f fVar, l30.g gVar) {
        this.f99742a = fVar;
        this.f99743b = gVar;
    }

    @Override // com.tencent.mm.plugin.expansions.e
    public void onSuccess(java.lang.String str) {
        z95.c cVar;
        com.tencent.mm.plugin.expansions.h0 c17 = com.tencent.mm.plugin.expansions.h0.c();
        com.tencent.mm.plugin.expansions.f fVar = this.f99742a;
        fVar.f99749e = c17;
        fVar.f99748d.countDown();
        l30.g gVar = this.f99743b;
        if (gVar != null) {
            cVar = com.tencent.mm.plugin.expansions.Delivery.sBehavior;
            gVar.a(cVar);
        }
    }
}
