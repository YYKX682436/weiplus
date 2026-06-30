package c72;

/* loaded from: classes8.dex */
public class n extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.ix6 f39559a = new r45.ix6();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.ix6 ix6Var = (r45.ix6) new r45.ix6().parseFrom(bArr);
        this.f39559a = ix6Var;
        o45.bh.b(this, ix6Var.getBaseResponse());
        return this.f39559a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 0;
    }
}
