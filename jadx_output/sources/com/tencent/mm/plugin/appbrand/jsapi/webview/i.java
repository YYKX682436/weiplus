package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.webview.i f83891a = new com.tencent.mm.plugin.appbrand.jsapi.webview.i();

    /* renamed from: b, reason: collision with root package name */
    public static final jt0.j f83892b = new jt0.j(10);

    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.coroutines.Continuation continuation) {
        byte[] bArr = (byte[]) f83892b.get(str);
        if (bArr != null) {
            return bArr;
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs emojiFetcher$EmojiArgs = new com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs(str, str2, str3, str4, str5);
        uk0.a.b(emojiFetcher$EmojiArgs, com.tencent.mm.plugin.appbrand.jsapi.webview.g.f83887d, new com.tencent.mm.plugin.appbrand.jsapi.webview.h(emojiFetcher$EmojiArgs, rVar, str));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
