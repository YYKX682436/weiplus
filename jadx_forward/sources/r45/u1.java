package r45;

/* loaded from: classes2.dex */
public class u1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f468454d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f468455e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yt5 f468456f;

    /* renamed from: g, reason: collision with root package name */
    public r45.e90 f468457g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u1)) {
            return false;
        }
        r45.u1 u1Var = (r45.u1) fVar;
        return n51.f.a(this.f468454d, u1Var.f468454d) && n51.f.a(this.f468455e, u1Var.f468455e) && n51.f.a(this.f468456f, u1Var.f468456f) && n51.f.a(this.f468457g, u1Var.f468457g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f468454d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.mo75928xcd1e8d8());
                this.f468454d.mo75956x3d5d1f78(fVar);
            }
            r45.rl6 rl6Var2 = this.f468455e;
            if (rl6Var2 != null) {
                fVar.i(2, rl6Var2.mo75928xcd1e8d8());
                this.f468455e.mo75956x3d5d1f78(fVar);
            }
            r45.yt5 yt5Var = this.f468456f;
            if (yt5Var != null) {
                fVar.i(3, yt5Var.mo75928xcd1e8d8());
                this.f468456f.mo75956x3d5d1f78(fVar);
            }
            r45.e90 e90Var = this.f468457g;
            if (e90Var != null) {
                fVar.i(4, e90Var.mo75928xcd1e8d8());
                this.f468457g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var3 = this.f468454d;
            int i18 = rl6Var3 != null ? 0 + b36.f.i(1, rl6Var3.mo75928xcd1e8d8()) : 0;
            r45.rl6 rl6Var4 = this.f468455e;
            if (rl6Var4 != null) {
                i18 += b36.f.i(2, rl6Var4.mo75928xcd1e8d8());
            }
            r45.yt5 yt5Var2 = this.f468456f;
            if (yt5Var2 != null) {
                i18 += b36.f.i(3, yt5Var2.mo75928xcd1e8d8());
            }
            r45.e90 e90Var2 = this.f468457g;
            return e90Var2 != null ? i18 + b36.f.i(4, e90Var2.mo75928xcd1e8d8()) : i18;
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
        r45.u1 u1Var = (r45.u1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.rl6 rl6Var5 = new r45.rl6();
                if (bArr != null && bArr.length > 0) {
                    rl6Var5.mo11468x92b714fd(bArr);
                }
                u1Var.f468454d = rl6Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.rl6 rl6Var6 = new r45.rl6();
                if (bArr2 != null && bArr2.length > 0) {
                    rl6Var6.mo11468x92b714fd(bArr2);
                }
                u1Var.f468455e = rl6Var6;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.yt5 yt5Var3 = new r45.yt5();
                if (bArr3 != null && bArr3.length > 0) {
                    yt5Var3.mo11468x92b714fd(bArr3);
                }
                u1Var.f468456f = yt5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.e90 e90Var3 = new r45.e90();
            if (bArr4 != null && bArr4.length > 0) {
                e90Var3.mo11468x92b714fd(bArr4);
            }
            u1Var.f468457g = e90Var3;
        }
        return 0;
    }
}
