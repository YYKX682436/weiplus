package bw5;

/* loaded from: classes9.dex */
public class s0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f32738d;

    /* renamed from: e, reason: collision with root package name */
    public double f32739e;

    /* renamed from: f, reason: collision with root package name */
    public double f32740f;

    /* renamed from: g, reason: collision with root package name */
    public long f32741g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f32742h = new boolean[5];

    static {
        new bw5.s0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s0)) {
            return false;
        }
        bw5.s0 s0Var = (bw5.s0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f32738d), java.lang.Double.valueOf(s0Var.f32738d)) && n51.f.a(java.lang.Double.valueOf(this.f32739e), java.lang.Double.valueOf(s0Var.f32739e)) && n51.f.a(java.lang.Double.valueOf(this.f32740f), java.lang.Double.valueOf(s0Var.f32740f)) && n51.f.a(java.lang.Long.valueOf(this.f32741g), java.lang.Long.valueOf(s0Var.f32741g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32742h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f32738d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f32739e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f32740f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f32741g);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f32738d) : 0;
            if (zArr[2]) {
                c17 += b36.f.c(2, this.f32739e);
            }
            if (zArr[3]) {
                c17 += b36.f.c(3, this.f32740f);
            }
            return zArr[4] ? c17 + b36.f.h(4, this.f32741g) : c17;
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
            this.f32738d = aVar2.e(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32739e = aVar2.e(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32740f = aVar2.e(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f32741g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.s0) super.parseFrom(bArr);
    }
}
