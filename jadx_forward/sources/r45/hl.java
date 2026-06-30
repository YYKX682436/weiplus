package r45;

/* loaded from: classes11.dex */
public class hl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f457784d;

    /* renamed from: e, reason: collision with root package name */
    public int f457785e;

    /* renamed from: f, reason: collision with root package name */
    public int f457786f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f457787g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f457788h;

    /* renamed from: i, reason: collision with root package name */
    public int f457789i;

    /* renamed from: m, reason: collision with root package name */
    public int f457790m;

    /* renamed from: n, reason: collision with root package name */
    public int f457791n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hl)) {
            return false;
        }
        r45.hl hlVar = (r45.hl) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f457784d), java.lang.Boolean.valueOf(hlVar.f457784d)) && n51.f.a(java.lang.Integer.valueOf(this.f457785e), java.lang.Integer.valueOf(hlVar.f457785e)) && n51.f.a(java.lang.Integer.valueOf(this.f457786f), java.lang.Integer.valueOf(hlVar.f457786f)) && n51.f.a(java.lang.Boolean.valueOf(this.f457787g), java.lang.Boolean.valueOf(hlVar.f457787g)) && n51.f.a(java.lang.Boolean.valueOf(this.f457788h), java.lang.Boolean.valueOf(hlVar.f457788h)) && n51.f.a(java.lang.Integer.valueOf(this.f457789i), java.lang.Integer.valueOf(hlVar.f457789i)) && n51.f.a(java.lang.Integer.valueOf(this.f457790m), java.lang.Integer.valueOf(hlVar.f457790m)) && n51.f.a(java.lang.Integer.valueOf(this.f457791n), java.lang.Integer.valueOf(hlVar.f457791n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f457784d);
            fVar.e(2, this.f457785e);
            fVar.e(3, this.f457786f);
            fVar.a(4, this.f457787g);
            fVar.a(5, this.f457788h);
            fVar.e(6, this.f457789i);
            fVar.e(7, this.f457790m);
            fVar.e(8, this.f457791n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f457784d) + 0 + b36.f.e(2, this.f457785e) + b36.f.e(3, this.f457786f) + b36.f.a(4, this.f457787g) + b36.f.a(5, this.f457788h) + b36.f.e(6, this.f457789i) + b36.f.e(7, this.f457790m) + b36.f.e(8, this.f457791n);
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
        r45.hl hlVar = (r45.hl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hlVar.f457784d = aVar2.c(intValue);
                return 0;
            case 2:
                hlVar.f457785e = aVar2.g(intValue);
                return 0;
            case 3:
                hlVar.f457786f = aVar2.g(intValue);
                return 0;
            case 4:
                hlVar.f457787g = aVar2.c(intValue);
                return 0;
            case 5:
                hlVar.f457788h = aVar2.c(intValue);
                return 0;
            case 6:
                hlVar.f457789i = aVar2.g(intValue);
                return 0;
            case 7:
                hlVar.f457790m = aVar2.g(intValue);
                return 0;
            case 8:
                hlVar.f457791n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
