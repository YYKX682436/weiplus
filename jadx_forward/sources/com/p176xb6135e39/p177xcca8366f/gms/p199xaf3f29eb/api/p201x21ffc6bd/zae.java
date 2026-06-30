package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* loaded from: classes13.dex */
public final class zae extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai {
    protected final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl zaa;

    public zae(int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl apiMethodImpl) {
        super(i17);
        this.zaa = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(apiMethodImpl, "Null methods are not runnable.");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public final void zad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        try {
            this.zaa.mo17877x921f43c(c1763x9432bc12);
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public final void zae(java.lang.Exception exc) {
        try {
            this.zaa.mo17877x921f43c(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public final void zaf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6) {
        try {
            this.zaa.run(c1839x38edb6.zaf());
        } catch (java.lang.RuntimeException e17) {
            zae(e17);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public final void zag(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1800x38ed8a c1800x38ed8a, boolean z17) {
        c1800x38ed8a.zac(this.zaa, z17);
    }
}
