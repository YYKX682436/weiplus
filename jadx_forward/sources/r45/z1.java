package r45;

/* loaded from: classes2.dex */
public class z1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.e70 f473111d;

    /* renamed from: e, reason: collision with root package name */
    public r45.e70 f473112e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z1)) {
            return false;
        }
        r45.z1 z1Var = (r45.z1) fVar;
        return n51.f.a(this.f473111d, z1Var.f473111d) && n51.f.a(this.f473112e, z1Var.f473112e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.e70 e70Var = this.f473111d;
            if (e70Var != null) {
                fVar.i(1, e70Var.mo75928xcd1e8d8());
                this.f473111d.mo75956x3d5d1f78(fVar);
            }
            r45.e70 e70Var2 = this.f473112e;
            if (e70Var2 != null) {
                fVar.i(2, e70Var2.mo75928xcd1e8d8());
                this.f473112e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.e70 e70Var3 = this.f473111d;
            int i18 = e70Var3 != null ? 0 + b36.f.i(1, e70Var3.mo75928xcd1e8d8()) : 0;
            r45.e70 e70Var4 = this.f473112e;
            return e70Var4 != null ? i18 + b36.f.i(2, e70Var4.mo75928xcd1e8d8()) : i18;
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
        r45.z1 z1Var = (r45.z1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.e70 e70Var5 = new r45.e70();
                if (bArr != null && bArr.length > 0) {
                    e70Var5.mo11468x92b714fd(bArr);
                }
                z1Var.f473111d = e70Var5;
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
            r45.e70 e70Var6 = new r45.e70();
            if (bArr2 != null && bArr2.length > 0) {
                e70Var6.mo11468x92b714fd(bArr2);
            }
            z1Var.f473112e = e70Var6;
        }
        return 0;
    }
}
