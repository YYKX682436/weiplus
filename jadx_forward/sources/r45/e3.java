package r45;

/* loaded from: classes4.dex */
public class e3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454485d;

    /* renamed from: e, reason: collision with root package name */
    public int f454486e;

    /* renamed from: f, reason: collision with root package name */
    public float f454487f;

    /* renamed from: g, reason: collision with root package name */
    public float f454488g;

    /* renamed from: h, reason: collision with root package name */
    public float f454489h;

    /* renamed from: i, reason: collision with root package name */
    public long f454490i;

    /* renamed from: m, reason: collision with root package name */
    public long f454491m;

    /* renamed from: n, reason: collision with root package name */
    public long f454492n;

    /* renamed from: o, reason: collision with root package name */
    public long f454493o;

    /* renamed from: p, reason: collision with root package name */
    public long f454494p;

    /* renamed from: q, reason: collision with root package name */
    public long f454495q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e3)) {
            return false;
        }
        r45.e3 e3Var = (r45.e3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454485d), java.lang.Integer.valueOf(e3Var.f454485d)) && n51.f.a(java.lang.Integer.valueOf(this.f454486e), java.lang.Integer.valueOf(e3Var.f454486e)) && n51.f.a(java.lang.Float.valueOf(this.f454487f), java.lang.Float.valueOf(e3Var.f454487f)) && n51.f.a(java.lang.Float.valueOf(this.f454488g), java.lang.Float.valueOf(e3Var.f454488g)) && n51.f.a(java.lang.Float.valueOf(this.f454489h), java.lang.Float.valueOf(e3Var.f454489h)) && n51.f.a(java.lang.Long.valueOf(this.f454490i), java.lang.Long.valueOf(e3Var.f454490i)) && n51.f.a(java.lang.Long.valueOf(this.f454491m), java.lang.Long.valueOf(e3Var.f454491m)) && n51.f.a(java.lang.Long.valueOf(this.f454492n), java.lang.Long.valueOf(e3Var.f454492n)) && n51.f.a(java.lang.Long.valueOf(this.f454493o), java.lang.Long.valueOf(e3Var.f454493o)) && n51.f.a(java.lang.Long.valueOf(this.f454494p), java.lang.Long.valueOf(e3Var.f454494p)) && n51.f.a(java.lang.Long.valueOf(this.f454495q), java.lang.Long.valueOf(e3Var.f454495q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454485d);
            fVar.e(2, this.f454486e);
            fVar.d(3, this.f454487f);
            fVar.d(4, this.f454488g);
            fVar.d(5, this.f454489h);
            fVar.h(6, this.f454490i);
            fVar.h(7, this.f454491m);
            fVar.h(8, this.f454492n);
            fVar.h(9, this.f454493o);
            fVar.h(10, this.f454494p);
            fVar.h(11, this.f454495q);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f454485d) + 0 + b36.f.e(2, this.f454486e) + b36.f.d(3, this.f454487f) + b36.f.d(4, this.f454488g) + b36.f.d(5, this.f454489h) + b36.f.h(6, this.f454490i) + b36.f.h(7, this.f454491m) + b36.f.h(8, this.f454492n) + b36.f.h(9, this.f454493o) + b36.f.h(10, this.f454494p) + b36.f.h(11, this.f454495q);
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
        r45.e3 e3Var = (r45.e3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e3Var.f454485d = aVar2.g(intValue);
                return 0;
            case 2:
                e3Var.f454486e = aVar2.g(intValue);
                return 0;
            case 3:
                e3Var.f454487f = aVar2.f(intValue);
                return 0;
            case 4:
                e3Var.f454488g = aVar2.f(intValue);
                return 0;
            case 5:
                e3Var.f454489h = aVar2.f(intValue);
                return 0;
            case 6:
                e3Var.f454490i = aVar2.i(intValue);
                return 0;
            case 7:
                e3Var.f454491m = aVar2.i(intValue);
                return 0;
            case 8:
                e3Var.f454492n = aVar2.i(intValue);
                return 0;
            case 9:
                e3Var.f454493o = aVar2.i(intValue);
                return 0;
            case 10:
                e3Var.f454494p = aVar2.i(intValue);
                return 0;
            case 11:
                e3Var.f454495q = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
