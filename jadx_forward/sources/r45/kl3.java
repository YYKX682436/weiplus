package r45;

/* loaded from: classes4.dex */
public class kl3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460339d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460340e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460341f;

    /* renamed from: g, reason: collision with root package name */
    public float f460342g;

    /* renamed from: h, reason: collision with root package name */
    public float f460343h;

    /* renamed from: i, reason: collision with root package name */
    public float f460344i;

    /* renamed from: m, reason: collision with root package name */
    public int f460345m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kl3)) {
            return false;
        }
        r45.kl3 kl3Var = (r45.kl3) fVar;
        return n51.f.a(this.f76492x92037252, kl3Var.f76492x92037252) && n51.f.a(this.f460339d, kl3Var.f460339d) && n51.f.a(this.f460340e, kl3Var.f460340e) && n51.f.a(this.f460341f, kl3Var.f460341f) && n51.f.a(java.lang.Float.valueOf(this.f460342g), java.lang.Float.valueOf(kl3Var.f460342g)) && n51.f.a(java.lang.Float.valueOf(this.f460343h), java.lang.Float.valueOf(kl3Var.f460343h)) && n51.f.a(java.lang.Float.valueOf(this.f460344i), java.lang.Float.valueOf(kl3Var.f460344i)) && n51.f.a(java.lang.Integer.valueOf(this.f460345m), java.lang.Integer.valueOf(kl3Var.f460345m));
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
            java.lang.String str = this.f460339d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460340e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f460341f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.d(5, this.f460342g);
            fVar.d(6, this.f460343h);
            fVar.d(7, this.f460344i);
            fVar.e(8, this.f460345m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f460339d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f460340e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f460341f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            return i18 + b36.f.d(5, this.f460342g) + b36.f.d(6, this.f460343h) + b36.f.d(7, this.f460344i) + b36.f.e(8, this.f460345m);
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
        r45.kl3 kl3Var = (r45.kl3) objArr[1];
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
                    kl3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                kl3Var.f460339d = aVar2.k(intValue);
                return 0;
            case 3:
                kl3Var.f460340e = aVar2.k(intValue);
                return 0;
            case 4:
                kl3Var.f460341f = aVar2.k(intValue);
                return 0;
            case 5:
                kl3Var.f460342g = aVar2.f(intValue);
                return 0;
            case 6:
                kl3Var.f460343h = aVar2.f(intValue);
                return 0;
            case 7:
                kl3Var.f460344i = aVar2.f(intValue);
                return 0;
            case 8:
                kl3Var.f460345m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
