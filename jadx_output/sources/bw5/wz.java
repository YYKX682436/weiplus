package bw5;

/* loaded from: classes2.dex */
public class wz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f34878d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.vc0 f34879e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34880f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34881g = new boolean[4];

    static {
        new bw5.wz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wz parseFrom(byte[] bArr) {
        return (bw5.wz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wz)) {
            return false;
        }
        bw5.wz wzVar = (bw5.wz) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34878d), java.lang.Long.valueOf(wzVar.f34878d)) && n51.f.a(this.f34879e, wzVar.f34879e) && n51.f.a(this.f34880f, wzVar.f34880f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34881g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34878d);
            }
            bw5.vc0 vc0Var = this.f34879e;
            if (vc0Var != null && zArr[2]) {
                fVar.i(2, vc0Var.computeSize());
                this.f34879e.writeFields(fVar);
            }
            java.lang.String str = this.f34880f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f34878d) : 0;
            bw5.vc0 vc0Var2 = this.f34879e;
            if (vc0Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, vc0Var2.computeSize());
            }
            java.lang.String str2 = this.f34880f;
            return (str2 == null || !zArr[3]) ? h17 : h17 + b36.f.j(3, str2);
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
            this.f34878d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f34880f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.vc0 vc0Var3 = new bw5.vc0();
            if (bArr != null && bArr.length > 0) {
                vc0Var3.parseFrom(bArr);
            }
            this.f34879e = vc0Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
