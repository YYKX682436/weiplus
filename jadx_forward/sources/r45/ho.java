package r45;

/* loaded from: classes4.dex */
public class ho extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j06 f457856d;

    /* renamed from: e, reason: collision with root package name */
    public r45.k06 f457857e;

    /* renamed from: f, reason: collision with root package name */
    public r45.i06 f457858f;

    /* renamed from: g, reason: collision with root package name */
    public int f457859g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ho)) {
            return false;
        }
        r45.ho hoVar = (r45.ho) fVar;
        return n51.f.a(this.f76492x92037252, hoVar.f76492x92037252) && n51.f.a(this.f457856d, hoVar.f457856d) && n51.f.a(this.f457857e, hoVar.f457857e) && n51.f.a(this.f457858f, hoVar.f457858f) && n51.f.a(java.lang.Integer.valueOf(this.f457859g), java.lang.Integer.valueOf(hoVar.f457859g));
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
            r45.j06 j06Var = this.f457856d;
            if (j06Var != null) {
                fVar.i(2, j06Var.mo75928xcd1e8d8());
                this.f457856d.mo75956x3d5d1f78(fVar);
            }
            r45.k06 k06Var = this.f457857e;
            if (k06Var != null) {
                fVar.i(3, k06Var.mo75928xcd1e8d8());
                this.f457857e.mo75956x3d5d1f78(fVar);
            }
            r45.i06 i06Var = this.f457858f;
            if (i06Var != null) {
                fVar.i(4, i06Var.mo75928xcd1e8d8());
                this.f457858f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f457859g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.j06 j06Var2 = this.f457856d;
            if (j06Var2 != null) {
                i18 += b36.f.i(2, j06Var2.mo75928xcd1e8d8());
            }
            r45.k06 k06Var2 = this.f457857e;
            if (k06Var2 != null) {
                i18 += b36.f.i(3, k06Var2.mo75928xcd1e8d8());
            }
            r45.i06 i06Var2 = this.f457858f;
            if (i06Var2 != null) {
                i18 += b36.f.i(4, i06Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(5, this.f457859g);
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
        r45.ho hoVar = (r45.ho) objArr[1];
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
                hoVar.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.j06 j06Var3 = new r45.j06();
                if (bArr2 != null && bArr2.length > 0) {
                    j06Var3.mo11468x92b714fd(bArr2);
                }
                hoVar.f457856d = j06Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.k06 k06Var3 = new r45.k06();
                if (bArr3 != null && bArr3.length > 0) {
                    k06Var3.mo11468x92b714fd(bArr3);
                }
                hoVar.f457857e = k06Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            hoVar.f457859g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.i06 i06Var3 = new r45.i06();
            if (bArr4 != null && bArr4.length > 0) {
                i06Var3.mo11468x92b714fd(bArr4);
            }
            hoVar.f457858f = i06Var3;
        }
        return 0;
    }
}
