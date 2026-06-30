package r45;

/* loaded from: classes8.dex */
public class gk3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.h05 f456844d;

    /* renamed from: e, reason: collision with root package name */
    public int f456845e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456846f;

    /* renamed from: g, reason: collision with root package name */
    public r45.k05 f456847g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gk3)) {
            return false;
        }
        r45.gk3 gk3Var = (r45.gk3) fVar;
        return n51.f.a(this.f76492x92037252, gk3Var.f76492x92037252) && n51.f.a(this.f456844d, gk3Var.f456844d) && n51.f.a(java.lang.Integer.valueOf(this.f456845e), java.lang.Integer.valueOf(gk3Var.f456845e)) && n51.f.a(this.f456846f, gk3Var.f456846f) && n51.f.a(this.f456847g, gk3Var.f456847g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.h05 h05Var = this.f456844d;
            if (h05Var != null) {
                fVar.i(2, h05Var.mo75928xcd1e8d8());
                this.f456844d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f456845e);
            java.lang.String str = this.f456846f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.k05 k05Var = this.f456847g;
            if (k05Var != null) {
                fVar.i(5, k05Var.mo75928xcd1e8d8());
                this.f456847g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.h05 h05Var2 = this.f456844d;
            if (h05Var2 != null) {
                i18 += b36.f.i(2, h05Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f456845e);
            java.lang.String str2 = this.f456846f;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            r45.k05 k05Var2 = this.f456847g;
            return k05Var2 != null ? e17 + b36.f.i(5, k05Var2.mo75928xcd1e8d8()) : e17;
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
        r45.gk3 gk3Var = (r45.gk3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                gk3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.h05 h05Var3 = new r45.h05();
                if (bArr2 != null && bArr2.length > 0) {
                    h05Var3.mo11468x92b714fd(bArr2);
                }
                gk3Var.f456844d = h05Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            gk3Var.f456845e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            gk3Var.f456846f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.k05 k05Var3 = new r45.k05();
            if (bArr3 != null && bArr3.length > 0) {
                k05Var3.mo11468x92b714fd(bArr3);
            }
            gk3Var.f456847g = k05Var3;
        }
        return 0;
    }
}
