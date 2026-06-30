package bw5;

/* loaded from: classes2.dex */
public class du extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26619d;

    /* renamed from: e, reason: collision with root package name */
    public long f26620e;

    /* renamed from: f, reason: collision with root package name */
    public int f26621f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26622g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26623h = new boolean[5];

    static {
        new bw5.du();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.du parseFrom(byte[] bArr) {
        return (bw5.du) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.du)) {
            return false;
        }
        bw5.du duVar = (bw5.du) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26619d), java.lang.Integer.valueOf(duVar.f26619d)) && n51.f.a(java.lang.Long.valueOf(this.f26620e), java.lang.Long.valueOf(duVar.f26620e)) && n51.f.a(java.lang.Integer.valueOf(this.f26621f), java.lang.Integer.valueOf(duVar.f26621f)) && n51.f.a(java.lang.Boolean.valueOf(this.f26622g), java.lang.Boolean.valueOf(duVar.f26622g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.du();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26623h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26619d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f26620e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26621f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f26622g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26619d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f26620e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f26621f);
            }
            return zArr[4] ? e17 + b36.f.a(4, this.f26622g) : e17;
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
            this.f26619d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26620e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26621f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f26622g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
