package r45;

/* loaded from: classes2.dex */
public class fg4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455845d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f455846e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f455847f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455848g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455849h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fg4)) {
            return false;
        }
        r45.fg4 fg4Var = (r45.fg4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455845d), java.lang.Integer.valueOf(fg4Var.f455845d)) && n51.f.a(this.f455846e, fg4Var.f455846e) && n51.f.a(java.lang.Integer.valueOf(this.f455847f), java.lang.Integer.valueOf(fg4Var.f455847f)) && n51.f.a(this.f455848g, fg4Var.f455848g) && n51.f.a(this.f455849h, fg4Var.f455849h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455846e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455845d);
            fVar.g(2, 1, linkedList);
            fVar.e(3, this.f455847f);
            java.lang.String str = this.f455848g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f455849h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455845d) + 0 + b36.f.g(2, 1, linkedList) + b36.f.e(3, this.f455847f);
            java.lang.String str3 = this.f455848g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f455849h;
            return str4 != null ? e17 + b36.f.j(5, str4) : e17;
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
        r45.fg4 fg4Var = (r45.fg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fg4Var.f455845d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fg4Var.f455846e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            fg4Var.f455847f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            fg4Var.f455848g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        fg4Var.f455849h = aVar2.k(intValue);
        return 0;
    }
}
