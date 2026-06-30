package r45;

/* loaded from: classes4.dex */
public class d47 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453647d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453648e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f453649f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f453650g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d47)) {
            return false;
        }
        r45.d47 d47Var = (r45.d47) fVar;
        return n51.f.a(this.f453647d, d47Var.f453647d) && n51.f.a(this.f453648e, d47Var.f453648e) && n51.f.a(this.f453649f, d47Var.f453649f) && n51.f.a(java.lang.Integer.valueOf(this.f453650g), java.lang.Integer.valueOf(d47Var.f453650g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453649f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453647d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f453648e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList);
            fVar.e(4, this.f453650g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f453647d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f453648e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 1, linkedList) + b36.f.e(4, this.f453650g);
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
        r45.d47 d47Var = (r45.d47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d47Var.f453647d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            d47Var.f453648e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            d47Var.f453649f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        d47Var.f453650g = aVar2.g(intValue);
        return 0;
    }
}
