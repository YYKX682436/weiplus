package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* loaded from: classes13.dex */
final class zaf<R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523<R> {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d zae;

    public zaf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d interfaceC1758x91b2b43d) {
        super(android.os.Looper.getMainLooper());
        this.zae = interfaceC1758x91b2b43d;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523
    /* renamed from: createFailedResult */
    public final R mo17567xe8a1c1d6(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        if (c1763x9432bc12.m17849xfd0160f5() == this.zae.mo17538x2fe4f2e8().m17849xfd0160f5()) {
            return (R) this.zae;
        }
        throw new java.lang.UnsupportedOperationException("Creating failed results is not supported");
    }
}
