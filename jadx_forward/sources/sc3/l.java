package sc3;

/* loaded from: classes7.dex */
public final class l implements dh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f488028a;

    public l(sc3.k1 k1Var) {
        this.f488028a = k1Var;
    }

    @Override // dh.a
    public void a(java.lang.String path, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // dh.a
    /* renamed from: getAbsolutePath */
    public java.lang.String mo52657x1d57e4b2(java.lang.String fileId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileId, "fileId");
        if (r26.i0.y(fileId, "wxfile://", false)) {
            sc3.k1 k1Var = this.f488028a;
            jc3.x xVar = k1Var.f488019r;
            if (xVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
                throw null;
            }
            com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = xVar.b().mo49620x1d537609(fileId);
            if (mo49620x1d537609 != null && mo49620x1d537609.m()) {
                java.lang.String o17 = mo49620x1d537609.o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, "fileSystem: getAbsolutePath ret = ".concat(o17));
                return o17;
            }
        }
        return fileId;
    }

    @Override // dh.a
    /* renamed from: readDataFromURLSync */
    public byte[] mo52658x6644d720(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        bf3.g0 g0Var = bf3.g0.f101160a;
        jc3.x xVar = this.f488028a.f488019r;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
            throw null;
        }
        java.nio.ByteBuffer c17 = g0Var.c(xVar, path);
        if (c17 == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[c17.remaining()];
        c17.get(bArr);
        return bArr;
    }
}
