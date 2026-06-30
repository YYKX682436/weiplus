package r45;

/* loaded from: classes4.dex */
public class hn0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f457840d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457841e;

    /* renamed from: f, reason: collision with root package name */
    public int f457842f;

    /* renamed from: g, reason: collision with root package name */
    public int f457843g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457844h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hn0)) {
            return false;
        }
        r45.hn0 hn0Var = (r45.hn0) fVar;
        return n51.f.a(this.f76492x92037252, hn0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f457840d), java.lang.Integer.valueOf(hn0Var.f457840d)) && n51.f.a(this.f457841e, hn0Var.f457841e) && n51.f.a(java.lang.Integer.valueOf(this.f457842f), java.lang.Integer.valueOf(hn0Var.f457842f)) && n51.f.a(java.lang.Integer.valueOf(this.f457843g), java.lang.Integer.valueOf(hn0Var.f457843g)) && n51.f.a(this.f457844h, hn0Var.f457844h);
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
            fVar.e(2, this.f457840d);
            java.lang.String str = this.f457841e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f457842f);
            fVar.e(5, this.f457843g);
            java.lang.String str2 = this.f457844h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f457840d);
            java.lang.String str3 = this.f457841e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f457842f) + b36.f.e(5, this.f457843g);
            java.lang.String str4 = this.f457844h;
            return str4 != null ? e17 + b36.f.j(6, str4) : e17;
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
        r45.hn0 hn0Var = (r45.hn0) objArr[1];
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
                    hn0Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                hn0Var.f457840d = aVar2.g(intValue);
                return 0;
            case 3:
                hn0Var.f457841e = aVar2.k(intValue);
                return 0;
            case 4:
                hn0Var.f457842f = aVar2.g(intValue);
                return 0;
            case 5:
                hn0Var.f457843g = aVar2.g(intValue);
                return 0;
            case 6:
                hn0Var.f457844h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
