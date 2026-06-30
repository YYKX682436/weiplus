package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzwo extends android.database.ContentObserver {
    public zzwo(android.os.Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z17) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        atomicBoolean = com.google.android.gms.internal.measurement.zzwn.zzbmk;
        atomicBoolean.set(true);
    }
}
