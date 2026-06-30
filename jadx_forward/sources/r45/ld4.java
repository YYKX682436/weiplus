package r45;

/* loaded from: classes4.dex */
public class ld4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f460858d;

    /* renamed from: e, reason: collision with root package name */
    public int f460859e;

    /* renamed from: f, reason: collision with root package name */
    public int f460860f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460861g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ld4)) {
            return false;
        }
        r45.ld4 ld4Var = (r45.ld4) fVar;
        return n51.f.a(this.f76494x2de60e5e, ld4Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f460858d), java.lang.Integer.valueOf(ld4Var.f460858d)) && n51.f.a(java.lang.Integer.valueOf(this.f460859e), java.lang.Integer.valueOf(ld4Var.f460859e)) && n51.f.a(java.lang.Integer.valueOf(this.f460860f), java.lang.Integer.valueOf(ld4Var.f460860f)) && n51.f.a(this.f460861g, ld4Var.f460861g);
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
            fVar.e(2, this.f460858d);
            fVar.e(3, this.f460859e);
            fVar.e(4, this.f460860f);
            java.lang.String str = this.f460861g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f460858d) + b36.f.e(3, this.f460859e) + b36.f.e(4, this.f460860f);
            java.lang.String str2 = this.f460861g;
            return str2 != null ? i18 + b36.f.j(5, str2) : i18;
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
        r45.ld4 ld4Var = (r45.ld4) objArr[1];
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
                ld4Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ld4Var.f460858d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ld4Var.f460859e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ld4Var.f460860f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ld4Var.f460861g = aVar2.k(intValue);
        return 0;
    }
}
