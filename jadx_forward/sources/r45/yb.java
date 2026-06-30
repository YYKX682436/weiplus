package r45;

/* loaded from: classes4.dex */
public class yb extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472472d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f472473e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f472474f;

    /* renamed from: g, reason: collision with root package name */
    public int f472475g;

    /* renamed from: h, reason: collision with root package name */
    public int f472476h;

    /* renamed from: i, reason: collision with root package name */
    public int f472477i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yb)) {
            return false;
        }
        r45.yb ybVar = (r45.yb) fVar;
        return n51.f.a(this.f76494x2de60e5e, ybVar.f76494x2de60e5e) && n51.f.a(this.f472472d, ybVar.f472472d) && n51.f.a(this.f472473e, ybVar.f472473e) && n51.f.a(java.lang.Boolean.valueOf(this.f472474f), java.lang.Boolean.valueOf(ybVar.f472474f)) && n51.f.a(java.lang.Integer.valueOf(this.f472475g), java.lang.Integer.valueOf(ybVar.f472475g)) && n51.f.a(java.lang.Integer.valueOf(this.f472476h), java.lang.Integer.valueOf(ybVar.f472476h)) && n51.f.a(java.lang.Integer.valueOf(this.f472477i), java.lang.Integer.valueOf(ybVar.f472477i));
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
            java.lang.String str = this.f472472d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f472473e);
            fVar.a(4, this.f472474f);
            fVar.e(5, this.f472475g);
            fVar.e(6, this.f472476h);
            fVar.e(7, this.f472477i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f472472d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 1, this.f472473e) + b36.f.a(4, this.f472474f) + b36.f.e(5, this.f472475g) + b36.f.e(6, this.f472476h) + b36.f.e(7, this.f472477i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f472473e.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.yb ybVar = (r45.yb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    ybVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ybVar.f472472d = aVar2.k(intValue);
                return 0;
            case 3:
                ybVar.f472473e.add(aVar2.k(intValue));
                return 0;
            case 4:
                ybVar.f472474f = aVar2.c(intValue);
                return 0;
            case 5:
                ybVar.f472475g = aVar2.g(intValue);
                return 0;
            case 6:
                ybVar.f472476h = aVar2.g(intValue);
                return 0;
            case 7:
                ybVar.f472477i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
