package r45;

/* loaded from: classes4.dex */
public class z44 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473224d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473225e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f473226f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f473227g;

    /* renamed from: h, reason: collision with root package name */
    public int f473228h;

    /* renamed from: i, reason: collision with root package name */
    public r45.u44 f473229i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f473230m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z44)) {
            return false;
        }
        r45.z44 z44Var = (r45.z44) fVar;
        return n51.f.a(this.f473224d, z44Var.f473224d) && n51.f.a(this.f473225e, z44Var.f473225e) && n51.f.a(this.f473226f, z44Var.f473226f) && n51.f.a(java.lang.Boolean.valueOf(this.f473227g), java.lang.Boolean.valueOf(z44Var.f473227g)) && n51.f.a(java.lang.Integer.valueOf(this.f473228h), java.lang.Integer.valueOf(z44Var.f473228h)) && n51.f.a(this.f473229i, z44Var.f473229i) && n51.f.a(java.lang.Boolean.valueOf(this.f473230m), java.lang.Boolean.valueOf(z44Var.f473230m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473226f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473224d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473225e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList);
            fVar.a(4, this.f473227g);
            fVar.e(5, this.f473228h);
            r45.u44 u44Var = this.f473229i;
            if (u44Var != null) {
                fVar.i(6, u44Var.mo75928xcd1e8d8());
                this.f473229i.mo75956x3d5d1f78(fVar);
            }
            fVar.a(7, this.f473230m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f473224d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f473225e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int g17 = j17 + b36.f.g(3, 1, linkedList) + b36.f.a(4, this.f473227g) + b36.f.e(5, this.f473228h);
            r45.u44 u44Var2 = this.f473229i;
            if (u44Var2 != null) {
                g17 += b36.f.i(6, u44Var2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.a(7, this.f473230m);
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
        r45.z44 z44Var = (r45.z44) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z44Var.f473224d = aVar2.k(intValue);
                return 0;
            case 2:
                z44Var.f473225e = aVar2.k(intValue);
                return 0;
            case 3:
                z44Var.f473226f.add(aVar2.k(intValue));
                return 0;
            case 4:
                z44Var.f473227g = aVar2.c(intValue);
                return 0;
            case 5:
                z44Var.f473228h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.u44 u44Var3 = new r45.u44();
                    if (bArr2 != null && bArr2.length > 0) {
                        u44Var3.mo11468x92b714fd(bArr2);
                    }
                    z44Var.f473229i = u44Var3;
                }
                return 0;
            case 7:
                z44Var.f473230m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
