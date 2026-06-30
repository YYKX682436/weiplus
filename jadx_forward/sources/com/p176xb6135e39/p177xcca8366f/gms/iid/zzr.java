package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* loaded from: classes13.dex */
public final class zzr {

    /* renamed from: zzbz */
    private final java.util.concurrent.ScheduledExecutorService f6151x394b98;

    /* renamed from: zzca */
    private com.p176xb6135e39.p177xcca8366f.gms.iid.zzt f6152x394b9e;

    /* renamed from: zzcb */
    private int f6153x394b9f;
    private final android.content.Context zzk;

    public zzr(android.content.Context context) {
        this(context, java.util.concurrent.Executors.newSingleThreadScheduledExecutor());
    }

    private final synchronized int zzq() {
        int i17;
        i17 = this.f6153x394b9f;
        this.f6153x394b9f = i17 + 1;
        return i17;
    }

    private zzr(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f6152x394b9e = new com.p176xb6135e39.p177xcca8366f.gms.iid.zzt(this);
        this.f6153x394b9f = 1;
        this.zzk = context.getApplicationContext();
        this.f6151x394b98 = scheduledExecutorService;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<android.os.Bundle> zzd(int i17, android.os.Bundle bundle) {
        return zzd(new com.p176xb6135e39.p177xcca8366f.gms.iid.C2052x394b61(zzq(), 1, bundle));
    }

    private final synchronized <T> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<T> zzd(com.p176xb6135e39.p177xcca8366f.gms.iid.zzz<T> zzzVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(zzzVar).length() + 9);
        }
        if (!this.f6152x394b9e.zze(zzzVar)) {
            com.p176xb6135e39.p177xcca8366f.gms.iid.zzt zztVar = new com.p176xb6135e39.p177xcca8366f.gms.iid.zzt(this);
            this.f6152x394b9e = zztVar;
            zztVar.zze(zzzVar);
        }
        return zzzVar.f6169x394ba9.m19602xfb859dfb();
    }
}
