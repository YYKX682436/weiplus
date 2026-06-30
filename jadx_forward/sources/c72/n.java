package c72;

/* loaded from: classes8.dex */
public class n extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.ix6 f121092a = new r45.ix6();

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        r45.ix6 ix6Var = (r45.ix6) new r45.ix6().mo11468x92b714fd(bArr);
        this.f121092a = ix6Var;
        o45.bh.b(this, ix6Var.mo11484xe92ab0a8());
        return this.f121092a.mo11484xe92ab0a8().f458492d;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 0;
    }
}
