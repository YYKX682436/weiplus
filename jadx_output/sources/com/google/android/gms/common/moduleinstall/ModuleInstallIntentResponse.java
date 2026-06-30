package com.google.android.gms.common.moduleinstall;

/* loaded from: classes13.dex */
public class ModuleInstallIntentResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse> CREATOR = new com.google.android.gms.common.moduleinstall.zab();
    private final android.app.PendingIntent zaa;

    public ModuleInstallIntentResponse(android.app.PendingIntent pendingIntent) {
        this.zaa = pendingIntent;
    }

    public android.app.PendingIntent getPendingIntent() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
