package r45;

/* loaded from: classes4.dex */
public class sf3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f467196d;

    /* renamed from: e, reason: collision with root package name */
    public long f467197e;

    /* renamed from: f, reason: collision with root package name */
    public int f467198f;

    /* renamed from: g, reason: collision with root package name */
    public int f467199g;

    /* renamed from: h, reason: collision with root package name */
    public int f467200h;

    /* renamed from: i, reason: collision with root package name */
    public long f467201i;

    /* renamed from: m, reason: collision with root package name */
    public long f467202m;

    /* renamed from: n, reason: collision with root package name */
    public long f467203n;

    /* renamed from: o, reason: collision with root package name */
    public int f467204o;

    /* renamed from: p, reason: collision with root package name */
    public r45.fp0 f467205p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sf3)) {
            return false;
        }
        r45.sf3 sf3Var = (r45.sf3) fVar;
        return n51.f.a(this.f76492x92037252, sf3Var.f76492x92037252) && n51.f.a(java.lang.Long.valueOf(this.f467196d), java.lang.Long.valueOf(sf3Var.f467196d)) && n51.f.a(java.lang.Long.valueOf(this.f467197e), java.lang.Long.valueOf(sf3Var.f467197e)) && n51.f.a(java.lang.Integer.valueOf(this.f467198f), java.lang.Integer.valueOf(sf3Var.f467198f)) && n51.f.a(java.lang.Integer.valueOf(this.f467199g), java.lang.Integer.valueOf(sf3Var.f467199g)) && n51.f.a(java.lang.Integer.valueOf(this.f467200h), java.lang.Integer.valueOf(sf3Var.f467200h)) && n51.f.a(java.lang.Long.valueOf(this.f467201i), java.lang.Long.valueOf(sf3Var.f467201i)) && n51.f.a(java.lang.Long.valueOf(this.f467202m), java.lang.Long.valueOf(sf3Var.f467202m)) && n51.f.a(java.lang.Long.valueOf(this.f467203n), java.lang.Long.valueOf(sf3Var.f467203n)) && n51.f.a(java.lang.Integer.valueOf(this.f467204o), java.lang.Integer.valueOf(sf3Var.f467204o)) && n51.f.a(this.f467205p, sf3Var.f467205p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f467196d);
            fVar.h(3, this.f467197e);
            fVar.e(4, this.f467198f);
            fVar.e(5, this.f467199g);
            fVar.e(6, this.f467200h);
            fVar.h(7, this.f467201i);
            fVar.h(8, this.f467202m);
            fVar.h(9, this.f467203n);
            fVar.e(10, this.f467204o);
            r45.fp0 fp0Var = this.f467205p;
            if (fp0Var != null) {
                fVar.i(11, fp0Var.mo75928xcd1e8d8());
                this.f467205p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f467196d) + b36.f.h(3, this.f467197e) + b36.f.e(4, this.f467198f) + b36.f.e(5, this.f467199g) + b36.f.e(6, this.f467200h) + b36.f.h(7, this.f467201i) + b36.f.h(8, this.f467202m) + b36.f.h(9, this.f467203n) + b36.f.e(10, this.f467204o);
            r45.fp0 fp0Var2 = this.f467205p;
            return fp0Var2 != null ? i18 + b36.f.i(11, fp0Var2.mo75928xcd1e8d8()) : i18;
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
        r45.sf3 sf3Var = (r45.sf3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    sf3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                sf3Var.f467196d = aVar2.i(intValue);
                return 0;
            case 3:
                sf3Var.f467197e = aVar2.i(intValue);
                return 0;
            case 4:
                sf3Var.f467198f = aVar2.g(intValue);
                return 0;
            case 5:
                sf3Var.f467199g = aVar2.g(intValue);
                return 0;
            case 6:
                sf3Var.f467200h = aVar2.g(intValue);
                return 0;
            case 7:
                sf3Var.f467201i = aVar2.i(intValue);
                return 0;
            case 8:
                sf3Var.f467202m = aVar2.i(intValue);
                return 0;
            case 9:
                sf3Var.f467203n = aVar2.i(intValue);
                return 0;
            case 10:
                sf3Var.f467204o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.fp0 fp0Var3 = new r45.fp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        fp0Var3.mo11468x92b714fd(bArr2);
                    }
                    sf3Var.f467205p = fp0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
