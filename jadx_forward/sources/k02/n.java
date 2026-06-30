package k02;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lk02/n;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-downloader_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class n implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        int i17;
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String string = data.getString("appid");
        android.os.Bundle bundle = new android.os.Bundle();
        if (string == null || string.length() == 0) {
            bundle.putBoolean("isDownloaded", false);
        } else {
            h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(string);
            if (d17 != null && ((i17 = d17.f68441x10a0fed7) == 3 || i17 == 2 || i17 == 1)) {
                bundle.putBoolean("isDownloaded", true);
            }
        }
        return bundle;
    }
}
