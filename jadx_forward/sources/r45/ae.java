package r45;

/* loaded from: classes2.dex */
public class ae extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451486d;

    /* renamed from: e, reason: collision with root package name */
    public int f451487e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451488f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451489g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ms5 f451490h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451491i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451492m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f451493n;

    /* renamed from: o, reason: collision with root package name */
    public int f451494o;

    /* renamed from: p, reason: collision with root package name */
    public int f451495p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ae)) {
            return false;
        }
        r45.ae aeVar = (r45.ae) fVar;
        return n51.f.a(this.f451486d, aeVar.f451486d) && n51.f.a(java.lang.Integer.valueOf(this.f451487e), java.lang.Integer.valueOf(aeVar.f451487e)) && n51.f.a(this.f451488f, aeVar.f451488f) && n51.f.a(this.f451489g, aeVar.f451489g) && n51.f.a(this.f451490h, aeVar.f451490h) && n51.f.a(this.f451491i, aeVar.f451491i) && n51.f.a(this.f451492m, aeVar.f451492m) && n51.f.a(this.f451493n, aeVar.f451493n) && n51.f.a(java.lang.Integer.valueOf(this.f451494o), java.lang.Integer.valueOf(aeVar.f451494o)) && n51.f.a(java.lang.Integer.valueOf(this.f451495p), java.lang.Integer.valueOf(aeVar.f451495p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451486d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f451487e);
            java.lang.String str2 = this.f451488f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f451489g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.ms5 ms5Var = this.f451490h;
            if (ms5Var != null) {
                fVar.i(5, ms5Var.mo75928xcd1e8d8());
                this.f451490h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f451491i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f451492m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f451493n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f451494o);
            fVar.e(10, this.f451495p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f451486d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f451487e);
            java.lang.String str8 = this.f451488f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f451489g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            r45.ms5 ms5Var2 = this.f451490h;
            if (ms5Var2 != null) {
                j17 += b36.f.i(5, ms5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f451491i;
            if (str10 != null) {
                j17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f451492m;
            if (str11 != null) {
                j17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f451493n;
            if (str12 != null) {
                j17 += b36.f.j(8, str12);
            }
            return j17 + b36.f.e(9, this.f451494o) + b36.f.e(10, this.f451495p);
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
        r45.ae aeVar = (r45.ae) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aeVar.f451486d = aVar2.k(intValue);
                return 0;
            case 2:
                aeVar.f451487e = aVar2.g(intValue);
                return 0;
            case 3:
                aeVar.f451488f = aVar2.k(intValue);
                return 0;
            case 4:
                aeVar.f451489g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.ms5 ms5Var3 = new r45.ms5();
                    if (bArr != null && bArr.length > 0) {
                        ms5Var3.mo11468x92b714fd(bArr);
                    }
                    aeVar.f451490h = ms5Var3;
                }
                return 0;
            case 6:
                aeVar.f451491i = aVar2.k(intValue);
                return 0;
            case 7:
                aeVar.f451492m = aVar2.k(intValue);
                return 0;
            case 8:
                aeVar.f451493n = aVar2.k(intValue);
                return 0;
            case 9:
                aeVar.f451494o = aVar2.g(intValue);
                return 0;
            case 10:
                aeVar.f451495p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
