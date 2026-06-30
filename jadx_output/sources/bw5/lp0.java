package bw5;

/* loaded from: classes2.dex */
public class lp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: v, reason: collision with root package name */
    public static final bw5.lp0 f29890v = new bw5.lp0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.v70 f29891d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29892e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.gq0 f29893f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.fq0 f29894g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29895h;

    /* renamed from: i, reason: collision with root package name */
    public int f29896i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.q50 f29897m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f29898n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.u50 f29899o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.u70 f29900p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29901q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.s70 f29902r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f29903s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f29904t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f29905u = new boolean[19];

    public java.lang.String b() {
        return this.f29905u[2] ? this.f29892e : "";
    }

    public bw5.fq0 c() {
        return this.f29905u[7] ? this.f29894g : new bw5.fq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lp0)) {
            return false;
        }
        bw5.lp0 lp0Var = (bw5.lp0) fVar;
        return n51.f.a(this.f29891d, lp0Var.f29891d) && n51.f.a(this.f29892e, lp0Var.f29892e) && n51.f.a(this.f29893f, lp0Var.f29893f) && n51.f.a(this.f29894g, lp0Var.f29894g) && n51.f.a(this.f29895h, lp0Var.f29895h) && n51.f.a(java.lang.Integer.valueOf(this.f29896i), java.lang.Integer.valueOf(lp0Var.f29896i)) && n51.f.a(this.f29897m, lp0Var.f29897m) && n51.f.a(this.f29898n, lp0Var.f29898n) && n51.f.a(this.f29899o, lp0Var.f29899o) && n51.f.a(this.f29900p, lp0Var.f29900p) && n51.f.a(java.lang.Boolean.valueOf(this.f29901q), java.lang.Boolean.valueOf(lp0Var.f29901q)) && n51.f.a(this.f29902r, lp0Var.f29902r) && n51.f.a(this.f29903s, lp0Var.f29903s) && n51.f.a(this.f29904t, lp0Var.f29904t);
    }

    public bw5.v70 d() {
        return this.f29905u[1] ? this.f29891d : new bw5.v70();
    }

    public bw5.gq0 e() {
        return this.f29905u[4] ? this.f29893f : new bw5.gq0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public bw5.lp0 parseFrom(byte[] bArr) {
        return (bw5.lp0) super.parseFrom(bArr);
    }

    public bw5.lp0 g(java.lang.String str) {
        this.f29892e = str;
        this.f29905u[2] = true;
        return this;
    }

    public bw5.lp0 i(bw5.fq0 fq0Var) {
        this.f29894g = fq0Var;
        this.f29905u[7] = true;
        return this;
    }

    public bw5.lp0 j(bw5.v70 v70Var) {
        this.f29891d = v70Var;
        this.f29905u[1] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29905u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.v70 v70Var = this.f29891d;
            if (v70Var != null && zArr[1]) {
                fVar.i(1, v70Var.computeSize());
                this.f29891d.writeFields(fVar);
            }
            java.lang.String str = this.f29892e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.gq0 gq0Var = this.f29893f;
            if (gq0Var != null && zArr[4]) {
                fVar.i(4, gq0Var.computeSize());
                this.f29893f.writeFields(fVar);
            }
            bw5.fq0 fq0Var = this.f29894g;
            if (fq0Var != null && zArr[7]) {
                fVar.i(7, fq0Var.computeSize());
                this.f29894g.writeFields(fVar);
            }
            java.lang.String str2 = this.f29895h;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            if (zArr[9]) {
                fVar.e(9, this.f29896i);
            }
            bw5.q50 q50Var = this.f29897m;
            if (q50Var != null && zArr[10]) {
                fVar.i(10, q50Var.computeSize());
                this.f29897m.writeFields(fVar);
            }
            java.lang.String str3 = this.f29898n;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            bw5.u50 u50Var = this.f29899o;
            if (u50Var != null && zArr[12]) {
                fVar.i(12, u50Var.computeSize());
                this.f29899o.writeFields(fVar);
            }
            bw5.u70 u70Var = this.f29900p;
            if (u70Var != null && zArr[14]) {
                fVar.i(14, u70Var.computeSize());
                this.f29900p.writeFields(fVar);
            }
            if (zArr[15]) {
                fVar.a(15, this.f29901q);
            }
            bw5.s70 s70Var = this.f29902r;
            if (s70Var != null && zArr[16]) {
                fVar.i(16, s70Var.computeSize());
                this.f29902r.writeFields(fVar);
            }
            java.lang.String str4 = this.f29903s;
            if (str4 != null && zArr[17]) {
                fVar.j(17, str4);
            }
            java.lang.String str5 = this.f29904t;
            if (str5 == null || !zArr[18]) {
                return 0;
            }
            fVar.j(18, str5);
            return 0;
        }
        if (i17 == 1) {
            bw5.v70 v70Var2 = this.f29891d;
            int i18 = (v70Var2 == null || !zArr[1]) ? 0 : 0 + b36.f.i(1, v70Var2.computeSize());
            java.lang.String str6 = this.f29892e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            bw5.gq0 gq0Var2 = this.f29893f;
            if (gq0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, gq0Var2.computeSize());
            }
            bw5.fq0 fq0Var2 = this.f29894g;
            if (fq0Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, fq0Var2.computeSize());
            }
            java.lang.String str7 = this.f29895h;
            if (str7 != null && zArr[8]) {
                i18 += b36.f.j(8, str7);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f29896i);
            }
            bw5.q50 q50Var2 = this.f29897m;
            if (q50Var2 != null && zArr[10]) {
                i18 += b36.f.i(10, q50Var2.computeSize());
            }
            java.lang.String str8 = this.f29898n;
            if (str8 != null && zArr[11]) {
                i18 += b36.f.j(11, str8);
            }
            bw5.u50 u50Var2 = this.f29899o;
            if (u50Var2 != null && zArr[12]) {
                i18 += b36.f.i(12, u50Var2.computeSize());
            }
            bw5.u70 u70Var2 = this.f29900p;
            if (u70Var2 != null && zArr[14]) {
                i18 += b36.f.i(14, u70Var2.computeSize());
            }
            if (zArr[15]) {
                i18 += b36.f.a(15, this.f29901q);
            }
            bw5.s70 s70Var2 = this.f29902r;
            if (s70Var2 != null && zArr[16]) {
                i18 += b36.f.i(16, s70Var2.computeSize());
            }
            java.lang.String str9 = this.f29903s;
            if (str9 != null && zArr[17]) {
                i18 += b36.f.j(17, str9);
            }
            java.lang.String str10 = this.f29904t;
            return (str10 == null || !zArr[18]) ? i18 : i18 + b36.f.j(18, str10);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr != null && bArr.length > 0) {
                        v70Var3.parseFrom(bArr);
                    }
                    this.f29891d = v70Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f29892e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
            case 5:
            case 6:
            case 13:
            default:
                return -1;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.gq0 gq0Var3 = new bw5.gq0();
                    if (bArr2 != null && bArr2.length > 0) {
                        gq0Var3.parseFrom(bArr2);
                    }
                    this.f29893f = gq0Var3;
                }
                zArr[4] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.fq0 fq0Var3 = new bw5.fq0();
                    if (bArr3 != null && bArr3.length > 0) {
                        fq0Var3.parseFrom(bArr3);
                    }
                    this.f29894g = fq0Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f29895h = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f29896i = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.q50 q50Var3 = new bw5.q50();
                    if (bArr4 != null && bArr4.length > 0) {
                        q50Var3.parseFrom(bArr4);
                    }
                    this.f29897m = q50Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f29898n = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.u50 u50Var3 = new bw5.u50();
                    if (bArr5 != null && bArr5.length > 0) {
                        u50Var3.parseFrom(bArr5);
                    }
                    this.f29899o = u50Var3;
                }
                zArr[12] = true;
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.u70 u70Var3 = new bw5.u70();
                    if (bArr6 != null && bArr6.length > 0) {
                        u70Var3.parseFrom(bArr6);
                    }
                    this.f29900p = u70Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f29901q = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.s70 s70Var3 = new bw5.s70();
                    if (bArr7 != null && bArr7.length > 0) {
                        s70Var3.parseFrom(bArr7);
                    }
                    this.f29902r = s70Var3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                this.f29903s = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f29904t = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
        }
    }
}
