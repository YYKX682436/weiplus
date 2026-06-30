package bw5;

/* loaded from: classes2.dex */
public class ka extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: u, reason: collision with root package name */
    public static final bw5.ka f110838u = new bw5.ka();

    /* renamed from: d, reason: collision with root package name */
    public bw5.la f110839d = bw5.la.EmoticonEasterEggType_Native;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110840e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110841f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110842g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f110843h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f110844i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f110845m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f110846n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f110847o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f110848p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f110849q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f110850r = 0;

    /* renamed from: s, reason: collision with root package name */
    public bw5.na f110851s = new bw5.na();

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f110852t = "";

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ka)) {
            return false;
        }
        bw5.ka kaVar = (bw5.ka) fVar;
        return n51.f.a(this.f110839d, kaVar.f110839d) && n51.f.a(this.f110840e, kaVar.f110840e) && n51.f.a(this.f110841f, kaVar.f110841f) && n51.f.a(this.f110842g, kaVar.f110842g) && n51.f.a(java.lang.Integer.valueOf(this.f110843h), java.lang.Integer.valueOf(kaVar.f110843h)) && n51.f.a(java.lang.Integer.valueOf(this.f110844i), java.lang.Integer.valueOf(kaVar.f110844i)) && n51.f.a(java.lang.Integer.valueOf(this.f110845m), java.lang.Integer.valueOf(kaVar.f110845m)) && n51.f.a(java.lang.Integer.valueOf(this.f110846n), java.lang.Integer.valueOf(kaVar.f110846n)) && n51.f.a(this.f110847o, kaVar.f110847o) && n51.f.a(this.f110848p, kaVar.f110848p) && n51.f.a(java.lang.Integer.valueOf(this.f110849q), java.lang.Integer.valueOf(kaVar.f110849q)) && n51.f.a(java.lang.Integer.valueOf(this.f110850r), java.lang.Integer.valueOf(kaVar.f110850r)) && n51.f.a(this.f110851s, kaVar.f110851s) && n51.f.a(this.f110852t, kaVar.f110852t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ka();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.la laVar = this.f110839d;
            if (laVar != null) {
                fVar.e(1, laVar.f111237d);
            }
            java.lang.String str = this.f110840e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f110841f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f110842g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f110843h);
            fVar.e(6, this.f110844i);
            fVar.e(7, this.f110845m);
            fVar.e(8, this.f110846n);
            java.lang.String str4 = this.f110847o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f110848p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.e(11, this.f110849q);
            fVar.e(12, this.f110850r);
            bw5.na naVar = this.f110851s;
            if (naVar != null) {
                fVar.i(13, naVar.mo75928xcd1e8d8());
                this.f110851s.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.f110852t;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.la laVar2 = this.f110839d;
            int e17 = laVar2 != null ? b36.f.e(1, laVar2.f111237d) + 0 : 0;
            java.lang.String str7 = this.f110840e;
            if (str7 != null) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f110841f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f110842g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            int e18 = e17 + b36.f.e(5, this.f110843h) + b36.f.e(6, this.f110844i) + b36.f.e(7, this.f110845m) + b36.f.e(8, this.f110846n);
            java.lang.String str10 = this.f110847o;
            if (str10 != null) {
                e18 += b36.f.j(9, str10);
            }
            java.lang.String str11 = this.f110848p;
            if (str11 != null) {
                e18 += b36.f.j(10, str11);
            }
            int e19 = e18 + b36.f.e(11, this.f110849q) + b36.f.e(12, this.f110850r);
            bw5.na naVar2 = this.f110851s;
            if (naVar2 != null) {
                e19 += b36.f.i(13, naVar2.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.f110852t;
            return str12 != null ? e19 + b36.f.j(14, str12) : e19;
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
                int g17 = aVar2.g(intValue);
                this.f110839d = g17 != 0 ? g17 != 1 ? g17 != 999 ? null : bw5.la.EmoticonEasterEggType_None : bw5.la.EmoticonEasterEggType_Magic : bw5.la.EmoticonEasterEggType_Native;
                return 0;
            case 2:
                this.f110840e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f110841f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f110842g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f110843h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f110844i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f110845m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f110846n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f110847o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f110848p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f110849q = aVar2.g(intValue);
                return 0;
            case 12:
                this.f110850r = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.na naVar3 = new bw5.na();
                    if (bArr != null && bArr.length > 0) {
                        naVar3.mo11468x92b714fd(bArr);
                    }
                    this.f110851s = naVar3;
                }
                return 0;
            case 14:
                this.f110852t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.ka) super.mo11468x92b714fd(bArr);
    }
}
