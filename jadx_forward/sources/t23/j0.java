package t23;

/* loaded from: classes10.dex */
public class j0 implements kk.h {
    public j0(t23.o0 o0Var) {
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap;
        t23.m0 m0Var = (t23.m0) obj2;
        if (m0Var == null || (bitmap = m0Var.f496738a) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCache", "bitmap recycle %s.", bitmap.toString());
        bitmap.recycle();
    }
}
