package bw5;

/* loaded from: classes2.dex */
public class ld0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111288d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111289e;

    /* renamed from: f, reason: collision with root package name */
    public float f111290f;

    /* renamed from: g, reason: collision with root package name */
    public float f111291g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111292h;

    /* renamed from: i, reason: collision with root package name */
    public int f111293i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f111294m = new boolean[7];

    static {
        new bw5.ld0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ld0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ld0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ld0)) {
            return false;
        }
        bw5.ld0 ld0Var = (bw5.ld0) fVar;
        return n51.f.a(this.f111288d, ld0Var.f111288d) && n51.f.a(this.f111289e, ld0Var.f111289e) && n51.f.a(java.lang.Float.valueOf(this.f111290f), java.lang.Float.valueOf(ld0Var.f111290f)) && n51.f.a(java.lang.Float.valueOf(this.f111291g), java.lang.Float.valueOf(ld0Var.f111291g)) && n51.f.a(this.f111292h, ld0Var.f111292h) && n51.f.a(java.lang.Integer.valueOf(this.f111293i), java.lang.Integer.valueOf(ld0Var.f111293i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ld0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111294m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111288d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f111289e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.d(3, this.f111290f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f111291g);
            }
            java.lang.String str3 = this.f111292h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f111293i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f111288d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f111289e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f111290f);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f111291g);
            }
            java.lang.String str6 = this.f111292h;
            if (str6 != null && zArr[5]) {
                i18 += b36.f.j(5, str6);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f111293i) : i18;
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
        switch (intValue) {
            case 1:
                this.f111288d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111289e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111290f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111291g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111292h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111293i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
