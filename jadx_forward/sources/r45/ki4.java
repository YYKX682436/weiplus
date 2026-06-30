package r45;

/* loaded from: classes12.dex */
public class ki4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f460249d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ig0 f460250e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460251f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460252g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460253h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460254i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460255m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ki4)) {
            return false;
        }
        r45.ki4 ki4Var = (r45.ki4) fVar;
        return n51.f.a(this.f460249d, ki4Var.f460249d) && n51.f.a(this.f460250e, ki4Var.f460250e) && n51.f.a(this.f460251f, ki4Var.f460251f) && n51.f.a(this.f460252g, ki4Var.f460252g) && n51.f.a(this.f460253h, ki4Var.f460253h) && n51.f.a(this.f460254i, ki4Var.f460254i) && n51.f.a(this.f460255m, ki4Var.f460255m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cu5 cu5Var = this.f460249d;
            if (cu5Var != null) {
                fVar.i(1, cu5Var.mo75928xcd1e8d8());
                this.f460249d.mo75956x3d5d1f78(fVar);
            }
            r45.ig0 ig0Var = this.f460250e;
            if (ig0Var != null) {
                fVar.i(2, ig0Var.mo75928xcd1e8d8());
                this.f460250e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f460251f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f460252g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f460253h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f460254i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f460255m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.cu5 cu5Var2 = this.f460249d;
            int i18 = cu5Var2 != null ? 0 + b36.f.i(1, cu5Var2.mo75928xcd1e8d8()) : 0;
            r45.ig0 ig0Var2 = this.f460250e;
            if (ig0Var2 != null) {
                i18 += b36.f.i(2, ig0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f460251f;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f460252g;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f460253h;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f460254i;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f460255m;
            return str10 != null ? i18 + b36.f.j(7, str10) : i18;
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
        r45.ki4 ki4Var = (r45.ki4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    ki4Var.f460249d = cu5Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ig0 ig0Var3 = new r45.ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig0Var3.mo11468x92b714fd(bArr2);
                    }
                    ki4Var.f460250e = ig0Var3;
                }
                return 0;
            case 3:
                ki4Var.f460251f = aVar2.k(intValue);
                return 0;
            case 4:
                ki4Var.f460252g = aVar2.k(intValue);
                return 0;
            case 5:
                ki4Var.f460253h = aVar2.k(intValue);
                return 0;
            case 6:
                ki4Var.f460254i = aVar2.k(intValue);
                return 0;
            case 7:
                ki4Var.f460255m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
