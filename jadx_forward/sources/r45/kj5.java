package r45;

/* loaded from: classes8.dex */
public class kj5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460294d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f460295e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f460296f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460297g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460298h;

    /* renamed from: i, reason: collision with root package name */
    public int f460299i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kj5)) {
            return false;
        }
        r45.kj5 kj5Var = (r45.kj5) fVar;
        return n51.f.a(this.f460294d, kj5Var.f460294d) && n51.f.a(this.f460295e, kj5Var.f460295e) && n51.f.a(java.lang.Integer.valueOf(this.f460296f), java.lang.Integer.valueOf(kj5Var.f460296f)) && n51.f.a(this.f460297g, kj5Var.f460297g) && n51.f.a(this.f460298h, kj5Var.f460298h) && n51.f.a(java.lang.Integer.valueOf(this.f460299i), java.lang.Integer.valueOf(kj5Var.f460299i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460294d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 2, this.f460295e);
            fVar.e(3, this.f460296f);
            java.lang.String str2 = this.f460297g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f460298h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(100, this.f460299i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f460294d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 2, this.f460295e) + b36.f.e(3, this.f460296f);
            java.lang.String str5 = this.f460297g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f460298h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            return j17 + b36.f.e(100, this.f460299i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f460295e.clear();
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
        r45.kj5 kj5Var = (r45.kj5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kj5Var.f460294d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            kj5Var.f460295e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 3) {
            kj5Var.f460296f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            kj5Var.f460297g = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            kj5Var.f460298h = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        kj5Var.f460299i = aVar2.g(intValue);
        return 0;
    }
}
