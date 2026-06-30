package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public abstract class zad extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zac {
    protected final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc zaa;

    public zad(int i17, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc) {
        super(i17);
        this.zaa = c2440x4f4de6dc;
    }

    public abstract void zac(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6);

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public final void zad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        this.zaa.m19605xc5fa5768(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1738x1a0a8775(c1763x9432bc12));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public final void zae(java.lang.Exception exc) {
        this.zaa.m19605xc5fa5768(exc);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public final void zaf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6) {
        try {
            zac(c1839x38edb6);
        } catch (android.os.DeadObjectException e17) {
            zad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai.zah(e17));
            throw e17;
        } catch (android.os.RemoteException e18) {
            zad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai.zah(e18));
        } catch (java.lang.RuntimeException e19) {
            this.zaa.m19605xc5fa5768(e19);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zai
    public void zag(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1800x38ed8a c1800x38ed8a, boolean z17) {
    }
}
