package bp0;

/* loaded from: classes10.dex */
public class a extends bp0.c {
    @Override // zo0.i
    public hp0.g a(cp0.n targetView, vo0.h reaper, jp0.f input) {
        android.graphics.Bitmap bitmap;
        int i17;
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        kotlin.jvm.internal.o.g(input, "input");
        java.io.InputStream b17 = input.b();
        pm0.c cVar = new pm0.c("InputStreamBitmapProducer");
        if (b17 != null) {
            yo0.i iVar = reaper.f438472b;
            int i18 = iVar.f464100e;
            bitmap = (i18 <= 0 || (i17 = iVar.f464101f) <= 0) ? com.tencent.mm.sdk.platformtools.x.h0(b17) : com.tencent.mm.sdk.platformtools.x.P(b17, 0.0f, i17, i18, false);
        } else {
            bitmap = null;
        }
        if (b17 != null) {
            b17.reset();
            int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromStream(b17).getOrientationInDegree();
            com.tencent.mars.xlog.Log.i("MicroMsg.Loader.InputStreamBitmapProducer", "read exif rotate degree %d", java.lang.Integer.valueOf(orientationInDegree));
            bitmap = com.tencent.mm.sdk.platformtools.x.w0(bitmap, orientationInDegree * 1.0f);
        }
        cVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.Loader.InputStreamBitmapProducer", "InputStreamBitmapProducer decode bitmap done " + bitmap + " from input " + input);
        return new hp0.g(bitmap);
    }
}
