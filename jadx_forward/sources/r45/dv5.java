package r45;

/* loaded from: classes9.dex */
public class dv5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.si f454304d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f454305e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454306f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sk6 f454307g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dv5)) {
            return false;
        }
        r45.dv5 dv5Var = (r45.dv5) fVar;
        return n51.f.a(this.f454304d, dv5Var.f454304d) && n51.f.a(this.f454305e, dv5Var.f454305e) && n51.f.a(this.f454306f, dv5Var.f454306f) && n51.f.a(this.f454307g, dv5Var.f454307g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454305e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.si siVar = this.f454304d;
            if (siVar != null) {
                fVar.i(1, siVar.mo75928xcd1e8d8());
                this.f454304d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f454306f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.sk6 sk6Var = this.f454307g;
            if (sk6Var != null) {
                fVar.i(4, sk6Var.mo75928xcd1e8d8());
                this.f454307g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.si siVar2 = this.f454304d;
            int i18 = (siVar2 != null ? 0 + b36.f.i(1, siVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f454306f;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            r45.sk6 sk6Var2 = this.f454307g;
            return sk6Var2 != null ? i18 + b36.f.i(4, sk6Var2.mo75928xcd1e8d8()) : i18;
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
        r45.dv5 dv5Var = (r45.dv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.si siVar3 = new r45.si();
                if (bArr2 != null && bArr2.length > 0) {
                    siVar3.mo11468x92b714fd(bArr2);
                }
                dv5Var.f454304d = siVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.qi qiVar = new r45.qi();
                if (bArr3 != null && bArr3.length > 0) {
                    qiVar.mo11468x92b714fd(bArr3);
                }
                dv5Var.f454305e.add(qiVar);
            }
            return 0;
        }
        if (intValue == 3) {
            dv5Var.f454306f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.sk6 sk6Var3 = new r45.sk6();
            if (bArr4 != null && bArr4.length > 0) {
                sk6Var3.mo11468x92b714fd(bArr4);
            }
            dv5Var.f454307g = sk6Var3;
        }
        return 0;
    }
}
