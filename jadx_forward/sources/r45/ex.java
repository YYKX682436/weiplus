package r45;

/* loaded from: classes9.dex */
public class ex extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455300d;

    /* renamed from: e, reason: collision with root package name */
    public int f455301e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455302f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455303g;

    /* renamed from: h, reason: collision with root package name */
    public int f455304h;

    /* renamed from: i, reason: collision with root package name */
    public int f455305i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f455306m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455307n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f455308o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f455309p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f455310q;

    /* renamed from: r, reason: collision with root package name */
    public int f455311r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ex)) {
            return false;
        }
        r45.ex exVar = (r45.ex) fVar;
        return n51.f.a(this.f76494x2de60e5e, exVar.f76494x2de60e5e) && n51.f.a(this.f455300d, exVar.f455300d) && n51.f.a(java.lang.Integer.valueOf(this.f455301e), java.lang.Integer.valueOf(exVar.f455301e)) && n51.f.a(this.f455302f, exVar.f455302f) && n51.f.a(this.f455303g, exVar.f455303g) && n51.f.a(java.lang.Integer.valueOf(this.f455304h), java.lang.Integer.valueOf(exVar.f455304h)) && n51.f.a(java.lang.Integer.valueOf(this.f455305i), java.lang.Integer.valueOf(exVar.f455305i)) && n51.f.a(this.f455306m, exVar.f455306m) && n51.f.a(this.f455307n, exVar.f455307n) && n51.f.a(this.f455308o, exVar.f455308o) && n51.f.a(this.f455309p, exVar.f455309p) && n51.f.a(this.f455310q, exVar.f455310q) && n51.f.a(java.lang.Integer.valueOf(this.f455311r), java.lang.Integer.valueOf(exVar.f455311r));
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
            java.lang.String str = this.f455300d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f455301e);
            java.lang.String str2 = this.f455302f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f455303g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f455304h);
            fVar.e(7, this.f455305i);
            java.lang.String str4 = this.f455306m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f455307n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f455308o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f455309p;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f455310q;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.e(13, this.f455311r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str9 = this.f455300d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            int e17 = i18 + b36.f.e(3, this.f455301e);
            java.lang.String str10 = this.f455302f;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f455303g;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            int e18 = e17 + b36.f.e(6, this.f455304h) + b36.f.e(7, this.f455305i);
            java.lang.String str12 = this.f455306m;
            if (str12 != null) {
                e18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f455307n;
            if (str13 != null) {
                e18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f455308o;
            if (str14 != null) {
                e18 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f455309p;
            if (str15 != null) {
                e18 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f455310q;
            if (str16 != null) {
                e18 += b36.f.j(12, str16);
            }
            return e18 + b36.f.e(13, this.f455311r);
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
        r45.ex exVar = (r45.ex) objArr[1];
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
                    exVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                exVar.f455300d = aVar2.k(intValue);
                return 0;
            case 3:
                exVar.f455301e = aVar2.g(intValue);
                return 0;
            case 4:
                exVar.f455302f = aVar2.k(intValue);
                return 0;
            case 5:
                exVar.f455303g = aVar2.k(intValue);
                return 0;
            case 6:
                exVar.f455304h = aVar2.g(intValue);
                return 0;
            case 7:
                exVar.f455305i = aVar2.g(intValue);
                return 0;
            case 8:
                exVar.f455306m = aVar2.k(intValue);
                return 0;
            case 9:
                exVar.f455307n = aVar2.k(intValue);
                return 0;
            case 10:
                exVar.f455308o = aVar2.k(intValue);
                return 0;
            case 11:
                exVar.f455309p = aVar2.k(intValue);
                return 0;
            case 12:
                exVar.f455310q = aVar2.k(intValue);
                return 0;
            case 13:
                exVar.f455311r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
