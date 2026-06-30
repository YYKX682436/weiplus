package r45;

/* loaded from: classes4.dex */
public class yc6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f472499d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f472500e;

    /* renamed from: f, reason: collision with root package name */
    public int f472501f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472502g;

    /* renamed from: h, reason: collision with root package name */
    public int f472503h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yc6)) {
            return false;
        }
        r45.yc6 yc6Var = (r45.yc6) fVar;
        return n51.f.a(this.f472499d, yc6Var.f472499d) && n51.f.a(java.lang.Integer.valueOf(this.f472500e), java.lang.Integer.valueOf(yc6Var.f472500e)) && n51.f.a(java.lang.Integer.valueOf(this.f472501f), java.lang.Integer.valueOf(yc6Var.f472501f)) && n51.f.a(this.f472502g, yc6Var.f472502g) && n51.f.a(java.lang.Integer.valueOf(this.f472503h), java.lang.Integer.valueOf(yc6Var.f472503h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472499d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f472500e);
            fVar.e(3, this.f472501f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472502g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f472503h);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f472500e) + b36.f.e(3, this.f472501f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f472502g;
            if (gVar2 != null) {
                g17 += b36.f.b(4, gVar2);
            }
            return g17 + b36.f.e(5, this.f472503h);
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
        r45.yc6 yc6Var = (r45.yc6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.wc6 wc6Var = new r45.wc6();
                if (bArr2 != null && bArr2.length > 0) {
                    wc6Var.mo11468x92b714fd(bArr2);
                }
                yc6Var.f472499d.add(wc6Var);
            }
            return 0;
        }
        if (intValue == 2) {
            yc6Var.f472500e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            yc6Var.f472501f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            yc6Var.f472502g = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        yc6Var.f472503h = aVar2.g(intValue);
        return 0;
    }
}
