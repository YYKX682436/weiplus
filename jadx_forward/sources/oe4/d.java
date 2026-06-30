package oe4;

/* loaded from: classes9.dex */
public class d extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.us6 f426334a = new r45.us6();

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        r45.us6 us6Var = (r45.us6) new r45.us6().mo11468x92b714fd(bArr);
        this.f426334a = us6Var;
        o45.bh.b(this, us6Var.mo11484xe92ab0a8());
        return this.f426334a.mo11484xe92ab0a8().f458492d;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 0;
    }
}
