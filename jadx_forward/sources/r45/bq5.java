package r45;

/* loaded from: classes8.dex */
public class bq5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public float f452524d;

    /* renamed from: e, reason: collision with root package name */
    public float f452525e;

    /* renamed from: f, reason: collision with root package name */
    public float f452526f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452527g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452528h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f452529i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f452530m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bq5)) {
            return false;
        }
        r45.bq5 bq5Var = (r45.bq5) fVar;
        return n51.f.a(this.f76494x2de60e5e, bq5Var.f76494x2de60e5e) && n51.f.a(java.lang.Float.valueOf(this.f452524d), java.lang.Float.valueOf(bq5Var.f452524d)) && n51.f.a(java.lang.Float.valueOf(this.f452525e), java.lang.Float.valueOf(bq5Var.f452525e)) && n51.f.a(java.lang.Float.valueOf(this.f452526f), java.lang.Float.valueOf(bq5Var.f452526f)) && n51.f.a(this.f452527g, bq5Var.f452527g) && n51.f.a(this.f452528h, bq5Var.f452528h) && n51.f.a(java.lang.Boolean.valueOf(this.f452529i), java.lang.Boolean.valueOf(bq5Var.f452529i)) && n51.f.a(java.lang.Boolean.valueOf(this.f452530m), java.lang.Boolean.valueOf(bq5Var.f452530m));
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
            fVar.d(2, this.f452524d);
            fVar.d(3, this.f452525e);
            fVar.d(4, this.f452526f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f452527g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            java.lang.String str = this.f452528h;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.a(7, this.f452529i);
            fVar.a(8, this.f452530m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.d(2, this.f452524d) + b36.f.d(3, this.f452525e) + b36.f.d(4, this.f452526f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f452527g;
            if (gVar2 != null) {
                i18 += b36.f.b(5, gVar2);
            }
            java.lang.String str2 = this.f452528h;
            if (str2 != null) {
                i18 += b36.f.j(6, str2);
            }
            return i18 + b36.f.a(7, this.f452529i) + b36.f.a(8, this.f452530m);
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
        r45.bq5 bq5Var = (r45.bq5) objArr[1];
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
                    bq5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                bq5Var.f452524d = aVar2.f(intValue);
                return 0;
            case 3:
                bq5Var.f452525e = aVar2.f(intValue);
                return 0;
            case 4:
                bq5Var.f452526f = aVar2.f(intValue);
                return 0;
            case 5:
                bq5Var.f452527g = aVar2.d(intValue);
                return 0;
            case 6:
                bq5Var.f452528h = aVar2.k(intValue);
                return 0;
            case 7:
                bq5Var.f452529i = aVar2.c(intValue);
                return 0;
            case 8:
                bq5Var.f452530m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
