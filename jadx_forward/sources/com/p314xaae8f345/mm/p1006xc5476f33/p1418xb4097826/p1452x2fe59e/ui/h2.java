package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h2 f191635a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h2();

    /* renamed from: b, reason: collision with root package name */
    public static android.graphics.Bitmap f191636b;

    /* renamed from: c, reason: collision with root package name */
    public static android.graphics.Bitmap f191637c;

    /* renamed from: d, reason: collision with root package name */
    public static android.graphics.Bitmap f191638d;

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        android.view.View inflate;
        r45.cl2 cl2Var;
        if (context == null || abstractC14490x69736cb5 == null) {
            return null;
        }
        r45.dm2 m76806xdef68064 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
        if ((m76806xdef68064 == null || (cl2Var = (r45.cl2) m76806xdef68064.m75936x14adae67(4)) == null) ? false : cl2Var.m75933x41a8a7f2(9)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLivingTag", "getAdsTagSpan ignoreAdsTag true");
            return null;
        }
        if (!hc2.o0.E(abstractC14490x69736cb5.getFeedObject().getFeedObject(), false, 1, null)) {
            return null;
        }
        if (f191637c == null && (inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570419dr5, (android.view.ViewGroup) null)) != null) {
            inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
            int measuredWidth = inflate.getMeasuredWidth();
            int measuredHeight = inflate.getMeasuredHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedLivingTag", "getAdsTagSpan", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedLivingTag", "getAdsTagSpan", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            f191637c = createBitmap;
            android.graphics.Bitmap bitmap = f191637c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            canvas.drawColor(0);
            inflate.draw(canvas);
        }
        android.graphics.Bitmap bitmap2 = f191637c;
        if (bitmap2 != null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq(context, bitmap2);
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        if (context == null || abstractC14490x69736cb5 == null || !zl2.q4.f555466a.C(abstractC14490x69736cb5)) {
            return null;
        }
        android.graphics.Bitmap bitmap = f191636b;
        if (bitmap != null) {
            if (bitmap != null) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq(context, bitmap);
            }
            return null;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dcy, (android.view.ViewGroup) null);
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
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(measuredHeight));
        arrayList.add(java.lang.Integer.valueOf(measuredWidth));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedLivingTag", "getLivingTagSpan", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedLivingTag", "getLivingTagSpan", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Lcom/tencent/mm/plugin/finder/feed/ui/VerticalAlignImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        f191636b = createBitmap;
        if (createBitmap == null) {
            return null;
        }
        inflate.draw(new android.graphics.Canvas(createBitmap));
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq(context, createBitmap);
    }
}
