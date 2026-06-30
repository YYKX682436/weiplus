package com.tencent.luggage.webview.default_impl;

/* loaded from: classes8.dex */
public class f implements pf.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f47732d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.luggage.webview.default_impl.DefaultWebView f47733e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f47734f = new android.os.Handler(android.os.Looper.getMainLooper());

    public f(android.content.Context context) {
        this.f47732d = context;
        this.f47733e = new com.tencent.luggage.webview.default_impl.DefaultWebView(context);
    }

    @Override // pf.b
    public void a0(pf.a aVar) {
        com.tencent.luggage.webview.default_impl.a aVar2 = new com.tencent.luggage.webview.default_impl.a(this, aVar);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            aVar2.run();
        } else {
            this.f47734f.post(aVar2);
        }
    }

    @Override // od.p
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        com.tencent.luggage.webview.default_impl.c cVar = new com.tencent.luggage.webview.default_impl.c(this, obj, str);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            cVar.run();
        } else {
            this.f47734f.post(cVar);
        }
    }

    @Override // pf.b
    public boolean canGoBack() {
        return this.f47733e.canGoBack();
    }

    @Override // pf.b
    public void destroy() {
        this.f47733e.destroy();
    }

    @Override // od.p
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        com.tencent.luggage.webview.default_impl.d dVar = new com.tencent.luggage.webview.default_impl.d(this, str, valueCallback);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            dVar.run();
        } else {
            this.f47734f.post(dVar);
        }
    }

    @Override // pf.b
    public android.graphics.Bitmap f() {
        android.graphics.Picture capturePicture = this.f47733e.capturePicture();
        if (capturePicture == null) {
            return null;
        }
        int width = capturePicture.getWidth();
        int height = capturePicture.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/luggage/webview/default_impl/DefaultWebCore", "captureBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/luggage/webview/default_impl/DefaultWebCore", "captureBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    @Override // od.p
    public android.content.Context getContext() {
        return this.f47732d;
    }

    @Override // od.p
    public java.lang.String getUserAgent() {
        return "";
    }

    @Override // pf.b
    public android.view.View getView() {
        return this.f47733e;
    }

    @Override // pf.b
    public void goBack() {
        this.f47733e.goBack();
    }

    @Override // pf.b
    public void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f47733e.loadData(str, str2, str3);
    }

    @Override // pf.b
    public void loadUrl(java.lang.String str) {
        com.tencent.luggage.webview.default_impl.b bVar = new com.tencent.luggage.webview.default_impl.b(this, str);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            bVar.run();
        } else {
            this.f47734f.post(bVar);
        }
    }

    @Override // pf.b
    public void setContext(android.content.Context context) {
        android.content.Context context2 = this.f47732d;
        if (context2 instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) context2).setBaseContext(context);
        }
    }

    @Override // pf.b
    public void setWebCore(sd.o0 o0Var) {
    }

    @Override // pf.b
    public void stopLoading() {
        this.f47733e.stopLoading();
    }

    @Override // pf.b
    public void loadUrl(java.lang.String str, java.util.Map map) {
        this.f47733e.loadUrl(str, map);
    }
}
