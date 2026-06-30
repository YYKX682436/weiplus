package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8;

/* loaded from: classes13.dex */
public final class zzu extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1910x95bf6258<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.p191xb9d38a2d.zzf> {
    public zzu(android.content.Context context, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 120, c1904x2257e52e, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: createServiceInterface */
    public final /* synthetic */ android.os.IInterface mo17559xa50fef20(android.os.IBinder iBinder) {
        return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.p191xb9d38a2d.zzg.zzf(iBinder);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getMinApkVersion */
    public final int mo17560x352ce358() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.f5840x7aedca50;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getServiceDescriptor */
    public final java.lang.String mo17561x83e1df4e() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getStartServiceAction */
    public final java.lang.String mo17563x572a11ff() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }
}
