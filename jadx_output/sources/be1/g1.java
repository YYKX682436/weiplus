package be1;

/* loaded from: classes7.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final be1.g1 f19471d = new be1.g1();

    public g1() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Context context = (android.content.Context) obj;
        java.util.Map outRes = (java.util.Map) obj2;
        kotlin.jvm.internal.o.g(outRes, "outRes");
        if (context != null) {
            boolean z17 = true;
            boolean z18 = android.bluetooth.BluetoothAdapter.getDefaultAdapter() != null;
            if (z18 && android.os.Build.VERSION.SDK_INT >= 31) {
                if (!nf.t.b(context, null, "android.permission.BLUETOOTH_CONNECT") && !nf.t.b(context, null, "android.permission.BLUETOOTH_SCAN") && !nf.t.b(context, null, "android.permission.BLUETOOTH_ADVERTISE")) {
                    z17 = false;
                }
                z18 = z17;
            }
            outRes.put("bluetoothAuthorized", be1.i1.a(be1.j1.f19478b, z18));
        }
        return jz5.f0.f302826a;
    }
}
