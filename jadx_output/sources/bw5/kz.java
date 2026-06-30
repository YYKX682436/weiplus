package bw5;

/* loaded from: classes2.dex */
public class kz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f29579d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f29580e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f29581f = new boolean[6];

    static {
        new bw5.kz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kz parseFrom(byte[] bArr) {
        return (bw5.kz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kz)) {
            return false;
        }
        bw5.kz kzVar = (bw5.kz) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f29579d), java.lang.Float.valueOf(kzVar.f29579d)) && n51.f.a(this.f29580e, kzVar.f29580e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29581f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[4]) {
                fVar.d(4, this.f29579d);
            }
            com.tencent.mm.protobuf.g gVar = this.f29580e;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[4] ? 0 + b36.f.d(4, this.f29579d) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f29580e;
            return (gVar2 == null || !zArr[5]) ? d17 : d17 + b36.f.b(5, gVar2);
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
        if (intValue == 4) {
            this.f29579d = aVar2.f(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f29580e = aVar2.d(intValue);
        zArr[5] = true;
        return 0;
    }
}
