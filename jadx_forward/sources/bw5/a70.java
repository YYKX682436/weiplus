package bw5;

/* loaded from: classes2.dex */
public class a70 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f106577e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f106578f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f106579g;

    /* renamed from: h, reason: collision with root package name */
    public long f106580h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f106581i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f106582m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f106583n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f106584o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.xa0 f106585p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.f90 f106586q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.m40 f106587r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.p90 f106588s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.vb0 f106589t;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f106576d = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f106590u = new boolean[16];

    static {
        new bw5.a70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a70 mo11468x92b714fd(byte[] bArr) {
        return (bw5.a70) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a70)) {
            return false;
        }
        bw5.a70 a70Var = (bw5.a70) fVar;
        return n51.f.a(this.f76492x92037252, a70Var.f76492x92037252) && n51.f.a(this.f106576d, a70Var.f106576d) && n51.f.a(this.f106577e, a70Var.f106577e) && n51.f.a(java.lang.Boolean.valueOf(this.f106578f), java.lang.Boolean.valueOf(a70Var.f106578f)) && n51.f.a(this.f106579g, a70Var.f106579g) && n51.f.a(java.lang.Long.valueOf(this.f106580h), java.lang.Long.valueOf(a70Var.f106580h)) && n51.f.a(java.lang.Boolean.valueOf(this.f106581i), java.lang.Boolean.valueOf(a70Var.f106581i)) && n51.f.a(java.lang.Boolean.valueOf(this.f106582m), java.lang.Boolean.valueOf(a70Var.f106582m)) && n51.f.a(this.f106583n, a70Var.f106583n) && n51.f.a(java.lang.Boolean.valueOf(this.f106584o), java.lang.Boolean.valueOf(a70Var.f106584o)) && n51.f.a(this.f106585p, a70Var.f106585p) && n51.f.a(this.f106586q, a70Var.f106586q) && n51.f.a(this.f106587r, a70Var.f106587r) && n51.f.a(this.f106588s, a70Var.f106588s) && n51.f.a(this.f106589t, a70Var.f106589t);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f106590u[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.a70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f106576d;
        int i18 = 0;
        boolean[] zArr = this.f106590u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f106577e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.a(4, this.f106578f);
            }
            java.lang.String str = this.f106579g;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            if (zArr[6]) {
                fVar.h(6, this.f106580h);
            }
            if (zArr[7]) {
                fVar.a(7, this.f106581i);
            }
            if (zArr[8]) {
                fVar.a(8, this.f106582m);
            }
            java.lang.String str2 = this.f106583n;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            if (zArr[10]) {
                fVar.a(10, this.f106584o);
            }
            bw5.xa0 xa0Var = this.f106585p;
            if (xa0Var != null && zArr[11]) {
                fVar.i(11, xa0Var.mo75928xcd1e8d8());
                this.f106585p.mo75956x3d5d1f78(fVar);
            }
            bw5.f90 f90Var = this.f106586q;
            if (f90Var != null && zArr[12]) {
                fVar.i(12, f90Var.mo75928xcd1e8d8());
                this.f106586q.mo75956x3d5d1f78(fVar);
            }
            bw5.m40 m40Var = this.f106587r;
            if (m40Var != null && zArr[13]) {
                fVar.i(13, m40Var.mo75928xcd1e8d8());
                this.f106587r.mo75956x3d5d1f78(fVar);
            }
            bw5.p90 p90Var = this.f106588s;
            if (p90Var != null && zArr[14]) {
                fVar.i(14, p90Var.mo75928xcd1e8d8());
                this.f106588s.mo75956x3d5d1f78(fVar);
            }
            bw5.vb0 vb0Var = this.f106589t;
            if (vb0Var != null && zArr[15]) {
                fVar.i(15, vb0Var.mo75928xcd1e8d8());
                this.f106589t.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0;
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f106577e;
            if (gVar2 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar2);
            }
            if (zArr[4]) {
                g17 += b36.f.a(4, this.f106578f);
            }
            java.lang.String str3 = this.f106579g;
            if (str3 != null && zArr[5]) {
                g17 += b36.f.j(5, str3);
            }
            if (zArr[6]) {
                g17 += b36.f.h(6, this.f106580h);
            }
            if (zArr[7]) {
                g17 += b36.f.a(7, this.f106581i);
            }
            if (zArr[8]) {
                g17 += b36.f.a(8, this.f106582m);
            }
            java.lang.String str4 = this.f106583n;
            if (str4 != null && zArr[9]) {
                g17 += b36.f.j(9, str4);
            }
            if (zArr[10]) {
                g17 += b36.f.a(10, this.f106584o);
            }
            bw5.xa0 xa0Var2 = this.f106585p;
            if (xa0Var2 != null && zArr[11]) {
                g17 += b36.f.i(11, xa0Var2.mo75928xcd1e8d8());
            }
            bw5.f90 f90Var2 = this.f106586q;
            if (f90Var2 != null && zArr[12]) {
                g17 += b36.f.i(12, f90Var2.mo75928xcd1e8d8());
            }
            bw5.m40 m40Var2 = this.f106587r;
            if (m40Var2 != null && zArr[13]) {
                g17 += b36.f.i(13, m40Var2.mo75928xcd1e8d8());
            }
            bw5.p90 p90Var2 = this.f106588s;
            if (p90Var2 != null && zArr[14]) {
                g17 += b36.f.i(14, p90Var2.mo75928xcd1e8d8());
            }
            bw5.vb0 vb0Var2 = this.f106589t;
            return (vb0Var2 == null || !zArr[15]) ? g17 : g17 + b36.f.i(15, vb0Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList.clear();
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
                    this.f76492x92037252 = ieVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.t70 t70Var = new bw5.t70();
                    if (bArr2 != null && bArr2.length > 0) {
                        t70Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(t70Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f106577e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f106578f = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f106579g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f106580h = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f106581i = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f106582m = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f106583n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f106584o = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr3 != null && bArr3.length > 0) {
                        xa0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f106585p = xa0Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.f90 f90Var3 = new bw5.f90();
                    if (bArr4 != null && bArr4.length > 0) {
                        f90Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f106586q = f90Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.m40 m40Var3 = new bw5.m40();
                    if (bArr5 != null && bArr5.length > 0) {
                        m40Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f106587r = m40Var3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.p90 p90Var3 = new bw5.p90();
                    if (bArr6 != null && bArr6.length > 0) {
                        p90Var3.mo11468x92b714fd(bArr6);
                    }
                    this.f106588s = p90Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.vb0 vb0Var3 = new bw5.vb0();
                    if (bArr7 != null && bArr7.length > 0) {
                        vb0Var3.mo11468x92b714fd(bArr7);
                    }
                    this.f106589t = vb0Var3;
                }
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f106590u[1] = true;
        return this;
    }
}
