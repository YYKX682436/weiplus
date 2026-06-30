package bz;

/* loaded from: classes10.dex */
public final class a implements zy.w {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f118150e = new java.util.concurrent.ConcurrentHashMap(kz5.b1.e(new jz5.l(zy.x.f558836e, new bz.w("resource_downloader_2"))));

    /* renamed from: d, reason: collision with root package name */
    public final zy.x f118151d;

    public a(zy.x workspaceFolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workspaceFolder, "workspaceFolder");
        this.f118151d = workspaceFolder;
    }

    public final bz.w b() {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f118150e;
        zy.x xVar = this.f118151d;
        java.lang.Object obj = concurrentHashMap.get(xVar);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(xVar, (obj = new bz.w(xVar.f558839d)))) != null) {
            obj = putIfAbsent;
        }
        return (bz.w) obj;
    }

    public java.lang.String c(java.lang.String str, java.lang.String nameAppendix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameAppendix, "nameAppendix");
        return str == null || str.length() == 0 ? "" : b().e(str, nameAppendix);
    }

    public boolean f(java.lang.String str, java.lang.String nameAppendix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameAppendix, "nameAppendix");
        bz.w b17 = b();
        if (str == null || str.length() == 0) {
            return false;
        }
        return com.p314xaae8f345.mm.vfs.w6.j(b17.e(str, nameAppendix));
    }
}
