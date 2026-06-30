package r45;

/* loaded from: classes9.dex */
public class jq5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f459588d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459589e;

    /* renamed from: f, reason: collision with root package name */
    public int f459590f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459591g;

    /* renamed from: h, reason: collision with root package name */
    public int f459592h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459593i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459594m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jq5)) {
            return false;
        }
        r45.jq5 jq5Var = (r45.jq5) fVar;
        return n51.f.a(this.f76494x2de60e5e, jq5Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f459588d), java.lang.Integer.valueOf(jq5Var.f459588d)) && n51.f.a(this.f459589e, jq5Var.f459589e) && n51.f.a(java.lang.Integer.valueOf(this.f459590f), java.lang.Integer.valueOf(jq5Var.f459590f)) && n51.f.a(this.f459591g, jq5Var.f459591g) && n51.f.a(java.lang.Integer.valueOf(this.f459592h), java.lang.Integer.valueOf(jq5Var.f459592h)) && n51.f.a(this.f459593i, jq5Var.f459593i) && n51.f.a(this.f459594m, jq5Var.f459594m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f459588d);
            java.lang.String str = this.f459589e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f459590f);
            java.lang.String str2 = this.f459591g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f459592h);
            java.lang.String str3 = this.f459593i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f459594m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f459588d);
            java.lang.String str5 = this.f459589e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f459590f);
            java.lang.String str6 = this.f459591g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            int e18 = e17 + b36.f.e(6, this.f459592h);
            java.lang.String str7 = this.f459593i;
            if (str7 != null) {
                e18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f459594m;
            return str8 != null ? e18 + b36.f.j(8, str8) : e18;
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
        r45.jq5 jq5Var = (r45.jq5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    jq5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                jq5Var.f459588d = aVar2.g(intValue);
                return 0;
            case 3:
                jq5Var.f459589e = aVar2.k(intValue);
                return 0;
            case 4:
                jq5Var.f459590f = aVar2.g(intValue);
                return 0;
            case 5:
                jq5Var.f459591g = aVar2.k(intValue);
                return 0;
            case 6:
                jq5Var.f459592h = aVar2.g(intValue);
                return 0;
            case 7:
                jq5Var.f459593i = aVar2.k(intValue);
                return 0;
            case 8:
                jq5Var.f459594m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
