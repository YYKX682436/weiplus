package bw5;

/* loaded from: classes2.dex */
public class yz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117265d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117266e;

    /* renamed from: f, reason: collision with root package name */
    public int f117267f;

    /* renamed from: g, reason: collision with root package name */
    public int f117268g;

    /* renamed from: h, reason: collision with root package name */
    public float f117269h;

    /* renamed from: i, reason: collision with root package name */
    public float f117270i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f117271m;

    /* renamed from: n, reason: collision with root package name */
    public int f117272n;

    /* renamed from: o, reason: collision with root package name */
    public int f117273o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f117274p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f117275q = new boolean[11];

    static {
        new bw5.yz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yz mo11468x92b714fd(byte[] bArr) {
        return (bw5.yz) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yz)) {
            return false;
        }
        bw5.yz yzVar = (bw5.yz) fVar;
        return n51.f.a(this.f117265d, yzVar.f117265d) && n51.f.a(this.f117266e, yzVar.f117266e) && n51.f.a(java.lang.Integer.valueOf(this.f117267f), java.lang.Integer.valueOf(yzVar.f117267f)) && n51.f.a(java.lang.Integer.valueOf(this.f117268g), java.lang.Integer.valueOf(yzVar.f117268g)) && n51.f.a(java.lang.Float.valueOf(this.f117269h), java.lang.Float.valueOf(yzVar.f117269h)) && n51.f.a(java.lang.Float.valueOf(this.f117270i), java.lang.Float.valueOf(yzVar.f117270i)) && n51.f.a(this.f117271m, yzVar.f117271m) && n51.f.a(java.lang.Integer.valueOf(this.f117272n), java.lang.Integer.valueOf(yzVar.f117272n)) && n51.f.a(java.lang.Integer.valueOf(this.f117273o), java.lang.Integer.valueOf(yzVar.f117273o)) && n51.f.a(this.f117274p, yzVar.f117274p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f117275q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117265d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f117266e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f117267f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f117268g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f117269h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f117270i);
            }
            java.lang.String str3 = this.f117271m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f117272n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f117273o);
            }
            java.lang.String str4 = this.f117274p;
            if (str4 != null && zArr[10]) {
                fVar.j(10, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f117265d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f117266e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f117267f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f117268g);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f117269h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f117270i);
            }
            java.lang.String str7 = this.f117271m;
            if (str7 != null && zArr[7]) {
                i18 += b36.f.j(7, str7);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f117272n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f117273o);
            }
            java.lang.String str8 = this.f117274p;
            return (str8 == null || !zArr[10]) ? i18 : i18 + b36.f.j(10, str8);
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
                this.f117265d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117266e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117267f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117268g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117269h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117270i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f117271m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f117272n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f117273o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f117274p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
