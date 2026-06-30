package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzcu */
/* loaded from: classes13.dex */
final class C2551x394bb2 extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.GetFdForAssetResponse {

    /* renamed from: zzdj */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.GetFdForAssetResult f7637x394bc6;

    public C2551x394bb2(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.GetFdForAssetResult getFdForAssetResult) {
        this.f7637x394bc6 = getFdForAssetResult;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.GetFdForAssetResponse
    /* renamed from: getFdForAsset */
    public final android.os.ParcelFileDescriptor mo19731x4bf78e7b() {
        return this.f7637x394bc6.mo19717x5db1ab4();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2459xa72cc435.GetFdForAssetResponse
    /* renamed from: getInputStream */
    public final java.io.InputStream mo19732xc7995ab4() {
        return this.f7637x394bc6.mo19718xc7995ab4();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98
    /* renamed from: release */
    public final void mo17739x41012807() {
        this.f7637x394bc6.mo17739x41012807();
    }
}
