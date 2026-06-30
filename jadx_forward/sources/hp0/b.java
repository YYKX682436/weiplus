package hp0;

/* loaded from: classes10.dex */
public class b extends hp0.i {

    /* renamed from: b, reason: collision with root package name */
    public final hp0.h f364439b;

    public b(java.lang.String str, java.lang.String str2, hp0.h hVar) {
        super(str);
        this.f364439b = hVar;
    }

    @Override // hp0.i
    public jp0.f a() {
        return this.f364439b.a(this.f364447a);
    }

    @Override // hp0.i
    public void b(java.io.OutputStream stream) {
        java.lang.String filePath = (java.lang.String) this.f364447a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stream, "stream");
        if (!com.p314xaae8f345.mm.vfs.w6.j(filePath)) {
            return;
        }
        try {
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(filePath);
            if (E == null) {
                return;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = E.read(bArr);
                    if (read == -1) {
                        vz5.b.a(E, null);
                        return;
                    }
                    stream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1299L, 12L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Loader.DiskFunction", th6, "save failed. path:".concat(filePath), new java.lang.Object[0]);
        }
    }
}
