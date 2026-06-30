package jt0;

/* loaded from: classes4.dex */
public class d implements jt0.h {
    @Override // jt0.h
    public int a(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
        if (weakReference == null || (bitmap = (android.graphics.Bitmap) weakReference.get()) == null || bitmap.isRecycled()) {
            return 0;
        }
        return fp.h.a(19) ? bitmap.getByteCount() : bitmap.getAllocationByteCount();
    }
}
