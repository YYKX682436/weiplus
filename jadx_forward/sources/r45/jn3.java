package r45;

/* loaded from: classes4.dex */
public class jn3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459499d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459500e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f459501f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f459502g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jn3)) {
            return false;
        }
        r45.jn3 jn3Var = (r45.jn3) fVar;
        return n51.f.a(this.f459499d, jn3Var.f459499d) && n51.f.a(this.f459500e, jn3Var.f459500e) && n51.f.a(this.f459501f, jn3Var.f459501f) && n51.f.a(this.f459502g, jn3Var.f459502g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459499d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f459500e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, this.f459501f);
            fVar.g(4, 8, this.f459502g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f459499d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f459500e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 8, this.f459501f) + b36.f.g(4, 8, this.f459502g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f459501f.clear();
            this.f459502g.clear();
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
        r45.jn3 jn3Var = (r45.jn3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jn3Var.f459499d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            jn3Var.f459500e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.vc4 vc4Var = new r45.vc4();
                if (bArr2 != null && bArr2.length > 0) {
                    vc4Var.mo11468x92b714fd(bArr2);
                }
                jn3Var.f459501f.add(vc4Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.a55 a55Var = new r45.a55();
            if (bArr3 != null && bArr3.length > 0) {
                a55Var.mo11468x92b714fd(bArr3);
            }
            jn3Var.f459502g.add(a55Var);
        }
        return 0;
    }
}
