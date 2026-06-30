package r45;

/* loaded from: classes4.dex */
public class ym0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472743d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472744e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f472745f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f472746g;

    /* renamed from: h, reason: collision with root package name */
    public int f472747h;

    /* renamed from: i, reason: collision with root package name */
    public r45.u44 f472748i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f472749m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f472750n;

    static {
        new r45.ym0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ym0)) {
            return false;
        }
        r45.ym0 ym0Var = (r45.ym0) fVar;
        return n51.f.a(this.f472743d, ym0Var.f472743d) && n51.f.a(this.f472744e, ym0Var.f472744e) && n51.f.a(this.f472745f, ym0Var.f472745f) && n51.f.a(java.lang.Boolean.valueOf(this.f472746g), java.lang.Boolean.valueOf(ym0Var.f472746g)) && n51.f.a(java.lang.Integer.valueOf(this.f472747h), java.lang.Integer.valueOf(ym0Var.f472747h)) && n51.f.a(this.f472748i, ym0Var.f472748i) && n51.f.a(java.lang.Boolean.valueOf(this.f472749m), java.lang.Boolean.valueOf(ym0Var.f472749m)) && n51.f.a(java.lang.Boolean.valueOf(this.f472750n), java.lang.Boolean.valueOf(ym0Var.f472750n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.ym0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472745f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472743d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472744e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList);
            fVar.a(4, this.f472746g);
            fVar.e(5, this.f472747h);
            r45.u44 u44Var = this.f472748i;
            if (u44Var != null) {
                fVar.i(6, u44Var.mo75928xcd1e8d8());
                this.f472748i.mo75956x3d5d1f78(fVar);
            }
            fVar.a(7, this.f472749m);
            fVar.a(8, this.f472750n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f472743d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f472744e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int g17 = j17 + b36.f.g(3, 1, linkedList) + b36.f.a(4, this.f472746g) + b36.f.e(5, this.f472747h);
            r45.u44 u44Var2 = this.f472748i;
            if (u44Var2 != null) {
                g17 += b36.f.i(6, u44Var2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.a(7, this.f472749m) + b36.f.a(8, this.f472750n);
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f472743d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f472744e = aVar2.k(intValue);
                return 0;
            case 3:
                linkedList.add(aVar2.k(intValue));
                return 0;
            case 4:
                this.f472746g = aVar2.c(intValue);
                return 0;
            case 5:
                this.f472747h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.u44 u44Var3 = new r45.u44();
                    if (bArr != null && bArr.length > 0) {
                        u44Var3.mo11468x92b714fd(bArr);
                    }
                    this.f472748i = u44Var3;
                }
                return 0;
            case 7:
                this.f472749m = aVar2.c(intValue);
                return 0;
            case 8:
                this.f472750n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.ym0) super.mo11468x92b714fd(bArr);
    }
}
