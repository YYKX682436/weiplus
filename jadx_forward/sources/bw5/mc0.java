package bw5;

/* loaded from: classes2.dex */
public class mc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f111698d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111699e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111700f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111701g;

    /* renamed from: h, reason: collision with root package name */
    public int f111702h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f111703i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111704m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f111705n;

    /* renamed from: o, reason: collision with root package name */
    public int f111706o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f111707p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f111708q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f111709r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f111710s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111711t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f111712u = new boolean[15];

    static {
        new bw5.mc0();
    }

    public java.lang.String b() {
        return this.f111712u[4] ? this.f111701g : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.mc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.mc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mc0)) {
            return false;
        }
        bw5.mc0 mc0Var = (bw5.mc0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f111698d), java.lang.Long.valueOf(mc0Var.f111698d)) && n51.f.a(this.f111699e, mc0Var.f111699e) && n51.f.a(this.f111700f, mc0Var.f111700f) && n51.f.a(this.f111701g, mc0Var.f111701g) && n51.f.a(java.lang.Integer.valueOf(this.f111702h), java.lang.Integer.valueOf(mc0Var.f111702h)) && n51.f.a(this.f111703i, mc0Var.f111703i) && n51.f.a(this.f111704m, mc0Var.f111704m) && n51.f.a(this.f111705n, mc0Var.f111705n) && n51.f.a(java.lang.Integer.valueOf(this.f111706o), java.lang.Integer.valueOf(mc0Var.f111706o)) && n51.f.a(java.lang.Boolean.valueOf(this.f111707p), java.lang.Boolean.valueOf(mc0Var.f111707p)) && n51.f.a(this.f111708q, mc0Var.f111708q) && n51.f.a(this.f111709r, mc0Var.f111709r) && n51.f.a(this.f111710s, mc0Var.f111710s) && n51.f.a(this.f111711t, mc0Var.f111711t);
    }

    /* renamed from: getNickname */
    public java.lang.String m12487x8010e5e4() {
        return this.f111712u[3] ? this.f111700f : "";
    }

    /* renamed from: getUsername */
    public java.lang.String m12488x6c03c64c() {
        return this.f111712u[2] ? this.f111699e : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111712u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f111698d);
            }
            java.lang.String str = this.f111699e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f111700f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f111701g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f111702h);
            }
            java.lang.String str4 = this.f111703i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f111704m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f111705n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.e(9, this.f111706o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f111707p);
            }
            java.lang.String str7 = this.f111708q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f111709r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f111710s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f111711t;
            if (gVar != null && zArr[14]) {
                fVar.b(14, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f111698d) : 0;
            java.lang.String str10 = this.f111699e;
            if (str10 != null && zArr[2]) {
                h17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f111700f;
            if (str11 != null && zArr[3]) {
                h17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f111701g;
            if (str12 != null && zArr[4]) {
                h17 += b36.f.j(4, str12);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f111702h);
            }
            java.lang.String str13 = this.f111703i;
            if (str13 != null && zArr[6]) {
                h17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f111704m;
            if (str14 != null && zArr[7]) {
                h17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f111705n;
            if (str15 != null && zArr[8]) {
                h17 += b36.f.j(8, str15);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f111706o);
            }
            if (zArr[10]) {
                h17 += b36.f.a(10, this.f111707p);
            }
            java.lang.String str16 = this.f111708q;
            if (str16 != null && zArr[11]) {
                h17 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f111709r;
            if (str17 != null && zArr[12]) {
                h17 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f111710s;
            if (str18 != null && zArr[13]) {
                h17 += b36.f.j(13, str18);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f111711t;
            return (gVar2 == null || !zArr[14]) ? h17 : h17 + b36.f.b(14, gVar2);
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
                this.f111698d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111699e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111700f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111701g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111702h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111703i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111704m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111705n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111706o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f111707p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f111708q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f111709r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f111710s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f111711t = aVar2.d(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
