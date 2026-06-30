package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.BooleanResult */
/* loaded from: classes13.dex */
public class C1743x99e59245 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zaa;
    private final boolean zab;

    public C1743x99e59245(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12, boolean z17) {
        this.zaa = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1763x9432bc12, "Status must not be null");
        this.zab = z17;
    }

    /* renamed from: equals */
    public final boolean m17732xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1743x99e59245)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1743x99e59245 c1743x99e59245 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1743x99e59245) obj;
        return this.zaa.m17846xb2c87fbf(c1743x99e59245.zaa) && this.zab == c1743x99e59245.zab;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d
    /* renamed from: getStatus */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 mo17538x2fe4f2e8() {
        return this.zaa;
    }

    /* renamed from: getValue */
    public boolean m17733x754a37bb() {
        return this.zab;
    }

    /* renamed from: hashCode */
    public final int m17734x8cdac1b() {
        return ((this.zaa.m17852x8cdac1b() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de) * 31) + (this.zab ? 1 : 0);
    }
}
