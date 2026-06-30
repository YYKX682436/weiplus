package r45;

/* loaded from: classes2.dex */
public class pg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f464560d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464561e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464562f;

    /* renamed from: g, reason: collision with root package name */
    public long f464563g;

    /* renamed from: h, reason: collision with root package name */
    public long f464564h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ft5 f464565i;

    /* renamed from: m, reason: collision with root package name */
    public r45.an6 f464566m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464567n;

    /* renamed from: o, reason: collision with root package name */
    public int f464568o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f464569p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pg5)) {
            return false;
        }
        r45.pg5 pg5Var = (r45.pg5) fVar;
        return n51.f.a(this.f76492x92037252, pg5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f464560d), java.lang.Integer.valueOf(pg5Var.f464560d)) && n51.f.a(this.f464561e, pg5Var.f464561e) && n51.f.a(this.f464562f, pg5Var.f464562f) && n51.f.a(java.lang.Long.valueOf(this.f464563g), java.lang.Long.valueOf(pg5Var.f464563g)) && n51.f.a(java.lang.Long.valueOf(this.f464564h), java.lang.Long.valueOf(pg5Var.f464564h)) && n51.f.a(this.f464565i, pg5Var.f464565i) && n51.f.a(this.f464566m, pg5Var.f464566m) && n51.f.a(this.f464567n, pg5Var.f464567n) && n51.f.a(java.lang.Integer.valueOf(this.f464568o), java.lang.Integer.valueOf(pg5Var.f464568o)) && n51.f.a(this.f464569p, pg5Var.f464569p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f464560d);
            java.lang.String str = this.f464561e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f464562f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f464563g);
            fVar.h(6, this.f464564h);
            r45.ft5 ft5Var = this.f464565i;
            if (ft5Var != null) {
                fVar.i(7, ft5Var.mo75928xcd1e8d8());
                this.f464565i.mo75956x3d5d1f78(fVar);
            }
            r45.an6 an6Var = this.f464566m;
            if (an6Var != null) {
                fVar.i(8, an6Var.mo75928xcd1e8d8());
                this.f464566m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f464567n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f464568o);
            java.lang.String str4 = this.f464569p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f464560d);
            java.lang.String str5 = this.f464561e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f464562f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            int h17 = i18 + b36.f.h(5, this.f464563g) + b36.f.h(6, this.f464564h);
            r45.ft5 ft5Var2 = this.f464565i;
            if (ft5Var2 != null) {
                h17 += b36.f.i(7, ft5Var2.mo75928xcd1e8d8());
            }
            r45.an6 an6Var2 = this.f464566m;
            if (an6Var2 != null) {
                h17 += b36.f.i(8, an6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f464567n;
            if (str7 != null) {
                h17 += b36.f.j(9, str7);
            }
            int e17 = h17 + b36.f.e(10, this.f464568o);
            java.lang.String str8 = this.f464569p;
            return str8 != null ? e17 + b36.f.j(11, str8) : e17;
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
        r45.pg5 pg5Var = (r45.pg5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    pg5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                pg5Var.f464560d = aVar2.g(intValue);
                return 0;
            case 3:
                pg5Var.f464561e = aVar2.k(intValue);
                return 0;
            case 4:
                pg5Var.f464562f = aVar2.k(intValue);
                return 0;
            case 5:
                pg5Var.f464563g = aVar2.i(intValue);
                return 0;
            case 6:
                pg5Var.f464564h = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ft5 ft5Var3 = new r45.ft5();
                    if (bArr2 != null && bArr2.length > 0) {
                        ft5Var3.mo11468x92b714fd(bArr2);
                    }
                    pg5Var.f464565i = ft5Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.an6 an6Var3 = new r45.an6();
                    if (bArr3 != null && bArr3.length > 0) {
                        an6Var3.mo11468x92b714fd(bArr3);
                    }
                    pg5Var.f464566m = an6Var3;
                }
                return 0;
            case 9:
                pg5Var.f464567n = aVar2.k(intValue);
                return 0;
            case 10:
                pg5Var.f464568o = aVar2.g(intValue);
                return 0;
            case 11:
                pg5Var.f464569p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
