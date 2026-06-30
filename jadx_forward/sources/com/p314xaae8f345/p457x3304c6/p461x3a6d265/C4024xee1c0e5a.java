package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJCamTemplateInfo */
/* loaded from: classes5.dex */
public class C4024xee1c0e5a {

    /* renamed from: hasAIGCFeature */
    private final boolean f15904x8553e878;

    /* renamed from: hasARFeature */
    private final boolean f15905x5c2c5c2b;

    /* renamed from: isAsyncAIGCEnabled */
    private final boolean f15906x80c6e4eb;

    /* renamed from: isOSTEnabled */
    private final boolean f15907x989de2db;

    /* renamed from: isStaticContentTemplate */
    private final boolean f15908x3e595cbb;

    /* renamed from: isUseFrontCamera */
    private final boolean f15909xead70a71;

    /* renamed from: maxRecordingDuration */
    private final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f15910xab943da1;

    /* renamed from: minRecordingDuration */
    private final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f15911x6b347673;

    /* renamed from: musicInfos */
    private final java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356> f15912xd0496260;

    /* renamed from: supportedImportedAssetCount */
    private final int f15913x9f9df71;

    public C4024xee1c0e5a(boolean z17, boolean z18, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2, int i17, boolean z19, java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356> list) {
        this.f15909xead70a71 = z17;
        this.f15907x989de2db = z18;
        this.f15911x6b347673 = c4128x879fba0a;
        this.f15910xab943da1 = c4128x879fba0a2;
        this.f15913x9f9df71 = i17;
        this.f15904x8553e878 = z19;
        this.f15906x80c6e4eb = false;
        this.f15905x5c2c5c2b = false;
        this.f15908x3e595cbb = false;
        this.f15912xd0496260 = list;
    }

    /* renamed from: getMaxRecordingDuration */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m32763x595ffa17() {
        return this.f15910xab943da1;
    }

    /* renamed from: getMinRecordingDuration */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m32764x190032e9() {
        return this.f15911x6b347673;
    }

    /* renamed from: getMusicInfos */
    public java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356> m32765xbe8a1a56() {
        return this.f15912xd0496260;
    }

    /* renamed from: getSupportedImportedAssetCount */
    public int m32766x908d523b() {
        return this.f15913x9f9df71;
    }

    /* renamed from: isAsyncAIGCEnabled */
    public boolean m32767x80c6e4eb() {
        return this.f15906x80c6e4eb;
    }

    /* renamed from: isHasAIGCFeature */
    public boolean m32768x2bff7042() {
        return this.f15904x8553e878;
    }

    /* renamed from: isHasARFeature */
    public boolean m32769x2ecb4e75() {
        return this.f15905x5c2c5c2b;
    }

    /* renamed from: isOSTEnabled */
    public boolean m32770x989de2db() {
        return this.f15907x989de2db;
    }

    /* renamed from: isStaticContentTemplate */
    public boolean m32771x3e595cbb() {
        return this.f15908x3e595cbb;
    }

    /* renamed from: isUseFrontCamera */
    public boolean m32772xead70a71() {
        return this.f15909xead70a71;
    }

    public C4024xee1c0e5a(boolean z17, boolean z18, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2, int i17, boolean z19, boolean z27, boolean z28, boolean z29, java.lang.Object[] objArr) {
        this.f15909xead70a71 = z17;
        this.f15907x989de2db = z18;
        this.f15911x6b347673 = c4128x879fba0a;
        this.f15910xab943da1 = c4128x879fba0a2;
        this.f15913x9f9df71 = i17;
        this.f15904x8553e878 = z19;
        this.f15906x80c6e4eb = z27;
        this.f15905x5c2c5c2b = z28;
        this.f15908x3e595cbb = z29;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                arrayList.add((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj);
            }
        }
        this.f15912xd0496260 = arrayList;
    }
}
