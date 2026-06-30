package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.zaao */
/* loaded from: classes13.dex */
public final class C1811x38ed95 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractRunnableC1818x38ed9c {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d zaa;
    private final java.util.Map zac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1811x38ed95(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d c1819x38ed9d, java.util.Map map) {
        super(c1819x38ed9d, null);
        this.zaa = c1819x38ed9d;
        this.zac = map;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractRunnableC1818x38ed9c
    public final void zaa() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a c1706xe937257a;
        android.content.Context context;
        boolean z17;
        android.content.Context context2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae;
        com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae zaeVar;
        com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae zaeVar2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae2;
        android.content.Context context3;
        boolean z18;
        c1706xe937257a = this.zaa.zad;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zal zalVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zal(c1706xe937257a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb : this.zac.keySet()) {
            if (interfaceC1736x7877dfeb.mo17722xb7ac48d9()) {
                z18 = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1808x38ed92) this.zac.get(interfaceC1736x7877dfeb)).zac;
                if (!z18) {
                    arrayList.add(interfaceC1736x7877dfeb);
                }
            }
            arrayList2.add(interfaceC1736x7877dfeb);
        }
        int i17 = 0;
        int i18 = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i17 < size) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb2 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb) arrayList.get(i17);
                context = this.zaa.zac;
                i18 = zalVar.zab(context, interfaceC1736x7877dfeb2);
                i17++;
                if (i18 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i17 < size2) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb3 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb) arrayList2.get(i17);
                context3 = this.zaa.zac;
                i18 = zalVar.zab(context3, interfaceC1736x7877dfeb3);
                i17++;
                if (i18 == 0) {
                    break;
                }
            }
        }
        if (i18 != 0) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(i18, null);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d c1819x38ed9d = this.zaa;
            c1831x38edae2 = c1819x38ed9d.zaa;
            c1831x38edae2.zal(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1809x38ed93(this, c1819x38ed9d, c1700xff0c58bb));
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d c1819x38ed9d2 = this.zaa;
        z17 = c1819x38ed9d2.zam;
        if (z17) {
            zaeVar = c1819x38ed9d2.zak;
            if (zaeVar != null) {
                zaeVar2 = c1819x38ed9d2.zak;
                zaeVar2.zab();
            }
        }
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb4 : this.zac.keySet()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.ConnectionProgressReportCallbacks) this.zac.get(interfaceC1736x7877dfeb4);
            if (interfaceC1736x7877dfeb4.mo17722xb7ac48d9()) {
                context2 = this.zaa.zac;
                if (zalVar.zab(context2, interfaceC1736x7877dfeb4) != 0) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d c1819x38ed9d3 = this.zaa;
                    c1831x38edae = c1819x38ed9d3.zaa;
                    c1831x38edae.zal(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1810x38ed94(this, c1819x38ed9d3, connectionProgressReportCallbacks));
                }
            }
            interfaceC1736x7877dfeb4.mo17707x38b478ea(connectionProgressReportCallbacks);
        }
    }
}
