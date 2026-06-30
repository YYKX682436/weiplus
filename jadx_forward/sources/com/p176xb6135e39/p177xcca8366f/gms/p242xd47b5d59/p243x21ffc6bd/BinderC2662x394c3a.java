package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzhb */
/* loaded from: classes13.dex */
final class BinderC2662x394c3a extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2647x394c26<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataItemResult> {

    /* renamed from: zzev */
    private final java.util.List<java.util.concurrent.FutureTask<java.lang.Boolean>> f7766x394bf1;

    public BinderC2662x394c3a(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataItemResult> resultHolder, java.util.List<java.util.concurrent.FutureTask<java.lang.Boolean>> list) {
        super(resultHolder);
        this.f7766x394bf1 = list;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zza, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2593x394be6
    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2629x394c0f c2629x394c0f) {
        zza((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2662x394c3a) new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2537x394ba4(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2638x394c1d.zzb(c2629x394c0f.f7745xec0a8ff), c2629x394c0f.f7746x394bd5));
        if (c2629x394c0f.f7745xec0a8ff != 0) {
            java.util.Iterator<java.util.concurrent.FutureTask<java.lang.Boolean>> it = this.f7766x394bf1.iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
        }
    }
}
