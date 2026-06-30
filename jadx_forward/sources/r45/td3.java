package r45;

/* loaded from: classes8.dex */
public class td3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467854d;

    /* renamed from: e, reason: collision with root package name */
    public int f467855e;

    /* renamed from: f, reason: collision with root package name */
    public double f467856f;

    /* renamed from: g, reason: collision with root package name */
    public double f467857g;

    /* renamed from: h, reason: collision with root package name */
    public int f467858h;

    /* renamed from: i, reason: collision with root package name */
    public int f467859i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.td3)) {
            return false;
        }
        r45.td3 td3Var = (r45.td3) fVar;
        return n51.f.a(this.f76494x2de60e5e, td3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f467854d), java.lang.Integer.valueOf(td3Var.f467854d)) && n51.f.a(java.lang.Integer.valueOf(this.f467855e), java.lang.Integer.valueOf(td3Var.f467855e)) && n51.f.a(java.lang.Double.valueOf(this.f467856f), java.lang.Double.valueOf(td3Var.f467856f)) && n51.f.a(java.lang.Double.valueOf(this.f467857g), java.lang.Double.valueOf(td3Var.f467857g)) && n51.f.a(java.lang.Integer.valueOf(this.f467858h), java.lang.Integer.valueOf(td3Var.f467858h)) && n51.f.a(java.lang.Integer.valueOf(this.f467859i), java.lang.Integer.valueOf(td3Var.f467859i));
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
            fVar.e(2, this.f467854d);
            fVar.e(3, this.f467855e);
            fVar.c(4, this.f467856f);
            fVar.c(5, this.f467857g);
            fVar.e(6, this.f467858h);
            fVar.e(7, this.f467859i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467854d) + b36.f.e(3, this.f467855e) + b36.f.c(4, this.f467856f) + b36.f.c(5, this.f467857g) + b36.f.e(6, this.f467858h) + b36.f.e(7, this.f467859i);
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
        r45.td3 td3Var = (r45.td3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    td3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                td3Var.f467854d = aVar2.g(intValue);
                return 0;
            case 3:
                td3Var.f467855e = aVar2.g(intValue);
                return 0;
            case 4:
                td3Var.f467856f = aVar2.e(intValue);
                return 0;
            case 5:
                td3Var.f467857g = aVar2.e(intValue);
                return 0;
            case 6:
                td3Var.f467858h = aVar2.g(intValue);
                return 0;
            case 7:
                td3Var.f467859i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
