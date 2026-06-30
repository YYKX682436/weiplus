package r45;

/* loaded from: classes8.dex */
public class i97 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458387d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458388e;

    /* renamed from: f, reason: collision with root package name */
    public int f458389f;

    /* renamed from: g, reason: collision with root package name */
    public int f458390g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458391h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458392i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f458393m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f458394n;

    /* renamed from: o, reason: collision with root package name */
    public int f458395o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f458396p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f458397q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i97)) {
            return false;
        }
        r45.i97 i97Var = (r45.i97) fVar;
        return n51.f.a(this.f76494x2de60e5e, i97Var.f76494x2de60e5e) && n51.f.a(this.f458387d, i97Var.f458387d) && n51.f.a(this.f458388e, i97Var.f458388e) && n51.f.a(java.lang.Integer.valueOf(this.f458389f), java.lang.Integer.valueOf(i97Var.f458389f)) && n51.f.a(java.lang.Integer.valueOf(this.f458390g), java.lang.Integer.valueOf(i97Var.f458390g)) && n51.f.a(this.f458391h, i97Var.f458391h) && n51.f.a(this.f458392i, i97Var.f458392i) && n51.f.a(this.f458393m, i97Var.f458393m) && n51.f.a(this.f458394n, i97Var.f458394n) && n51.f.a(java.lang.Integer.valueOf(this.f458395o), java.lang.Integer.valueOf(i97Var.f458395o)) && n51.f.a(this.f458396p, i97Var.f458396p) && n51.f.a(this.f458397q, i97Var.f458397q);
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
            java.lang.String str = this.f458387d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f458388e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f458389f);
            fVar.e(5, this.f458390g);
            java.lang.String str3 = this.f458391h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f458392i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f458393m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f458394n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.e(10, this.f458395o);
            java.lang.String str7 = this.f458396p;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f458397q;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str9 = this.f458387d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f458388e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            int e17 = i18 + b36.f.e(4, this.f458389f) + b36.f.e(5, this.f458390g);
            java.lang.String str11 = this.f458391h;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f458392i;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f458393m;
            if (str13 != null) {
                e17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f458394n;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            int e18 = e17 + b36.f.e(10, this.f458395o);
            java.lang.String str15 = this.f458396p;
            if (str15 != null) {
                e18 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f458397q;
            return str16 != null ? e18 + b36.f.j(12, str16) : e18;
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
        r45.i97 i97Var = (r45.i97) objArr[1];
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
                    i97Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                i97Var.f458387d = aVar2.k(intValue);
                return 0;
            case 3:
                i97Var.f458388e = aVar2.k(intValue);
                return 0;
            case 4:
                i97Var.f458389f = aVar2.g(intValue);
                return 0;
            case 5:
                i97Var.f458390g = aVar2.g(intValue);
                return 0;
            case 6:
                i97Var.f458391h = aVar2.k(intValue);
                return 0;
            case 7:
                i97Var.f458392i = aVar2.k(intValue);
                return 0;
            case 8:
                i97Var.f458393m = aVar2.k(intValue);
                return 0;
            case 9:
                i97Var.f458394n = aVar2.k(intValue);
                return 0;
            case 10:
                i97Var.f458395o = aVar2.g(intValue);
                return 0;
            case 11:
                i97Var.f458396p = aVar2.k(intValue);
                return 0;
            case 12:
                i97Var.f458397q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
