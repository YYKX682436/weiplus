package o45;

/* loaded from: classes8.dex */
public class uh extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.qc3 f424545a = new r45.qc3();

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        r45.qc3 qc3Var = (r45.qc3) new r45.qc3().mo11468x92b714fd(bArr);
        this.f424545a = qc3Var;
        o45.bh.b(this, qc3Var.mo11484xe92ab0a8());
        return this.f424545a.mo11484xe92ab0a8().f458492d;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 1000000179;
    }
}
