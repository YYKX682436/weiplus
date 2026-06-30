package r45;

/* loaded from: classes2.dex */
public class lt4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461350d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f461351e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461352f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lt4)) {
            return false;
        }
        r45.lt4 lt4Var = (r45.lt4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461350d), java.lang.Integer.valueOf(lt4Var.f461350d)) && n51.f.a(this.f461351e, lt4Var.f461351e) && n51.f.a(this.f461352f, lt4Var.f461352f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461351e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461350d);
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f461352f;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461350d) + 0 + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f461352f;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        r45.lt4 lt4Var = (r45.lt4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lt4Var.f461350d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 4) {
                return -1;
            }
            lt4Var.f461352f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ms2 ms2Var = new r45.ms2();
            if (bArr2 != null && bArr2.length > 0) {
                ms2Var.mo11468x92b714fd(bArr2);
            }
            lt4Var.f461351e.add(ms2Var);
        }
        return 0;
    }
}
