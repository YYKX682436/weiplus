package r45;

/* loaded from: classes2.dex */
public class ng4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462910d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462911e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462912f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462913g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462914h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462915i;

    /* renamed from: m, reason: collision with root package name */
    public r45.tg4 f462916m;

    /* renamed from: n, reason: collision with root package name */
    public r45.j74 f462917n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ng4)) {
            return false;
        }
        r45.ng4 ng4Var = (r45.ng4) fVar;
        return n51.f.a(this.f462910d, ng4Var.f462910d) && n51.f.a(this.f462911e, ng4Var.f462911e) && n51.f.a(this.f462912f, ng4Var.f462912f) && n51.f.a(this.f462913g, ng4Var.f462913g) && n51.f.a(this.f462914h, ng4Var.f462914h) && n51.f.a(this.f462915i, ng4Var.f462915i) && n51.f.a(this.f462916m, ng4Var.f462916m) && n51.f.a(this.f462917n, ng4Var.f462917n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462910d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462911e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f462912f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f462913g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f462914h;
            if (str5 != null) {
                fVar.j(2, str5);
            }
            java.lang.String str6 = this.f462915i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            r45.tg4 tg4Var = this.f462916m;
            if (tg4Var != null) {
                fVar.i(7, tg4Var.mo75928xcd1e8d8());
                this.f462916m.mo75956x3d5d1f78(fVar);
            }
            r45.j74 j74Var = this.f462917n;
            if (j74Var != null) {
                fVar.i(8, j74Var.mo75928xcd1e8d8());
                this.f462917n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f462910d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f462911e;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f462912f;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f462913g;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f462914h;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f462915i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            r45.tg4 tg4Var2 = this.f462916m;
            if (tg4Var2 != null) {
                j17 += b36.f.i(7, tg4Var2.mo75928xcd1e8d8());
            }
            r45.j74 j74Var2 = this.f462917n;
            return j74Var2 != null ? j17 + b36.f.i(8, j74Var2.mo75928xcd1e8d8()) : j17;
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
        r45.ng4 ng4Var = (r45.ng4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ng4Var.f462910d = aVar2.k(intValue);
                return 0;
            case 2:
                ng4Var.f462914h = aVar2.k(intValue);
                return 0;
            case 3:
                ng4Var.f462911e = aVar2.k(intValue);
                return 0;
            case 4:
                ng4Var.f462912f = aVar2.k(intValue);
                return 0;
            case 5:
                ng4Var.f462913g = aVar2.k(intValue);
                return 0;
            case 6:
                ng4Var.f462915i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.tg4 tg4Var3 = new r45.tg4();
                    if (bArr != null && bArr.length > 0) {
                        tg4Var3.mo11468x92b714fd(bArr);
                    }
                    ng4Var.f462916m = tg4Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.j74 j74Var3 = new r45.j74();
                    if (bArr2 != null && bArr2.length > 0) {
                        j74Var3.mo11468x92b714fd(bArr2);
                    }
                    ng4Var.f462917n = j74Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
