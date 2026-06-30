package com.tencent.mm.feature.lite;

/* loaded from: classes14.dex */
public class a1 implements com.tencent.liteapp.ui.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.c0 f67121a;

    public a1(com.tencent.mm.feature.lite.i iVar, q80.c0 c0Var) {
        this.f67121a = c0Var;
    }

    public void a(android.graphics.Bitmap bitmap) {
        cv4.a aVar = (cv4.a) this.f67121a;
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("LiteAppJsApiAddMinimizeTask", "dl: onScreenshotCaptured, bitmap %s", bitmap);
        zv4.g gVar = zv4.h.f476461a;
        android.content.Context context = aVar.f222580a;
        kotlin.jvm.internal.o.f(context, "$context");
        gVar.a((android.app.Activity) context, aVar.f222581b, aVar.f222582c, bitmap);
    }
}
