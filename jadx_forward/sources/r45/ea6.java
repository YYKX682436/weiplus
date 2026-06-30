package r45;

/* loaded from: classes4.dex */
public class ea6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f454728d;

    /* renamed from: e, reason: collision with root package name */
    public float f454729e;

    /* renamed from: f, reason: collision with root package name */
    public float f454730f;

    /* renamed from: g, reason: collision with root package name */
    public float f454731g;

    /* renamed from: h, reason: collision with root package name */
    public int f454732h;

    /* renamed from: i, reason: collision with root package name */
    public long f454733i;

    /* renamed from: m, reason: collision with root package name */
    public long f454734m;

    /* renamed from: n, reason: collision with root package name */
    public float f454735n;

    /* renamed from: o, reason: collision with root package name */
    public int f454736o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ea6)) {
            return false;
        }
        r45.ea6 ea6Var = (r45.ea6) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f454728d), java.lang.Float.valueOf(ea6Var.f454728d)) && n51.f.a(java.lang.Float.valueOf(this.f454729e), java.lang.Float.valueOf(ea6Var.f454729e)) && n51.f.a(java.lang.Float.valueOf(this.f454730f), java.lang.Float.valueOf(ea6Var.f454730f)) && n51.f.a(java.lang.Float.valueOf(this.f454731g), java.lang.Float.valueOf(ea6Var.f454731g)) && n51.f.a(java.lang.Integer.valueOf(this.f454732h), java.lang.Integer.valueOf(ea6Var.f454732h)) && n51.f.a(java.lang.Long.valueOf(this.f454733i), java.lang.Long.valueOf(ea6Var.f454733i)) && n51.f.a(java.lang.Long.valueOf(this.f454734m), java.lang.Long.valueOf(ea6Var.f454734m)) && n51.f.a(java.lang.Float.valueOf(this.f454735n), java.lang.Float.valueOf(ea6Var.f454735n)) && n51.f.a(java.lang.Integer.valueOf(this.f454736o), java.lang.Integer.valueOf(ea6Var.f454736o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f454728d);
            fVar.d(2, this.f454729e);
            fVar.d(3, this.f454730f);
            fVar.d(4, this.f454731g);
            fVar.e(5, this.f454732h);
            fVar.h(6, this.f454733i);
            fVar.h(7, this.f454734m);
            fVar.d(8, this.f454735n);
            fVar.e(9, this.f454736o);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f454728d) + 0 + b36.f.d(2, this.f454729e) + b36.f.d(3, this.f454730f) + b36.f.d(4, this.f454731g) + b36.f.e(5, this.f454732h) + b36.f.h(6, this.f454733i) + b36.f.h(7, this.f454734m) + b36.f.d(8, this.f454735n) + b36.f.e(9, this.f454736o);
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
        r45.ea6 ea6Var = (r45.ea6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ea6Var.f454728d = aVar2.f(intValue);
                return 0;
            case 2:
                ea6Var.f454729e = aVar2.f(intValue);
                return 0;
            case 3:
                ea6Var.f454730f = aVar2.f(intValue);
                return 0;
            case 4:
                ea6Var.f454731g = aVar2.f(intValue);
                return 0;
            case 5:
                ea6Var.f454732h = aVar2.g(intValue);
                return 0;
            case 6:
                ea6Var.f454733i = aVar2.i(intValue);
                return 0;
            case 7:
                ea6Var.f454734m = aVar2.i(intValue);
                return 0;
            case 8:
                ea6Var.f454735n = aVar2.f(intValue);
                return 0;
            case 9:
                ea6Var.f454736o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
