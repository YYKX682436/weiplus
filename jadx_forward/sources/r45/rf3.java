package r45;

/* loaded from: classes4.dex */
public class rf3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f466332d;

    /* renamed from: e, reason: collision with root package name */
    public long f466333e;

    /* renamed from: f, reason: collision with root package name */
    public int f466334f;

    /* renamed from: g, reason: collision with root package name */
    public int f466335g;

    /* renamed from: h, reason: collision with root package name */
    public int f466336h;

    /* renamed from: i, reason: collision with root package name */
    public long f466337i;

    /* renamed from: m, reason: collision with root package name */
    public long f466338m;

    /* renamed from: n, reason: collision with root package name */
    public long f466339n;

    /* renamed from: o, reason: collision with root package name */
    public int f466340o;

    /* renamed from: p, reason: collision with root package name */
    public r45.fp0 f466341p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rf3)) {
            return false;
        }
        r45.rf3 rf3Var = (r45.rf3) fVar;
        return n51.f.a(this.f76494x2de60e5e, rf3Var.f76494x2de60e5e) && n51.f.a(java.lang.Long.valueOf(this.f466332d), java.lang.Long.valueOf(rf3Var.f466332d)) && n51.f.a(java.lang.Long.valueOf(this.f466333e), java.lang.Long.valueOf(rf3Var.f466333e)) && n51.f.a(java.lang.Integer.valueOf(this.f466334f), java.lang.Integer.valueOf(rf3Var.f466334f)) && n51.f.a(java.lang.Integer.valueOf(this.f466335g), java.lang.Integer.valueOf(rf3Var.f466335g)) && n51.f.a(java.lang.Integer.valueOf(this.f466336h), java.lang.Integer.valueOf(rf3Var.f466336h)) && n51.f.a(java.lang.Long.valueOf(this.f466337i), java.lang.Long.valueOf(rf3Var.f466337i)) && n51.f.a(java.lang.Long.valueOf(this.f466338m), java.lang.Long.valueOf(rf3Var.f466338m)) && n51.f.a(java.lang.Long.valueOf(this.f466339n), java.lang.Long.valueOf(rf3Var.f466339n)) && n51.f.a(java.lang.Integer.valueOf(this.f466340o), java.lang.Integer.valueOf(rf3Var.f466340o)) && n51.f.a(this.f466341p, rf3Var.f466341p);
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
            fVar.h(2, this.f466332d);
            fVar.h(3, this.f466333e);
            fVar.e(4, this.f466334f);
            fVar.e(5, this.f466335g);
            fVar.e(6, this.f466336h);
            fVar.h(7, this.f466337i);
            fVar.h(8, this.f466338m);
            fVar.h(9, this.f466339n);
            fVar.e(10, this.f466340o);
            r45.fp0 fp0Var = this.f466341p;
            if (fp0Var != null) {
                fVar.i(11, fp0Var.mo75928xcd1e8d8());
                this.f466341p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f466332d) + b36.f.h(3, this.f466333e) + b36.f.e(4, this.f466334f) + b36.f.e(5, this.f466335g) + b36.f.e(6, this.f466336h) + b36.f.h(7, this.f466337i) + b36.f.h(8, this.f466338m) + b36.f.h(9, this.f466339n) + b36.f.e(10, this.f466340o);
            r45.fp0 fp0Var2 = this.f466341p;
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
        r45.rf3 rf3Var = (r45.rf3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    rf3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                rf3Var.f466332d = aVar2.i(intValue);
                return 0;
            case 3:
                rf3Var.f466333e = aVar2.i(intValue);
                return 0;
            case 4:
                rf3Var.f466334f = aVar2.g(intValue);
                return 0;
            case 5:
                rf3Var.f466335g = aVar2.g(intValue);
                return 0;
            case 6:
                rf3Var.f466336h = aVar2.g(intValue);
                return 0;
            case 7:
                rf3Var.f466337i = aVar2.i(intValue);
                return 0;
            case 8:
                rf3Var.f466338m = aVar2.i(intValue);
                return 0;
            case 9:
                rf3Var.f466339n = aVar2.i(intValue);
                return 0;
            case 10:
                rf3Var.f466340o = aVar2.g(intValue);
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
                    rf3Var.f466341p = fp0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
