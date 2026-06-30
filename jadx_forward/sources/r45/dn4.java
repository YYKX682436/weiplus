package r45;

/* loaded from: classes8.dex */
public class dn4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f454128d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454129e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f454130f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dn4)) {
            return false;
        }
        r45.dn4 dn4Var = (r45.dn4) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f454128d), java.lang.Boolean.valueOf(dn4Var.f454128d)) && n51.f.a(this.f454129e, dn4Var.f454129e) && n51.f.a(this.f454130f, dn4Var.f454130f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454130f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f454128d);
            java.lang.String str = this.f454129e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f454128d) + 0;
            java.lang.String str2 = this.f454129e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            return a17 + b36.f.g(3, 2, linkedList);
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
        r45.dn4 dn4Var = (r45.dn4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dn4Var.f454128d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            dn4Var.f454129e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        dn4Var.f454130f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        return 0;
    }
}
