package o21;

/* loaded from: classes.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f423937d;

    public a(android.os.Bundle bundle) {
        this.f423937d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.String string = this.f423937d.getString("mm_event_class");
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Class.forName(string).newInstance());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewMMReportUtil", "webview callback report className[%s]", string);
            throw null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewMMReportUtil", e17, "receiveWebViewCallback error", new java.lang.Object[0]);
        }
    }
}
