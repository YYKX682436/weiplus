package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public final class zak extends com.google.android.gms.common.api.internal.zap {
    private final android.util.SparseArray zad;

    private zak(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, com.google.android.gms.common.GoogleApiAvailability.getInstance());
        this.zad = new android.util.SparseArray();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static com.google.android.gms.common.api.internal.zak zaa(com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity) {
        com.google.android.gms.common.api.internal.LifecycleFragment fragment = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(lifecycleActivity);
        com.google.android.gms.common.api.internal.zak zakVar = (com.google.android.gms.common.api.internal.zak) fragment.getCallbackOrNull("AutoManageHelper", com.google.android.gms.common.api.internal.zak.class);
        return zakVar != null ? zakVar : new com.google.android.gms.common.api.internal.zak(fragment);
    }

    private final com.google.android.gms.common.api.internal.zaj zai(int i17) {
        if (this.zad.size() <= i17) {
            return null;
        }
        android.util.SparseArray sparseArray = this.zad;
        return (com.google.android.gms.common.api.internal.zaj) sparseArray.get(sparseArray.keyAt(i17));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        for (int i17 = 0; i17 < this.zad.size(); i17++) {
            com.google.android.gms.common.api.internal.zaj zai = zai(i17);
            if (zai != null) {
                printWriter.append((java.lang.CharSequence) str).append("GoogleApiClient #").print(zai.zaa);
                printWriter.println(":");
                zai.zab.dump(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        java.lang.String.valueOf(this.zad);
        if (this.zab.get() == null) {
            for (int i17 = 0; i17 < this.zad.size(); i17++) {
                com.google.android.gms.common.api.internal.zaj zai = zai(i17);
                if (zai != null) {
                    zai.zab.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i17 = 0; i17 < this.zad.size(); i17++) {
            com.google.android.gms.common.api.internal.zaj zai = zai(i17);
            if (zai != null) {
                zai.zab.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(com.google.android.gms.common.ConnectionResult connectionResult, int i17) {
        if (i17 < 0) {
            android.util.Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new java.lang.Exception());
            return;
        }
        com.google.android.gms.common.api.internal.zaj zajVar = (com.google.android.gms.common.api.internal.zaj) this.zad.get(i17);
        if (zajVar != null) {
            zae(i17);
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zajVar.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        for (int i17 = 0; i17 < this.zad.size(); i17++) {
            com.google.android.gms.common.api.internal.zaj zai = zai(i17);
            if (zai != null) {
                zai.zab.connect();
            }
        }
    }

    public final void zad(int i17, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        com.google.android.gms.common.internal.Preconditions.checkState(this.zad.indexOfKey(i17) < 0, "Already managing a GoogleApiClient with id " + i17);
        com.google.android.gms.common.api.internal.zam zamVar = (com.google.android.gms.common.api.internal.zam) this.zab.get();
        java.lang.String.valueOf(zamVar);
        com.google.android.gms.common.api.internal.zaj zajVar = new com.google.android.gms.common.api.internal.zaj(this, i17, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(zajVar);
        this.zad.put(i17, zajVar);
        if (this.zaa && zamVar == null) {
            "connecting ".concat(googleApiClient.toString());
            googleApiClient.connect();
        }
    }

    public final void zae(int i17) {
        com.google.android.gms.common.api.internal.zaj zajVar = (com.google.android.gms.common.api.internal.zaj) this.zad.get(i17);
        this.zad.remove(i17);
        if (zajVar != null) {
            zajVar.zab.unregisterConnectionFailedListener(zajVar);
            zajVar.zab.disconnect();
        }
    }
}
