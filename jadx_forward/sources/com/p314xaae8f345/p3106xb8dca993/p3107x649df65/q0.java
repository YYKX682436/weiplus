package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public interface q0 extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class a extends android.os.Binder implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q0 {
        public static com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q0 a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q0)) ? new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.s1(iBinder) : (com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q0) queryLocalInterface;
        }
    }

    java.lang.String a();

    java.lang.String a(java.lang.String str);
}
