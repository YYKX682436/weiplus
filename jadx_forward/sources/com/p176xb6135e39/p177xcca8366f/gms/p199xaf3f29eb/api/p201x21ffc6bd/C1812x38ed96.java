package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.zaap */
/* loaded from: classes13.dex */
public final class C1812x38ed96 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractRunnableC1818x38ed9c {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d zaa;
    private final java.util.ArrayList zac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1812x38ed96(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d c1819x38ed9d, java.util.ArrayList arrayList) {
        super(c1819x38ed9d, null);
        this.zaa = c1819x38ed9d;
        this.zac = arrayList;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractRunnableC1818x38ed9c
    public final void zaa() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b interfaceC1914xc5c6680b;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d c1819x38ed9d = this.zaa;
        c1831x38edae = c1819x38ed9d.zaa;
        c1831x38edae.zag.zad = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d.zao(c1819x38ed9d);
        java.util.ArrayList arrayList = this.zac;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb) arrayList.get(i17);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d c1819x38ed9d2 = this.zaa;
            interfaceC1914xc5c6680b = c1819x38ed9d2.zao;
            c1831x38edae2 = c1819x38ed9d2.zaa;
            interfaceC1736x7877dfeb.mo17714x525c67d9(interfaceC1914xc5c6680b, c1831x38edae2.zag.zad);
        }
    }
}
