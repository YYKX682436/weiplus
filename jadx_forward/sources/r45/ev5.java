package r45;

/* loaded from: classes9.dex */
public class ev5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f455276d;

    /* renamed from: e, reason: collision with root package name */
    public int f455277e;

    /* renamed from: f, reason: collision with root package name */
    public long f455278f;

    /* renamed from: g, reason: collision with root package name */
    public int f455279g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f455280h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f455281i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public r45.vi f455282m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ti f455283n;

    /* renamed from: o, reason: collision with root package name */
    public r45.ui f455284o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ev5)) {
            return false;
        }
        r45.ev5 ev5Var = (r45.ev5) fVar;
        return n51.f.a(this.f76494x2de60e5e, ev5Var.f76494x2de60e5e) && n51.f.a(java.lang.Long.valueOf(this.f455276d), java.lang.Long.valueOf(ev5Var.f455276d)) && n51.f.a(java.lang.Integer.valueOf(this.f455277e), java.lang.Integer.valueOf(ev5Var.f455277e)) && n51.f.a(java.lang.Long.valueOf(this.f455278f), java.lang.Long.valueOf(ev5Var.f455278f)) && n51.f.a(java.lang.Integer.valueOf(this.f455279g), java.lang.Integer.valueOf(ev5Var.f455279g)) && n51.f.a(java.lang.Boolean.valueOf(this.f455280h), java.lang.Boolean.valueOf(ev5Var.f455280h)) && n51.f.a(this.f455281i, ev5Var.f455281i) && n51.f.a(this.f455282m, ev5Var.f455282m) && n51.f.a(this.f455283n, ev5Var.f455283n) && n51.f.a(this.f455284o, ev5Var.f455284o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455281i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f455276d);
            fVar.e(5, this.f455277e);
            fVar.h(7, this.f455278f);
            fVar.e(9, this.f455279g);
            fVar.a(10, this.f455280h);
            fVar.g(8, 8, linkedList);
            r45.vi viVar = this.f455282m;
            if (viVar != null) {
                fVar.i(101, viVar.mo75928xcd1e8d8());
                this.f455282m.mo75956x3d5d1f78(fVar);
            }
            r45.ti tiVar = this.f455283n;
            if (tiVar != null) {
                fVar.i(102, tiVar.mo75928xcd1e8d8());
                this.f455283n.mo75956x3d5d1f78(fVar);
            }
            r45.ui uiVar = this.f455284o;
            if (uiVar != null) {
                fVar.i(103, uiVar.mo75928xcd1e8d8());
                this.f455284o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f455276d) + b36.f.e(5, this.f455277e) + b36.f.h(7, this.f455278f) + b36.f.e(9, this.f455279g) + b36.f.a(10, this.f455280h) + b36.f.g(8, 8, linkedList);
            r45.vi viVar2 = this.f455282m;
            if (viVar2 != null) {
                i18 += b36.f.i(101, viVar2.mo75928xcd1e8d8());
            }
            r45.ti tiVar2 = this.f455283n;
            if (tiVar2 != null) {
                i18 += b36.f.i(102, tiVar2.mo75928xcd1e8d8());
            }
            r45.ui uiVar2 = this.f455284o;
            return uiVar2 != null ? i18 + b36.f.i(103, uiVar2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.ev5 ev5Var = (r45.ev5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                ev5Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ev5Var.f455276d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 5) {
            ev5Var.f455277e = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 7:
                ev5Var.f455278f = aVar2.i(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.dv5 dv5Var = new r45.dv5();
                    if (bArr3 != null && bArr3.length > 0) {
                        dv5Var.mo11468x92b714fd(bArr3);
                    }
                    ev5Var.f455281i.add(dv5Var);
                }
                return 0;
            case 9:
                ev5Var.f455279g = aVar2.g(intValue);
                return 0;
            case 10:
                ev5Var.f455280h = aVar2.c(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 101:
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size3 = j19.size();
                        for (int i28 = 0; i28 < size3; i28++) {
                            byte[] bArr4 = (byte[]) j19.get(i28);
                            r45.vi viVar3 = new r45.vi();
                            if (bArr4 != null && bArr4.length > 0) {
                                viVar3.mo11468x92b714fd(bArr4);
                            }
                            ev5Var.f455282m = viVar3;
                        }
                        return 0;
                    case 102:
                        java.util.LinkedList j27 = aVar2.j(intValue);
                        int size4 = j27.size();
                        for (int i29 = 0; i29 < size4; i29++) {
                            byte[] bArr5 = (byte[]) j27.get(i29);
                            r45.ti tiVar3 = new r45.ti();
                            if (bArr5 != null && bArr5.length > 0) {
                                tiVar3.mo11468x92b714fd(bArr5);
                            }
                            ev5Var.f455283n = tiVar3;
                        }
                        return 0;
                    case 103:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size5 = j28.size();
                        for (int i37 = 0; i37 < size5; i37++) {
                            byte[] bArr6 = (byte[]) j28.get(i37);
                            r45.ui uiVar3 = new r45.ui();
                            if (bArr6 != null && bArr6.length > 0) {
                                uiVar3.mo11468x92b714fd(bArr6);
                            }
                            ev5Var.f455284o = uiVar3;
                        }
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
