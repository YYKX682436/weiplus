package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public final class zzd extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment implements com.google.android.gms.common.api.internal.LifecycleFragment {
    private static final java.util.WeakHashMap zza = new java.util.WeakHashMap();
    private final java.util.Map zzb = java.util.Collections.synchronizedMap(new x.b());
    private int zzc = 0;
    private android.os.Bundle zzd;

    public static com.google.android.gms.common.api.internal.zzd zzc(androidx.fragment.app.FragmentActivity fragmentActivity) {
        com.google.android.gms.common.api.internal.zzd zzdVar;
        java.util.WeakHashMap weakHashMap = zza;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (zzdVar = (com.google.android.gms.common.api.internal.zzd) weakReference.get()) != null) {
            return zzdVar;
        }
        try {
            com.google.android.gms.common.api.internal.zzd zzdVar2 = (com.google.android.gms.common.api.internal.zzd) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new com.google.android.gms.common.api.internal.zzd();
                androidx.fragment.app.i2 beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
                beginTransaction.h(0, zzdVar2, "SupportLifecycleFragmentImpl", 1);
                beginTransaction.e();
            }
            weakHashMap.put(fragmentActivity, new java.lang.ref.WeakReference(zzdVar2));
            return zzdVar2;
        } catch (java.lang.ClassCastException e17) {
            throw new java.lang.IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e17);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback) {
        if (this.zzb.containsKey(str)) {
            throw new java.lang.IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.zzb.put(str, lifecycleCallback);
        if (this.zzc > 0) {
            new com.google.android.gms.internal.common.zzi(android.os.Looper.getMainLooper()).post(new com.google.android.gms.common.api.internal.zzc(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(java.lang.String str, java.lang.Class<T> cls) {
        return cls.cast(this.zzb.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final /* synthetic */ android.app.Activity getLifecycleActivity() {
        return getActivity();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
        return this.zzc > 0;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
        return this.zzc >= 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onActivityResult(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zzc = 1;
        this.zzd = bundle;
        for (java.util.Map.Entry entry : this.zzb.entrySet()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((java.lang.String) entry.getKey()) : null);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.zzc = 5;
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzc = 3;
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (java.util.Map.Entry entry : this.zzb.entrySet()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.zzc = 2;
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.zzc = 4;
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onStop();
        }
    }
}
