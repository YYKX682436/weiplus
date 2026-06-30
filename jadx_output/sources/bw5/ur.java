package bw5;

/* loaded from: classes2.dex */
public class ur extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f34035d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34036e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f34037f = new boolean[3];

    static {
        new bw5.ur();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ur parseFrom(byte[] bArr) {
        return (bw5.ur) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ur)) {
            return false;
        }
        bw5.ur urVar = (bw5.ur) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34035d), java.lang.Long.valueOf(urVar.f34035d)) && n51.f.a(this.f34036e, urVar.f34036e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ur();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34037f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34035d);
            }
            com.tencent.mm.protobuf.g gVar = this.f34036e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f34035d) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f34036e;
            return (gVar2 == null || !zArr[2]) ? h17 : h17 + b36.f.b(2, gVar2);
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
            this.f34035d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f34036e = aVar2.d(intValue);
        zArr[2] = true;
        return 0;
    }
}
