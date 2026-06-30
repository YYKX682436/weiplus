package bw5;

/* loaded from: classes8.dex */
public class aj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25221d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25222e;

    /* renamed from: f, reason: collision with root package name */
    public long f25223f;

    /* renamed from: g, reason: collision with root package name */
    public int f25224g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f25225h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f25226i = new boolean[6];

    static {
        new bw5.aj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.aj0 parseFrom(byte[] bArr) {
        return (bw5.aj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.aj0)) {
            return false;
        }
        bw5.aj0 aj0Var = (bw5.aj0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25221d), java.lang.Integer.valueOf(aj0Var.f25221d)) && n51.f.a(java.lang.Boolean.valueOf(this.f25222e), java.lang.Boolean.valueOf(aj0Var.f25222e)) && n51.f.a(java.lang.Long.valueOf(this.f25223f), java.lang.Long.valueOf(aj0Var.f25223f)) && n51.f.a(java.lang.Integer.valueOf(this.f25224g), java.lang.Integer.valueOf(aj0Var.f25224g)) && n51.f.a(this.f25225h, aj0Var.f25225h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.aj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25226i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25221d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f25222e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f25223f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f25224g);
            }
            java.lang.String str = this.f25225h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25221d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f25222e);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f25223f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f25224g);
            }
            java.lang.String str2 = this.f25225h;
            return (str2 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str2);
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
        if (intValue == 1) {
            this.f25221d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25222e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25223f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f25224g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f25225h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
