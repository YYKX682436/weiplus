package bq;

/* loaded from: classes2.dex */
public final class y1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final yz5.a f23539o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(int i17, java.lang.String fileMD5, int i18, byte[] readBuf, int i19, yz5.a aVar) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(fileMD5, "fileMD5");
        kotlin.jvm.internal.o.g(readBuf, "readBuf");
        this.f23539o = aVar;
        if (r26.n0.N(fileMD5)) {
            com.tencent.mars.xlog.Log.e("Finder.FinderUploadHeadImgCGI", "upload img file totalLen:" + i18 + " md5:" + fileMD5);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderuploadheadimg";
        lVar.f70667d = 3759;
        r45.k13 k13Var = new r45.k13();
        k13Var.set(5, java.lang.Integer.valueOf(i17));
        k13Var.set(2, java.lang.Integer.valueOf(i19));
        k13Var.set(1, java.lang.Integer.valueOf(i18));
        k13Var.set(4, fileMD5);
        k13Var.set(3, new com.tencent.mm.protobuf.g(readBuf, 0, readBuf.length));
        com.tencent.mars.xlog.Log.i("Finder.FinderUploadHeadImgCGI", "next upload start:" + i19 + ", len:" + readBuf.length);
        k13Var.set(6, db2.t4.f228171a.a(3759));
        lVar.f70664a = k13Var;
        lVar.f70665b = new r45.l13();
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    public void j() {
        super.j();
        yz5.a aVar = this.f23539o;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // bq.e, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
