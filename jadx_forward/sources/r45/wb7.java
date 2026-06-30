package r45;

/* loaded from: classes7.dex */
public class wb7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f470580d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470581e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470582f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470583g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470584h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470585i;

    /* renamed from: m, reason: collision with root package name */
    public int f470586m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f470587n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f470588o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f470589p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wb7)) {
            return false;
        }
        r45.wb7 wb7Var = (r45.wb7) fVar;
        return n51.f.a(this.f76494x2de60e5e, wb7Var.f76494x2de60e5e) && n51.f.a(this.f470580d, wb7Var.f470580d) && n51.f.a(this.f470581e, wb7Var.f470581e) && n51.f.a(this.f470582f, wb7Var.f470582f) && n51.f.a(this.f470583g, wb7Var.f470583g) && n51.f.a(this.f470584h, wb7Var.f470584h) && n51.f.a(this.f470585i, wb7Var.f470585i) && n51.f.a(java.lang.Integer.valueOf(this.f470586m), java.lang.Integer.valueOf(wb7Var.f470586m)) && n51.f.a(this.f470587n, wb7Var.f470587n) && n51.f.a(this.f470588o, wb7Var.f470588o) && n51.f.a(this.f470589p, wb7Var.f470589p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470580d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f470581e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f470582f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f470583g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f470584h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f470585i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f470586m);
            java.lang.String str6 = this.f470587n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f470588o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f470589p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str9 = this.f470581e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f470582f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f470583g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f470584h;
            if (str12 != null) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f470585i;
            if (str13 != null) {
                i18 += b36.f.j(7, str13);
            }
            int e17 = i18 + b36.f.e(8, this.f470586m);
            java.lang.String str14 = this.f470587n;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f470588o;
            if (str15 != null) {
                e17 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f470589p;
            return str16 != null ? e17 + b36.f.j(11, str16) : e17;
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
        r45.wb7 wb7Var = (r45.wb7) objArr[1];
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
                    wb7Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.vb7 vb7Var = new r45.vb7();
                    if (bArr3 != null && bArr3.length > 0) {
                        vb7Var.mo11468x92b714fd(bArr3);
                    }
                    wb7Var.f470580d.add(vb7Var);
                }
                return 0;
            case 3:
                wb7Var.f470581e = aVar2.k(intValue);
                return 0;
            case 4:
                wb7Var.f470582f = aVar2.k(intValue);
                return 0;
            case 5:
                wb7Var.f470583g = aVar2.k(intValue);
                return 0;
            case 6:
                wb7Var.f470584h = aVar2.k(intValue);
                return 0;
            case 7:
                wb7Var.f470585i = aVar2.k(intValue);
                return 0;
            case 8:
                wb7Var.f470586m = aVar2.g(intValue);
                return 0;
            case 9:
                wb7Var.f470587n = aVar2.k(intValue);
                return 0;
            case 10:
                wb7Var.f470588o = aVar2.k(intValue);
                return 0;
            case 11:
                wb7Var.f470589p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
