package r45;

/* loaded from: classes4.dex */
public class o00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463324d;

    /* renamed from: e, reason: collision with root package name */
    public int f463325e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463326f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463327g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f463328h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o00)) {
            return false;
        }
        r45.o00 o00Var = (r45.o00) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463324d), java.lang.Integer.valueOf(o00Var.f463324d)) && n51.f.a(java.lang.Integer.valueOf(this.f463325e), java.lang.Integer.valueOf(o00Var.f463325e)) && n51.f.a(this.f463326f, o00Var.f463326f) && n51.f.a(this.f463327g, o00Var.f463327g) && n51.f.a(this.f463328h, o00Var.f463328h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463328h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463324d);
            fVar.e(2, this.f463325e);
            java.lang.String str = this.f463326f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f463327g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f463324d) + 0 + b36.f.e(2, this.f463325e);
            java.lang.String str3 = this.f463326f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f463327g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.g(5, 8, linkedList);
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
        r45.o00 o00Var = (r45.o00) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o00Var.f463324d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            o00Var.f463325e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            o00Var.f463326f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            o00Var.f463327g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.p00 p00Var = new r45.p00();
            if (bArr2 != null && bArr2.length > 0) {
                p00Var.mo11468x92b714fd(bArr2);
            }
            o00Var.f463328h.add(p00Var);
        }
        return 0;
    }
}
