package o45;

/* loaded from: classes11.dex */
public class hi extends o45.ah implements o45.yg {

    /* renamed from: b, reason: collision with root package name */
    public int f424481b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f424482c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f424484e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f424485f;

    /* renamed from: d, reason: collision with root package name */
    public int f424483d = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f424480a = 7;

    public java.lang.String a() {
        byte[] bArr = this.f424482c;
        return (bArr == null || bArr.length == 0) ? "" : new java.lang.String(bArr, o45.ji.f424505a);
    }

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("synccheck3 err resp buf:");
            sb6.append(bArr == null ? -1 : bArr.length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSyncCheck", sb6.toString());
            return -1;
        }
        r45.ee5 ee5Var = new r45.ee5();
        ee5Var.mo11468x92b714fd(bArr);
        this.f424480a = ee5Var.f454894d;
        this.f424481b = ee5Var.f454895e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ee5Var.f454896f;
        this.f424482c = gVar != null ? gVar.g() : null;
        this.f424483d = ee5Var.f454897g;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = ee5Var.f454898h;
        this.f424484e = gVar2 != null ? gVar2.g() : null;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = ee5Var.f454899i;
        this.f424485f = gVar3 != null ? gVar3.g() : null;
        return this.f424481b;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 1000000800;
    }

    @Override // o45.ah
    /* renamed from: getRetCode */
    public int mo150578x7f2fddf8() {
        return this.f424481b;
    }

    @Override // o45.ah, o45.yg
    /* renamed from: isRawData */
    public boolean mo150581x182b0f68() {
        return true;
    }
}
