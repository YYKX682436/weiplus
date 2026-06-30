package r45;

/* loaded from: classes8.dex */
public class t4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467659d;

    /* renamed from: e, reason: collision with root package name */
    public r45.s4 f467660e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f467661f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467662g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t4)) {
            return false;
        }
        r45.t4 t4Var = (r45.t4) fVar;
        return n51.f.a(this.f467659d, t4Var.f467659d) && n51.f.a(this.f467660e, t4Var.f467660e) && n51.f.a(this.f467661f, t4Var.f467661f) && n51.f.a(this.f467662g, t4Var.f467662g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467659d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.s4 s4Var = this.f467660e;
            if (s4Var != null) {
                fVar.i(2, s4Var.mo75928xcd1e8d8());
                this.f467660e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f467661f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f467662g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f467659d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.s4 s4Var2 = this.f467660e;
            if (s4Var2 != null) {
                j17 += b36.f.i(2, s4Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f467661f;
            if (gVar2 != null) {
                j17 += b36.f.b(3, gVar2);
            }
            java.lang.String str4 = this.f467662g;
            return str4 != null ? j17 + b36.f.j(4, str4) : j17;
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
        r45.t4 t4Var = (r45.t4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t4Var.f467659d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                t4Var.f467661f = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            t4Var.f467662g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.s4 s4Var3 = new r45.s4();
            if (bArr != null && bArr.length > 0) {
                s4Var3.mo11468x92b714fd(bArr);
            }
            t4Var.f467660e = s4Var3;
        }
        return 0;
    }
}
