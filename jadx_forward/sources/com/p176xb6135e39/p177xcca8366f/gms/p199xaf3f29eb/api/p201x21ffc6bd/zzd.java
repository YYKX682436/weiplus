package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzd extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba {
    private static final java.util.WeakHashMap zza = new java.util.WeakHashMap();
    private final java.util.Map zzb = java.util.Collections.synchronizedMap(new x.b());
    private int zzc = 0;
    private android.os.Bundle zzd;

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzd zzc(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzd zzdVar;
        java.util.WeakHashMap weakHashMap = zza;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) weakHashMap.get(activityC1102x9ee2d9f);
        if (weakReference != null && (zzdVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzd) weakReference.get()) != null) {
            return zzdVar;
        }
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzd zzdVar2 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzd) activityC1102x9ee2d9f.mo7595x9cdc264().m7665x7a44761a("SupportLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.m7489xb226ab8b()) {
                zzdVar2 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzd();
                p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = activityC1102x9ee2d9f.mo7595x9cdc264().m7630xb2c12e75();
                m7630xb2c12e75.h(0, zzdVar2, "SupportLifecycleFragmentImpl", 1);
                m7630xb2c12e75.e();
            }
            weakHashMap.put(activityC1102x9ee2d9f, new java.lang.ref.WeakReference(zzdVar2));
            return zzdVar2;
        } catch (java.lang.ClassCastException e17) {
            throw new java.lang.IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e17);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba
    /* renamed from: addCallback */
    public final void mo17915xbba9cc06(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af c1779x5cd4a1af) {
        if (this.zzb.containsKey(str)) {
            throw new java.lang.IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.zzb.put(str, c1779x5cd4a1af);
        if (this.zzc > 0) {
            new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzi(android.os.Looper.getMainLooper()).post(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzc(this, c1779x5cd4a1af, str));
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: dump */
    public final void mo7426x2f39f4(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.mo7426x2f39f4(str, fileDescriptor, printWriter, strArr);
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) it.next()).mo17906x2f39f4(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba
    /* renamed from: getCallbackOrNull */
    public final <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af> T mo17916x3e046fa5(java.lang.String str, java.lang.Class<T> cls) {
        return cls.cast(this.zzb.get(str));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba
    /* renamed from: getLifecycleActivity */
    public final /* synthetic */ android.app.Activity mo17917x6cd4bbe3() {
        return mo7430x19263085();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba
    /* renamed from: isCreated */
    public final boolean mo17918x1abfc65e() {
        return this.zzc > 0;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba
    /* renamed from: isStarted */
    public final boolean mo17919x6c5c87f7() {
        return this.zzc >= 2;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public final void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo7496x9d4787cb(i17, i18, intent);
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) it.next()).mo17908x9d4787cb(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public final void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        this.zzc = 1;
        this.zzd = bundle;
        for (java.util.Map.Entry entry : this.zzb.entrySet()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) entry.getValue()).mo17909x3e5a77bb(bundle != null ? bundle.getBundle((java.lang.String) entry.getKey()) : null);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public final void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        this.zzc = 5;
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) it.next()).mo17910xac79a11b();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public final void mo7517x57429eec() {
        super.mo7517x57429eec();
        this.zzc = 3;
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) it.next()).mo17911x57429eec();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public final void mo7404xa71a2260(android.os.Bundle bundle) {
        super.mo7404xa71a2260(bundle);
        if (bundle == null) {
            return;
        }
        for (java.util.Map.Entry entry : this.zzb.entrySet()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) entry.getValue()).mo17912xa71a2260(bundle2);
            bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public final void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        this.zzc = 2;
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) it.next()).mo17913xb05099c3();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public final void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        this.zzc = 4;
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) it.next()).mo17914xc39f8281();
        }
    }
}
