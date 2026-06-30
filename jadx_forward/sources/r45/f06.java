package r45;

/* loaded from: classes2.dex */
public class f06 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455447d;

    /* renamed from: e, reason: collision with root package name */
    public int f455448e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455449f;

    /* renamed from: g, reason: collision with root package name */
    public long f455450g;

    /* renamed from: h, reason: collision with root package name */
    public r45.od4 f455451h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455452i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f06)) {
            return false;
        }
        r45.f06 f06Var = (r45.f06) fVar;
        return n51.f.a(this.f76494x2de60e5e, f06Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f455447d), java.lang.Integer.valueOf(f06Var.f455447d)) && n51.f.a(java.lang.Integer.valueOf(this.f455448e), java.lang.Integer.valueOf(f06Var.f455448e)) && n51.f.a(this.f455449f, f06Var.f455449f) && n51.f.a(java.lang.Long.valueOf(this.f455450g), java.lang.Long.valueOf(f06Var.f455450g)) && n51.f.a(this.f455451h, f06Var.f455451h) && n51.f.a(this.f455452i, f06Var.f455452i);
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
            fVar.e(2, this.f455447d);
            fVar.e(3, this.f455448e);
            java.lang.String str = this.f455449f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.h(5, this.f455450g);
            r45.od4 od4Var = this.f455451h;
            if (od4Var != null) {
                fVar.i(6, od4Var.mo75928xcd1e8d8());
                this.f455451h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f455452i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455447d) + b36.f.e(3, this.f455448e);
            java.lang.String str3 = this.f455449f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int h17 = i18 + b36.f.h(5, this.f455450g);
            r45.od4 od4Var2 = this.f455451h;
            if (od4Var2 != null) {
                h17 += b36.f.i(6, od4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f455452i;
            return str4 != null ? h17 + b36.f.j(7, str4) : h17;
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
        r45.f06 f06Var = (r45.f06) objArr[1];
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
                    f06Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                f06Var.f455447d = aVar2.g(intValue);
                return 0;
            case 3:
                f06Var.f455448e = aVar2.g(intValue);
                return 0;
            case 4:
                f06Var.f455449f = aVar2.k(intValue);
                return 0;
            case 5:
                f06Var.f455450g = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.od4 od4Var3 = new r45.od4();
                    if (bArr2 != null && bArr2.length > 0) {
                        od4Var3.mo11468x92b714fd(bArr2);
                    }
                    f06Var.f455451h = od4Var3;
                }
                return 0;
            case 7:
                f06Var.f455452i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
