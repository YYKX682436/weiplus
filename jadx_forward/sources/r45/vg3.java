package r45;

/* loaded from: classes2.dex */
public class vg3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f469732d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.tg3 f469733e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vg3)) {
            return false;
        }
        r45.vg3 vg3Var = (r45.vg3) fVar;
        return n51.f.a(this.f469732d, vg3Var.f469732d) && n51.f.a(this.f469733e, vg3Var.f469733e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f469732d);
            r45.tg3 tg3Var = this.f469733e;
            if (tg3Var != null) {
                fVar.i(2, tg3Var.mo75928xcd1e8d8());
                this.f469733e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f469732d) + 0;
            r45.tg3 tg3Var2 = this.f469733e;
            return tg3Var2 != null ? g17 + b36.f.i(2, tg3Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f469732d.clear();
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
        r45.vg3 vg3Var = (r45.vg3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ug3 ug3Var = new r45.ug3();
                if (bArr2 != null && bArr2.length > 0) {
                    ug3Var.mo11468x92b714fd(bArr2);
                }
                vg3Var.f469732d.add(ug3Var);
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.tg3 tg3Var3 = new r45.tg3();
            if (bArr3 != null && bArr3.length > 0) {
                tg3Var3.mo11468x92b714fd(bArr3);
            }
            vg3Var.f469733e = tg3Var3;
        }
        return 0;
    }
}
