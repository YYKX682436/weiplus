package r45;

/* loaded from: classes9.dex */
public class fy extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f456253d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456254e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yr6 f456255f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456256g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g04 f456257h;

    /* renamed from: i, reason: collision with root package name */
    public r45.g04 f456258i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fy)) {
            return false;
        }
        r45.fy fyVar = (r45.fy) fVar;
        return n51.f.a(this.f76492x92037252, fyVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f456253d), java.lang.Integer.valueOf(fyVar.f456253d)) && n51.f.a(this.f456254e, fyVar.f456254e) && n51.f.a(this.f456255f, fyVar.f456255f) && n51.f.a(this.f456256g, fyVar.f456256g) && n51.f.a(this.f456257h, fyVar.f456257h) && n51.f.a(this.f456258i, fyVar.f456258i);
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
            fVar.e(2, this.f456253d);
            java.lang.String str = this.f456254e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.yr6 yr6Var = this.f456255f;
            if (yr6Var != null) {
                fVar.i(4, yr6Var.mo75928xcd1e8d8());
                this.f456255f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f456256g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.g04 g04Var = this.f456257h;
            if (g04Var != null) {
                fVar.i(6, g04Var.mo75928xcd1e8d8());
                this.f456257h.mo75956x3d5d1f78(fVar);
            }
            r45.g04 g04Var2 = this.f456258i;
            if (g04Var2 != null) {
                fVar.i(7, g04Var2.mo75928xcd1e8d8());
                this.f456258i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f456253d);
            java.lang.String str3 = this.f456254e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.yr6 yr6Var2 = this.f456255f;
            if (yr6Var2 != null) {
                i18 += b36.f.i(4, yr6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f456256g;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            r45.g04 g04Var3 = this.f456257h;
            if (g04Var3 != null) {
                i18 += b36.f.i(6, g04Var3.mo75928xcd1e8d8());
            }
            r45.g04 g04Var4 = this.f456258i;
            return g04Var4 != null ? i18 + b36.f.i(7, g04Var4.mo75928xcd1e8d8()) : i18;
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
        r45.fy fyVar = (r45.fy) objArr[1];
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
                    fyVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                fyVar.f456253d = aVar2.g(intValue);
                return 0;
            case 3:
                fyVar.f456254e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.yr6 yr6Var3 = new r45.yr6();
                    if (bArr2 != null && bArr2.length > 0) {
                        yr6Var3.mo11468x92b714fd(bArr2);
                    }
                    fyVar.f456255f = yr6Var3;
                }
                return 0;
            case 5:
                fyVar.f456256g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.g04 g04Var5 = new r45.g04();
                    if (bArr3 != null && bArr3.length > 0) {
                        g04Var5.mo11468x92b714fd(bArr3);
                    }
                    fyVar.f456257h = g04Var5;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.g04 g04Var6 = new r45.g04();
                    if (bArr4 != null && bArr4.length > 0) {
                        g04Var6.mo11468x92b714fd(bArr4);
                    }
                    fyVar.f456258i = g04Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
