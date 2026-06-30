package r45;

/* loaded from: classes4.dex */
public class qx1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465865d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f465866e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public long f465867f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qx1)) {
            return false;
        }
        r45.qx1 qx1Var = (r45.qx1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465865d), java.lang.Integer.valueOf(qx1Var.f465865d)) && n51.f.a(this.f465866e, qx1Var.f465866e) && n51.f.a(java.lang.Long.valueOf(this.f465867f), java.lang.Long.valueOf(qx1Var.f465867f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465866e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465865d);
            fVar.g(2, 8, linkedList);
            fVar.h(3, this.f465867f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f465865d) + 0 + b36.f.g(2, 8, linkedList) + b36.f.h(3, this.f465867f);
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
        r45.qx1 qx1Var = (r45.qx1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qx1Var.f465865d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            qx1Var.f465867f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.xn1 xn1Var = new r45.xn1();
            if (bArr2 != null && bArr2.length > 0) {
                xn1Var.mo11468x92b714fd(bArr2);
            }
            qx1Var.f465866e.add(xn1Var);
        }
        return 0;
    }
}
