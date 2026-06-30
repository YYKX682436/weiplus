package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes7.dex */
public class d implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f296362a;

    public d(android.webkit.ValueCallback valueCallback) {
        this.f296362a = valueCallback;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesReaderLogic", "readFileByXWeb onReceiveValue: " + num);
        int intValue = num.intValue();
        android.webkit.ValueCallback valueCallback = this.f296362a;
        if (intValue == 0) {
            valueCallback.onReceiveValue(0);
        } else {
            valueCallback.onReceiveValue(-102);
        }
    }
}
