package c01;

/* loaded from: classes12.dex */
public class k9 extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.fr3 f37287a = new r45.fr3();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.fr3 fr3Var = (r45.fr3) new r45.fr3().parseFrom(bArr);
        this.f37287a = fr3Var;
        o45.bh.b(this, fr3Var.getBaseResponse());
        return this.f37287a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 0;
    }
}
