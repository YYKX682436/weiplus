package com.google.android.gms.common.moduleinstall.internal;

/* loaded from: classes13.dex */
public abstract class zag extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.moduleinstall.internal.zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 != 1) {
            return false;
        }
        com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate moduleInstallStatusUpdate = (com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate) com.google.android.gms.internal.base.zac.zaa(parcel, com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.CREATOR);
        com.google.android.gms.internal.base.zac.zab(parcel);
        zab(moduleInstallStatusUpdate);
        return true;
    }
}
