package r45;

/* loaded from: classes9.dex */
public class gl6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f456875d;

    /* renamed from: e, reason: collision with root package name */
    public int f456876e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456877f;

    /* renamed from: g, reason: collision with root package name */
    public int f456878g;

    /* renamed from: h, reason: collision with root package name */
    public int f456879h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456880i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gl6)) {
            return false;
        }
        r45.gl6 gl6Var = (r45.gl6) fVar;
        return n51.f.a(this.f76492x92037252, gl6Var.f76492x92037252) && n51.f.a(this.f456875d, gl6Var.f456875d) && n51.f.a(java.lang.Integer.valueOf(this.f456876e), java.lang.Integer.valueOf(gl6Var.f456876e)) && n51.f.a(this.f456877f, gl6Var.f456877f) && n51.f.a(java.lang.Integer.valueOf(this.f456878g), java.lang.Integer.valueOf(gl6Var.f456878g)) && n51.f.a(java.lang.Integer.valueOf(this.f456879h), java.lang.Integer.valueOf(gl6Var.f456879h)) && n51.f.a(this.f456880i, gl6Var.f456880i);
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
            r45.cu5 cu5Var = this.f456875d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f456875d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f456876e);
            java.lang.String str = this.f456877f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f456878g);
            fVar.e(6, this.f456879h);
            java.lang.String str2 = this.f456880i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var2 = this.f456875d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f456876e);
            java.lang.String str3 = this.f456877f;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            int e18 = e17 + b36.f.e(5, this.f456878g) + b36.f.e(6, this.f456879h);
            java.lang.String str4 = this.f456880i;
            return str4 != null ? e18 + b36.f.j(7, str4) : e18;
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
        r45.gl6 gl6Var = (r45.gl6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    gl6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    gl6Var.f456875d = cu5Var3;
                }
                return 0;
            case 3:
                gl6Var.f456876e = aVar2.g(intValue);
                return 0;
            case 4:
                gl6Var.f456877f = aVar2.k(intValue);
                return 0;
            case 5:
                gl6Var.f456878g = aVar2.g(intValue);
                return 0;
            case 6:
                gl6Var.f456879h = aVar2.g(intValue);
                return 0;
            case 7:
                gl6Var.f456880i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
