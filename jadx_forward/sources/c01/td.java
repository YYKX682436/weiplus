package c01;

/* loaded from: classes12.dex */
public abstract class td {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f119030a = jz5.h.b(c01.sd.f118998d);

    public static final byte[] a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (!com.p314xaae8f345.mm.vfs.w6.j(path)) {
            throw new java.lang.IllegalArgumentException("File not exists: ".concat(path));
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4096);
        java.lang.ThreadLocal threadLocal = (java.lang.ThreadLocal) ((jz5.n) f119030a).mo141623x754a37bb();
        java.lang.Object obj = threadLocal.get();
        if (obj == null) {
            obj = java.security.MessageDigest.getInstance("SHA-1");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getInstance(...)");
            threadLocal.set(obj);
        }
        java.security.MessageDigest messageDigest = (java.security.MessageDigest) obj;
        java.nio.channels.ReadableByteChannel G = com.p314xaae8f345.mm.vfs.w6.G(path);
        while (G.read(allocateDirect) >= 0) {
            try {
                allocateDirect.flip();
                messageDigest.update(allocateDirect);
                allocateDirect.clear();
            } finally {
            }
        }
        vz5.b.a(G, null);
        byte[] digest = messageDigest.digest();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(digest, "digest(...)");
        return digest;
    }

    public static final byte[] b(java.util.UUID uuid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uuid, "uuid");
        byte[] array = java.nio.ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(array, "array(...)");
        return array;
    }
}
