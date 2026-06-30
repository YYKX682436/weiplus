package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzci */
/* loaded from: classes13.dex */
public final class C2539x394ba6 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.GetFdForAssetResult {

    /* renamed from: closed */
    private volatile boolean f7625xaf15e16c = false;

    /* renamed from: zzct */
    private volatile java.io.InputStream f7626x394bb1;
    private volatile android.os.ParcelFileDescriptor zzf;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zzp;

    public C2539x394ba6(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.zzp = c1763x9432bc12;
        this.zzf = parcelFileDescriptor;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.GetFdForAssetResult
    /* renamed from: getFd */
    public final android.os.ParcelFileDescriptor mo19717x5db1ab4() {
        if (this.f7625xaf15e16c) {
            throw new java.lang.IllegalStateException("Cannot access the file descriptor after release().");
        }
        return this.zzf;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.GetFdForAssetResult
    /* renamed from: getInputStream */
    public final java.io.InputStream mo19718xc7995ab4() {
        if (this.f7625xaf15e16c) {
            throw new java.lang.IllegalStateException("Cannot access the input stream after release().");
        }
        if (this.zzf == null) {
            return null;
        }
        if (this.f7626x394bb1 == null) {
            this.f7626x394bb1 = new android.os.ParcelFileDescriptor.AutoCloseInputStream(this.zzf);
        }
        return this.f7626x394bb1;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d
    /* renamed from: getStatus */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 mo17538x2fe4f2e8() {
        return this.zzp;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98
    /* renamed from: release */
    public final void mo17739x41012807() {
        if (this.zzf == null) {
            return;
        }
        if (this.f7625xaf15e16c) {
            throw new java.lang.IllegalStateException("releasing an already released result.");
        }
        try {
            if (this.f7626x394bb1 != null) {
                this.f7626x394bb1.close();
            } else {
                this.zzf.close();
            }
            this.f7625xaf15e16c = true;
            this.zzf = null;
            this.f7626x394bb1 = null;
        } catch (java.io.IOException unused) {
        }
    }
}
