package bq;

/* loaded from: classes2.dex */
public final class y1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final yz5.a f105072o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(int i17, java.lang.String fileMD5, int i18, byte[] readBuf, int i19, yz5.a aVar) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileMD5, "fileMD5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(readBuf, "readBuf");
        this.f105072o = aVar;
        if (r26.n0.N(fileMD5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderUploadHeadImgCGI", "upload img file totalLen:" + i18 + " md5:" + fileMD5);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderuploadheadimg";
        lVar.f152200d = 3759;
        r45.k13 k13Var = new r45.k13();
        k13Var.set(5, java.lang.Integer.valueOf(i17));
        k13Var.set(2, java.lang.Integer.valueOf(i19));
        k13Var.set(1, java.lang.Integer.valueOf(i18));
        k13Var.set(4, fileMD5);
        k13Var.set(3, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(readBuf, 0, readBuf.length));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUploadHeadImgCGI", "next upload start:" + i19 + ", len:" + readBuf.length);
        k13Var.set(6, db2.t4.f309704a.a(3759));
        lVar.f152197a = k13Var;
        lVar.f152198b = new r45.l13();
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public void j() {
        super.j();
        yz5.a aVar = this.f105072o;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // bq.e, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }
}
