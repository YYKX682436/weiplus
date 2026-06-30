package r45;

/* loaded from: classes2.dex */
public class o4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463428d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f463429e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463430f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o4)) {
            return false;
        }
        r45.o4 o4Var = (r45.o4) fVar;
        return n51.f.a(this.f463428d, o4Var.f463428d) && n51.f.a(this.f463429e, o4Var.f463429e) && n51.f.a(this.f463430f, o4Var.f463430f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463428d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f463429e);
            java.lang.String str2 = this.f463430f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f463428d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.g(2, 8, this.f463429e);
            java.lang.String str4 = this.f463430f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f463429e.clear();
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
        r45.o4 o4Var = (r45.o4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o4Var.f463428d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            o4Var.f463430f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.xz4 xz4Var = new r45.xz4();
            if (bArr2 != null && bArr2.length > 0) {
                xz4Var.mo11468x92b714fd(bArr2);
            }
            o4Var.f463429e.add(xz4Var);
        }
        return 0;
    }
}
