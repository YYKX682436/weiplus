package r45;

/* loaded from: classes9.dex */
public class e0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f454412d;

    /* renamed from: e, reason: collision with root package name */
    public int f454413e;

    /* renamed from: f, reason: collision with root package name */
    public int f454414f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454415g;

    /* renamed from: h, reason: collision with root package name */
    public int f454416h;

    /* renamed from: i, reason: collision with root package name */
    public int f454417i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454418m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e0)) {
            return false;
        }
        r45.e0 e0Var = (r45.e0) fVar;
        return n51.f.a(this.f76494x2de60e5e, e0Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f454412d), java.lang.Integer.valueOf(e0Var.f454412d)) && n51.f.a(java.lang.Integer.valueOf(this.f454413e), java.lang.Integer.valueOf(e0Var.f454413e)) && n51.f.a(java.lang.Integer.valueOf(this.f454414f), java.lang.Integer.valueOf(e0Var.f454414f)) && n51.f.a(this.f454415g, e0Var.f454415g) && n51.f.a(java.lang.Integer.valueOf(this.f454416h), java.lang.Integer.valueOf(e0Var.f454416h)) && n51.f.a(java.lang.Integer.valueOf(this.f454417i), java.lang.Integer.valueOf(e0Var.f454417i)) && n51.f.a(this.f454418m, e0Var.f454418m);
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
            fVar.e(2, this.f454412d);
            fVar.e(3, this.f454413e);
            fVar.e(4, this.f454414f);
            java.lang.String str = this.f454415g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f454416h);
            fVar.e(7, this.f454417i);
            java.lang.String str2 = this.f454418m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f454412d) + b36.f.e(3, this.f454413e) + b36.f.e(4, this.f454414f);
            java.lang.String str3 = this.f454415g;
            if (str3 != null) {
                i18 += b36.f.j(5, str3);
            }
            int e17 = i18 + b36.f.e(6, this.f454416h) + b36.f.e(7, this.f454417i);
            java.lang.String str4 = this.f454418m;
            return str4 != null ? e17 + b36.f.j(8, str4) : e17;
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
        r45.e0 e0Var = (r45.e0) objArr[1];
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
                    e0Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                e0Var.f454412d = aVar2.g(intValue);
                return 0;
            case 3:
                e0Var.f454413e = aVar2.g(intValue);
                return 0;
            case 4:
                e0Var.f454414f = aVar2.g(intValue);
                return 0;
            case 5:
                e0Var.f454415g = aVar2.k(intValue);
                return 0;
            case 6:
                e0Var.f454416h = aVar2.g(intValue);
                return 0;
            case 7:
                e0Var.f454417i = aVar2.g(intValue);
                return 0;
            case 8:
                e0Var.f454418m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
