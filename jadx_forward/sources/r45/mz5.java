package r45;

/* loaded from: classes8.dex */
public class mz5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462483d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462484e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462485f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462486g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462487h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462488i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mz5)) {
            return false;
        }
        r45.mz5 mz5Var = (r45.mz5) fVar;
        return n51.f.a(this.f76494x2de60e5e, mz5Var.f76494x2de60e5e) && n51.f.a(this.f462483d, mz5Var.f462483d) && n51.f.a(this.f462484e, mz5Var.f462484e) && n51.f.a(this.f462485f, mz5Var.f462485f) && n51.f.a(this.f462486g, mz5Var.f462486g) && n51.f.a(this.f462487h, mz5Var.f462487h) && n51.f.a(this.f462488i, mz5Var.f462488i);
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
            java.lang.String str = this.f462483d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f462484e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f462485f;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f462486g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f462487h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f462488i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f462483d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f462484e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f462485f;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f462486g;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f462487h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f462488i;
            return str12 != null ? i18 + b36.f.j(7, str12) : i18;
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
        r45.mz5 mz5Var = (r45.mz5) objArr[1];
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
                    mz5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                mz5Var.f462483d = aVar2.k(intValue);
                return 0;
            case 3:
                mz5Var.f462484e = aVar2.k(intValue);
                return 0;
            case 4:
                mz5Var.f462486g = aVar2.k(intValue);
                return 0;
            case 5:
                mz5Var.f462485f = aVar2.k(intValue);
                return 0;
            case 6:
                mz5Var.f462487h = aVar2.k(intValue);
                return 0;
            case 7:
                mz5Var.f462488i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
