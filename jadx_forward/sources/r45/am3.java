package r45;

/* loaded from: classes8.dex */
public class am3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f451652d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f451653e;

    /* renamed from: f, reason: collision with root package name */
    public int f451654f;

    /* renamed from: g, reason: collision with root package name */
    public int f451655g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f451656h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.am3)) {
            return false;
        }
        r45.am3 am3Var = (r45.am3) fVar;
        return n51.f.a(this.f76494x2de60e5e, am3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f451652d), java.lang.Integer.valueOf(am3Var.f451652d)) && n51.f.a(this.f451653e, am3Var.f451653e) && n51.f.a(java.lang.Integer.valueOf(this.f451654f), java.lang.Integer.valueOf(am3Var.f451654f)) && n51.f.a(java.lang.Integer.valueOf(this.f451655g), java.lang.Integer.valueOf(am3Var.f451655g)) && n51.f.a(this.f451656h, am3Var.f451656h);
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
            fVar.e(2, this.f451652d);
            r45.cu5 cu5Var = this.f451653e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f451653e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f451654f);
            fVar.e(5, this.f451655g);
            r45.cu5 cu5Var2 = this.f451656h;
            if (cu5Var2 != null) {
                fVar.i(6, cu5Var2.mo75928xcd1e8d8());
                this.f451656h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f451652d);
            r45.cu5 cu5Var3 = this.f451653e;
            if (cu5Var3 != null) {
                i18 += b36.f.i(3, cu5Var3.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f451654f) + b36.f.e(5, this.f451655g);
            r45.cu5 cu5Var4 = this.f451656h;
            return cu5Var4 != null ? e17 + b36.f.i(6, cu5Var4.mo75928xcd1e8d8()) : e17;
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
        r45.am3 am3Var = (r45.am3) objArr[1];
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
                    am3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                am3Var.f451652d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    am3Var.f451653e = cu5Var5;
                }
                return 0;
            case 4:
                am3Var.f451654f = aVar2.g(intValue);
                return 0;
            case 5:
                am3Var.f451655g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    am3Var.f451656h = cu5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
