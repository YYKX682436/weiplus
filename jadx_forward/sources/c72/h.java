package c72;

/* loaded from: classes8.dex */
public class h extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.wa3 f121086a = new r45.wa3();

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        r45.wa3 wa3Var = (r45.wa3) new r45.wa3().mo11468x92b714fd(bArr);
        this.f121086a = wa3Var;
        o45.bh.b(this, wa3Var.mo11484xe92ab0a8());
        return this.f121086a.mo11484xe92ab0a8().f458492d;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 0;
    }
}
