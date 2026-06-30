package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public interface IGmsServiceBroker extends android.os.IInterface {

    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.google.android.gms.common.internal.IGmsServiceBroker {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            com.google.android.gms.common.internal.IGmsCallbacks zzabVar;
            if (i17 > 16777215) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzabVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                zzabVar = queryLocalInterface instanceof com.google.android.gms.common.internal.IGmsCallbacks ? (com.google.android.gms.common.internal.IGmsCallbacks) queryLocalInterface : new com.google.android.gms.common.internal.zzab(readStrongBinder);
            }
            if (i17 == 46) {
                getService(zzabVar, parcel.readInt() != 0 ? com.google.android.gms.common.internal.GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel2);
                parcel2.writeNoException();
                return true;
            }
            if (i17 == 47) {
                if (parcel.readInt() != 0) {
                    com.google.android.gms.common.internal.zzak.CREATOR.createFromParcel(parcel);
                }
                throw new java.lang.UnsupportedOperationException();
            }
            parcel.readInt();
            if (i17 != 4) {
                parcel.readString();
                if (i17 != 1) {
                    if (i17 != 2 && i17 != 23 && i17 != 25 && i17 != 27) {
                        if (i17 != 30) {
                            if (i17 == 34) {
                                parcel.readString();
                            } else if (i17 != 41 && i17 != 43 && i17 != 37 && i17 != 38) {
                                switch (i17) {
                                    case 9:
                                        parcel.readString();
                                        parcel.createStringArray();
                                        parcel.readString();
                                        parcel.readStrongBinder();
                                        parcel.readString();
                                        if (parcel.readInt() != 0) {
                                            break;
                                        }
                                        break;
                                    case 10:
                                        parcel.readString();
                                        parcel.createStringArray();
                                        break;
                                    case 19:
                                        parcel.readStrongBinder();
                                        if (parcel.readInt() != 0) {
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                        parcel.createStringArray();
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                        }
                    }
                    if (parcel.readInt() != 0) {
                    }
                } else {
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                }
            }
            throw new java.lang.UnsupportedOperationException();
        }
    }

    void getService(com.google.android.gms.common.internal.IGmsCallbacks iGmsCallbacks, com.google.android.gms.common.internal.GetServiceRequest getServiceRequest);
}
