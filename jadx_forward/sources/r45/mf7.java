package r45;

/* loaded from: classes4.dex */
public class mf7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cf7 f461994d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461995e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f461996f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f461997g;

    /* renamed from: h, reason: collision with root package name */
    public int f461998h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mf7)) {
            return false;
        }
        r45.mf7 mf7Var = (r45.mf7) fVar;
        return n51.f.a(this.f461994d, mf7Var.f461994d) && n51.f.a(this.f461995e, mf7Var.f461995e) && n51.f.a(this.f461996f, mf7Var.f461996f) && n51.f.a(java.lang.Integer.valueOf(this.f461997g), java.lang.Integer.valueOf(mf7Var.f461997g)) && n51.f.a(java.lang.Integer.valueOf(this.f461998h), java.lang.Integer.valueOf(mf7Var.f461998h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461996f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cf7 cf7Var = this.f461994d;
            if (cf7Var != null) {
                fVar.i(1, cf7Var.mo75928xcd1e8d8());
                this.f461994d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f461995e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 2, linkedList);
            fVar.e(4, this.f461997g);
            fVar.e(5, this.f461998h);
            return 0;
        }
        if (i17 == 1) {
            r45.cf7 cf7Var2 = this.f461994d;
            int i18 = cf7Var2 != null ? 0 + b36.f.i(1, cf7Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f461995e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 2, linkedList) + b36.f.e(4, this.f461997g) + b36.f.e(5, this.f461998h);
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
        r45.mf7 mf7Var = (r45.mf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.cf7 cf7Var3 = new r45.cf7();
                if (bArr2 != null && bArr2.length > 0) {
                    cf7Var3.mo11468x92b714fd(bArr2);
                }
                mf7Var.f461994d = cf7Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            mf7Var.f461995e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            mf7Var.f461996f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 4) {
            mf7Var.f461997g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        mf7Var.f461998h = aVar2.g(intValue);
        return 0;
    }
}
