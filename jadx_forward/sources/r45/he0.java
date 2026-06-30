package r45;

/* loaded from: classes4.dex */
public class he0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457616d;

    /* renamed from: e, reason: collision with root package name */
    public int f457617e;

    /* renamed from: f, reason: collision with root package name */
    public int f457618f;

    /* renamed from: g, reason: collision with root package name */
    public int f457619g;

    /* renamed from: h, reason: collision with root package name */
    public int f457620h;

    /* renamed from: i, reason: collision with root package name */
    public int f457621i;

    /* renamed from: m, reason: collision with root package name */
    public int f457622m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.he0)) {
            return false;
        }
        r45.he0 he0Var = (r45.he0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457616d), java.lang.Integer.valueOf(he0Var.f457616d)) && n51.f.a(java.lang.Integer.valueOf(this.f457617e), java.lang.Integer.valueOf(he0Var.f457617e)) && n51.f.a(java.lang.Integer.valueOf(this.f457618f), java.lang.Integer.valueOf(he0Var.f457618f)) && n51.f.a(java.lang.Integer.valueOf(this.f457619g), java.lang.Integer.valueOf(he0Var.f457619g)) && n51.f.a(java.lang.Integer.valueOf(this.f457620h), java.lang.Integer.valueOf(he0Var.f457620h)) && n51.f.a(java.lang.Integer.valueOf(this.f457621i), java.lang.Integer.valueOf(he0Var.f457621i)) && n51.f.a(java.lang.Integer.valueOf(this.f457622m), java.lang.Integer.valueOf(he0Var.f457622m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457616d);
            fVar.e(2, this.f457617e);
            fVar.e(3, this.f457618f);
            fVar.e(4, this.f457619g);
            fVar.e(5, this.f457620h);
            fVar.e(6, this.f457621i);
            fVar.e(7, this.f457622m);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f457616d) + 0 + b36.f.e(2, this.f457617e) + b36.f.e(3, this.f457618f) + b36.f.e(4, this.f457619g) + b36.f.e(5, this.f457620h) + b36.f.e(6, this.f457621i) + b36.f.e(7, this.f457622m);
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
        r45.he0 he0Var = (r45.he0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                he0Var.f457616d = aVar2.g(intValue);
                return 0;
            case 2:
                he0Var.f457617e = aVar2.g(intValue);
                return 0;
            case 3:
                he0Var.f457618f = aVar2.g(intValue);
                return 0;
            case 4:
                he0Var.f457619g = aVar2.g(intValue);
                return 0;
            case 5:
                he0Var.f457620h = aVar2.g(intValue);
                return 0;
            case 6:
                he0Var.f457621i = aVar2.g(intValue);
                return 0;
            case 7:
                he0Var.f457622m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
