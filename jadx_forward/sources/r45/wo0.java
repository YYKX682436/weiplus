package r45;

/* loaded from: classes8.dex */
public class wo0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f470864d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470865e;

    /* renamed from: f, reason: collision with root package name */
    public float f470866f;

    /* renamed from: g, reason: collision with root package name */
    public float f470867g;

    /* renamed from: h, reason: collision with root package name */
    public int f470868h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470869i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470870m;

    /* renamed from: n, reason: collision with root package name */
    public int f470871n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f470872o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wo0)) {
            return false;
        }
        r45.wo0 wo0Var = (r45.wo0) fVar;
        return n51.f.a(this.f76494x2de60e5e, wo0Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f470864d), java.lang.Integer.valueOf(wo0Var.f470864d)) && n51.f.a(this.f470865e, wo0Var.f470865e) && n51.f.a(java.lang.Float.valueOf(this.f470866f), java.lang.Float.valueOf(wo0Var.f470866f)) && n51.f.a(java.lang.Float.valueOf(this.f470867g), java.lang.Float.valueOf(wo0Var.f470867g)) && n51.f.a(java.lang.Integer.valueOf(this.f470868h), java.lang.Integer.valueOf(wo0Var.f470868h)) && n51.f.a(this.f470869i, wo0Var.f470869i) && n51.f.a(this.f470870m, wo0Var.f470870m) && n51.f.a(java.lang.Integer.valueOf(this.f470871n), java.lang.Integer.valueOf(wo0Var.f470871n)) && n51.f.a(this.f470872o, wo0Var.f470872o);
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
            fVar.e(2, this.f470864d);
            java.lang.String str = this.f470865e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.d(4, this.f470866f);
            fVar.d(5, this.f470867g);
            fVar.e(6, this.f470868h);
            java.lang.String str2 = this.f470869i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f470870m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f470871n);
            java.lang.String str4 = this.f470872o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f470864d);
            java.lang.String str5 = this.f470865e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int d17 = i18 + b36.f.d(4, this.f470866f) + b36.f.d(5, this.f470867g) + b36.f.e(6, this.f470868h);
            java.lang.String str6 = this.f470869i;
            if (str6 != null) {
                d17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f470870m;
            if (str7 != null) {
                d17 += b36.f.j(8, str7);
            }
            int e17 = d17 + b36.f.e(9, this.f470871n);
            java.lang.String str8 = this.f470872o;
            return str8 != null ? e17 + b36.f.j(10, str8) : e17;
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
        r45.wo0 wo0Var = (r45.wo0) objArr[1];
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
                    wo0Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                wo0Var.f470864d = aVar2.g(intValue);
                return 0;
            case 3:
                wo0Var.f470865e = aVar2.k(intValue);
                return 0;
            case 4:
                wo0Var.f470866f = aVar2.f(intValue);
                return 0;
            case 5:
                wo0Var.f470867g = aVar2.f(intValue);
                return 0;
            case 6:
                wo0Var.f470868h = aVar2.g(intValue);
                return 0;
            case 7:
                wo0Var.f470869i = aVar2.k(intValue);
                return 0;
            case 8:
                wo0Var.f470870m = aVar2.k(intValue);
                return 0;
            case 9:
                wo0Var.f470871n = aVar2.g(intValue);
                return 0;
            case 10:
                wo0Var.f470872o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
