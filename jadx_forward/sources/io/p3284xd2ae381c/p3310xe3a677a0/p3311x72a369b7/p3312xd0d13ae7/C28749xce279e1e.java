package io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "(Landroid/net/ConnectivityManager;)V", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "networkType", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkTypeLegacy", "flutter-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivity */
/* loaded from: classes11.dex */
public final class C28749xce279e1e {
    private final android.net.ConnectivityManager connectivityManager;

    public C28749xce279e1e(android.net.ConnectivityManager connectivityManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connectivityManager, "connectivityManager");
        this.connectivityManager = connectivityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: networkTypeLegacy */
    public final java.lang.String m138866x85cb7071() {
        android.net.NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                if (type != 4 && type != 5) {
                    if (type != 6 && type != 9) {
                        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
                    }
                }
            }
            return "wifi";
        }
        return "mobile";
    }

    public final android.net.ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    /* renamed from: networkType */
    public final java.lang.Object m138868x8c549688(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super java.lang.String> interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28750xfdeb0510(this, null), interfaceC29045xdcb5ca57);
    }
}
