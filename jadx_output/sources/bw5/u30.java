package bw5;

/* loaded from: classes2.dex */
public class u30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.dm f33727d;

    /* renamed from: e, reason: collision with root package name */
    public long f33728e;

    /* renamed from: f, reason: collision with root package name */
    public long f33729f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f33730g = new boolean[4];

    static {
        new bw5.u30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.u30 parseFrom(byte[] bArr) {
        return (bw5.u30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u30)) {
            return false;
        }
        bw5.u30 u30Var = (bw5.u30) fVar;
        return n51.f.a(this.f33727d, u30Var.f33727d) && n51.f.a(java.lang.Long.valueOf(this.f33728e), java.lang.Long.valueOf(u30Var.f33728e)) && n51.f.a(java.lang.Long.valueOf(this.f33729f), java.lang.Long.valueOf(u30Var.f33729f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.u30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33730g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.dm dmVar = this.f33727d;
            if (dmVar != null && zArr[1]) {
                fVar.i(1, dmVar.computeSize());
                this.f33727d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f33728e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f33729f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.dm dmVar2 = this.f33727d;
            if (dmVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, dmVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f33728e);
            }
            return zArr[3] ? i18 + b36.f.h(3, this.f33729f) : i18;
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
            if (intValue == 2) {
                this.f33728e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f33729f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.dm dmVar3 = new bw5.dm();
            if (bArr != null && bArr.length > 0) {
                dmVar3.parseFrom(bArr);
            }
            this.f33727d = dmVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
