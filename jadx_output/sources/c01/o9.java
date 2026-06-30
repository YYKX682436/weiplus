package c01;

/* loaded from: classes9.dex */
public class o9 extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.sy6 f37366a = new r45.sy6();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.sy6 sy6Var = (r45.sy6) new r45.sy6().parseFrom(bArr);
        this.f37366a = sy6Var;
        o45.bh.b(this, sy6Var.getBaseResponse());
        return this.f37366a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 0;
    }
}
