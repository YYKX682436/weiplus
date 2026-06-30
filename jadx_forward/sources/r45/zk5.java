package r45;

/* loaded from: classes9.dex */
public class zk5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f473709d;

    /* renamed from: e, reason: collision with root package name */
    public int f473710e;

    /* renamed from: f, reason: collision with root package name */
    public int f473711f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f473712g;

    /* renamed from: h, reason: collision with root package name */
    public int f473713h;

    /* renamed from: i, reason: collision with root package name */
    public r45.x25 f473714i;

    /* renamed from: m, reason: collision with root package name */
    public int f473715m;

    /* renamed from: n, reason: collision with root package name */
    public int f473716n;

    /* renamed from: o, reason: collision with root package name */
    public int f473717o;

    /* renamed from: p, reason: collision with root package name */
    public int f473718p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zk5)) {
            return false;
        }
        r45.zk5 zk5Var = (r45.zk5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473709d), java.lang.Integer.valueOf(zk5Var.f473709d)) && n51.f.a(java.lang.Integer.valueOf(this.f473710e), java.lang.Integer.valueOf(zk5Var.f473710e)) && n51.f.a(java.lang.Integer.valueOf(this.f473711f), java.lang.Integer.valueOf(zk5Var.f473711f)) && n51.f.a(java.lang.Boolean.valueOf(this.f473712g), java.lang.Boolean.valueOf(zk5Var.f473712g)) && n51.f.a(java.lang.Integer.valueOf(this.f473713h), java.lang.Integer.valueOf(zk5Var.f473713h)) && n51.f.a(this.f473714i, zk5Var.f473714i) && n51.f.a(java.lang.Integer.valueOf(this.f473715m), java.lang.Integer.valueOf(zk5Var.f473715m)) && n51.f.a(java.lang.Integer.valueOf(this.f473716n), java.lang.Integer.valueOf(zk5Var.f473716n)) && n51.f.a(java.lang.Integer.valueOf(this.f473717o), java.lang.Integer.valueOf(zk5Var.f473717o)) && n51.f.a(java.lang.Integer.valueOf(this.f473718p), java.lang.Integer.valueOf(zk5Var.f473718p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473709d);
            fVar.e(2, this.f473710e);
            fVar.e(3, this.f473711f);
            fVar.a(4, this.f473712g);
            fVar.e(5, this.f473713h);
            r45.x25 x25Var = this.f473714i;
            if (x25Var != null) {
                fVar.i(6, x25Var.mo75928xcd1e8d8());
                this.f473714i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f473715m);
            fVar.e(8, this.f473716n);
            fVar.e(9, this.f473717o);
            fVar.e(10, this.f473718p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f473709d) + 0 + b36.f.e(2, this.f473710e) + b36.f.e(3, this.f473711f) + b36.f.a(4, this.f473712g) + b36.f.e(5, this.f473713h);
            r45.x25 x25Var2 = this.f473714i;
            if (x25Var2 != null) {
                e17 += b36.f.i(6, x25Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(7, this.f473715m) + b36.f.e(8, this.f473716n) + b36.f.e(9, this.f473717o) + b36.f.e(10, this.f473718p);
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
        r45.zk5 zk5Var = (r45.zk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zk5Var.f473709d = aVar2.g(intValue);
                return 0;
            case 2:
                zk5Var.f473710e = aVar2.g(intValue);
                return 0;
            case 3:
                zk5Var.f473711f = aVar2.g(intValue);
                return 0;
            case 4:
                zk5Var.f473712g = aVar2.c(intValue);
                return 0;
            case 5:
                zk5Var.f473713h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.x25 x25Var3 = new r45.x25();
                    if (bArr != null && bArr.length > 0) {
                        x25Var3.mo11468x92b714fd(bArr);
                    }
                    zk5Var.f473714i = x25Var3;
                }
                return 0;
            case 7:
                zk5Var.f473715m = aVar2.g(intValue);
                return 0;
            case 8:
                zk5Var.f473716n = aVar2.g(intValue);
                return 0;
            case 9:
                zk5Var.f473717o = aVar2.g(intValue);
                return 0;
            case 10:
                zk5Var.f473718p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
