package bw5;

/* loaded from: classes2.dex */
public class eg0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f26900d;

    /* renamed from: e, reason: collision with root package name */
    public double f26901e;

    /* renamed from: f, reason: collision with root package name */
    public double f26902f;

    /* renamed from: g, reason: collision with root package name */
    public double f26903g;

    /* renamed from: h, reason: collision with root package name */
    public int f26904h;

    /* renamed from: i, reason: collision with root package name */
    public int f26905i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f26906m = new boolean[7];

    static {
        new bw5.eg0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.eg0 parseFrom(byte[] bArr) {
        return (bw5.eg0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.eg0)) {
            return false;
        }
        bw5.eg0 eg0Var = (bw5.eg0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f26900d), java.lang.Double.valueOf(eg0Var.f26900d)) && n51.f.a(java.lang.Double.valueOf(this.f26901e), java.lang.Double.valueOf(eg0Var.f26901e)) && n51.f.a(java.lang.Double.valueOf(this.f26902f), java.lang.Double.valueOf(eg0Var.f26902f)) && n51.f.a(java.lang.Double.valueOf(this.f26903g), java.lang.Double.valueOf(eg0Var.f26903g)) && n51.f.a(java.lang.Integer.valueOf(this.f26904h), java.lang.Integer.valueOf(eg0Var.f26904h)) && n51.f.a(java.lang.Integer.valueOf(this.f26905i), java.lang.Integer.valueOf(eg0Var.f26905i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.eg0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26906m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f26900d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f26901e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f26902f);
            }
            if (zArr[4]) {
                fVar.c(4, this.f26903g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26904h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f26905i);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f26900d) : 0;
            if (zArr[2]) {
                c17 += b36.f.c(2, this.f26901e);
            }
            if (zArr[3]) {
                c17 += b36.f.c(3, this.f26902f);
            }
            if (zArr[4]) {
                c17 += b36.f.c(4, this.f26903g);
            }
            if (zArr[5]) {
                c17 += b36.f.e(5, this.f26904h);
            }
            return zArr[6] ? c17 + b36.f.e(6, this.f26905i) : c17;
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
                this.f26900d = aVar2.e(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26901e = aVar2.e(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26902f = aVar2.e(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26903g = aVar2.e(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26904h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26905i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
