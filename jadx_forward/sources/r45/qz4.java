package r45;

/* loaded from: classes9.dex */
public class qz4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465899d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465900e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465901f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465902g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465903h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ka5 f465904i;

    /* renamed from: m, reason: collision with root package name */
    public r45.x15 f465905m;

    /* renamed from: n, reason: collision with root package name */
    public r45.wz3 f465906n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qz4)) {
            return false;
        }
        r45.qz4 qz4Var = (r45.qz4) fVar;
        return n51.f.a(this.f76492x92037252, qz4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f465899d), java.lang.Integer.valueOf(qz4Var.f465899d)) && n51.f.a(this.f465900e, qz4Var.f465900e) && n51.f.a(this.f465901f, qz4Var.f465901f) && n51.f.a(this.f465902g, qz4Var.f465902g) && n51.f.a(this.f465903h, qz4Var.f465903h) && n51.f.a(this.f465904i, qz4Var.f465904i) && n51.f.a(this.f465905m, qz4Var.f465905m) && n51.f.a(this.f465906n, qz4Var.f465906n);
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
            fVar.e(2, this.f465899d);
            java.lang.String str = this.f465900e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f465901f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f465902g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f465903h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.ka5 ka5Var = this.f465904i;
            if (ka5Var != null) {
                fVar.i(7, ka5Var.mo75928xcd1e8d8());
                this.f465904i.mo75956x3d5d1f78(fVar);
            }
            r45.x15 x15Var = this.f465905m;
            if (x15Var != null) {
                fVar.i(8, x15Var.mo75928xcd1e8d8());
                this.f465905m.mo75956x3d5d1f78(fVar);
            }
            r45.wz3 wz3Var = this.f465906n;
            if (wz3Var != null) {
                fVar.i(9, wz3Var.mo75928xcd1e8d8());
                this.f465906n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465899d);
            java.lang.String str5 = this.f465900e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f465901f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f465902g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f465903h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            r45.ka5 ka5Var2 = this.f465904i;
            if (ka5Var2 != null) {
                i18 += b36.f.i(7, ka5Var2.mo75928xcd1e8d8());
            }
            r45.x15 x15Var2 = this.f465905m;
            if (x15Var2 != null) {
                i18 += b36.f.i(8, x15Var2.mo75928xcd1e8d8());
            }
            r45.wz3 wz3Var2 = this.f465906n;
            return wz3Var2 != null ? i18 + b36.f.i(9, wz3Var2.mo75928xcd1e8d8()) : i18;
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
        r45.qz4 qz4Var = (r45.qz4) objArr[1];
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
                    qz4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                qz4Var.f465899d = aVar2.g(intValue);
                return 0;
            case 3:
                qz4Var.f465900e = aVar2.k(intValue);
                return 0;
            case 4:
                qz4Var.f465901f = aVar2.k(intValue);
                return 0;
            case 5:
                qz4Var.f465902g = aVar2.k(intValue);
                return 0;
            case 6:
                qz4Var.f465903h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ka5 ka5Var3 = new r45.ka5();
                    if (bArr2 != null && bArr2.length > 0) {
                        ka5Var3.mo11468x92b714fd(bArr2);
                    }
                    qz4Var.f465904i = ka5Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.x15 x15Var3 = new r45.x15();
                    if (bArr3 != null && bArr3.length > 0) {
                        x15Var3.mo11468x92b714fd(bArr3);
                    }
                    qz4Var.f465905m = x15Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.wz3 wz3Var3 = new r45.wz3();
                    if (bArr4 != null && bArr4.length > 0) {
                        wz3Var3.mo11468x92b714fd(bArr4);
                    }
                    qz4Var.f465906n = wz3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
