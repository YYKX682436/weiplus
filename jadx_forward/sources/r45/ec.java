package r45;

/* loaded from: classes8.dex */
public class ec extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bc f454791d;

    /* renamed from: e, reason: collision with root package name */
    public r45.p93 f454792e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454793f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454794g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454795h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ov5 f454796i;

    /* renamed from: m, reason: collision with root package name */
    public r45.lc f454797m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ec)) {
            return false;
        }
        r45.ec ecVar = (r45.ec) fVar;
        return n51.f.a(this.f454791d, ecVar.f454791d) && n51.f.a(this.f454792e, ecVar.f454792e) && n51.f.a(this.f454793f, ecVar.f454793f) && n51.f.a(this.f454794g, ecVar.f454794g) && n51.f.a(this.f454795h, ecVar.f454795h) && n51.f.a(this.f454796i, ecVar.f454796i) && n51.f.a(this.f454797m, ecVar.f454797m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bc bcVar = this.f454791d;
            if (bcVar != null) {
                fVar.i(1, bcVar.mo75928xcd1e8d8());
                this.f454791d.mo75956x3d5d1f78(fVar);
            }
            r45.p93 p93Var = this.f454792e;
            if (p93Var != null) {
                fVar.i(2, p93Var.mo75928xcd1e8d8());
                this.f454792e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f454793f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f454794g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f454795h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.ov5 ov5Var = this.f454796i;
            if (ov5Var != null) {
                fVar.i(6, ov5Var.mo75928xcd1e8d8());
                this.f454796i.mo75956x3d5d1f78(fVar);
            }
            r45.lc lcVar = this.f454797m;
            if (lcVar != null) {
                fVar.i(7, lcVar.mo75928xcd1e8d8());
                this.f454797m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.bc bcVar2 = this.f454791d;
            int i18 = bcVar2 != null ? 0 + b36.f.i(1, bcVar2.mo75928xcd1e8d8()) : 0;
            r45.p93 p93Var2 = this.f454792e;
            if (p93Var2 != null) {
                i18 += b36.f.i(2, p93Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f454793f;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f454794g;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f454795h;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.ov5 ov5Var2 = this.f454796i;
            if (ov5Var2 != null) {
                i18 += b36.f.i(6, ov5Var2.mo75928xcd1e8d8());
            }
            r45.lc lcVar2 = this.f454797m;
            return lcVar2 != null ? i18 + b36.f.i(7, lcVar2.mo75928xcd1e8d8()) : i18;
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
        r45.ec ecVar = (r45.ec) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.bc bcVar3 = new r45.bc();
                    if (bArr != null && bArr.length > 0) {
                        bcVar3.mo11468x92b714fd(bArr);
                    }
                    ecVar.f454791d = bcVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.p93 p93Var3 = new r45.p93();
                    if (bArr2 != null && bArr2.length > 0) {
                        p93Var3.mo11468x92b714fd(bArr2);
                    }
                    ecVar.f454792e = p93Var3;
                }
                return 0;
            case 3:
                ecVar.f454793f = aVar2.k(intValue);
                return 0;
            case 4:
                ecVar.f454794g = aVar2.k(intValue);
                return 0;
            case 5:
                ecVar.f454795h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ov5 ov5Var3 = new r45.ov5();
                    if (bArr3 != null && bArr3.length > 0) {
                        ov5Var3.mo11468x92b714fd(bArr3);
                    }
                    ecVar.f454796i = ov5Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.lc lcVar3 = new r45.lc();
                    if (bArr4 != null && bArr4.length > 0) {
                        lcVar3.mo11468x92b714fd(bArr4);
                    }
                    ecVar.f454797m = lcVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
