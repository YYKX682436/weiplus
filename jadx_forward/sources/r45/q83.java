package r45;

/* loaded from: classes7.dex */
public class q83 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465290d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f465291e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f465292f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f465293g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f465294h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q83)) {
            return false;
        }
        r45.q83 q83Var = (r45.q83) fVar;
        return n51.f.a(this.f76492x92037252, q83Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f465290d), java.lang.Integer.valueOf(q83Var.f465290d)) && n51.f.a(this.f465291e, q83Var.f465291e) && n51.f.a(this.f465292f, q83Var.f465292f) && n51.f.a(this.f465293g, q83Var.f465293g) && n51.f.a(this.f465294h, q83Var.f465294h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465294h;
        java.util.LinkedList linkedList2 = this.f465293g;
        java.util.LinkedList linkedList3 = this.f465292f;
        java.util.LinkedList linkedList4 = this.f465291e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f465290d);
            fVar.g(3, 2, linkedList4);
            fVar.g(4, 8, linkedList3);
            fVar.g(5, 8, linkedList2);
            fVar.g(7, 6, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465290d) + b36.f.g(3, 2, linkedList4) + b36.f.g(4, 8, linkedList3) + b36.f.g(5, 8, linkedList2) + b36.f.g(7, 6, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
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
        r45.q83 q83Var = (r45.q83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                q83Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            q83Var.f465290d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            q83Var.f465291e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.p83 p83Var = new r45.p83();
                if (bArr3 != null && bArr3.length > 0) {
                    p83Var.mo11468x92b714fd(bArr3);
                }
                q83Var.f465292f.add(p83Var);
            }
            return 0;
        }
        if (intValue != 5) {
            if (intValue != 7) {
                return -1;
            }
            q83Var.f465294h.add(aVar2.d(intValue));
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.k83 k83Var = new r45.k83();
            if (bArr4 != null && bArr4.length > 0) {
                k83Var.mo11468x92b714fd(bArr4);
            }
            q83Var.f465293g.add(k83Var);
        }
        return 0;
    }
}
