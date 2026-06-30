package bw5;

/* loaded from: classes2.dex */
public class ev extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.l3 A;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g B;

    /* renamed from: d, reason: collision with root package name */
    public int f108597d;

    /* renamed from: e, reason: collision with root package name */
    public int f108598e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108599f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108601h;

    /* renamed from: i, reason: collision with root package name */
    public int f108602i;

    /* renamed from: m, reason: collision with root package name */
    public int f108603m;

    /* renamed from: n, reason: collision with root package name */
    public int f108604n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f108605o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f108606p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f108607q;

    /* renamed from: r, reason: collision with root package name */
    public int f108608r;

    /* renamed from: s, reason: collision with root package name */
    public int f108609s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f108610t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f108611u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108612v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108613w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f108614x;

    /* renamed from: y, reason: collision with root package name */
    public int f108615y;

    /* renamed from: z, reason: collision with root package name */
    public int f108616z;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f108600g = new java.util.LinkedList();
    public final boolean[] C = new boolean[24];

    static {
        new bw5.ev();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ev mo11468x92b714fd(byte[] bArr) {
        return (bw5.ev) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ev)) {
            return false;
        }
        bw5.ev evVar = (bw5.ev) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f108597d), java.lang.Integer.valueOf(evVar.f108597d)) && n51.f.a(java.lang.Integer.valueOf(this.f108598e), java.lang.Integer.valueOf(evVar.f108598e)) && n51.f.a(this.f108599f, evVar.f108599f) && n51.f.a(this.f108600g, evVar.f108600g) && n51.f.a(this.f108601h, evVar.f108601h) && n51.f.a(java.lang.Integer.valueOf(this.f108602i), java.lang.Integer.valueOf(evVar.f108602i)) && n51.f.a(java.lang.Integer.valueOf(this.f108603m), java.lang.Integer.valueOf(evVar.f108603m)) && n51.f.a(java.lang.Integer.valueOf(this.f108604n), java.lang.Integer.valueOf(evVar.f108604n)) && n51.f.a(java.lang.Boolean.valueOf(this.f108605o), java.lang.Boolean.valueOf(evVar.f108605o)) && n51.f.a(this.f108606p, evVar.f108606p) && n51.f.a(this.f108607q, evVar.f108607q) && n51.f.a(java.lang.Integer.valueOf(this.f108608r), java.lang.Integer.valueOf(evVar.f108608r)) && n51.f.a(java.lang.Integer.valueOf(this.f108609s), java.lang.Integer.valueOf(evVar.f108609s)) && n51.f.a(this.f108610t, evVar.f108610t) && n51.f.a(this.f108611u, evVar.f108611u) && n51.f.a(this.f108612v, evVar.f108612v) && n51.f.a(this.f108613w, evVar.f108613w) && n51.f.a(this.f108614x, evVar.f108614x) && n51.f.a(java.lang.Integer.valueOf(this.f108615y), java.lang.Integer.valueOf(evVar.f108615y)) && n51.f.a(java.lang.Integer.valueOf(this.f108616z), java.lang.Integer.valueOf(evVar.f108616z)) && n51.f.a(this.A, evVar.A) && n51.f.a(this.B, evVar.B);
    }

    /* renamed from: getTipsUuid */
    public java.lang.String m11860x5ec9c89() {
        return this.C[19] ? this.f108614x : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ev();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.C;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f108597d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f108598e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108599f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            fVar.g(4, 8, this.f108600g);
            java.lang.String str = this.f108601h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108602i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f108603m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f108604n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f108605o);
            }
            java.lang.String str2 = this.f108606p;
            if (str2 != null && zArr[10]) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f108607q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.e(12, this.f108608r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f108609s);
            }
            java.lang.String str4 = this.f108610t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            java.lang.String str5 = this.f108611u;
            if (str5 != null && zArr[15]) {
                fVar.j(15, str5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108612v;
            if (gVar2 != null && zArr[16]) {
                fVar.b(16, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f108613w;
            if (gVar3 != null && zArr[18]) {
                fVar.b(18, gVar3);
            }
            java.lang.String str6 = this.f108614x;
            if (str6 != null && zArr[19]) {
                fVar.j(19, str6);
            }
            if (zArr[20]) {
                fVar.e(20, this.f108615y);
            }
            if (zArr[21]) {
                fVar.e(21, this.f108616z);
            }
            bw5.l3 l3Var = this.A;
            if (l3Var != null && zArr[22]) {
                fVar.i(22, l3Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.B;
            if (gVar4 != null && zArr[23]) {
                fVar.b(23, gVar4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f108597d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f108598e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f108599f;
            if (gVar5 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar5);
            }
            int g17 = e17 + b36.f.g(4, 8, this.f108600g);
            java.lang.String str7 = this.f108601h;
            if (str7 != null && zArr[5]) {
                g17 += b36.f.j(5, str7);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f108602i);
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f108603m);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f108604n);
            }
            if (zArr[9]) {
                g17 += b36.f.a(9, this.f108605o);
            }
            java.lang.String str8 = this.f108606p;
            if (str8 != null && zArr[10]) {
                g17 += b36.f.j(10, str8);
            }
            java.lang.String str9 = this.f108607q;
            if (str9 != null && zArr[11]) {
                g17 += b36.f.j(11, str9);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f108608r);
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f108609s);
            }
            java.lang.String str10 = this.f108610t;
            if (str10 != null && zArr[14]) {
                g17 += b36.f.j(14, str10);
            }
            java.lang.String str11 = this.f108611u;
            if (str11 != null && zArr[15]) {
                g17 += b36.f.j(15, str11);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f108612v;
            if (gVar6 != null && zArr[16]) {
                g17 += b36.f.b(16, gVar6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f108613w;
            if (gVar7 != null && zArr[18]) {
                g17 += b36.f.b(18, gVar7);
            }
            java.lang.String str12 = this.f108614x;
            if (str12 != null && zArr[19]) {
                g17 += b36.f.j(19, str12);
            }
            if (zArr[20]) {
                g17 += b36.f.e(20, this.f108615y);
            }
            if (zArr[21]) {
                g17 += b36.f.e(21, this.f108616z);
            }
            bw5.l3 l3Var2 = this.A;
            if (l3Var2 != null && zArr[22]) {
                g17 += b36.f.i(22, l3Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.B;
            return (gVar8 == null || !zArr[23]) ? g17 : g17 + b36.f.b(23, gVar8);
        }
        if (i17 == 2) {
            this.f108600g.clear();
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
                this.f108597d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108598e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108599f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.vy vyVar = new bw5.vy();
                    if (bArr != null && bArr.length > 0) {
                        vyVar.mo11468x92b714fd(bArr);
                    }
                    this.f108600g.add(vyVar);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f108601h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108602i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108603m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108604n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f108605o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f108606p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f108607q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f108608r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f108609s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f108610t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f108611u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f108612v = aVar2.d(intValue);
                zArr[16] = true;
                return 0;
            case 17:
            default:
                return -1;
            case 18:
                this.f108613w = aVar2.d(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f108614x = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f108615y = aVar2.g(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f108616z = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.l3 l3Var3 = new bw5.l3();
                    if (bArr2 != null && bArr2.length > 0) {
                        l3Var3.mo11468x92b714fd(bArr2);
                    }
                    this.A = l3Var3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                this.B = aVar2.d(intValue);
                zArr[23] = true;
                return 0;
        }
    }
}
