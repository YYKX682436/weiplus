package vr4;

/* loaded from: classes9.dex */
public class l0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f521306d;

    /* renamed from: e, reason: collision with root package name */
    public double f521307e;

    /* renamed from: f, reason: collision with root package name */
    public double f521308f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f521309g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f521310h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public double f521311i;

    /* renamed from: m, reason: collision with root package name */
    public double f521312m;

    /* renamed from: n, reason: collision with root package name */
    public int f521313n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f521314o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f521315p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f521316q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.l0)) {
            return false;
        }
        vr4.l0 l0Var = (vr4.l0) fVar;
        return n51.f.a(this.f521306d, l0Var.f521306d) && n51.f.a(java.lang.Double.valueOf(this.f521307e), java.lang.Double.valueOf(l0Var.f521307e)) && n51.f.a(java.lang.Double.valueOf(this.f521308f), java.lang.Double.valueOf(l0Var.f521308f)) && n51.f.a(this.f521309g, l0Var.f521309g) && n51.f.a(this.f521310h, l0Var.f521310h) && n51.f.a(java.lang.Double.valueOf(this.f521311i), java.lang.Double.valueOf(l0Var.f521311i)) && n51.f.a(java.lang.Double.valueOf(this.f521312m), java.lang.Double.valueOf(l0Var.f521312m)) && n51.f.a(java.lang.Integer.valueOf(this.f521313n), java.lang.Integer.valueOf(l0Var.f521313n)) && n51.f.a(this.f521314o, l0Var.f521314o) && n51.f.a(this.f521315p, l0Var.f521315p) && n51.f.a(this.f521316q, l0Var.f521316q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f521310h;
        java.util.LinkedList linkedList2 = this.f521309g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f521306d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.c(2, this.f521307e);
            fVar.c(3, this.f521308f);
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            fVar.c(6, this.f521311i);
            fVar.c(7, this.f521312m);
            fVar.e(8, this.f521313n);
            java.lang.String str2 = this.f521314o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f521315p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f521316q;
            if (gVar == null) {
                return 0;
            }
            fVar.b(11, gVar);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f521306d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.c(2, this.f521307e) + b36.f.c(3, this.f521308f) + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList) + b36.f.c(6, this.f521311i) + b36.f.c(7, this.f521312m) + b36.f.e(8, this.f521313n);
            java.lang.String str5 = this.f521314o;
            if (str5 != null) {
                j17 += b36.f.j(9, str5);
            }
            java.lang.String str6 = this.f521315p;
            if (str6 != null) {
                j17 += b36.f.j(10, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f521316q;
            return gVar2 != null ? j17 + b36.f.b(11, gVar2) : j17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        vr4.l0 l0Var = (vr4.l0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l0Var.f521306d = aVar2.k(intValue);
                return 0;
            case 2:
                l0Var.f521307e = aVar2.e(intValue);
                return 0;
            case 3:
                l0Var.f521308f = aVar2.e(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    vr4.j jVar = new vr4.j();
                    if (bArr2 != null && bArr2.length > 0) {
                        jVar.mo11468x92b714fd(bArr2);
                    }
                    l0Var.f521309g.add(jVar);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    vr4.i1 i1Var = new vr4.i1();
                    if (bArr3 != null && bArr3.length > 0) {
                        i1Var.mo11468x92b714fd(bArr3);
                    }
                    l0Var.f521310h.add(i1Var);
                }
                return 0;
            case 6:
                l0Var.f521311i = aVar2.e(intValue);
                return 0;
            case 7:
                l0Var.f521312m = aVar2.e(intValue);
                return 0;
            case 8:
                l0Var.f521313n = aVar2.g(intValue);
                return 0;
            case 9:
                l0Var.f521314o = aVar2.k(intValue);
                return 0;
            case 10:
                l0Var.f521315p = aVar2.k(intValue);
                return 0;
            case 11:
                l0Var.f521316q = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
