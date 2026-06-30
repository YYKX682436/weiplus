package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzo implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2 {
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener capabilityListener, android.content.IntentFilter[] intentFilterArr) {
        return com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzb.zza(abstractC1748xd28d482c, new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzt(intentFilterArr), capabilityListener);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2
    /* renamed from: addCapabilityListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19638xb55646d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener capabilityListener, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(str, "capability must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzv zzvVar = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzv(capabilityListener, str);
        android.content.IntentFilter zzc = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zzc("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (!str.startsWith("/")) {
            str = str.length() != 0 ? "/".concat(str) : new java.lang.String("/");
        }
        zzc.addDataPath(str, 0);
        return zza(abstractC1748xd28d482c, zzvVar, new android.content.IntentFilter[]{zzc});
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2
    /* renamed from: addListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19639x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener capabilityListener, android.net.Uri uri, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(uri, "uri must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(i17 == 0 || i17 == 1, "invalid filter type");
        return zza(abstractC1748xd28d482c, capabilityListener, new android.content.IntentFilter[]{com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i17)});
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2
    /* renamed from: addLocalCapability */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.AddLocalCapabilityResult> mo19640xf67ca002(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, java.lang.String str) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzr(this, abstractC1748xd28d482c, str));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2
    /* renamed from: getAllCapabilities */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.GetAllCapabilitiesResult> mo19641x8a7d45c1(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, int i17) {
        boolean z17 = true;
        if (i17 != 0 && i17 != 1) {
            z17 = false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18197x312c1fe5(z17);
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzq(this, abstractC1748xd28d482c, i17));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2
    /* renamed from: getCapability */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.GetCapabilityResult> mo19642xbf8add0e(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, java.lang.String str, int i17) {
        boolean z17 = true;
        if (i17 != 0 && i17 != 1) {
            z17 = false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18197x312c1fe5(z17);
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzp(this, abstractC1748xd28d482c, str, i17));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2
    /* renamed from: removeCapabilityListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19643x97f1d190(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener capabilityListener, java.lang.String str) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzz(abstractC1748xd28d482c, new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzv(capabilityListener, str), null));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2
    /* renamed from: removeListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19644xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener capabilityListener) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzz(abstractC1748xd28d482c, capabilityListener, null));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2
    /* renamed from: removeLocalCapability */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.RemoveLocalCapabilityResult> mo19645xd47cfdbf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, java.lang.String str) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzs(this, abstractC1748xd28d482c, str));
    }
}
