package bw5;

/* loaded from: classes2.dex */
public class lm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.lm0 f29860i = new bw5.lm0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f29861d;

    /* renamed from: e, reason: collision with root package name */
    public int f29862e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29863f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.km0 f29864g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29865h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lm0)) {
            return false;
        }
        bw5.lm0 lm0Var = (bw5.lm0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f29861d), java.lang.Boolean.valueOf(lm0Var.f29861d)) && n51.f.a(java.lang.Integer.valueOf(this.f29862e), java.lang.Integer.valueOf(lm0Var.f29862e)) && n51.f.a(this.f29863f, lm0Var.f29863f) && n51.f.a(this.f29864g, lm0Var.f29864g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29865h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f29861d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29862e);
            }
            java.lang.String str = this.f29863f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.km0 km0Var = this.f29864g;
            if (km0Var != null && zArr[4]) {
                fVar.i(4, km0Var.computeSize());
                this.f29864g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f29861d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f29862e);
            }
            java.lang.String str2 = this.f29863f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            bw5.km0 km0Var2 = this.f29864g;
            return (km0Var2 == null || !zArr[4]) ? a17 : a17 + b36.f.i(4, km0Var2.computeSize());
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
            this.f29861d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29862e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f29863f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.km0 km0Var3 = new bw5.km0();
            if (bArr != null && bArr.length > 0) {
                km0Var3.parseFrom(bArr);
            }
            this.f29864g = km0Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.lm0) super.parseFrom(bArr);
    }
}
