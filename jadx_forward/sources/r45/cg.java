package r45;

/* loaded from: classes7.dex */
public class cg extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453067d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f453068e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f453069f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f453070g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cg)) {
            return false;
        }
        r45.cg cgVar = (r45.cg) fVar;
        return n51.f.a(this.f76494x2de60e5e, cgVar.f76494x2de60e5e) && n51.f.a(this.f453067d, cgVar.f453067d) && n51.f.a(this.f453068e, cgVar.f453068e) && n51.f.a(java.lang.Integer.valueOf(this.f453069f), java.lang.Integer.valueOf(cgVar.f453069f)) && n51.f.a(java.lang.Boolean.valueOf(this.f453070g), java.lang.Boolean.valueOf(cgVar.f453070g));
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
            java.lang.String str = this.f453067d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f453068e);
            fVar.e(4, this.f453069f);
            fVar.a(5, this.f453070g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f453067d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 8, this.f453068e) + b36.f.e(4, this.f453069f) + b36.f.a(5, this.f453070g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f453068e.clear();
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
        r45.cg cgVar = (r45.cg) objArr[1];
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
                cgVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            cgVar.f453067d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                cgVar.f453069f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            cgVar.f453070g = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.dz dzVar = new r45.dz();
            if (bArr3 != null && bArr3.length > 0) {
                dzVar.mo11468x92b714fd(bArr3);
            }
            cgVar.f453068e.add(dzVar);
        }
        return 0;
    }
}
