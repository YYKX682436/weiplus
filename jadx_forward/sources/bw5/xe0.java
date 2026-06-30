package bw5;

/* loaded from: classes9.dex */
public class xe0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116607d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116608e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116609f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116610g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f116611h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f116612i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f116613m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f116614n = new boolean[9];

    static {
        new bw5.xe0();
    }

    public java.lang.String b() {
        return this.f116614n[8] ? this.f116613m : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xe0)) {
            return false;
        }
        bw5.xe0 xe0Var = (bw5.xe0) fVar;
        return n51.f.a(this.f76492x92037252, xe0Var.f76492x92037252) && n51.f.a(this.f116607d, xe0Var.f116607d) && n51.f.a(this.f116608e, xe0Var.f116608e) && n51.f.a(this.f116609f, xe0Var.f116609f) && n51.f.a(this.f116610g, xe0Var.f116610g) && n51.f.a(this.f116611h, xe0Var.f116611h) && n51.f.a(this.f116612i, xe0Var.f116612i) && n51.f.a(this.f116613m, xe0Var.f116613m);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f116614n[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.xe0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116614n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f116607d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f116608e;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f116609f;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f116610g;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f116611h;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f116612i;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f116613m;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f116607d;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f116608e;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f116609f;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f116610g;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f116611h;
            if (str12 != null && zArr[6]) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f116612i;
            if (str13 != null && zArr[7]) {
                i18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f116613m;
            return (str14 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str14);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    this.f76492x92037252 = ieVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f116607d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116608e = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116609f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116610g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116611h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116612i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f116613m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.xe0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f116614n[1] = true;
        return this;
    }
}
