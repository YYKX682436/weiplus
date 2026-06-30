package r45;

/* loaded from: classes10.dex */
public class ey1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f455333d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455334e;

    /* renamed from: f, reason: collision with root package name */
    public long f455335f;

    /* renamed from: g, reason: collision with root package name */
    public long f455336g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455337h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455338i;

    /* renamed from: m, reason: collision with root package name */
    public r45.z34 f455339m;

    /* renamed from: n, reason: collision with root package name */
    public int f455340n;

    /* renamed from: o, reason: collision with root package name */
    public r45.in0 f455341o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ey1)) {
            return false;
        }
        r45.ey1 ey1Var = (r45.ey1) fVar;
        return n51.f.a(this.f76494x2de60e5e, ey1Var.f76494x2de60e5e) && n51.f.a(this.f455333d, ey1Var.f455333d) && n51.f.a(this.f455334e, ey1Var.f455334e) && n51.f.a(java.lang.Long.valueOf(this.f455335f), java.lang.Long.valueOf(ey1Var.f455335f)) && n51.f.a(java.lang.Long.valueOf(this.f455336g), java.lang.Long.valueOf(ey1Var.f455336g)) && n51.f.a(this.f455337h, ey1Var.f455337h) && n51.f.a(this.f455338i, ey1Var.f455338i) && n51.f.a(this.f455339m, ey1Var.f455339m) && n51.f.a(java.lang.Integer.valueOf(this.f455340n), java.lang.Integer.valueOf(ey1Var.f455340n)) && n51.f.a(this.f455341o, ey1Var.f455341o);
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
            r45.kv0 kv0Var = this.f455333d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f455333d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f455334e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f455335f);
            fVar.h(5, this.f455336g);
            java.lang.String str2 = this.f455337h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f455338i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.z34 z34Var = this.f455339m;
            if (z34Var != null) {
                fVar.i(8, z34Var.mo75928xcd1e8d8());
                this.f455339m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(9, this.f455340n);
            r45.in0 in0Var = this.f455341o;
            if (in0Var != null) {
                fVar.i(10, in0Var.mo75928xcd1e8d8());
                this.f455341o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f455333d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f455334e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int h17 = i18 + b36.f.h(4, this.f455335f) + b36.f.h(5, this.f455336g);
            java.lang.String str5 = this.f455337h;
            if (str5 != null) {
                h17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f455338i;
            if (str6 != null) {
                h17 += b36.f.j(7, str6);
            }
            r45.z34 z34Var2 = this.f455339m;
            if (z34Var2 != null) {
                h17 += b36.f.i(8, z34Var2.mo75928xcd1e8d8());
            }
            int e17 = h17 + b36.f.e(9, this.f455340n);
            r45.in0 in0Var2 = this.f455341o;
            return in0Var2 != null ? e17 + b36.f.i(10, in0Var2.mo75928xcd1e8d8()) : e17;
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
        r45.ey1 ey1Var = (r45.ey1) objArr[1];
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
                    ey1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    ey1Var.f455333d = kv0Var3;
                }
                return 0;
            case 3:
                ey1Var.f455334e = aVar2.k(intValue);
                return 0;
            case 4:
                ey1Var.f455335f = aVar2.i(intValue);
                return 0;
            case 5:
                ey1Var.f455336g = aVar2.i(intValue);
                return 0;
            case 6:
                ey1Var.f455337h = aVar2.k(intValue);
                return 0;
            case 7:
                ey1Var.f455338i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.z34 z34Var3 = new r45.z34();
                    if (bArr3 != null && bArr3.length > 0) {
                        z34Var3.mo11468x92b714fd(bArr3);
                    }
                    ey1Var.f455339m = z34Var3;
                }
                return 0;
            case 9:
                ey1Var.f455340n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.in0 in0Var3 = new r45.in0();
                    if (bArr4 != null && bArr4.length > 0) {
                        in0Var3.mo11468x92b714fd(bArr4);
                    }
                    ey1Var.f455341o = in0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
