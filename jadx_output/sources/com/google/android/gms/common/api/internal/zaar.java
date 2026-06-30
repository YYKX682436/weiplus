package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
final class zaar extends com.google.android.gms.signin.internal.zac {
    private final java.lang.ref.WeakReference zaa;

    public zaar(com.google.android.gms.common.api.internal.zaaw zaawVar) {
        this.zaa = new java.lang.ref.WeakReference(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        com.google.android.gms.common.api.internal.zabi zabiVar;
        com.google.android.gms.common.api.internal.zaaw zaawVar = (com.google.android.gms.common.api.internal.zaaw) this.zaa.get();
        if (zaawVar == null) {
            return;
        }
        zabiVar = zaawVar.zaa;
        zabiVar.zal(new com.google.android.gms.common.api.internal.zaaq(this, zaawVar, zaawVar, zakVar));
    }
}
