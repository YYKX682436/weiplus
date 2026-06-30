package r45;

/* loaded from: classes8.dex */
public class hc5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.nl4 f457581d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457582e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457583f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457584g;

    /* renamed from: h, reason: collision with root package name */
    public r45.f04 f457585h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hc5)) {
            return false;
        }
        r45.hc5 hc5Var = (r45.hc5) fVar;
        return n51.f.a(this.f76492x92037252, hc5Var.f76492x92037252) && n51.f.a(this.f457581d, hc5Var.f457581d) && n51.f.a(this.f457582e, hc5Var.f457582e) && n51.f.a(this.f457583f, hc5Var.f457583f) && n51.f.a(this.f457584g, hc5Var.f457584g) && n51.f.a(this.f457585h, hc5Var.f457585h);
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
            r45.nl4 nl4Var = this.f457581d;
            if (nl4Var != null) {
                fVar.i(2, nl4Var.mo75928xcd1e8d8());
                this.f457581d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f457582e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f457583f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f457584g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.f04 f04Var = this.f457585h;
            if (f04Var != null) {
                fVar.i(100, f04Var.mo75928xcd1e8d8());
                this.f457585h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.nl4 nl4Var2 = this.f457581d;
            if (nl4Var2 != null) {
                i18 += b36.f.i(2, nl4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f457582e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f457583f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f457584g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.f04 f04Var2 = this.f457585h;
            return f04Var2 != null ? i18 + b36.f.i(100, f04Var2.mo75928xcd1e8d8()) : i18;
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
        r45.hc5 hc5Var = (r45.hc5) objArr[1];
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
                hc5Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.nl4 nl4Var3 = new r45.nl4();
                if (bArr2 != null && bArr2.length > 0) {
                    nl4Var3.mo11468x92b714fd(bArr2);
                }
                hc5Var.f457581d = nl4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            hc5Var.f457582e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            hc5Var.f457583f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            hc5Var.f457584g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.f04 f04Var3 = new r45.f04();
            if (bArr3 != null && bArr3.length > 0) {
                f04Var3.mo11468x92b714fd(bArr3);
            }
            hc5Var.f457585h = f04Var3;
        }
        return 0;
    }
}
