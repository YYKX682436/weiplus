package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public final class zae extends com.google.android.gms.common.api.internal.zai {
    protected final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaa;

    public zae(int i17, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(i17);
        this.zaa = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) com.google.android.gms.common.internal.Preconditions.checkNotNull(apiMethodImpl, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(com.google.android.gms.common.api.Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(java.lang.Exception exc) {
        try {
            this.zaa.setFailedResult(new com.google.android.gms.common.api.Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabq zabqVar) {
        try {
            this.zaa.run(zabqVar.zaf());
        } catch (java.lang.RuntimeException e17) {
            zae(e17);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(com.google.android.gms.common.api.internal.zaad zaadVar, boolean z17) {
        zaadVar.zac(this.zaa, z17);
    }
}
