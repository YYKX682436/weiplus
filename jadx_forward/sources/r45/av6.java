package r45;

/* loaded from: classes9.dex */
public class av6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451814d;

    /* renamed from: e, reason: collision with root package name */
    public r45.e17 f451815e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zu6 f451816f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f451817g;

    /* renamed from: h, reason: collision with root package name */
    public int f451818h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451819i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451820m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.av6)) {
            return false;
        }
        r45.av6 av6Var = (r45.av6) fVar;
        return n51.f.a(this.f76494x2de60e5e, av6Var.f76494x2de60e5e) && n51.f.a(this.f451814d, av6Var.f451814d) && n51.f.a(this.f451815e, av6Var.f451815e) && n51.f.a(this.f451816f, av6Var.f451816f) && n51.f.a(this.f451817g, av6Var.f451817g) && n51.f.a(java.lang.Integer.valueOf(this.f451818h), java.lang.Integer.valueOf(av6Var.f451818h)) && n51.f.a(this.f451819i, av6Var.f451819i) && n51.f.a(this.f451820m, av6Var.f451820m);
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
            java.lang.String str = this.f451814d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.e17 e17Var = this.f451815e;
            if (e17Var != null) {
                fVar.i(3, e17Var.mo75928xcd1e8d8());
                this.f451815e.mo75956x3d5d1f78(fVar);
            }
            r45.zu6 zu6Var = this.f451816f;
            if (zu6Var != null) {
                fVar.i(4, zu6Var.mo75928xcd1e8d8());
                this.f451816f.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f451817g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f451817g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f451818h);
            java.lang.String str2 = this.f451819i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f451820m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f451814d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            r45.e17 e17Var2 = this.f451815e;
            if (e17Var2 != null) {
                i18 += b36.f.i(3, e17Var2.mo75928xcd1e8d8());
            }
            r45.zu6 zu6Var2 = this.f451816f;
            if (zu6Var2 != null) {
                i18 += b36.f.i(4, zu6Var2.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var2 = this.f451817g;
            if (cu5Var2 != null) {
                i18 += b36.f.i(5, cu5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(6, this.f451818h);
            java.lang.String str5 = this.f451819i;
            if (str5 != null) {
                e17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f451820m;
            return str6 != null ? e17 + b36.f.j(8, str6) : e17;
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
        r45.av6 av6Var = (r45.av6) objArr[1];
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
                    av6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                av6Var.f451814d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.e17 e17Var3 = new r45.e17();
                    if (bArr2 != null && bArr2.length > 0) {
                        e17Var3.mo11468x92b714fd(bArr2);
                    }
                    av6Var.f451815e = e17Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.zu6 zu6Var3 = new r45.zu6();
                    if (bArr3 != null && bArr3.length > 0) {
                        zu6Var3.mo11468x92b714fd(bArr3);
                    }
                    av6Var.f451816f = zu6Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    av6Var.f451817g = cu5Var3;
                }
                return 0;
            case 6:
                av6Var.f451818h = aVar2.g(intValue);
                return 0;
            case 7:
                av6Var.f451819i = aVar2.k(intValue);
                return 0;
            case 8:
                av6Var.f451820m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
