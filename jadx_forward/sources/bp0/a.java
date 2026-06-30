package bp0;

/* loaded from: classes10.dex */
public class a extends bp0.c {
    @Override // zo0.i
    public hp0.g a(cp0.n targetView, vo0.h reaper, jp0.f input) {
        android.graphics.Bitmap bitmap;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        java.io.InputStream b17 = input.b();
        pm0.c cVar = new pm0.c("InputStreamBitmapProducer");
        if (b17 != null) {
            yo0.i iVar = reaper.f520005b;
            int i18 = iVar.f545633e;
            bitmap = (i18 <= 0 || (i17 = iVar.f545634f) <= 0) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.h0(b17) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.P(b17, 0.0f, i17, i18, false);
        } else {
            bitmap = null;
        }
        if (b17 != null) {
            b17.reset();
            int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43588x80a06bca(b17).m43592x7a249f0b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.InputStreamBitmapProducer", "read exif rotate degree %d", java.lang.Integer.valueOf(m43592x7a249f0b));
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, m43592x7a249f0b * 1.0f);
        }
        cVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.InputStreamBitmapProducer", "InputStreamBitmapProducer decode bitmap done " + bitmap + " from input " + input);
        return new hp0.g(bitmap);
    }
}
