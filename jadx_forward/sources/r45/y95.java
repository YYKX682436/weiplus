package r45;

/* loaded from: classes2.dex */
public class y95 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472419d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472420e;

    /* renamed from: f, reason: collision with root package name */
    public int f472421f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f472422g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472423h;

    /* renamed from: i, reason: collision with root package name */
    public int f472424i;

    /* renamed from: m, reason: collision with root package name */
    public int f472425m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y95)) {
            return false;
        }
        r45.y95 y95Var = (r45.y95) fVar;
        return n51.f.a(this.f472419d, y95Var.f472419d) && n51.f.a(this.f472420e, y95Var.f472420e) && n51.f.a(java.lang.Integer.valueOf(this.f472421f), java.lang.Integer.valueOf(y95Var.f472421f)) && n51.f.a(this.f472422g, y95Var.f472422g) && n51.f.a(this.f472423h, y95Var.f472423h) && n51.f.a(java.lang.Integer.valueOf(this.f472424i), java.lang.Integer.valueOf(y95Var.f472424i)) && n51.f.a(java.lang.Integer.valueOf(this.f472425m), java.lang.Integer.valueOf(y95Var.f472425m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472422g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472419d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472420e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f472421f);
            fVar.g(4, 8, linkedList);
            java.lang.String str3 = this.f472423h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f472424i);
            fVar.e(7, this.f472425m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f472419d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f472420e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f472421f) + b36.f.g(4, 8, linkedList);
            java.lang.String str6 = this.f472423h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f472424i) + b36.f.e(7, this.f472425m);
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
        r45.y95 y95Var = (r45.y95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y95Var.f472419d = aVar2.k(intValue);
                return 0;
            case 2:
                y95Var.f472420e = aVar2.k(intValue);
                return 0;
            case 3:
                y95Var.f472421f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.q95 q95Var = new r45.q95();
                    if (bArr2 != null && bArr2.length > 0) {
                        q95Var.mo11468x92b714fd(bArr2);
                    }
                    y95Var.f472422g.add(q95Var);
                }
                return 0;
            case 5:
                y95Var.f472423h = aVar2.k(intValue);
                return 0;
            case 6:
                y95Var.f472424i = aVar2.g(intValue);
                return 0;
            case 7:
                y95Var.f472425m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
