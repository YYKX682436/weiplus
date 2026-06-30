package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.DataClient */
/* loaded from: classes13.dex */
public abstract class AbstractC2459xa72cc435 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2475xd855c179.WearableOptions> {

    /* renamed from: ACTION_DATA_CHANGED */
    public static final java.lang.String f7487xdcff268 = "com.google.android.gms.wearable.DATA_CHANGED";

    /* renamed from: FILTER_LITERAL */
    public static final int f7488x1bc1ac8 = 0;

    /* renamed from: FILTER_PREFIX */
    public static final int f7489x30a40d39 = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.DataClient$FilterType */
    /* loaded from: classes6.dex */
    public @interface FilterType {
    }

    /* renamed from: com.google.android.gms.wearable.DataClient$GetFdForAssetResponse */
    /* loaded from: classes13.dex */
    public static abstract class GetFdForAssetResponse implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98 {
        /* renamed from: getFdForAsset */
        public abstract android.os.ParcelFileDescriptor mo19731x4bf78e7b();

        /* renamed from: getInputStream */
        public abstract java.io.InputStream mo19732xc7995ab4();
    }

    /* renamed from: com.google.android.gms.wearable.DataClient$OnDataChangedListener */
    /* loaded from: classes13.dex */
    public interface OnDataChangedListener extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener {
        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener
        /* renamed from: onDataChanged */
        void mo19715xf050804b(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2461xbdd2f950 c2461xbdd2f950);
    }

    public AbstractC2459xa72cc435(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(activity, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44>) com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2475xd855c179.API, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44) null, settings);
    }

    /* renamed from: addListener */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19719x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.OnDataChangedListener onDataChangedListener);

    /* renamed from: addListener */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19720x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.OnDataChangedListener onDataChangedListener, android.net.Uri uri, int i17);

    /* renamed from: deleteDataItems */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Integer> mo19721x17c10ccb(android.net.Uri uri);

    /* renamed from: deleteDataItems */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Integer> mo19722x17c10ccb(android.net.Uri uri, int i17);

    /* renamed from: getDataItem */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd> mo19723xe6783753(android.net.Uri uri);

    /* renamed from: getDataItems */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2464x16c7ac9d> mo19724xe88eb380();

    /* renamed from: getDataItems */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2464x16c7ac9d> mo19725xe88eb380(android.net.Uri uri);

    /* renamed from: getDataItems */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2464x16c7ac9d> mo19726xe88eb380(android.net.Uri uri, int i17);

    /* renamed from: getFdForAsset */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.GetFdForAssetResponse> mo19727x4bf78e7b(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 c2449x3c9fad0);

    /* renamed from: getFdForAsset */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.GetFdForAssetResponse> mo19728x4bf78e7b(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3 interfaceC2463x42bdd2f3);

    /* renamed from: putDataItem */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd> mo19729x6719920c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 c2474x601f1916);

    /* renamed from: removeListener */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo19730xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.OnDataChangedListener onDataChangedListener);

    public AbstractC2459xa72cc435(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(context, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2475xd855c179.API, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44) null, settings);
    }
}
