package r45;

/* loaded from: classes9.dex */
public class gq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456995d;

    /* renamed from: e, reason: collision with root package name */
    public r45.yt5 f456996e;

    /* renamed from: f, reason: collision with root package name */
    public int f456997f;

    /* renamed from: g, reason: collision with root package name */
    public r45.bz3 f456998g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456999h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457000i;

    /* renamed from: m, reason: collision with root package name */
    public int f457001m;

    /* renamed from: n, reason: collision with root package name */
    public r45.a50 f457002n;

    /* renamed from: o, reason: collision with root package name */
    public long f457003o;

    /* renamed from: p, reason: collision with root package name */
    public long f457004p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cg0 f457005q;

    /* renamed from: r, reason: collision with root package name */
    public r45.cg0 f457006r;

    /* renamed from: s, reason: collision with root package name */
    public long f457007s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gq)) {
            return false;
        }
        r45.gq gqVar = (r45.gq) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456995d), java.lang.Integer.valueOf(gqVar.f456995d)) && n51.f.a(this.f456996e, gqVar.f456996e) && n51.f.a(java.lang.Integer.valueOf(this.f456997f), java.lang.Integer.valueOf(gqVar.f456997f)) && n51.f.a(this.f456998g, gqVar.f456998g) && n51.f.a(this.f456999h, gqVar.f456999h) && n51.f.a(this.f457000i, gqVar.f457000i) && n51.f.a(java.lang.Integer.valueOf(this.f457001m), java.lang.Integer.valueOf(gqVar.f457001m)) && n51.f.a(this.f457002n, gqVar.f457002n) && n51.f.a(java.lang.Long.valueOf(this.f457003o), java.lang.Long.valueOf(gqVar.f457003o)) && n51.f.a(java.lang.Long.valueOf(this.f457004p), java.lang.Long.valueOf(gqVar.f457004p)) && n51.f.a(this.f457005q, gqVar.f457005q) && n51.f.a(this.f457006r, gqVar.f457006r) && n51.f.a(java.lang.Long.valueOf(this.f457007s), java.lang.Long.valueOf(gqVar.f457007s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456995d);
            r45.yt5 yt5Var = this.f456996e;
            if (yt5Var != null) {
                fVar.i(2, yt5Var.mo75928xcd1e8d8());
                this.f456996e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f456997f);
            r45.bz3 bz3Var = this.f456998g;
            if (bz3Var != null) {
                fVar.i(4, bz3Var.mo75928xcd1e8d8());
                this.f456998g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f456999h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f457000i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f457001m);
            r45.a50 a50Var = this.f457002n;
            if (a50Var != null) {
                fVar.i(8, a50Var.mo75928xcd1e8d8());
                this.f457002n.mo75956x3d5d1f78(fVar);
            }
            fVar.h(9, this.f457003o);
            fVar.h(10, this.f457004p);
            r45.cg0 cg0Var = this.f457005q;
            if (cg0Var != null) {
                fVar.i(11, cg0Var.mo75928xcd1e8d8());
                this.f457005q.mo75956x3d5d1f78(fVar);
            }
            r45.cg0 cg0Var2 = this.f457006r;
            if (cg0Var2 != null) {
                fVar.i(12, cg0Var2.mo75928xcd1e8d8());
                this.f457006r.mo75956x3d5d1f78(fVar);
            }
            fVar.h(13, this.f457007s);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f456995d) + 0;
            r45.yt5 yt5Var2 = this.f456996e;
            if (yt5Var2 != null) {
                e17 += b36.f.i(2, yt5Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(3, this.f456997f);
            r45.bz3 bz3Var2 = this.f456998g;
            if (bz3Var2 != null) {
                e18 += b36.f.i(4, bz3Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f456999h;
            if (str3 != null) {
                e18 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f457000i;
            if (str4 != null) {
                e18 += b36.f.j(6, str4);
            }
            int e19 = e18 + b36.f.e(7, this.f457001m);
            r45.a50 a50Var2 = this.f457002n;
            if (a50Var2 != null) {
                e19 += b36.f.i(8, a50Var2.mo75928xcd1e8d8());
            }
            int h17 = e19 + b36.f.h(9, this.f457003o) + b36.f.h(10, this.f457004p);
            r45.cg0 cg0Var3 = this.f457005q;
            if (cg0Var3 != null) {
                h17 += b36.f.i(11, cg0Var3.mo75928xcd1e8d8());
            }
            r45.cg0 cg0Var4 = this.f457006r;
            if (cg0Var4 != null) {
                h17 += b36.f.i(12, cg0Var4.mo75928xcd1e8d8());
            }
            return h17 + b36.f.h(13, this.f457007s);
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
        r45.gq gqVar = (r45.gq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gqVar.f456995d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr != null && bArr.length > 0) {
                        yt5Var3.mo11468x92b714fd(bArr);
                    }
                    gqVar.f456996e = yt5Var3;
                }
                return 0;
            case 3:
                gqVar.f456997f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.bz3 bz3Var3 = new r45.bz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        bz3Var3.mo11468x92b714fd(bArr2);
                    }
                    gqVar.f456998g = bz3Var3;
                }
                return 0;
            case 5:
                gqVar.f456999h = aVar2.k(intValue);
                return 0;
            case 6:
                gqVar.f457000i = aVar2.k(intValue);
                return 0;
            case 7:
                gqVar.f457001m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.a50 a50Var3 = new r45.a50();
                    if (bArr3 != null && bArr3.length > 0) {
                        a50Var3.mo11468x92b714fd(bArr3);
                    }
                    gqVar.f457002n = a50Var3;
                }
                return 0;
            case 9:
                gqVar.f457003o = aVar2.i(intValue);
                return 0;
            case 10:
                gqVar.f457004p = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.cg0 cg0Var5 = new r45.cg0();
                    if (bArr4 != null && bArr4.length > 0) {
                        cg0Var5.mo11468x92b714fd(bArr4);
                    }
                    gqVar.f457005q = cg0Var5;
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.cg0 cg0Var6 = new r45.cg0();
                    if (bArr5 != null && bArr5.length > 0) {
                        cg0Var6.mo11468x92b714fd(bArr5);
                    }
                    gqVar.f457006r = cg0Var6;
                }
                return 0;
            case 13:
                gqVar.f457007s = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
