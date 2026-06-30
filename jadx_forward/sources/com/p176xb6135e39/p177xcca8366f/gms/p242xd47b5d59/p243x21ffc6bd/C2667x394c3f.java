package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzhg */
/* loaded from: classes13.dex */
public final class C2667x394c3f extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1910x95bf6258<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2598x394beb> {

    /* renamed from: zzew */
    private final java.util.concurrent.ExecutorService f7767x394bf2;

    /* renamed from: zzex */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<java.lang.Object> f7768x394bf3;

    /* renamed from: zzey */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<java.lang.Object> f7769x394bf4;

    /* renamed from: zzez */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener> f7770x394bf5;

    /* renamed from: zzfa */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener> f7771x394bfb;

    /* renamed from: zzfb */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener> f7772x394bfc;

    /* renamed from: zzfc */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<java.lang.Object> f7773x394bfd;

    /* renamed from: zzfd */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<java.lang.Object> f7774x394bfe;

    /* renamed from: zzfe */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener> f7775x394bff;

    /* renamed from: zzff */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2676x394c48 f7776x394c00;

    public C2667x394c3f(android.content.Context context, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e) {
        this(context, looper, connectionCallbacks, onConnectionFailedListener, c1904x2257e52e, java.util.concurrent.Executors.newCachedThreadPool(), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2676x394c48.zza(context));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: connect */
    public final void mo17707x38b478ea(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        if (!mo17722xb7ac48d9()) {
            try {
                android.os.Bundle bundle = m18099x76847179().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if ((bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0) < com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.f5827x7aedca50) {
                    android.content.Context m18099x76847179 = m18099x76847179();
                    android.content.Context m18099x768471792 = m18099x76847179();
                    android.content.Intent intent = new android.content.Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (m18099x768471792.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("market://details").buildUpon().appendQueryParameter(dm.i4.f66865x76d1ec5a, "com.google.android.wearable.app.cn").build());
                    }
                    m18124xefed530e(connectionProgressReportCallbacks, 6, android.app.PendingIntent.getActivity(m18099x76847179, 0, intent, 0));
                    return;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                m18124xefed530e(connectionProgressReportCallbacks, 16, null);
                return;
            }
        }
        super.mo17707x38b478ea(connectionProgressReportCallbacks);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: createServiceInterface */
    public final /* synthetic */ android.os.IInterface mo17559xa50fef20(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2598x394beb ? (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2598x394beb) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2599x394bec(iBinder);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getMinApkVersion */
    public final int mo17560x352ce358() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.f5840x7aedca50;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getServiceDescriptor */
    public final java.lang.String mo17561x83e1df4e() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getStartServiceAction */
    public final java.lang.String mo17563x572a11ff() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getStartServicePackage */
    public final java.lang.String mo18110xa33d199d() {
        return this.f7776x394c00.zze("com.google.android.wearable.app.cn") ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: onPostInitHandler */
    public final void mo18119x66ce737b(int i17, android.os.IBinder iBinder, android.os.Bundle bundle, int i18) {
        android.util.Log.isLoggable("WearableClient", 2);
        if (i17 == 0) {
            this.f7768x394bf3.zza(iBinder);
            this.f7769x394bf4.zza(iBinder);
            this.f7770x394bf5.zza(iBinder);
            this.f7771x394bfb.zza(iBinder);
            this.f7772x394bfc.zza(iBinder);
            this.f7773x394bfd.zza(iBinder);
            this.f7774x394bfe.zza(iBinder);
            this.f7775x394bff.zza(iBinder);
        }
        super.mo18119x66ce737b(i17, iBinder, bundle, i18);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: requiresGooglePlayServices */
    public final boolean mo17722xb7ac48d9() {
        return !this.f7776x394c00.zze("com.google.android.wearable.app.cn");
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.GetFdForAssetResult> resultHolder, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 c2449x3c9fad0) {
        ((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2598x394beb) m18108xb411027f()).zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2658x394c31(resultHolder), c2449x3c9fad0);
    }

    private C2667x394c3f(android.content.Context context, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, java.util.concurrent.ExecutorService executorService, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2676x394c48 c2676x394c48) {
        super(context, looper, 14, c1904x2257e52e, connectionCallbacks, onConnectionFailedListener);
        this.f7768x394bf3 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<>();
        this.f7769x394bf4 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<>();
        this.f7770x394bf5 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<>();
        this.f7771x394bfb = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<>();
        this.f7772x394bfc = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<>();
        this.f7773x394bfd = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<>();
        this.f7774x394bfe = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<>();
        this.f7775x394bff = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2600x394bed<>();
        this.f7767x394bf2 = (java.util.concurrent.ExecutorService) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(executorService);
        this.f7776x394c00 = c2676x394c48;
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener capabilityListener) {
        this.f7775x394bff.zza(this, resultHolder, capabilityListener);
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener capabilityListener, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener> c1781xefedf3a0, android.content.IntentFilter[] intentFilterArr) {
        this.f7775x394bff.zza(this, resultHolder, capabilityListener, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43.zzd(c1781xefedf3a0, intentFilterArr));
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener channelListener, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener> c1781xefedf3a0, java.lang.String str, android.content.IntentFilter[] intentFilterArr) {
        if (str == null) {
            this.f7770x394bf5.zza(this, resultHolder, channelListener, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43.zzc(c1781xefedf3a0, intentFilterArr));
        } else {
            this.f7770x394bf5.zza(this, resultHolder, new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2637x394c1c(str, channelListener), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43.zza(c1781xefedf3a0, str, intentFilterArr));
        }
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener channelListener, java.lang.String str) {
        if (str == null) {
            this.f7770x394bf5.zza(this, resultHolder, channelListener);
        } else {
            this.f7770x394bf5.zza(this, resultHolder, new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2637x394c1c(str, channelListener));
        }
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener dataListener) {
        this.f7771x394bfb.zza(this, resultHolder, dataListener);
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener dataListener, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener> c1781xefedf3a0, android.content.IntentFilter[] intentFilterArr) {
        this.f7771x394bfb.zza(this, resultHolder, dataListener, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43.zza(c1781xefedf3a0, intentFilterArr));
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener messageListener) {
        this.f7772x394bfc.zza(this, resultHolder, messageListener);
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener messageListener, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener> c1781xefedf3a0, android.content.IntentFilter[] intentFilterArr) {
        this.f7772x394bfc.zza(this, resultHolder, messageListener, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43.zzb(c1781xefedf3a0, intentFilterArr));
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataItemResult> resultHolder, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 c2474x601f1916) {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0>> it = c2474x601f1916.m19834x11279679().entrySet().iterator();
        while (it.hasNext()) {
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 value = it.next().getValue();
            if (value.m19632xfb7e5820() == null && value.m19633x15b3c0ba() == null && value.m19634x5db1ab4() == null && value.m19635xb5887636() == null) {
                java.lang.String valueOf = java.lang.String.valueOf(c2474x601f1916.m19836xb5887636());
                java.lang.String valueOf2 = java.lang.String.valueOf(value);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 33 + valueOf2.length());
                sb6.append("Put for ");
                sb6.append(valueOf);
                sb6.append(" contains invalid asset: ");
                sb6.append(valueOf2);
                throw new java.lang.IllegalArgumentException(sb6.toString());
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 zza = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916.zza(c2474x601f1916.m19836xb5887636());
        zza.m19841x76491f2c(c2474x601f1916.m19835xfb7e5820());
        if (c2474x601f1916.m19838xf64ac50b()) {
            zza.m19842x266a2a43();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0> entry : c2474x601f1916.m19834x11279679().entrySet()) {
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 value2 = entry.getValue();
            if (value2.m19632xfb7e5820() != null) {
                try {
                    android.os.ParcelFileDescriptor[] createPipe = android.os.ParcelFileDescriptor.createPipe();
                    if (android.util.Log.isLoggable("WearableClient", 3)) {
                        new java.lang.StringBuilder(java.lang.String.valueOf(value2).length() + 61 + java.lang.String.valueOf(createPipe[0]).length() + java.lang.String.valueOf(createPipe[1]).length());
                    }
                    zza.m19839x6978d921(entry.getKey(), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0.m19628x453dbe24(createPipe[0]));
                    java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.CallableC2668x394c40(this, createPipe[1], value2.m19632xfb7e5820()));
                    arrayList.add(futureTask);
                    this.f7767x394bf2.submit(futureTask);
                } catch (java.io.IOException e17) {
                    java.lang.String valueOf3 = java.lang.String.valueOf(c2474x601f1916);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf3.length() + 60);
                    sb7.append("Unable to create ParcelFileDescriptor for asset in request: ");
                    sb7.append(valueOf3);
                    throw new java.lang.IllegalStateException(sb7.toString(), e17);
                }
            } else if (value2.m19635xb5887636() != null) {
                try {
                    zza.m19839x6978d921(entry.getKey(), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0.m19628x453dbe24(m18099x76847179().getContentResolver().openFileDescriptor(value2.m19635xb5887636(), "r")));
                } catch (java.io.FileNotFoundException unused) {
                    new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2662x394c3a(resultHolder, arrayList).zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2629x394c0f(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7528x16eb0541, null));
                    new java.lang.StringBuilder(java.lang.String.valueOf(value2.m19635xb5887636()).length() + 28);
                    return;
                }
            } else {
                zza.m19839x6978d921(entry.getKey(), value2);
            }
        }
        ((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2598x394beb) m18108xb411027f()).zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2662x394c3a(resultHolder, arrayList), zza);
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder, java.lang.String str, android.net.Uri uri, long j17, long j18) {
        try {
            java.util.concurrent.ExecutorService executorService = this.f7767x394bf2;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(resultHolder);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(uri);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18199x312c1fe5(j17 >= 0, "startOffset is negative: %s", java.lang.Long.valueOf(j17));
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18199x312c1fe5(j18 >= -1, "invalid length: %s", java.lang.Long.valueOf(j18));
            executorService.execute(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.RunnableC2670x394c42(this, uri, resultHolder, str, j17, j18));
        } catch (java.lang.RuntimeException e17) {
            resultHolder.mo17877x921f43c(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(8));
            throw e17;
        }
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder, java.lang.String str, android.net.Uri uri, boolean z17) {
        try {
            java.util.concurrent.ExecutorService executorService = this.f7767x394bf2;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(resultHolder);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(uri);
            executorService.execute(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.RunnableC2669x394c41(this, uri, resultHolder, z17, str));
        } catch (java.lang.RuntimeException e17) {
            resultHolder.mo17877x921f43c(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(8));
            throw e17;
        }
    }
}
