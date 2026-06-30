package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzcj */
/* loaded from: classes13.dex */
public final class C2540x394ba7 extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435 {

    /* renamed from: zzdi */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0 f7627x394bc5;

    public C2540x394ba7(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(activity, settings);
        this.f7627x394bc5 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2527x394b95();
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.OnDataChangedListener onDataChangedListener, android.content.IntentFilter[] intentFilterArr) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0 m17928xe0f82b9c = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(onDataChangedListener, m17760x23b2dd47(), "DataListener");
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2550x394bb1 c2550x394bb1 = null;
        return m17748xa3689bc0(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2552x394bb3(onDataChangedListener, intentFilterArr, m17928xe0f82b9c), new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2553x394bb4(onDataChangedListener, m17928xe0f82b9c.m17922x2985fbd5()));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435
    /* renamed from: addListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19719x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.OnDataChangedListener onDataChangedListener) {
        return zza(onDataChangedListener, new android.content.IntentFilter[]{com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zzc("com.google.android.gms.wearable.DATA_CHANGED")});
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435
    /* renamed from: deleteDataItems */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Integer> mo19721x17c10ccb(android.net.Uri uri) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7627x394bc5.mo19704x17c10ccb(m17741xb77111ba(), uri), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2546x394bad.f7633x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435
    /* renamed from: getDataItem */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd> mo19723xe6783753(android.net.Uri uri) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7627x394bc5.mo19706xe6783753(m17741xb77111ba(), uri), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2542x394ba9.f7629x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435
    /* renamed from: getDataItems */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2464x16c7ac9d> mo19724xe88eb380() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7627x394bc5.mo19707xe88eb380(m17741xb77111ba()), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2543x394baa.f7630x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435
    /* renamed from: getFdForAsset */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.GetFdForAssetResponse> mo19727x4bf78e7b(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 c2449x3c9fad0) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7627x394bc5.mo19710x4bf78e7b(m17741xb77111ba(), c2449x3c9fad0), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2548x394baf.f7635x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435
    /* renamed from: putDataItem */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2462x6e785dfd> mo19729x6719920c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916 c2474x601f1916) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7627x394bc5.mo19712x6719920c(m17741xb77111ba(), c2474x601f1916), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2541x394ba8.f7628x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435
    /* renamed from: removeListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo19730xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.OnDataChangedListener onDataChangedListener) {
        return m17750x3ea49d87(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(onDataChangedListener, m17760x23b2dd47(), "DataListener").m17922x2985fbd5());
    }

    public C2540x394ba7(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(context, settings);
        this.f7627x394bc5 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2527x394b95();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435
    /* renamed from: addListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19720x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.OnDataChangedListener onDataChangedListener, android.net.Uri uri, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18082x7b41bcd2(uri, "uri must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(i17 == 0 || i17 == 1, "invalid filter type");
        return zza(onDataChangedListener, new android.content.IntentFilter[]{com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zza("com.google.android.gms.wearable.DATA_CHANGED", uri, i17)});
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435
    /* renamed from: deleteDataItems */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Integer> mo19722x17c10ccb(android.net.Uri uri, int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7627x394bc5.mo19705x17c10ccb(m17741xb77111ba(), uri, i17), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2547x394bae.f7634x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435
    /* renamed from: getDataItems */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2464x16c7ac9d> mo19725xe88eb380(android.net.Uri uri) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7627x394bc5.mo19708xe88eb380(m17741xb77111ba(), uri), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2544x394bab.f7631x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435
    /* renamed from: getFdForAsset */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.GetFdForAssetResponse> mo19728x4bf78e7b(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2463x42bdd2f3 interfaceC2463x42bdd2f3) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7627x394bc5.mo19711x4bf78e7b(m17741xb77111ba(), interfaceC2463x42bdd2f3), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2549x394bb0.f7636x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435
    /* renamed from: getDataItems */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2464x16c7ac9d> mo19726xe88eb380(android.net.Uri uri, int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7627x394bc5.mo19709xe88eb380(m17741xb77111ba(), uri, i17), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2545x394bac.f7632x394b96);
    }
}
