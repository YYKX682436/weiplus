package r45;

/* loaded from: classes9.dex */
public class j extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f458959d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458960e = "请求不成功，请稍候再试";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458961f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458962g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g0 f458963h;

    /* renamed from: i, reason: collision with root package name */
    public r45.a f458964i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j)) {
            return false;
        }
        r45.j jVar = (r45.j) fVar;
        return n51.f.a(this.f76492x92037252, jVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f458959d), java.lang.Integer.valueOf(jVar.f458959d)) && n51.f.a(this.f458960e, jVar.f458960e) && n51.f.a(this.f458961f, jVar.f458961f) && n51.f.a(this.f458962g, jVar.f458962g) && n51.f.a(this.f458963h, jVar.f458963h) && n51.f.a(this.f458964i, jVar.f458964i);
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
            fVar.e(2, this.f458959d);
            java.lang.String str = this.f458960e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f458961f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f458962g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.g0 g0Var = this.f458963h;
            if (g0Var != null) {
                fVar.i(6, g0Var.mo75928xcd1e8d8());
                this.f458963h.mo75956x3d5d1f78(fVar);
            }
            r45.a aVar = this.f458964i;
            if (aVar != null) {
                fVar.i(7, aVar.mo75928xcd1e8d8());
                this.f458964i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f458959d);
            java.lang.String str4 = this.f458960e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f458961f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f458962g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.g0 g0Var2 = this.f458963h;
            if (g0Var2 != null) {
                i18 += b36.f.i(6, g0Var2.mo75928xcd1e8d8());
            }
            r45.a aVar2 = this.f458964i;
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
        r45.j jVar = (r45.j) objArr[1];
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
                    jVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                jVar.f458959d = aVar4.g(intValue);
                return 0;
            case 3:
                jVar.f458960e = aVar4.k(intValue);
                return 0;
            case 4:
                jVar.f458961f = aVar4.k(intValue);
                return 0;
            case 5:
                jVar.f458962g = aVar4.k(intValue);
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
                    jVar.f458963h = g0Var3;
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
                    jVar.f458964i = aVar5;
                }
                return 0;
            default:
                return -1;
        }
    }
}
