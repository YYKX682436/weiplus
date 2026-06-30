package bw5;

/* loaded from: classes9.dex */
public class hf0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f109724d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109725e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.y5 f109726f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109727g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.gf0 f109728h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f109729i;

    /* renamed from: m, reason: collision with root package name */
    public int f109730m;

    /* renamed from: n, reason: collision with root package name */
    public long f109731n;

    /* renamed from: o, reason: collision with root package name */
    public int f109732o;

    /* renamed from: p, reason: collision with root package name */
    public int f109733p;

    /* renamed from: q, reason: collision with root package name */
    public long f109734q;

    /* renamed from: r, reason: collision with root package name */
    public int f109735r;

    /* renamed from: s, reason: collision with root package name */
    public int f109736s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f109737t = new boolean[15];

    static {
        new bw5.hf0();
    }

    public bw5.hf0 b(int i17) {
        this.f109730m = i17;
        this.f109737t[8] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hf0)) {
            return false;
        }
        bw5.hf0 hf0Var = (bw5.hf0) fVar;
        return n51.f.a(this.f76494x2de60e5e, hf0Var.f76494x2de60e5e) && n51.f.a(java.lang.Long.valueOf(this.f109724d), java.lang.Long.valueOf(hf0Var.f109724d)) && n51.f.a(this.f109725e, hf0Var.f109725e) && n51.f.a(this.f109726f, hf0Var.f109726f) && n51.f.a(this.f109727g, hf0Var.f109727g) && n51.f.a(this.f109728h, hf0Var.f109728h) && n51.f.a(this.f109729i, hf0Var.f109729i) && n51.f.a(java.lang.Integer.valueOf(this.f109730m), java.lang.Integer.valueOf(hf0Var.f109730m)) && n51.f.a(java.lang.Long.valueOf(this.f109731n), java.lang.Long.valueOf(hf0Var.f109731n)) && n51.f.a(java.lang.Integer.valueOf(this.f109732o), java.lang.Integer.valueOf(hf0Var.f109732o)) && n51.f.a(java.lang.Integer.valueOf(this.f109733p), java.lang.Integer.valueOf(hf0Var.f109733p)) && n51.f.a(java.lang.Long.valueOf(this.f109734q), java.lang.Long.valueOf(hf0Var.f109734q)) && n51.f.a(java.lang.Integer.valueOf(this.f109735r), java.lang.Integer.valueOf(hf0Var.f109735r)) && n51.f.a(java.lang.Integer.valueOf(this.f109736s), java.lang.Integer.valueOf(hf0Var.f109736s));
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f109737t[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hf0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109737t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f109724d);
            }
            java.lang.String str = this.f109725e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.y5 y5Var = this.f109726f;
            if (y5Var != null && zArr[4]) {
                fVar.i(4, y5Var.mo75928xcd1e8d8());
                this.f109726f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f109727g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            bw5.gf0 gf0Var = this.f109728h;
            if (gf0Var != null && zArr[6]) {
                fVar.i(6, gf0Var.mo75928xcd1e8d8());
                this.f109728h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f109729i;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f109730m);
            }
            if (zArr[9]) {
                fVar.h(9, this.f109731n);
            }
            if (zArr[10]) {
                fVar.e(10, this.f109732o);
            }
            if (zArr[11]) {
                fVar.e(11, this.f109733p);
            }
            if (zArr[12]) {
                fVar.h(12, this.f109734q);
            }
            if (zArr[13]) {
                fVar.e(13, this.f109735r);
            }
            if (!zArr[14]) {
                return 0;
            }
            fVar.e(14, this.f109736s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 == null || !zArr[1]) ? 0 : b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0;
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f109724d);
            }
            java.lang.String str4 = this.f109725e;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            bw5.y5 y5Var2 = this.f109726f;
            if (y5Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, y5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f109727g;
            if (str5 != null && zArr[5]) {
                i18 += b36.f.j(5, str5);
            }
            bw5.gf0 gf0Var2 = this.f109728h;
            if (gf0Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, gf0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f109729i;
            if (str6 != null && zArr[7]) {
                i18 += b36.f.j(7, str6);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f109730m);
            }
            if (zArr[9]) {
                i18 += b36.f.h(9, this.f109731n);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f109732o);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f109733p);
            }
            if (zArr[12]) {
                i18 += b36.f.h(12, this.f109734q);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f109735r);
            }
            return zArr[14] ? i18 + b36.f.e(14, this.f109736s) : i18;
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
                    this.f76494x2de60e5e = heVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f109724d = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109725e = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.y5 y5Var3 = new bw5.y5();
                    if (bArr2 != null && bArr2.length > 0) {
                        y5Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f109726f = y5Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f109727g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.gf0 gf0Var3 = new bw5.gf0();
                    if (bArr3 != null && bArr3.length > 0) {
                        gf0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f109728h = gf0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f109729i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109730m = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109731n = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109732o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109733p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f109734q = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f109735r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f109736s = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.hf0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f109737t[1] = true;
        return this;
    }
}
