package vq0;

/* loaded from: classes7.dex */
public abstract class b {
    public static final java.lang.String a(java.lang.Object target, java.lang.String rootPath, java.lang.String frameSetName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootPath, "rootPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        return vq0.a.a(b(target, rootPath), frameSetName);
    }

    public static final java.lang.String b(java.lang.Object target, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        int hashCode = (target.hashCode() + path.hashCode()) / 2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(r26.i0.t(path, "-", "_", false));
        sb6.append('_');
        r26.a.a(16);
        sb6.append(jz5.h0.b(hashCode & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2, 16));
        return sb6.toString();
    }

    public static final java.lang.String c(java.lang.String bizName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        java.lang.String str = (java.lang.String) kz5.n0.Z(r26.n0.f0(bizName, new java.lang.String[]{"-"}, false, 0, 6, null));
        return str == null ? bizName : str;
    }
}
