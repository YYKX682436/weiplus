package r45;

/* loaded from: classes2.dex */
public class r33 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f466033d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466034e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466035f;

    /* renamed from: g, reason: collision with root package name */
    public int f466036g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f466037h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r33)) {
            return false;
        }
        r45.r33 r33Var = (r45.r33) fVar;
        return n51.f.a(this.f76492x92037252, r33Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f466033d), java.lang.Integer.valueOf(r33Var.f466033d)) && n51.f.a(this.f466034e, r33Var.f466034e) && n51.f.a(this.f466035f, r33Var.f466035f) && n51.f.a(java.lang.Integer.valueOf(this.f466036g), java.lang.Integer.valueOf(r33Var.f466036g)) && n51.f.a(this.f466037h, r33Var.f466037h);
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
            fVar.e(2, this.f466033d);
            java.lang.String str = this.f466034e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f466035f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f466036g);
            java.lang.String str3 = this.f466037h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f466033d);
            java.lang.String str4 = this.f466034e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f466035f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int e17 = i18 + b36.f.e(5, this.f466036g);
            java.lang.String str6 = this.f466037h;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        r45.r33 r33Var = (r45.r33) objArr[1];
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
                    r33Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                r33Var.f466033d = aVar2.g(intValue);
                return 0;
            case 3:
                r33Var.f466034e = aVar2.k(intValue);
                return 0;
            case 4:
                r33Var.f466035f = aVar2.k(intValue);
                return 0;
            case 5:
                r33Var.f466036g = aVar2.g(intValue);
                return 0;
            case 6:
                r33Var.f466037h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
