package r45;

/* loaded from: classes8.dex */
public class i63 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458285d;

    /* renamed from: e, reason: collision with root package name */
    public int f458286e;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458289h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458290i;

    /* renamed from: n, reason: collision with root package name */
    public int f458292n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f458293o;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f458287f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f458288g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f458291m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i63)) {
            return false;
        }
        r45.i63 i63Var = (r45.i63) fVar;
        return n51.f.a(this.f458285d, i63Var.f458285d) && n51.f.a(java.lang.Integer.valueOf(this.f458286e), java.lang.Integer.valueOf(i63Var.f458286e)) && n51.f.a(this.f458287f, i63Var.f458287f) && n51.f.a(this.f458288g, i63Var.f458288g) && n51.f.a(this.f458289h, i63Var.f458289h) && n51.f.a(this.f458290i, i63Var.f458290i) && n51.f.a(this.f458291m, i63Var.f458291m) && n51.f.a(java.lang.Integer.valueOf(this.f458292n), java.lang.Integer.valueOf(i63Var.f458292n)) && n51.f.a(java.lang.Boolean.valueOf(this.f458293o), java.lang.Boolean.valueOf(i63Var.f458293o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f458291m;
        java.util.LinkedList linkedList2 = this.f458288g;
        java.util.LinkedList linkedList3 = this.f458287f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458285d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f458286e);
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 8, linkedList2);
            java.lang.String str2 = this.f458289h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f458290i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f458292n);
            fVar.a(9, this.f458293o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f458285d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f458286e) + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 8, linkedList2);
            java.lang.String str5 = this.f458289h;
            if (str5 != null) {
                j17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f458290i;
            if (str6 != null) {
                j17 += b36.f.j(6, str6);
            }
            return j17 + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f458292n) + b36.f.a(9, this.f458293o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        r45.i63 i63Var = (r45.i63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i63Var.f458285d = aVar2.k(intValue);
                return 0;
            case 2:
                i63Var.f458286e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.c63 c63Var = new r45.c63();
                    if (bArr2 != null && bArr2.length > 0) {
                        c63Var.mo11468x92b714fd(bArr2);
                    }
                    i63Var.f458287f.add(c63Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.k63 k63Var = new r45.k63();
                    if (bArr3 != null && bArr3.length > 0) {
                        k63Var.mo11468x92b714fd(bArr3);
                    }
                    i63Var.f458288g.add(k63Var);
                }
                return 0;
            case 5:
                i63Var.f458289h = aVar2.k(intValue);
                return 0;
            case 6:
                i63Var.f458290i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.j63 j63Var = new r45.j63();
                    if (bArr4 != null && bArr4.length > 0) {
                        j63Var.mo11468x92b714fd(bArr4);
                    }
                    i63Var.f458291m.add(j63Var);
                }
                return 0;
            case 8:
                i63Var.f458292n = aVar2.g(intValue);
                return 0;
            case 9:
                i63Var.f458293o = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
