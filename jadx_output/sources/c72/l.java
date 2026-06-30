package c72;

/* loaded from: classes12.dex */
public class l extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.xh4 f39557a = new r45.xh4();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.xh4 xh4Var = (r45.xh4) new r45.xh4().parseFrom(bArr);
        this.f39557a = xh4Var;
        o45.bh.b(this, xh4Var.getBaseResponse());
        return this.f39557a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 0;
    }
}
