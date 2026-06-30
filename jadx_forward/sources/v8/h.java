package v8;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final int f515534h = t9.d0.f("OggS");

    /* renamed from: a, reason: collision with root package name */
    public int f515535a;

    /* renamed from: b, reason: collision with root package name */
    public long f515536b;

    /* renamed from: c, reason: collision with root package name */
    public int f515537c;

    /* renamed from: d, reason: collision with root package name */
    public int f515538d;

    /* renamed from: e, reason: collision with root package name */
    public int f515539e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f515540f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final t9.p f515541g = new t9.p(255);

    public boolean a(q8.f fVar, boolean z17) {
        t9.p pVar = this.f515541g;
        pVar.s();
        this.f515535a = 0;
        this.f515536b = 0L;
        this.f515537c = 0;
        this.f515538d = 0;
        this.f515539e = 0;
        q8.b bVar = (q8.b) fVar;
        long j17 = bVar.f442150b;
        if (!(j17 == -1 || j17 - (bVar.f442151c + ((long) bVar.f442153e)) >= 27) || !bVar.b(pVar.f498073a, 0, 27, true)) {
            if (z17) {
                return false;
            }
            throw new java.io.EOFException();
        }
        if (pVar.n() != f515534h) {
            if (z17) {
                return false;
            }
            throw new m8.x("expected OggS capture pattern at begin of page");
        }
        if (pVar.m() != 0) {
            if (z17) {
                return false;
            }
            throw new m8.x("unsupported bit stream revision");
        }
        this.f515535a = pVar.m();
        byte[] bArr = pVar.f498073a;
        long j18 = bArr[r2] & 255;
        long j19 = j18 | ((bArr[r4] & 255) << 8);
        long j27 = j19 | ((bArr[r2] & 255) << 16);
        long j28 = j27 | ((bArr[r4] & 255) << 24);
        long j29 = j28 | ((bArr[r2] & 255) << 32);
        long j37 = j29 | ((bArr[r4] & 255) << 40);
        pVar.f498074b = pVar.f498074b + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        this.f515536b = j37 | ((bArr[r2] & 255) << 48) | ((255 & bArr[r4]) << 56);
        pVar.f();
        pVar.f();
        pVar.f();
        int m17 = pVar.m();
        this.f515537c = m17;
        this.f515538d = m17 + 27;
        pVar.s();
        bVar.b(pVar.f498073a, 0, this.f515537c, false);
        for (int i17 = 0; i17 < this.f515537c; i17++) {
            int m18 = pVar.m();
            this.f515540f[i17] = m18;
            this.f515539e += m18;
        }
        return true;
    }
}
