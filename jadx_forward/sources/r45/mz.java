package r45;

/* loaded from: classes4.dex */
public class mz extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462469d;

    /* renamed from: e, reason: collision with root package name */
    public r45.oh f462470e;

    /* renamed from: f, reason: collision with root package name */
    public r45.j8 f462471f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mz)) {
            return false;
        }
        r45.mz mzVar = (r45.mz) fVar;
        return n51.f.a(this.f76492x92037252, mzVar.f76492x92037252) && n51.f.a(this.f462469d, mzVar.f462469d) && n51.f.a(this.f462470e, mzVar.f462470e) && n51.f.a(this.f462471f, mzVar.f462471f);
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
            java.lang.String str = this.f462469d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.oh ohVar = this.f462470e;
            if (ohVar != null) {
                fVar.i(3, ohVar.mo75928xcd1e8d8());
                this.f462470e.mo75956x3d5d1f78(fVar);
            }
            r45.j8 j8Var = this.f462471f;
            if (j8Var != null) {
                fVar.i(4, j8Var.mo75928xcd1e8d8());
                this.f462471f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f462469d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.oh ohVar2 = this.f462470e;
            if (ohVar2 != null) {
                i18 += b36.f.i(3, ohVar2.mo75928xcd1e8d8());
            }
            r45.j8 j8Var2 = this.f462471f;
            return j8Var2 != null ? i18 + b36.f.i(4, j8Var2.mo75928xcd1e8d8()) : i18;
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
        r45.mz mzVar = (r45.mz) objArr[1];
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
                mzVar.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            mzVar.f462469d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.oh ohVar3 = new r45.oh();
                if (bArr2 != null && bArr2.length > 0) {
                    ohVar3.mo11468x92b714fd(bArr2);
                }
                mzVar.f462470e = ohVar3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.j8 j8Var3 = new r45.j8();
            if (bArr3 != null && bArr3.length > 0) {
                j8Var3.mo11468x92b714fd(bArr3);
            }
            mzVar.f462471f = j8Var3;
        }
        return 0;
    }
}
