package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.IGmsServiceBroker */
/* loaded from: classes13.dex */
public interface InterfaceC1917xe04b660a extends android.os.IInterface {

    /* renamed from: com.google.android.gms.common.internal.IGmsServiceBroker$Stub */
    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1917xe04b660a {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1916x8139adea c1948x394b61;
            if (i17 > 16777215) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c1948x394b61 = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                c1948x394b61 = queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1916x8139adea ? (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1916x8139adea) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1948x394b61(readStrongBinder);
            }
            if (i17 == 46) {
                mo18183xb411027f(c1948x394b61, parcel.readInt() != 0 ? com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1909xa129caf0.f5942x681a0c0c.createFromParcel(parcel) : null);
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(parcel2);
                parcel2.writeNoException();
                return true;
            }
            if (i17 == 47) {
                if (parcel.readInt() != 0) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1957x394b6a.f5961x681a0c0c.createFromParcel(parcel);
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

    /* renamed from: getService */
    void mo18183xb411027f(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1916x8139adea interfaceC1916x8139adea, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1909xa129caf0 c1909xa129caf0);
}
