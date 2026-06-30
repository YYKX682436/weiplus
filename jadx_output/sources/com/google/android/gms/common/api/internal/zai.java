package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public abstract class zai {
    public final int zac;

    public zai(int i17) {
        this.zac = i17;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zah(android.os.RemoteException remoteException) {
        return new com.google.android.gms.common.api.Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void zad(com.google.android.gms.common.api.Status status);

    public abstract void zae(java.lang.Exception exc);

    public abstract void zaf(com.google.android.gms.common.api.internal.zabq zabqVar);

    public abstract void zag(com.google.android.gms.common.api.internal.zaad zaadVar, boolean z17);
}
