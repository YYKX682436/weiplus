package r45;

/* loaded from: classes2.dex */
public class hb3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457530d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457531e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457532f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457533g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457534h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457535i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f457536m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hb3)) {
            return false;
        }
        r45.hb3 hb3Var = (r45.hb3) fVar;
        return n51.f.a(this.f76494x2de60e5e, hb3Var.f76494x2de60e5e) && n51.f.a(this.f457530d, hb3Var.f457530d) && n51.f.a(this.f457531e, hb3Var.f457531e) && n51.f.a(this.f457532f, hb3Var.f457532f) && n51.f.a(this.f457533g, hb3Var.f457533g) && n51.f.a(this.f457534h, hb3Var.f457534h) && n51.f.a(this.f457535i, hb3Var.f457535i) && n51.f.a(this.f457536m, hb3Var.f457536m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f457530d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f457531e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f457532f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f457533g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f457534h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f457535i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f457536m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str8 = this.f457530d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f457531e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f457532f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f457533g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f457534h;
            if (str12 != null) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f457535i;
            if (str13 != null) {
                i18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f457536m;
            return str14 != null ? i18 + b36.f.j(8, str14) : i18;
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
        r45.hb3 hb3Var = (r45.hb3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    hb3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                hb3Var.f457530d = aVar2.k(intValue);
                return 0;
            case 3:
                hb3Var.f457531e = aVar2.k(intValue);
                return 0;
            case 4:
                hb3Var.f457532f = aVar2.k(intValue);
                return 0;
            case 5:
                hb3Var.f457533g = aVar2.k(intValue);
                return 0;
            case 6:
                hb3Var.f457534h = aVar2.k(intValue);
                return 0;
            case 7:
                hb3Var.f457535i = aVar2.k(intValue);
                return 0;
            case 8:
                hb3Var.f457536m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
