package e9;

/* loaded from: classes15.dex */
public abstract class b extends e9.a {

    /* renamed from: i, reason: collision with root package name */
    public byte[] f331861i;

    /* renamed from: j, reason: collision with root package name */
    public int f331862j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f331863k;

    public b(r9.k kVar, r9.n nVar, int i17, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i18, java.lang.Object obj, byte[] bArr) {
        super(kVar, nVar, i17, c1601x7dc4e417, i18, obj, -9223372036854775807L, -9223372036854775807L);
        this.f331861i = bArr;
    }

    @Override // r9.c0
    public final void a() {
        try {
            this.f331860h.b(this.f331853a);
            int i17 = 0;
            this.f331862j = 0;
            while (i17 != -1 && !this.f331863k) {
                byte[] bArr = this.f331861i;
                if (bArr == null) {
                    this.f331861i = new byte[16384];
                } else if (bArr.length < this.f331862j + 16384) {
                    this.f331861i = java.util.Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i17 = this.f331860h.a(this.f331861i, this.f331862j, 16384);
                if (i17 != -1) {
                    this.f331862j += i17;
                }
            }
            if (!this.f331863k) {
                ((g9.c) this).f351096m = java.util.Arrays.copyOf(this.f331861i, this.f331862j);
            }
        } finally {
            t9.d0.e(this.f331860h);
        }
    }

    @Override // r9.c0
    public final boolean b() {
        return this.f331863k;
    }

    @Override // r9.c0
    public final void c() {
        this.f331863k = true;
    }

    @Override // e9.a
    public long d() {
        return this.f331862j;
    }
}
