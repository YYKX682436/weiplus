package wf;

/* loaded from: classes7.dex */
public class h implements tf.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.b f527001a;

    public h(wf.b bVar) {
        this.f527001a = bVar;
    }

    @Override // tf.s
    public void d(tf.m mVar) {
        this.f527001a.x(mVar);
    }

    @Override // tf.s
    public android.graphics.Bitmap g() {
        synchronized (this.f527001a) {
            android.graphics.Bitmap bitmap = this.f527001a.Z;
            if (bitmap == null || bitmap.isRecycled()) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(bitmap);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/luggage/xweb_ext/extendplugin/component/live/liveplayer/LivePlayerPluginHandler$15", "getSnapshotCached", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0));
            yj0.a.e(obj, createBitmap, "com/tencent/luggage/xweb_ext/extendplugin/component/live/liveplayer/LivePlayerPluginHandler$15", "getSnapshotCached", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;");
            return createBitmap;
        }
    }
}
