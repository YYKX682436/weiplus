package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class k5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f266032a;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6 activityC19402x2b328b6) {
        this.f266032a = null;
        this.f266032a = new java.lang.ref.WeakReference(activityC19402x2b328b6);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: onHtmlContentReport */
    public void m74463x2f0e7903(java.lang.String str) {
        java.lang.ref.WeakReference weakReference = this.f266032a;
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosWebViewUI", "onHtmlContentReport webViewUIWeakReference is null.");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6 activityC19402x2b328b6 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6) weakReference.get();
        if (activityC19402x2b328b6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6.m9(activityC19402x2b328b6, str, 0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosWebViewUI", "onHtmlContentReport tmpSosWebViewUI is null.");
        }
    }
}
