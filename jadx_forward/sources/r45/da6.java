package r45;

/* loaded from: classes4.dex */
public class da6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453807d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f453808e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f453809f;

    /* renamed from: g, reason: collision with root package name */
    public int f453810g;

    /* renamed from: h, reason: collision with root package name */
    public int f453811h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.da6)) {
            return false;
        }
        r45.da6 da6Var = (r45.da6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453807d), java.lang.Integer.valueOf(da6Var.f453807d)) && n51.f.a(this.f453808e, da6Var.f453808e) && n51.f.a(java.lang.Integer.valueOf(this.f453809f), java.lang.Integer.valueOf(da6Var.f453809f)) && n51.f.a(java.lang.Integer.valueOf(this.f453810g), java.lang.Integer.valueOf(da6Var.f453810g)) && n51.f.a(java.lang.Integer.valueOf(this.f453811h), java.lang.Integer.valueOf(da6Var.f453811h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453808e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453807d);
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f453809f);
            fVar.e(4, this.f453810g);
            fVar.e(5, this.f453811h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f453807d) + 0 + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f453809f) + b36.f.e(4, this.f453810g) + b36.f.e(5, this.f453811h);
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
        r45.da6 da6Var = (r45.da6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            da6Var.f453807d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                da6Var.f453809f = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                da6Var.f453810g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            da6Var.f453811h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.b96 b96Var = new r45.b96();
            if (bArr2 != null && bArr2.length > 0) {
                b96Var.mo11468x92b714fd(bArr2);
            }
            da6Var.f453808e.add(b96Var);
        }
        return 0;
    }
}
