package r45;

/* loaded from: classes8.dex */
public class hq6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457923d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457924e;

    /* renamed from: f, reason: collision with root package name */
    public int f457925f;

    /* renamed from: g, reason: collision with root package name */
    public r45.gq6 f457926g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hq6)) {
            return false;
        }
        r45.hq6 hq6Var = (r45.hq6) fVar;
        return n51.f.a(this.f76494x2de60e5e, hq6Var.f76494x2de60e5e) && n51.f.a(this.f457923d, hq6Var.f457923d) && n51.f.a(this.f457924e, hq6Var.f457924e) && n51.f.a(java.lang.Integer.valueOf(this.f457925f), java.lang.Integer.valueOf(hq6Var.f457925f)) && n51.f.a(this.f457926g, hq6Var.f457926g);
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
            java.lang.String str = this.f457923d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f457924e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f457925f);
            r45.gq6 gq6Var = this.f457926g;
            if (gq6Var != null) {
                fVar.i(5, gq6Var.mo75928xcd1e8d8());
                this.f457926g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f457923d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f457924e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f457925f);
            r45.gq6 gq6Var2 = this.f457926g;
            return gq6Var2 != null ? e17 + b36.f.i(5, gq6Var2.mo75928xcd1e8d8()) : e17;
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
        r45.hq6 hq6Var = (r45.hq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                hq6Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            hq6Var.f457923d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hq6Var.f457924e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            hq6Var.f457925f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.gq6 gq6Var3 = new r45.gq6();
            if (bArr2 != null && bArr2.length > 0) {
                gq6Var3.mo11468x92b714fd(bArr2);
            }
            hq6Var.f457926g = gq6Var3;
        }
        return 0;
    }
}
