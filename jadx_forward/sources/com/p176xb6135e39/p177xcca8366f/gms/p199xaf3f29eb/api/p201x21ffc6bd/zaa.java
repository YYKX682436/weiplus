package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* loaded from: classes13.dex */
final class zaa extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af {
    private java.util.List zaa;

    private zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba interfaceC1780x4bb63ba) {
        super(interfaceC1780x4bb63ba);
        this.zaa = new java.util.ArrayList();
        this.f5910xb6d8aaed.mo17915xbba9cc06("LifecycleObserverOnStop", this);
    }

    public static /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaa zaa(android.app.Activity activity) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaa zaaVar;
        synchronized (activity) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba m17903x197d1fc6 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af.m17903x197d1fc6(activity);
            zaaVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaa) m17903x197d1fc6.mo17916x3e046fa5("LifecycleObserverOnStop", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaa.class);
            if (zaaVar == null) {
                zaaVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaa(m17903x197d1fc6);
            }
        }
        return zaaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zac(java.lang.Runnable runnable) {
        this.zaa.add(runnable);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onStop */
    public final void mo17914xc39f8281() {
        java.util.List list;
        synchronized (this) {
            list = this.zaa;
            this.zaa = new java.util.ArrayList();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }
}
