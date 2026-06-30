package r45;

/* loaded from: classes15.dex */
public class wf4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470658d;

    /* renamed from: e, reason: collision with root package name */
    public int f470659e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470660f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470661g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470662h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470663i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470664m;

    /* renamed from: n, reason: collision with root package name */
    public int f470665n;

    /* renamed from: o, reason: collision with root package name */
    public int f470666o;

    /* renamed from: p, reason: collision with root package name */
    public r45.sx3 f470667p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wf4)) {
            return false;
        }
        r45.wf4 wf4Var = (r45.wf4) fVar;
        return n51.f.a(this.f470658d, wf4Var.f470658d) && n51.f.a(java.lang.Integer.valueOf(this.f470659e), java.lang.Integer.valueOf(wf4Var.f470659e)) && n51.f.a(this.f470660f, wf4Var.f470660f) && n51.f.a(this.f470661g, wf4Var.f470661g) && n51.f.a(this.f470662h, wf4Var.f470662h) && n51.f.a(this.f470663i, wf4Var.f470663i) && n51.f.a(this.f470664m, wf4Var.f470664m) && n51.f.a(java.lang.Integer.valueOf(this.f470665n), java.lang.Integer.valueOf(wf4Var.f470665n)) && n51.f.a(java.lang.Integer.valueOf(this.f470666o), java.lang.Integer.valueOf(wf4Var.f470666o)) && n51.f.a(this.f470667p, wf4Var.f470667p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470658d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f470659e);
            java.lang.String str2 = this.f470660f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f470661g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f470662h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f470663i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f470664m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f470665n);
            fVar.e(9, this.f470666o);
            r45.sx3 sx3Var = this.f470667p;
            if (sx3Var != null) {
                fVar.i(10, sx3Var.mo75928xcd1e8d8());
                this.f470667p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f470658d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f470659e);
            java.lang.String str8 = this.f470660f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f470661g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f470662h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f470663i;
            if (str11 != null) {
                j17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f470664m;
            if (str12 != null) {
                j17 += b36.f.j(7, str12);
            }
            int e17 = j17 + b36.f.e(8, this.f470665n) + b36.f.e(9, this.f470666o);
            r45.sx3 sx3Var2 = this.f470667p;
            return sx3Var2 != null ? e17 + b36.f.i(10, sx3Var2.mo75928xcd1e8d8()) : e17;
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
        r45.wf4 wf4Var = (r45.wf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wf4Var.f470658d = aVar2.k(intValue);
                return 0;
            case 2:
                wf4Var.f470659e = aVar2.g(intValue);
                return 0;
            case 3:
                wf4Var.f470660f = aVar2.k(intValue);
                return 0;
            case 4:
                wf4Var.f470661g = aVar2.k(intValue);
                return 0;
            case 5:
                wf4Var.f470662h = aVar2.k(intValue);
                return 0;
            case 6:
                wf4Var.f470663i = aVar2.k(intValue);
                return 0;
            case 7:
                wf4Var.f470664m = aVar2.k(intValue);
                return 0;
            case 8:
                wf4Var.f470665n = aVar2.g(intValue);
                return 0;
            case 9:
                wf4Var.f470666o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.sx3 sx3Var3 = new r45.sx3();
                    if (bArr != null && bArr.length > 0) {
                        sx3Var3.mo11468x92b714fd(bArr);
                    }
                    wf4Var.f470667p = sx3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
