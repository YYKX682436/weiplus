package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public final class zzf extends androidx.loader.content.b implements com.google.android.gms.common.api.internal.SignInConnectionListener {
    private java.util.concurrent.Semaphore zzet;
    private java.util.Set<com.google.android.gms.common.api.GoogleApiClient> zzeu;

    public zzf(android.content.Context context, java.util.Set<com.google.android.gms.common.api.GoogleApiClient> set) {
        super(context);
        this.zzet = new java.util.concurrent.Semaphore(0);
        this.zzeu = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.loader.content.b
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void loadInBackground() {
        java.util.Iterator<com.google.android.gms.common.api.GoogleApiClient> it = this.zzeu.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (it.next().maybeSignIn(this)) {
                i17++;
            }
        }
        try {
            this.zzet.tryAcquire(i17, 5L, java.util.concurrent.TimeUnit.SECONDS);
            return null;
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.zzet.release();
    }

    @Override // androidx.loader.content.e
    public final void onStartLoading() {
        this.zzet.drainPermits();
        forceLoad();
    }
}
