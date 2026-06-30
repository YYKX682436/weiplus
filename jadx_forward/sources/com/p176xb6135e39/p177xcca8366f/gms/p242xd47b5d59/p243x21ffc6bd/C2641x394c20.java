package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzgg */
/* loaded from: classes13.dex */
final class C2641x394c20 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> {

    /* renamed from: zzes */
    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<java.lang.Boolean> f7761x394bee;

    public C2641x394c20(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<java.lang.Boolean> c2440x4f4de6dc) {
        this.f7761x394bee = c2440x4f4de6dc;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder
    /* renamed from: setFailedResult */
    public final void mo17877x921f43c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        this.f7761x394bee.m19603xb411020d(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1738x1a0a8775(c1763x9432bc12));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder
    /* renamed from: setResult */
    public final /* synthetic */ void mo17878x209a1f1f(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc<java.lang.Boolean> c2440x4f4de6dc;
        java.lang.Boolean bool;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc122 = c1763x9432bc12;
        int m17849xfd0160f5 = c1763x9432bc122.m17849xfd0160f5();
        if (m17849xfd0160f5 == 0) {
            c2440x4f4de6dc = this.f7761x394bee;
            bool = java.lang.Boolean.TRUE;
        } else if (m17849xfd0160f5 != 4002) {
            mo17877x921f43c(c1763x9432bc122);
            return;
        } else {
            c2440x4f4de6dc = this.f7761x394bee;
            bool = java.lang.Boolean.FALSE;
        }
        c2440x4f4de6dc.m19604x209a1f1f(bool);
    }
}
