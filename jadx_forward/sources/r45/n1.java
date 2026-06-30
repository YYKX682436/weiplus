package r45;

/* loaded from: classes2.dex */
public class n1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462516d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462517e;

    /* renamed from: f, reason: collision with root package name */
    public int f462518f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462519g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462520h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n1)) {
            return false;
        }
        r45.n1 n1Var = (r45.n1) fVar;
        return n51.f.a(this.f462516d, n1Var.f462516d) && n51.f.a(this.f462517e, n1Var.f462517e) && n51.f.a(java.lang.Integer.valueOf(this.f462518f), java.lang.Integer.valueOf(n1Var.f462518f)) && n51.f.a(this.f462519g, n1Var.f462519g) && n51.f.a(this.f462520h, n1Var.f462520h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462516d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462517e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f462518f);
            java.lang.String str3 = this.f462519g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f462520h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f462516d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f462517e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f462518f);
            java.lang.String str7 = this.f462519g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f462520h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.n1 n1Var = (r45.n1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            n1Var.f462516d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            n1Var.f462517e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            n1Var.f462518f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            n1Var.f462519g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        n1Var.f462520h = aVar2.k(intValue);
        return 0;
    }
}
