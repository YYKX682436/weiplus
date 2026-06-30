package r45;

/* loaded from: classes2.dex */
public class wi2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470728d;

    /* renamed from: e, reason: collision with root package name */
    public r45.kv0 f470729e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470730f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470731g;

    /* renamed from: h, reason: collision with root package name */
    public int f470732h;

    /* renamed from: i, reason: collision with root package name */
    public r45.dx0 f470733i;

    /* renamed from: m, reason: collision with root package name */
    public int f470734m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470735n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470736o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wi2)) {
            return false;
        }
        r45.wi2 wi2Var = (r45.wi2) fVar;
        return n51.f.a(this.f76494x2de60e5e, wi2Var.f76494x2de60e5e) && n51.f.a(this.f470728d, wi2Var.f470728d) && n51.f.a(this.f470729e, wi2Var.f470729e) && n51.f.a(this.f470730f, wi2Var.f470730f) && n51.f.a(this.f470731g, wi2Var.f470731g) && n51.f.a(java.lang.Integer.valueOf(this.f470732h), java.lang.Integer.valueOf(wi2Var.f470732h)) && n51.f.a(this.f470733i, wi2Var.f470733i) && n51.f.a(java.lang.Integer.valueOf(this.f470734m), java.lang.Integer.valueOf(wi2Var.f470734m)) && n51.f.a(this.f470735n, wi2Var.f470735n) && n51.f.a(this.f470736o, wi2Var.f470736o);
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
            java.lang.String str = this.f470728d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.kv0 kv0Var = this.f470729e;
            if (kv0Var != null) {
                fVar.i(3, kv0Var.mo75928xcd1e8d8());
                this.f470729e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f470730f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470731g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.e(6, this.f470732h);
            r45.dx0 dx0Var = this.f470733i;
            if (dx0Var != null) {
                fVar.i(7, dx0Var.mo75928xcd1e8d8());
                this.f470733i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f470734m);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470735n;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f470736o;
            if (gVar3 != null) {
                fVar.b(10, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f470728d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            r45.kv0 kv0Var2 = this.f470729e;
            if (kv0Var2 != null) {
                i18 += b36.f.i(3, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f470730f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f470731g;
            if (gVar4 != null) {
                i18 += b36.f.b(5, gVar4);
            }
            int e17 = i18 + b36.f.e(6, this.f470732h);
            r45.dx0 dx0Var2 = this.f470733i;
            if (dx0Var2 != null) {
                e17 += b36.f.i(7, dx0Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(8, this.f470734m);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f470735n;
            if (gVar5 != null) {
                e18 += b36.f.b(9, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f470736o;
            return gVar6 != null ? e18 + b36.f.b(10, gVar6) : e18;
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
        r45.wi2 wi2Var = (r45.wi2) objArr[1];
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
                    wi2Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                wi2Var.f470728d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    wi2Var.f470729e = kv0Var3;
                }
                return 0;
            case 4:
                wi2Var.f470730f = aVar2.k(intValue);
                return 0;
            case 5:
                wi2Var.f470731g = aVar2.d(intValue);
                return 0;
            case 6:
                wi2Var.f470732h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.dx0 dx0Var3 = new r45.dx0();
                    if (bArr3 != null && bArr3.length > 0) {
                        dx0Var3.mo11468x92b714fd(bArr3);
                    }
                    wi2Var.f470733i = dx0Var3;
                }
                return 0;
            case 8:
                wi2Var.f470734m = aVar2.g(intValue);
                return 0;
            case 9:
                wi2Var.f470735n = aVar2.d(intValue);
                return 0;
            case 10:
                wi2Var.f470736o = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
