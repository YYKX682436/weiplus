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
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(drawable, "drawable");
        return 1;
    }
}
