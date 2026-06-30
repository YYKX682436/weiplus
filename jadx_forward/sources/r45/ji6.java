package r45;

/* loaded from: classes4.dex */
public class ji6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459375d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459376e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f459377f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ji6)) {
            return false;
        }
        r45.ji6 ji6Var = (r45.ji6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459375d), java.lang.Integer.valueOf(ji6Var.f459375d)) && n51.f.a(this.f459376e, ji6Var.f459376e) && n51.f.a(this.f459377f, ji6Var.f459377f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459375d);
            java.lang.String str = this.f459376e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f459377f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f459375d) + 0;
            java.lang.String str2 = this.f459376e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 8, this.f459377f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f459377f.clear();
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
        r45.ji6 ji6Var = (r45.ji6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ji6Var.f459375d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ji6Var.f459376e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.oi6 oi6Var = new r45.oi6();
            if (bArr2 != null && bArr2.length > 0) {
                oi6Var.mo11468x92b714fd(bArr2);
            }
            ji6Var.f459377f.add(oi6Var);
        }
        return 0;
    }
}
