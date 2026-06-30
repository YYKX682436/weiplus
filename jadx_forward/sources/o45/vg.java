package o45;

/* loaded from: classes12.dex */
public abstract class vg extends o45.ah implements o45.yg {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f424549b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f424550c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f424551d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f424552e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f424553f;

    /* renamed from: a, reason: collision with root package name */
    public r45.sr6 f424548a = new r45.sr6();

    /* renamed from: g, reason: collision with root package name */
    public int f424554g = 0;

    public void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f424551d = bArr;
        this.f424552e = bArr2;
        this.f424553f = bArr3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAuth", "summerauths setSession [%s] [%s], [%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr)), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f424552e)), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(this.f424553f)));
    }

    @Override // o45.ah
    /* renamed from: getAuthResponse */
    public byte[] mo150570x346dc07f() {
        try {
            return this.f424548a.mo14344x5f01b1f6();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // o45.ah
    /* renamed from: getServerIndexBuffer */
    public byte[] mo150579xcb512bb9() {
        try {
            r45.cu5 cu5Var = this.f424548a.f467491n;
            if (cu5Var == null) {
                return null;
            }
            return cu5Var.f453374f.f273689a;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
