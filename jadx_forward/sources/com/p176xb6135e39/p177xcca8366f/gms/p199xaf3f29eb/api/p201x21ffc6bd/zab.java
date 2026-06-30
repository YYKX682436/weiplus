package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* loaded from: classes13.dex */
public final class zab extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1766x361ae0f1 {
    private final java.lang.ref.WeakReference zaa;

    public zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaa zaaVar) {
        this.zaa = new java.lang.ref.WeakReference(zaaVar);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1766x361ae0f1
    /* renamed from: onStopCallOnce */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1766x361ae0f1 mo17861x250783a0(java.lang.Runnable runnable) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaa zaaVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaa) this.zaa.get();
        if (zaaVar == null) {
            throw new java.lang.IllegalStateException("The target activity has already been GC'd");
        }
        zaaVar.zac(runnable);
        return this;
    }
}
