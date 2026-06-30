package r45;

/* loaded from: classes7.dex */
public class bl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452362d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f452363e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f452364f;

    /* renamed from: g, reason: collision with root package name */
    public int f452365g;

    /* renamed from: h, reason: collision with root package name */
    public int f452366h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f452367i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f452368m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f452369n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f452370o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f452371p;

    /* renamed from: q, reason: collision with root package name */
    public int f452372q;

    /* renamed from: r, reason: collision with root package name */
    public float f452373r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bl)) {
            return false;
        }
        r45.bl blVar = (r45.bl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452362d), java.lang.Integer.valueOf(blVar.f452362d)) && n51.f.a(java.lang.Boolean.valueOf(this.f452363e), java.lang.Boolean.valueOf(blVar.f452363e)) && n51.f.a(java.lang.Boolean.valueOf(this.f452364f), java.lang.Boolean.valueOf(blVar.f452364f)) && n51.f.a(java.lang.Integer.valueOf(this.f452365g), java.lang.Integer.valueOf(blVar.f452365g)) && n51.f.a(java.lang.Integer.valueOf(this.f452366h), java.lang.Integer.valueOf(blVar.f452366h)) && n51.f.a(java.lang.Boolean.valueOf(this.f452367i), java.lang.Boolean.valueOf(blVar.f452367i)) && n51.f.a(java.lang.Boolean.valueOf(this.f452368m), java.lang.Boolean.valueOf(blVar.f452368m)) && n51.f.a(java.lang.Boolean.valueOf(this.f452369n), java.lang.Boolean.valueOf(blVar.f452369n)) && n51.f.a(this.f452370o, blVar.f452370o) && n51.f.a(java.lang.Boolean.valueOf(this.f452371p), java.lang.Boolean.valueOf(blVar.f452371p)) && n51.f.a(java.lang.Integer.valueOf(this.f452372q), java.lang.Integer.valueOf(blVar.f452372q)) && n51.f.a(java.lang.Float.valueOf(this.f452373r), java.lang.Float.valueOf(blVar.f452373r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452362d);
            fVar.a(2, this.f452363e);
            fVar.a(3, this.f452364f);
            fVar.e(4, this.f452365g);
            fVar.e(5, this.f452366h);
            fVar.a(6, this.f452367i);
            fVar.a(7, this.f452368m);
            fVar.a(8, this.f452369n);
            java.lang.String str = this.f452370o;
            if (str != null) {
                fVar.j(9, str);
            }
            fVar.a(10, this.f452371p);
            fVar.e(11, this.f452372q);
            fVar.d(12, this.f452373r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452362d) + 0 + b36.f.a(2, this.f452363e) + b36.f.a(3, this.f452364f) + b36.f.e(4, this.f452365g) + b36.f.e(5, this.f452366h) + b36.f.a(6, this.f452367i) + b36.f.a(7, this.f452368m) + b36.f.a(8, this.f452369n);
            java.lang.String str2 = this.f452370o;
            if (str2 != null) {
                e17 += b36.f.j(9, str2);
            }
            return e17 + b36.f.a(10, this.f452371p) + b36.f.e(11, this.f452372q) + b36.f.d(12, this.f452373r);
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
        r45.bl blVar = (r45.bl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                blVar.f452362d = aVar2.g(intValue);
                return 0;
            case 2:
                blVar.f452363e = aVar2.c(intValue);
                return 0;
            case 3:
                blVar.f452364f = aVar2.c(intValue);
                return 0;
            case 4:
                blVar.f452365g = aVar2.g(intValue);
                return 0;
            case 5:
                blVar.f452366h = aVar2.g(intValue);
                return 0;
            case 6:
                blVar.f452367i = aVar2.c(intValue);
                return 0;
            case 7:
                blVar.f452368m = aVar2.c(intValue);
                return 0;
            case 8:
                blVar.f452369n = aVar2.c(intValue);
                return 0;
            case 9:
                blVar.f452370o = aVar2.k(intValue);
                return 0;
            case 10:
                blVar.f452371p = aVar2.c(intValue);
                return 0;
            case 11:
                blVar.f452372q = aVar2.g(intValue);
                return 0;
            case 12:
                blVar.f452373r = aVar2.f(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
