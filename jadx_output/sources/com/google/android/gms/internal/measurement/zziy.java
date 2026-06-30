package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zziy implements java.lang.Runnable {
    private final /* synthetic */ android.content.ComponentName val$name;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zziw zzapn;

    public zziy(com.google.android.gms.internal.measurement.zziw zziwVar, android.content.ComponentName componentName) {
        this.zzapn = zziwVar;
        this.val$name = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzapn.zzape.onServiceDisconnected(this.val$name);
    }
}
