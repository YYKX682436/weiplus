package bw5;

/* loaded from: classes4.dex */
public class oj0 extends com.tencent.mm.protobuf.f {
    public int A;
    public int B;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31112d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31113e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31114f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31115g;

    /* renamed from: h, reason: collision with root package name */
    public int f31116h;

    /* renamed from: i, reason: collision with root package name */
    public int f31117i;

    /* renamed from: m, reason: collision with root package name */
    public int f31118m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f31119n;

    /* renamed from: o, reason: collision with root package name */
    public int f31120o;

    /* renamed from: p, reason: collision with root package name */
    public int f31121p;

    /* renamed from: q, reason: collision with root package name */
    public int f31122q;

    /* renamed from: r, reason: collision with root package name */
    public long f31123r;

    /* renamed from: s, reason: collision with root package name */
    public long f31124s;

    /* renamed from: t, reason: collision with root package name */
    public r45.cu5 f31125t;

    /* renamed from: u, reason: collision with root package name */
    public int f31126u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.si0 f31127v;

    /* renamed from: x, reason: collision with root package name */
    public int f31129x;

    /* renamed from: y, reason: collision with root package name */
    public r45.cu5 f31130y;

    /* renamed from: z, reason: collision with root package name */
    public int f31131z;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f31128w = new java.util.LinkedList();
    public final java.util.LinkedList C = new java.util.LinkedList();
    public final boolean[] D = new boolean[26];

    static {
        new bw5.oj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oj0 parseFrom(byte[] bArr) {
        return (bw5.oj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oj0)) {
            return false;
        }
        bw5.oj0 oj0Var = (bw5.oj0) fVar;
        return n51.f.a(this.f31112d, oj0Var.f31112d) && n51.f.a(this.f31113e, oj0Var.f31113e) && n51.f.a(this.f31114f, oj0Var.f31114f) && n51.f.a(this.f31115g, oj0Var.f31115g) && n51.f.a(java.lang.Integer.valueOf(this.f31116h), java.lang.Integer.valueOf(oj0Var.f31116h)) && n51.f.a(java.lang.Integer.valueOf(this.f31117i), java.lang.Integer.valueOf(oj0Var.f31117i)) && n51.f.a(java.lang.Integer.valueOf(this.f31118m), java.lang.Integer.valueOf(oj0Var.f31118m)) && n51.f.a(this.f31119n, oj0Var.f31119n) && n51.f.a(java.lang.Integer.valueOf(this.f31120o), java.lang.Integer.valueOf(oj0Var.f31120o)) && n51.f.a(java.lang.Integer.valueOf(this.f31121p), java.lang.Integer.valueOf(oj0Var.f31121p)) && n51.f.a(java.lang.Integer.valueOf(this.f31122q), java.lang.Integer.valueOf(oj0Var.f31122q)) && n51.f.a(java.lang.Long.valueOf(this.f31123r), java.lang.Long.valueOf(oj0Var.f31123r)) && n51.f.a(java.lang.Long.valueOf(this.f31124s), java.lang.Long.valueOf(oj0Var.f31124s)) && n51.f.a(this.f31125t, oj0Var.f31125t) && n51.f.a(java.lang.Integer.valueOf(this.f31126u), java.lang.Integer.valueOf(oj0Var.f31126u)) && n51.f.a(this.f31127v, oj0Var.f31127v) && n51.f.a(this.f31128w, oj0Var.f31128w) && n51.f.a(java.lang.Integer.valueOf(this.f31129x), java.lang.Integer.valueOf(oj0Var.f31129x)) && n51.f.a(this.f31130y, oj0Var.f31130y) && n51.f.a(java.lang.Integer.valueOf(this.f31131z), java.lang.Integer.valueOf(oj0Var.f31131z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(oj0Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(oj0Var.B)) && n51.f.a(this.C, oj0Var.C);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.oj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.D;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31112d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f31113e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f31114f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f31115g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f31116h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f31117i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f31118m);
            }
            java.lang.String str5 = this.f31119n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            if (zArr[9]) {
                fVar.e(9, this.f31120o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f31121p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f31122q);
            }
            if (zArr[12]) {
                fVar.h(12, this.f31123r);
            }
            if (zArr[13]) {
                fVar.h(13, this.f31124s);
            }
            r45.cu5 cu5Var = this.f31125t;
            if (cu5Var != null && zArr[14]) {
                fVar.i(14, cu5Var.computeSize());
                this.f31125t.writeFields(fVar);
            }
            if (zArr[15]) {
                fVar.e(15, this.f31126u);
            }
            bw5.si0 si0Var = this.f31127v;
            if (si0Var != null && zArr[16]) {
                fVar.i(16, si0Var.computeSize());
                this.f31127v.writeFields(fVar);
            }
            fVar.g(17, 8, this.f31128w);
            if (zArr[18]) {
                fVar.e(18, this.f31129x);
            }
            r45.cu5 cu5Var2 = this.f31130y;
            if (cu5Var2 != null && zArr[21]) {
                fVar.i(21, cu5Var2.computeSize());
                this.f31130y.writeFields(fVar);
            }
            if (zArr[22]) {
                fVar.e(22, this.f31131z);
            }
            if (zArr[23]) {
                fVar.e(23, this.A);
            }
            if (zArr[24]) {
                fVar.e(24, this.B);
            }
            fVar.g(25, 8, this.C);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f31112d;
            if (str6 != null && zArr[1]) {
                i18 = b36.f.j(1, str6) + 0;
            }
            java.lang.String str7 = this.f31113e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f31114f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f31115g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f31116h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f31117i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f31118m);
            }
            java.lang.String str10 = this.f31119n;
            if (str10 != null && zArr[8]) {
                i18 += b36.f.j(8, str10);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f31120o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f31121p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f31122q);
            }
            if (zArr[12]) {
                i18 += b36.f.h(12, this.f31123r);
            }
            if (zArr[13]) {
                i18 += b36.f.h(13, this.f31124s);
            }
            r45.cu5 cu5Var3 = this.f31125t;
            if (cu5Var3 != null && zArr[14]) {
                i18 += b36.f.i(14, cu5Var3.computeSize());
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f31126u);
            }
            bw5.si0 si0Var2 = this.f31127v;
            if (si0Var2 != null && zArr[16]) {
                i18 += b36.f.i(16, si0Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(17, 8, this.f31128w);
            if (zArr[18]) {
                g17 += b36.f.e(18, this.f31129x);
            }
            r45.cu5 cu5Var4 = this.f31130y;
            if (cu5Var4 != null && zArr[21]) {
                g17 += b36.f.i(21, cu5Var4.computeSize());
            }
            if (zArr[22]) {
                g17 += b36.f.e(22, this.f31131z);
            }
            if (zArr[23]) {
                g17 += b36.f.e(23, this.A);
            }
            if (zArr[24]) {
                g17 += b36.f.e(24, this.B);
            }
            return g17 + b36.f.g(25, 8, this.C);
        }
        if (i17 == 2) {
            this.f31128w.clear();
            this.C.clear();
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
                this.f31112d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31113e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31114f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31115g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31116h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31117i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31118m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f31119n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f31120o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f31121p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f31122q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f31123r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f31124s = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var5.b(bArr);
                    }
                    this.f31125t = cu5Var5;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f31126u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.si0 si0Var3 = new bw5.si0();
                    if (bArr2 != null && bArr2.length > 0) {
                        si0Var3.parseFrom(bArr2);
                    }
                    this.f31127v = si0Var3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.xj0 xj0Var = new bw5.xj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        xj0Var.parseFrom(bArr3);
                    }
                    this.f31128w.add(xj0Var);
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f31129x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
            case 20:
            default:
                return -1;
            case 21:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var6.b(bArr4);
                    }
                    this.f31130y = cu5Var6;
                }
                zArr[21] = true;
                return 0;
            case 22:
                this.f31131z = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.A = aVar2.g(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.B = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.sj0 sj0Var = new bw5.sj0();
                    if (bArr5 != null && bArr5.length > 0) {
                        sj0Var.parseFrom(bArr5);
                    }
                    this.C.add(sj0Var);
                }
                zArr[25] = true;
                return 0;
        }
    }
}
