package c72;

/* loaded from: classes8.dex */
public class j extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.mn5 f39555a = new r45.mn5();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.mn5 mn5Var = (r45.mn5) new r45.mn5().parseFrom(bArr);
        this.f39555a = mn5Var;
        o45.bh.b(this, mn5Var.getBaseResponse());
        return this.f39555a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 0;
    }
}
