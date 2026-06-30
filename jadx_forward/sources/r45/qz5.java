package r45;

/* loaded from: classes8.dex */
public class qz5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465907d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f465908e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465909f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465910g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465911h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465912i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465913m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qz5)) {
            return false;
        }
        r45.qz5 qz5Var = (r45.qz5) fVar;
        return n51.f.a(this.f76494x2de60e5e, qz5Var.f76494x2de60e5e) && n51.f.a(this.f465907d, qz5Var.f465907d) && n51.f.a(this.f465908e, qz5Var.f465908e) && n51.f.a(this.f465909f, qz5Var.f465909f) && n51.f.a(this.f465910g, qz5Var.f465910g) && n51.f.a(this.f465911h, qz5Var.f465911h) && n51.f.a(this.f465912i, qz5Var.f465912i) && n51.f.a(this.f465913m, qz5Var.f465913m);
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
            java.lang.String str = this.f465907d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 2, this.f465908e);
            java.lang.String str2 = this.f465909f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f465910g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f465911h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f465912i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f465913m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f465907d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int g17 = i18 + b36.f.g(3, 2, this.f465908e);
            java.lang.String str8 = this.f465909f;
            if (str8 != null) {
                g17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f465910g;
            if (str9 != null) {
                g17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f465911h;
            if (str10 != null) {
                g17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f465912i;
            if (str11 != null) {
                g17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f465913m;
            return str12 != null ? g17 + b36.f.j(8, str12) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f465908e.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.qz5 qz5Var = (r45.qz5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    qz5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                qz5Var.f465907d = aVar2.k(intValue);
                return 0;
            case 3:
                qz5Var.f465908e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 4:
                qz5Var.f465909f = aVar2.k(intValue);
                return 0;
            case 5:
                qz5Var.f465910g = aVar2.k(intValue);
                return 0;
            case 6:
                qz5Var.f465911h = aVar2.k(intValue);
                return 0;
            case 7:
                qz5Var.f465912i = aVar2.k(intValue);
                return 0;
            case 8:
                qz5Var.f465913m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
