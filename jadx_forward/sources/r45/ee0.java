package r45;

/* loaded from: classes9.dex */
public class ee0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454886d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454887e;

    /* renamed from: f, reason: collision with root package name */
    public int f454888f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f454889g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ee0)) {
            return false;
        }
        r45.ee0 ee0Var = (r45.ee0) fVar;
        return n51.f.a(this.f454886d, ee0Var.f454886d) && n51.f.a(this.f454887e, ee0Var.f454887e) && n51.f.a(java.lang.Integer.valueOf(this.f454888f), java.lang.Integer.valueOf(ee0Var.f454888f)) && n51.f.a(this.f454889g, ee0Var.f454889g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454886d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454887e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f454888f);
            fVar.g(4, 8, this.f454889g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f454886d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f454887e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f454888f) + b36.f.g(4, 8, this.f454889g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f454889g.clear();
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
        r45.ee0 ee0Var = (r45.ee0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ee0Var.f454886d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ee0Var.f454887e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ee0Var.f454888f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.w50 w50Var = new r45.w50();
            if (bArr2 != null && bArr2.length > 0) {
                w50Var.mo11468x92b714fd(bArr2);
            }
            ee0Var.f454889g.add(w50Var);
        }
        return 0;
    }
}
