package r45;

/* loaded from: classes8.dex */
public class fu6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456138d;

    /* renamed from: e, reason: collision with root package name */
    public int f456139e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456140f;

    /* renamed from: g, reason: collision with root package name */
    public int f456141g;

    /* renamed from: i, reason: collision with root package name */
    public int f456143i;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f456142h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f456144m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fu6)) {
            return false;
        }
        r45.fu6 fu6Var = (r45.fu6) fVar;
        return n51.f.a(this.f76494x2de60e5e, fu6Var.f76494x2de60e5e) && n51.f.a(this.f456138d, fu6Var.f456138d) && n51.f.a(java.lang.Integer.valueOf(this.f456139e), java.lang.Integer.valueOf(fu6Var.f456139e)) && n51.f.a(this.f456140f, fu6Var.f456140f) && n51.f.a(java.lang.Integer.valueOf(this.f456141g), java.lang.Integer.valueOf(fu6Var.f456141g)) && n51.f.a(this.f456142h, fu6Var.f456142h) && n51.f.a(java.lang.Integer.valueOf(this.f456143i), java.lang.Integer.valueOf(fu6Var.f456143i)) && n51.f.a(this.f456144m, fu6Var.f456144m);
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
            java.lang.String str = this.f456138d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f456139e);
            java.lang.String str2 = this.f456140f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f456141g);
            fVar.g(6, 8, this.f456142h);
            fVar.e(7, this.f456143i);
            fVar.g(8, 8, this.f456144m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f456138d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f456139e);
            java.lang.String str4 = this.f456140f;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.e(5, this.f456141g) + b36.f.g(6, 8, this.f456142h) + b36.f.e(7, this.f456143i) + b36.f.g(8, 8, this.f456144m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f456142h.clear();
            this.f456144m.clear();
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
        r45.fu6 fu6Var = (r45.fu6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    fu6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                fu6Var.f456138d = aVar2.k(intValue);
                return 0;
            case 3:
                fu6Var.f456139e = aVar2.g(intValue);
                return 0;
            case 4:
                fu6Var.f456140f = aVar2.k(intValue);
                return 0;
            case 5:
                fu6Var.f456141g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.en4 en4Var = new r45.en4();
                    if (bArr3 != null && bArr3.length > 0) {
                        en4Var.mo11468x92b714fd(bArr3);
                    }
                    fu6Var.f456142h.add(en4Var);
                }
                return 0;
            case 7:
                fu6Var.f456143i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ie4 ie4Var = new r45.ie4();
                    if (bArr4 != null && bArr4.length > 0) {
                        ie4Var.mo11468x92b714fd(bArr4);
                    }
                    fu6Var.f456144m.add(ie4Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
