package bw5;

/* loaded from: classes2.dex */
public class g80 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109256d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109257e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f109258f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f109259g;

    /* renamed from: h, reason: collision with root package name */
    public int f109260h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.i40 f109261i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f109262m;

    /* renamed from: n, reason: collision with root package name */
    public long f109263n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f109264o;

    /* renamed from: p, reason: collision with root package name */
    public int f109265p;

    /* renamed from: q, reason: collision with root package name */
    public int f109266q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.jb0 f109267r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f109268s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.ec0 f109269t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.e90 f109270u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.w60 f109271v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f109272w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f109273x = new boolean[19];

    static {
        new bw5.g80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g80)) {
            return false;
        }
        bw5.g80 g80Var = (bw5.g80) fVar;
        return n51.f.a(this.f76494x2de60e5e, g80Var.f76494x2de60e5e) && n51.f.a(this.f109256d, g80Var.f109256d) && n51.f.a(this.f109257e, g80Var.f109257e) && n51.f.a(java.lang.Boolean.valueOf(this.f109258f), java.lang.Boolean.valueOf(g80Var.f109258f)) && n51.f.a(java.lang.Boolean.valueOf(this.f109259g), java.lang.Boolean.valueOf(g80Var.f109259g)) && n51.f.a(java.lang.Integer.valueOf(this.f109260h), java.lang.Integer.valueOf(g80Var.f109260h)) && n51.f.a(this.f109261i, g80Var.f109261i) && n51.f.a(this.f109262m, g80Var.f109262m) && n51.f.a(java.lang.Long.valueOf(this.f109263n), java.lang.Long.valueOf(g80Var.f109263n)) && n51.f.a(this.f109264o, g80Var.f109264o) && n51.f.a(java.lang.Integer.valueOf(this.f109265p), java.lang.Integer.valueOf(g80Var.f109265p)) && n51.f.a(java.lang.Integer.valueOf(this.f109266q), java.lang.Integer.valueOf(g80Var.f109266q)) && n51.f.a(this.f109267r, g80Var.f109267r) && n51.f.a(this.f109268s, g80Var.f109268s) && n51.f.a(this.f109269t, g80Var.f109269t) && n51.f.a(this.f109270u, g80Var.f109270u) && n51.f.a(this.f109271v, g80Var.f109271v) && n51.f.a(this.f109272w, g80Var.f109272w);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f109273x[1] ? this.f76494x2de60e5e : new r45.he();
    }

    /* renamed from: getListenId */
    public java.lang.String m11970xcc16feb8() {
        return this.f109273x[2] ? this.f109256d : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.g80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109273x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f109256d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f109257e;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[3]) {
                fVar.a(3, this.f109258f);
            }
            if (zArr[5]) {
                fVar.a(5, this.f109259g);
            }
            if (zArr[6]) {
                fVar.e(6, this.f109260h);
            }
            bw5.i40 i40Var = this.f109261i;
            if (i40Var != null && zArr[7]) {
                fVar.i(7, i40Var.mo75928xcd1e8d8());
                this.f109261i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f109262m;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            if (zArr[9]) {
                fVar.h(9, this.f109263n);
            }
            java.lang.String str4 = this.f109264o;
            if (str4 != null && zArr[10]) {
                fVar.j(10, str4);
            }
            if (zArr[11]) {
                fVar.e(11, this.f109265p);
            }
            if (zArr[12]) {
                fVar.e(12, this.f109266q);
            }
            bw5.jb0 jb0Var = this.f109267r;
            if (jb0Var != null && zArr[13]) {
                fVar.i(13, jb0Var.mo75928xcd1e8d8());
                this.f109267r.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f109268s;
            if (str5 != null && zArr[14]) {
                fVar.j(14, str5);
            }
            bw5.ec0 ec0Var = this.f109269t;
            if (ec0Var != null && zArr[15]) {
                fVar.i(15, ec0Var.mo75928xcd1e8d8());
                this.f109269t.mo75956x3d5d1f78(fVar);
            }
            bw5.e90 e90Var = this.f109270u;
            if (e90Var != null && zArr[16]) {
                fVar.i(16, e90Var.mo75928xcd1e8d8());
                this.f109270u.mo75956x3d5d1f78(fVar);
            }
            bw5.w60 w60Var = this.f109271v;
            if (w60Var != null && zArr[17]) {
                fVar.i(17, w60Var.mo75928xcd1e8d8());
                this.f109271v.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.f109272w;
            if (str6 != null && zArr[18]) {
                fVar.j(18, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0;
            }
            java.lang.String str7 = this.f109256d;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f109257e;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f109258f);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f109259g);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f109260h);
            }
            bw5.i40 i40Var2 = this.f109261i;
            if (i40Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, i40Var2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f109262m;
            if (str9 != null && zArr[8]) {
                i18 += b36.f.j(8, str9);
            }
            if (zArr[9]) {
                i18 += b36.f.h(9, this.f109263n);
            }
            java.lang.String str10 = this.f109264o;
            if (str10 != null && zArr[10]) {
                i18 += b36.f.j(10, str10);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f109265p);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f109266q);
            }
            bw5.jb0 jb0Var2 = this.f109267r;
            if (jb0Var2 != null && zArr[13]) {
                i18 += b36.f.i(13, jb0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str11 = this.f109268s;
            if (str11 != null && zArr[14]) {
                i18 += b36.f.j(14, str11);
            }
            bw5.ec0 ec0Var2 = this.f109269t;
            if (ec0Var2 != null && zArr[15]) {
                i18 += b36.f.i(15, ec0Var2.mo75928xcd1e8d8());
            }
            bw5.e90 e90Var2 = this.f109270u;
            if (e90Var2 != null && zArr[16]) {
                i18 += b36.f.i(16, e90Var2.mo75928xcd1e8d8());
            }
            bw5.w60 w60Var2 = this.f109271v;
            if (w60Var2 != null && zArr[17]) {
                i18 += b36.f.i(17, w60Var2.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.f109272w;
            return (str12 == null || !zArr[18]) ? i18 : i18 + b36.f.j(18, str12);
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
                this.f109256d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109258f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109257e = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109259g = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109260h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.i40 i40Var3 = new bw5.i40();
                    if (bArr2 != null && bArr2.length > 0) {
                        i40Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f109261i = i40Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f109262m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109263n = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109264o = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109265p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f109266q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.jb0 jb0Var3 = new bw5.jb0();
                    if (bArr3 != null && bArr3.length > 0) {
                        jb0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f109267r = jb0Var3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                this.f109268s = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ec0 ec0Var3 = new bw5.ec0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ec0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f109269t = ec0Var3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.e90 e90Var3 = new bw5.e90();
                    if (bArr5 != null && bArr5.length > 0) {
                        e90Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f109270u = e90Var3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.w60 w60Var3 = new bw5.w60();
                    if (bArr6 != null && bArr6.length > 0) {
                        w60Var3.mo11468x92b714fd(bArr6);
                    }
                    this.f109271v = w60Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f109272w = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.g80) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f109273x[1] = true;
        return this;
    }
}
