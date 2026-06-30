package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes11.dex */
public final class u7 extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f274555a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f274556b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.a f274557c;

    public u7(android.content.Context context, yz5.l onIPCallback, yz5.a onFinish, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        onFinish = (i17 & 4) != 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t7.f274521d : onFinish;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onIPCallback, "onIPCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFinish, "onFinish");
        this.f274555a = context;
        this.f274556b = onIPCallback;
        this.f274557c = onFinish;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        super.onAvailable(network);
        java.lang.Object systemService = this.f274555a.getSystemService("connectivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.LinkProperties linkProperties = ((android.net.ConnectivityManager) systemService).getLinkProperties(network);
        if (linkProperties != null) {
            java.util.List<android.net.LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkAddresses, "getLinkAddresses(...)");
            java.util.Iterator<android.net.LinkAddress> it = linkAddresses.iterator();
            while (it.hasNext()) {
                java.lang.String hostAddress = it.next().getAddress().getHostAddress();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimCardUtil", hashCode() + " onAvailable: " + hostAddress);
                if (hostAddress != null) {
                    this.f274556b.mo146xb9724478(hostAddress);
                }
            }
        }
        this.f274557c.mo152xb9724478();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        super.onUnavailable();
        this.f274557c.mo152xb9724478();
    }
}
