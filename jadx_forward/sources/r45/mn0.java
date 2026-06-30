package r45;

/* loaded from: classes9.dex */
public class mn0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462221d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462222e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f462223f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mn0)) {
            return false;
        }
        r45.mn0 mn0Var = (r45.mn0) fVar;
        return n51.f.a(this.f462221d, mn0Var.f462221d) && n51.f.a(this.f462222e, mn0Var.f462222e) && n51.f.a(this.f462223f, mn0Var.f462223f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462221d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462222e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, this.f462223f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f462221d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f462222e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 8, this.f462223f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f462223f.clear();
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
        r45.mn0 mn0Var = (r45.mn0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mn0Var.f462221d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            mn0Var.f462222e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.ln0 ln0Var = new r45.ln0();
            if (bArr2 != null && bArr2.length > 0) {
                ln0Var.mo11468x92b714fd(bArr2);
            }
            mn0Var.f462223f.add(ln0Var);
        }
        return 0;
    }
}
