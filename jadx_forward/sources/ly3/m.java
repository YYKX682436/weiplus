package ly3;

/* loaded from: classes13.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ly3.m f403806a = new ly3.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f403807b = lp0.b.h() + "so_res";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f403808c = com.p314xaae8f345.mm.vfs.q7.c("rtos_watch_so") + "/so_res";

    public final java.lang.String a(java.lang.String soName, java.lang.String patchId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(soName, "soName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(patchId, "patchId");
        return f403808c + '/' + soName + '/' + patchId + "/lib" + soName + ".so";
    }

    public final java.lang.String b(java.lang.String soName, java.lang.String patchId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(soName, "soName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(patchId, "patchId");
        return f403808c + '/' + soName + '/' + patchId + '/';
    }

    public final java.lang.String c(java.lang.String soName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(soName, "soName");
        return f403808c + '/' + soName + '/';
    }
}
