package r45;

/* loaded from: classes9.dex */
public class up5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469082d;

    /* renamed from: e, reason: collision with root package name */
    public int f469083e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f469084f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f469085g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.up5)) {
            return false;
        }
        r45.up5 up5Var = (r45.up5) fVar;
        return n51.f.a(this.f76492x92037252, up5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f469082d), java.lang.Integer.valueOf(up5Var.f469082d)) && n51.f.a(java.lang.Integer.valueOf(this.f469083e), java.lang.Integer.valueOf(up5Var.f469083e)) && n51.f.a(this.f469084f, up5Var.f469084f) && n51.f.a(this.f469085g, up5Var.f469085g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469085g;
        java.util.LinkedList linkedList2 = this.f469084f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f469082d);
            fVar.e(3, this.f469083e);
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469082d) + b36.f.e(3, this.f469083e) + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 2, linkedList);
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
        r45.up5 up5Var = (r45.up5) objArr[1];
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
                up5Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            up5Var.f469082d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            up5Var.f469083e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            up5Var.f469085g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.hm0 hm0Var = new r45.hm0();
            if (bArr3 != null && bArr3.length > 0) {
                hm0Var.mo11468x92b714fd(bArr3);
            }
            up5Var.f469084f.add(hm0Var);
        }
        return 0;
    }
}
