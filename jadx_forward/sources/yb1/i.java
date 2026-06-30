package yb1;

/* loaded from: classes.dex */
public final class i implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f542191a;

    public i(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f542191a = qVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPageContentService", "html webview execute javascript: " + str);
        ((p3325xe03a0797.p3326xc267989b.r) this.f542191a).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str));
    }
}
