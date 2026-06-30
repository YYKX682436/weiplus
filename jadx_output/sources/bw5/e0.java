package bw5;

/* loaded from: classes2.dex */
public class e0 extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final bw5.e0 f26671g = new bw5.e0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.ev f26672d;

    /* renamed from: e, reason: collision with root package name */
    public long f26673e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f26674f = new boolean[3];

    public bw5.ev b() {
        return this.f26674f[1] ? this.f26672d : new bw5.ev();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e0)) {
            return false;
        }
        bw5.e0 e0Var = (bw5.e0) fVar;
        return n51.f.a(this.f26672d, e0Var.f26672d) && n51.f.a(java.lang.Long.valueOf(this.f26673e), java.lang.Long.valueOf(e0Var.f26673e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.e0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26674f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ev evVar = this.f26672d;
            if (evVar != null && zArr[1]) {
                fVar.i(1, evVar.computeSize());
                this.f26672d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f26673e);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ev evVar2 = this.f26672d;
            if (evVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, evVar2.computeSize());
            }
            return zArr[2] ? i18 + b36.f.h(2, this.f26673e) : i18;
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
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.f26673e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ev evVar3 = new bw5.ev();
            if (bArr != null && bArr.length > 0) {
                evVar3.parseFrom(bArr);
            }
            this.f26672d = evVar3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.e0) super.parseFrom(bArr);
    }
}
