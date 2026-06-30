package r45;

/* loaded from: classes9.dex */
public class l extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f460584d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460585e = "请求不成功，请稍候再试";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460586f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460587g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g0 f460588h;

    /* renamed from: i, reason: collision with root package name */
    public r45.a f460589i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l)) {
            return false;
        }
        r45.l lVar = (r45.l) fVar;
        return n51.f.a(this.f76492x92037252, lVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f460584d), java.lang.Integer.valueOf(lVar.f460584d)) && n51.f.a(this.f460585e, lVar.f460585e) && n51.f.a(this.f460586f, lVar.f460586f) && n51.f.a(this.f460587g, lVar.f460587g) && n51.f.a(this.f460588h, lVar.f460588h) && n51.f.a(this.f460589i, lVar.f460589i);
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
            fVar.e(2, this.f460584d);
            java.lang.String str = this.f460585e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f460586f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f460587g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.g0 g0Var = this.f460588h;
            if (g0Var != null) {
                fVar.i(6, g0Var.mo75928xcd1e8d8());
                this.f460588h.mo75956x3d5d1f78(fVar);
            }
            r45.a aVar = this.f460589i;
            if (aVar != null) {
                fVar.i(7, aVar.mo75928xcd1e8d8());
                this.f460589i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f460584d);
            java.lang.String str4 = this.f460585e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f460586f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f460587g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.g0 g0Var2 = this.f460588h;
            if (g0Var2 != null) {
                i18 += b36.f.i(6, g0Var2.mo75928xcd1e8d8());
            }
            r45.a aVar2 = this.f460589i;
            return aVar2 != null ? i18 + b36.f.i(7, aVar2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3)) {
                if (!super.mo75949x4476b383(aVar3, this, m75958x5767edba)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        r45.l lVar = (r45.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    lVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                lVar.f460584d = aVar4.g(intValue);
                return 0;
            case 3:
                lVar.f460585e = aVar4.k(intValue);
                return 0;
            case 4:
                lVar.f460586f = aVar4.k(intValue);
                return 0;
            case 5:
                lVar.f460587g = aVar4.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.g0 g0Var3 = new r45.g0();
                    if (bArr2 != null && bArr2.length > 0) {
                        g0Var3.mo11468x92b714fd(bArr2);
                    }
                    lVar.f460588h = g0Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.a aVar5 = new r45.a();
                    if (bArr3 != null && bArr3.length > 0) {
                        aVar5.mo11468x92b714fd(bArr3);
                    }
                    lVar.f460589i = aVar5;
                }
                return 0;
            default:
                return -1;
        }
    }
}
