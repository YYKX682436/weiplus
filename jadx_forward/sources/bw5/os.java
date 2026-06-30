package bw5;

/* loaded from: classes2.dex */
public class os extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112753d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112754e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112755f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112756g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112757h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112758i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f112759m = new boolean[7];

    static {
        new bw5.os();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.os mo11468x92b714fd(byte[] bArr) {
        return (bw5.os) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.os)) {
            return false;
        }
        bw5.os osVar = (bw5.os) fVar;
        return n51.f.a(this.f112753d, osVar.f112753d) && n51.f.a(this.f112754e, osVar.f112754e) && n51.f.a(this.f112755f, osVar.f112755f) && n51.f.a(this.f112756g, osVar.f112756g) && n51.f.a(this.f112757h, osVar.f112757h) && n51.f.a(this.f112758i, osVar.f112758i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.os();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112759m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112753d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f112754e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f112755f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f112756g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f112757h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f112758i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f112753d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f112754e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f112755f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f112756g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f112757h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f112758i;
            return (str12 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str12);
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
                this.f112753d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112754e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112755f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112756g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112757h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112758i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
