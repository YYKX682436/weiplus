package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public abstract class zad extends com.google.android.gms.common.api.internal.zac {
    protected final com.google.android.gms.tasks.TaskCompletionSource zaa;

    public zad(int i17, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(i17);
        this.zaa = taskCompletionSource;
    }

    public abstract void zac(com.google.android.gms.common.api.internal.zabq zabqVar);

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(com.google.android.gms.common.api.Status status) {
        this.zaa.trySetException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(java.lang.Exception exc) {
        this.zaa.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabq zabqVar) {
        try {
            zac(zabqVar);
        } catch (android.os.DeadObjectException e17) {
            zad(com.google.android.gms.common.api.internal.zai.zah(e17));
            throw e17;
        } catch (android.os.RemoteException e18) {
            zad(com.google.android.gms.common.api.internal.zai.zah(e18));
        } catch (java.lang.RuntimeException e19) {
            this.zaa.trySetException(e19);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void zag(com.google.android.gms.common.api.internal.zaad zaadVar, boolean z17) {
    }
}
