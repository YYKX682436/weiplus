package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes15.dex */
public interface v extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class a extends android.os.Binder implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.v {
        public static com.p314xaae8f345.p3106xb8dca993.p3107x649df65.v a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3106xb8dca993.p3107x649df65.v)) ? new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.w1(iBinder) : (com.p314xaae8f345.p3106xb8dca993.p3107x649df65.v) queryLocalInterface;
        }
    }

    java.lang.String b();

    java.lang.String c(java.lang.String str);

    boolean c();
}
