package r36;

/* loaded from: classes16.dex */
public final class a0 implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.m f450867d;

    /* renamed from: e, reason: collision with root package name */
    public int f450868e;

    /* renamed from: f, reason: collision with root package name */
    public byte f450869f;

    /* renamed from: g, reason: collision with root package name */
    public int f450870g;

    /* renamed from: h, reason: collision with root package name */
    public int f450871h;

    /* renamed from: i, reason: collision with root package name */
    public short f450872i;

    public a0(x36.m mVar) {
        this.f450867d = mVar;
    }

    @Override // x36.h0
    public long B(x36.k kVar, long j17) {
        int i17;
        int mo174957x40655679;
        do {
            int i18 = this.f450871h;
            x36.m mVar = this.f450867d;
            if (i18 != 0) {
                long B = mVar.B(kVar, java.lang.Math.min(j17, i18));
                if (B == -1) {
                    return -1L;
                }
                this.f450871h = (int) (this.f450871h - B);
                return B;
            }
            mVar.mo174960x35e57f(this.f450872i);
            this.f450872i = (short) 0;
            if ((this.f450869f & 4) != 0) {
                return -1L;
            }
            i17 = this.f450870g;
            int mo174955xcc4273be = ((mVar.mo174955xcc4273be() & 255) << 16) | ((mVar.mo174955xcc4273be() & 255) << 8) | (mVar.mo174955xcc4273be() & 255);
            this.f450871h = mo174955xcc4273be;
            this.f450868e = mo174955xcc4273be;
            byte mo174955xcc4273be2 = (byte) (mVar.mo174955xcc4273be() & 255);
            this.f450869f = (byte) (mVar.mo174955xcc4273be() & 255);
            java.util.logging.Logger logger = r36.c0.f450890h;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                logger.fine(r36.g.a(true, this.f450870g, this.f450868e, mo174955xcc4273be2, this.f450869f));
            }
            mo174957x40655679 = mVar.mo174957x40655679() & Integer.MAX_VALUE;
            this.f450870g = mo174957x40655679;
            if (mo174955xcc4273be2 != 9) {
                r36.g.b("%s != TYPE_CONTINUATION", java.lang.Byte.valueOf(mo174955xcc4273be2));
                throw null;
            }
        } while (mo174957x40655679 == i17);
        r36.g.b("TYPE_CONTINUATION streamId changed", new java.lang.Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f450867d.h();
    }
}
