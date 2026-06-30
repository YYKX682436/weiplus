package m53;

/* loaded from: classes8.dex */
public class e1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f405175d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405176e;

    /* renamed from: f, reason: collision with root package name */
    public int f405177f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405178g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f405179h;

    /* renamed from: i, reason: collision with root package name */
    public m53.f1 f405180i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.e1)) {
            return false;
        }
        m53.e1 e1Var = (m53.e1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f405175d), java.lang.Integer.valueOf(e1Var.f405175d)) && n51.f.a(this.f405176e, e1Var.f405176e) && n51.f.a(java.lang.Integer.valueOf(this.f405177f), java.lang.Integer.valueOf(e1Var.f405177f)) && n51.f.a(this.f405178g, e1Var.f405178g) && n51.f.a(java.lang.Boolean.valueOf(this.f405179h), java.lang.Boolean.valueOf(e1Var.f405179h)) && n51.f.a(this.f405180i, e1Var.f405180i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f405175d);
            java.lang.String str = this.f405176e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f405177f);
            java.lang.String str2 = this.f405178g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f405179h);
            m53.f1 f1Var = this.f405180i;
            if (f1Var != null) {
                fVar.i(6, f1Var.mo75928xcd1e8d8());
                this.f405180i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f405175d) + 0;
            java.lang.String str3 = this.f405176e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int e18 = e17 + b36.f.e(3, this.f405177f);
            java.lang.String str4 = this.f405178g;
            if (str4 != null) {
                e18 += b36.f.j(4, str4);
            }
            int a17 = e18 + b36.f.a(5, this.f405179h);
            m53.f1 f1Var2 = this.f405180i;
            return f1Var2 != null ? a17 + b36.f.i(6, f1Var2.mo75928xcd1e8d8()) : a17;
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
        m53.e1 e1Var = (m53.e1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e1Var.f405175d = aVar2.g(intValue);
                return 0;
            case 2:
                e1Var.f405176e = aVar2.k(intValue);
                return 0;
            case 3:
                e1Var.f405177f = aVar2.g(intValue);
                return 0;
            case 4:
                e1Var.f405178g = aVar2.k(intValue);
                return 0;
            case 5:
                e1Var.f405179h = aVar2.c(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    m53.f1 f1Var3 = new m53.f1();
                    if (bArr != null && bArr.length > 0) {
                        f1Var3.mo11468x92b714fd(bArr);
                    }
                    e1Var.f405180i = f1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
