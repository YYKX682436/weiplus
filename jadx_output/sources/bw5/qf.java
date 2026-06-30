package bw5;

/* loaded from: classes9.dex */
public class qf extends com.tencent.mm.protobuf.f {
    public bw5.nf A;
    public int B;
    public final boolean[] C = new boolean[23];

    /* renamed from: d, reason: collision with root package name */
    public long f32067d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a9 f32068e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o9 f32069f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.a9 f32070g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.o9 f32071h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.d9 f32072i;

    /* renamed from: m, reason: collision with root package name */
    public int f32073m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.lf f32074n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.hf f32075o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.Cif f32076p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f32077q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f32078r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.of f32079s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.x7 f32080t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f32081u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.a9 f32082v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.a9 f32083w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.a9 f32084x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.pf f32085y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.jf f32086z;

    static {
        new bw5.qf();
    }

    public java.lang.String b() {
        return this.C[15] ? this.f32081u : "";
    }

    public bw5.jf c() {
        return this.C[20] ? this.f32086z : new bw5.jf();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qf)) {
            return false;
        }
        bw5.qf qfVar = (bw5.qf) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f32067d), java.lang.Long.valueOf(qfVar.f32067d)) && n51.f.a(this.f32068e, qfVar.f32068e) && n51.f.a(this.f32069f, qfVar.f32069f) && n51.f.a(this.f32070g, qfVar.f32070g) && n51.f.a(this.f32071h, qfVar.f32071h) && n51.f.a(this.f32072i, qfVar.f32072i) && n51.f.a(java.lang.Integer.valueOf(this.f32073m), java.lang.Integer.valueOf(qfVar.f32073m)) && n51.f.a(this.f32074n, qfVar.f32074n) && n51.f.a(this.f32075o, qfVar.f32075o) && n51.f.a(this.f32076p, qfVar.f32076p) && n51.f.a(this.f32077q, qfVar.f32077q) && n51.f.a(this.f32078r, qfVar.f32078r) && n51.f.a(this.f32079s, qfVar.f32079s) && n51.f.a(this.f32080t, qfVar.f32080t) && n51.f.a(this.f32081u, qfVar.f32081u) && n51.f.a(this.f32082v, qfVar.f32082v) && n51.f.a(this.f32083w, qfVar.f32083w) && n51.f.a(this.f32084x, qfVar.f32084x) && n51.f.a(this.f32085y, qfVar.f32085y) && n51.f.a(this.f32086z, qfVar.f32086z) && n51.f.a(this.A, qfVar.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(qfVar.B));
    }

    public bw5.Cif d() {
        return this.C[10] ? this.f32076p : new bw5.Cif();
    }

    public bw5.x7 e() {
        return this.C[14] ? this.f32080t : new bw5.x7();
    }

    public bw5.nf f() {
        return this.C[21] ? this.A : new bw5.nf();
    }

    public bw5.of g() {
        return this.C[13] ? this.f32079s : new bw5.of();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public bw5.qf parseFrom(byte[] bArr) {
        return (bw5.qf) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qf();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.C;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f32067d);
            }
            bw5.a9 a9Var = this.f32068e;
            if (a9Var != null && zArr[2]) {
                fVar.i(2, a9Var.computeSize());
                this.f32068e.writeFields(fVar);
            }
            bw5.o9 o9Var = this.f32069f;
            if (o9Var != null && zArr[3]) {
                fVar.i(3, o9Var.computeSize());
                this.f32069f.writeFields(fVar);
            }
            bw5.a9 a9Var2 = this.f32070g;
            if (a9Var2 != null && zArr[4]) {
                fVar.i(4, a9Var2.computeSize());
                this.f32070g.writeFields(fVar);
            }
            bw5.o9 o9Var2 = this.f32071h;
            if (o9Var2 != null && zArr[5]) {
                fVar.i(5, o9Var2.computeSize());
                this.f32071h.writeFields(fVar);
            }
            bw5.d9 d9Var = this.f32072i;
            if (d9Var != null && zArr[6]) {
                fVar.i(6, d9Var.computeSize());
                this.f32072i.writeFields(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32073m);
            }
            bw5.lf lfVar = this.f32074n;
            if (lfVar != null && zArr[8]) {
                fVar.i(8, lfVar.computeSize());
                this.f32074n.writeFields(fVar);
            }
            bw5.hf hfVar = this.f32075o;
            if (hfVar != null && zArr[9]) {
                fVar.i(9, hfVar.computeSize());
                this.f32075o.writeFields(fVar);
            }
            bw5.Cif cif = this.f32076p;
            if (cif != null && zArr[10]) {
                fVar.i(10, cif.computeSize());
                this.f32076p.writeFields(fVar);
            }
            java.lang.String str = this.f32077q;
            if (str != null && zArr[11]) {
                fVar.j(11, str);
            }
            java.lang.String str2 = this.f32078r;
            if (str2 != null && zArr[12]) {
                fVar.j(12, str2);
            }
            bw5.of ofVar = this.f32079s;
            if (ofVar != null && zArr[13]) {
                fVar.i(13, ofVar.computeSize());
                this.f32079s.writeFields(fVar);
            }
            bw5.x7 x7Var = this.f32080t;
            if (x7Var != null && zArr[14]) {
                fVar.i(14, x7Var.computeSize());
                this.f32080t.writeFields(fVar);
            }
            java.lang.String str3 = this.f32081u;
            if (str3 != null && zArr[15]) {
                fVar.j(15, str3);
            }
            bw5.a9 a9Var3 = this.f32082v;
            if (a9Var3 != null && zArr[16]) {
                fVar.i(16, a9Var3.computeSize());
                this.f32082v.writeFields(fVar);
            }
            bw5.a9 a9Var4 = this.f32083w;
            if (a9Var4 != null && zArr[17]) {
                fVar.i(17, a9Var4.computeSize());
                this.f32083w.writeFields(fVar);
            }
            bw5.a9 a9Var5 = this.f32084x;
            if (a9Var5 != null && zArr[18]) {
                fVar.i(18, a9Var5.computeSize());
                this.f32084x.writeFields(fVar);
            }
            bw5.pf pfVar = this.f32085y;
            if (pfVar != null && zArr[19]) {
                fVar.i(19, pfVar.computeSize());
                this.f32085y.writeFields(fVar);
            }
            bw5.jf jfVar = this.f32086z;
            if (jfVar != null && zArr[20]) {
                fVar.i(20, jfVar.computeSize());
                this.f32086z.writeFields(fVar);
            }
            bw5.nf nfVar = this.A;
            if (nfVar != null && zArr[21]) {
                fVar.i(21, nfVar.computeSize());
                this.A.writeFields(fVar);
            }
            if (zArr[22]) {
                fVar.e(22, this.B);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f32067d) + 0 : 0;
            bw5.a9 a9Var6 = this.f32068e;
            if (a9Var6 != null && zArr[2]) {
                h17 += b36.f.i(2, a9Var6.computeSize());
            }
            bw5.o9 o9Var3 = this.f32069f;
            if (o9Var3 != null && zArr[3]) {
                h17 += b36.f.i(3, o9Var3.computeSize());
            }
            bw5.a9 a9Var7 = this.f32070g;
            if (a9Var7 != null && zArr[4]) {
                h17 += b36.f.i(4, a9Var7.computeSize());
            }
            bw5.o9 o9Var4 = this.f32071h;
            if (o9Var4 != null && zArr[5]) {
                h17 += b36.f.i(5, o9Var4.computeSize());
            }
            bw5.d9 d9Var2 = this.f32072i;
            if (d9Var2 != null && zArr[6]) {
                h17 += b36.f.i(6, d9Var2.computeSize());
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f32073m);
            }
            bw5.lf lfVar2 = this.f32074n;
            if (lfVar2 != null && zArr[8]) {
                h17 += b36.f.i(8, lfVar2.computeSize());
            }
            bw5.hf hfVar2 = this.f32075o;
            if (hfVar2 != null && zArr[9]) {
                h17 += b36.f.i(9, hfVar2.computeSize());
            }
            bw5.Cif cif2 = this.f32076p;
            if (cif2 != null && zArr[10]) {
                h17 += b36.f.i(10, cif2.computeSize());
            }
            java.lang.String str4 = this.f32077q;
            if (str4 != null && zArr[11]) {
                h17 += b36.f.j(11, str4);
            }
            java.lang.String str5 = this.f32078r;
            if (str5 != null && zArr[12]) {
                h17 += b36.f.j(12, str5);
            }
            bw5.of ofVar2 = this.f32079s;
            if (ofVar2 != null && zArr[13]) {
                h17 += b36.f.i(13, ofVar2.computeSize());
            }
            bw5.x7 x7Var2 = this.f32080t;
            if (x7Var2 != null && zArr[14]) {
                h17 += b36.f.i(14, x7Var2.computeSize());
            }
            java.lang.String str6 = this.f32081u;
            if (str6 != null && zArr[15]) {
                h17 += b36.f.j(15, str6);
            }
            bw5.a9 a9Var8 = this.f32082v;
            if (a9Var8 != null && zArr[16]) {
                h17 += b36.f.i(16, a9Var8.computeSize());
            }
            bw5.a9 a9Var9 = this.f32083w;
            if (a9Var9 != null && zArr[17]) {
                h17 += b36.f.i(17, a9Var9.computeSize());
            }
            bw5.a9 a9Var10 = this.f32084x;
            if (a9Var10 != null && zArr[18]) {
                h17 += b36.f.i(18, a9Var10.computeSize());
            }
            bw5.pf pfVar2 = this.f32085y;
            if (pfVar2 != null && zArr[19]) {
                h17 += b36.f.i(19, pfVar2.computeSize());
            }
            bw5.jf jfVar2 = this.f32086z;
            if (jfVar2 != null && zArr[20]) {
                h17 += b36.f.i(20, jfVar2.computeSize());
            }
            bw5.nf nfVar2 = this.A;
            if (nfVar2 != null && zArr[21]) {
                h17 += b36.f.i(21, nfVar2.computeSize());
            }
            return zArr[22] ? h17 + b36.f.e(22, this.B) : h17;
        }
        if (i17 == 2) {
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
                this.f32067d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.a9 a9Var11 = new bw5.a9();
                    if (bArr != null && bArr.length > 0) {
                        a9Var11.parseFrom(bArr);
                    }
                    this.f32068e = a9Var11;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.o9 o9Var5 = new bw5.o9();
                    if (bArr2 != null && bArr2.length > 0) {
                        o9Var5.parseFrom(bArr2);
                    }
                    this.f32069f = o9Var5;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.a9 a9Var12 = new bw5.a9();
                    if (bArr3 != null && bArr3.length > 0) {
                        a9Var12.parseFrom(bArr3);
                    }
                    this.f32070g = a9Var12;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.o9 o9Var6 = new bw5.o9();
                    if (bArr4 != null && bArr4.length > 0) {
                        o9Var6.parseFrom(bArr4);
                    }
                    this.f32071h = o9Var6;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.d9 d9Var3 = new bw5.d9();
                    if (bArr5 != null && bArr5.length > 0) {
                        d9Var3.parseFrom(bArr5);
                    }
                    this.f32072i = d9Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f32073m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.lf lfVar3 = new bw5.lf();
                    if (bArr6 != null && bArr6.length > 0) {
                        lfVar3.parseFrom(bArr6);
                    }
                    this.f32074n = lfVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.hf hfVar3 = new bw5.hf();
                    if (bArr7 != null && bArr7.length > 0) {
                        hfVar3.parseFrom(bArr7);
                    }
                    this.f32075o = hfVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.Cif cif3 = new bw5.Cif();
                    if (bArr8 != null && bArr8.length > 0) {
                        cif3.parseFrom(bArr8);
                    }
                    this.f32076p = cif3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f32077q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32078r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.of ofVar3 = new bw5.of();
                    if (bArr9 != null && bArr9.length > 0) {
                        ofVar3.parseFrom(bArr9);
                    }
                    this.f32079s = ofVar3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.x7 x7Var3 = new bw5.x7();
                    if (bArr10 != null && bArr10.length > 0) {
                        x7Var3.parseFrom(bArr10);
                    }
                    this.f32080t = x7Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f32081u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    bw5.a9 a9Var13 = new bw5.a9();
                    if (bArr11 != null && bArr11.length > 0) {
                        a9Var13.parseFrom(bArr11);
                    }
                    this.f32082v = a9Var13;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    bw5.a9 a9Var14 = new bw5.a9();
                    if (bArr12 != null && bArr12.length > 0) {
                        a9Var14.parseFrom(bArr12);
                    }
                    this.f32083w = a9Var14;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr13 = (byte[]) j57.get(i58);
                    bw5.a9 a9Var15 = new bw5.a9();
                    if (bArr13 != null && bArr13.length > 0) {
                        a9Var15.parseFrom(bArr13);
                    }
                    this.f32084x = a9Var15;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr14 = (byte[]) j58.get(i59);
                    bw5.pf pfVar3 = new bw5.pf();
                    if (bArr14 != null && bArr14.length > 0) {
                        pfVar3.parseFrom(bArr14);
                    }
                    this.f32085y = pfVar3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i66 = 0; i66 < size15; i66++) {
                    byte[] bArr15 = (byte[]) j59.get(i66);
                    bw5.jf jfVar3 = new bw5.jf();
                    if (bArr15 != null && bArr15.length > 0) {
                        jfVar3.parseFrom(bArr15);
                    }
                    this.f32086z = jfVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i67 = 0; i67 < size16; i67++) {
                    byte[] bArr16 = (byte[]) j66.get(i67);
                    bw5.nf nfVar3 = new bw5.nf();
                    if (bArr16 != null && bArr16.length > 0) {
                        nfVar3.parseFrom(bArr16);
                    }
                    this.A = nfVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            default:
                return -1;
        }
    }
}
