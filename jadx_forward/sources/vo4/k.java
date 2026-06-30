package vo4;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final vo4.k f520182a = new vo4.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f520183b = new java.util.concurrent.ConcurrentHashMap();

    public static void b(vo4.k kVar, java.lang.String path, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, java.lang.Object obj) {
        int i39 = (i38 & 8) != 0 ? 0 : i19;
        int i47 = (i38 & 16) != 0 ? -1 : i27;
        int i48 = (i38 & 32) != 0 ? -1 : i28;
        int i49 = (i38 & 64) != 0 ? -1 : i29;
        int i57 = (i38 & 128) != 0 ? -1 : i37;
        kVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (path.length() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogMaterialsInfoCache", "putCache, path:" + path + ", width:" + i17 + ", height:height, rotate:" + i39 + ", cropLeft:" + i47 + ", cropTop:" + i48 + ", cropRight:" + i49 + ", cropBottom:" + i57);
            f520183b.put(path, new vo4.a(i17, i18, i39, i47, i48, i49, i57));
        }
    }

    public final vo4.a a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (path.length() == 0) {
            return null;
        }
        return (vo4.a) f520183b.get(path);
    }
}
