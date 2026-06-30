package r45;

/* loaded from: classes8.dex */
public class fh4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455883d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455884e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f455885f;

    /* renamed from: g, reason: collision with root package name */
    public int f455886g;

    /* renamed from: h, reason: collision with root package name */
    public int f455887h;

    /* renamed from: i, reason: collision with root package name */
    public int f455888i;

    /* renamed from: m, reason: collision with root package name */
    public int f455889m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fh4)) {
            return false;
        }
        r45.fh4 fh4Var = (r45.fh4) fVar;
        return n51.f.a(this.f76494x2de60e5e, fh4Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f455883d), java.lang.Integer.valueOf(fh4Var.f455883d)) && n51.f.a(this.f455884e, fh4Var.f455884e) && n51.f.a(this.f455885f, fh4Var.f455885f) && n51.f.a(java.lang.Integer.valueOf(this.f455886g), java.lang.Integer.valueOf(fh4Var.f455886g)) && n51.f.a(java.lang.Integer.valueOf(this.f455887h), java.lang.Integer.valueOf(fh4Var.f455887h)) && n51.f.a(java.lang.Integer.valueOf(this.f455888i), java.lang.Integer.valueOf(fh4Var.f455888i)) && n51.f.a(java.lang.Integer.valueOf(this.f455889m), java.lang.Integer.valueOf(fh4Var.f455889m));
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
            fVar.e(2, this.f455883d);
            java.lang.String str = this.f455884e;
            if (str != null) {
                fVar.j(3, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f455885f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f455886g);
            fVar.e(6, this.f455887h);
            fVar.e(7, this.f455888i);
            fVar.e(8, this.f455889m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455883d);
            java.lang.String str2 = this.f455884e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f455885f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            return i18 + b36.f.e(5, this.f455886g) + b36.f.e(6, this.f455887h) + b36.f.e(7, this.f455888i) + b36.f.e(8, this.f455889m);
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
        r45.fh4 fh4Var = (r45.fh4) objArr[1];
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
                    fh4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                fh4Var.f455883d = aVar2.g(intValue);
                return 0;
            case 3:
                fh4Var.f455884e = aVar2.k(intValue);
                return 0;
            case 4:
                fh4Var.f455885f = aVar2.d(intValue);
                return 0;
            case 5:
                fh4Var.f455886g = aVar2.g(intValue);
                return 0;
            case 6:
                fh4Var.f455887h = aVar2.g(intValue);
                return 0;
            case 7:
                fh4Var.f455888i = aVar2.g(intValue);
                return 0;
            case 8:
                fh4Var.f455889m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
