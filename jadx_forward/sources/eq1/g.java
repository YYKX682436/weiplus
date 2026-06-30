package eq1;

/* loaded from: classes8.dex */
public final class g implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f337340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f337342c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f337343d;

    public g(android.widget.ImageView imageView, java.lang.String str, int i17, int i18) {
        this.f337340a = imageView;
        this.f337341b = str;
        this.f337342c = i17;
        this.f337343d = i18;
    }

    @Override // p11.h
    public void a(java.lang.String url, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b imageData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        eq1.h hVar = eq1.h.f337345a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "onImageLoadFinish");
        if (imageData.f441067d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "imageData.bitmap == null");
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = 5;
        byte[] a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(imageData.f441067d);
        int length = a17.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(a17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/biz/util/BizChatLiveUtil$setCover$1", "onImageLoadFinish", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/modelimage/loader/model/Response;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(3));
        yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/biz/util/BizChatLiveUtil$setCover$1", "onImageLoadFinish", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/modelimage/loader/model/Response;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        this.f337340a.setTag(com.p314xaae8f345.mm.R.id.bph, this.f337341b);
        ((ku5.t0) ku5.t0.f394148d).B(new eq1.f(this.f337340a, decodeByteArray, this.f337341b, this.f337342c, this.f337343d));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String url, android.view.View view, q11.b imageData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        android.graphics.Bitmap bitmap = imageData.f441067d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "bitmap");
        return bitmap;
    }
}
