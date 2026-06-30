package c01;

/* loaded from: classes9.dex */
public class o9 extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.sy6 f118899a = new r45.sy6();

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        r45.sy6 sy6Var = (r45.sy6) new r45.sy6().mo11468x92b714fd(bArr);
        this.f118899a = sy6Var;
        o45.bh.b(this, sy6Var.mo11484xe92ab0a8());
        return this.f118899a.mo11484xe92ab0a8().f458492d;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 0;
    }
}
