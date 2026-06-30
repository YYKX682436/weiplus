package c72;

/* loaded from: classes8.dex */
public class h extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.wa3 f39553a = new r45.wa3();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.wa3 wa3Var = (r45.wa3) new r45.wa3().parseFrom(bArr);
        this.f39553a = wa3Var;
        o45.bh.b(this, wa3Var.getBaseResponse());
        return this.f39553a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 0;
    }
}
