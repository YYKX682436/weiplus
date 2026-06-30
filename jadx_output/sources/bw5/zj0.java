package bw5;

/* loaded from: classes4.dex */
public class zj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f36030d;

    /* renamed from: e, reason: collision with root package name */
    public int f36031e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f36032f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36033g = new boolean[4];

    static {
        new bw5.zj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zj0 parseFrom(byte[] bArr) {
        return (bw5.zj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zj0)) {
            return false;
        }
        bw5.zj0 zj0Var = (bw5.zj0) fVar;
        return n51.f.a(this.f36030d, zj0Var.f36030d) && n51.f.a(java.lang.Integer.valueOf(this.f36031e), java.lang.Integer.valueOf(zj0Var.f36031e)) && n51.f.a(this.f36032f, zj0Var.f36032f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f36033g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36030d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f36031e);
            }
            r45.cu5 cu5Var = this.f36032f;
            if (cu5Var != null && zArr[3]) {
                fVar.i(3, cu5Var.computeSize());
                this.f36032f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f36030d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f36031e);
            }
            r45.cu5 cu5Var2 = this.f36032f;
            return (cu5Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, cu5Var2.computeSize());
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
            this.f36030d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f36031e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            this.f36032f = cu5Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
