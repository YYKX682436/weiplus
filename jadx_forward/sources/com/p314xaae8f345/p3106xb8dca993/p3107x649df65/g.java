package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public interface g extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class a extends android.os.Binder implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.g {
        public static com.p314xaae8f345.p3106xb8dca993.p3107x649df65.g a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3106xb8dca993.p3107x649df65.g)) ? new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.l1(iBinder) : (com.p314xaae8f345.p3106xb8dca993.p3107x649df65.g) queryLocalInterface;
        }
    }

    java.lang.String a(java.lang.String str);

    java.lang.String b(java.lang.String str);
}
