package bw5;

/* loaded from: classes8.dex */
public class a7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f106569d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f106570e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f106571f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f106572g;

    /* renamed from: h, reason: collision with root package name */
    public int f106573h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f106574i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f106575m = new boolean[7];

    static {
        new bw5.a7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a7 mo11468x92b714fd(byte[] bArr) {
        return (bw5.a7) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a7)) {
            return false;
        }
        bw5.a7 a7Var = (bw5.a7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f106569d), java.lang.Integer.valueOf(a7Var.f106569d)) && n51.f.a(this.f106570e, a7Var.f106570e) && n51.f.a(this.f106571f, a7Var.f106571f) && n51.f.a(this.f106572g, a7Var.f106572g) && n51.f.a(java.lang.Integer.valueOf(this.f106573h), java.lang.Integer.valueOf(a7Var.f106573h)) && n51.f.a(this.f106574i, a7Var.f106574i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.a7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f106575m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f106569d);
            }
            java.lang.String str = this.f106570e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f106571f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f106572g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f106573h);
            }
            java.lang.String str4 = this.f106574i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f106569d) : 0;
            java.lang.String str5 = this.f106570e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f106571f;
            if (str6 != null && zArr[3]) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f106572g;
            if (str7 != null && zArr[4]) {
                e17 += b36.f.j(4, str7);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f106573h);
            }
            java.lang.String str8 = this.f106574i;
            return (str8 == null || !zArr[6]) ? e17 : e17 + b36.f.j(6, str8);
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
                this.f106569d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f106570e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f106571f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f106572g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f106573h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f106574i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
