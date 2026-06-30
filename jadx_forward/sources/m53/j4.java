package m53;

/* loaded from: classes2.dex */
public class j4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.h f405354d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405355e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f405356f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f405357g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.j4)) {
            return false;
        }
        m53.j4 j4Var = (m53.j4) fVar;
        return n51.f.a(this.f405354d, j4Var.f405354d) && n51.f.a(this.f405355e, j4Var.f405355e) && n51.f.a(java.lang.Boolean.valueOf(this.f405356f), java.lang.Boolean.valueOf(j4Var.f405356f)) && n51.f.a(this.f405357g, j4Var.f405357g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405357g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.h hVar = this.f405354d;
            if (hVar != null) {
                fVar.i(1, hVar.mo75928xcd1e8d8());
                this.f405354d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f405355e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f405356f);
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            m53.h hVar2 = this.f405354d;
            int i18 = hVar2 != null ? 0 + b36.f.i(1, hVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f405355e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.a(3, this.f405356f) + b36.f.g(4, 1, linkedList);
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
        m53.j4 j4Var = (m53.j4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                j4Var.f405355e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                j4Var.f405356f = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            j4Var.f405357g.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr2 = (byte[]) j17.get(i19);
            m53.h hVar3 = new m53.h();
            if (bArr2 != null && bArr2.length > 0) {
                hVar3.mo11468x92b714fd(bArr2);
            }
            j4Var.f405354d = hVar3;
        }
        return 0;
    }
}
