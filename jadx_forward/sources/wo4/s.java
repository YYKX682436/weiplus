package wo4;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f529821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(wo4.y yVar) {
        super(2);
        this.f529821d = yVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.nio.IntBuffer buffer = (java.nio.IntBuffer) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "on snapshot callback, buffer:" + buffer + ", frameCount:" + intValue);
        wo4.y yVar = this.f529821d;
        if (yVar.f529846t && intValue >= 1) {
            buffer.position(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l1 l1Var = yVar.f529828b;
            int i17 = l1Var.f257192d;
            int i18 = l1Var.f257193e;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj3, arrayList.toArray(), "com/tencent/mm/plugin/vlog/remux/VLogRemuxer$remuxVideo$1$3", "invoke", "(Ljava/nio/IntBuffer;I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/vlog/remux/VLogRemuxer$remuxVideo$1$3", "invoke", "(Ljava/nio/IntBuffer;I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            createBitmap.copyPixelsFromBuffer(buffer);
            android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
            java.lang.String str = yVar.f529847u;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createBitmap, 60, compressFormat, str, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "remuxForThumb finish, thumbPath:" + str + ", thumb:[" + createBitmap.getWidth() + ", " + createBitmap.getHeight() + ']');
            yVar.f529846t = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "release");
            yVar.b();
            yVar.f529844r.b();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new wo4.r(yVar));
        }
        return jz5.f0.f384359a;
    }
}
