package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.wearable.CapabilityApi */
/* loaded from: classes13.dex */
public interface InterfaceC2450x72f2d5c2 {

    /* renamed from: ACTION_CAPABILITY_CHANGED */
    public static final java.lang.String f7461xd135db16 = "com.google.android.gms.wearable.CAPABILITY_CHANGED";

    /* renamed from: FILTER_ALL */
    public static final int f7462xc06b703a = 0;

    /* renamed from: FILTER_LITERAL */
    public static final int f7463x1bc1ac8 = 0;

    /* renamed from: FILTER_PREFIX */
    public static final int f7464x30a40d39 = 1;

    /* renamed from: FILTER_REACHABLE */
    public static final int f7465x6c295126 = 1;

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.CapabilityApi$AddLocalCapabilityResult */
    /* loaded from: classes13.dex */
    public interface AddLocalCapabilityResult extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.CapabilityApi$CapabilityFilterType */
    /* loaded from: classes6.dex */
    public @interface CapabilityFilterType {
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.CapabilityApi$CapabilityListener */
    /* loaded from: classes13.dex */
    public interface CapabilityListener {
        /* renamed from: onCapabilityChanged */
        void mo19646x6da6365d(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06 interfaceC2452xeb6b7e06);
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.CapabilityApi$GetAllCapabilitiesResult */
    /* loaded from: classes13.dex */
    public interface GetAllCapabilitiesResult extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d {
        /* renamed from: getAllCapabilities */
        java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06> mo19647x8a7d45c1();
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.CapabilityApi$GetCapabilityResult */
    /* loaded from: classes13.dex */
    public interface GetCapabilityResult extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d {
        /* renamed from: getCapability */
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2452xeb6b7e06 mo19648xbf8add0e();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.CapabilityApi$NodeFilterType */
    /* loaded from: classes6.dex */
    public @interface NodeFilterType {
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.CapabilityApi$RemoveLocalCapabilityResult */
    /* loaded from: classes13.dex */
    public interface RemoveLocalCapabilityResult extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d {
    }

    /* renamed from: addCapabilityListener */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19638xb55646d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener capabilityListener, java.lang.String str);

    /* renamed from: addListener */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19639x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener capabilityListener, android.net.Uri uri, int i17);

    /* renamed from: addLocalCapability */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.AddLocalCapabilityResult> mo19640xf67ca002(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, java.lang.String str);

    /* renamed from: getAllCapabilities */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.GetAllCapabilitiesResult> mo19641x8a7d45c1(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, int i17);

    /* renamed from: getCapability */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.GetCapabilityResult> mo19642xbf8add0e(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, java.lang.String str, int i17);

    /* renamed from: removeCapabilityListener */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19643x97f1d190(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener capabilityListener, java.lang.String str);

    /* renamed from: removeListener */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19644xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.CapabilityListener capabilityListener);

    /* renamed from: removeLocalCapability */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2450x72f2d5c2.RemoveLocalCapabilityResult> mo19645xd47cfdbf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, java.lang.String str);
}
