package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class t5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Iterator f127079a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map.Entry f127080b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f127081c;

    public t5(com.p176xb6135e39.p283xc50a8b8b.u5 u5Var, boolean z17, com.p176xb6135e39.p283xc50a8b8b.o5 o5Var) {
        java.util.Iterator r17 = u5Var.f127111d.r();
        this.f127079a = r17;
        if (r17.hasNext()) {
            this.f127080b = (java.util.Map.Entry) r17.next();
        }
        this.f127081c = z17;
    }

    public void a(int i17, com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        while (true) {
            java.util.Map.Entry entry = this.f127080b;
            if (entry == null || ((com.p176xb6135e39.p283xc50a8b8b.b4) entry.getKey()).f126442e.f127096f >= i17) {
                return;
            }
            com.p176xb6135e39.p283xc50a8b8b.b4 b4Var = (com.p176xb6135e39.p283xc50a8b8b.b4) this.f127080b.getKey();
            if (this.f127081c && b4Var.u0() == com.p176xb6135e39.p283xc50a8b8b.vb.MESSAGE && !b4Var.d1()) {
                java.util.Map.Entry entry2 = this.f127080b;
                boolean z17 = entry2 instanceof com.p176xb6135e39.p283xc50a8b8b.b7;
                com.p176xb6135e39.p283xc50a8b8b.u1 u1Var = b4Var.f126442e;
                if (z17) {
                    int i18 = u1Var.f127096f;
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((com.p176xb6135e39.p283xc50a8b8b.b7) entry2).f126459d.getValue());
                    throw null;
                }
                k0Var.M(u1Var.f127096f, (com.p176xb6135e39.p283xc50a8b8b.k8) entry2.getValue());
            } else {
                com.p176xb6135e39.p283xc50a8b8b.b5.y(b4Var, this.f127080b.getValue(), k0Var);
            }
            java.util.Iterator it = this.f127079a;
            if (it.hasNext()) {
                this.f127080b = (java.util.Map.Entry) it.next();
            } else {
                this.f127080b = null;
            }
        }
    }
}
