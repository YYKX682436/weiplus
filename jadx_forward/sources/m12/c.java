package m12;

/* loaded from: classes10.dex */
public final class c extends m12.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f404355f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f404356g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String inputPath, java.lang.String outputPath) {
        super(inputPath, outputPath);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPath, "inputPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        this.f404355f = outputPath;
    }

    @Override // m12.a
    public java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.graphics.Bitmap bitmap;
        if (a() && (bitmap = this.f404356g) != null) {
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, this.f404349b, this.f404350c, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap, "createScaledBitmap(...)");
            android.graphics.Rect rect = this.f404348a;
            int i17 = rect.left;
            int i18 = rect.top;
            int width = rect.width();
            int height = this.f404348a.height();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(createScaledBitmap);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/emoji/editor/generator/PhotoEmojiGenerator", "generate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/emoji/editor/generator/PhotoEmojiGenerator", "generate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            if (!createBitmap.isMutable()) {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Boolean.TRUE);
                arrayList2.add(config);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(createBitmap, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/editor/generator/PhotoEmojiGenerator", "generate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap copy = createBitmap.copy((android.graphics.Bitmap.Config) arrayList2.get(0), ((java.lang.Boolean) arrayList2.get(1)).booleanValue());
                yj0.a.e(createBitmap, copy, "com/tencent/mm/plugin/emoji/editor/generator/PhotoEmojiGenerator", "generate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copy, "copy(...)");
                createBitmap = copy;
            }
            android.graphics.Bitmap bitmap2 = this.f404351d;
            if (bitmap2 != null) {
                new android.graphics.Canvas(createBitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
            }
            java.lang.String str = this.f404355f;
            java.io.OutputStream K = com.p314xaae8f345.mm.vfs.w6.K(str, false);
            try {
                createBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, K);
                vz5.b.a(K, null);
                java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(str, true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i19);
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(i19);
                c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3158xb1f28fac, c01.z1.r());
                c1098xe10e35e9.m7362xaf634eb4();
                return java.lang.Boolean.TRUE;
            } finally {
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
