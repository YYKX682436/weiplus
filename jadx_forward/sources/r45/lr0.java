package r45;

/* loaded from: classes9.dex */
public class lr0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461311d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461312e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461313f;

    /* renamed from: field_area_info */
    public r45.fs0 f76493x9499c81b;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lr0)) {
            return false;
        }
        r45.lr0 lr0Var = (r45.lr0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461311d), java.lang.Integer.valueOf(lr0Var.f461311d)) && n51.f.a(this.f76493x9499c81b, lr0Var.f76493x9499c81b) && n51.f.a(this.f461312e, lr0Var.f461312e) && n51.f.a(this.f461313f, lr0Var.f461313f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461311d);
            r45.fs0 fs0Var = this.f76493x9499c81b;
            if (fs0Var != null) {
                fVar.i(2, fs0Var.mo75928xcd1e8d8());
                this.f76493x9499c81b.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f461312e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f461313f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461311d) + 0;
            r45.fs0 fs0Var2 = this.f76493x9499c81b;
            if (fs0Var2 != null) {
                e17 += b36.f.i(2, fs0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f461312e;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f461313f;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        r45.lr0 lr0Var = (r45.lr0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lr0Var.f461311d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                lr0Var.f461312e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            lr0Var.f461313f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.fs0 fs0Var3 = new r45.fs0();
            if (bArr != null && bArr.length > 0) {
                fs0Var3.mo11468x92b714fd(bArr);
            }
            lr0Var.f76493x9499c81b = fs0Var3;
        }
        return 0;
    }
}
