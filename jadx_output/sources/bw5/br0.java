package bw5;

/* loaded from: classes2.dex */
public class br0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f25800d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25801e;

    /* renamed from: f, reason: collision with root package name */
    public int f25802f;

    /* renamed from: g, reason: collision with root package name */
    public int f25803g;

    /* renamed from: h, reason: collision with root package name */
    public long f25804h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25805i;

    /* renamed from: m, reason: collision with root package name */
    public int f25806m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.wo0 f25807n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f25808o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25809p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25810q;

    /* renamed from: r, reason: collision with root package name */
    public int f25811r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f25812s = new boolean[13];

    static {
        new bw5.br0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.br0 parseFrom(byte[] bArr) {
        return (bw5.br0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.br0)) {
            return false;
        }
        bw5.br0 br0Var = (bw5.br0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f25800d), java.lang.Boolean.valueOf(br0Var.f25800d)) && n51.f.a(java.lang.Boolean.valueOf(this.f25801e), java.lang.Boolean.valueOf(br0Var.f25801e)) && n51.f.a(java.lang.Integer.valueOf(this.f25802f), java.lang.Integer.valueOf(br0Var.f25802f)) && n51.f.a(java.lang.Integer.valueOf(this.f25803g), java.lang.Integer.valueOf(br0Var.f25803g)) && n51.f.a(java.lang.Long.valueOf(this.f25804h), java.lang.Long.valueOf(br0Var.f25804h)) && n51.f.a(java.lang.Boolean.valueOf(this.f25805i), java.lang.Boolean.valueOf(br0Var.f25805i)) && n51.f.a(java.lang.Integer.valueOf(this.f25806m), java.lang.Integer.valueOf(br0Var.f25806m)) && n51.f.a(this.f25807n, br0Var.f25807n) && n51.f.a(java.lang.Boolean.valueOf(this.f25808o), java.lang.Boolean.valueOf(br0Var.f25808o)) && n51.f.a(java.lang.Boolean.valueOf(this.f25809p), java.lang.Boolean.valueOf(br0Var.f25809p)) && n51.f.a(java.lang.Boolean.valueOf(this.f25810q), java.lang.Boolean.valueOf(br0Var.f25810q)) && n51.f.a(java.lang.Integer.valueOf(this.f25811r), java.lang.Integer.valueOf(br0Var.f25811r));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.br0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25812s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f25800d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f25801e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25802f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f25803g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f25804h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f25805i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f25806m);
            }
            bw5.wo0 wo0Var = this.f25807n;
            if (wo0Var != null && zArr[8]) {
                fVar.i(8, wo0Var.computeSize());
                this.f25807n.writeFields(fVar);
            }
            if (zArr[9]) {
                fVar.a(9, this.f25808o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f25809p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f25810q);
            }
            if (!zArr[12]) {
                return 0;
            }
            fVar.e(12, this.f25811r);
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f25800d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f25801e);
            }
            if (zArr[3]) {
                a17 += b36.f.e(3, this.f25802f);
            }
            if (zArr[4]) {
                a17 += b36.f.e(4, this.f25803g);
            }
            if (zArr[5]) {
                a17 += b36.f.h(5, this.f25804h);
            }
            if (zArr[6]) {
                a17 += b36.f.a(6, this.f25805i);
            }
            if (zArr[7]) {
                a17 += b36.f.e(7, this.f25806m);
            }
            bw5.wo0 wo0Var2 = this.f25807n;
            if (wo0Var2 != null && zArr[8]) {
                a17 += b36.f.i(8, wo0Var2.computeSize());
            }
            if (zArr[9]) {
                a17 += b36.f.a(9, this.f25808o);
            }
            if (zArr[10]) {
                a17 += b36.f.a(10, this.f25809p);
            }
            if (zArr[11]) {
                a17 += b36.f.a(11, this.f25810q);
            }
            return zArr[12] ? a17 + b36.f.e(12, this.f25811r) : a17;
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
                this.f25800d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25801e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25802f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25803g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25804h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25805i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25806m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.wo0 wo0Var3 = new bw5.wo0();
                    if (bArr != null && bArr.length > 0) {
                        wo0Var3.parseFrom(bArr);
                    }
                    this.f25807n = wo0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f25808o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f25809p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f25810q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f25811r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
