package r45;

/* loaded from: classes4.dex */
public class nw3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463239d;

    /* renamed from: e, reason: collision with root package name */
    public int f463240e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463241f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f463242g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nw3)) {
            return false;
        }
        r45.nw3 nw3Var = (r45.nw3) fVar;
        return n51.f.a(this.f463239d, nw3Var.f463239d) && n51.f.a(java.lang.Integer.valueOf(this.f463240e), java.lang.Integer.valueOf(nw3Var.f463240e)) && n51.f.a(this.f463241f, nw3Var.f463241f) && n51.f.a(this.f463242g, nw3Var.f463242g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463242g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463239d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f463240e);
            java.lang.String str2 = this.f463241f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f463239d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f463240e);
            java.lang.String str4 = this.f463241f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.g(4, 8, linkedList);
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
        r45.nw3 nw3Var = (r45.nw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nw3Var.f463239d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            nw3Var.f463240e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            nw3Var.f463241f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.rk5 rk5Var = new r45.rk5();
            if (bArr2 != null && bArr2.length > 0) {
                rk5Var.mo11468x92b714fd(bArr2);
            }
            nw3Var.f463242g.add(rk5Var);
        }
        return 0;
    }
}
