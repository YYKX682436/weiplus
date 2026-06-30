package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes8.dex */
public class a implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256710b;

    public a(java.lang.String str, java.lang.String str2) {
        this.f256709a = str;
        this.f256710b = str2;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryJsEventNotifier", "notifyJsEvent received value %s %s", this.f256709a, this.f256710b);
    }
}
