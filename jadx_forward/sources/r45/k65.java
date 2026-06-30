package r45;

/* loaded from: classes8.dex */
public class k65 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f459971d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459972e;

    /* renamed from: f, reason: collision with root package name */
    public r45.b77 f459973f;

    /* renamed from: g, reason: collision with root package name */
    public r45.w67 f459974g;

    /* renamed from: h, reason: collision with root package name */
    public r45.p67 f459975h;

    /* renamed from: i, reason: collision with root package name */
    public r45.z67 f459976i;

    /* renamed from: m, reason: collision with root package name */
    public int f459977m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f459978n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f459979o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f459980p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public r45.t67 f459981q;

    /* renamed from: r, reason: collision with root package name */
    public r45.la5 f459982r;

    /* renamed from: s, reason: collision with root package name */
    public r45.x67 f459983s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k65)) {
            return false;
        }
        r45.k65 k65Var = (r45.k65) fVar;
        return n51.f.a(this.f76492x92037252, k65Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f459971d), java.lang.Integer.valueOf(k65Var.f459971d)) && n51.f.a(this.f459972e, k65Var.f459972e) && n51.f.a(this.f459973f, k65Var.f459973f) && n51.f.a(this.f459974g, k65Var.f459974g) && n51.f.a(this.f459975h, k65Var.f459975h) && n51.f.a(this.f459976i, k65Var.f459976i) && n51.f.a(java.lang.Integer.valueOf(this.f459977m), java.lang.Integer.valueOf(k65Var.f459977m)) && n51.f.a(java.lang.Boolean.valueOf(this.f459978n), java.lang.Boolean.valueOf(k65Var.f459978n)) && n51.f.a(this.f459979o, k65Var.f459979o) && n51.f.a(this.f459980p, k65Var.f459980p) && n51.f.a(this.f459981q, k65Var.f459981q) && n51.f.a(this.f459982r, k65Var.f459982r) && n51.f.a(this.f459983s, k65Var.f459983s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459980p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f459971d);
            java.lang.String str = this.f459972e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.b77 b77Var = this.f459973f;
            if (b77Var != null) {
                fVar.i(4, b77Var.mo75928xcd1e8d8());
                this.f459973f.mo75956x3d5d1f78(fVar);
            }
            r45.w67 w67Var = this.f459974g;
            if (w67Var != null) {
                fVar.i(5, w67Var.mo75928xcd1e8d8());
                this.f459974g.mo75956x3d5d1f78(fVar);
            }
            r45.p67 p67Var = this.f459975h;
            if (p67Var != null) {
                fVar.i(6, p67Var.mo75928xcd1e8d8());
                this.f459975h.mo75956x3d5d1f78(fVar);
            }
            r45.z67 z67Var = this.f459976i;
            if (z67Var != null) {
                fVar.i(7, z67Var.mo75928xcd1e8d8());
                this.f459976i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f459977m);
            fVar.a(9, this.f459978n);
            java.lang.String str2 = this.f459979o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.g(11, 1, linkedList);
            r45.t67 t67Var = this.f459981q;
            if (t67Var != null) {
                fVar.i(12, t67Var.mo75928xcd1e8d8());
                this.f459981q.mo75956x3d5d1f78(fVar);
            }
            r45.la5 la5Var = this.f459982r;
            if (la5Var != null) {
                fVar.i(13, la5Var.mo75928xcd1e8d8());
                this.f459982r.mo75956x3d5d1f78(fVar);
            }
            r45.x67 x67Var = this.f459983s;
            if (x67Var != null) {
                fVar.i(14, x67Var.mo75928xcd1e8d8());
                this.f459983s.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f459971d);
            java.lang.String str3 = this.f459972e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.b77 b77Var2 = this.f459973f;
            if (b77Var2 != null) {
                i18 += b36.f.i(4, b77Var2.mo75928xcd1e8d8());
            }
            r45.w67 w67Var2 = this.f459974g;
            if (w67Var2 != null) {
                i18 += b36.f.i(5, w67Var2.mo75928xcd1e8d8());
            }
            r45.p67 p67Var2 = this.f459975h;
            if (p67Var2 != null) {
                i18 += b36.f.i(6, p67Var2.mo75928xcd1e8d8());
            }
            r45.z67 z67Var2 = this.f459976i;
            if (z67Var2 != null) {
                i18 += b36.f.i(7, z67Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(8, this.f459977m) + b36.f.a(9, this.f459978n);
            java.lang.String str4 = this.f459979o;
            if (str4 != null) {
                e17 += b36.f.j(10, str4);
            }
            int g17 = e17 + b36.f.g(11, 1, linkedList);
            r45.t67 t67Var2 = this.f459981q;
            if (t67Var2 != null) {
                g17 += b36.f.i(12, t67Var2.mo75928xcd1e8d8());
            }
            r45.la5 la5Var2 = this.f459982r;
            if (la5Var2 != null) {
                g17 += b36.f.i(13, la5Var2.mo75928xcd1e8d8());
            }
            r45.x67 x67Var2 = this.f459983s;
            return x67Var2 != null ? g17 + b36.f.i(14, x67Var2.mo75928xcd1e8d8()) : g17;
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
        r45.k65 k65Var = (r45.k65) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    k65Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                k65Var.f459971d = aVar2.g(intValue);
                return 0;
            case 3:
                k65Var.f459972e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.b77 b77Var3 = new r45.b77();
                    if (bArr3 != null && bArr3.length > 0) {
                        b77Var3.mo11468x92b714fd(bArr3);
                    }
                    k65Var.f459973f = b77Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.w67 w67Var3 = new r45.w67();
                    if (bArr4 != null && bArr4.length > 0) {
                        w67Var3.mo11468x92b714fd(bArr4);
                    }
                    k65Var.f459974g = w67Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.p67 p67Var3 = new r45.p67();
                    if (bArr5 != null && bArr5.length > 0) {
                        p67Var3.mo11468x92b714fd(bArr5);
                    }
                    k65Var.f459975h = p67Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.z67 z67Var3 = new r45.z67();
                    if (bArr6 != null && bArr6.length > 0) {
                        z67Var3.mo11468x92b714fd(bArr6);
                    }
                    k65Var.f459976i = z67Var3;
                }
                return 0;
            case 8:
                k65Var.f459977m = aVar2.g(intValue);
                return 0;
            case 9:
                k65Var.f459978n = aVar2.c(intValue);
                return 0;
            case 10:
                k65Var.f459979o = aVar2.k(intValue);
                return 0;
            case 11:
                k65Var.f459980p.add(aVar2.k(intValue));
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.t67 t67Var3 = new r45.t67();
                    if (bArr7 != null && bArr7.length > 0) {
                        t67Var3.mo11468x92b714fd(bArr7);
                    }
                    k65Var.f459981q = t67Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.la5 la5Var3 = new r45.la5();
                    if (bArr8 != null && bArr8.length > 0) {
                        la5Var3.mo11468x92b714fd(bArr8);
                    }
                    k65Var.f459982r = la5Var3;
                }
                return 0;
            case 14:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.x67 x67Var3 = new r45.x67();
                    if (bArr9 != null && bArr9.length > 0) {
                        x67Var3.mo11468x92b714fd(bArr9);
                    }
                    k65Var.f459983s = x67Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
