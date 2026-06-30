package f04;

/* loaded from: classes8.dex */
public final class e implements f04.j {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f339955a = jz5.h.b(f04.d.f339954d);

    @Override // f04.j
    public int a(java.lang.Object obj, int i17, int i18) {
        f04.c request = (f04.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        if ((i17 * i18) / ((java.lang.Number) ((jz5.n) this.f339955a).mo141623x754a37bb()).intValue() > 1.0f) {
            return (int) java.lang.Math.ceil((float) java.lang.Math.sqrt(r2));
        }
        return 1;
    }

    @Override // f04.j
    public android.graphics.Bitmap b(java.lang.Object obj, android.graphics.Bitmap bitmap) {
        f04.c request = (f04.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        if (bitmap == null || bitmap.isRecycled() || !request.f339953c) {
            return bitmap;
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(request.f339956a);
        if (a17 != 90 && a17 != 270) {
            return bitmap;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeImageCompressStrategy", "onTransform needRotate: %d", java.lang.Integer.valueOf(a17));
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, a17);
    }

    @Override // f04.j
    public boolean c(int i17, int i18) {
        if (i17 >= 4 && i18 >= 4) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanCodeImageCompressStrategy", "isSizeValid invalid width: " + i17 + ", height: " + i18);
        return false;
    }

    @Override // f04.j
    /* renamed from: name */
    public java.lang.String mo128614x337a8b() {
        return "MicroMsg.ScanCodeImageCompressStrategy";
    }
}
