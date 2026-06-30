package f04;

/* loaded from: classes8.dex */
public final class b implements f04.j {
    @Override // f04.j
    public int a(java.lang.Object obj, int i17, int i18) {
        f04.a request = (f04.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        if ((i17 * i18) / request.f339952c > 1.0f) {
            return (int) java.lang.Math.ceil((float) java.lang.Math.sqrt(r3));
        }
        return 1;
    }

    @Override // f04.j
    public android.graphics.Bitmap b(java.lang.Object obj, android.graphics.Bitmap bitmap) {
        f04.a request = (f04.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(request.f339956a);
        if (a17 != 90 && a17 != 270) {
            return bitmap;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiImageCompressStrategy", "onTransform needRotate: %d", java.lang.Integer.valueOf(a17));
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, a17);
    }

    @Override // f04.j
    public boolean c(int i17, int i18) {
        return true;
    }

    @Override // f04.j
    /* renamed from: name */
    public java.lang.String mo128614x337a8b() {
        return "MicroMsg.AiImageCompressStrategy";
    }
}
