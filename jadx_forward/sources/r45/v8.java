package r45;

/* loaded from: classes9.dex */
public class v8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469509d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f83 f469510e;

    /* renamed from: f, reason: collision with root package name */
    public long f469511f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f469512g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f469513h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v8)) {
            return false;
        }
        r45.v8 v8Var = (r45.v8) fVar;
        return n51.f.a(this.f469509d, v8Var.f469509d) && n51.f.a(this.f469510e, v8Var.f469510e) && n51.f.a(java.lang.Long.valueOf(this.f469511f), java.lang.Long.valueOf(v8Var.f469511f)) && n51.f.a(java.lang.Boolean.valueOf(this.f469512g), java.lang.Boolean.valueOf(v8Var.f469512g)) && n51.f.a(this.f469513h, v8Var.f469513h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469513h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469509d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.f83 f83Var = this.f469510e;
            if (f83Var != null) {
                fVar.i(2, f83Var.mo75928xcd1e8d8());
                this.f469510e.mo75956x3d5d1f78(fVar);
            }
            fVar.h(3, this.f469511f);
            fVar.a(4, this.f469512g);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f469509d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.f83 f83Var2 = this.f469510e;
            if (f83Var2 != null) {
                j17 += b36.f.i(2, f83Var2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.h(3, this.f469511f) + b36.f.a(4, this.f469512g) + b36.f.g(5, 8, linkedList);
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
        r45.v8 v8Var = (r45.v8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            v8Var.f469509d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.f83 f83Var3 = new r45.f83();
                if (bArr2 != null && bArr2.length > 0) {
                    f83Var3.mo11468x92b714fd(bArr2);
                }
                v8Var.f469510e = f83Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            v8Var.f469511f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            v8Var.f469512g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.co2 co2Var = new r45.co2();
            if (bArr3 != null && bArr3.length > 0) {
                co2Var.mo11468x92b714fd(bArr3);
            }
            v8Var.f469513h.add(co2Var);
        }
        return 0;
    }
}
