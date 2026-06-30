package lj2;

/* loaded from: classes10.dex */
public final class f implements ep0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lj2.j f400387a;

    public f(lj2.j jVar) {
        this.f400387a = jVar;
    }

    public boolean a(ip0.a aVar, hp0.g gVar) {
        android.graphics.Bitmap bitmap = gVar != null ? (android.graphics.Bitmap) gVar.f364446a : null;
        android.graphics.Bitmap bitmap2 = bitmap instanceof android.graphics.Bitmap ? bitmap : null;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return true;
        }
        int pixel = bitmap2.getPixel(bitmap2.getWidth() / 2, bitmap2.getHeight() / 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400387a.m145853xb5886c64(), "checkLocalFileValid url: " + aVar + " middlePixel: " + pixel + " hasAlpha: " + bitmap2.hasAlpha() + " bitmapSize: " + bitmap2.getByteCount());
        return (pixel == 0 || bitmap2.hasAlpha()) ? false : true;
    }
}
