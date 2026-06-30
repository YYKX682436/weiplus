package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzaa */
/* loaded from: classes13.dex */
public final class C2479x394b60 extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723 {

    /* renamed from: zzbw */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2 f7540x394b95;

    public C2479x394b60(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(activity, settings);
        this.f7540x394b95 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzo();
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener> c1781xefedf3a0, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener onCapabilityChangedListener, android.content.IntentFilter[] intentFilterArr) {
        return m17748xa3689bc0(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2484x394b65(onCapabilityChangedListener, intentFilterArr, c1781xefedf3a0), new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2485x394b66(onCapabilityChangedListener, c1781xefedf3a0.m17922x2985fbd5()));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723
    /* renamed from: addListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19649x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener onCapabilityChangedListener, android.net.Uri uri, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(onCapabilityChangedListener, "listener must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(uri, "uri must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(i17 == 0 || i17 == 1, "invalid filter type");
        return zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(onCapabilityChangedListener, m17760x23b2dd47(), "CapabilityListener"), onCapabilityChangedListener, new android.content.IntentFilter[]{com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i17)});
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723
    /* renamed from: addLocalCapability */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19651xf67ca002(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "capability must not be null");
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18196x8941d8d4(this.f7540x394b95.mo19640xf67ca002(m17741xb77111ba(), str));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723
    /* renamed from: getAllCapabilities */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06>> mo19652x8a7d45c1(int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7540x394b95.mo19641x8a7d45c1(m17741xb77111ba(), i17), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2481x394b62.f7542x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723
    /* renamed from: getCapability */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06> mo19653xbf8add0e(java.lang.String str, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "capability must not be null");
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7540x394b95.mo19642xbf8add0e(m17741xb77111ba(), str, i17), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2480x394b61.f7541x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723
    /* renamed from: removeListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo19654xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener onCapabilityChangedListener) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(onCapabilityChangedListener, "listener must not be null");
        return m17750x3ea49d87(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(onCapabilityChangedListener, m17760x23b2dd47(), "CapabilityListener").m17922x2985fbd5());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723
    /* renamed from: removeLocalCapability */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19656xd47cfdbf(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "capability must not be null");
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18196x8941d8d4(this.f7540x394b95.mo19645xd47cfdbf(m17741xb77111ba(), str));
    }

    public C2479x394b60(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(context, settings);
        this.f7540x394b95 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzo();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723
    /* renamed from: addListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19650x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener onCapabilityChangedListener, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(onCapabilityChangedListener, "listener must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "capability must not be null");
        android.content.IntentFilter zzc = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zzc("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (!str.startsWith("/")) {
            str = str.length() != 0 ? "/".concat(str) : new java.lang.String("/");
        }
        zzc.addDataPath(str, 0);
        android.content.IntentFilter[] intentFilterArr = {zzc};
        android.os.Looper m17760x23b2dd47 = m17760x23b2dd47();
        java.lang.String valueOf = java.lang.String.valueOf(str);
        return zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(onCapabilityChangedListener, m17760x23b2dd47, valueOf.length() != 0 ? "CapabilityListener:".concat(valueOf) : new java.lang.String("CapabilityListener:")), new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2483x394b64(onCapabilityChangedListener, str), intentFilterArr);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723
    /* renamed from: removeListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo19655xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener onCapabilityChangedListener, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(onCapabilityChangedListener, "listener must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "capability must not be null");
        if (!str.startsWith("/")) {
            str = str.length() != 0 ? "/".concat(str) : new java.lang.String("/");
        }
        android.os.Looper m17760x23b2dd47 = m17760x23b2dd47();
        java.lang.String valueOf = java.lang.String.valueOf(str);
        return m17750x3ea49d87(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(onCapabilityChangedListener, m17760x23b2dd47, valueOf.length() != 0 ? "CapabilityListener:".concat(valueOf) : new java.lang.String("CapabilityListener:")).m17922x2985fbd5());
    }
}
