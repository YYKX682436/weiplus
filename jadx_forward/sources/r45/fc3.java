package r45;

/* loaded from: classes8.dex */
public class fc3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f455729d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f455730e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455731f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455732g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455733h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455734i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f455735m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455736n;

    /* renamed from: o, reason: collision with root package name */
    public int f455737o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fc3)) {
            return false;
        }
        r45.fc3 fc3Var = (r45.fc3) fVar;
        return n51.f.a(this.f76494x2de60e5e, fc3Var.f76494x2de60e5e) && n51.f.a(this.f455729d, fc3Var.f455729d) && n51.f.a(java.lang.Integer.valueOf(this.f455730e), java.lang.Integer.valueOf(fc3Var.f455730e)) && n51.f.a(this.f455731f, fc3Var.f455731f) && n51.f.a(this.f455732g, fc3Var.f455732g) && n51.f.a(this.f455733h, fc3Var.f455733h) && n51.f.a(this.f455734i, fc3Var.f455734i) && n51.f.a(this.f455735m, fc3Var.f455735m) && n51.f.a(this.f455736n, fc3Var.f455736n) && n51.f.a(java.lang.Integer.valueOf(this.f455737o), java.lang.Integer.valueOf(fc3Var.f455737o));
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
            fVar.g(2, 8, this.f455729d);
            fVar.e(3, this.f455730e);
            java.lang.String str = this.f455731f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f455732g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f455733h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f455734i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f455735m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f455736n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.e(10, this.f455737o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, this.f455729d) + b36.f.e(3, this.f455730e);
            java.lang.String str7 = this.f455731f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f455732g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f455733h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f455734i;
            if (str10 != null) {
                i18 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f455735m;
            if (str11 != null) {
                i18 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f455736n;
            if (str12 != null) {
                i18 += b36.f.j(9, str12);
            }
            return i18 + b36.f.e(10, this.f455737o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f455729d.clear();
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
        r45.fc3 fc3Var = (r45.fc3) objArr[1];
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
                    fc3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.hu huVar = new r45.hu();
                    if (bArr3 != null && bArr3.length > 0) {
                        huVar.mo11468x92b714fd(bArr3);
                    }
                    fc3Var.f455729d.add(huVar);
                }
                return 0;
            case 3:
                fc3Var.f455730e = aVar2.g(intValue);
                return 0;
            case 4:
                fc3Var.f455731f = aVar2.k(intValue);
                return 0;
            case 5:
                fc3Var.f455732g = aVar2.k(intValue);
                return 0;
            case 6:
                fc3Var.f455733h = aVar2.k(intValue);
                return 0;
            case 7:
                fc3Var.f455734i = aVar2.k(intValue);
                return 0;
            case 8:
                fc3Var.f455735m = aVar2.k(intValue);
                return 0;
            case 9:
                fc3Var.f455736n = aVar2.k(intValue);
                return 0;
            case 10:
                fc3Var.f455737o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
