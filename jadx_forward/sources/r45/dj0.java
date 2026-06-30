package r45;

/* loaded from: classes4.dex */
public class dj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454056d;

    /* renamed from: e, reason: collision with root package name */
    public int f454057e;

    /* renamed from: f, reason: collision with root package name */
    public int f454058f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454059g;

    /* renamed from: h, reason: collision with root package name */
    public int f454060h;

    /* renamed from: i, reason: collision with root package name */
    public long f454061i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dj0)) {
            return false;
        }
        r45.dj0 dj0Var = (r45.dj0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454056d), java.lang.Integer.valueOf(dj0Var.f454056d)) && n51.f.a(java.lang.Integer.valueOf(this.f454057e), java.lang.Integer.valueOf(dj0Var.f454057e)) && n51.f.a(java.lang.Integer.valueOf(this.f454058f), java.lang.Integer.valueOf(dj0Var.f454058f)) && n51.f.a(this.f454059g, dj0Var.f454059g) && n51.f.a(java.lang.Integer.valueOf(this.f454060h), java.lang.Integer.valueOf(dj0Var.f454060h)) && n51.f.a(java.lang.Long.valueOf(this.f454061i), java.lang.Long.valueOf(dj0Var.f454061i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454056d);
            fVar.e(2, this.f454057e);
            fVar.e(3, this.f454058f);
            java.lang.String str = this.f454059g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f454060h);
            fVar.h(6, this.f454061i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454056d) + 0 + b36.f.e(2, this.f454057e) + b36.f.e(3, this.f454058f);
            java.lang.String str2 = this.f454059g;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            return e17 + b36.f.e(5, this.f454060h) + b36.f.h(6, this.f454061i);
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
        r45.dj0 dj0Var = (r45.dj0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dj0Var.f454056d = aVar2.g(intValue);
                return 0;
            case 2:
                dj0Var.f454057e = aVar2.g(intValue);
                return 0;
            case 3:
                dj0Var.f454058f = aVar2.g(intValue);
                return 0;
            case 4:
                dj0Var.f454059g = aVar2.k(intValue);
                return 0;
            case 5:
                dj0Var.f454060h = aVar2.g(intValue);
                return 0;
            case 6:
                dj0Var.f454061i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
