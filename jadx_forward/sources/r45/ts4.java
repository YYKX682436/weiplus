package r45;

/* loaded from: classes2.dex */
public class ts4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.i66 f468291d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f468292e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.dg4 f468293f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ts4)) {
            return false;
        }
        r45.ts4 ts4Var = (r45.ts4) fVar;
        return n51.f.a(this.f468291d, ts4Var.f468291d) && n51.f.a(this.f468292e, ts4Var.f468292e) && n51.f.a(this.f468293f, ts4Var.f468293f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468292e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.i66 i66Var = this.f468291d;
            if (i66Var != null) {
                fVar.i(1, i66Var.mo75928xcd1e8d8());
                this.f468291d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            r45.dg4 dg4Var = this.f468293f;
            if (dg4Var != null) {
                fVar.i(3, dg4Var.mo75928xcd1e8d8());
                this.f468293f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.i66 i66Var2 = this.f468291d;
            int i18 = (i66Var2 != null ? 0 + b36.f.i(1, i66Var2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            r45.dg4 dg4Var2 = this.f468293f;
            return dg4Var2 != null ? i18 + b36.f.i(3, dg4Var2.mo75928xcd1e8d8()) : i18;
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
        r45.ts4 ts4Var = (r45.ts4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.i66 i66Var3 = new r45.i66();
                if (bArr2 != null && bArr2.length > 0) {
                    i66Var3.mo11468x92b714fd(bArr2);
                }
                ts4Var.f468291d = i66Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.ig4 ig4Var = new r45.ig4();
                if (bArr3 != null && bArr3.length > 0) {
                    ig4Var.mo11468x92b714fd(bArr3);
                }
                ts4Var.f468292e.add(ig4Var);
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
            r45.dg4 dg4Var3 = new r45.dg4();
            if (bArr4 != null && bArr4.length > 0) {
                dg4Var3.mo11468x92b714fd(bArr4);
            }
            ts4Var.f468293f = dg4Var3;
        }
        return 0;
    }
}
