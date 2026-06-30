package o45;

/* loaded from: classes12.dex */
public class ph extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.fo0 f424529a = new r45.fo0();

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        r45.fo0 fo0Var = (r45.fo0) new r45.fo0().mo11468x92b714fd(bArr);
        this.f424529a = fo0Var;
        o45.bh.b(this, fo0Var.mo11484xe92ab0a8());
        return this.f424529a.mo11484xe92ab0a8().f458492d;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 0;
    }
}
