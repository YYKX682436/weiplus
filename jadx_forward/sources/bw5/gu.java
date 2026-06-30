package bw5;

/* loaded from: classes2.dex */
public class gu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109535d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109536e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109537f;

    /* renamed from: g, reason: collision with root package name */
    public int f109538g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109539h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f109540i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f109541m = new boolean[7];

    static {
        new bw5.gu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gu mo11468x92b714fd(byte[] bArr) {
        return (bw5.gu) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gu)) {
            return false;
        }
        bw5.gu guVar = (bw5.gu) fVar;
        return n51.f.a(this.f109535d, guVar.f109535d) && n51.f.a(this.f109536e, guVar.f109536e) && n51.f.a(this.f109537f, guVar.f109537f) && n51.f.a(java.lang.Integer.valueOf(this.f109538g), java.lang.Integer.valueOf(guVar.f109538g)) && n51.f.a(this.f109539h, guVar.f109539h) && n51.f.a(this.f109540i, guVar.f109540i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109541m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109535d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f109536e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f109537f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f109538g);
            }
            java.lang.String str4 = this.f109539h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f109540i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f109535d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f109536e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f109537f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f109538g);
            }
            java.lang.String str9 = this.f109539h;
            if (str9 != null && zArr[5]) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f109540i;
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
                this.f109535d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109536e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109537f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109538g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109539h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109540i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
