package c72;

/* loaded from: classes8.dex */
public class j extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.mn5 f121088a = new r45.mn5();

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        r45.mn5 mn5Var = (r45.mn5) new r45.mn5().mo11468x92b714fd(bArr);
        this.f121088a = mn5Var;
        o45.bh.b(this, mn5Var.mo11484xe92ab0a8());
        return this.f121088a.mo11484xe92ab0a8().f458492d;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 0;
    }
}
