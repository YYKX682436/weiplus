package r45;

/* loaded from: classes8.dex */
public class cq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453313d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453314e;

    /* renamed from: f, reason: collision with root package name */
    public int f453315f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453316g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cq0)) {
            return false;
        }
        r45.cq0 cq0Var = (r45.cq0) fVar;
        return n51.f.a(this.f453313d, cq0Var.f453313d) && n51.f.a(this.f453314e, cq0Var.f453314e) && n51.f.a(java.lang.Integer.valueOf(this.f453315f), java.lang.Integer.valueOf(cq0Var.f453315f)) && n51.f.a(this.f453316g, cq0Var.f453316g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453313d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f453314e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f453315f);
            java.lang.String str3 = this.f453316g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f453313d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f453314e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f453315f);
            java.lang.String str6 = this.f453316g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        r45.cq0 cq0Var = (r45.cq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cq0Var.f453313d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            cq0Var.f453314e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            cq0Var.f453315f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        cq0Var.f453316g = aVar2.k(intValue);
        return 0;
    }
}
