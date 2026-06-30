package r45;

/* loaded from: classes7.dex */
public class y24 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472258d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472259e;

    /* renamed from: f, reason: collision with root package name */
    public int f472260f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f472261g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f472262h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y24)) {
            return false;
        }
        r45.y24 y24Var = (r45.y24) fVar;
        return n51.f.a(this.f472258d, y24Var.f472258d) && n51.f.a(this.f472259e, y24Var.f472259e) && n51.f.a(java.lang.Integer.valueOf(this.f472260f), java.lang.Integer.valueOf(y24Var.f472260f)) && n51.f.a(this.f472261g, y24Var.f472261g) && n51.f.a(java.lang.Integer.valueOf(this.f472262h), java.lang.Integer.valueOf(y24Var.f472262h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472261g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472258d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472259e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f472260f);
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f472262h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f472258d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f472259e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f472260f) + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f472262h);
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
        r45.y24 y24Var = (r45.y24) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y24Var.f472258d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            y24Var.f472259e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            y24Var.f472260f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            y24Var.f472262h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.cw3 cw3Var = new r45.cw3();
            if (bArr2 != null && bArr2.length > 0) {
                cw3Var.mo11468x92b714fd(bArr2);
            }
            y24Var.f472261g.add(cw3Var);
        }
        return 0;
    }
}
