package jt0;

/* loaded from: classes4.dex */
public class c implements jt0.h {
    @Override // jt0.h
    public int a(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        return fp.h.a(19) ? bitmap.getByteCount() : bitmap.getAllocationByteCount();
    }
}
