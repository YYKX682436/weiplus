package r45;

/* loaded from: classes4.dex */
public class bi3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f452307d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452308e;

    /* renamed from: f, reason: collision with root package name */
    public int f452309f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f452310g;

    /* renamed from: h, reason: collision with root package name */
    public int f452311h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452312i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f452313m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bi3)) {
            return false;
        }
        r45.bi3 bi3Var = (r45.bi3) fVar;
        return n51.f.a(this.f76492x92037252, bi3Var.f76492x92037252) && n51.f.a(this.f452307d, bi3Var.f452307d) && n51.f.a(this.f452308e, bi3Var.f452308e) && n51.f.a(java.lang.Integer.valueOf(this.f452309f), java.lang.Integer.valueOf(bi3Var.f452309f)) && n51.f.a(this.f452310g, bi3Var.f452310g) && n51.f.a(java.lang.Integer.valueOf(this.f452311h), java.lang.Integer.valueOf(bi3Var.f452311h)) && n51.f.a(this.f452312i, bi3Var.f452312i) && n51.f.a(this.f452313m, bi3Var.f452313m);
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
            r45.cu5 cu5Var = this.f452307d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f452307d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f452308e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f452309f);
            r45.cu5 cu5Var2 = this.f452310g;
            if (cu5Var2 != null) {
                fVar.i(5, cu5Var2.mo75928xcd1e8d8());
                this.f452310g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f452311h);
            java.lang.String str2 = this.f452312i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            r45.cu5 cu5Var3 = this.f452313m;
            if (cu5Var3 != null) {
                fVar.i(8, cu5Var3.mo75928xcd1e8d8());
                this.f452313m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var4 = this.f452307d;
            if (cu5Var4 != null) {
                i18 += b36.f.i(2, cu5Var4.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f452308e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f452309f);
            r45.cu5 cu5Var5 = this.f452310g;
            if (cu5Var5 != null) {
                e17 += b36.f.i(5, cu5Var5.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(6, this.f452311h);
            java.lang.String str4 = this.f452312i;
            if (str4 != null) {
                e18 += b36.f.j(7, str4);
            }
            r45.cu5 cu5Var6 = this.f452313m;
            return cu5Var6 != null ? e18 + b36.f.i(8, cu5Var6.mo75928xcd1e8d8()) : e18;
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
        r45.bi3 bi3Var = (r45.bi3) objArr[1];
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
                    bi3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var7.b(bArr2);
                    }
                    bi3Var.f452307d = cu5Var7;
                }
                return 0;
            case 3:
                bi3Var.f452308e = aVar2.k(intValue);
                return 0;
            case 4:
                bi3Var.f452309f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var8.b(bArr3);
                    }
                    bi3Var.f452310g = cu5Var8;
                }
                return 0;
            case 6:
                bi3Var.f452311h = aVar2.g(intValue);
                return 0;
            case 7:
                bi3Var.f452312i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var9.b(bArr4);
                    }
                    bi3Var.f452313m = cu5Var9;
                }
                return 0;
            default:
                return -1;
        }
    }
}
