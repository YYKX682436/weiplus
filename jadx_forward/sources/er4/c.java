package er4;

/* loaded from: classes14.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final er4.c f337592i = new er4.c();

    /* renamed from: d, reason: collision with root package name */
    public er4.d f337593d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f337594e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f337595f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f337596g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f337597h = new boolean[5];

    public er4.d b() {
        return this.f337597h[1] ? this.f337593d : er4.d.SPEAKER;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof er4.c)) {
            return false;
        }
        er4.c cVar = (er4.c) fVar;
        return n51.f.a(this.f337593d, cVar.f337593d) && n51.f.a(this.f337594e, cVar.f337594e) && n51.f.a(java.lang.Boolean.valueOf(this.f337595f), java.lang.Boolean.valueOf(cVar.f337595f)) && n51.f.a(this.f337596g, cVar.f337596g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new er4.c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f337597h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            er4.d dVar = this.f337593d;
            if (dVar != null && zArr[1]) {
                fVar.e(1, dVar.f337604d);
            }
            java.lang.String str = this.f337594e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f337595f);
            }
            java.lang.String str2 = this.f337596g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            er4.d dVar2 = this.f337593d;
            if (dVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, dVar2.f337604d);
            }
            java.lang.String str3 = this.f337594e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f337595f);
            }
            java.lang.String str4 = this.f337596g;
            return (str4 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str4);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f337593d = er4.d.a(aVar2.g(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f337594e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f337595f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f337596g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (er4.c) super.mo11468x92b714fd(bArr);
    }
}
