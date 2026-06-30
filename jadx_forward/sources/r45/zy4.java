package r45;

/* loaded from: classes8.dex */
public class zy4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f473997d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473998e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473999f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f474000g;

    /* renamed from: h, reason: collision with root package name */
    public int f474001h;

    /* renamed from: i, reason: collision with root package name */
    public int f474002i;

    /* renamed from: m, reason: collision with root package name */
    public int f474003m;

    /* renamed from: n, reason: collision with root package name */
    public int f474004n;

    /* renamed from: o, reason: collision with root package name */
    public int f474005o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f474006p;

    /* renamed from: q, reason: collision with root package name */
    public int f474007q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f474008r;

    static {
        new r45.zy4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.zy4 mo11468x92b714fd(byte[] bArr) {
        return (r45.zy4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zy4)) {
            return false;
        }
        r45.zy4 zy4Var = (r45.zy4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473997d), java.lang.Integer.valueOf(zy4Var.f473997d)) && n51.f.a(this.f473998e, zy4Var.f473998e) && n51.f.a(this.f473999f, zy4Var.f473999f) && n51.f.a(this.f474000g, zy4Var.f474000g) && n51.f.a(java.lang.Integer.valueOf(this.f474001h), java.lang.Integer.valueOf(zy4Var.f474001h)) && n51.f.a(java.lang.Integer.valueOf(this.f474002i), java.lang.Integer.valueOf(zy4Var.f474002i)) && n51.f.a(java.lang.Integer.valueOf(this.f474003m), java.lang.Integer.valueOf(zy4Var.f474003m)) && n51.f.a(java.lang.Integer.valueOf(this.f474004n), java.lang.Integer.valueOf(zy4Var.f474004n)) && n51.f.a(java.lang.Integer.valueOf(this.f474005o), java.lang.Integer.valueOf(zy4Var.f474005o)) && n51.f.a(this.f474006p, zy4Var.f474006p) && n51.f.a(java.lang.Integer.valueOf(this.f474007q), java.lang.Integer.valueOf(zy4Var.f474007q)) && n51.f.a(this.f474008r, zy4Var.f474008r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.zy4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473997d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f473998e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f473999f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.cu5 cu5Var = this.f474000g;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f474000g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f474001h);
            fVar.e(6, this.f474002i);
            fVar.e(7, this.f474003m);
            fVar.e(8, this.f474004n);
            fVar.e(9, this.f474005o);
            java.lang.String str2 = this.f474006p;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.e(11, this.f474007q);
            java.lang.String str3 = this.f474008r;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f473997d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f473998e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            java.lang.String str4 = this.f473999f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            r45.cu5 cu5Var2 = this.f474000g;
            if (cu5Var2 != null) {
                e17 += b36.f.i(4, cu5Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(5, this.f474001h) + b36.f.e(6, this.f474002i) + b36.f.e(7, this.f474003m) + b36.f.e(8, this.f474004n) + b36.f.e(9, this.f474005o);
            java.lang.String str5 = this.f474006p;
            if (str5 != null) {
                e18 += b36.f.j(10, str5);
            }
            int e19 = e18 + b36.f.e(11, this.f474007q);
            java.lang.String str6 = this.f474008r;
            return str6 != null ? e19 + b36.f.j(12, str6) : e19;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f473997d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f473998e = aVar2.d(intValue);
                return 0;
            case 3:
                this.f473999f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    this.f474000g = cu5Var3;
                }
                return 0;
            case 5:
                this.f474001h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f474002i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f474003m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f474004n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f474005o = aVar2.g(intValue);
                return 0;
            case 10:
                this.f474006p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f474007q = aVar2.g(intValue);
                return 0;
            case 12:
                this.f474008r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
