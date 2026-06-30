package r45;

/* loaded from: classes2.dex */
public class lv3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bz3 f461389d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f461390e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lv3)) {
            return false;
        }
        r45.lv3 lv3Var = (r45.lv3) fVar;
        return n51.f.a(this.f461389d, lv3Var.f461389d) && n51.f.a(this.f461390e, lv3Var.f461390e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bz3 bz3Var = this.f461389d;
            if (bz3Var != null) {
                fVar.i(1, bz3Var.mo75928xcd1e8d8());
                this.f461389d.mo75956x3d5d1f78(fVar);
            }
            r45.rl6 rl6Var = this.f461390e;
            if (rl6Var != null) {
                fVar.i(2, rl6Var.mo75928xcd1e8d8());
                this.f461390e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.bz3 bz3Var2 = this.f461389d;
            int i18 = bz3Var2 != null ? 0 + b36.f.i(1, bz3Var2.mo75928xcd1e8d8()) : 0;
            r45.rl6 rl6Var2 = this.f461390e;
            return rl6Var2 != null ? i18 + b36.f.i(2, rl6Var2.mo75928xcd1e8d8()) : i18;
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
        r45.lv3 lv3Var = (r45.lv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.bz3 bz3Var3 = new r45.bz3();
                if (bArr != null && bArr.length > 0) {
                    bz3Var3.mo11468x92b714fd(bArr);
                }
                lv3Var.f461389d = bz3Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.rl6 rl6Var3 = new r45.rl6();
            if (bArr2 != null && bArr2.length > 0) {
                rl6Var3.mo11468x92b714fd(bArr2);
            }
            lv3Var.f461390e = rl6Var3;
        }
        return 0;
    }
}
