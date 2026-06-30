package r45;

/* loaded from: classes9.dex */
public class x73 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471373d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471374e;

    /* renamed from: f, reason: collision with root package name */
    public int f471375f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471376g;

    /* renamed from: h, reason: collision with root package name */
    public r45.v67 f471377h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x73)) {
            return false;
        }
        r45.x73 x73Var = (r45.x73) fVar;
        return n51.f.a(this.f76492x92037252, x73Var.f76492x92037252) && n51.f.a(this.f471373d, x73Var.f471373d) && n51.f.a(this.f471374e, x73Var.f471374e) && n51.f.a(java.lang.Integer.valueOf(this.f471375f), java.lang.Integer.valueOf(x73Var.f471375f)) && n51.f.a(this.f471376g, x73Var.f471376g) && n51.f.a(this.f471377h, x73Var.f471377h);
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
            java.lang.String str = this.f471373d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f471374e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f471375f);
            java.lang.String str3 = this.f471376g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.v67 v67Var = this.f471377h;
            if (v67Var != null) {
                fVar.i(6, v67Var.mo75928xcd1e8d8());
                this.f471377h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f471373d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f471374e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f471375f);
            java.lang.String str6 = this.f471376g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            r45.v67 v67Var2 = this.f471377h;
            return v67Var2 != null ? e17 + b36.f.i(6, v67Var2.mo75928xcd1e8d8()) : e17;
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
        r45.x73 x73Var = (r45.x73) objArr[1];
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
                    x73Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                x73Var.f471373d = aVar2.k(intValue);
                return 0;
            case 3:
                x73Var.f471374e = aVar2.k(intValue);
                return 0;
            case 4:
                x73Var.f471375f = aVar2.g(intValue);
                return 0;
            case 5:
                x73Var.f471376g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.v67 v67Var3 = new r45.v67();
                    if (bArr2 != null && bArr2.length > 0) {
                        v67Var3.mo11468x92b714fd(bArr2);
                    }
                    x73Var.f471377h = v67Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
