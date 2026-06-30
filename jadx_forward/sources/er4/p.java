package er4;

/* loaded from: classes14.dex */
public class p extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final er4.p f337680n = new er4.p();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f337681d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f337682e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f337683f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f337684g;

    /* renamed from: h, reason: collision with root package name */
    public long f337685h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f337686i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f337687m = new boolean[7];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof er4.p)) {
            return false;
        }
        er4.p pVar = (er4.p) fVar;
        return n51.f.a(this.f337681d, pVar.f337681d) && n51.f.a(this.f337682e, pVar.f337682e) && n51.f.a(this.f337683f, pVar.f337683f) && n51.f.a(this.f337684g, pVar.f337684g) && n51.f.a(java.lang.Long.valueOf(this.f337685h), java.lang.Long.valueOf(pVar.f337685h)) && n51.f.a(this.f337686i, pVar.f337686i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new er4.p();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f337687m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f337681d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f337682e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f337683f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f337684g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.h(5, this.f337685h);
            }
            java.lang.String str5 = this.f337686i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f337681d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f337682e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f337683f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f337684g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f337685h);
            }
            java.lang.String str10 = this.f337686i;
            return (str10 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str10);
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
                this.f337681d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f337682e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f337683f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f337684g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f337685h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f337686i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (er4.p) super.mo11468x92b714fd(bArr);
    }
}
