package r45;

/* loaded from: classes2.dex */
public class vz2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470222d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470223e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470225g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470227i;

    /* renamed from: p, reason: collision with root package name */
    public int f470231p;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f470224f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f470226h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f470228m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f470229n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f470230o = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vz2)) {
            return false;
        }
        r45.vz2 vz2Var = (r45.vz2) fVar;
        return n51.f.a(this.f470222d, vz2Var.f470222d) && n51.f.a(this.f470223e, vz2Var.f470223e) && n51.f.a(this.f470224f, vz2Var.f470224f) && n51.f.a(this.f470225g, vz2Var.f470225g) && n51.f.a(this.f470226h, vz2Var.f470226h) && n51.f.a(this.f470227i, vz2Var.f470227i) && n51.f.a(this.f470228m, vz2Var.f470228m) && n51.f.a(this.f470229n, vz2Var.f470229n) && n51.f.a(this.f470230o, vz2Var.f470230o) && n51.f.a(java.lang.Integer.valueOf(this.f470231p), java.lang.Integer.valueOf(vz2Var.f470231p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470230o;
        java.util.LinkedList linkedList2 = this.f470229n;
        java.util.LinkedList linkedList3 = this.f470228m;
        java.util.LinkedList linkedList4 = this.f470226h;
        java.util.LinkedList linkedList5 = this.f470224f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470222d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470223e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList5);
            java.lang.String str3 = this.f470225g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.g(5, 1, linkedList4);
            java.lang.String str4 = this.f470227i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.g(7, 1, linkedList3);
            fVar.g(8, 1, linkedList2);
            fVar.g(9, 1, linkedList);
            fVar.e(10, this.f470231p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f470222d;
            int j17 = str5 != null ? b36.f.j(1, str5) + 0 : 0;
            java.lang.String str6 = this.f470223e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int g17 = j17 + b36.f.g(3, 1, linkedList5);
            java.lang.String str7 = this.f470225g;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            int g18 = g17 + b36.f.g(5, 1, linkedList4);
            java.lang.String str8 = this.f470227i;
            if (str8 != null) {
                g18 += b36.f.j(6, str8);
            }
            return g18 + b36.f.g(7, 1, linkedList3) + b36.f.g(8, 1, linkedList2) + b36.f.g(9, 1, linkedList) + b36.f.e(10, this.f470231p);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList5.clear();
            linkedList4.clear();
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
        r45.vz2 vz2Var = (r45.vz2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vz2Var.f470222d = aVar2.k(intValue);
                return 0;
            case 2:
                vz2Var.f470223e = aVar2.k(intValue);
                return 0;
            case 3:
                vz2Var.f470224f.add(aVar2.k(intValue));
                return 0;
            case 4:
                vz2Var.f470225g = aVar2.k(intValue);
                return 0;
            case 5:
                vz2Var.f470226h.add(aVar2.k(intValue));
                return 0;
            case 6:
                vz2Var.f470227i = aVar2.k(intValue);
                return 0;
            case 7:
                vz2Var.f470228m.add(aVar2.k(intValue));
                return 0;
            case 8:
                vz2Var.f470229n.add(aVar2.k(intValue));
                return 0;
            case 9:
                vz2Var.f470230o.add(aVar2.k(intValue));
                return 0;
            case 10:
                vz2Var.f470231p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
