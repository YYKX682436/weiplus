package r45;

/* loaded from: classes7.dex */
public class j6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kd7 f459133d;

    /* renamed from: e, reason: collision with root package name */
    public r45.jd7 f459134e;

    /* renamed from: f, reason: collision with root package name */
    public int f459135f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459136g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j6)) {
            return false;
        }
        r45.j6 j6Var = (r45.j6) fVar;
        return n51.f.a(this.f76492x92037252, j6Var.f76492x92037252) && n51.f.a(this.f459133d, j6Var.f459133d) && n51.f.a(this.f459134e, j6Var.f459134e) && n51.f.a(java.lang.Integer.valueOf(this.f459135f), java.lang.Integer.valueOf(j6Var.f459135f)) && n51.f.a(this.f459136g, j6Var.f459136g);
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
            r45.kd7 kd7Var = this.f459133d;
            if (kd7Var != null) {
                fVar.i(2, kd7Var.mo75928xcd1e8d8());
                this.f459133d.mo75956x3d5d1f78(fVar);
            }
            r45.jd7 jd7Var = this.f459134e;
            if (jd7Var != null) {
                fVar.i(3, jd7Var.mo75928xcd1e8d8());
                this.f459134e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f459135f);
            java.lang.String str = this.f459136g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.kd7 kd7Var2 = this.f459133d;
            if (kd7Var2 != null) {
                i18 += b36.f.i(2, kd7Var2.mo75928xcd1e8d8());
            }
            r45.jd7 jd7Var2 = this.f459134e;
            if (jd7Var2 != null) {
                i18 += b36.f.i(3, jd7Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f459135f);
            java.lang.String str2 = this.f459136g;
            return str2 != null ? e17 + b36.f.j(5, str2) : e17;
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
        r45.j6 j6Var = (r45.j6) objArr[1];
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
                j6Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.kd7 kd7Var3 = new r45.kd7();
                if (bArr2 != null && bArr2.length > 0) {
                    kd7Var3.mo11468x92b714fd(bArr2);
                }
                j6Var.f459133d = kd7Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                j6Var.f459135f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            j6Var.f459136g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.jd7 jd7Var3 = new r45.jd7();
            if (bArr3 != null && bArr3.length > 0) {
                jd7Var3.mo11468x92b714fd(bArr3);
            }
            j6Var.f459134e = jd7Var3;
        }
        return 0;
    }
}
