package r45;

/* loaded from: classes2.dex */
public class ud4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.m03 f468798d;

    /* renamed from: e, reason: collision with root package name */
    public r45.m03 f468799e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ud4)) {
            return false;
        }
        r45.ud4 ud4Var = (r45.ud4) fVar;
        return n51.f.a(this.f468798d, ud4Var.f468798d) && n51.f.a(this.f468799e, ud4Var.f468799e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.m03 m03Var = this.f468798d;
            if (m03Var != null) {
                fVar.i(1, m03Var.mo75928xcd1e8d8());
                this.f468798d.mo75956x3d5d1f78(fVar);
            }
            r45.m03 m03Var2 = this.f468799e;
            if (m03Var2 != null) {
                fVar.i(2, m03Var2.mo75928xcd1e8d8());
                this.f468799e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.m03 m03Var3 = this.f468798d;
            int i18 = m03Var3 != null ? 0 + b36.f.i(1, m03Var3.mo75928xcd1e8d8()) : 0;
            r45.m03 m03Var4 = this.f468799e;
            return m03Var4 != null ? i18 + b36.f.i(2, m03Var4.mo75928xcd1e8d8()) : i18;
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
        r45.ud4 ud4Var = (r45.ud4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.m03 m03Var5 = new r45.m03();
                if (bArr != null && bArr.length > 0) {
                    m03Var5.mo11468x92b714fd(bArr);
                }
                ud4Var.f468798d = m03Var5;
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
            r45.m03 m03Var6 = new r45.m03();
            if (bArr2 != null && bArr2.length > 0) {
                m03Var6.mo11468x92b714fd(bArr2);
            }
            ud4Var.f468799e = m03Var6;
        }
        return 0;
    }
}
