package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.ResolvingResultCallbacks */
/* loaded from: classes13.dex */
public abstract class AbstractC1756xba9b3268<R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1760x48d1c911<R> {
    private final android.app.Activity zza;
    private final int zzb;

    public AbstractC1756xba9b3268(android.app.Activity activity, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(activity, "Activity must not be null");
        this.zza = activity;
        this.zzb = i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1760x48d1c911
    /* renamed from: onFailure */
    public final void mo17831xee232ab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        if (!c1763x9432bc12.m17851xc9b9eee6()) {
            m17833xba230dbf(c1763x9432bc12);
            return;
        }
        try {
            c1763x9432bc12.m17856x706e0338(this.zza, this.zzb);
        } catch (android.content.IntentSender.SendIntentException unused) {
            m17833xba230dbf(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(8));
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1760x48d1c911
    /* renamed from: onSuccess */
    public abstract void mo17832xe05b4124(R r17);

    /* renamed from: onUnresolvableFailure */
    public abstract void m17833xba230dbf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12);
}
