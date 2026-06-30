package r45;

/* loaded from: classes7.dex */
public class l83 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460759d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f460760e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f460761f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f460762g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l83)) {
            return false;
        }
        r45.l83 l83Var = (r45.l83) fVar;
        return n51.f.a(this.f460759d, l83Var.f460759d) && n51.f.a(this.f460760e, l83Var.f460760e) && n51.f.a(this.f460761f, l83Var.f460761f) && n51.f.a(java.lang.Integer.valueOf(this.f460762g), java.lang.Integer.valueOf(l83Var.f460762g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f460760e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460759d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList);
            fVar.g(3, 8, this.f460761f);
            fVar.e(4, this.f460762g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f460759d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 1, linkedList) + b36.f.g(3, 8, this.f460761f) + b36.f.e(4, this.f460762g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f460761f.clear();
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
        r45.l83 l83Var = (r45.l83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l83Var.f460759d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            l83Var.f460760e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            l83Var.f460762g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.m83 m83Var = new r45.m83();
            if (bArr2 != null && bArr2.length > 0) {
                m83Var.mo11468x92b714fd(bArr2);
            }
            l83Var.f460761f.add(m83Var);
        }
        return 0;
    }
}
