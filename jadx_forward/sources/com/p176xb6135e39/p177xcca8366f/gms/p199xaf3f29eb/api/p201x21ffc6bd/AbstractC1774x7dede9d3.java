package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.DataHolderResult */
/* loaded from: classes13.dex */
public abstract class AbstractC1774x7dede9d3 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98 {

    /* renamed from: mDataHolder */
    protected final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 f5908x1540ba43;

    /* renamed from: mStatus */
    protected final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 f5909x1a39f6bf;

    public AbstractC1774x7dede9d3(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        this.f5909x1a39f6bf = c1763x9432bc12;
        this.f5908x1540ba43 = c1888xafe09e16;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d
    /* renamed from: getStatus */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 mo17538x2fe4f2e8() {
        return this.f5909x1a39f6bf;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98
    /* renamed from: release */
    public void mo17739x41012807() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16 = this.f5908x1540ba43;
        if (c1888xafe09e16 != null) {
            c1888xafe09e16.close();
        }
    }

    public AbstractC1774x7dede9d3(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16) {
        this(c1888xafe09e16, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(c1888xafe09e16.m18030xfd0160f5()));
    }
}
