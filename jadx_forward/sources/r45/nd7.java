package r45;

/* loaded from: classes7.dex */
public class nd7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462828d;

    /* renamed from: e, reason: collision with root package name */
    public int f462829e;

    /* renamed from: f, reason: collision with root package name */
    public int f462830f;

    /* renamed from: g, reason: collision with root package name */
    public long f462831g;

    /* renamed from: h, reason: collision with root package name */
    public r45.pe7 f462832h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nd7)) {
            return false;
        }
        r45.nd7 nd7Var = (r45.nd7) fVar;
        return n51.f.a(this.f462828d, nd7Var.f462828d) && n51.f.a(java.lang.Integer.valueOf(this.f462829e), java.lang.Integer.valueOf(nd7Var.f462829e)) && n51.f.a(java.lang.Integer.valueOf(this.f462830f), java.lang.Integer.valueOf(nd7Var.f462830f)) && n51.f.a(java.lang.Long.valueOf(this.f462831g), java.lang.Long.valueOf(nd7Var.f462831g)) && n51.f.a(this.f462832h, nd7Var.f462832h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462828d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f462829e);
            fVar.e(3, this.f462830f);
            fVar.h(4, this.f462831g);
            r45.pe7 pe7Var = this.f462832h;
            if (pe7Var != null) {
                fVar.i(8, pe7Var.mo75928xcd1e8d8());
                this.f462832h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f462828d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f462829e) + b36.f.e(3, this.f462830f) + b36.f.h(4, this.f462831g);
            r45.pe7 pe7Var2 = this.f462832h;
            return pe7Var2 != null ? j17 + b36.f.i(8, pe7Var2.mo75928xcd1e8d8()) : j17;
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
        r45.nd7 nd7Var = (r45.nd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nd7Var.f462828d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            nd7Var.f462829e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            nd7Var.f462830f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            nd7Var.f462831g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 8) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.pe7 pe7Var3 = new r45.pe7();
            if (bArr != null && bArr.length > 0) {
                pe7Var3.mo11468x92b714fd(bArr);
            }
            nd7Var.f462832h = pe7Var3;
        }
        return 0;
    }
}
