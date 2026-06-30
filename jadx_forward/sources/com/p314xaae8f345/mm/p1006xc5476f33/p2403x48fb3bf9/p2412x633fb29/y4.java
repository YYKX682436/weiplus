package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class y4 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z4 f264741c;

    public y4(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z4 z4Var) {
        this.f264739a = str;
        this.f264740b = str2;
        this.f264741c = z4Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        int i17 = bVar.f441064a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z4 z4Var = this.f264741c;
        if (i17 != 0 || bVar.f441067d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a5.b(z4Var, false);
            return;
        }
        int g17 = (int) (i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) * 48.0f);
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bVar.f441067d, g17, g17, false);
        if (createScaledBitmap != null) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Boolean.TRUE);
            arrayList.add(config);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(createScaledBitmap, arrayList.toArray(), "com/tencent/mm/plugin/webview/model/WebViewShortcutManager$1", "onImageLoadFinish", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/modelimage/loader/model/Response;)V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            bitmap = createScaledBitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
            yj0.a.e(createScaledBitmap, bitmap, "com/tencent/mm/plugin/webview/model/WebViewShortcutManager$1", "onImageLoadFinish", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/modelimage/loader/model/Response;)V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewShortcutManager", "bitmap recycle %s", createScaledBitmap);
            createScaledBitmap.recycle();
        } else {
            bitmap = null;
        }
        android.content.Intent a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a5.a(bitmap, this.f264739a, this.f264740b, true);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewShortcutManager", "intent is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a5.b(z4Var, false);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.x4(this, a17), 500L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a5.b(z4Var, true);
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
