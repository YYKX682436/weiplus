package com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f;

/* renamed from: com.google.android.gms.dynamic.FragmentWrapper */
/* loaded from: classes13.dex */
public final class BinderC2027xeefdb803 extends com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a.Stub {

    /* renamed from: _hellAccFlag_ */
    private byte f6010x7f11beae;
    private final android.app.Fragment zza;

    private BinderC2027xeefdb803(android.app.Fragment fragment) {
        this.zza = fragment;
    }

    /* renamed from: wrap */
    public static com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2027xeefdb803 m18669x37d04a(android.app.Fragment fragment) {
        if (fragment != null) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2027xeefdb803(fragment);
        }
        return null;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final boolean zzA() {
        return this.zza.isVisible();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final int zzb() {
        return this.zza.getId();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final int zzc() {
        return this.zza.getTargetRequestCode();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final android.os.Bundle zzd() {
        return this.zza.getArguments();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a zze() {
        return m18669x37d04a(this.zza.getParentFragment());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a zzf() {
        return m18669x37d04a(this.zza.getTargetFragment());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b zzg() {
        return com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(this.zza.getActivity());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b zzh() {
        return com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(this.zza.getResources());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b zzi() {
        return com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(this.zza.getView());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final java.lang.String zzj() {
        return this.zza.getTag();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final void zzk(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b interfaceC2029x272bd28b) {
        android.view.View view = (android.view.View) com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18683xcdecea63(interfaceC2029x272bd28b);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(view);
        this.zza.registerForContextMenu(view);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final void zzl(boolean z17) {
        this.zza.setHasOptionsMenu(z17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final void zzm(boolean z17) {
        this.zza.setMenuVisibility(z17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final void zzn(boolean z17) {
        this.zza.setRetainInstance(z17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final void zzo(boolean z17) {
        this.zza.setUserVisibleHint(z17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final void zzp(android.content.Intent intent) {
        android.app.Fragment fragment = this.zza;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(fragment, arrayList.toArray(), "com/google/android/gms/dynamic/FragmentWrapper", "zzp", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fragment.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(fragment, "com/google/android/gms/dynamic/FragmentWrapper", "zzp", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final void zzq(android.content.Intent intent, int i17) {
        this.zza.startActivityForResult(intent, i17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final void zzr(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b interfaceC2029x272bd28b) {
        android.view.View view = (android.view.View) com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18683xcdecea63(interfaceC2029x272bd28b);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(view);
        this.zza.unregisterForContextMenu(view);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final boolean zzs() {
        return this.zza.getRetainInstance();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final boolean zzt() {
        return this.zza.getUserVisibleHint();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final boolean zzu() {
        return this.zza.isAdded();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final boolean zzv() {
        return this.zza.isDetached();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final boolean zzw() {
        return this.zza.isHidden();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final boolean zzx() {
        return this.zza.isInLayout();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final boolean zzy() {
        return this.zza.isRemoving();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2028x4195fc9a
    public final boolean zzz() {
        return this.zza.isResumed();
    }
}
