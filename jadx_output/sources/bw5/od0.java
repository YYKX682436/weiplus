package bw5;

/* loaded from: classes2.dex */
public class od0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.yr f31065d;

    /* renamed from: e, reason: collision with root package name */
    public int f31066e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31067f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31068g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f31069h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f31070i = new boolean[6];

    static {
        new bw5.od0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.od0 parseFrom(byte[] bArr) {
        return (bw5.od0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.od0)) {
            return false;
        }
        bw5.od0 od0Var = (bw5.od0) fVar;
        return n51.f.a(this.f31065d, od0Var.f31065d) && n51.f.a(java.lang.Integer.valueOf(this.f31066e), java.lang.Integer.valueOf(od0Var.f31066e)) && n51.f.a(java.lang.Boolean.valueOf(this.f31067f), java.lang.Boolean.valueOf(od0Var.f31067f)) && n51.f.a(java.lang.Boolean.valueOf(this.f31068g), java.lang.Boolean.valueOf(od0Var.f31068g)) && n51.f.a(java.lang.Boolean.valueOf(this.f31069h), java.lang.Boolean.valueOf(od0Var.f31069h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.od0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f31070i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.yr yrVar = this.f31065d;
            if (yrVar != null && zArr[1]) {
                fVar.i(1, yrVar.computeSize());
                this.f31065d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f31066e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f31067f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f31068g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f31069h);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.yr yrVar2 = this.f31065d;
            if (yrVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, yrVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f31066e);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f31067f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f31068g);
            }
            return zArr[5] ? i18 + b36.f.a(5, this.f31069h) : i18;
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
                this.f31065d = yrVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31066e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f31067f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f31068g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f31069h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
