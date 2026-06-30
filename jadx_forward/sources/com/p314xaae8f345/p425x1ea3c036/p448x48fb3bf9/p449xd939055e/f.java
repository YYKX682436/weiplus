package com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e;

/* loaded from: classes8.dex */
public class f implements pf.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f129265d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.C3957x84a7e2b8 f129266e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f129267f = new android.os.Handler(android.os.Looper.getMainLooper());

    public f(android.content.Context context) {
        this.f129265d = context;
        this.f129266e = new com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.C3957x84a7e2b8(context);
    }

    @Override // pf.b
    public void a0(pf.a aVar) {
        com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.a aVar2 = new com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.a(this, aVar);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            aVar2.run();
        } else {
            this.f129267f.post(aVar2);
        }
    }

    @Override // od.p
    /* renamed from: addJavascriptInterface */
    public void mo32257x74041feb(java.lang.Object obj, java.lang.String str) {
        com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.c cVar = new com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.c(this, obj, str);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            cVar.run();
        } else {
            this.f129267f.post(cVar);
        }
    }

    @Override // pf.b
    /* renamed from: canGoBack */
    public boolean mo32258xed1a21df() {
        return this.f129266e.canGoBack();
    }

    @Override // pf.b
    /* renamed from: destroy */
    public void mo32259x5cd39ffa() {
        this.f129266e.destroy();
    }

    @Override // od.p
    /* renamed from: evaluateJavascript */
    public void mo32260x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.d dVar = new com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.d(this, str, valueCallback);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            dVar.run();
        } else {
            this.f129267f.post(dVar);
        }
    }

    @Override // pf.b
    public android.graphics.Bitmap f() {
        android.graphics.Picture capturePicture = this.f129266e.capturePicture();
        if (capturePicture == null) {
            return null;
        }
        int width = capturePicture.getWidth();
        int height = capturePicture.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
    /* renamed from: getContext */
    public android.content.Context mo32261x76847179() {
        return this.f129265d;
    }

    @Override // od.p
    /* renamed from: getUserAgent */
    public java.lang.String mo32054x11fd7f44() {
        return "";
    }

    @Override // pf.b
    /* renamed from: getView */
    public android.view.View mo32262xfb86a31b() {
        return this.f129266e;
    }

    @Override // pf.b
    /* renamed from: goBack */
    public void mo32263xb5fed1ef() {
        this.f129266e.goBack();
    }

    @Override // pf.b
    /* renamed from: loadData */
    public void mo32264x6dfa45b0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f129266e.loadData(str, str2, str3);
    }

    @Override // pf.b
    /* renamed from: loadUrl */
    public void mo32265x141096a9(java.lang.String str) {
        com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.b bVar = new com.p314xaae8f345.p425x1ea3c036.p448x48fb3bf9.p449xd939055e.b(this, str);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            bVar.run();
        } else {
            this.f129267f.post(bVar);
        }
    }

    @Override // pf.b
    /* renamed from: setContext */
    public void mo32267xe9f5beed(android.content.Context context) {
        android.content.Context context2 = this.f129265d;
        if (context2 instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) context2).setBaseContext(context);
        }
    }

    @Override // pf.b
    /* renamed from: setWebCore */
    public void mo32268xfa22ae51(sd.o0 o0Var) {
    }

    @Override // pf.b
    /* renamed from: stopLoading */
    public void mo32269xc77ccada() {
        this.f129266e.stopLoading();
    }

    @Override // pf.b
    /* renamed from: loadUrl */
    public void mo32266x141096a9(java.lang.String str, java.util.Map map) {
        this.f129266e.loadUrl(str, map);
    }
}
