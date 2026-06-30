package uk1;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public sk1.d f510047a = null;

    static {
        yk1.c.b("<policy-file-request/>\u0000");
    }

    public static java.lang.String e(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(byteBuffer.remaining());
        byte b17 = 48;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - allocate.position());
                allocate = null;
                break;
            }
            byte b18 = byteBuffer.get();
            allocate.put(b18);
            if (b17 == 13 && b18 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                break;
            }
            b17 = b18;
        }
        if (allocate == null) {
            return null;
        }
        byte[] array = allocate.array();
        int limit = allocate.limit();
        java.nio.charset.CodingErrorAction codingErrorAction = yk1.c.f544312a;
        try {
            return new java.lang.String(array, 0, limit, "ASCII");
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetWork.Charsetfunctions", e17.toString());
            return "";
        }
    }

    public abstract uk1.a a(xk1.a aVar, xk1.g gVar);

    public abstract uk1.a b(xk1.a aVar);

    public abstract uk1.b c();

    public abstract xk1.b d(xk1.b bVar);

    public abstract java.util.List f(java.nio.ByteBuffer byteBuffer);

    /* JADX WARN: Multi-variable type inference failed */
    public xk1.e g(java.nio.ByteBuffer byteBuffer) {
        xk1.c cVar;
        sk1.d dVar = this.f510047a;
        java.lang.String e17 = e(byteBuffer);
        if (e17 == null) {
            throw new vk1.a(byteBuffer.capacity() + 128);
        }
        java.lang.String[] split = e17.split(" ", 3);
        if (split.length != 3) {
            throw new vk1.d();
        }
        if (dVar == sk1.d.CLIENT) {
            xk1.d dVar2 = new xk1.d();
            dVar2.f536538b = java.lang.Short.parseShort(split[1]);
            dVar2.f536539c = split[2];
            cVar = dVar2;
        } else {
            xk1.c cVar2 = new xk1.c();
            java.lang.String str = split[1];
            if (str == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetWork.HandshakeImpl1Client", "http resource descriptor must not be null");
                cVar = cVar2;
            } else {
                cVar2.f536537b = str;
                cVar = cVar2;
            }
        }
        java.lang.String e18 = e(byteBuffer);
        while (e18 != null && e18.length() > 0) {
            java.lang.String[] split2 = e18.split(":", 2);
            if (split2.length != 2) {
                throw new vk1.d("not an http header");
            }
            cVar.b(split2[0], split2[1].replaceFirst("^ +", ""));
            e18 = e(byteBuffer);
        }
        if (e18 != null) {
            return cVar;
        }
        throw new vk1.a();
    }
}
