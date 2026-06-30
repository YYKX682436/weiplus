package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes7.dex */
public final class m implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87693a;

    public m(java.lang.String str) {
        this.f87693a = str;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", "onInspectorMsg it:" + ((java.lang.String) obj) + " msg:" + this.f87693a);
    }
}
