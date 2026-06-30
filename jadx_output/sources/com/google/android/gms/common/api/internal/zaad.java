package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public final class zaad {
    private final java.util.Map zaa = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
    private final java.util.Map zab = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());

    private final void zah(boolean z17, com.google.android.gms.common.api.Status status) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        synchronized (this.zaa) {
            hashMap = new java.util.HashMap(this.zaa);
        }
        synchronized (this.zab) {
            hashMap2 = new java.util.HashMap(this.zab);
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (z17 || ((java.lang.Boolean) entry.getValue()).booleanValue()) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            if (z17 || ((java.lang.Boolean) entry2.getValue()).booleanValue()) {
                ((com.google.android.gms.tasks.TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.ApiException(status));
            }
        }
    }

    public final void zac(com.google.android.gms.common.api.internal.BasePendingResult basePendingResult, boolean z17) {
        this.zaa.put(basePendingResult, java.lang.Boolean.valueOf(z17));
        basePendingResult.addStatusListener(new com.google.android.gms.common.api.internal.zaab(this, basePendingResult));
    }

    public final void zad(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, boolean z17) {
        this.zab.put(taskCompletionSource, java.lang.Boolean.valueOf(z17));
        taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.common.api.internal.zaac(this, taskCompletionSource));
    }

    public final void zae(int i17, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("The connection to Google Play services was lost");
        if (i17 == 1) {
            sb6.append(" due to service disconnection.");
        } else if (i17 == 3) {
            sb6.append(" due to dead object exception.");
        }
        if (str != null) {
            sb6.append(" Last reason for disconnect: ");
            sb6.append(str);
        }
        zah(true, new com.google.android.gms.common.api.Status(20, sb6.toString()));
    }

    public final void zaf() {
        zah(false, com.google.android.gms.common.api.internal.GoogleApiManager.zaa);
    }

    public final boolean zag() {
        return (this.zaa.isEmpty() && this.zab.isEmpty()) ? false : true;
    }
}
