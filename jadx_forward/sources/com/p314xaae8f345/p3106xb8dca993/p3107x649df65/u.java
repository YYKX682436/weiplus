package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public interface u extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class a extends android.os.Binder implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.u {
        public static com.p314xaae8f345.p3106xb8dca993.p3107x649df65.u a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3106xb8dca993.p3107x649df65.u)) ? new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.v1(iBinder) : (com.p314xaae8f345.p3106xb8dca993.p3107x649df65.u) queryLocalInterface;
        }
    }

    boolean h();

    java.lang.String m();
}
