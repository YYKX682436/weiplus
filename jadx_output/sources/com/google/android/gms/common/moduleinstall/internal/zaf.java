package com.google.android.gms.common.moduleinstall.internal;

/* loaded from: classes13.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa {
    public zaf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zae(com.google.android.gms.common.moduleinstall.internal.zae zaeVar, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequest) {
        android.os.Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, zaeVar);
        com.google.android.gms.internal.base.zac.zac(zaa, apiFeatureRequest);
        zac(1, zaa);
    }

    public final void zaf(com.google.android.gms.common.moduleinstall.internal.zae zaeVar, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequest) {
        android.os.Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, zaeVar);
        com.google.android.gms.internal.base.zac.zac(zaa, apiFeatureRequest);
        zac(3, zaa);
    }

    public final void zag(com.google.android.gms.common.moduleinstall.internal.zae zaeVar, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequest, com.google.android.gms.common.moduleinstall.internal.zah zahVar) {
        android.os.Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, zaeVar);
        com.google.android.gms.internal.base.zac.zac(zaa, apiFeatureRequest);
        com.google.android.gms.internal.base.zac.zad(zaa, zahVar);
        zac(2, zaa);
    }

    public final void zah(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequest) {
        android.os.Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, iStatusCallback);
        com.google.android.gms.internal.base.zac.zac(zaa, apiFeatureRequest);
        zac(4, zaa);
    }

    public final void zai(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback, com.google.android.gms.common.moduleinstall.internal.zah zahVar) {
        android.os.Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, iStatusCallback);
        com.google.android.gms.internal.base.zac.zad(zaa, zahVar);
        zac(6, zaa);
    }
}
