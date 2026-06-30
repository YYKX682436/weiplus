package bw5;

/* loaded from: classes4.dex */
public class dy extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.kx f26640d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.kx f26641e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.kx f26642f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f26643g = new boolean[4];

    static {
        new bw5.dy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dy parseFrom(byte[] bArr) {
        return (bw5.dy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dy)) {
            return false;
        }
        bw5.dy dyVar = (bw5.dy) fVar;
        return n51.f.a(this.f26640d, dyVar.f26640d) && n51.f.a(this.f26641e, dyVar.f26641e) && n51.f.a(this.f26642f, dyVar.f26642f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26643g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.kx kxVar = this.f26640d;
            if (kxVar != null && zArr[1]) {
                fVar.e(1, kxVar.f29573d);
            }
            bw5.kx kxVar2 = this.f26641e;
            if (kxVar2 != null && zArr[2]) {
                fVar.e(2, kxVar2.f29573d);
            }
            bw5.kx kxVar3 = this.f26642f;
            if (kxVar3 != null && zArr[3]) {
                fVar.e(3, kxVar3.f29573d);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.kx kxVar4 = this.f26640d;
            if (kxVar4 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, kxVar4.f29573d);
            }
            bw5.kx kxVar5 = this.f26641e;
            if (kxVar5 != null && zArr[2]) {
                i18 += b36.f.e(2, kxVar5.f29573d);
            }
            bw5.kx kxVar6 = this.f26642f;
            return (kxVar6 == null || !zArr[3]) ? i18 : i18 + b36.f.e(3, kxVar6.f29573d);
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
            this.f26640d = bw5.kx.a(aVar2.g(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26641e = bw5.kx.a(aVar2.g(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f26642f = bw5.kx.a(aVar2.g(intValue));
        zArr[3] = true;
        return 0;
    }
}
