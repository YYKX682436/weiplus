package bw5;

/* loaded from: classes2.dex */
public class gr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f27975d;

    /* renamed from: e, reason: collision with root package name */
    public long f27976e;

    /* renamed from: f, reason: collision with root package name */
    public int f27977f;

    /* renamed from: g, reason: collision with root package name */
    public int f27978g;

    /* renamed from: h, reason: collision with root package name */
    public long f27979h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f27980i = new boolean[6];

    static {
        new bw5.gr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gr0)) {
            return false;
        }
        bw5.gr0 gr0Var = (bw5.gr0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f27975d), java.lang.Long.valueOf(gr0Var.f27975d)) && n51.f.a(java.lang.Long.valueOf(this.f27976e), java.lang.Long.valueOf(gr0Var.f27976e)) && n51.f.a(java.lang.Integer.valueOf(this.f27977f), java.lang.Integer.valueOf(gr0Var.f27977f)) && n51.f.a(java.lang.Integer.valueOf(this.f27978g), java.lang.Integer.valueOf(gr0Var.f27978g)) && n51.f.a(java.lang.Long.valueOf(this.f27979h), java.lang.Long.valueOf(gr0Var.f27979h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27980i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f27975d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f27976e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27977f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f27978g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f27979h);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f27975d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f27976e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f27977f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f27978g);
            }
            return zArr[5] ? h17 + b36.f.h(5, this.f27979h) : h17;
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
            this.f27975d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27976e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27977f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f27978g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f27979h = aVar2.i(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.gr0) super.parseFrom(bArr);
    }
}
