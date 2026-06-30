package bw5;

/* loaded from: classes2.dex */
public class kd0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29352d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29353e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qg f29354f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.zc0 f29355g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29356h = new boolean[5];

    static {
        new bw5.kd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kd0)) {
            return false;
        }
        bw5.kd0 kd0Var = (bw5.kd0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29352d), java.lang.Integer.valueOf(kd0Var.f29352d)) && n51.f.a(this.f29353e, kd0Var.f29353e) && n51.f.a(this.f29354f, kd0Var.f29354f) && n51.f.a(this.f29355g, kd0Var.f29355g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29356h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29352d);
            }
            java.lang.String str = this.f29353e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.qg qgVar = this.f29354f;
            if (qgVar != null && zArr[3]) {
                fVar.i(3, qgVar.computeSize());
                this.f29354f.writeFields(fVar);
            }
            bw5.zc0 zc0Var = this.f29355g;
            if (zc0Var != null && zArr[4]) {
                fVar.i(4, zc0Var.computeSize());
                this.f29355g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29352d) : 0;
            java.lang.String str2 = this.f29353e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            bw5.qg qgVar2 = this.f29354f;
            if (qgVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, qgVar2.computeSize());
            }
            bw5.zc0 zc0Var2 = this.f29355g;
            return (zc0Var2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, zc0Var2.computeSize());
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
            this.f29352d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29353e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.qg qgVar3 = new bw5.qg();
                if (bArr != null && bArr.length > 0) {
                    qgVar3.parseFrom(bArr);
                }
                this.f29354f = qgVar3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.zc0 zc0Var3 = new bw5.zc0();
            if (bArr2 != null && bArr2.length > 0) {
                zc0Var3.parseFrom(bArr2);
            }
            this.f29355g = zc0Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.kd0) super.parseFrom(bArr);
    }
}
