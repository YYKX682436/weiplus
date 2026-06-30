package r45;

/* loaded from: classes8.dex */
public class bj5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.yi5 f452340d;

    /* renamed from: e, reason: collision with root package name */
    public int f452341e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452342f;

    /* renamed from: g, reason: collision with root package name */
    public int f452343g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452344h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bj5)) {
            return false;
        }
        r45.bj5 bj5Var = (r45.bj5) fVar;
        return n51.f.a(this.f452340d, bj5Var.f452340d) && n51.f.a(java.lang.Integer.valueOf(this.f452341e), java.lang.Integer.valueOf(bj5Var.f452341e)) && n51.f.a(this.f76492x92037252, bj5Var.f76492x92037252) && n51.f.a(this.f452342f, bj5Var.f452342f) && n51.f.a(java.lang.Integer.valueOf(this.f452343g), java.lang.Integer.valueOf(bj5Var.f452343g)) && n51.f.a(this.f452344h, bj5Var.f452344h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.yi5 yi5Var = this.f452340d;
            if (yi5Var != null) {
                fVar.i(1, yi5Var.mo75928xcd1e8d8());
                this.f452340d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f452341e);
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(3, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f452342f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f452343g);
            java.lang.String str2 = this.f452344h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.yi5 yi5Var2 = this.f452340d;
            int i18 = (yi5Var2 != null ? 0 + b36.f.i(1, yi5Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f452341e);
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null) {
                i18 += b36.f.i(3, ieVar2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f452342f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f452343g);
            java.lang.String str4 = this.f452344h;
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
        r45.bj5 bj5Var = (r45.bj5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.yi5 yi5Var3 = new r45.yi5();
                    if (bArr != null && bArr.length > 0) {
                        yi5Var3.mo11468x92b714fd(bArr);
                    }
                    bj5Var.f452340d = yi5Var3;
                }
                return 0;
            case 2:
                bj5Var.f452341e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    bj5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 4:
                bj5Var.f452342f = aVar2.k(intValue);
                return 0;
            case 5:
                bj5Var.f452343g = aVar2.g(intValue);
                return 0;
            case 6:
                bj5Var.f452344h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
