package t45;

/* loaded from: classes4.dex */
public class y extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f497190d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f497191e;

    /* renamed from: f, reason: collision with root package name */
    public int f497192f;

    /* renamed from: g, reason: collision with root package name */
    public int f497193g;

    /* renamed from: h, reason: collision with root package name */
    public t45.k0 f497194h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f497195i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.y)) {
            return false;
        }
        t45.y yVar = (t45.y) fVar;
        return n51.f.a(this.f76494x2de60e5e, yVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f497190d), java.lang.Integer.valueOf(yVar.f497190d)) && n51.f.a(this.f497191e, yVar.f497191e) && n51.f.a(java.lang.Integer.valueOf(this.f497192f), java.lang.Integer.valueOf(yVar.f497192f)) && n51.f.a(java.lang.Integer.valueOf(this.f497193g), java.lang.Integer.valueOf(yVar.f497193g)) && n51.f.a(this.f497194h, yVar.f497194h) && n51.f.a(this.f497195i, yVar.f497195i);
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
            fVar.e(2, this.f497190d);
            java.lang.String str = this.f497191e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f497192f);
            fVar.e(5, this.f497193g);
            t45.k0 k0Var = this.f497194h;
            if (k0Var != null) {
                fVar.i(6, k0Var.mo75928xcd1e8d8());
                this.f497194h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f497195i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f497190d);
            java.lang.String str3 = this.f497191e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f497192f) + b36.f.e(5, this.f497193g);
            t45.k0 k0Var2 = this.f497194h;
            if (k0Var2 != null) {
                e17 += b36.f.i(6, k0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f497195i;
            return str4 != null ? e17 + b36.f.j(7, str4) : e17;
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
        t45.y yVar = (t45.y) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    yVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                yVar.f497190d = aVar2.g(intValue);
                return 0;
            case 3:
                yVar.f497191e = aVar2.k(intValue);
                return 0;
            case 4:
                yVar.f497192f = aVar2.g(intValue);
                return 0;
            case 5:
                yVar.f497193g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    t45.k0 k0Var3 = new t45.k0();
                    if (bArr2 != null && bArr2.length > 0) {
                        k0Var3.mo11468x92b714fd(bArr2);
                    }
                    yVar.f497194h = k0Var3;
                }
                return 0;
            case 7:
                yVar.f497195i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
