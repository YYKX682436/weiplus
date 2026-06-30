package bo1;

/* loaded from: classes2.dex */
public class o extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bo1.c f104545d;

    /* renamed from: e, reason: collision with root package name */
    public bo1.c f104546e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f104547f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bo1.o)) {
            return false;
        }
        bo1.o oVar = (bo1.o) fVar;
        return n51.f.a(this.f104545d, oVar.f104545d) && n51.f.a(this.f104546e, oVar.f104546e) && n51.f.a(this.f104547f, oVar.f104547f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f104547f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bo1.c cVar = this.f104545d;
            if (cVar != null) {
                fVar.i(1, cVar.mo75928xcd1e8d8());
                this.f104545d.mo75956x3d5d1f78(fVar);
            }
            bo1.c cVar2 = this.f104546e;
            if (cVar2 != null) {
                fVar.i(2, cVar2.mo75928xcd1e8d8());
                this.f104546e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bo1.c cVar3 = this.f104545d;
            int i18 = cVar3 != null ? 0 + b36.f.i(1, cVar3.mo75928xcd1e8d8()) : 0;
            bo1.c cVar4 = this.f104546e;
            if (cVar4 != null) {
                i18 += b36.f.i(2, cVar4.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
        bo1.o oVar = (bo1.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                bo1.c cVar5 = new bo1.c();
                if (bArr2 != null && bArr2.length > 0) {
                    cVar5.mo11468x92b714fd(bArr2);
                }
                oVar.f104545d = cVar5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                bo1.c cVar6 = new bo1.c();
                if (bArr3 != null && bArr3.length > 0) {
                    cVar6.mo11468x92b714fd(bArr3);
                }
                oVar.f104546e = cVar6;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            bo1.p pVar = new bo1.p();
            if (bArr4 != null && bArr4.length > 0) {
                pVar.mo11468x92b714fd(bArr4);
            }
            oVar.f104547f.add(pVar);
        }
        return 0;
    }
}
