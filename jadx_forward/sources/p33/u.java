package p33;

/* loaded from: classes8.dex */
public class u extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433179d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433180e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f433181f;

    /* renamed from: g, reason: collision with root package name */
    public int f433182g;

    /* renamed from: h, reason: collision with root package name */
    public int f433183h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f433184i;

    /* renamed from: m, reason: collision with root package name */
    public int f433185m;

    /* renamed from: n, reason: collision with root package name */
    public long f433186n;

    /* renamed from: o, reason: collision with root package name */
    public int f433187o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.u)) {
            return false;
        }
        p33.u uVar = (p33.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433179d), java.lang.Integer.valueOf(uVar.f433179d)) && n51.f.a(this.f433180e, uVar.f433180e) && n51.f.a(this.f433181f, uVar.f433181f) && n51.f.a(java.lang.Integer.valueOf(this.f433182g), java.lang.Integer.valueOf(uVar.f433182g)) && n51.f.a(java.lang.Integer.valueOf(this.f433183h), java.lang.Integer.valueOf(uVar.f433183h)) && n51.f.a(java.lang.Boolean.valueOf(this.f433184i), java.lang.Boolean.valueOf(uVar.f433184i)) && n51.f.a(java.lang.Integer.valueOf(this.f433185m), java.lang.Integer.valueOf(uVar.f433185m)) && n51.f.a(java.lang.Long.valueOf(this.f433186n), java.lang.Long.valueOf(uVar.f433186n)) && n51.f.a(java.lang.Integer.valueOf(this.f433187o), java.lang.Integer.valueOf(uVar.f433187o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433179d);
            java.lang.String str = this.f433180e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f433181f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f433182g);
            fVar.e(5, this.f433183h);
            fVar.a(6, this.f433184i);
            fVar.e(7, this.f433185m);
            fVar.h(8, this.f433186n);
            fVar.e(9, this.f433187o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f433179d) + 0;
            java.lang.String str3 = this.f433180e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f433181f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.e(4, this.f433182g) + b36.f.e(5, this.f433183h) + b36.f.a(6, this.f433184i) + b36.f.e(7, this.f433185m) + b36.f.h(8, this.f433186n) + b36.f.e(9, this.f433187o);
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
        p33.u uVar = (p33.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uVar.f433179d = aVar2.g(intValue);
                return 0;
            case 2:
                uVar.f433180e = aVar2.k(intValue);
                return 0;
            case 3:
                uVar.f433181f = aVar2.k(intValue);
                return 0;
            case 4:
                uVar.f433182g = aVar2.g(intValue);
                return 0;
            case 5:
                uVar.f433183h = aVar2.g(intValue);
                return 0;
            case 6:
                uVar.f433184i = aVar2.c(intValue);
                return 0;
            case 7:
                uVar.f433185m = aVar2.g(intValue);
                return 0;
            case 8:
                uVar.f433186n = aVar2.i(intValue);
                return 0;
            case 9:
                uVar.f433187o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
