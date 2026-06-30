package r45;

/* loaded from: classes2.dex */
public class m95 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461811d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461812e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f461813f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f461814g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f461815h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461816i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f461817m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m95)) {
            return false;
        }
        r45.m95 m95Var = (r45.m95) fVar;
        return n51.f.a(this.f461811d, m95Var.f461811d) && n51.f.a(this.f461812e, m95Var.f461812e) && n51.f.a(this.f461813f, m95Var.f461813f) && n51.f.a(this.f461814g, m95Var.f461814g) && n51.f.a(this.f461815h, m95Var.f461815h) && n51.f.a(this.f461816i, m95Var.f461816i) && n51.f.a(java.lang.Boolean.valueOf(this.f461817m), java.lang.Boolean.valueOf(m95Var.f461817m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461815h;
        java.util.LinkedList linkedList2 = this.f461814g;
        java.util.LinkedList linkedList3 = this.f461813f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461811d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461812e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 2, linkedList2);
            fVar.g(5, 2, linkedList);
            java.lang.String str3 = this.f461816i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.a(7, this.f461817m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f461811d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f461812e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 2, linkedList2) + b36.f.g(5, 2, linkedList);
            java.lang.String str6 = this.f461816i;
            if (str6 != null) {
                g17 += b36.f.j(6, str6);
            }
            return g17 + b36.f.a(7, this.f461817m);
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
        r45.m95 m95Var = (r45.m95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m95Var.f461811d = aVar2.k(intValue);
                return 0;
            case 2:
                m95Var.f461812e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.am6 am6Var = new r45.am6();
                    if (bArr2 != null && bArr2.length > 0) {
                        am6Var.mo11468x92b714fd(bArr2);
                    }
                    m95Var.f461813f.add(am6Var);
                }
                return 0;
            case 4:
                m95Var.f461814g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 5:
                m95Var.f461815h.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 6:
                m95Var.f461816i = aVar2.k(intValue);
                return 0;
            case 7:
                m95Var.f461817m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
