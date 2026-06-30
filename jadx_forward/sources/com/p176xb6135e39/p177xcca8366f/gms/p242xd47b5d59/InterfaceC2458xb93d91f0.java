package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.wearable.DataApi */
/* loaded from: classes13.dex */
public interface InterfaceC2458xb93d91f0 {

    /* renamed from: ACTION_DATA_CHANGED */
    public static final java.lang.String f7484xdcff268 = "com.google.android.gms.wearable.DATA_CHANGED";

    /* renamed from: FILTER_LITERAL */
    public static final int f7485x1bc1ac8 = 0;

    /* renamed from: FILTER_PREFIX */
    public static final int f7486x30a40d39 = 1;

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.DataApi$DataItemResult */
    /* loaded from: classes13.dex */
    public interface DataItemResult extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d {
        /* renamed from: getDataItem */
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd mo19714xe6783753();
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.DataApi$DataListener */
    /* loaded from: classes13.dex */
    public interface DataListener {
        /* renamed from: onDataChanged */
        void mo19715xf050804b(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2461xbdd2f950 c2461xbdd2f950);
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.DataApi$DeleteDataItemsResult */
    /* loaded from: classes13.dex */
    public interface DeleteDataItemsResult extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d {
        /* renamed from: getNumDeleted */
        int mo19716xa398f1a9();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.DataApi$FilterType */
    /* loaded from: classes6.dex */
    public @interface FilterType {
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.DataApi$GetFdForAssetResult */
    /* loaded from: classes13.dex */
    public interface GetFdForAssetResult extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d {
        /* renamed from: getFd */
        android.os.ParcelFileDescriptor mo19717x5db1ab4();

        /* renamed from: getInputStream */
        java.io.InputStream mo19718xc7995ab4();
    }

    /* renamed from: addListener */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19702x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener dataListener);

    /* renamed from: addListener */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19703x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener dataListener, android.net.Uri uri, int i17);

    /* renamed from: deleteDataItems */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DeleteDataItemsResult> mo19704x17c10ccb(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri);

    /* renamed from: deleteDataItems */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DeleteDataItemsResult> mo19705x17c10ccb(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri, int i17);

    /* renamed from: getDataItem */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataItemResult> mo19706xe6783753(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri);

    /* renamed from: getDataItems */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2464x16c7ac9d> mo19707xe88eb380(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c);

    /* renamed from: getDataItems */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2464x16c7ac9d> mo19708xe88eb380(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri);

    /* renamed from: getDataItems */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2464x16c7ac9d> mo19709xe88eb380(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri, int i17);

    /* renamed from: getFdForAsset */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.GetFdForAssetResult> mo19710x4bf78e7b(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 c2449x3c9fad0);

    /* renamed from: getFdForAsset */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.GetFdForAssetResult> mo19711x4bf78e7b(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3 interfaceC2463x42bdd2f3);

    /* renamed from: putDataItem */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataItemResult> mo19712x6719920c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 c2474x601f1916);

    /* renamed from: removeListener */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19713xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener dataListener);
}
