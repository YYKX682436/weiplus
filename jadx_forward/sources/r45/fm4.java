package r45;

/* loaded from: classes9.dex */
public class fm4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455978d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455979e;

    /* renamed from: f, reason: collision with root package name */
    public int f455980f;

    /* renamed from: g, reason: collision with root package name */
    public int f455981g;

    /* renamed from: h, reason: collision with root package name */
    public r45.dd5 f455982h;

    /* renamed from: i, reason: collision with root package name */
    public r45.rl4 f455983i;

    /* renamed from: m, reason: collision with root package name */
    public r45.mm4 f455984m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fm4)) {
            return false;
        }
        r45.fm4 fm4Var = (r45.fm4) fVar;
        return n51.f.a(this.f455978d, fm4Var.f455978d) && n51.f.a(this.f455979e, fm4Var.f455979e) && n51.f.a(java.lang.Integer.valueOf(this.f455980f), java.lang.Integer.valueOf(fm4Var.f455980f)) && n51.f.a(java.lang.Integer.valueOf(this.f455981g), java.lang.Integer.valueOf(fm4Var.f455981g)) && n51.f.a(this.f455982h, fm4Var.f455982h) && n51.f.a(this.f455983i, fm4Var.f455983i) && n51.f.a(this.f455984m, fm4Var.f455984m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455978d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f455979e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f455980f);
            fVar.e(4, this.f455981g);
            r45.dd5 dd5Var = this.f455982h;
            if (dd5Var != null) {
                fVar.i(5, dd5Var.mo75928xcd1e8d8());
                this.f455982h.mo75956x3d5d1f78(fVar);
            }
            r45.rl4 rl4Var = this.f455983i;
            if (rl4Var != null) {
                fVar.i(6, rl4Var.mo75928xcd1e8d8());
                this.f455983i.mo75956x3d5d1f78(fVar);
            }
            r45.mm4 mm4Var = this.f455984m;
            if (mm4Var != null) {
                fVar.i(7, mm4Var.mo75928xcd1e8d8());
                this.f455984m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f455978d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f455979e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int e17 = j17 + b36.f.e(3, this.f455980f) + b36.f.e(4, this.f455981g);
            r45.dd5 dd5Var2 = this.f455982h;
            if (dd5Var2 != null) {
                e17 += b36.f.i(5, dd5Var2.mo75928xcd1e8d8());
            }
            r45.rl4 rl4Var2 = this.f455983i;
            if (rl4Var2 != null) {
                e17 += b36.f.i(6, rl4Var2.mo75928xcd1e8d8());
            }
            r45.mm4 mm4Var2 = this.f455984m;
            return mm4Var2 != null ? e17 + b36.f.i(7, mm4Var2.mo75928xcd1e8d8()) : e17;
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
        r45.fm4 fm4Var = (r45.fm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fm4Var.f455978d = aVar2.k(intValue);
                return 0;
            case 2:
                fm4Var.f455979e = aVar2.k(intValue);
                return 0;
            case 3:
                fm4Var.f455980f = aVar2.g(intValue);
                return 0;
            case 4:
                fm4Var.f455981g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.dd5 dd5Var3 = new r45.dd5();
                    if (bArr != null && bArr.length > 0) {
                        dd5Var3.mo11468x92b714fd(bArr);
                    }
                    fm4Var.f455982h = dd5Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.rl4 rl4Var3 = new r45.rl4();
                    if (bArr2 != null && bArr2.length > 0) {
                        rl4Var3.mo11468x92b714fd(bArr2);
                    }
                    fm4Var.f455983i = rl4Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.mm4 mm4Var3 = new r45.mm4();
                    if (bArr3 != null && bArr3.length > 0) {
                        mm4Var3.mo11468x92b714fd(bArr3);
                    }
                    fm4Var.f455984m = mm4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
