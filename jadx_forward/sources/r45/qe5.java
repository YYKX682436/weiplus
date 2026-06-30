package r45;

/* loaded from: classes4.dex */
public class qe5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465445d;

    /* renamed from: e, reason: collision with root package name */
    public long f465446e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f465447f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f465448g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qe5)) {
            return false;
        }
        r45.qe5 qe5Var = (r45.qe5) fVar;
        return n51.f.a(this.f76492x92037252, qe5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f465445d), java.lang.Integer.valueOf(qe5Var.f465445d)) && n51.f.a(java.lang.Long.valueOf(this.f465446e), java.lang.Long.valueOf(qe5Var.f465446e)) && n51.f.a(this.f465447f, qe5Var.f465447f) && n51.f.a(this.f465448g, qe5Var.f465448g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465448g;
        java.util.LinkedList linkedList2 = this.f465447f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f465445d);
            fVar.h(3, this.f465446e);
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465445d) + b36.f.h(3, this.f465446e) + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.qe5 qe5Var = (r45.qe5) objArr[1];
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
                qe5Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qe5Var.f465445d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            qe5Var.f465446e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.fe5 fe5Var = new r45.fe5();
                if (bArr3 != null && bArr3.length > 0) {
                    fe5Var.mo11468x92b714fd(bArr3);
                }
                qe5Var.f465447f.add(fe5Var);
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.fe5 fe5Var2 = new r45.fe5();
            if (bArr4 != null && bArr4.length > 0) {
                fe5Var2.mo11468x92b714fd(bArr4);
            }
            qe5Var.f465448g.add(fe5Var2);
        }
        return 0;
    }
}
