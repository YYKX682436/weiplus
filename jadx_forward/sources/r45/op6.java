package r45;

/* loaded from: classes9.dex */
public class op6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463962d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463963e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463964f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463965g;

    /* renamed from: h, reason: collision with root package name */
    public long f463966h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463967i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463968m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f463969n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.op6)) {
            return false;
        }
        r45.op6 op6Var = (r45.op6) fVar;
        return n51.f.a(this.f76494x2de60e5e, op6Var.f76494x2de60e5e) && n51.f.a(this.f463962d, op6Var.f463962d) && n51.f.a(this.f463963e, op6Var.f463963e) && n51.f.a(this.f463964f, op6Var.f463964f) && n51.f.a(this.f463965g, op6Var.f463965g) && n51.f.a(java.lang.Long.valueOf(this.f463966h), java.lang.Long.valueOf(op6Var.f463966h)) && n51.f.a(this.f463967i, op6Var.f463967i) && n51.f.a(this.f463968m, op6Var.f463968m) && n51.f.a(this.f463969n, op6Var.f463969n);
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
            java.lang.String str = this.f463962d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f463963e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f463964f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f463965g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.h(6, this.f463966h);
            java.lang.String str5 = this.f463967i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f463968m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f463969n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str8 = this.f463962d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f463963e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f463964f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f463965g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            int h17 = i18 + b36.f.h(6, this.f463966h);
            java.lang.String str12 = this.f463967i;
            if (str12 != null) {
                h17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f463968m;
            if (str13 != null) {
                h17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f463969n;
            return str14 != null ? h17 + b36.f.j(9, str14) : h17;
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
        r45.op6 op6Var = (r45.op6) objArr[1];
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
                    op6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                op6Var.f463962d = aVar2.k(intValue);
                return 0;
            case 3:
                op6Var.f463963e = aVar2.k(intValue);
                return 0;
            case 4:
                op6Var.f463964f = aVar2.k(intValue);
                return 0;
            case 5:
                op6Var.f463965g = aVar2.k(intValue);
                return 0;
            case 6:
                op6Var.f463966h = aVar2.i(intValue);
                return 0;
            case 7:
                op6Var.f463967i = aVar2.k(intValue);
                return 0;
            case 8:
                op6Var.f463968m = aVar2.k(intValue);
                return 0;
            case 9:
                op6Var.f463969n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
