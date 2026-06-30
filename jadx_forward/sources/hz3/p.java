package hz3;

/* loaded from: classes12.dex */
public class p implements hz3.a0 {
    @Override // hz3.a0
    public void a(ry3.p request, hz3.z zVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        hz3.s sVar = new hz3.s(request.f483060a, 3);
        java.lang.String imagePath = request.f483064e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imagePath, "imagePath");
        sVar.f367888b = imagePath;
        java.lang.String str = request.f483064e;
        android.graphics.Point point = null;
        if (!(str == null || str.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(str)) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.p314xaae8f345.mm.p786x600aa8b.e.d(str, options);
            point = new android.graphics.Point(options.outWidth, options.outHeight);
        }
        sVar.f367889c = point;
        sVar.f367892f = 1;
        sVar.f367893g = true;
        b(request, sVar, new hz3.o(zVar));
    }

    public final void b(ry3.p request, hz3.s checkImageRequest, hz3.r callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkImageRequest, "checkImageRequest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new hz3.n(request, checkImageRequest, callback, null), 3, null);
    }

    @Override // hz3.a0
    /* renamed from: name */
    public java.lang.String mo134285x337a8b() {
        return "MicroMsg.AiScanDefaultImageCDNStrategy";
    }
}
