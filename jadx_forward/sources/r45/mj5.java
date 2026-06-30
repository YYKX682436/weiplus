package r45;

/* loaded from: classes9.dex */
public class mj5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ia0 f462116d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f462117e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f462118f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f462119g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f462120h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f462121i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f462122m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f462123n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f462124o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f462125p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mj5)) {
            return false;
        }
        r45.mj5 mj5Var = (r45.mj5) fVar;
        return n51.f.a(this.f462116d, mj5Var.f462116d) && n51.f.a(java.lang.Boolean.valueOf(this.f462117e), java.lang.Boolean.valueOf(mj5Var.f462117e)) && n51.f.a(java.lang.Boolean.valueOf(this.f462118f), java.lang.Boolean.valueOf(mj5Var.f462118f)) && n51.f.a(java.lang.Boolean.valueOf(this.f462119g), java.lang.Boolean.valueOf(mj5Var.f462119g)) && n51.f.a(java.lang.Boolean.valueOf(this.f462120h), java.lang.Boolean.valueOf(mj5Var.f462120h)) && n51.f.a(java.lang.Boolean.valueOf(this.f462121i), java.lang.Boolean.valueOf(mj5Var.f462121i)) && n51.f.a(java.lang.Boolean.valueOf(this.f462122m), java.lang.Boolean.valueOf(mj5Var.f462122m)) && n51.f.a(java.lang.Boolean.valueOf(this.f462123n), java.lang.Boolean.valueOf(mj5Var.f462123n)) && n51.f.a(java.lang.Boolean.valueOf(this.f462124o), java.lang.Boolean.valueOf(mj5Var.f462124o)) && n51.f.a(java.lang.Boolean.valueOf(this.f462125p), java.lang.Boolean.valueOf(mj5Var.f462125p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ia0 ia0Var = this.f462116d;
            if (ia0Var != null) {
                fVar.i(1, ia0Var.mo75928xcd1e8d8());
                this.f462116d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(2, this.f462117e);
            fVar.a(3, this.f462118f);
            fVar.a(4, this.f462119g);
            fVar.a(5, this.f462120h);
            fVar.a(6, this.f462121i);
            fVar.a(7, this.f462122m);
            fVar.a(8, this.f462123n);
            fVar.a(9, this.f462124o);
            fVar.a(10, this.f462125p);
            return 0;
        }
        if (i17 == 1) {
            r45.ia0 ia0Var2 = this.f462116d;
            return (ia0Var2 != null ? 0 + b36.f.i(1, ia0Var2.mo75928xcd1e8d8()) : 0) + b36.f.a(2, this.f462117e) + b36.f.a(3, this.f462118f) + b36.f.a(4, this.f462119g) + b36.f.a(5, this.f462120h) + b36.f.a(6, this.f462121i) + b36.f.a(7, this.f462122m) + b36.f.a(8, this.f462123n) + b36.f.a(9, this.f462124o) + b36.f.a(10, this.f462125p);
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
        r45.mj5 mj5Var = (r45.mj5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ia0 ia0Var3 = new r45.ia0();
                    if (bArr != null && bArr.length > 0) {
                        ia0Var3.mo11468x92b714fd(bArr);
                    }
                    mj5Var.f462116d = ia0Var3;
                }
                return 0;
            case 2:
                mj5Var.f462117e = aVar2.c(intValue);
                return 0;
            case 3:
                mj5Var.f462118f = aVar2.c(intValue);
                return 0;
            case 4:
                mj5Var.f462119g = aVar2.c(intValue);
                return 0;
            case 5:
                mj5Var.f462120h = aVar2.c(intValue);
                return 0;
            case 6:
                mj5Var.f462121i = aVar2.c(intValue);
                return 0;
            case 7:
                mj5Var.f462122m = aVar2.c(intValue);
                return 0;
            case 8:
                mj5Var.f462123n = aVar2.c(intValue);
                return 0;
            case 9:
                mj5Var.f462124o = aVar2.c(intValue);
                return 0;
            case 10:
                mj5Var.f462125p = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
