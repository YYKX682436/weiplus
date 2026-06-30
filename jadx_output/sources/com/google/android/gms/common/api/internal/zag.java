package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public final class zag extends com.google.android.gms.common.api.internal.zac {
    private final com.google.android.gms.common.api.internal.TaskApiCall zaa;
    private final com.google.android.gms.tasks.TaskCompletionSource zab;
    private final com.google.android.gms.common.api.internal.StatusExceptionMapper zad;

    public zag(int i17, com.google.android.gms.common.api.internal.TaskApiCall taskApiCall, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        super(i17);
        this.zab = taskCompletionSource;
        this.zaa = taskApiCall;
        this.zad = statusExceptionMapper;
        if (i17 == 2 && taskApiCall.shouldAutoResolveMissingFeatures()) {
            throw new java.lang.IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(com.google.android.gms.common.api.internal.zabq zabqVar) {
        return this.zaa.shouldAutoResolveMissingFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabq zabqVar) {
        return this.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(com.google.android.gms.common.api.Status status) {
        this.zab.trySetException(this.zad.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(java.lang.Exception exc) {
        this.zab.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabq zabqVar) {
        try {
            this.zaa.doExecute(zabqVar.zaf(), this.zab);
        } catch (android.os.DeadObjectException e17) {
            throw e17;
        } catch (android.os.RemoteException e18) {
            zad(com.google.android.gms.common.api.internal.zai.zah(e18));
        } catch (java.lang.RuntimeException e19) {
            this.zab.trySetException(e19);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(com.google.android.gms.common.api.internal.zaad zaadVar, boolean z17) {
        zaadVar.zad(this.zab, z17);
    }
}
