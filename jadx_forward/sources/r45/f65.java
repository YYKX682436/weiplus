package r45;

/* loaded from: classes4.dex */
public class f65 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455579d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455580e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455581f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455582g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455583h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455584i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f455585m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455586n;

    /* renamed from: o, reason: collision with root package name */
    public int f455587o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f455588p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f65)) {
            return false;
        }
        r45.f65 f65Var = (r45.f65) fVar;
        return n51.f.a(this.f76494x2de60e5e, f65Var.f76494x2de60e5e) && n51.f.a(this.f455579d, f65Var.f455579d) && n51.f.a(this.f455580e, f65Var.f455580e) && n51.f.a(this.f455581f, f65Var.f455581f) && n51.f.a(this.f455582g, f65Var.f455582g) && n51.f.a(this.f455583h, f65Var.f455583h) && n51.f.a(this.f455584i, f65Var.f455584i) && n51.f.a(this.f455585m, f65Var.f455585m) && n51.f.a(this.f455586n, f65Var.f455586n) && n51.f.a(java.lang.Integer.valueOf(this.f455587o), java.lang.Integer.valueOf(f65Var.f455587o)) && n51.f.a(this.f455588p, f65Var.f455588p);
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
            java.lang.String str = this.f455579d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f455580e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f455581f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f455582g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f455583h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f455584i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f455585m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f455586n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            fVar.e(10, this.f455587o);
            java.lang.String str9 = this.f455588p;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str10 = this.f455579d;
            if (str10 != null) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f455580e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f455581f;
            if (str12 != null) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f455582g;
            if (str13 != null) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f455583h;
            if (str14 != null) {
                i18 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f455584i;
            if (str15 != null) {
                i18 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f455585m;
            if (str16 != null) {
                i18 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f455586n;
            if (str17 != null) {
                i18 += b36.f.j(9, str17);
            }
            int e17 = i18 + b36.f.e(10, this.f455587o);
            java.lang.String str18 = this.f455588p;
            return str18 != null ? e17 + b36.f.j(11, str18) : e17;
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
        r45.f65 f65Var = (r45.f65) objArr[1];
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
                    f65Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                f65Var.f455579d = aVar2.k(intValue);
                return 0;
            case 3:
                f65Var.f455580e = aVar2.k(intValue);
                return 0;
            case 4:
                f65Var.f455581f = aVar2.k(intValue);
                return 0;
            case 5:
                f65Var.f455582g = aVar2.k(intValue);
                return 0;
            case 6:
                f65Var.f455583h = aVar2.k(intValue);
                return 0;
            case 7:
                f65Var.f455584i = aVar2.k(intValue);
                return 0;
            case 8:
                f65Var.f455585m = aVar2.k(intValue);
                return 0;
            case 9:
                f65Var.f455586n = aVar2.k(intValue);
                return 0;
            case 10:
                f65Var.f455587o = aVar2.g(intValue);
                return 0;
            case 11:
                f65Var.f455588p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
