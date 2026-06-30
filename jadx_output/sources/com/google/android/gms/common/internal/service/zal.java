package com.google.android.gms.common.internal.service;

/* loaded from: classes13.dex */
public final class zal extends com.google.android.gms.internal.base.zaa {
    public zal(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(com.google.android.gms.common.internal.service.zak zakVar) {
        android.os.Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, zakVar);
        zad(1, zaa);
    }
}
