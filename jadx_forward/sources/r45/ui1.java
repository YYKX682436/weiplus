package r45;

/* loaded from: classes9.dex */
public class ui1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.yx1 f468930d;

    /* renamed from: e, reason: collision with root package name */
    public int f468931e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yx1 f468932f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ui1)) {
            return false;
        }
        r45.ui1 ui1Var = (r45.ui1) fVar;
        return n51.f.a(this.f468930d, ui1Var.f468930d) && n51.f.a(java.lang.Integer.valueOf(this.f468931e), java.lang.Integer.valueOf(ui1Var.f468931e)) && n51.f.a(this.f468932f, ui1Var.f468932f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.yx1 yx1Var = this.f468930d;
            if (yx1Var != null) {
                fVar.i(1, yx1Var.mo75928xcd1e8d8());
                this.f468930d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f468931e);
            r45.yx1 yx1Var2 = this.f468932f;
            if (yx1Var2 != null) {
                fVar.i(3, yx1Var2.mo75928xcd1e8d8());
                this.f468932f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.yx1 yx1Var3 = this.f468930d;
            int i18 = (yx1Var3 != null ? 0 + b36.f.i(1, yx1Var3.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f468931e);
            r45.yx1 yx1Var4 = this.f468932f;
            return yx1Var4 != null ? i18 + b36.f.i(3, yx1Var4.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.ui1 ui1Var = (r45.ui1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.yx1 yx1Var5 = new r45.yx1();
                if (bArr != null && bArr.length > 0) {
                    yx1Var5.mo11468x92b714fd(bArr);
                }
                ui1Var.f468930d = yx1Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            ui1Var.f468931e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.yx1 yx1Var6 = new r45.yx1();
            if (bArr2 != null && bArr2.length > 0) {
                yx1Var6.mo11468x92b714fd(bArr2);
            }
            ui1Var.f468932f = yx1Var6;
        }
        return 0;
    }
}
