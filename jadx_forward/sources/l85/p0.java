package l85;

/* loaded from: classes7.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final l85.p0 f398736d = new l85.p0();

    public p0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.util.Pair it = (android.util.Pair) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicoMsg.proc.ServiceConnection", "detach service: " + ((java.lang.String) it.first) + '@' + ((java.lang.ref.WeakReference) it.second).get());
        try {
            android.content.ServiceConnection serviceConnection = (android.content.ServiceConnection) ((java.lang.ref.WeakReference) it.second).get();
            if (serviceConnection != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unbindService(serviceConnection);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicoMsg.proc.ServiceConnection", "unbindService fail: " + e17.getMessage());
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.stopService(new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, java.lang.Class.forName((java.lang.String) it.first)));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicoMsg.proc.ServiceConnection", "stopService fail: " + e18.getMessage());
        }
        return java.lang.Boolean.TRUE;
    }
}
