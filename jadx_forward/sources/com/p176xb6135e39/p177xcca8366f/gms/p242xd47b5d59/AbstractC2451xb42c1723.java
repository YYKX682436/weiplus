package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.CapabilityClient */
/* loaded from: classes13.dex */
public abstract class AbstractC2451xb42c1723 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2475xd855c179.WearableOptions> {

    /* renamed from: ACTION_CAPABILITY_CHANGED */
    public static final java.lang.String f7466xd135db16 = "com.google.android.gms.wearable.CAPABILITY_CHANGED";

    /* renamed from: FILTER_ALL */
    public static final int f7467xc06b703a = 0;

    /* renamed from: FILTER_LITERAL */
    public static final int f7468x1bc1ac8 = 0;

    /* renamed from: FILTER_PREFIX */
    public static final int f7469x30a40d39 = 1;

    /* renamed from: FILTER_REACHABLE */
    public static final int f7470x6c295126 = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.CapabilityClient$CapabilityFilterType */
    /* loaded from: classes6.dex */
    public @interface CapabilityFilterType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.CapabilityClient$NodeFilterType */
    /* loaded from: classes6.dex */
    public @interface NodeFilterType {
    }

    /* renamed from: com.google.android.gms.wearable.CapabilityClient$OnCapabilityChangedListener */
    /* loaded from: classes13.dex */
    public interface OnCapabilityChangedListener extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener {
        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener
        /* renamed from: onCapabilityChanged */
        void mo19646x6da6365d(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06 interfaceC2452xeb6b7e06);
    }

    public AbstractC2451xb42c1723(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(activity, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44>) com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2475xd855c179.API, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44) null, settings);
    }

    /* renamed from: addListener */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19649x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener onCapabilityChangedListener, android.net.Uri uri, int i17);

    /* renamed from: addListener */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19650x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener onCapabilityChangedListener, java.lang.String str);

    /* renamed from: addLocalCapability */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19651xf67ca002(java.lang.String str);

    /* renamed from: getAllCapabilities */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06>> mo19652x8a7d45c1(int i17);

    /* renamed from: getCapability */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06> mo19653xbf8add0e(java.lang.String str, int i17);

    /* renamed from: removeListener */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo19654xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener onCapabilityChangedListener);

    /* renamed from: removeListener */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo19655xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2451xb42c1723.OnCapabilityChangedListener onCapabilityChangedListener, java.lang.String str);

    /* renamed from: removeLocalCapability */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19656xd47cfdbf(java.lang.String str);

    public AbstractC2451xb42c1723(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(context, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2475xd855c179.API, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44) null, settings);
    }
}
