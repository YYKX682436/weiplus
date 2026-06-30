package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzbw */
/* loaded from: classes13.dex */
public final class C2527x394b95 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0 {
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener dataListener, android.content.IntentFilter[] intentFilterArr) {
        return com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzb.zza(abstractC1748xd28d482c, new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2535x394ba2(intentFilterArr), dataListener);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0
    /* renamed from: addListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19702x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener dataListener) {
        return zza(abstractC1748xd28d482c, dataListener, new android.content.IntentFilter[]{com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zzc("com.google.android.gms.wearable.DATA_CHANGED")});
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0
    /* renamed from: deleteDataItems */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DeleteDataItemsResult> mo19704x17c10ccb(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri) {
        return mo19705x17c10ccb(abstractC1748xd28d482c, uri, 0);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0
    /* renamed from: getDataItem */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataItemResult> mo19706xe6783753(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2529x394b97(this, abstractC1748xd28d482c, uri));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0
    /* renamed from: getDataItems */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2464x16c7ac9d> mo19707xe88eb380(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2530x394b98(this, abstractC1748xd28d482c));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0
    /* renamed from: getFdForAsset */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.GetFdForAssetResult> mo19710x4bf78e7b(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 c2449x3c9fad0) {
        if (c2449x3c9fad0 == null) {
            throw new java.lang.IllegalArgumentException("asset is null");
        }
        if (c2449x3c9fad0.m19633x15b3c0ba() == null) {
            throw new java.lang.IllegalArgumentException("invalid asset");
        }
        if (c2449x3c9fad0.m19632xfb7e5820() == null) {
            return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2533x394ba0(this, abstractC1748xd28d482c, c2449x3c9fad0));
        }
        throw new java.lang.IllegalArgumentException("invalid asset");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0
    /* renamed from: putDataItem */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataItemResult> mo19712x6719920c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 c2474x601f1916) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2528x394b96(this, abstractC1748xd28d482c, c2474x601f1916));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0
    /* renamed from: removeListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19713xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener dataListener) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2536x394ba3(this, abstractC1748xd28d482c, dataListener));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0
    /* renamed from: addListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19703x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener dataListener, android.net.Uri uri, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(uri, "uri must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(i17 == 0 || i17 == 1, "invalid filter type");
        return zza(abstractC1748xd28d482c, dataListener, new android.content.IntentFilter[]{com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zza("com.google.android.gms.wearable.DATA_CHANGED", uri, i17)});
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0
    /* renamed from: deleteDataItems */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DeleteDataItemsResult> mo19705x17c10ccb(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(uri, "uri must not be null");
        boolean z17 = true;
        if (i17 != 0 && i17 != 1) {
            z17 = false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(z17, "invalid filter type");
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2532x394b9f(this, abstractC1748xd28d482c, uri, i17));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0
    /* renamed from: getDataItems */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2464x16c7ac9d> mo19708xe88eb380(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri) {
        return mo19709xe88eb380(abstractC1748xd28d482c, uri, 0);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0
    /* renamed from: getFdForAsset */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.GetFdForAssetResult> mo19711x4bf78e7b(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3 interfaceC2463x42bdd2f3) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2534x394ba1(this, abstractC1748xd28d482c, interfaceC2463x42bdd2f3));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0
    /* renamed from: getDataItems */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2464x16c7ac9d> mo19709xe88eb380(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(uri, "uri must not be null");
        boolean z17 = true;
        if (i17 != 0 && i17 != 1) {
            z17 = false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(z17, "invalid filter type");
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2531x394b9e(this, abstractC1748xd28d482c, uri, i17));
    }
}
