package by0;

/* loaded from: classes15.dex */
public final class r extends bp0.b {
    @Override // zo0.i
    public hp0.g a(cp0.n targetView, vo0.h reaper, jp0.f input) {
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        kotlin.jvm.internal.o.g(input, "input");
        s7.t2 g17 = new s7.r3().g(input.b(), true);
        int ceil = (int) java.lang.Math.ceil(g17.c());
        int ceil2 = (int) java.lang.Math.ceil(g17.b());
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(ceil2));
        arrayList.add(java.lang.Integer.valueOf(ceil));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/utils/McSvgLoader$SvgBitmapProducer", "asResource", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;Lcom/tencent/mm/loader/Reaper;Lcom/tencent/mm/loader/model/datasource/DataSource;)Lcom/tencent/mm/loader/model/Resource;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/mj_publisher/finder/utils/McSvgLoader$SvgBitmapProducer", "asResource", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;Lcom/tencent/mm/loader/Reaper;Lcom/tencent/mm/loader/model/datasource/DataSource;)Lcom/tencent/mm/loader/model/Resource;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        g17.f(new android.graphics.Canvas(createBitmap));
        return new hp0.g(createBitmap);
    }
}
