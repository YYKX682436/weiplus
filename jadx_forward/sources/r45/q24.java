package r45;

/* loaded from: classes8.dex */
public class q24 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465138d;

    /* renamed from: e, reason: collision with root package name */
    public int f465139e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465140f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f465141g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q24)) {
            return false;
        }
        r45.q24 q24Var = (r45.q24) fVar;
        return n51.f.a(this.f465138d, q24Var.f465138d) && n51.f.a(java.lang.Integer.valueOf(this.f465139e), java.lang.Integer.valueOf(q24Var.f465139e)) && n51.f.a(this.f465140f, q24Var.f465140f) && n51.f.a(this.f465141g, q24Var.f465141g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465141g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465138d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f465139e);
            java.lang.String str2 = this.f465140f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f465138d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f465139e);
            java.lang.String str4 = this.f465140f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.g(4, 1, linkedList);
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
        r45.q24 q24Var = (r45.q24) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q24Var.f465138d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            q24Var.f465139e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            q24Var.f465140f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        q24Var.f465141g.add(aVar2.k(intValue));
        return 0;
    }
}
