package r45;

/* loaded from: classes9.dex */
public class wp3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f470897d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470898e;

    /* renamed from: f, reason: collision with root package name */
    public int f470899f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470900g;

    /* renamed from: h, reason: collision with root package name */
    public int f470901h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f470902i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470903m;

    /* renamed from: n, reason: collision with root package name */
    public int f470904n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f470905o;

    /* renamed from: p, reason: collision with root package name */
    public int f470906p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f470907q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wp3)) {
            return false;
        }
        r45.wp3 wp3Var = (r45.wp3) fVar;
        return n51.f.a(this.f76492x92037252, wp3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f470897d), java.lang.Integer.valueOf(wp3Var.f470897d)) && n51.f.a(this.f470898e, wp3Var.f470898e) && n51.f.a(java.lang.Integer.valueOf(this.f470899f), java.lang.Integer.valueOf(wp3Var.f470899f)) && n51.f.a(this.f470900g, wp3Var.f470900g) && n51.f.a(java.lang.Integer.valueOf(this.f470901h), java.lang.Integer.valueOf(wp3Var.f470901h)) && n51.f.a(this.f470902i, wp3Var.f470902i) && n51.f.a(this.f470903m, wp3Var.f470903m) && n51.f.a(java.lang.Integer.valueOf(this.f470904n), java.lang.Integer.valueOf(wp3Var.f470904n)) && n51.f.a(this.f470905o, wp3Var.f470905o) && n51.f.a(java.lang.Integer.valueOf(this.f470906p), java.lang.Integer.valueOf(wp3Var.f470906p)) && n51.f.a(this.f470907q, wp3Var.f470907q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470902i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f470897d);
            java.lang.String str = this.f470898e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f470899f);
            java.lang.String str2 = this.f470900g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f470901h);
            fVar.g(7, 8, linkedList);
            java.lang.String str3 = this.f470903m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f470904n);
            java.lang.String str4 = this.f470905o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.e(11, this.f470906p);
            r45.cu5 cu5Var = this.f470907q;
            if (cu5Var == null) {
                return 0;
            }
            fVar.i(12, cu5Var.mo75928xcd1e8d8());
            this.f470907q.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f470897d);
            java.lang.String str5 = this.f470898e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f470899f);
            java.lang.String str6 = this.f470900g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            int e18 = e17 + b36.f.e(6, this.f470901h) + b36.f.g(7, 8, linkedList);
            java.lang.String str7 = this.f470903m;
            if (str7 != null) {
                e18 += b36.f.j(8, str7);
            }
            int e19 = e18 + b36.f.e(9, this.f470904n);
            java.lang.String str8 = this.f470905o;
            if (str8 != null) {
                e19 += b36.f.j(10, str8);
            }
            int e27 = e19 + b36.f.e(11, this.f470906p);
            r45.cu5 cu5Var2 = this.f470907q;
            return cu5Var2 != null ? e27 + b36.f.i(12, cu5Var2.mo75928xcd1e8d8()) : e27;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.wp3 wp3Var = (r45.wp3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    wp3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                wp3Var.f470897d = aVar2.g(intValue);
                return 0;
            case 3:
                wp3Var.f470898e = aVar2.k(intValue);
                return 0;
            case 4:
                wp3Var.f470899f = aVar2.g(intValue);
                return 0;
            case 5:
                wp3Var.f470900g = aVar2.k(intValue);
                return 0;
            case 6:
                wp3Var.f470901h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    wp3Var.f470902i.add(du5Var);
                }
                return 0;
            case 8:
                wp3Var.f470903m = aVar2.k(intValue);
                return 0;
            case 9:
                wp3Var.f470904n = aVar2.g(intValue);
                return 0;
            case 10:
                wp3Var.f470905o = aVar2.k(intValue);
                return 0;
            case 11:
                wp3Var.f470906p = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    wp3Var.f470907q = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
