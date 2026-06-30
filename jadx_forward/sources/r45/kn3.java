package r45;

/* loaded from: classes4.dex */
public class kn3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460376d;

    /* renamed from: e, reason: collision with root package name */
    public r45.jn3 f460377e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kn3)) {
            return false;
        }
        r45.kn3 kn3Var = (r45.kn3) fVar;
        return n51.f.a(this.f76494x2de60e5e, kn3Var.f76494x2de60e5e) && n51.f.a(this.f460376d, kn3Var.f460376d) && n51.f.a(this.f460377e, kn3Var.f460377e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f460376d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.jn3 jn3Var = this.f460377e;
            if (jn3Var != null) {
                fVar.i(3, jn3Var.mo75928xcd1e8d8());
                this.f460377e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f460376d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.jn3 jn3Var2 = this.f460377e;
            return jn3Var2 != null ? i18 + b36.f.i(3, jn3Var2.mo75928xcd1e8d8()) : i18;
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
        r45.kn3 kn3Var = (r45.kn3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                kn3Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            kn3Var.f460376d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.jn3 jn3Var3 = new r45.jn3();
            if (bArr2 != null && bArr2.length > 0) {
                jn3Var3.mo11468x92b714fd(bArr2);
            }
            kn3Var.f460377e = jn3Var3;
        }
        return 0;
    }
}
