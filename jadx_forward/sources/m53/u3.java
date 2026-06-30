package m53;

/* loaded from: classes7.dex */
public class u3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public m53.i4 f405633e;

    /* renamed from: g, reason: collision with root package name */
    public m53.d4 f405635g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f405632d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f405634f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f405636h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.u3)) {
            return false;
        }
        m53.u3 u3Var = (m53.u3) fVar;
        return n51.f.a(this.f405632d, u3Var.f405632d) && n51.f.a(this.f405633e, u3Var.f405633e) && n51.f.a(this.f405634f, u3Var.f405634f) && n51.f.a(this.f405635g, u3Var.f405635g) && n51.f.a(this.f405636h, u3Var.f405636h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405636h;
        java.util.LinkedList linkedList2 = this.f405634f;
        java.util.LinkedList linkedList3 = this.f405632d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList3);
            m53.i4 i4Var = this.f405633e;
            if (i4Var != null) {
                fVar.i(2, i4Var.mo75928xcd1e8d8());
                this.f405633e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList2);
            m53.d4 d4Var = this.f405635g;
            if (d4Var != null) {
                fVar.i(4, d4Var.mo75928xcd1e8d8());
                this.f405635g.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList3) + 0;
            m53.i4 i4Var2 = this.f405633e;
            if (i4Var2 != null) {
                g17 += b36.f.i(2, i4Var2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(3, 8, linkedList2);
            m53.d4 d4Var2 = this.f405635g;
            if (d4Var2 != null) {
                g18 += b36.f.i(4, d4Var2.mo75928xcd1e8d8());
            }
            return g18 + b36.f.g(5, 8, linkedList);
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
        m53.u3 u3Var = (m53.u3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                m53.d dVar = new m53.d();
                if (bArr2 != null && bArr2.length > 0) {
                    dVar.mo11468x92b714fd(bArr2);
                }
                u3Var.f405632d.add(dVar);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                m53.i4 i4Var3 = new m53.i4();
                if (bArr3 != null && bArr3.length > 0) {
                    i4Var3.mo11468x92b714fd(bArr3);
                }
                u3Var.f405633e = i4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr4 = (byte[]) j19.get(i27);
                m53.u uVar = new m53.u();
                if (bArr4 != null && bArr4.length > 0) {
                    uVar.mo11468x92b714fd(bArr4);
                }
                u3Var.f405634f.add(uVar);
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr5 = (byte[]) j27.get(i28);
                m53.d4 d4Var3 = new m53.d4();
                if (bArr5 != null && bArr5.length > 0) {
                    d4Var3.mo11468x92b714fd(bArr5);
                }
                u3Var.f405635g = d4Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i29 = 0; i29 < size5; i29++) {
            byte[] bArr6 = (byte[]) j28.get(i29);
            m53.g5 g5Var = new m53.g5();
            if (bArr6 != null && bArr6.length > 0) {
                g5Var.mo11468x92b714fd(bArr6);
            }
            u3Var.f405636h.add(g5Var);
        }
        return 0;
    }
}
