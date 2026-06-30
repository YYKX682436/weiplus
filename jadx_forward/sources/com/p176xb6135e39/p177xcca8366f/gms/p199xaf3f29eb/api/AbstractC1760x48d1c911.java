package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.ResultCallbacks */
/* loaded from: classes13.dex */
public abstract class AbstractC1760x48d1c911<R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2<R> {
    /* renamed from: onFailure */
    public abstract void mo17831xee232ab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12);

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2
    /* renamed from: onResult */
    public final void mo17836x57429edc(R r17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 mo17538x2fe4f2e8 = r17.mo17538x2fe4f2e8();
        if (mo17538x2fe4f2e8.m17855x6e268779()) {
            mo17832xe05b4124(r17);
            return;
        }
        mo17831xee232ab(mo17538x2fe4f2e8);
        if (r17 instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98) {
            try {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98) r17).mo17739x41012807();
            } catch (java.lang.RuntimeException unused) {
                "Unable to release ".concat(java.lang.String.valueOf(r17));
            }
        }
    }

    /* renamed from: onSuccess */
    public abstract void mo17832xe05b4124(R r17);
}
