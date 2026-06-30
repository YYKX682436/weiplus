package o45;

/* loaded from: classes8.dex */
public class wh extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.ju4 f424568a = new r45.ju4();

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        r45.ju4 ju4Var = (r45.ju4) new r45.ju4().mo11468x92b714fd(bArr);
        this.f424568a = ju4Var;
        o45.bh.b(this, ju4Var.mo11484xe92ab0a8());
        return this.f424568a.mo11484xe92ab0a8().f458492d;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 1000000027;
    }
}
