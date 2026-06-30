package com.google.android.gms.common.api;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zab implements com.google.android.gms.common.api.PendingResult.StatusListener {
    final /* synthetic */ com.google.android.gms.common.api.Batch zaa;

    public zab(com.google.android.gms.common.api.Batch batch) {
        this.zaa = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status status) {
        java.lang.Object obj;
        int i17;
        int i18;
        boolean z17;
        boolean z18;
        com.google.android.gms.common.api.PendingResult[] pendingResultArr;
        obj = this.zaa.zai;
        synchronized (obj) {
            if (this.zaa.isCanceled()) {
                return;
            }
            if (status.isCanceled()) {
                this.zaa.zag = true;
            } else if (!status.isSuccess()) {
                this.zaa.zaf = true;
            }
            com.google.android.gms.common.api.Batch batch = this.zaa;
            i17 = batch.zae;
            batch.zae = i17 - 1;
            com.google.android.gms.common.api.Batch batch2 = this.zaa;
            i18 = batch2.zae;
            if (i18 == 0) {
                z17 = batch2.zag;
                if (z17) {
                    super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                } else {
                    z18 = batch2.zaf;
                    com.google.android.gms.common.api.Status status2 = z18 ? new com.google.android.gms.common.api.Status(13) : com.google.android.gms.common.api.Status.RESULT_SUCCESS;
                    com.google.android.gms.common.api.Batch batch3 = this.zaa;
                    pendingResultArr = batch3.zah;
                    batch3.setResult(new com.google.android.gms.common.api.BatchResult(status2, pendingResultArr));
                }
            }
        }
    }
}
