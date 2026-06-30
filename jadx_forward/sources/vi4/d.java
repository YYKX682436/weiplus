package vi4;

/* loaded from: classes4.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final vi4.d f519141d = new vi4.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(null);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.btk));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/download/TextStatusLoader$unReadIcon$2", "invoke", "()Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(2));
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/textstatus/download/TextStatusLoader$unReadIcon$2", "invoke", "()Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeResource;
    }
}
