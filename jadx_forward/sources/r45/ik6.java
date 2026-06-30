package r45;

/* loaded from: classes4.dex */
public class ik6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f458649d;

    /* renamed from: e, reason: collision with root package name */
    public long f458650e;

    /* renamed from: f, reason: collision with root package name */
    public int f458651f;

    /* renamed from: g, reason: collision with root package name */
    public int f458652g;

    /* renamed from: h, reason: collision with root package name */
    public int f458653h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ik6)) {
            return false;
        }
        r45.ik6 ik6Var = (r45.ik6) fVar;
        return n51.f.a(this.f76494x2de60e5e, ik6Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f458649d), java.lang.Integer.valueOf(ik6Var.f458649d)) && n51.f.a(java.lang.Long.valueOf(this.f458650e), java.lang.Long.valueOf(ik6Var.f458650e)) && n51.f.a(java.lang.Integer.valueOf(this.f458651f), java.lang.Integer.valueOf(ik6Var.f458651f)) && n51.f.a(java.lang.Integer.valueOf(this.f458652g), java.lang.Integer.valueOf(ik6Var.f458652g)) && n51.f.a(java.lang.Integer.valueOf(this.f458653h), java.lang.Integer.valueOf(ik6Var.f458653h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f458649d);
            fVar.h(3, this.f458650e);
            fVar.e(4, this.f458651f);
            fVar.e(5, this.f458652g);
            fVar.e(6, this.f458653h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f458649d) + b36.f.h(3, this.f458650e) + b36.f.e(4, this.f458651f) + b36.f.e(5, this.f458652g) + b36.f.e(6, this.f458653h);
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
        r45.ik6 ik6Var = (r45.ik6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    ik6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ik6Var.f458649d = aVar2.g(intValue);
                return 0;
            case 3:
                ik6Var.f458650e = aVar2.i(intValue);
                return 0;
            case 4:
                ik6Var.f458651f = aVar2.g(intValue);
                return 0;
            case 5:
                ik6Var.f458652g = aVar2.g(intValue);
                return 0;
            case 6:
                ik6Var.f458653h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
