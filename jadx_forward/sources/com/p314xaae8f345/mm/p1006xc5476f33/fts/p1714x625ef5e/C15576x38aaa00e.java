package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic$2 */
/* loaded from: classes12.dex */
public class C15576x38aaa00e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f1 f218971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15576x38aaa00e(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f1 f1Var, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f218971d = f1Var;
        this.f39173x3fe91575 = 905296653;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd2 = c5255x5f3208fd;
        am.r2 r2Var = c5255x5f3208fd2.f135586g;
        if (r2Var.f89292a == 35 && r2Var.f89293b == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "CheckResUpdateCacheFileEvent: %s", r2Var.f89294c);
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c1(this, c5255x5f3208fd2), "FTS.updateFeatureList");
        }
        return true;
    }
}
