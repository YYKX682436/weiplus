package ak4;

/* loaded from: classes10.dex */
public final class e extends android.util.LruCache {
    public e() {
        super(100);
    }

    @Override // android.util.LruCache
    public int sizeOf(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        return 1;
    }
}
