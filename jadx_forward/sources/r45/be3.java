package r45;

/* loaded from: classes4.dex */
public class be3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452220d;

    /* renamed from: e, reason: collision with root package name */
    public int f452221e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f452222f;

    /* renamed from: g, reason: collision with root package name */
    public int f452223g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452224h;

    /* renamed from: i, reason: collision with root package name */
    public int f452225i;

    /* renamed from: m, reason: collision with root package name */
    public long f452226m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f452227n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452228o;

    static {
        new r45.be3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.be3)) {
            return false;
        }
        r45.be3 be3Var = (r45.be3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452220d), java.lang.Integer.valueOf(be3Var.f452220d)) && n51.f.a(java.lang.Integer.valueOf(this.f452221e), java.lang.Integer.valueOf(be3Var.f452221e)) && n51.f.a(this.f452222f, be3Var.f452222f) && n51.f.a(java.lang.Integer.valueOf(this.f452223g), java.lang.Integer.valueOf(be3Var.f452223g)) && n51.f.a(this.f452224h, be3Var.f452224h) && n51.f.a(java.lang.Integer.valueOf(this.f452225i), java.lang.Integer.valueOf(be3Var.f452225i)) && n51.f.a(java.lang.Long.valueOf(this.f452226m), java.lang.Long.valueOf(be3Var.f452226m)) && n51.f.a(java.lang.Boolean.valueOf(this.f452227n), java.lang.Boolean.valueOf(be3Var.f452227n)) && n51.f.a(this.f452228o, be3Var.f452228o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.be3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452220d);
            fVar.e(2, this.f452221e);
            r45.cu5 cu5Var = this.f452222f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f452222f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f452223g);
            java.lang.String str = this.f452224h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f452225i);
            fVar.h(7, this.f452226m);
            fVar.a(8, this.f452227n);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f452228o;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452220d) + 0 + b36.f.e(2, this.f452221e);
            r45.cu5 cu5Var2 = this.f452222f;
            if (cu5Var2 != null) {
                e17 += b36.f.i(3, cu5Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(4, this.f452223g);
            java.lang.String str2 = this.f452224h;
            if (str2 != null) {
                e18 += b36.f.j(5, str2);
            }
            int e19 = e18 + b36.f.e(6, this.f452225i) + b36.f.h(7, this.f452226m) + b36.f.a(8, this.f452227n);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f452228o;
            return gVar2 != null ? e19 + b36.f.b(9, gVar2) : e19;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f452220d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f452221e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    this.f452222f = cu5Var3;
                }
                return 0;
            case 4:
                this.f452223g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f452224h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f452225i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f452226m = aVar2.i(intValue);
                return 0;
            case 8:
                this.f452227n = aVar2.c(intValue);
                return 0;
            case 9:
                this.f452228o = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.be3) super.mo11468x92b714fd(bArr);
    }
}
