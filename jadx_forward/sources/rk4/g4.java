package rk4;

/* loaded from: classes14.dex */
public final class g4 {

    /* renamed from: a, reason: collision with root package name */
    public static final rk4.g4 f478207a = new rk4.g4();

    /* renamed from: b, reason: collision with root package name */
    public static final jm4.u5 f478208b;

    static {
        i95.n0.c(e70.q.class);
        int i17 = jm4.w5.f381970d;
        jm4.u5 u5Var = (jm4.u5) p3380x6a61f93.p3381xf512d0a5.C30462x21b41440.m169136x21b0d463();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u5Var);
        f478208b = u5Var;
    }

    public static final android.graphics.Bitmap a(rk4.g4 g4Var, byte[] bArr, bw5.tq0 tq0Var) {
        g4Var.getClass();
        int length = bArr.length;
        int i17 = tq0Var.f115113d;
        int i18 = tq0Var.f115114e;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/ting/TingBlurImage", "byteArray2Bitmap", "([BLcom/tencent/wechat/aff/proto/TingRGBAImageInfo;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/ting/TingBlurImage", "byteArray2Bitmap", "([BLcom/tencent/wechat/aff/proto/TingRGBAImageInfo;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        createBitmap.copyPixelsFromBuffer(java.nio.ByteBuffer.wrap(bArr));
        createBitmap.getWidth();
        createBitmap.getHeight();
        android.graphics.Bitmap.Config config2 = createBitmap.getConfig();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(config2);
        config2.name();
        createBitmap.isPremultiplied();
        return createBitmap;
    }

    public static final int b(rk4.g4 g4Var, bw5.rq0 rq0Var) {
        g4Var.getClass();
        return ((((int) ((rq0Var.f114189g * 255.0f) + 0.5f)) & 255) << 24) | ((((int) ((rq0Var.f114186d * 255.0f) + 0.5f)) & 255) << 16) | ((((int) ((rq0Var.f114187e * 255.0f) + 0.5f)) & 255) << 8) | (((int) ((rq0Var.f114188f * 255.0f) + 0.5f)) & 255);
    }

    public final jz5.l c(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingBlurImage", "bitmap2ByteArray in bitmap is null");
            return null;
        }
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        if (config != android.graphics.Bitmap.Config.ARGB_8888) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingBlurImage", "bitmap2ByteArray bitmap config invalid: %s", config);
            return null;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocateDirect);
        byte[] array = allocateDirect.array();
        int arrayOffset = allocateDirect.arrayOffset();
        if (arrayOffset > 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(array);
            array = kz5.z.o0(array, e06.p.m(arrayOffset, array.length));
        }
        bw5.tq0 tq0Var = new bw5.tq0();
        tq0Var.f115113d = bitmap.getWidth();
        boolean[] zArr = tq0Var.f115116g;
        zArr[1] = true;
        tq0Var.f115114e = bitmap.getHeight();
        zArr[2] = true;
        tq0Var.f115115f = 4;
        zArr[3] = true;
        return new jz5.l(array, tq0Var);
    }
}
