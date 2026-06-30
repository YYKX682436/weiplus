package ub2;

/* loaded from: classes4.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f507616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.graphics.Bitmap bitmap, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f507616d = bitmap;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ub2.m(this.f507616d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ub2.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        android.graphics.Bitmap bitmap2 = this.f507616d;
        float height = 320.0f / (bitmap2.getWidth() >= bitmap2.getHeight() ? bitmap2.getHeight() : bitmap2.getWidth());
        if (height < 1.0f) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(height, height);
            int width = bitmap2.getWidth();
            int height2 = bitmap2.getHeight();
            zj0.a aVar2 = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            aVar2.c(java.lang.Boolean.TRUE);
            aVar2.c(matrix);
            aVar2.c(java.lang.Integer.valueOf(height2));
            aVar2.c(java.lang.Integer.valueOf(width));
            aVar2.c(0);
            aVar2.c(0);
            aVar2.c(bitmap2);
            java.lang.Object obj2 = new java.lang.Object();
            yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/plugin/finder/core/WatermarkDetCore", "convert", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            bitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
            yj0.a.e(obj2, bitmap, "com/tencent/mm/plugin/finder/core/WatermarkDetCore", "convert", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        } else {
            bitmap = bitmap2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
        if (bitmap.getConfig() != config) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList.add(java.lang.Boolean.TRUE);
            arrayList.add(config);
            java.util.Collections.reverse(arrayList);
            android.graphics.Bitmap bitmap3 = bitmap;
            yj0.a.d(bitmap3, arrayList.toArray(), "com/tencent/mm/plugin/finder/core/WatermarkDetCore", "convert", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap copy = bitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
            yj0.a.e(bitmap3, copy, "com/tencent/mm/plugin/finder/core/WatermarkDetCore", "convert", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(copy);
            bitmap = copy;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int length = array.length / 4;
        int i17 = length * 3;
        byte[] bArr = new byte[i17];
        java.util.Iterator it = e06.p.m(0, length).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            int i18 = b17 * 3;
            int i19 = b17 * 4;
            bArr[i18] = array[i19];
            bArr[i18 + 1] = array[i19 + 1];
            bArr[i18 + 2] = array[i19 + 2];
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        allocateDirect.put(bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WatermarkDetCore", "handle bitmap time: " + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + ", width:" + bitmap2.getWidth() + " height:" + bitmap2.getHeight() + " new width:" + bitmap.getWidth() + " new height:" + bitmap.getHeight());
        return new jz5.l(allocateDirect, new jz5.l(new java.lang.Integer(bitmap.getWidth()), new java.lang.Integer(bitmap.getHeight())));
    }
}
