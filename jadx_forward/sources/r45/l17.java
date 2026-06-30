package r45;

/* loaded from: classes4.dex */
public class l17 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460611d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f460612e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f460613f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460614g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460615h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l17)) {
            return false;
        }
        r45.l17 l17Var = (r45.l17) fVar;
        return n51.f.a(this.f460611d, l17Var.f460611d) && n51.f.a(this.f460612e, l17Var.f460612e) && n51.f.a(java.lang.Boolean.valueOf(this.f460613f), java.lang.Boolean.valueOf(l17Var.f460613f)) && n51.f.a(this.f460614g, l17Var.f460614g) && n51.f.a(this.f460615h, l17Var.f460615h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f460612e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460611d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList);
            fVar.a(3, this.f460613f);
            java.lang.String str2 = this.f460614g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f460615h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f460611d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 1, linkedList) + b36.f.a(3, this.f460613f);
            java.lang.String str5 = this.f460614g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f460615h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
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
        r45.l17 l17Var = (r45.l17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l17Var.f460611d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            l17Var.f460612e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            l17Var.f460613f = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            l17Var.f460614g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        l17Var.f460615h = aVar2.k(intValue);
        return 0;
    }
}
