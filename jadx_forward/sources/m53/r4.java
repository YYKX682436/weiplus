package m53;

/* loaded from: classes2.dex */
public class r4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405541d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f405542e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405543f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405544g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405545h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f405546i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.r4)) {
            return false;
        }
        m53.r4 r4Var = (m53.r4) fVar;
        return n51.f.a(this.f405541d, r4Var.f405541d) && n51.f.a(this.f405542e, r4Var.f405542e) && n51.f.a(this.f405543f, r4Var.f405543f) && n51.f.a(this.f405544g, r4Var.f405544g) && n51.f.a(this.f405545h, r4Var.f405545h) && n51.f.a(this.f405546i, r4Var.f405546i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405542e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405541d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f405543f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f405544g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f405545h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f405546i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f405541d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str7 = this.f405543f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f405544g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f405545h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f405546i;
            return str10 != null ? j17 + b36.f.j(6, str10) : j17;
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
        m53.r4 r4Var = (m53.r4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r4Var.f405541d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    m53.s4 s4Var = new m53.s4();
                    if (bArr2 != null && bArr2.length > 0) {
                        s4Var.mo11468x92b714fd(bArr2);
                    }
                    r4Var.f405542e.add(s4Var);
                }
                return 0;
            case 3:
                r4Var.f405543f = aVar2.k(intValue);
                return 0;
            case 4:
                r4Var.f405544g = aVar2.k(intValue);
                return 0;
            case 5:
                r4Var.f405545h = aVar2.k(intValue);
                return 0;
            case 6:
                r4Var.f405546i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
