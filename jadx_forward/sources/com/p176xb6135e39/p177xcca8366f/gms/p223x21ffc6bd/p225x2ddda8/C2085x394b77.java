package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8;

/* renamed from: com.google.android.gms.internal.auth.zzax */
/* loaded from: classes13.dex */
public final class C2085x394b77 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1910x95bf6258<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.InterfaceC2090x394b81> {

    /* renamed from: zzdv */
    private final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.C1645x1f51c8.AuthCredentialsOptions f6189x394bd2;

    public C2085x394b77(android.content.Context context, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.C1645x1f51c8.AuthCredentialsOptions authCredentialsOptions, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, c1904x2257e52e, connectionCallbacks, onConnectionFailedListener);
        this.f6189x394bd2 = authCredentialsOptions;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: createServiceInterface */
    public final /* synthetic */ android.os.IInterface mo17559xa50fef20(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.InterfaceC2090x394b81 ? (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.InterfaceC2090x394b81) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.C2091x394b82(iBinder);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getGetServiceRequestExtraArgs */
    public final android.os.Bundle mo18102x97bc63d3() {
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.C1645x1f51c8.AuthCredentialsOptions authCredentialsOptions = this.f6189x394bd2;
        return authCredentialsOptions == null ? new android.os.Bundle() : authCredentialsOptions.m17333x792022dd();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getMinApkVersion */
    public final int mo17560x352ce358() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.f5840x7aedca50;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getServiceDescriptor */
    public final java.lang.String mo17561x83e1df4e() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getStartServiceAction */
    public final java.lang.String mo17563x572a11ff() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.C1645x1f51c8.AuthCredentialsOptions zzk() {
        return this.f6189x394bd2;
    }
}
