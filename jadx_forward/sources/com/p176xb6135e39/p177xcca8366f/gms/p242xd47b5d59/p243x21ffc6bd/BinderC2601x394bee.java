package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.wearable.internal.zzes */
/* loaded from: classes13.dex */
public final class BinderC2601x394bee<T> extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2647x394c26<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> {

    /* renamed from: zzec */
    private java.lang.ref.WeakReference<java.util.Map<T, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43<T>>> f7702x394bde;

    /* renamed from: zzed */
    private java.lang.ref.WeakReference<T> f7703x394bdf;

    public BinderC2601x394bee(java.util.Map<T, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43<T>> map, T t17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder) {
        super(resultHolder);
        this.f7702x394bde = new java.lang.ref.WeakReference<>(map);
        this.f7703x394bdf = new java.lang.ref.WeakReference<>(t17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zza, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2593x394be6
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        java.util.Map<T, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43<T>> map = this.f7702x394bde.get();
        T t17 = this.f7703x394bdf.get();
        if (!c1763x9432bc12.mo17538x2fe4f2e8().m17855x6e268779() && map != null && t17 != null) {
            synchronized (map) {
                com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43<T> remove = map.remove(t17);
                if (remove != null) {
                    remove.m19955x5a5b64d();
                }
            }
        }
        zza((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2601x394bee<T>) c1763x9432bc12);
    }
}
