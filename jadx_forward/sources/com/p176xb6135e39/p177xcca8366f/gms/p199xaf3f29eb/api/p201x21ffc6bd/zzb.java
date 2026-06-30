package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzb extends android.app.Fragment implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba {
    private static final java.util.WeakHashMap zza = new java.util.WeakHashMap();
    private final java.util.Map zzb = java.util.Collections.synchronizedMap(new x.b());
    private int zzc = 0;
    private android.os.Bundle zzd;

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzb zzc(android.app.Activity activity) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzb zzbVar;
        java.util.WeakHashMap weakHashMap = zza;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzbVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzb) weakReference.get()) != null) {
            return zzbVar;
        }
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzb zzbVar2 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzbVar2 == null || zzbVar2.isRemoving()) {
                zzbVar2 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzb();
                activity.getFragmentManager().beginTransaction().add(zzbVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new java.lang.ref.WeakReference(zzbVar2));
            return zzbVar2;
        } catch (java.lang.ClassCastException e17) {
            throw new java.lang.IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e17);
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
            new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzi(android.os.Looper.getMainLooper()).post(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zza(this, c1779x5cd4a1af, str));
        }
    }

    @Override // android.app.Fragment
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
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
    public final android.app.Activity mo17917x6cd4bbe3() {
        return getActivity();
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

    @Override // android.app.Fragment
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) it.next()).mo17908x9d4787cb(i17, i18, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zzc = 1;
        this.zzd = bundle;
        for (java.util.Map.Entry entry : this.zzb.entrySet()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) entry.getValue()).mo17909x3e5a77bb(bundle != null ? bundle.getBundle((java.lang.String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.zzc = 5;
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) it.next()).mo17910xac79a11b();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzc = 3;
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) it.next()).mo17911x57429eec();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (java.util.Map.Entry entry : this.zzb.entrySet()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) entry.getValue()).mo17912xa71a2260(bundle2);
            bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.zzc = 2;
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) it.next()).mo17913xb05099c3();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.zzc = 4;
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af) it.next()).mo17914xc39f8281();
        }
    }
}
