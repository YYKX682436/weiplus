package com.google.android.gms.dynamic;

/* loaded from: classes13.dex */
public final class SupportFragmentWrapper extends com.google.android.gms.dynamic.IFragmentWrapper.Stub {
    private byte _hellAccFlag_;
    private final androidx.fragment.app.Fragment zza;

    private SupportFragmentWrapper(androidx.fragment.app.Fragment fragment) {
        this.zza = fragment;
    }

    public static com.google.android.gms.dynamic.SupportFragmentWrapper wrap(androidx.fragment.app.Fragment fragment) {
        if (fragment != null) {
            return new com.google.android.gms.dynamic.SupportFragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzA() {
        return this.zza.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzb() {
        return this.zza.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzc() {
        return this.zza.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final android.os.Bundle zzd() {
        return this.zza.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IFragmentWrapper zze() {
        return wrap(this.zza.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IFragmentWrapper zzf() {
        return wrap(this.zza.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzg() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzh() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzi() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final java.lang.String zzj() {
        return this.zza.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        android.view.View view = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(view);
        this.zza.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzl(boolean z17) {
        this.zza.setHasOptionsMenu(z17);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzm(boolean z17) {
        this.zza.setMenuVisibility(z17);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzn(boolean z17) {
        this.zza.setRetainInstance(z17);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzo(boolean z17) {
        this.zza.setUserVisibleHint(z17);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzp(android.content.Intent intent) {
        androidx.fragment.app.Fragment fragment = this.zza;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(fragment, arrayList.toArray(), "com/google/android/gms/dynamic/SupportFragmentWrapper", "zzp", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fragment.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(fragment, "com/google/android/gms/dynamic/SupportFragmentWrapper", "zzp", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzq(android.content.Intent intent, int i17) {
        this.zza.startActivityForResult(intent, i17);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        android.view.View view = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(view);
        this.zza.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        return this.zza.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzt() {
        return this.zza.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzu() {
        return this.zza.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzv() {
        return this.zza.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzw() {
        return this.zza.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzx() {
        return this.zza.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzy() {
        return this.zza.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzz() {
        return this.zza.isResumed();
    }
}
