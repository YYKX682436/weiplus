package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zabt */
/* loaded from: classes13.dex */
final class RunnableC1842x38edb9 implements java.lang.Runnable {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zaa;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1843x38edba zab;

    public RunnableC1842x38edb9(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1843x38edba c1843x38edba, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        this.zab = c1843x38edba;
        this.zaa = c1700xff0c58bb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb3;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb4;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1843x38edba c1843x38edba = this.zab;
        map = c1843x38edba.zaa.zan;
        c1768x75462a05 = c1843x38edba.zac;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6) map.get(c1768x75462a05);
        if (c1839x38edb6 == null) {
            return;
        }
        if (!this.zaa.m17605x6e268779()) {
            c1839x38edb6.zar(this.zaa, null);
            return;
        }
        this.zab.zaf = true;
        interfaceC1736x7877dfeb = this.zab.zab;
        if (interfaceC1736x7877dfeb.mo17723xabdb8910()) {
            this.zab.zah();
            return;
        }
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1843x38edba c1843x38edba2 = this.zab;
            interfaceC1736x7877dfeb3 = c1843x38edba2.zab;
            interfaceC1736x7877dfeb4 = c1843x38edba2.zab;
            interfaceC1736x7877dfeb3.mo17714x525c67d9(null, interfaceC1736x7877dfeb4.mo17716xa9228da4());
        } catch (java.lang.SecurityException unused) {
            interfaceC1736x7877dfeb2 = this.zab.zab;
            interfaceC1736x7877dfeb2.mo17709x1f9d589c("Failed to get service from broker.");
            c1839x38edb6.zar(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(10), null);
        }
    }
}
