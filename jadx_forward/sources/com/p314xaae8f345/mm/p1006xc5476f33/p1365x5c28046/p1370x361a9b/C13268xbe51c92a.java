package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$2 */
/* loaded from: classes12.dex */
public class C13268xbe51c92a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k f179146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13268xbe51c92a(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f179146d = kVar;
        this.f39173x3fe91575 = -1435144905;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 c5147x8f44fd47) {
        final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 c5147x8f44fd472 = c5147x8f44fd47;
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$2$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.C13268xbe51c92a c13268xbe51c92a = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.C13268xbe51c92a.this;
                c13268xbe51c92a.getClass();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 c5147x8f44fd473 = c5147x8f44fd472;
                if (!(c5147x8f44fd473 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47) || c5147x8f44fd473.f135497g.f87945a) {
                    return;
                }
                c13268xbe51c92a.f179146d.f();
            }
        }, "BKG-mActivateEvent");
        return false;
    }
}
