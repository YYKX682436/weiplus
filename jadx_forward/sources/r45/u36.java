package r45;

/* loaded from: classes9.dex */
public class u36 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f468524d;

    /* renamed from: e, reason: collision with root package name */
    public float f468525e;

    /* renamed from: f, reason: collision with root package name */
    public float f468526f;

    /* renamed from: g, reason: collision with root package name */
    public int f468527g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468528h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468529i;

    /* renamed from: m, reason: collision with root package name */
    public int f468530m;

    /* renamed from: n, reason: collision with root package name */
    public int f468531n;

    /* renamed from: o, reason: collision with root package name */
    public int f468532o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f468533p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f468534q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u36)) {
            return false;
        }
        r45.u36 u36Var = (r45.u36) fVar;
        return n51.f.a(this.f76494x2de60e5e, u36Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f468524d), java.lang.Integer.valueOf(u36Var.f468524d)) && n51.f.a(java.lang.Float.valueOf(this.f468525e), java.lang.Float.valueOf(u36Var.f468525e)) && n51.f.a(java.lang.Float.valueOf(this.f468526f), java.lang.Float.valueOf(u36Var.f468526f)) && n51.f.a(java.lang.Integer.valueOf(this.f468527g), java.lang.Integer.valueOf(u36Var.f468527g)) && n51.f.a(this.f468528h, u36Var.f468528h) && n51.f.a(this.f468529i, u36Var.f468529i) && n51.f.a(java.lang.Integer.valueOf(this.f468530m), java.lang.Integer.valueOf(u36Var.f468530m)) && n51.f.a(java.lang.Integer.valueOf(this.f468531n), java.lang.Integer.valueOf(u36Var.f468531n)) && n51.f.a(java.lang.Integer.valueOf(this.f468532o), java.lang.Integer.valueOf(u36Var.f468532o)) && n51.f.a(this.f468533p, u36Var.f468533p) && n51.f.a(this.f468534q, u36Var.f468534q);
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
            fVar.e(2, this.f468524d);
            fVar.d(3, this.f468525e);
            fVar.d(4, this.f468526f);
            fVar.e(5, this.f468527g);
            java.lang.String str = this.f468528h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f468529i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f468530m);
            fVar.e(9, this.f468531n);
            fVar.e(10, this.f468532o);
            r45.cu5 cu5Var = this.f468533p;
            if (cu5Var != null) {
                fVar.i(11, cu5Var.mo75928xcd1e8d8());
                this.f468533p.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f468534q;
            if (cu5Var2 != null) {
                fVar.i(12, cu5Var2.mo75928xcd1e8d8());
                this.f468534q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f468524d) + b36.f.d(3, this.f468525e) + b36.f.d(4, this.f468526f) + b36.f.e(5, this.f468527g);
            java.lang.String str3 = this.f468528h;
            if (str3 != null) {
                i18 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f468529i;
            if (str4 != null) {
                i18 += b36.f.j(7, str4);
            }
            int e17 = i18 + b36.f.e(8, this.f468530m) + b36.f.e(9, this.f468531n) + b36.f.e(10, this.f468532o);
            r45.cu5 cu5Var3 = this.f468533p;
            if (cu5Var3 != null) {
                e17 += b36.f.i(11, cu5Var3.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var4 = this.f468534q;
            return cu5Var4 != null ? e17 + b36.f.i(12, cu5Var4.mo75928xcd1e8d8()) : e17;
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
        r45.u36 u36Var = (r45.u36) objArr[1];
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
                    u36Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                u36Var.f468524d = aVar2.g(intValue);
                return 0;
            case 3:
                u36Var.f468525e = aVar2.f(intValue);
                return 0;
            case 4:
                u36Var.f468526f = aVar2.f(intValue);
                return 0;
            case 5:
                u36Var.f468527g = aVar2.g(intValue);
                return 0;
            case 6:
                u36Var.f468528h = aVar2.k(intValue);
                return 0;
            case 7:
                u36Var.f468529i = aVar2.k(intValue);
                return 0;
            case 8:
                u36Var.f468530m = aVar2.g(intValue);
                return 0;
            case 9:
                u36Var.f468531n = aVar2.g(intValue);
                return 0;
            case 10:
                u36Var.f468532o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    u36Var.f468533p = cu5Var5;
                }
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    u36Var.f468534q = cu5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
