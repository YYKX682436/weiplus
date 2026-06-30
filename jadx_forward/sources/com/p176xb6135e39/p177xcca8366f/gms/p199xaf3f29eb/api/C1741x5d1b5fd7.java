package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.BatchResult */
/* loaded from: classes13.dex */
public final class C1741x5d1b5fd7 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zaa;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074[] zab;

    public C1741x5d1b5fd7(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074[] abstractC1752x4624a074Arr) {
        this.zaa = c1763x9432bc12;
        this.zab = abstractC1752x4624a074Arr;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d
    /* renamed from: getStatus */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 mo17538x2fe4f2e8() {
        return this.zaa;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: take */
    public <R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> R m17731x363487(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1742x2bddb862<R> c1742x2bddb862) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(c1742x2bddb862.mId < this.zab.length, "The result token does not belong to this batch");
        return (R) this.zab[c1742x2bddb862.mId].mo17816x58e7956(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
