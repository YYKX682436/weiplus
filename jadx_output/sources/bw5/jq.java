package bw5;

/* loaded from: classes2.dex */
public class jq extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public int A1;
    public java.lang.String B;
    public long B1;
    public java.lang.String C;
    public com.tencent.mm.protobuf.g C1;
    public float D;
    public bw5.sp D1;
    public float E;
    public bw5.tu E1;
    public java.lang.String F;
    public int G;
    public int H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f29080J;
    public java.lang.String K;
    public bw5.zg L;
    public bw5.qt N;
    public int P;
    public int Q;
    public int R;
    public long S;
    public bw5.kq U;
    public long V;
    public java.lang.String W;
    public bw5.ne X;
    public bw5.mq Y;
    public bw5.rc Z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29081d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29082e;

    /* renamed from: f, reason: collision with root package name */
    public int f29083f;

    /* renamed from: g, reason: collision with root package name */
    public int f29084g;

    /* renamed from: h, reason: collision with root package name */
    public float f29085h;

    /* renamed from: i, reason: collision with root package name */
    public float f29086i;

    /* renamed from: l1, reason: collision with root package name */
    public bw5.un f29087l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29088m;

    /* renamed from: n, reason: collision with root package name */
    public int f29089n;

    /* renamed from: o, reason: collision with root package name */
    public int f29090o;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f29092p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f29093p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f29094q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f29095r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f29096s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f29097t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f29098u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.lq f29099v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.sm f29100w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.ch f29101x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f29102x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f29103x1;

    /* renamed from: y, reason: collision with root package name */
    public int f29104y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f29105y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f29106y1;

    /* renamed from: z, reason: collision with root package name */
    public bw5.yg f29107z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f29108z1;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f29091p = new java.util.LinkedList();
    public final java.util.LinkedList M = new java.util.LinkedList();
    public final java.util.LinkedList T = new java.util.LinkedList();
    public final boolean[] F1 = new boolean[59];

    static {
        new bw5.jq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jq parseFrom(byte[] bArr) {
        return (bw5.jq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jq)) {
            return false;
        }
        bw5.jq jqVar = (bw5.jq) fVar;
        return n51.f.a(this.f29081d, jqVar.f29081d) && n51.f.a(this.f29082e, jqVar.f29082e) && n51.f.a(java.lang.Integer.valueOf(this.f29083f), java.lang.Integer.valueOf(jqVar.f29083f)) && n51.f.a(java.lang.Integer.valueOf(this.f29084g), java.lang.Integer.valueOf(jqVar.f29084g)) && n51.f.a(java.lang.Float.valueOf(this.f29085h), java.lang.Float.valueOf(jqVar.f29085h)) && n51.f.a(java.lang.Float.valueOf(this.f29086i), java.lang.Float.valueOf(jqVar.f29086i)) && n51.f.a(this.f29088m, jqVar.f29088m) && n51.f.a(java.lang.Integer.valueOf(this.f29089n), java.lang.Integer.valueOf(jqVar.f29089n)) && n51.f.a(java.lang.Integer.valueOf(this.f29090o), java.lang.Integer.valueOf(jqVar.f29090o)) && n51.f.a(this.f29091p, jqVar.f29091p) && n51.f.a(this.f29094q, jqVar.f29094q) && n51.f.a(this.f29095r, jqVar.f29095r) && n51.f.a(this.f29096s, jqVar.f29096s) && n51.f.a(this.f29097t, jqVar.f29097t) && n51.f.a(this.f29098u, jqVar.f29098u) && n51.f.a(this.f29099v, jqVar.f29099v) && n51.f.a(this.f29100w, jqVar.f29100w) && n51.f.a(this.f29101x, jqVar.f29101x) && n51.f.a(java.lang.Integer.valueOf(this.f29104y), java.lang.Integer.valueOf(jqVar.f29104y)) && n51.f.a(this.f29107z, jqVar.f29107z) && n51.f.a(this.A, jqVar.A) && n51.f.a(this.B, jqVar.B) && n51.f.a(this.C, jqVar.C) && n51.f.a(java.lang.Float.valueOf(this.D), java.lang.Float.valueOf(jqVar.D)) && n51.f.a(java.lang.Float.valueOf(this.E), java.lang.Float.valueOf(jqVar.E)) && n51.f.a(this.F, jqVar.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(jqVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(jqVar.H)) && n51.f.a(this.I, jqVar.I) && n51.f.a(this.f29080J, jqVar.f29080J) && n51.f.a(this.K, jqVar.K) && n51.f.a(this.L, jqVar.L) && n51.f.a(this.M, jqVar.M) && n51.f.a(this.N, jqVar.N) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(jqVar.P)) && n51.f.a(java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(jqVar.Q)) && n51.f.a(java.lang.Integer.valueOf(this.R), java.lang.Integer.valueOf(jqVar.R)) && n51.f.a(java.lang.Long.valueOf(this.S), java.lang.Long.valueOf(jqVar.S)) && n51.f.a(this.T, jqVar.T) && n51.f.a(this.U, jqVar.U) && n51.f.a(java.lang.Long.valueOf(this.V), java.lang.Long.valueOf(jqVar.V)) && n51.f.a(this.W, jqVar.W) && n51.f.a(this.X, jqVar.X) && n51.f.a(this.Y, jqVar.Y) && n51.f.a(this.Z, jqVar.Z) && n51.f.a(this.f29092p0, jqVar.f29092p0) && n51.f.a(this.f29102x0, jqVar.f29102x0) && n51.f.a(this.f29105y0, jqVar.f29105y0) && n51.f.a(this.f29087l1, jqVar.f29087l1) && n51.f.a(this.f29093p1, jqVar.f29093p1) && n51.f.a(this.f29103x1, jqVar.f29103x1) && n51.f.a(this.f29106y1, jqVar.f29106y1) && n51.f.a(this.f29108z1, jqVar.f29108z1) && n51.f.a(java.lang.Integer.valueOf(this.A1), java.lang.Integer.valueOf(jqVar.A1)) && n51.f.a(java.lang.Long.valueOf(this.B1), java.lang.Long.valueOf(jqVar.B1)) && n51.f.a(this.C1, jqVar.C1) && n51.f.a(this.D1, jqVar.D1) && n51.f.a(this.E1, jqVar.E1);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.F1;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29081d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f29082e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.f(3, this.f29083f);
            }
            if (zArr[4]) {
                fVar.f(4, this.f29084g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f29085h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f29086i);
            }
            java.lang.String str3 = this.f29088m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.f(8, this.f29089n);
            }
            if (zArr[9]) {
                fVar.f(9, this.f29090o);
            }
            fVar.g(10, 8, this.f29091p);
            java.lang.String str4 = this.f29094q;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f29095r;
            if (str5 != null && zArr[12]) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f29096s;
            if (str6 != null && zArr[13]) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.f29097t;
            if (str7 != null && zArr[14]) {
                fVar.j(14, str7);
            }
            java.lang.String str8 = this.f29098u;
            if (str8 != null && zArr[15]) {
                fVar.j(15, str8);
            }
            bw5.lq lqVar = this.f29099v;
            if (lqVar != null && zArr[16]) {
                fVar.i(16, lqVar.computeSize());
                this.f29099v.writeFields(fVar);
            }
            bw5.sm smVar = this.f29100w;
            if (smVar != null && zArr[17]) {
                fVar.i(17, smVar.computeSize());
                this.f29100w.writeFields(fVar);
            }
            bw5.ch chVar = this.f29101x;
            if (chVar != null && zArr[18]) {
                fVar.i(18, chVar.computeSize());
                this.f29101x.writeFields(fVar);
            }
            if (zArr[19]) {
                fVar.f(19, this.f29104y);
            }
            bw5.yg ygVar = this.f29107z;
            if (ygVar != null && zArr[20]) {
                fVar.i(20, ygVar.computeSize());
                this.f29107z.writeFields(fVar);
            }
            java.lang.String str9 = this.A;
            if (str9 != null && zArr[21]) {
                fVar.j(21, str9);
            }
            java.lang.String str10 = this.B;
            if (str10 != null && zArr[22]) {
                fVar.j(22, str10);
            }
            java.lang.String str11 = this.C;
            if (str11 != null && zArr[23]) {
                fVar.j(23, str11);
            }
            if (zArr[24]) {
                fVar.d(24, this.D);
            }
            if (zArr[25]) {
                fVar.d(25, this.E);
            }
            java.lang.String str12 = this.F;
            if (str12 != null && zArr[26]) {
                fVar.j(26, str12);
            }
            if (zArr[27]) {
                fVar.f(27, this.G);
            }
            if (zArr[28]) {
                fVar.f(28, this.H);
            }
            java.lang.String str13 = this.I;
            if (str13 != null && zArr[29]) {
                fVar.j(29, str13);
            }
            java.lang.String str14 = this.f29080J;
            if (str14 != null && zArr[30]) {
                fVar.j(30, str14);
            }
            java.lang.String str15 = this.K;
            if (str15 != null && zArr[31]) {
                fVar.j(31, str15);
            }
            bw5.zg zgVar = this.L;
            if (zgVar != null && zArr[32]) {
                fVar.i(32, zgVar.computeSize());
                this.L.writeFields(fVar);
            }
            fVar.g(33, 8, this.M);
            bw5.qt qtVar = this.N;
            if (qtVar != null && zArr[34]) {
                fVar.i(34, qtVar.computeSize());
                this.N.writeFields(fVar);
            }
            if (zArr[35]) {
                fVar.f(35, this.P);
            }
            if (zArr[36]) {
                fVar.f(36, this.Q);
            }
            if (zArr[37]) {
                fVar.f(37, this.R);
            }
            if (zArr[38]) {
                fVar.h(38, this.S);
            }
            fVar.g(39, 8, this.T);
            bw5.kq kqVar = this.U;
            if (kqVar != null && zArr[40]) {
                fVar.i(40, kqVar.computeSize());
                this.U.writeFields(fVar);
            }
            if (zArr[41]) {
                fVar.h(41, this.V);
            }
            java.lang.String str16 = this.W;
            if (str16 != null && zArr[42]) {
                fVar.j(42, str16);
            }
            bw5.ne neVar = this.X;
            if (neVar != null && zArr[43]) {
                fVar.i(43, neVar.computeSize());
                this.X.writeFields(fVar);
            }
            bw5.mq mqVar = this.Y;
            if (mqVar != null && zArr[44]) {
                fVar.i(44, mqVar.computeSize());
                this.Y.writeFields(fVar);
            }
            bw5.rc rcVar = this.Z;
            if (rcVar != null && zArr[45]) {
                fVar.i(45, rcVar.computeSize());
                this.Z.writeFields(fVar);
            }
            java.lang.String str17 = this.f29092p0;
            if (str17 != null && zArr[46]) {
                fVar.j(46, str17);
            }
            java.lang.String str18 = this.f29102x0;
            if (str18 != null && zArr[47]) {
                fVar.j(47, str18);
            }
            java.lang.String str19 = this.f29105y0;
            if (str19 != null && zArr[48]) {
                fVar.j(48, str19);
            }
            bw5.un unVar = this.f29087l1;
            if (unVar != null && zArr[49]) {
                fVar.i(49, unVar.computeSize());
                this.f29087l1.writeFields(fVar);
            }
            java.lang.String str20 = this.f29093p1;
            if (str20 != null && zArr[50]) {
                fVar.j(50, str20);
            }
            java.lang.String str21 = this.f29103x1;
            if (str21 != null && zArr[51]) {
                fVar.j(51, str21);
            }
            java.lang.String str22 = this.f29106y1;
            if (str22 != null && zArr[52]) {
                fVar.j(52, str22);
            }
            java.lang.String str23 = this.f29108z1;
            if (str23 != null && zArr[53]) {
                fVar.j(53, str23);
            }
            if (zArr[54]) {
                fVar.f(54, this.A1);
            }
            if (zArr[55]) {
                fVar.h(55, this.B1);
            }
            com.tencent.mm.protobuf.g gVar = this.C1;
            if (gVar != null && zArr[56]) {
                fVar.b(56, gVar);
            }
            bw5.sp spVar = this.D1;
            if (spVar != null && zArr[57]) {
                fVar.i(57, spVar.computeSize());
                this.D1.writeFields(fVar);
            }
            bw5.tu tuVar = this.E1;
            if (tuVar != null && zArr[58]) {
                fVar.i(58, tuVar.computeSize());
                this.E1.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str24 = this.f29081d;
            if (str24 != null && zArr[1]) {
                i18 = b36.f.j(1, str24) + 0;
            }
            java.lang.String str25 = this.f29082e;
            if (str25 != null && zArr[2]) {
                i18 += b36.f.j(2, str25);
            }
            if (zArr[3]) {
                i18 += b36.f.f(3, this.f29083f);
            }
            if (zArr[4]) {
                i18 += b36.f.f(4, this.f29084g);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f29085h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f29086i);
            }
            java.lang.String str26 = this.f29088m;
            if (str26 != null && zArr[7]) {
                i18 += b36.f.j(7, str26);
            }
            if (zArr[8]) {
                i18 += b36.f.f(8, this.f29089n);
            }
            if (zArr[9]) {
                i18 += b36.f.f(9, this.f29090o);
            }
            int g17 = i18 + b36.f.g(10, 8, this.f29091p);
            java.lang.String str27 = this.f29094q;
            if (str27 != null && zArr[11]) {
                g17 += b36.f.j(11, str27);
            }
            java.lang.String str28 = this.f29095r;
            if (str28 != null && zArr[12]) {
                g17 += b36.f.j(12, str28);
            }
            java.lang.String str29 = this.f29096s;
            if (str29 != null && zArr[13]) {
                g17 += b36.f.j(13, str29);
            }
            java.lang.String str30 = this.f29097t;
            if (str30 != null && zArr[14]) {
                g17 += b36.f.j(14, str30);
            }
            java.lang.String str31 = this.f29098u;
            if (str31 != null && zArr[15]) {
                g17 += b36.f.j(15, str31);
            }
            bw5.lq lqVar2 = this.f29099v;
            if (lqVar2 != null && zArr[16]) {
                g17 += b36.f.i(16, lqVar2.computeSize());
            }
            bw5.sm smVar2 = this.f29100w;
            if (smVar2 != null && zArr[17]) {
                g17 += b36.f.i(17, smVar2.computeSize());
            }
            bw5.ch chVar2 = this.f29101x;
            if (chVar2 != null && zArr[18]) {
                g17 += b36.f.i(18, chVar2.computeSize());
            }
            if (zArr[19]) {
                g17 += b36.f.f(19, this.f29104y);
            }
            bw5.yg ygVar2 = this.f29107z;
            if (ygVar2 != null && zArr[20]) {
                g17 += b36.f.i(20, ygVar2.computeSize());
            }
            java.lang.String str32 = this.A;
            if (str32 != null && zArr[21]) {
                g17 += b36.f.j(21, str32);
            }
            java.lang.String str33 = this.B;
            if (str33 != null && zArr[22]) {
                g17 += b36.f.j(22, str33);
            }
            java.lang.String str34 = this.C;
            if (str34 != null && zArr[23]) {
                g17 += b36.f.j(23, str34);
            }
            if (zArr[24]) {
                g17 += b36.f.d(24, this.D);
            }
            if (zArr[25]) {
                g17 += b36.f.d(25, this.E);
            }
            java.lang.String str35 = this.F;
            if (str35 != null && zArr[26]) {
                g17 += b36.f.j(26, str35);
            }
            if (zArr[27]) {
                g17 += b36.f.f(27, this.G);
            }
            if (zArr[28]) {
                g17 += b36.f.f(28, this.H);
            }
            java.lang.String str36 = this.I;
            if (str36 != null && zArr[29]) {
                g17 += b36.f.j(29, str36);
            }
            java.lang.String str37 = this.f29080J;
            if (str37 != null && zArr[30]) {
                g17 += b36.f.j(30, str37);
            }
            java.lang.String str38 = this.K;
            if (str38 != null && zArr[31]) {
                g17 += b36.f.j(31, str38);
            }
            bw5.zg zgVar2 = this.L;
            if (zgVar2 != null && zArr[32]) {
                g17 += b36.f.i(32, zgVar2.computeSize());
            }
            int g18 = g17 + b36.f.g(33, 8, this.M);
            bw5.qt qtVar2 = this.N;
            if (qtVar2 != null && zArr[34]) {
                g18 += b36.f.i(34, qtVar2.computeSize());
            }
            if (zArr[35]) {
                g18 += b36.f.f(35, this.P);
            }
            if (zArr[36]) {
                g18 += b36.f.f(36, this.Q);
            }
            if (zArr[37]) {
                g18 += b36.f.f(37, this.R);
            }
            if (zArr[38]) {
                g18 += b36.f.h(38, this.S);
            }
            int g19 = g18 + b36.f.g(39, 8, this.T);
            bw5.kq kqVar2 = this.U;
            if (kqVar2 != null && zArr[40]) {
                g19 += b36.f.i(40, kqVar2.computeSize());
            }
            if (zArr[41]) {
                g19 += b36.f.h(41, this.V);
            }
            java.lang.String str39 = this.W;
            if (str39 != null && zArr[42]) {
                g19 += b36.f.j(42, str39);
            }
            bw5.ne neVar2 = this.X;
            if (neVar2 != null && zArr[43]) {
                g19 += b36.f.i(43, neVar2.computeSize());
            }
            bw5.mq mqVar2 = this.Y;
            if (mqVar2 != null && zArr[44]) {
                g19 += b36.f.i(44, mqVar2.computeSize());
            }
            bw5.rc rcVar2 = this.Z;
            if (rcVar2 != null && zArr[45]) {
                g19 += b36.f.i(45, rcVar2.computeSize());
            }
            java.lang.String str40 = this.f29092p0;
            if (str40 != null && zArr[46]) {
                g19 += b36.f.j(46, str40);
            }
            java.lang.String str41 = this.f29102x0;
            if (str41 != null && zArr[47]) {
                g19 += b36.f.j(47, str41);
            }
            java.lang.String str42 = this.f29105y0;
            if (str42 != null && zArr[48]) {
                g19 += b36.f.j(48, str42);
            }
            bw5.un unVar2 = this.f29087l1;
            if (unVar2 != null && zArr[49]) {
                g19 += b36.f.i(49, unVar2.computeSize());
            }
            java.lang.String str43 = this.f29093p1;
            if (str43 != null && zArr[50]) {
                g19 += b36.f.j(50, str43);
            }
            java.lang.String str44 = this.f29103x1;
            if (str44 != null && zArr[51]) {
                g19 += b36.f.j(51, str44);
            }
            java.lang.String str45 = this.f29106y1;
            if (str45 != null && zArr[52]) {
                g19 += b36.f.j(52, str45);
            }
            java.lang.String str46 = this.f29108z1;
            if (str46 != null && zArr[53]) {
                g19 += b36.f.j(53, str46);
            }
            if (zArr[54]) {
                g19 += b36.f.f(54, this.A1);
            }
            if (zArr[55]) {
                g19 += b36.f.h(55, this.B1);
            }
            com.tencent.mm.protobuf.g gVar2 = this.C1;
            if (gVar2 != null && zArr[56]) {
                g19 += b36.f.b(56, gVar2);
            }
            bw5.sp spVar2 = this.D1;
            if (spVar2 != null && zArr[57]) {
                g19 += b36.f.i(57, spVar2.computeSize());
            }
            bw5.tu tuVar2 = this.E1;
            return (tuVar2 == null || !zArr[58]) ? g19 : g19 + b36.f.i(58, tuVar2.computeSize());
        }
        if (i17 == 2) {
            this.f29091p.clear();
            this.M.clear();
            this.T.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
                this.f29081d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29082e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29083f = aVar2.h(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29084g = aVar2.h(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29085h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29086i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29088m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29089n = aVar2.h(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f29090o = aVar2.h(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.oq oqVar = new bw5.oq();
                    if (bArr != null && bArr.length > 0) {
                        oqVar.parseFrom(bArr);
                    }
                    this.f29091p.add(oqVar);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f29094q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f29095r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f29096s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f29097t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f29098u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.lq lqVar3 = new bw5.lq();
                    if (bArr2 != null && bArr2.length > 0) {
                        lqVar3.parseFrom(bArr2);
                    }
                    this.f29099v = lqVar3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.sm smVar3 = new bw5.sm();
                    if (bArr3 != null && bArr3.length > 0) {
                        smVar3.parseFrom(bArr3);
                    }
                    this.f29100w = smVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ch chVar3 = new bw5.ch();
                    if (bArr4 != null && bArr4.length > 0) {
                        chVar3.parseFrom(bArr4);
                    }
                    this.f29101x = chVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f29104y = aVar2.h(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.yg ygVar3 = new bw5.yg();
                    if (bArr5 != null && bArr5.length > 0) {
                        ygVar3.parseFrom(bArr5);
                    }
                    this.f29107z = ygVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.k(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.f(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.f(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.k(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.h(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.h(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.k(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.f29080J = aVar2.k(intValue);
                zArr[30] = true;
                return 0;
            case 31:
                this.K = aVar2.k(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.zg zgVar3 = new bw5.zg();
                    if (bArr6 != null && bArr6.length > 0) {
                        zgVar3.parseFrom(bArr6);
                    }
                    this.L = zgVar3;
                }
                zArr[32] = true;
                return 0;
            case 33:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.lm lmVar = new bw5.lm();
                    if (bArr7 != null && bArr7.length > 0) {
                        lmVar.parseFrom(bArr7);
                    }
                    this.M.add(lmVar);
                }
                zArr[33] = true;
                return 0;
            case 34:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.qt qtVar3 = new bw5.qt();
                    if (bArr8 != null && bArr8.length > 0) {
                        qtVar3.parseFrom(bArr8);
                    }
                    this.N = qtVar3;
                }
                zArr[34] = true;
                return 0;
            case 35:
                this.P = aVar2.h(intValue);
                zArr[35] = true;
                return 0;
            case 36:
                this.Q = aVar2.h(intValue);
                zArr[36] = true;
                return 0;
            case 37:
                this.R = aVar2.h(intValue);
                zArr[37] = true;
                return 0;
            case 38:
                this.S = aVar2.i(intValue);
                zArr[38] = true;
                return 0;
            case 39:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.kc kcVar = new bw5.kc();
                    if (bArr9 != null && bArr9.length > 0) {
                        kcVar.parseFrom(bArr9);
                    }
                    this.T.add(kcVar);
                }
                zArr[39] = true;
                return 0;
            case 40:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.kq kqVar3 = new bw5.kq();
                    if (bArr10 != null && bArr10.length > 0) {
                        kqVar3.parseFrom(bArr10);
                    }
                    this.U = kqVar3;
                }
                zArr[40] = true;
                return 0;
            case 41:
                this.V = aVar2.i(intValue);
                zArr[41] = true;
                return 0;
            case 42:
                this.W = aVar2.k(intValue);
                zArr[42] = true;
                return 0;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.ne neVar3 = new bw5.ne();
                    if (bArr11 != null && bArr11.length > 0) {
                        neVar3.parseFrom(bArr11);
                    }
                    this.X = neVar3;
                }
                zArr[43] = true;
                return 0;
            case 44:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.mq mqVar3 = new bw5.mq();
                    if (bArr12 != null && bArr12.length > 0) {
                        mqVar3.parseFrom(bArr12);
                    }
                    this.Y = mqVar3;
                }
                zArr[44] = true;
                return 0;
            case 45:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.rc rcVar3 = new bw5.rc();
                    if (bArr13 != null && bArr13.length > 0) {
                        rcVar3.parseFrom(bArr13);
                    }
                    this.Z = rcVar3;
                }
                zArr[45] = true;
                return 0;
            case 46:
                this.f29092p0 = aVar2.k(intValue);
                zArr[46] = true;
                return 0;
            case 47:
                this.f29102x0 = aVar2.k(intValue);
                zArr[47] = true;
                return 0;
            case 48:
                this.f29105y0 = aVar2.k(intValue);
                zArr[48] = true;
                return 0;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.un unVar3 = new bw5.un();
                    if (bArr14 != null && bArr14.length > 0) {
                        unVar3.parseFrom(bArr14);
                    }
                    this.f29087l1 = unVar3;
                }
                zArr[49] = true;
                return 0;
            case 50:
                this.f29093p1 = aVar2.k(intValue);
                zArr[50] = true;
                return 0;
            case 51:
                this.f29103x1 = aVar2.k(intValue);
                zArr[51] = true;
                return 0;
            case 52:
                this.f29106y1 = aVar2.k(intValue);
                zArr[52] = true;
                return 0;
            case 53:
                this.f29108z1 = aVar2.k(intValue);
                zArr[53] = true;
                return 0;
            case 54:
                this.A1 = aVar2.h(intValue);
                zArr[54] = true;
                return 0;
            case 55:
                this.B1 = aVar2.i(intValue);
                zArr[55] = true;
                return 0;
            case 56:
                this.C1 = aVar2.d(intValue);
                zArr[56] = true;
                return 0;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    bw5.sp spVar3 = new bw5.sp();
                    if (bArr15 != null && bArr15.length > 0) {
                        spVar3.parseFrom(bArr15);
                    }
                    this.D1 = spVar3;
                }
                zArr[57] = true;
                return 0;
            case 58:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr16 = (byte[]) j66.get(i68);
                    bw5.tu tuVar3 = new bw5.tu();
                    if (bArr16 != null && bArr16.length > 0) {
                        tuVar3.parseFrom(bArr16);
                    }
                    this.E1 = tuVar3;
                }
                zArr[58] = true;
                return 0;
            default:
                return -1;
        }
    }
}
