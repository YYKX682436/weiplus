package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.LifecycleCallback */
/* loaded from: classes13.dex */
public class C1779x5cd4a1af {

    /* renamed from: mLifecycleFragment */
    protected final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba f5910xb6d8aaed;

    public C1779x5cd4a1af(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba interfaceC1780x4bb63ba) {
        this.f5910xb6d8aaed = interfaceC1780x4bb63ba;
    }

    /* renamed from: getChimeraLifecycleFragmentImpl */
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba m17902xdc648fe5(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1778x4647479 c1778x4647479) {
        throw new java.lang.IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: getFragment */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba m17903x197d1fc6(android.app.Activity activity) {
        return m17905x197d1fc6(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1778x4647479(activity));
    }

    /* renamed from: dump */
    public void mo17906x2f39f4(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    /* renamed from: getActivity */
    public android.app.Activity m17907x19263085() {
        android.app.Activity mo17917x6cd4bbe3 = this.f5910xb6d8aaed.mo17917x6cd4bbe3();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(mo17917x6cd4bbe3);
        return mo17917x6cd4bbe3;
    }

    /* renamed from: onActivityResult */
    public void mo17908x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    /* renamed from: onCreate */
    public void mo17909x3e5a77bb(android.os.Bundle bundle) {
    }

    /* renamed from: onDestroy */
    public void mo17910xac79a11b() {
    }

    /* renamed from: onResume */
    public void mo17911x57429eec() {
    }

    /* renamed from: onSaveInstanceState */
    public void mo17912xa71a2260(android.os.Bundle bundle) {
    }

    /* renamed from: onStart */
    public void mo17913xb05099c3() {
    }

    /* renamed from: onStop */
    public void mo17914xc39f8281() {
    }

    /* renamed from: getFragment */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba m17904x197d1fc6(android.content.ContextWrapper contextWrapper) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: getFragment */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba m17905x197d1fc6(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1778x4647479 c1778x4647479) {
        if (c1778x4647479.zzd()) {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzd.zzc(c1778x4647479.zzb());
        }
        if (c1778x4647479.zzc()) {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zzb.zzc(c1778x4647479.zza());
        }
        throw new java.lang.IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
