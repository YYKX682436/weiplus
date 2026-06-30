package wh;

/* loaded from: classes12.dex */
public class n implements wh.a2 {
    @Override // wh.a2
    public java.lang.Object a(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Object obj2 = null;
        if ("registerAdapter".equals(method.getName())) {
            java.lang.Object invoke = method.invoke(obj, objArr);
            try {
                obj2 = java.lang.reflect.Proxy.newProxyInstance(invoke.getClass().getClassLoader(), new java.lang.Class[]{android.os.IBinder.class, android.os.IInterface.class, java.lang.Class.forName("android.bluetooth.IBluetooth")}, new wh.o(invoke));
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.battery.BluetoothHooker", th6, "proxyBluetooth fail", new java.lang.Object[0]);
            }
            return obj2 == null ? invoke : obj2;
        }
        if (!"getBluetoothGatt".equals(method.getName())) {
            return null;
        }
        java.lang.Object invoke2 = method.invoke(obj, objArr);
        try {
            obj2 = java.lang.reflect.Proxy.newProxyInstance(invoke2.getClass().getClassLoader(), new java.lang.Class[]{android.os.IBinder.class, android.os.IInterface.class, java.lang.Class.forName("android.bluetooth.IBluetoothGatt")}, new wh.p(invoke2));
        } catch (java.lang.Throwable th7) {
            oj.j.d("Matrix.battery.BluetoothHooker", th7, "proxyBluetoothGatt fail", new java.lang.Object[0]);
        }
        return obj2 == null ? invoke2 : obj2;
    }

    @Override // wh.a2
    public void b(java.lang.reflect.Method method, java.lang.Object[] objArr) {
    }
}
