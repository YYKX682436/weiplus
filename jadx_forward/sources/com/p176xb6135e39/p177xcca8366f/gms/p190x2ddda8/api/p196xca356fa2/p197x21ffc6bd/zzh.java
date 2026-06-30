package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzh extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1910x95bf6258<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzv> {

    /* renamed from: zzev */
    private final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 f5696x394bf1;

    public zzh(android.content.Context context, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, c1904x2257e52e, connectionCallbacks, onConnectionFailedListener);
        c1682x64d992a3 = c1682x64d992a3 == null ? new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder().m17523x59bc66e() : c1682x64d992a3;
        if (!c1904x2257e52e.m18139x53ef4fc2().isEmpty()) {
            com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder builder = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder(c1682x64d992a3);
            java.util.Iterator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> it = c1904x2257e52e.m18139x53ef4fc2().iterator();
            while (it.hasNext()) {
                builder.m17528x52b6040e(it.next(), new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[0]);
            }
            c1682x64d992a3 = builder.m17523x59bc66e();
        }
        this.f5696x394bf1 = c1682x64d992a3;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: createServiceInterface */
    public final /* synthetic */ android.os.IInterface mo17559xa50fef20(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzv ? (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzv) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzw(iBinder);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getMinApkVersion */
    public final int mo17560x352ce358() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.f5840x7aedca50;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getServiceDescriptor */
    public final java.lang.String mo17561x83e1df4e() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getSignInIntent */
    public final android.content.Intent mo17562xc37ac774() {
        return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.zzd(m18099x76847179(), this.f5696x394bf1);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getStartServiceAction */
    public final java.lang.String mo17563x572a11ff() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: providesSignIn */
    public final boolean mo17564x6e8aa054() {
        return true;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 zzn() {
        return this.f5696x394bf1;
    }
}
