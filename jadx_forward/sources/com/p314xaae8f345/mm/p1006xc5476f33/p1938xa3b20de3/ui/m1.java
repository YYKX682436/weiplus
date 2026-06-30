package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class m1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f234206d;

    public m1() {
        super(0);
        this.f234206d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6146x2bfbe4e9 c6146x2bfbe4e9 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6146x2bfbe4e9) abstractC20979x809547d1;
        if (gm0.j1.a() && (c6146x2bfbe4e9 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6146x2bfbe4e9)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncOfflineTokenListener", "SyncOfflineTokenListener -> updateToken()");
            am.gy gyVar = c6146x2bfbe4e9.f136408g;
            boolean z17 = gyVar.f88331a;
            boolean z18 = gyVar.f88332b == 1;
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(135L, 25L, 1L, true);
            }
            if (z17) {
                this.f234206d.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.k1(this, c6146x2bfbe4e9, z18), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.l1(this, c6146x2bfbe4e9, z18));
            }
        }
        return false;
    }
}
