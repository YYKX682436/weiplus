package r45;

/* loaded from: classes7.dex */
public class iz6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f458950d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f458951e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f458952f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f458953g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f458954h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f458955i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f458956m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f458957n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f458958o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iz6)) {
            return false;
        }
        r45.iz6 iz6Var = (r45.iz6) fVar;
        return n51.f.a(this.f458950d, iz6Var.f458950d) && n51.f.a(this.f458951e, iz6Var.f458951e) && n51.f.a(this.f458952f, iz6Var.f458952f) && n51.f.a(this.f458953g, iz6Var.f458953g) && n51.f.a(this.f458954h, iz6Var.f458954h) && n51.f.a(this.f458955i, iz6Var.f458955i) && n51.f.a(this.f458956m, iz6Var.f458956m) && n51.f.a(this.f458957n, iz6Var.f458957n) && n51.f.a(this.f458958o, iz6Var.f458958o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, this.f458950d);
            fVar.g(2, 2, this.f458951e);
            fVar.g(3, 5, this.f458952f);
            fVar.g(4, 2, this.f458953g);
            fVar.g(5, 5, this.f458954h);
            fVar.g(6, 5, this.f458955i);
            fVar.g(7, 8, this.f458956m);
            fVar.g(8, 5, this.f458957n);
            java.lang.String str = this.f458958o;
            if (str != null) {
                fVar.j(9, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 2, this.f458950d) + 0 + b36.f.g(2, 2, this.f458951e) + b36.f.g(3, 5, this.f458952f) + b36.f.g(4, 2, this.f458953g) + b36.f.g(5, 5, this.f458954h) + b36.f.g(6, 5, this.f458955i) + b36.f.g(7, 8, this.f458956m) + b36.f.g(8, 5, this.f458957n);
            java.lang.String str2 = this.f458958o;
            return str2 != null ? g17 + b36.f.j(9, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f458950d.clear();
            this.f458951e.clear();
            this.f458952f.clear();
            this.f458953g.clear();
            this.f458954h.clear();
            this.f458955i.clear();
            this.f458956m.clear();
            this.f458957n.clear();
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
        r45.iz6 iz6Var = (r45.iz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                iz6Var.f458950d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 2:
                iz6Var.f458951e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 3:
                iz6Var.f458952f.add(java.lang.Float.valueOf(aVar2.f(intValue)));
                return 0;
            case 4:
                iz6Var.f458953g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 5:
                iz6Var.f458954h.add(java.lang.Float.valueOf(aVar2.f(intValue)));
                return 0;
            case 6:
                iz6Var.f458955i.add(java.lang.Float.valueOf(aVar2.f(intValue)));
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.pi0 pi0Var = new r45.pi0();
                    if (bArr2 != null && bArr2.length > 0) {
                        pi0Var.mo11468x92b714fd(bArr2);
                    }
                    iz6Var.f458956m.add(pi0Var);
                }
                return 0;
            case 8:
                iz6Var.f458957n.add(java.lang.Float.valueOf(aVar2.f(intValue)));
                return 0;
            case 9:
                iz6Var.f458958o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
