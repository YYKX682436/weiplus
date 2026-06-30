package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public interface IStatusCallback extends android.os.IInterface {

    /* loaded from: classes13.dex */
    public static abstract class Stub extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.api.internal.IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static com.google.android.gms.common.api.internal.IStatusCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return queryLocalInterface instanceof com.google.android.gms.common.api.internal.IStatusCallback ? (com.google.android.gms.common.api.internal.IStatusCallback) queryLocalInterface : new com.google.android.gms.common.api.internal.zaby(iBinder);
        }

        @Override // com.google.android.gms.internal.base.zab
        public final boolean zaa(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 != 1) {
                return false;
            }
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zac.zaa(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.internal.base.zac.zab(parcel);
            onResult(status);
            return true;
        }
    }

    void onResult(com.google.android.gms.common.api.Status status);
}
