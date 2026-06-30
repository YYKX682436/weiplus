package r45;

/* loaded from: classes4.dex */
public class tk3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468050d;

    /* renamed from: e, reason: collision with root package name */
    public int f468051e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f468052f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468053g;

    /* renamed from: h, reason: collision with root package name */
    public int f468054h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tk3)) {
            return false;
        }
        r45.tk3 tk3Var = (r45.tk3) fVar;
        return n51.f.a(this.f76494x2de60e5e, tk3Var.f76494x2de60e5e) && n51.f.a(this.f468050d, tk3Var.f468050d) && n51.f.a(java.lang.Integer.valueOf(this.f468051e), java.lang.Integer.valueOf(tk3Var.f468051e)) && n51.f.a(this.f468052f, tk3Var.f468052f) && n51.f.a(this.f468053g, tk3Var.f468053g) && n51.f.a(java.lang.Integer.valueOf(this.f468054h), java.lang.Integer.valueOf(tk3Var.f468054h));
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
            java.lang.String str = this.f468050d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f468051e);
            fVar.g(4, 8, this.f468052f);
            java.lang.String str2 = this.f468053g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f468054h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f468050d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f468051e) + b36.f.g(4, 8, this.f468052f);
            java.lang.String str4 = this.f468053g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.e(6, this.f468054h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f468052f.clear();
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
        r45.tk3 tk3Var = (r45.tk3) objArr[1];
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
                    tk3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                tk3Var.f468050d = aVar2.k(intValue);
                return 0;
            case 3:
                tk3Var.f468051e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    tk3Var.f468052f.add(du5Var);
                }
                return 0;
            case 5:
                tk3Var.f468053g = aVar2.k(intValue);
                return 0;
            case 6:
                tk3Var.f468054h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
