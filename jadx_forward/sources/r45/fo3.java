package r45;

/* loaded from: classes4.dex */
public class fo3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f456014d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456015e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456016f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456017g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456018h;

    /* renamed from: i, reason: collision with root package name */
    public int f456019i;

    /* renamed from: m, reason: collision with root package name */
    public int f456020m;

    /* renamed from: n, reason: collision with root package name */
    public int f456021n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fo3)) {
            return false;
        }
        r45.fo3 fo3Var = (r45.fo3) fVar;
        return n51.f.a(this.f76494x2de60e5e, fo3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f456014d), java.lang.Integer.valueOf(fo3Var.f456014d)) && n51.f.a(this.f456015e, fo3Var.f456015e) && n51.f.a(this.f456016f, fo3Var.f456016f) && n51.f.a(this.f456017g, fo3Var.f456017g) && n51.f.a(this.f456018h, fo3Var.f456018h) && n51.f.a(java.lang.Integer.valueOf(this.f456019i), java.lang.Integer.valueOf(fo3Var.f456019i)) && n51.f.a(java.lang.Integer.valueOf(this.f456020m), java.lang.Integer.valueOf(fo3Var.f456020m)) && n51.f.a(java.lang.Integer.valueOf(this.f456021n), java.lang.Integer.valueOf(fo3Var.f456021n));
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
            fVar.e(2, this.f456014d);
            java.lang.String str = this.f456015e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f456016f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f456017g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f456018h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f456019i);
            fVar.e(8, this.f456020m);
            fVar.e(9, this.f456021n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f456014d);
            java.lang.String str5 = this.f456015e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f456016f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f456017g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f456018h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            return i18 + b36.f.e(7, this.f456019i) + b36.f.e(8, this.f456020m) + b36.f.e(9, this.f456021n);
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
        r45.fo3 fo3Var = (r45.fo3) objArr[1];
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
                    fo3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                fo3Var.f456014d = aVar2.g(intValue);
                return 0;
            case 3:
                fo3Var.f456015e = aVar2.k(intValue);
                return 0;
            case 4:
                fo3Var.f456016f = aVar2.k(intValue);
                return 0;
            case 5:
                fo3Var.f456017g = aVar2.k(intValue);
                return 0;
            case 6:
                fo3Var.f456018h = aVar2.k(intValue);
                return 0;
            case 7:
                fo3Var.f456019i = aVar2.g(intValue);
                return 0;
            case 8:
                fo3Var.f456020m = aVar2.g(intValue);
                return 0;
            case 9:
                fo3Var.f456021n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
