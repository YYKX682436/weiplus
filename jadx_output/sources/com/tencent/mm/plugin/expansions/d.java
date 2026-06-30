package com.tencent.mm.plugin.expansions;

/* loaded from: classes13.dex */
public class d implements com.tencent.mm.plugin.expansions.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expansions.f f99746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l30.a f99747b;

    public d(com.tencent.mm.plugin.expansions.f fVar, l30.a aVar) {
        this.f99746a = fVar;
        this.f99747b = aVar;
    }

    @Override // com.tencent.mm.plugin.expansions.e
    public void onSuccess(java.lang.String str) {
        z95.c cVar;
        com.tencent.mm.plugin.expansions.h0 c17 = com.tencent.mm.plugin.expansions.h0.c();
        com.tencent.mm.plugin.expansions.f fVar = this.f99746a;
        fVar.f99749e = c17;
        fVar.f99748d.countDown();
        l30.a aVar = this.f99747b;
        if (aVar != null) {
            cVar = com.tencent.mm.plugin.expansions.Delivery.sBehavior;
            android.content.res.AssetManager assetManager = cVar.getAssets();
            kotlin.jvm.internal.o.g(assetManager, "assetManager");
            yz5.l lVar = ((com.tencent.mm.plugin.expansions.u) aVar).f99775a.f99777a;
            if (lVar != null) {
                lVar.invoke(assetManager);
            }
        }
    }
}
