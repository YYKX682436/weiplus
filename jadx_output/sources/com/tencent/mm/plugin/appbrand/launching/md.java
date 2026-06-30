package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class md implements com.tencent.luggage.sdk.launching.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f84796a;

    public md(java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f84796a = atomicReference;
    }

    @Override // com.tencent.luggage.sdk.launching.i
    public void a(android.os.Parcelable parcelable) {
        com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle weAppExportLaunchInfoBundle = (com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle) parcelable;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f84796a;
        l81.e1 e1Var = (l81.e1) atomicReference.get();
        if (e1Var == null || com.tencent.mm.plugin.appbrand.launching.od.f84874a.b(e1Var)) {
            atomicReference.set(null);
        } else {
            if (weAppExportLaunchInfoBundle == null) {
                return;
            }
            pm0.v.X(new com.tencent.mm.plugin.appbrand.launching.ld(e1Var, weAppExportLaunchInfoBundle));
        }
    }
}
