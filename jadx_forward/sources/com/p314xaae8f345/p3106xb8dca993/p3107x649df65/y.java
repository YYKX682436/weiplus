package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes15.dex */
public interface y extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class a extends android.os.Binder implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y {
        public static com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y)) ? new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y1(iBinder) : (com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y) queryLocalInterface;
        }
    }

    java.lang.String a();

    boolean c();

    java.lang.String d();

    void f();

    boolean g();
}
