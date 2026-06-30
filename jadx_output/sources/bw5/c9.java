package bw5;

/* loaded from: classes9.dex */
public class c9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25974d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25975e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25976f;

    /* renamed from: g, reason: collision with root package name */
    public int f25977g;

    /* renamed from: h, reason: collision with root package name */
    public int f25978h;

    /* renamed from: i, reason: collision with root package name */
    public int f25979i;

    /* renamed from: m, reason: collision with root package name */
    public int f25980m;

    /* renamed from: n, reason: collision with root package name */
    public int f25981n;

    /* renamed from: o, reason: collision with root package name */
    public int f25982o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.c7 f25983p;

    /* renamed from: q, reason: collision with root package name */
    public int f25984q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.b9 f25985r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.l6 f25986s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f25987t = new boolean[14];

    static {
        new bw5.c9();
    }

    public bw5.c7 b() {
        return this.f25987t[10] ? this.f25983p : new bw5.c7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.c9 parseFrom(byte[] bArr) {
        return (bw5.c9) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c9)) {
            return false;
        }
        bw5.c9 c9Var = (bw5.c9) fVar;
        return n51.f.a(this.f25974d, c9Var.f25974d) && n51.f.a(this.f25975e, c9Var.f25975e) && n51.f.a(this.f25976f, c9Var.f25976f) && n51.f.a(java.lang.Integer.valueOf(this.f25977g), java.lang.Integer.valueOf(c9Var.f25977g)) && n51.f.a(java.lang.Integer.valueOf(this.f25978h), java.lang.Integer.valueOf(c9Var.f25978h)) && n51.f.a(java.lang.Integer.valueOf(this.f25979i), java.lang.Integer.valueOf(c9Var.f25979i)) && n51.f.a(java.lang.Integer.valueOf(this.f25980m), java.lang.Integer.valueOf(c9Var.f25980m)) && n51.f.a(java.lang.Integer.valueOf(this.f25981n), java.lang.Integer.valueOf(c9Var.f25981n)) && n51.f.a(java.lang.Integer.valueOf(this.f25982o), java.lang.Integer.valueOf(c9Var.f25982o)) && n51.f.a(this.f25983p, c9Var.f25983p) && n51.f.a(java.lang.Integer.valueOf(this.f25984q), java.lang.Integer.valueOf(c9Var.f25984q)) && n51.f.a(this.f25985r, c9Var.f25985r) && n51.f.a(this.f25986s, c9Var.f25986s);
    }

    public bw5.c9 d(int i17) {
        this.f25977g = i17;
        this.f25987t[4] = true;
        return this;
    }

    public bw5.c9 e(java.lang.String str) {
        this.f25974d = str;
        this.f25987t[1] = true;
        return this;
    }

    public bw5.c9 f(java.lang.String str) {
        this.f25975e = str;
        this.f25987t[2] = true;
        return this;
    }

    public bw5.c9 g(java.lang.String str) {
        this.f25976f = str;
        this.f25987t[3] = true;
        return this;
    }

    public java.lang.String getText() {
        return this.f25987t[1] ? this.f25974d : "";
    }

    public bw5.c9 i(int i17) {
        this.f25982o = i17;
        this.f25987t[9] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.c9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25987t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25974d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f25975e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f25976f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f25977g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25978h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f25979i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f25980m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f25981n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f25982o);
            }
            bw5.c7 c7Var = this.f25983p;
            if (c7Var != null && zArr[10]) {
                fVar.i(10, c7Var.computeSize());
                this.f25983p.writeFields(fVar);
            }
            if (zArr[11]) {
                fVar.e(11, this.f25984q);
            }
            bw5.b9 b9Var = this.f25985r;
            if (b9Var != null && zArr[12]) {
                fVar.i(12, b9Var.computeSize());
                this.f25985r.writeFields(fVar);
            }
            bw5.l6 l6Var = this.f25986s;
            if (l6Var == null || !zArr[13]) {
                return 0;
            }
            fVar.i(13, l6Var.computeSize());
            this.f25986s.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f25974d;
            int j17 = (str4 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str4);
            java.lang.String str5 = this.f25975e;
            if (str5 != null && zArr[2]) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f25976f;
            if (str6 != null && zArr[3]) {
                j17 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f25977g);
            }
            if (zArr[5]) {
                j17 += b36.f.e(5, this.f25978h);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f25979i);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f25980m);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f25981n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f25982o);
            }
            bw5.c7 c7Var2 = this.f25983p;
            if (c7Var2 != null && zArr[10]) {
                j17 += b36.f.i(10, c7Var2.computeSize());
            }
            if (zArr[11]) {
                j17 += b36.f.e(11, this.f25984q);
            }
            bw5.b9 b9Var2 = this.f25985r;
            if (b9Var2 != null && zArr[12]) {
                j17 += b36.f.i(12, b9Var2.computeSize());
            }
            bw5.l6 l6Var2 = this.f25986s;
            return (l6Var2 == null || !zArr[13]) ? j17 : j17 + b36.f.i(13, l6Var2.computeSize());
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
                this.f25974d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25975e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25976f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25977g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25978h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25979i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25980m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25981n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f25982o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.c7 c7Var3 = new bw5.c7();
                    if (bArr != null && bArr.length > 0) {
                        c7Var3.parseFrom(bArr);
                    }
                    this.f25983p = c7Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f25984q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.b9 b9Var3 = new bw5.b9();
                    if (bArr2 != null && bArr2.length > 0) {
                        b9Var3.parseFrom(bArr2);
                    }
                    this.f25985r = b9Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    bw5.l6 l6Var3 = new bw5.l6();
                    if (bArr3 != null && bArr3.length > 0) {
                        l6Var3.parseFrom(bArr3);
                    }
                    this.f25986s = l6Var3;
                }
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
