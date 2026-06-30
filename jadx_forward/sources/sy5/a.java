package sy5;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.ConnectivityManager f495429a;

    public a(android.net.ConnectivityManager connectivityManager) {
        this.f495429a = connectivityManager;
    }

    public java.util.List a(android.net.NetworkCapabilities networkCapabilities) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc);
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc);
        }
        return arrayList;
    }
}
