package r45;

/* loaded from: classes9.dex */
public class nf3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f462881d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462882e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462883f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ae f462884g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nf3)) {
            return false;
        }
        r45.nf3 nf3Var = (r45.nf3) fVar;
        return n51.f.a(this.f76494x2de60e5e, nf3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f462881d), java.lang.Integer.valueOf(nf3Var.f462881d)) && n51.f.a(this.f462882e, nf3Var.f462882e) && n51.f.a(this.f462883f, nf3Var.f462883f) && n51.f.a(this.f462884g, nf3Var.f462884g);
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
            fVar.e(2, this.f462881d);
            java.lang.String str = this.f462882e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f462883f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.ae aeVar = this.f462884g;
            if (aeVar != null) {
                fVar.i(5, aeVar.mo75928xcd1e8d8());
                this.f462884g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f462881d);
            java.lang.String str3 = this.f462882e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f462883f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.ae aeVar2 = this.f462884g;
            return aeVar2 != null ? i18 + b36.f.i(5, aeVar2.mo75928xcd1e8d8()) : i18;
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
        r45.nf3 nf3Var = (r45.nf3) objArr[1];
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
                nf3Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            nf3Var.f462881d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            nf3Var.f462882e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            nf3Var.f462883f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ae aeVar3 = new r45.ae();
            if (bArr2 != null && bArr2.length > 0) {
                aeVar3.mo11468x92b714fd(bArr2);
            }
            nf3Var.f462884g = aeVar3;
        }
        return 0;
    }
}
