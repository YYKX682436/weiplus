package bw5;

/* loaded from: classes2.dex */
public class eg extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108424d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108425e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108426f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108427g;

    /* renamed from: h, reason: collision with root package name */
    public long f108428h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f108429i;

    /* renamed from: m, reason: collision with root package name */
    public int f108430m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f108431n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f108432o = new boolean[9];

    static {
        new bw5.eg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.eg mo11468x92b714fd(byte[] bArr) {
        return (bw5.eg) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.eg)) {
            return false;
        }
        bw5.eg egVar = (bw5.eg) fVar;
        return n51.f.a(this.f108424d, egVar.f108424d) && n51.f.a(this.f108425e, egVar.f108425e) && n51.f.a(this.f108426f, egVar.f108426f) && n51.f.a(this.f108427g, egVar.f108427g) && n51.f.a(java.lang.Long.valueOf(this.f108428h), java.lang.Long.valueOf(egVar.f108428h)) && n51.f.a(this.f108429i, egVar.f108429i) && n51.f.a(java.lang.Integer.valueOf(this.f108430m), java.lang.Integer.valueOf(egVar.f108430m)) && n51.f.a(this.f108431n, egVar.f108431n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.eg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f108432o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108424d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f108425e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f108426f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f108427g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.h(5, this.f108428h);
            }
            java.lang.String str5 = this.f108429i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.e(7, this.f108430m);
            }
            java.lang.String str6 = this.f108431n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f108424d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f108425e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f108426f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f108427g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f108428h);
            }
            java.lang.String str11 = this.f108429i;
            if (str11 != null && zArr[6]) {
                i18 += b36.f.j(6, str11);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f108430m);
            }
            java.lang.String str12 = this.f108431n;
            return (str12 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str12);
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
                this.f108424d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108425e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108426f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108427g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108428h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108429i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108430m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108431n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
