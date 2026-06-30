package r45;

/* loaded from: classes8.dex */
public class iq6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f458804d;

    /* renamed from: e, reason: collision with root package name */
    public int f458805e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458806f;

    /* renamed from: g, reason: collision with root package name */
    public r45.h05 f458807g;

    /* renamed from: h, reason: collision with root package name */
    public r45.k05 f458808h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iq6)) {
            return false;
        }
        r45.iq6 iq6Var = (r45.iq6) fVar;
        return n51.f.a(this.f76492x92037252, iq6Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f458804d), java.lang.Integer.valueOf(iq6Var.f458804d)) && n51.f.a(java.lang.Integer.valueOf(this.f458805e), java.lang.Integer.valueOf(iq6Var.f458805e)) && n51.f.a(this.f458806f, iq6Var.f458806f) && n51.f.a(this.f458807g, iq6Var.f458807g) && n51.f.a(this.f458808h, iq6Var.f458808h);
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
            fVar.e(2, this.f458804d);
            fVar.e(3, this.f458805e);
            java.lang.String str = this.f458806f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.h05 h05Var = this.f458807g;
            if (h05Var != null) {
                fVar.i(5, h05Var.mo75928xcd1e8d8());
                this.f458807g.mo75956x3d5d1f78(fVar);
            }
            r45.k05 k05Var = this.f458808h;
            if (k05Var != null) {
                fVar.i(6, k05Var.mo75928xcd1e8d8());
                this.f458808h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f458804d) + b36.f.e(3, this.f458805e);
            java.lang.String str2 = this.f458806f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            r45.h05 h05Var2 = this.f458807g;
            if (h05Var2 != null) {
                i18 += b36.f.i(5, h05Var2.mo75928xcd1e8d8());
            }
            r45.k05 k05Var2 = this.f458808h;
            return k05Var2 != null ? i18 + b36.f.i(6, k05Var2.mo75928xcd1e8d8()) : i18;
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
        r45.iq6 iq6Var = (r45.iq6) objArr[1];
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
                    iq6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                iq6Var.f458804d = aVar2.g(intValue);
                return 0;
            case 3:
                iq6Var.f458805e = aVar2.g(intValue);
                return 0;
            case 4:
                iq6Var.f458806f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.h05 h05Var3 = new r45.h05();
                    if (bArr2 != null && bArr2.length > 0) {
                        h05Var3.mo11468x92b714fd(bArr2);
                    }
                    iq6Var.f458807g = h05Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.k05 k05Var3 = new r45.k05();
                    if (bArr3 != null && bArr3.length > 0) {
                        k05Var3.mo11468x92b714fd(bArr3);
                    }
                    iq6Var.f458808h = k05Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
