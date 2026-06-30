package m53;

/* loaded from: classes8.dex */
public class s1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405575d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405576e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f405577f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405578g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405579h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f405580i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f405581m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f405582n;

    /* renamed from: o, reason: collision with root package name */
    public m53.h f405583o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.s1)) {
            return false;
        }
        m53.s1 s1Var = (m53.s1) fVar;
        return n51.f.a(this.f405575d, s1Var.f405575d) && n51.f.a(this.f405576e, s1Var.f405576e) && n51.f.a(this.f405577f, s1Var.f405577f) && n51.f.a(this.f405578g, s1Var.f405578g) && n51.f.a(this.f405579h, s1Var.f405579h) && n51.f.a(this.f405580i, s1Var.f405580i) && n51.f.a(this.f405581m, s1Var.f405581m) && n51.f.a(this.f405582n, s1Var.f405582n) && n51.f.a(this.f405583o, s1Var.f405583o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405577f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405575d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405576e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList);
            java.lang.String str3 = this.f405578g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f405579h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f405580i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f405581m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f405582n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            m53.h hVar = this.f405583o;
            if (hVar != null) {
                fVar.i(10, hVar.mo75928xcd1e8d8());
                this.f405583o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f405575d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f405576e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int g17 = j17 + b36.f.g(3, 1, linkedList);
            java.lang.String str10 = this.f405578g;
            if (str10 != null) {
                g17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f405579h;
            if (str11 != null) {
                g17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f405580i;
            if (str12 != null) {
                g17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f405581m;
            if (str13 != null) {
                g17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f405582n;
            if (str14 != null) {
                g17 += b36.f.j(9, str14);
            }
            m53.h hVar2 = this.f405583o;
            return hVar2 != null ? g17 + b36.f.i(10, hVar2.mo75928xcd1e8d8()) : g17;
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
        m53.s1 s1Var = (m53.s1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s1Var.f405575d = aVar2.k(intValue);
                return 0;
            case 2:
                s1Var.f405576e = aVar2.k(intValue);
                return 0;
            case 3:
                s1Var.f405577f.add(aVar2.k(intValue));
                return 0;
            case 4:
                s1Var.f405578g = aVar2.k(intValue);
                return 0;
            case 5:
                s1Var.f405579h = aVar2.k(intValue);
                return 0;
            case 6:
                s1Var.f405580i = aVar2.k(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                s1Var.f405581m = aVar2.k(intValue);
                return 0;
            case 9:
                s1Var.f405582n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    m53.h hVar3 = new m53.h();
                    if (bArr2 != null && bArr2.length > 0) {
                        hVar3.mo11468x92b714fd(bArr2);
                    }
                    s1Var.f405583o = hVar3;
                }
                return 0;
        }
    }
}
