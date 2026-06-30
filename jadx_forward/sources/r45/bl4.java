package r45;

/* loaded from: classes4.dex */
public class bl4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452385d;

    /* renamed from: e, reason: collision with root package name */
    public long f452386e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452387f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452388g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452389h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bl4)) {
            return false;
        }
        r45.bl4 bl4Var = (r45.bl4) fVar;
        return n51.f.a(this.f76494x2de60e5e, bl4Var.f76494x2de60e5e) && n51.f.a(this.f452385d, bl4Var.f452385d) && n51.f.a(java.lang.Long.valueOf(this.f452386e), java.lang.Long.valueOf(bl4Var.f452386e)) && n51.f.a(this.f452387f, bl4Var.f452387f) && n51.f.a(this.f452388g, bl4Var.f452388g) && n51.f.a(this.f452389h, bl4Var.f452389h);
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
            java.lang.String str = this.f452385d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f452386e);
            java.lang.String str2 = this.f452387f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f452388g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f452389h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f452385d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int h17 = i18 + b36.f.h(3, this.f452386e);
            java.lang.String str6 = this.f452387f;
            if (str6 != null) {
                h17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f452388g;
            if (str7 != null) {
                h17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f452389h;
            return str8 != null ? h17 + b36.f.j(6, str8) : h17;
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
        r45.bl4 bl4Var = (r45.bl4) objArr[1];
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
                    bl4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                bl4Var.f452385d = aVar2.k(intValue);
                return 0;
            case 3:
                bl4Var.f452386e = aVar2.i(intValue);
                return 0;
            case 4:
                bl4Var.f452387f = aVar2.k(intValue);
                return 0;
            case 5:
                bl4Var.f452388g = aVar2.k(intValue);
                return 0;
            case 6:
                bl4Var.f452389h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
