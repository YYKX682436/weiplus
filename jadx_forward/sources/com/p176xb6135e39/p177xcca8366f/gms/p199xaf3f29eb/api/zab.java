package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zab implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074.StatusListener {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1740x3cfe71a zaa;

    public zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1740x3cfe71a c1740x3cfe71a) {
        this.zaa = c1740x3cfe71a;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074.StatusListener
    /* renamed from: onComplete */
    public final void mo17821x815f5438(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        java.lang.Object obj;
        int i17;
        int i18;
        boolean z17;
        boolean z18;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074[] abstractC1752x4624a074Arr;
        obj = this.zaa.zai;
        synchronized (obj) {
            if (this.zaa.mo17817xc9602be3()) {
                return;
            }
            if (c1763x9432bc12.m17853xc9602be3()) {
                this.zaa.zag = true;
            } else if (!c1763x9432bc12.m17855x6e268779()) {
                this.zaa.zaf = true;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1740x3cfe71a c1740x3cfe71a = this.zaa;
            i17 = c1740x3cfe71a.zae;
            c1740x3cfe71a.zae = i17 - 1;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1740x3cfe71a c1740x3cfe71a2 = this.zaa;
            i18 = c1740x3cfe71a2.zae;
            if (i18 == 0) {
                z17 = c1740x3cfe71a2.zag;
                if (z17) {
                    super/*com.google.android.gms.common.api.internal.BasePendingResult*/.mo17729xae7a2e7a();
                } else {
                    z18 = c1740x3cfe71a2.zaf;
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc122 = z18 ? new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(13) : com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5903x535c1c1;
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1740x3cfe71a c1740x3cfe71a3 = this.zaa;
                    abstractC1752x4624a074Arr = c1740x3cfe71a3.zah;
                    c1740x3cfe71a3.m17883x209a1f1f(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1741x5d1b5fd7(c1763x9432bc122, abstractC1752x4624a074Arr));
                }
            }
        }
    }
}
