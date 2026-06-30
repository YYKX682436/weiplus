package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* loaded from: classes13.dex */
public final class zah extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zad {
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey zab;

    public zah(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey listenerKey, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc) {
        super(4, c2440x4f4de6dc);
        this.zab = listenerKey;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zac
    public final boolean zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1857x38edcd c1857x38edcd = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1857x38edcd) c1839x38edb6.zah().get(this.zab);
        return c1857x38edcd != null && c1857x38edcd.zaa.zab();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zac
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1857x38edcd c1857x38edcd = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1857x38edcd) c1839x38edb6.zah().get(this.zab);
        if (c1857x38edcd == null) {
            return null;
        }
        return c1857x38edcd.zaa.m17935xf716cc72();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zad
    public final void zac(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1857x38edcd c1857x38edcd = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1857x38edcd) c1839x38edb6.zah().remove(this.zab);
        if (c1857x38edcd == null) {
            this.zaa.m19606xd9193fa4(java.lang.Boolean.FALSE);
            return;
        }
        c1857x38edcd.zab.mo17959xc221c110(c1839x38edb6.zaf(), this.zaa);
        c1857x38edcd.zaa.m17933x243c4221();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zad, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public final /* bridge */ /* synthetic */ void zag(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1800x38ed8a c1800x38ed8a, boolean z17) {
    }
}
