package r45;

/* loaded from: classes9.dex */
public class k extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459769d;

    /* renamed from: e, reason: collision with root package name */
    public int f459770e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459771f;

    /* renamed from: g, reason: collision with root package name */
    public r45.r1 f459772g;

    /* renamed from: h, reason: collision with root package name */
    public long f459773h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459774i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459775m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f459776n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f459777o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f459778p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f459779q = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k)) {
            return false;
        }
        r45.k kVar = (r45.k) fVar;
        return n51.f.a(this.f76494x2de60e5e, kVar.f76494x2de60e5e) && n51.f.a(this.f459769d, kVar.f459769d) && n51.f.a(java.lang.Integer.valueOf(this.f459770e), java.lang.Integer.valueOf(kVar.f459770e)) && n51.f.a(this.f459771f, kVar.f459771f) && n51.f.a(this.f459772g, kVar.f459772g) && n51.f.a(java.lang.Long.valueOf(this.f459773h), java.lang.Long.valueOf(kVar.f459773h)) && n51.f.a(this.f459774i, kVar.f459774i) && n51.f.a(this.f459775m, kVar.f459775m) && n51.f.a(this.f459776n, kVar.f459776n) && n51.f.a(this.f459777o, kVar.f459777o) && n51.f.a(java.lang.Boolean.valueOf(this.f459778p), java.lang.Boolean.valueOf(kVar.f459778p)) && n51.f.a(this.f459779q, kVar.f459779q);
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
            java.lang.String str = this.f459769d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f459770e);
            java.lang.String str2 = this.f459771f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.r1 r1Var = this.f459772g;
            if (r1Var != null) {
                fVar.i(5, r1Var.mo75928xcd1e8d8());
                this.f459772g.mo75956x3d5d1f78(fVar);
            }
            fVar.h(6, this.f459773h);
            java.lang.String str3 = this.f459774i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f459775m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f459776n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f459777o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            fVar.a(11, this.f459778p);
            fVar.g(12, 8, this.f459779q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f459769d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int e17 = i18 + b36.f.e(3, this.f459770e);
            java.lang.String str8 = this.f459771f;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            r45.r1 r1Var2 = this.f459772g;
            if (r1Var2 != null) {
                e17 += b36.f.i(5, r1Var2.mo75928xcd1e8d8());
            }
            int h17 = e17 + b36.f.h(6, this.f459773h);
            java.lang.String str9 = this.f459774i;
            if (str9 != null) {
                h17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f459775m;
            if (str10 != null) {
                h17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f459776n;
            if (str11 != null) {
                h17 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f459777o;
            if (str12 != null) {
                h17 += b36.f.j(10, str12);
            }
            return h17 + b36.f.a(11, this.f459778p) + b36.f.g(12, 8, this.f459779q);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f459779q.clear();
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
        r45.k kVar = (r45.k) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    kVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                kVar.f459769d = aVar2.k(intValue);
                return 0;
            case 3:
                kVar.f459770e = aVar2.g(intValue);
                return 0;
            case 4:
                kVar.f459771f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.r1 r1Var3 = new r45.r1();
                    if (bArr3 != null && bArr3.length > 0) {
                        r1Var3.mo11468x92b714fd(bArr3);
                    }
                    kVar.f459772g = r1Var3;
                }
                return 0;
            case 6:
                kVar.f459773h = aVar2.i(intValue);
                return 0;
            case 7:
                kVar.f459774i = aVar2.k(intValue);
                return 0;
            case 8:
                kVar.f459775m = aVar2.k(intValue);
                return 0;
            case 9:
                kVar.f459776n = aVar2.k(intValue);
                return 0;
            case 10:
                kVar.f459777o = aVar2.k(intValue);
                return 0;
            case 11:
                kVar.f459778p = aVar2.c(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.bc6 bc6Var = new r45.bc6();
                    if (bArr4 != null && bArr4.length > 0) {
                        bc6Var.mo11468x92b714fd(bArr4);
                    }
                    kVar.f459779q.add(bc6Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
