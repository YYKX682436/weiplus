package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class y4 extends uh0.v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f f273542b;

    public y4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f activityC19732x78a3bb7f) {
        this.f273542b = activityC19732x78a3bb7f;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (this.f509272a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniQBReaderUI", "openReadFile, ignore ret = %d", num);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniQBReaderUI", "openReadFile, ret = %d", num);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f activityC19732x78a3bb7f = this.f273542b;
        com.p314xaae8f345.mm.p2829xfa87f9de.i.g(activityC19732x78a3bb7f, activityC19732x78a3bb7f.f272927i, activityC19732x78a3bb7f.f272928m, num.intValue());
        if (num.intValue() != 0) {
            activityC19732x78a3bb7f.finish();
        }
    }
}
