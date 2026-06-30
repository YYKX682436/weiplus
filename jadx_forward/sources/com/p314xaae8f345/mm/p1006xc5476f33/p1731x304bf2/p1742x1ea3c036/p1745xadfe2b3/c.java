package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3;

/* loaded from: classes8.dex */
public class c implements sd.a {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f221345d;

    /* renamed from: e, reason: collision with root package name */
    public sd.l0 f221346e;

    public c(android.content.Context context, java.lang.Class cls, nw4.e eVar) {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.plugin.game.luggage.liteapp.LiteLuggageService$1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.c.this;
                cVar.f221346e.a();
                cVar.f221345d = null;
                cVar.f221346e = null;
                mo48814x2efc64();
                return false;
            }
        };
        this.f221345d = context;
        this.f221346e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.b(context, cls, eVar);
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    @Override // sd.a
    /* renamed from: getContext */
    public android.content.Context mo64555x76847179() {
        return this.f221345d;
    }

    @Override // sd.a
    /* renamed from: getRuntime */
    public sd.l0 mo64556x9a3f0ba2() {
        return this.f221346e;
    }
}
