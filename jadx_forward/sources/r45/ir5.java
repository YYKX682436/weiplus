package r45;

/* loaded from: classes11.dex */
public class ir5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f458816d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458817e;

    /* renamed from: f, reason: collision with root package name */
    public int f458818f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f458819g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f458820h;

    /* renamed from: i, reason: collision with root package name */
    public int f458821i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458822m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f458823n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f458824o;

    /* renamed from: p, reason: collision with root package name */
    public r45.hg0 f458825p;

    /* renamed from: q, reason: collision with root package name */
    public r45.xc f458826q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f458827r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f458828s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ir5)) {
            return false;
        }
        r45.ir5 ir5Var = (r45.ir5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f458816d), java.lang.Long.valueOf(ir5Var.f458816d)) && n51.f.a(this.f458817e, ir5Var.f458817e) && n51.f.a(java.lang.Integer.valueOf(this.f458818f), java.lang.Integer.valueOf(ir5Var.f458818f)) && n51.f.a(java.lang.Boolean.valueOf(this.f458819g), java.lang.Boolean.valueOf(ir5Var.f458819g)) && n51.f.a(java.lang.Boolean.valueOf(this.f458820h), java.lang.Boolean.valueOf(ir5Var.f458820h)) && n51.f.a(java.lang.Integer.valueOf(this.f458821i), java.lang.Integer.valueOf(ir5Var.f458821i)) && n51.f.a(this.f458822m, ir5Var.f458822m) && n51.f.a(java.lang.Boolean.valueOf(this.f458823n), java.lang.Boolean.valueOf(ir5Var.f458823n)) && n51.f.a(java.lang.Boolean.valueOf(this.f458824o), java.lang.Boolean.valueOf(ir5Var.f458824o)) && n51.f.a(this.f458825p, ir5Var.f458825p) && n51.f.a(this.f458826q, ir5Var.f458826q) && n51.f.a(java.lang.Boolean.valueOf(this.f458827r), java.lang.Boolean.valueOf(ir5Var.f458827r)) && n51.f.a(java.lang.Boolean.valueOf(this.f458828s), java.lang.Boolean.valueOf(ir5Var.f458828s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f458816d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f458817e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f458818f);
            fVar.a(4, this.f458819g);
            fVar.a(5, this.f458820h);
            fVar.e(6, this.f458821i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f458822m;
            if (gVar2 != null) {
                fVar.b(7, gVar2);
            }
            fVar.a(8, this.f458823n);
            fVar.a(9, this.f458824o);
            r45.hg0 hg0Var = this.f458825p;
            if (hg0Var != null) {
                fVar.i(10, hg0Var.mo75928xcd1e8d8());
                this.f458825p.mo75956x3d5d1f78(fVar);
            }
            r45.xc xcVar = this.f458826q;
            if (xcVar != null) {
                fVar.i(11, xcVar.mo75928xcd1e8d8());
                this.f458826q.mo75956x3d5d1f78(fVar);
            }
            fVar.a(12, this.f458827r);
            fVar.a(13, this.f458828s);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f458816d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f458817e;
            if (gVar3 != null) {
                h17 += b36.f.b(2, gVar3);
            }
            int e17 = h17 + b36.f.e(3, this.f458818f) + b36.f.a(4, this.f458819g) + b36.f.a(5, this.f458820h) + b36.f.e(6, this.f458821i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f458822m;
            if (gVar4 != null) {
                e17 += b36.f.b(7, gVar4);
            }
            int a17 = e17 + b36.f.a(8, this.f458823n) + b36.f.a(9, this.f458824o);
            r45.hg0 hg0Var2 = this.f458825p;
            if (hg0Var2 != null) {
                a17 += b36.f.i(10, hg0Var2.mo75928xcd1e8d8());
            }
            r45.xc xcVar2 = this.f458826q;
            if (xcVar2 != null) {
                a17 += b36.f.i(11, xcVar2.mo75928xcd1e8d8());
            }
            return a17 + b36.f.a(12, this.f458827r) + b36.f.a(13, this.f458828s);
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
        r45.ir5 ir5Var = (r45.ir5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ir5Var.f458816d = aVar2.i(intValue);
                return 0;
            case 2:
                ir5Var.f458817e = aVar2.d(intValue);
                return 0;
            case 3:
                ir5Var.f458818f = aVar2.g(intValue);
                return 0;
            case 4:
                ir5Var.f458819g = aVar2.c(intValue);
                return 0;
            case 5:
                ir5Var.f458820h = aVar2.c(intValue);
                return 0;
            case 6:
                ir5Var.f458821i = aVar2.g(intValue);
                return 0;
            case 7:
                ir5Var.f458822m = aVar2.d(intValue);
                return 0;
            case 8:
                ir5Var.f458823n = aVar2.c(intValue);
                return 0;
            case 9:
                ir5Var.f458824o = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.hg0 hg0Var3 = new r45.hg0();
                    if (bArr != null && bArr.length > 0) {
                        hg0Var3.mo11468x92b714fd(bArr);
                    }
                    ir5Var.f458825p = hg0Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.xc xcVar3 = new r45.xc();
                    if (bArr2 != null && bArr2.length > 0) {
                        xcVar3.mo11468x92b714fd(bArr2);
                    }
                    ir5Var.f458826q = xcVar3;
                }
                return 0;
            case 12:
                ir5Var.f458827r = aVar2.c(intValue);
                return 0;
            case 13:
                ir5Var.f458828s = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
