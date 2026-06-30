package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes5.dex */
public final class wa extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f255940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255941e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078) {
        super(0);
        this.f255940d = bitmap;
        this.f255941e = activityC18639xf6f98078;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2 = this.f255940d;
        if (bitmap2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255099u2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255941e;
            activityC18639xf6f98078.q7().setImageBitmap(bitmap2);
            activityC18639xf6f98078.q7().setVisibility(0);
            android.widget.FrameLayout frameLayout = activityC18639xf6f98078.C;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            try {
                ib5.k kVar = new ib5.k(activityC18639xf6f98078);
                android.graphics.Bitmap.Config config = bitmap2.getConfig();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(config);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Boolean.TRUE);
                arrayList.add(config);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(bitmap2, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/util/UIHelper", "blurBitmap", "(Landroid/graphics/Bitmap;Landroid/content/Context;F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                bitmap = bitmap2.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
                yj0.a.e(bitmap2, bitmap, "com/tencent/mm/plugin/textstatus/util/UIHelper", "blurBitmap", "(Landroid/graphics/Bitmap;Landroid/content/Context;F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                if (bitmap == null) {
                    bitmap = null;
                } else {
                    kVar.b(bitmap, 10.0f);
                    kVar.mo135041x5cd39ffa();
                }
            } catch (java.lang.Throwable unused) {
                bitmap = bitmap2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255102x2 = bitmap;
            activityC18639xf6f98078.C1 = bitmap2;
            activityC18639xf6f98078.Q7();
        }
        return jz5.f0.f384359a;
    }
}
