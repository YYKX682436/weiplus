package xq1;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.p3210x3857dc.h1 {
    public c(r45.sn snVar, xq1.g gVar) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxWebChromeClient", "shouldOverrideUrlLoading %s", str);
        return this instanceof j82.h;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxWebChromeClient", "onPageFinished %s  %d", str, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxWebChromeClient", "onPageStarted %s %d", str, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }
}
