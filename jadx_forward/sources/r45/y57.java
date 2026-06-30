package r45;

/* loaded from: classes4.dex */
public class y57 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f472345d;

    /* renamed from: e, reason: collision with root package name */
    public int f472346e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f472347f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f472348g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472349h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472350i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y57)) {
            return false;
        }
        r45.y57 y57Var = (r45.y57) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f472345d), java.lang.Long.valueOf(y57Var.f472345d)) && n51.f.a(java.lang.Integer.valueOf(this.f472346e), java.lang.Integer.valueOf(y57Var.f472346e)) && n51.f.a(this.f472347f, y57Var.f472347f) && n51.f.a(this.f472348g, y57Var.f472348g) && n51.f.a(this.f472349h, y57Var.f472349h) && n51.f.a(this.f472350i, y57Var.f472350i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472348g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f472345d);
            fVar.e(2, this.f472346e);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = this.f472347f;
            if (c19806x4c372b7 != null) {
                fVar.i(3, c19806x4c372b7.mo75928xcd1e8d8());
                this.f472347f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(4, 3, linkedList);
            java.lang.String str = this.f472349h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f472350i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f472345d) + 0 + b36.f.e(2, this.f472346e);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = this.f472347f;
            if (c19806x4c372b72 != null) {
                h17 += b36.f.i(3, c19806x4c372b72.mo75928xcd1e8d8());
            }
            int g17 = h17 + b36.f.g(4, 3, linkedList);
            java.lang.String str3 = this.f472349h;
            if (str3 != null) {
                g17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f472350i;
            return str4 != null ? g17 + b36.f.j(6, str4) : g17;
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
        r45.y57 y57Var = (r45.y57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y57Var.f472345d = aVar2.i(intValue);
                return 0;
            case 2:
                y57Var.f472346e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b73 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
                    if (bArr2 != null && bArr2.length > 0) {
                        c19806x4c372b73.mo11468x92b714fd(bArr2);
                    }
                    y57Var.f472347f = c19806x4c372b73;
                }
                return 0;
            case 4:
                y57Var.f472348g.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                return 0;
            case 5:
                y57Var.f472349h = aVar2.k(intValue);
                return 0;
            case 6:
                y57Var.f472350i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
