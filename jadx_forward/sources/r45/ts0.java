package r45;

/* loaded from: classes9.dex */
public class ts0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468282d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468283e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f468284f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468285g;

    /* renamed from: h, reason: collision with root package name */
    public int f468286h;

    /* renamed from: i, reason: collision with root package name */
    public r45.od6 f468287i;

    /* renamed from: m, reason: collision with root package name */
    public r45.lz6 f468288m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f468289n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ts0)) {
            return false;
        }
        r45.ts0 ts0Var = (r45.ts0) fVar;
        return n51.f.a(this.f468282d, ts0Var.f468282d) && n51.f.a(this.f468283e, ts0Var.f468283e) && n51.f.a(this.f468284f, ts0Var.f468284f) && n51.f.a(this.f468285g, ts0Var.f468285g) && n51.f.a(java.lang.Integer.valueOf(this.f468286h), java.lang.Integer.valueOf(ts0Var.f468286h)) && n51.f.a(this.f468287i, ts0Var.f468287i) && n51.f.a(this.f468288m, ts0Var.f468288m) && n51.f.a(this.f468289n, ts0Var.f468289n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468284f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468282d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f468283e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str3 = this.f468285g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f468286h);
            r45.od6 od6Var = this.f468287i;
            if (od6Var != null) {
                fVar.i(6, od6Var.mo75928xcd1e8d8());
                this.f468287i.mo75956x3d5d1f78(fVar);
            }
            r45.lz6 lz6Var = this.f468288m;
            if (lz6Var != null) {
                fVar.i(7, lz6Var.mo75928xcd1e8d8());
                this.f468288m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f468289n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f468282d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f468283e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            java.lang.String str7 = this.f468285g;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            int e17 = g17 + b36.f.e(5, this.f468286h);
            r45.od6 od6Var2 = this.f468287i;
            if (od6Var2 != null) {
                e17 += b36.f.i(6, od6Var2.mo75928xcd1e8d8());
            }
            r45.lz6 lz6Var2 = this.f468288m;
            if (lz6Var2 != null) {
                e17 += b36.f.i(7, lz6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f468289n;
            return str8 != null ? e17 + b36.f.j(8, str8) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.ts0 ts0Var = (r45.ts0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ts0Var.f468282d = aVar2.k(intValue);
                return 0;
            case 2:
                ts0Var.f468283e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.us0 us0Var = new r45.us0();
                    if (bArr2 != null && bArr2.length > 0) {
                        us0Var.mo11468x92b714fd(bArr2);
                    }
                    ts0Var.f468284f.add(us0Var);
                }
                return 0;
            case 4:
                ts0Var.f468285g = aVar2.k(intValue);
                return 0;
            case 5:
                ts0Var.f468286h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.od6 od6Var3 = new r45.od6();
                    if (bArr3 != null && bArr3.length > 0) {
                        od6Var3.mo11468x92b714fd(bArr3);
                    }
                    ts0Var.f468287i = od6Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.lz6 lz6Var3 = new r45.lz6();
                    if (bArr4 != null && bArr4.length > 0) {
                        lz6Var3.mo11468x92b714fd(bArr4);
                    }
                    ts0Var.f468288m = lz6Var3;
                }
                return 0;
            case 8:
                ts0Var.f468289n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
