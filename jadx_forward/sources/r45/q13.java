package r45;

/* loaded from: classes2.dex */
public class q13 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f465095d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f465096e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f465097f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.fg6 f465098g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q13)) {
            return false;
        }
        r45.q13 q13Var = (r45.q13) fVar;
        return n51.f.a(this.f465095d, q13Var.f465095d) && n51.f.a(this.f465096e, q13Var.f465096e) && n51.f.a(this.f465097f, q13Var.f465097f) && n51.f.a(this.f465098g, q13Var.f465098g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465097f;
        java.util.LinkedList linkedList2 = this.f465096e;
        java.util.LinkedList linkedList3 = this.f465095d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList3);
            fVar.g(2, 2, linkedList2);
            fVar.g(3, 2, linkedList);
            r45.fg6 fg6Var = this.f465098g;
            if (fg6Var != null) {
                fVar.i(4, fg6Var.mo75928xcd1e8d8());
                this.f465098g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 2, linkedList3) + 0 + b36.f.g(2, 2, linkedList2) + b36.f.g(3, 2, linkedList);
            r45.fg6 fg6Var2 = this.f465098g;
            return fg6Var2 != null ? g17 + b36.f.i(4, fg6Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.q13 q13Var = (r45.q13) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q13Var.f465095d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 2) {
            q13Var.f465096e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 3) {
            q13Var.f465097f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.fg6 fg6Var3 = new r45.fg6();
            if (bArr2 != null && bArr2.length > 0) {
                fg6Var3.mo11468x92b714fd(bArr2);
            }
            q13Var.f465098g = fg6Var3;
        }
        return 0;
    }
}
