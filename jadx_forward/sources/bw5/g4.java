package bw5;

/* loaded from: classes2.dex */
public class g4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.mi0 A;
    public bw5.ip B;
    public bw5.uo0 C;
    public bw5.b5 D;
    public bw5.vv E;
    public bw5.vk0 F;
    public bw5.qv G;
    public bw5.f9 I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.d7 f109188J;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109189d;

    /* renamed from: e, reason: collision with root package name */
    public int f109190e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109191f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109192g;

    /* renamed from: i, reason: collision with root package name */
    public int f109194i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f109195m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.oc0 f109196n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.tv f109197o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.vv f109198p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.r2 f109199q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.pv f109200r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.ro f109201s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.md0 f109202t;

    /* renamed from: u, reason: collision with root package name */
    public int f109203u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.vv f109204v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.sf0 f109205w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.uv f109206x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.ro0 f109207y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.vv f109208z;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f109193h = new java.util.LinkedList();
    public final java.util.LinkedList H = new java.util.LinkedList();
    public final boolean[] K = new boolean[38];

    static {
        new bw5.g4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g4 mo11468x92b714fd(byte[] bArr) {
        return (bw5.g4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g4)) {
            return false;
        }
        bw5.g4 g4Var = (bw5.g4) fVar;
        return n51.f.a(this.f109189d, g4Var.f109189d) && n51.f.a(java.lang.Integer.valueOf(this.f109190e), java.lang.Integer.valueOf(g4Var.f109190e)) && n51.f.a(this.f109191f, g4Var.f109191f) && n51.f.a(this.f109192g, g4Var.f109192g) && n51.f.a(this.f109193h, g4Var.f109193h) && n51.f.a(java.lang.Integer.valueOf(this.f109194i), java.lang.Integer.valueOf(g4Var.f109194i)) && n51.f.a(this.f109195m, g4Var.f109195m) && n51.f.a(this.f109196n, g4Var.f109196n) && n51.f.a(this.f109197o, g4Var.f109197o) && n51.f.a(this.f109198p, g4Var.f109198p) && n51.f.a(this.f109199q, g4Var.f109199q) && n51.f.a(this.f109200r, g4Var.f109200r) && n51.f.a(this.f109201s, g4Var.f109201s) && n51.f.a(this.f109202t, g4Var.f109202t) && n51.f.a(java.lang.Integer.valueOf(this.f109203u), java.lang.Integer.valueOf(g4Var.f109203u)) && n51.f.a(this.f109204v, g4Var.f109204v) && n51.f.a(this.f109205w, g4Var.f109205w) && n51.f.a(this.f109206x, g4Var.f109206x) && n51.f.a(this.f109207y, g4Var.f109207y) && n51.f.a(this.f109208z, g4Var.f109208z) && n51.f.a(this.A, g4Var.A) && n51.f.a(this.B, g4Var.B) && n51.f.a(this.C, g4Var.C) && n51.f.a(this.D, g4Var.D) && n51.f.a(this.E, g4Var.E) && n51.f.a(this.F, g4Var.F) && n51.f.a(this.G, g4Var.G) && n51.f.a(this.H, g4Var.H) && n51.f.a(this.I, g4Var.I) && n51.f.a(this.f109188J, g4Var.f109188J);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.g4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.K;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109189d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109190e);
            }
            java.lang.String str2 = this.f109191f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f109192g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            fVar.g(5, 8, this.f109193h);
            if (zArr[6]) {
                fVar.e(6, this.f109194i);
            }
            java.lang.String str4 = this.f109195m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            bw5.oc0 oc0Var = this.f109196n;
            if (oc0Var != null && zArr[8]) {
                fVar.i(8, oc0Var.mo75928xcd1e8d8());
                this.f109196n.mo75956x3d5d1f78(fVar);
            }
            bw5.tv tvVar = this.f109197o;
            if (tvVar != null && zArr[9]) {
                fVar.i(9, tvVar.mo75928xcd1e8d8());
                this.f109197o.mo75956x3d5d1f78(fVar);
            }
            bw5.vv vvVar = this.f109198p;
            if (vvVar != null && zArr[10]) {
                fVar.i(10, vvVar.mo75928xcd1e8d8());
                this.f109198p.mo75956x3d5d1f78(fVar);
            }
            bw5.r2 r2Var = this.f109199q;
            if (r2Var != null && zArr[11]) {
                fVar.i(11, r2Var.mo75928xcd1e8d8());
                this.f109199q.mo75956x3d5d1f78(fVar);
            }
            bw5.pv pvVar = this.f109200r;
            if (pvVar != null && zArr[12]) {
                fVar.i(12, pvVar.mo75928xcd1e8d8());
                this.f109200r.mo75956x3d5d1f78(fVar);
            }
            bw5.ro roVar = this.f109201s;
            if (roVar != null && zArr[13]) {
                fVar.i(13, roVar.mo75928xcd1e8d8());
                this.f109201s.mo75956x3d5d1f78(fVar);
            }
            bw5.md0 md0Var = this.f109202t;
            if (md0Var != null && zArr[14]) {
                fVar.i(14, md0Var.mo75928xcd1e8d8());
                this.f109202t.mo75956x3d5d1f78(fVar);
            }
            if (zArr[15]) {
                fVar.e(15, this.f109203u);
            }
            bw5.vv vvVar2 = this.f109204v;
            if (vvVar2 != null && zArr[16]) {
                fVar.i(16, vvVar2.mo75928xcd1e8d8());
                this.f109204v.mo75956x3d5d1f78(fVar);
            }
            bw5.sf0 sf0Var = this.f109205w;
            if (sf0Var != null && zArr[17]) {
                fVar.i(17, sf0Var.mo75928xcd1e8d8());
                this.f109205w.mo75956x3d5d1f78(fVar);
            }
            bw5.uv uvVar = this.f109206x;
            if (uvVar != null && zArr[18]) {
                fVar.i(18, uvVar.mo75928xcd1e8d8());
                this.f109206x.mo75956x3d5d1f78(fVar);
            }
            bw5.ro0 ro0Var = this.f109207y;
            if (ro0Var != null && zArr[19]) {
                fVar.i(19, ro0Var.mo75928xcd1e8d8());
                this.f109207y.mo75956x3d5d1f78(fVar);
            }
            bw5.vv vvVar3 = this.f109208z;
            if (vvVar3 != null && zArr[20]) {
                fVar.i(20, vvVar3.mo75928xcd1e8d8());
                this.f109208z.mo75956x3d5d1f78(fVar);
            }
            bw5.mi0 mi0Var = this.A;
            if (mi0Var != null && zArr[21]) {
                fVar.i(21, mi0Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            bw5.ip ipVar = this.B;
            if (ipVar != null && zArr[22]) {
                fVar.i(22, ipVar.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            bw5.uo0 uo0Var = this.C;
            if (uo0Var != null && zArr[30]) {
                fVar.i(30, uo0Var.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            bw5.b5 b5Var = this.D;
            if (b5Var != null && zArr[31]) {
                fVar.i(31, b5Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            bw5.vv vvVar4 = this.E;
            if (vvVar4 != null && zArr[32]) {
                fVar.i(32, vvVar4.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            bw5.vk0 vk0Var = this.F;
            if (vk0Var != null && zArr[33]) {
                fVar.i(33, vk0Var.mo75928xcd1e8d8());
                this.F.mo75956x3d5d1f78(fVar);
            }
            bw5.qv qvVar = this.G;
            if (qvVar != null && zArr[34]) {
                fVar.i(34, qvVar.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            fVar.g(35, 1, this.H);
            bw5.f9 f9Var = this.I;
            if (f9Var != null && zArr[36]) {
                fVar.i(36, f9Var.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            bw5.d7 d7Var = this.f109188J;
            if (d7Var != null && zArr[37]) {
                fVar.i(37, d7Var.mo75928xcd1e8d8());
                this.f109188J.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f109189d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f109190e);
            }
            java.lang.String str6 = this.f109191f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f109192g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            int g17 = i18 + b36.f.g(5, 8, this.f109193h);
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f109194i);
            }
            java.lang.String str8 = this.f109195m;
            if (str8 != null && zArr[7]) {
                g17 += b36.f.j(7, str8);
            }
            bw5.oc0 oc0Var2 = this.f109196n;
            if (oc0Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, oc0Var2.mo75928xcd1e8d8());
            }
            bw5.tv tvVar2 = this.f109197o;
            if (tvVar2 != null && zArr[9]) {
                g17 += b36.f.i(9, tvVar2.mo75928xcd1e8d8());
            }
            bw5.vv vvVar5 = this.f109198p;
            if (vvVar5 != null && zArr[10]) {
                g17 += b36.f.i(10, vvVar5.mo75928xcd1e8d8());
            }
            bw5.r2 r2Var2 = this.f109199q;
            if (r2Var2 != null && zArr[11]) {
                g17 += b36.f.i(11, r2Var2.mo75928xcd1e8d8());
            }
            bw5.pv pvVar2 = this.f109200r;
            if (pvVar2 != null && zArr[12]) {
                g17 += b36.f.i(12, pvVar2.mo75928xcd1e8d8());
            }
            bw5.ro roVar2 = this.f109201s;
            if (roVar2 != null && zArr[13]) {
                g17 += b36.f.i(13, roVar2.mo75928xcd1e8d8());
            }
            bw5.md0 md0Var2 = this.f109202t;
            if (md0Var2 != null && zArr[14]) {
                g17 += b36.f.i(14, md0Var2.mo75928xcd1e8d8());
            }
            if (zArr[15]) {
                g17 += b36.f.e(15, this.f109203u);
            }
            bw5.vv vvVar6 = this.f109204v;
            if (vvVar6 != null && zArr[16]) {
                g17 += b36.f.i(16, vvVar6.mo75928xcd1e8d8());
            }
            bw5.sf0 sf0Var2 = this.f109205w;
            if (sf0Var2 != null && zArr[17]) {
                g17 += b36.f.i(17, sf0Var2.mo75928xcd1e8d8());
            }
            bw5.uv uvVar2 = this.f109206x;
            if (uvVar2 != null && zArr[18]) {
                g17 += b36.f.i(18, uvVar2.mo75928xcd1e8d8());
            }
            bw5.ro0 ro0Var2 = this.f109207y;
            if (ro0Var2 != null && zArr[19]) {
                g17 += b36.f.i(19, ro0Var2.mo75928xcd1e8d8());
            }
            bw5.vv vvVar7 = this.f109208z;
            if (vvVar7 != null && zArr[20]) {
                g17 += b36.f.i(20, vvVar7.mo75928xcd1e8d8());
            }
            bw5.mi0 mi0Var2 = this.A;
            if (mi0Var2 != null && zArr[21]) {
                g17 += b36.f.i(21, mi0Var2.mo75928xcd1e8d8());
            }
            bw5.ip ipVar2 = this.B;
            if (ipVar2 != null && zArr[22]) {
                g17 += b36.f.i(22, ipVar2.mo75928xcd1e8d8());
            }
            bw5.uo0 uo0Var2 = this.C;
            if (uo0Var2 != null && zArr[30]) {
                g17 += b36.f.i(30, uo0Var2.mo75928xcd1e8d8());
            }
            bw5.b5 b5Var2 = this.D;
            if (b5Var2 != null && zArr[31]) {
                g17 += b36.f.i(31, b5Var2.mo75928xcd1e8d8());
            }
            bw5.vv vvVar8 = this.E;
            if (vvVar8 != null && zArr[32]) {
                g17 += b36.f.i(32, vvVar8.mo75928xcd1e8d8());
            }
            bw5.vk0 vk0Var2 = this.F;
            if (vk0Var2 != null && zArr[33]) {
                g17 += b36.f.i(33, vk0Var2.mo75928xcd1e8d8());
            }
            bw5.qv qvVar2 = this.G;
            if (qvVar2 != null && zArr[34]) {
                g17 += b36.f.i(34, qvVar2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(35, 1, this.H);
            bw5.f9 f9Var2 = this.I;
            if (f9Var2 != null && zArr[36]) {
                g18 += b36.f.i(36, f9Var2.mo75928xcd1e8d8());
            }
            bw5.d7 d7Var2 = this.f109188J;
            return (d7Var2 == null || !zArr[37]) ? g18 : g18 + b36.f.i(37, d7Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f109193h.clear();
            this.H.clear();
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
                this.f109189d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109190e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109191f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109192g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.tc0 tc0Var = new bw5.tc0();
                    if (bArr != null && bArr.length > 0) {
                        tc0Var.mo11468x92b714fd(bArr);
                    }
                    this.f109193h.add(tc0Var);
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f109194i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109195m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.oc0 oc0Var3 = new bw5.oc0();
                    if (bArr2 != null && bArr2.length > 0) {
                        oc0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f109196n = oc0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.tv tvVar3 = new bw5.tv();
                    if (bArr3 != null && bArr3.length > 0) {
                        tvVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f109197o = tvVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.vv vvVar9 = new bw5.vv();
                    if (bArr4 != null && bArr4.length > 0) {
                        vvVar9.mo11468x92b714fd(bArr4);
                    }
                    this.f109198p = vvVar9;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.r2 r2Var3 = new bw5.r2();
                    if (bArr5 != null && bArr5.length > 0) {
                        r2Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f109199q = r2Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.pv pvVar3 = new bw5.pv();
                    if (bArr6 != null && bArr6.length > 0) {
                        pvVar3.mo11468x92b714fd(bArr6);
                    }
                    this.f109200r = pvVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.ro roVar3 = new bw5.ro();
                    if (bArr7 != null && bArr7.length > 0) {
                        roVar3.mo11468x92b714fd(bArr7);
                    }
                    this.f109201s = roVar3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.md0 md0Var3 = new bw5.md0();
                    if (bArr8 != null && bArr8.length > 0) {
                        md0Var3.mo11468x92b714fd(bArr8);
                    }
                    this.f109202t = md0Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f109203u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.vv vvVar10 = new bw5.vv();
                    if (bArr9 != null && bArr9.length > 0) {
                        vvVar10.mo11468x92b714fd(bArr9);
                    }
                    this.f109204v = vvVar10;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.sf0 sf0Var3 = new bw5.sf0();
                    if (bArr10 != null && bArr10.length > 0) {
                        sf0Var3.mo11468x92b714fd(bArr10);
                    }
                    this.f109205w = sf0Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.uv uvVar3 = new bw5.uv();
                    if (bArr11 != null && bArr11.length > 0) {
                        uvVar3.mo11468x92b714fd(bArr11);
                    }
                    this.f109206x = uvVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.ro0 ro0Var3 = new bw5.ro0();
                    if (bArr12 != null && bArr12.length > 0) {
                        ro0Var3.mo11468x92b714fd(bArr12);
                    }
                    this.f109207y = ro0Var3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.vv vvVar11 = new bw5.vv();
                    if (bArr13 != null && bArr13.length > 0) {
                        vvVar11.mo11468x92b714fd(bArr13);
                    }
                    this.f109208z = vvVar11;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.mi0 mi0Var3 = new bw5.mi0();
                    if (bArr14 != null && bArr14.length > 0) {
                        mi0Var3.mo11468x92b714fd(bArr14);
                    }
                    this.A = mi0Var3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    bw5.ip ipVar3 = new bw5.ip();
                    if (bArr15 != null && bArr15.length > 0) {
                        ipVar3.mo11468x92b714fd(bArr15);
                    }
                    this.B = ipVar3;
                }
                zArr[22] = true;
                return 0;
            default:
                switch (intValue) {
                    case 30:
                        java.util.LinkedList j66 = aVar2.j(intValue);
                        int size16 = j66.size();
                        for (int i68 = 0; i68 < size16; i68++) {
                            byte[] bArr16 = (byte[]) j66.get(i68);
                            bw5.uo0 uo0Var3 = new bw5.uo0();
                            if (bArr16 != null && bArr16.length > 0) {
                                uo0Var3.mo11468x92b714fd(bArr16);
                            }
                            this.C = uo0Var3;
                        }
                        zArr[30] = true;
                        return 0;
                    case 31:
                        java.util.LinkedList j67 = aVar2.j(intValue);
                        int size17 = j67.size();
                        for (int i69 = 0; i69 < size17; i69++) {
                            byte[] bArr17 = (byte[]) j67.get(i69);
                            bw5.b5 b5Var3 = new bw5.b5();
                            if (bArr17 != null && bArr17.length > 0) {
                                b5Var3.mo11468x92b714fd(bArr17);
                            }
                            this.D = b5Var3;
                        }
                        zArr[31] = true;
                        return 0;
                    case 32:
                        java.util.LinkedList j68 = aVar2.j(intValue);
                        int size18 = j68.size();
                        for (int i76 = 0; i76 < size18; i76++) {
                            byte[] bArr18 = (byte[]) j68.get(i76);
                            bw5.vv vvVar12 = new bw5.vv();
                            if (bArr18 != null && bArr18.length > 0) {
                                vvVar12.mo11468x92b714fd(bArr18);
                            }
                            this.E = vvVar12;
                        }
                        zArr[32] = true;
                        return 0;
                    case 33:
                        java.util.LinkedList j69 = aVar2.j(intValue);
                        int size19 = j69.size();
                        for (int i77 = 0; i77 < size19; i77++) {
                            byte[] bArr19 = (byte[]) j69.get(i77);
                            bw5.vk0 vk0Var3 = new bw5.vk0();
                            if (bArr19 != null && bArr19.length > 0) {
                                vk0Var3.mo11468x92b714fd(bArr19);
                            }
                            this.F = vk0Var3;
                        }
                        zArr[33] = true;
                        return 0;
                    case 34:
                        java.util.LinkedList j76 = aVar2.j(intValue);
                        int size20 = j76.size();
                        for (int i78 = 0; i78 < size20; i78++) {
                            byte[] bArr20 = (byte[]) j76.get(i78);
                            bw5.qv qvVar3 = new bw5.qv();
                            if (bArr20 != null && bArr20.length > 0) {
                                qvVar3.mo11468x92b714fd(bArr20);
                            }
                            this.G = qvVar3;
                        }
                        zArr[34] = true;
                        return 0;
                    case 35:
                        this.H.add(aVar2.k(intValue));
                        zArr[35] = true;
                        return 0;
                    case 36:
                        java.util.LinkedList j77 = aVar2.j(intValue);
                        int size21 = j77.size();
                        for (int i79 = 0; i79 < size21; i79++) {
                            byte[] bArr21 = (byte[]) j77.get(i79);
                            bw5.f9 f9Var3 = new bw5.f9();
                            if (bArr21 != null && bArr21.length > 0) {
                                f9Var3.mo11468x92b714fd(bArr21);
                            }
                            this.I = f9Var3;
                        }
                        zArr[36] = true;
                        return 0;
                    case 37:
                        java.util.LinkedList j78 = aVar2.j(intValue);
                        int size22 = j78.size();
                        for (int i86 = 0; i86 < size22; i86++) {
                            byte[] bArr22 = (byte[]) j78.get(i86);
                            bw5.d7 d7Var3 = new bw5.d7();
                            if (bArr22 != null && bArr22.length > 0) {
                                d7Var3.mo11468x92b714fd(bArr22);
                            }
                            this.f109188J = d7Var3;
                        }
                        zArr[37] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
