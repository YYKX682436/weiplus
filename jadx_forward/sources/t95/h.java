package t95;

/* loaded from: classes11.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f498126a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f498127b;

    static {
        java.lang.String str = java.io.File.separator;
        f498126a = str;
        f498127b = "testfile" + ((java.lang.Object) str) + "temp" + ((java.lang.Object) str);
    }

    public static final java.io.File a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f498127b;
        java.lang.String separator = f498126a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(separator, "separator");
        sb6.append(r26.i0.o(str, separator, false, 2, null) ? f498127b : p3321xbce91901.jvm.p3324x21ffc6bd.o.m(f498127b, separator));
        sb6.append("mm_compressor_");
        sb6.append(java.lang.System.nanoTime());
        sb6.append(".file");
        java.io.File file = new java.io.File(sb6.toString());
        if (file.exists()) {
            file.delete();
        }
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            java.lang.String msg = p3321xbce91901.jvm.p3324x21ffc6bd.o.m("createTmpFile but cant not mkdir :", file.getParentFile().getAbsolutePath());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            t95.d.f498122a.e("MicroMsg.TempFile", msg);
        }
        java.lang.String msg2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.m("createTmpFile:", file.getAbsolutePath());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg2, "msg");
        t95.d.f498122a.i("MicroMsg.TempFile", msg2);
        file.createNewFile();
        return file;
    }
}
