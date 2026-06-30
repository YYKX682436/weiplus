package bw5;

/* loaded from: classes2.dex */
public class zc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.yr f35935d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.nd0 f35936e;

    /* renamed from: f, reason: collision with root package name */
    public int f35937f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35938g = new boolean[4];

    static {
        new bw5.zc0();
    }

    public bw5.yr b() {
        return this.f35938g[1] ? this.f35935d : new bw5.yr();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.zc0 parseFrom(byte[] bArr) {
        return (bw5.zc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zc0)) {
            return false;
        }
        bw5.zc0 zc0Var = (bw5.zc0) fVar;
        return n51.f.a(this.f35935d, zc0Var.f35935d) && n51.f.a(this.f35936e, zc0Var.f35936e) && n51.f.a(java.lang.Integer.valueOf(this.f35937f), java.lang.Integer.valueOf(zc0Var.f35937f));
    }

    public bw5.zc0 d(bw5.yr yrVar) {
        this.f35935d = yrVar;
        this.f35938g[1] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35938g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.yr yrVar = this.f35935d;
            if (yrVar != null && zArr[1]) {
                fVar.i(1, yrVar.computeSize());
                this.f35935d.writeFields(fVar);
            }
            bw5.nd0 nd0Var = this.f35936e;
            if (nd0Var != null && zArr[2]) {
                fVar.i(2, nd0Var.computeSize());
                this.f35936e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f35937f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.yr yrVar2 = this.f35935d;
            if (yrVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, yrVar2.computeSize());
            }
            bw5.nd0 nd0Var2 = this.f35936e;
            if (nd0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, nd0Var2.computeSize());
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f35937f) : i18;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.yr yrVar3 = new bw5.yr();
                if (bArr != null && bArr.length > 0) {
                    yrVar3.parseFrom(bArr);
                }
                this.f35935d = yrVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f35937f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.nd0 nd0Var3 = new bw5.nd0();
            if (bArr2 != null && bArr2.length > 0) {
                nd0Var3.parseFrom(bArr2);
            }
            this.f35936e = nd0Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
