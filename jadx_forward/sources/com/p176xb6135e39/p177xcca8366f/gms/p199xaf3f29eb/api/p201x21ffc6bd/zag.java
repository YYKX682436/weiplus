package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* loaded from: classes13.dex */
public final class zag extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zac {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633 zaa;
    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc zab;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe zad;

    public zag(int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633 abstractC1794xa4358633, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1792x8e82d8fe interfaceC1792x8e82d8fe) {
        super(i17);
        this.zab = c2440x4f4de6dc;
        this.zaa = abstractC1794xa4358633;
        this.zad = interfaceC1792x8e82d8fe;
        if (i17 == 2 && abstractC1794xa4358633.m17948x5f2358d9()) {
            throw new java.lang.IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zac
    public final boolean zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6) {
        return this.zaa.m17948x5f2358d9();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zac
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6) {
        return this.zaa.zab();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public final void zad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        this.zab.m19605xc5fa5768(this.zad.mo17862x57bd4199(c1763x9432bc12));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public final void zae(java.lang.Exception exc) {
        this.zab.m19605xc5fa5768(exc);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public final void zaf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6) {
        try {
            this.zaa.mo17346x9ef606a(c1839x38edb6.zaf(), this.zab);
        } catch (android.os.DeadObjectException e17) {
            throw e17;
        } catch (android.os.RemoteException e18) {
            zad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai.zah(e18));
        } catch (java.lang.RuntimeException e19) {
            this.zab.m19605xc5fa5768(e19);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public final void zag(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1800x38ed8a c1800x38ed8a, boolean z17) {
        c1800x38ed8a.zad(this.zab, z17);
    }
}
