package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* loaded from: classes13.dex */
public final class zal {
    private int zad;
    private final x.b zab = new x.b();
    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc zac = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc();
    private boolean zae = false;
    private final x.b zaa = new x.b();

    public zal(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1749x484400ff) it.next()).mo17755x10f860db(), null);
        }
        this.zad = ((x.j) this.zaa.keySet()).size();
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 zaa() {
        return this.zac.m19602xfb859dfb();
    }

    public final java.util.Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, java.lang.String str) {
        this.zaa.put(c1768x75462a05, c1700xff0c58bb);
        this.zab.put(c1768x75462a05, str);
        this.zad--;
        if (!c1700xff0c58bb.m17605x6e268779()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.m19604x209a1f1f(this.zab);
            } else {
                this.zac.m19603xb411020d(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1739x93f60114(this.zaa));
            }
        }
    }
}
