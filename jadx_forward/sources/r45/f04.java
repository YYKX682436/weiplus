package r45;

/* loaded from: classes8.dex */
public class f04 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455440d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ma5 f455441e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ma5 f455442f;

    /* renamed from: g, reason: collision with root package name */
    public int f455443g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f04)) {
            return false;
        }
        r45.f04 f04Var = (r45.f04) fVar;
        return n51.f.a(this.f455440d, f04Var.f455440d) && n51.f.a(this.f455441e, f04Var.f455441e) && n51.f.a(this.f455442f, f04Var.f455442f) && n51.f.a(java.lang.Integer.valueOf(this.f455443g), java.lang.Integer.valueOf(f04Var.f455443g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455440d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.ma5 ma5Var = this.f455441e;
            if (ma5Var != null) {
                fVar.i(2, ma5Var.mo75928xcd1e8d8());
                this.f455441e.mo75956x3d5d1f78(fVar);
            }
            r45.ma5 ma5Var2 = this.f455442f;
            if (ma5Var2 != null) {
                fVar.i(3, ma5Var2.mo75928xcd1e8d8());
                this.f455442f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f455443g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f455440d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.ma5 ma5Var3 = this.f455441e;
            if (ma5Var3 != null) {
                j17 += b36.f.i(2, ma5Var3.mo75928xcd1e8d8());
            }
            r45.ma5 ma5Var4 = this.f455442f;
            if (ma5Var4 != null) {
                j17 += b36.f.i(3, ma5Var4.mo75928xcd1e8d8());
            }
            return j17 + b36.f.e(4, this.f455443g);
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
        r45.f04 f04Var = (r45.f04) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f04Var.f455440d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.ma5 ma5Var5 = new r45.ma5();
                if (bArr != null && bArr.length > 0) {
                    ma5Var5.mo11468x92b714fd(bArr);
                }
                f04Var.f455441e = ma5Var5;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            f04Var.f455443g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.ma5 ma5Var6 = new r45.ma5();
            if (bArr2 != null && bArr2.length > 0) {
                ma5Var6.mo11468x92b714fd(bArr2);
            }
            f04Var.f455442f = ma5Var6;
        }
        return 0;
    }
}
