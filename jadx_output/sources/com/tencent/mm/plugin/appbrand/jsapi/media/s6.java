package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes5.dex */
public class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82050d;

    public s6(com.tencent.mm.plugin.appbrand.jsapi.media.t6 t6Var, java.lang.String str) {
        this.f82050d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.k7b, q75.c.c(this.f82050d)), 1).show();
    }
}
