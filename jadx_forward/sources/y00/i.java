package y00;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540063d;

    public i(java.lang.String str) {
        this.f540063d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.util.LruCache lruCache;
        android.util.LruCache lruCache2 = y00.h.f540060a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalStateException(("EcsKfProductCardMemCache.removeByTalker must be called on main thread, actual=" + java.lang.Thread.currentThread().getName()).toString());
        }
        java.lang.String str = this.f540063d;
        if ((str == null || str.length() == 0) || (lruCache = (android.util.LruCache) y00.h.f540060a.remove(str)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardMemCache", "removeByTalker: talker=%s removed=%d", str, java.lang.Integer.valueOf(lruCache.size()));
    }
}
