package bw5;

/* loaded from: classes2.dex */
public class ka0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f29320d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29321e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29322f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f29323g = new boolean[4];

    static {
        new bw5.ka0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ka0 parseFrom(byte[] bArr) {
        return (bw5.ka0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ka0)) {
            return false;
        }
        bw5.ka0 ka0Var = (bw5.ka0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f29320d), java.lang.Boolean.valueOf(ka0Var.f29320d)) && n51.f.a(java.lang.Boolean.valueOf(this.f29321e), java.lang.Boolean.valueOf(ka0Var.f29321e)) && n51.f.a(java.lang.Boolean.valueOf(this.f29322f), java.lang.Boolean.valueOf(ka0Var.f29322f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ka0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29323g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f29320d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f29321e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f29322f);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f29320d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f29321e);
            }
            return zArr[3] ? a17 + b36.f.a(3, this.f29322f) : a17;
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
            this.f29320d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29321e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f29322f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }
}
