package r45;

/* loaded from: classes8.dex */
public class jx extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459712d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459713e;

    /* renamed from: f, reason: collision with root package name */
    public int f459714f;

    /* renamed from: g, reason: collision with root package name */
    public r45.jv3 f459715g;

    /* renamed from: h, reason: collision with root package name */
    public r45.mu5 f459716h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jx)) {
            return false;
        }
        r45.jx jxVar = (r45.jx) fVar;
        return n51.f.a(this.f76492x92037252, jxVar.f76492x92037252) && n51.f.a(this.f459712d, jxVar.f459712d) && n51.f.a(this.f459713e, jxVar.f459713e) && n51.f.a(java.lang.Integer.valueOf(this.f459714f), java.lang.Integer.valueOf(jxVar.f459714f)) && n51.f.a(this.f459715g, jxVar.f459715g) && n51.f.a(this.f459716h, jxVar.f459716h);
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
            java.lang.String str = this.f459712d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f459713e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f459714f);
            r45.jv3 jv3Var = this.f459715g;
            if (jv3Var != null) {
                fVar.i(5, jv3Var.mo75928xcd1e8d8());
                this.f459715g.mo75956x3d5d1f78(fVar);
            }
            r45.mu5 mu5Var = this.f459716h;
            if (mu5Var != null) {
                fVar.i(6, mu5Var.mo75928xcd1e8d8());
                this.f459716h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f459712d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f459713e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f459714f);
            r45.jv3 jv3Var2 = this.f459715g;
            if (jv3Var2 != null) {
                e17 += b36.f.i(5, jv3Var2.mo75928xcd1e8d8());
            }
            r45.mu5 mu5Var2 = this.f459716h;
            return mu5Var2 != null ? e17 + b36.f.i(6, mu5Var2.mo75928xcd1e8d8()) : e17;
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
        r45.jx jxVar = (r45.jx) objArr[1];
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
                    jxVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                jxVar.f459712d = aVar2.k(intValue);
                return 0;
            case 3:
                jxVar.f459713e = aVar2.k(intValue);
                return 0;
            case 4:
                jxVar.f459714f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.jv3 jv3Var3 = new r45.jv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        jv3Var3.mo11468x92b714fd(bArr2);
                    }
                    jxVar.f459715g = jv3Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.mu5 mu5Var3 = new r45.mu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        mu5Var3.mo11468x92b714fd(bArr3);
                    }
                    jxVar.f459716h = mu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
