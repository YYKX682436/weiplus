package r45;

/* loaded from: classes14.dex */
public class ru3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.y24 f466743d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466744e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f466745f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466746g;

    /* renamed from: h, reason: collision with root package name */
    public int f466747h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466748i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466749m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f466750n;

    /* renamed from: o, reason: collision with root package name */
    public int f466751o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f466752p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ru3)) {
            return false;
        }
        r45.ru3 ru3Var = (r45.ru3) fVar;
        return n51.f.a(this.f76494x2de60e5e, ru3Var.f76494x2de60e5e) && n51.f.a(this.f466743d, ru3Var.f466743d) && n51.f.a(this.f466744e, ru3Var.f466744e) && n51.f.a(this.f466745f, ru3Var.f466745f) && n51.f.a(this.f466746g, ru3Var.f466746g) && n51.f.a(java.lang.Integer.valueOf(this.f466747h), java.lang.Integer.valueOf(ru3Var.f466747h)) && n51.f.a(this.f466748i, ru3Var.f466748i) && n51.f.a(this.f466749m, ru3Var.f466749m) && n51.f.a(this.f466750n, ru3Var.f466750n) && n51.f.a(java.lang.Integer.valueOf(this.f466751o), java.lang.Integer.valueOf(ru3Var.f466751o)) && n51.f.a(this.f466752p, ru3Var.f466752p);
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
            r45.y24 y24Var = this.f466743d;
            if (y24Var != null) {
                fVar.i(2, y24Var.mo75928xcd1e8d8());
                this.f466743d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f466744e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.cu5 cu5Var = this.f466745f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f466745f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f466746g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f466747h);
            java.lang.String str3 = this.f466748i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f466749m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f466750n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f466751o);
            java.lang.String str6 = this.f466752p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.y24 y24Var2 = this.f466743d;
            if (y24Var2 != null) {
                i18 += b36.f.i(2, y24Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f466744e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            r45.cu5 cu5Var2 = this.f466745f;
            if (cu5Var2 != null) {
                i18 += b36.f.i(4, cu5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f466746g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            int e17 = i18 + b36.f.e(6, this.f466747h);
            java.lang.String str9 = this.f466748i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f466749m;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f466750n;
            if (str11 != null) {
                e17 += b36.f.j(9, str11);
            }
            int e18 = e17 + b36.f.e(10, this.f466751o);
            java.lang.String str12 = this.f466752p;
            return str12 != null ? e18 + b36.f.j(11, str12) : e18;
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
        r45.ru3 ru3Var = (r45.ru3) objArr[1];
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
                    ru3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.y24 y24Var3 = new r45.y24();
                    if (bArr2 != null && bArr2.length > 0) {
                        y24Var3.mo11468x92b714fd(bArr2);
                    }
                    ru3Var.f466743d = y24Var3;
                }
                return 0;
            case 3:
                ru3Var.f466744e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    ru3Var.f466745f = cu5Var3;
                }
                return 0;
            case 5:
                ru3Var.f466746g = aVar2.k(intValue);
                return 0;
            case 6:
                ru3Var.f466747h = aVar2.g(intValue);
                return 0;
            case 7:
                ru3Var.f466748i = aVar2.k(intValue);
                return 0;
            case 8:
                ru3Var.f466749m = aVar2.k(intValue);
                return 0;
            case 9:
                ru3Var.f466750n = aVar2.k(intValue);
                return 0;
            case 10:
                ru3Var.f466751o = aVar2.g(intValue);
                return 0;
            case 11:
                ru3Var.f466752p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
