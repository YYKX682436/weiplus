package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes7.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.profile.d f87712a;

    public w(com.tencent.mm.plugin.appbrand.profile.d dVar) {
        this.f87712a = dVar;
    }

    @android.webkit.JavascriptInterface
    public boolean isProfileFromStart() {
        return ((com.tencent.mm.plugin.appbrand.profile.o) this.f87712a).f87698g;
    }

    @android.webkit.JavascriptInterface
    public void onExternalInspectMessage(java.lang.String str) {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.w("Luggage.ProfileGlobalJSInterface", "onExternalInspectMessage data:%s", str);
        this.f87712a.m(str);
    }

    @android.webkit.JavascriptInterface
    public void onInspectMessage(java.lang.String str) {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.w("Luggage.ProfileGlobalJSInterface", "onInspectorMsg data:%s", str);
        this.f87712a.s(str);
    }

    @android.webkit.JavascriptInterface
    public void profileStart() {
        this.f87712a.I();
    }

    @android.webkit.JavascriptInterface
    public java.lang.String profileStop() {
        return this.f87712a.L1();
    }

    @android.webkit.JavascriptInterface
    public void sendExternalInspectMessage(java.lang.String str) {
        this.f87712a.s(str);
    }

    @android.webkit.JavascriptInterface
    public void sendInspectMessage(java.lang.String str) {
        this.f87712a.m(str);
    }
}
