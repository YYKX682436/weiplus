package o45;

/* loaded from: classes12.dex */
public class ci extends o45.ah implements o45.yg {

    /* renamed from: b, reason: collision with root package name */
    public byte[] f424448b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f424449c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f424450d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f424451e;

    /* renamed from: a, reason: collision with root package name */
    public r45.zv4 f424447a = new r45.zv4();

    /* renamed from: f, reason: collision with root package name */
    public int f424452f = 0;

    public void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f424449c = bArr;
        this.f424450d = bArr2;
        this.f424451e = bArr3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReg2.Resp", "summerauths setSession [%s] [%s] [%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr)), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f424450d)), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f424451e)));
    }

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        this.f424452f = 0;
        r45.zv4 zv4Var = (r45.zv4) new r45.zv4().mo11468x92b714fd(bArr);
        this.f424447a = zv4Var;
        o45.bh.b(this, zv4Var.mo11484xe92ab0a8());
        this.f424452f = 0;
        return this.f424447a.mo11484xe92ab0a8().f458492d;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 0;
    }

    @Override // o45.ah
    /* renamed from: getNewRegResponse */
    public byte[] mo150575x527ee42b() {
        try {
            return this.f424447a.mo14344x5f01b1f6();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
