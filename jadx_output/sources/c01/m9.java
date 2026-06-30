package c01;

/* loaded from: classes12.dex */
public class m9 extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.jr3 f37331a = new r45.jr3();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.jr3 jr3Var = (r45.jr3) new r45.jr3().parseFrom(bArr);
        this.f37331a = jr3Var;
        o45.bh.b(this, jr3Var.getBaseResponse());
        return this.f37331a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 0;
    }
}
