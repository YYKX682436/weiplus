package r45;

/* loaded from: classes9.dex */
public class zg3 extends r45.js5 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473530f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f473531g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473532h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473533i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f473534m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f473535n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f473536o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f473537p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f473539r;

    /* renamed from: d, reason: collision with root package name */
    public int f473528d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473529e = "ok";

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f473538q = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zg3)) {
            return false;
        }
        r45.zg3 zg3Var = (r45.zg3) fVar;
        return n51.f.a(this.f76492x92037252, zg3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f473528d), java.lang.Integer.valueOf(zg3Var.f473528d)) && n51.f.a(this.f473529e, zg3Var.f473529e) && n51.f.a(this.f473530f, zg3Var.f473530f) && n51.f.a(java.lang.Boolean.valueOf(this.f473531g), java.lang.Boolean.valueOf(zg3Var.f473531g)) && n51.f.a(this.f473532h, zg3Var.f473532h) && n51.f.a(this.f473533i, zg3Var.f473533i) && n51.f.a(this.f473534m, zg3Var.f473534m) && n51.f.a(this.f473535n, zg3Var.f473535n) && n51.f.a(this.f473536o, zg3Var.f473536o) && n51.f.a(this.f473537p, zg3Var.f473537p) && n51.f.a(this.f473538q, zg3Var.f473538q) && n51.f.a(java.lang.Boolean.valueOf(this.f473539r), java.lang.Boolean.valueOf(zg3Var.f473539r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473538q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f473528d);
            java.lang.String str = this.f473529e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f473530f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(6, this.f473531g);
            java.lang.String str3 = this.f473532h;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f473533i;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f473534m;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f473535n;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f473536o;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f473537p;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.g(13, 8, linkedList);
            fVar.a(14, this.f473539r);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f473528d);
            java.lang.String str9 = this.f473529e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f473530f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            int a17 = i18 + b36.f.a(6, this.f473531g);
            java.lang.String str11 = this.f473532h;
            if (str11 != null) {
                a17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f473533i;
            if (str12 != null) {
                a17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f473534m;
            if (str13 != null) {
                a17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f473535n;
            if (str14 != null) {
                a17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f473536o;
            if (str15 != null) {
                a17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f473537p;
            if (str16 != null) {
                a17 += b36.f.j(12, str16);
            }
            return a17 + b36.f.g(13, 8, linkedList) + b36.f.a(14, this.f473539r);
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
        r45.zg3 zg3Var = (r45.zg3) objArr[1];
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
                    zg3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                zg3Var.f473528d = aVar2.g(intValue);
                return 0;
            case 3:
                zg3Var.f473529e = aVar2.k(intValue);
                return 0;
            case 4:
                zg3Var.f473530f = aVar2.k(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                zg3Var.f473531g = aVar2.c(intValue);
                return 0;
            case 7:
                zg3Var.f473532h = aVar2.k(intValue);
                return 0;
            case 8:
                zg3Var.f473533i = aVar2.k(intValue);
                return 0;
            case 9:
                zg3Var.f473534m = aVar2.k(intValue);
                return 0;
            case 10:
                zg3Var.f473535n = aVar2.k(intValue);
                return 0;
            case 11:
                zg3Var.f473536o = aVar2.k(intValue);
                return 0;
            case 12:
                zg3Var.f473537p = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.zv3 zv3Var = new r45.zv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        zv3Var.mo11468x92b714fd(bArr3);
                    }
                    zg3Var.f473538q.add(zv3Var);
                }
                return 0;
            case 14:
                zg3Var.f473539r = aVar2.c(intValue);
                return 0;
        }
    }
}
