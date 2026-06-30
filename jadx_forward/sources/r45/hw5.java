package r45;

/* loaded from: classes4.dex */
public class hw5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f458049d;

    /* renamed from: e, reason: collision with root package name */
    public int f458050e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f458051f;

    /* renamed from: g, reason: collision with root package name */
    public int f458052g;

    /* renamed from: h, reason: collision with root package name */
    public int f458053h;

    /* renamed from: i, reason: collision with root package name */
    public int f458054i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hw5)) {
            return false;
        }
        r45.hw5 hw5Var = (r45.hw5) fVar;
        return n51.f.a(this.f76494x2de60e5e, hw5Var.f76494x2de60e5e) && n51.f.a(this.f458049d, hw5Var.f458049d) && n51.f.a(java.lang.Integer.valueOf(this.f458050e), java.lang.Integer.valueOf(hw5Var.f458050e)) && n51.f.a(this.f458051f, hw5Var.f458051f) && n51.f.a(java.lang.Integer.valueOf(this.f458052g), java.lang.Integer.valueOf(hw5Var.f458052g)) && n51.f.a(java.lang.Integer.valueOf(this.f458053h), java.lang.Integer.valueOf(hw5Var.f458053h)) && n51.f.a(java.lang.Integer.valueOf(this.f458054i), java.lang.Integer.valueOf(hw5Var.f458054i));
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
            r45.du5 du5Var = this.f458049d;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f458049d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f458050e);
            r45.cu5 cu5Var = this.f458051f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f458051f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f458052g);
            fVar.e(6, this.f458053h);
            fVar.e(7, this.f458054i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.du5 du5Var2 = this.f458049d;
            if (du5Var2 != null) {
                i18 += b36.f.i(2, du5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f458050e);
            r45.cu5 cu5Var2 = this.f458051f;
            if (cu5Var2 != null) {
                e17 += b36.f.i(4, cu5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(5, this.f458052g) + b36.f.e(6, this.f458053h) + b36.f.e(7, this.f458054i);
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
        r45.hw5 hw5Var = (r45.hw5) objArr[1];
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
                    hw5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var3.b(bArr2);
                    }
                    hw5Var.f458049d = du5Var3;
                }
                return 0;
            case 3:
                hw5Var.f458050e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    hw5Var.f458051f = cu5Var3;
                }
                return 0;
            case 5:
                hw5Var.f458052g = aVar2.g(intValue);
                return 0;
            case 6:
                hw5Var.f458053h = aVar2.g(intValue);
                return 0;
            case 7:
                hw5Var.f458054i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
