package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zax implements com.google.android.gms.common.api.internal.zabz {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaa zaa;

    public /* synthetic */ zax(com.google.android.gms.common.api.internal.zaaa zaaaVar, com.google.android.gms.common.api.internal.zaw zawVar) {
        this.zaa = zaaaVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            this.zaa.zaj = connectionResult;
            com.google.android.gms.common.api.internal.zaaa.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(android.os.Bundle bundle) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            com.google.android.gms.common.api.internal.zaaa.zao(this.zaa, bundle);
            this.zaa.zaj = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
            com.google.android.gms.common.api.internal.zaaa.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i17, boolean z17) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        boolean z18;
        com.google.android.gms.common.ConnectionResult connectionResult;
        com.google.android.gms.common.ConnectionResult connectionResult2;
        com.google.android.gms.common.api.internal.zabi zabiVar;
        lock = this.zaa.zam;
        lock.lock();
        try {
            com.google.android.gms.common.api.internal.zaaa zaaaVar = this.zaa;
            z18 = zaaaVar.zal;
            if (!z18) {
                connectionResult = zaaaVar.zak;
                if (connectionResult != null) {
                    connectionResult2 = zaaaVar.zak;
                    if (connectionResult2.isSuccess()) {
                        this.zaa.zal = true;
                        zabiVar = this.zaa.zae;
                        zabiVar.onConnectionSuspended(i17);
                    }
                }
            }
            this.zaa.zal = false;
            com.google.android.gms.common.api.internal.zaaa.zan(this.zaa, i17, z17);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }
}
