package be1;

/* loaded from: classes7.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final be1.g1 f101004d = new be1.g1();

    public g1() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Context context = (android.content.Context) obj;
        java.util.Map outRes = (java.util.Map) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRes, "outRes");
        if (context != null) {
            boolean z17 = true;
            boolean z18 = android.bluetooth.BluetoothAdapter.getDefaultAdapter() != null;
            if (z18 && android.os.Build.VERSION.SDK_INT >= 31) {
                if (!nf.t.b(context, null, "android.permission.BLUETOOTH_CONNECT") && !nf.t.b(context, null, "android.permission.BLUETOOTH_SCAN") && !nf.t.b(context, null, "android.permission.BLUETOOTH_ADVERTISE")) {
                    z17 = false;
                }
                z18 = z17;
            }
            outRes.put("bluetoothAuthorized", be1.i1.a(be1.j1.f101011b, z18));
        }
        return jz5.f0.f384359a;
    }
}
