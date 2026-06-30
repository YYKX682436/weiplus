package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.c1 f256591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wm4.y f256592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f256593f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256594g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f256595h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256596i;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.c1 c1Var, wm4.y yVar, int i17, java.lang.String str, boolean z17) {
        this.f256596i = jVar;
        this.f256591d = c1Var;
        this.f256592e = yVar;
        this.f256593f = i17;
        this.f256594g = str;
        this.f256595h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256596i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d c19226x5a0e667d = jVar.f256524i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.c1 c1Var = this.f256591d;
        int width = c1Var.f256476b.getWidth();
        int height = c1Var.f256476b.getHeight();
        jVar.getClass();
        try {
            long c17 = c01.id.c();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.RGB_565;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "captureWebView", "(Lcom/tencent/mm/plugin/websearch/webview/WebSearchWebView;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "captureWebView", "(Lcom/tencent/mm/plugin/websearch/webview/WebSearchWebView;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            c19226x5a0e667d.s0(new android.graphics.Canvas(bitmap));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "captureWebView success, cost:" + (c01.id.c() - c17));
            qm4.a.a(true);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", th6, "captureWebView error", new java.lang.Object[0]);
            qm4.a.a(false);
            bitmap = null;
        }
        jVar.f256519d.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.n0(this, bitmap));
    }
}
