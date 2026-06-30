package r45;

/* loaded from: classes9.dex */
public class xj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471686d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471687e;

    /* renamed from: f, reason: collision with root package name */
    public int f471688f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471689g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471690h;

    /* renamed from: i, reason: collision with root package name */
    public int f471691i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471692m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f471693n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f471694o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xj)) {
            return false;
        }
        r45.xj xjVar = (r45.xj) fVar;
        return n51.f.a(this.f471686d, xjVar.f471686d) && n51.f.a(this.f471687e, xjVar.f471687e) && n51.f.a(java.lang.Integer.valueOf(this.f471688f), java.lang.Integer.valueOf(xjVar.f471688f)) && n51.f.a(this.f471689g, xjVar.f471689g) && n51.f.a(this.f471690h, xjVar.f471690h) && n51.f.a(java.lang.Integer.valueOf(this.f471691i), java.lang.Integer.valueOf(xjVar.f471691i)) && n51.f.a(this.f471692m, xjVar.f471692m) && n51.f.a(this.f471693n, xjVar.f471693n) && n51.f.a(java.lang.Integer.valueOf(this.f471694o), java.lang.Integer.valueOf(xjVar.f471694o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471693n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471686d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f471687e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f471688f);
            java.lang.String str3 = this.f471689g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f471690h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f471691i);
            java.lang.String str5 = this.f471692m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.g(8, 8, linkedList);
            fVar.e(9, this.f471694o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f471686d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f471687e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f471688f);
            java.lang.String str8 = this.f471689g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f471690h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            int e18 = e17 + b36.f.e(6, this.f471691i);
            java.lang.String str10 = this.f471692m;
            if (str10 != null) {
                e18 += b36.f.j(7, str10);
            }
            return e18 + b36.f.g(8, 8, linkedList) + b36.f.e(9, this.f471694o);
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
        r45.xj xjVar = (r45.xj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xjVar.f471686d = aVar2.k(intValue);
                return 0;
            case 2:
                xjVar.f471687e = aVar2.k(intValue);
                return 0;
            case 3:
                xjVar.f471688f = aVar2.g(intValue);
                return 0;
            case 4:
                xjVar.f471689g = aVar2.k(intValue);
                return 0;
            case 5:
                xjVar.f471690h = aVar2.k(intValue);
                return 0;
            case 6:
                xjVar.f471691i = aVar2.g(intValue);
                return 0;
            case 7:
                xjVar.f471692m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.yj yjVar = new r45.yj();
                    if (bArr2 != null && bArr2.length > 0) {
                        yjVar.mo11468x92b714fd(bArr2);
                    }
                    xjVar.f471693n.add(yjVar);
                }
                return 0;
            case 9:
                xjVar.f471694o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
