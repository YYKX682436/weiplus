package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public interface IAccountAccessor extends android.os.IInterface {

    /* loaded from: classes13.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static com.google.android.gms.common.internal.IAccountAccessor asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof com.google.android.gms.common.internal.IAccountAccessor ? (com.google.android.gms.common.internal.IAccountAccessor) queryLocalInterface : new com.google.android.gms.common.internal.zzw(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 != 2) {
                return false;
            }
            android.accounts.Account zzb = zzb();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.zzd(parcel2, zzb);
            return true;
        }
    }

    android.accounts.Account zzb();
}
