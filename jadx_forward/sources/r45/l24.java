package r45;

/* loaded from: classes7.dex */
public class l24 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j14 f460619d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460620e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f460621f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460622g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460623h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460624i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460625m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f460626n;

    /* renamed from: o, reason: collision with root package name */
    public int f460627o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f460628p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f460629q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l24)) {
            return false;
        }
        r45.l24 l24Var = (r45.l24) fVar;
        return n51.f.a(this.f76492x92037252, l24Var.f76492x92037252) && n51.f.a(this.f460619d, l24Var.f460619d) && n51.f.a(this.f460620e, l24Var.f460620e) && n51.f.a(this.f460621f, l24Var.f460621f) && n51.f.a(this.f460622g, l24Var.f460622g) && n51.f.a(this.f460623h, l24Var.f460623h) && n51.f.a(this.f460624i, l24Var.f460624i) && n51.f.a(this.f460625m, l24Var.f460625m) && n51.f.a(this.f460626n, l24Var.f460626n) && n51.f.a(java.lang.Integer.valueOf(this.f460627o), java.lang.Integer.valueOf(l24Var.f460627o)) && n51.f.a(this.f460628p, l24Var.f460628p) && n51.f.a(this.f460629q, l24Var.f460629q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f460621f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.j14 j14Var = this.f460619d;
            if (j14Var != null) {
                fVar.i(2, j14Var.mo75928xcd1e8d8());
                this.f460619d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f460620e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            java.lang.String str2 = this.f460622g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f460623h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f460624i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f460625m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f460626n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.e(10, this.f460627o);
            java.lang.String str7 = this.f460628p;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f460629q;
            if (str8 == null) {
                return 0;
            }
            fVar.j(12, str8);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.j14 j14Var2 = this.f460619d;
            if (j14Var2 != null) {
                i18 += b36.f.i(2, j14Var2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f460620e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList);
            java.lang.String str10 = this.f460622g;
            if (str10 != null) {
                g17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f460623h;
            if (str11 != null) {
                g17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f460624i;
            if (str12 != null) {
                g17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f460625m;
            if (str13 != null) {
                g17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f460626n;
            if (str14 != null) {
                g17 += b36.f.j(9, str14);
            }
            int e17 = g17 + b36.f.e(10, this.f460627o);
            java.lang.String str15 = this.f460628p;
            if (str15 != null) {
                e17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f460629q;
            return str16 != null ? e17 + b36.f.j(12, str16) : e17;
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
        r45.l24 l24Var = (r45.l24) objArr[1];
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
                    l24Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.j14 j14Var3 = new r45.j14();
                    if (bArr3 != null && bArr3.length > 0) {
                        j14Var3.mo11468x92b714fd(bArr3);
                    }
                    l24Var.f460619d = j14Var3;
                }
                return 0;
            case 3:
                l24Var.f460620e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.jv5 jv5Var = new r45.jv5();
                    if (bArr4 != null && bArr4.length > 0) {
                        jv5Var.mo11468x92b714fd(bArr4);
                    }
                    l24Var.f460621f.add(jv5Var);
                }
                return 0;
            case 5:
                l24Var.f460622g = aVar2.k(intValue);
                return 0;
            case 6:
                l24Var.f460623h = aVar2.k(intValue);
                return 0;
            case 7:
                l24Var.f460624i = aVar2.k(intValue);
                return 0;
            case 8:
                l24Var.f460625m = aVar2.k(intValue);
                return 0;
            case 9:
                l24Var.f460626n = aVar2.k(intValue);
                return 0;
            case 10:
                l24Var.f460627o = aVar2.g(intValue);
                return 0;
            case 11:
                l24Var.f460628p = aVar2.k(intValue);
                return 0;
            case 12:
                l24Var.f460629q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
