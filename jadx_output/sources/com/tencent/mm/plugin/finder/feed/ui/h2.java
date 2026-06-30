package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.ui.h2 f110102a = new com.tencent.mm.plugin.finder.feed.ui.h2();

    /* renamed from: b, reason: collision with root package name */
    public static android.graphics.Bitmap f110103b;

    /* renamed from: c, reason: collision with root package name */
    public static android.graphics.Bitmap f110104c;

    /* renamed from: d, reason: collision with root package name */
    public static android.graphics.Bitmap f110105d;

    public final com.tencent.mm.plugin.finder.feed.ui.sq a(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        android.view.View inflate;
        r45.cl2 cl2Var;
        if (context == null || baseFinderFeed == null) {
            return null;
        }
        r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        if ((object_extend == null || (cl2Var = (r45.cl2) object_extend.getCustom(4)) == null) ? false : cl2Var.getBoolean(9)) {
            com.tencent.mars.xlog.Log.i("FinderFeedLivingTag", "getAdsTagSpan ignoreAdsTag true");
            return null;
        }
        if (!hc2.o0.E(baseFinderFeed.getFeedObject().getFeedObject(), false, 1, null)) {
            return null;
        }
        if (f110104c == null && (inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488886dr5, (android.view.ViewGroup) null)) != null) {
            inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
            int measuredWidth = inflate.getMeasuredWidth();
            int measuredHeight = inflate.getMeasuredHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedLivingTag", "getAdsTagSpan", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedLivingTag", "getAdsTagSpan", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            f110104c = createBitmap;
            android.graphics.Bitmap bitmap = f110104c;
            kotlin.jvm.internal.o.d(bitmap);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            canvas.drawColor(0);
            inflate.draw(canvas);
        }
        android.graphics.Bitmap bitmap2 = f110104c;
        if (bitmap2 != null) {
            return new com.tencent.mm.plugin.finder.feed.ui.sq(context, bitmap2);
        }
        return null;
    }

    public final com.tencent.mm.plugin.finder.feed.ui.sq b(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        if (context == null || baseFinderFeed == null || !zl2.q4.f473933a.C(baseFinderFeed)) {
            return null;
        }
        android.graphics.Bitmap bitmap = f110103b;
        if (bitmap != null) {
            if (bitmap != null) {
                return new com.tencent.mm.plugin.finder.feed.ui.sq(context, bitmap);
            }
            return null;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dcy, (android.view.ViewGroup) null);
        if (inflate == null) {
            return null;
        }
        inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
        int measuredWidth = inflate.getMeasuredWidth();
        int measuredHeight = inflate.getMeasuredHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(measuredHeight));
        arrayList.add(java.lang.Integer.valueOf(measuredWidth));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedLivingTag", "getLivingTagSpan", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedLivingTag", "getLivingTagSpan", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        f110103b = createBitmap;
        if (createBitmap == null) {
            return null;
        }
        inflate.draw(new android.graphics.Canvas(createBitmap));
        return new com.tencent.mm.plugin.finder.feed.ui.sq(context, createBitmap);
    }
}
