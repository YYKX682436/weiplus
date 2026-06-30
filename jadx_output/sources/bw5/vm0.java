package bw5;

/* loaded from: classes11.dex */
public class vm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34404d;

    /* renamed from: e, reason: collision with root package name */
    public long f34405e;

    /* renamed from: f, reason: collision with root package name */
    public int f34406f;

    /* renamed from: g, reason: collision with root package name */
    public long f34407g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f34408h = new boolean[5];

    static {
        new bw5.vm0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vm0 parseFrom(byte[] bArr) {
        return (bw5.vm0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vm0)) {
            return false;
        }
        bw5.vm0 vm0Var = (bw5.vm0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34404d), java.lang.Integer.valueOf(vm0Var.f34404d)) && n51.f.a(java.lang.Long.valueOf(this.f34405e), java.lang.Long.valueOf(vm0Var.f34405e)) && n51.f.a(java.lang.Integer.valueOf(this.f34406f), java.lang.Integer.valueOf(vm0Var.f34406f)) && n51.f.a(java.lang.Long.valueOf(this.f34407g), java.lang.Long.valueOf(vm0Var.f34407g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34408h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34404d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f34405e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34406f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f34407g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34404d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f34405e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f34406f);
            }
            return zArr[4] ? e17 + b36.f.h(4, this.f34407g) : e17;
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
            this.f34404d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34405e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34406f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f34407g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }
}
